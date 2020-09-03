package redox.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This acts as a factory for creating Redox Java POJOs
 * from the raw JSON or file path
 */
@Component
public class RedoxDataModelFactory {

    /**
     * Creates a Redox Java POJO based on the string JSON value and the class type.
     *
     * @param json the String JSON value from the Redox API
     * @param classType the class type to map the value to
     * @return an object of the class type passed in
     * @throws JsonProcessingException
     */
    public <T> T parseRedoxJson(String json, Class<T> classType) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, classType);
    }

    /**
     * Creates a Redox Java POJO based on the file path of the JSON and the class type.
     *
     * @param filePath the file path to the location of the JSON
     * @param classType the class type to map the value to
     * @return an object of the class type passed in
     * @throws IOException
     */
    public <T> T parseRedoxJson(Path filePath, Class<T> classType) throws IOException {
        return parseRedoxJson(filePath, StandardCharsets.UTF_8, classType);
    }

    /**
     * Creates a Redox Java POJO based on the file path of the JSON, the character set
     * of the file, and the class type.
     *
     * @param filePath the file path to the location of the JSON
     * @param charset the specified charset that the file path is in
     * @param classType the class type to map the value to
     * @return an object of the class type passed in
     * @throws IOException
     */
    public <T> T parseRedoxJson(Path filePath, Charset charset, Class<T> classType) throws IOException {
        String json = Files.readString(filePath, charset);
        return parseRedoxJson(json, classType);
    }
}
