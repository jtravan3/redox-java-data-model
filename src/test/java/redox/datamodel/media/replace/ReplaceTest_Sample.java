package redox.datamodel.media.replace;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class ReplaceTest_Sample {

    private Replace replace;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:media/replace/media-replace.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        replace = mapper.readValue(content, Replace.class);
        Assert.notNull(replace, "Replace object not successfully created");
    }



    @Test
    public void testNewMedia_Meta() {
            Assert.notNull(replace.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewMedia_Patient() {
        Assert.notNull(replace.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testNewMedia_Visit() {
        Assert.notNull(replace.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testNewMedia_Media() {
        Assert.notNull(replace.getMedia(), "Media object not successfully created");
    }
}