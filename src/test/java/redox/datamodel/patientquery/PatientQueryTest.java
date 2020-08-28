package redox.datamodel.patientquery;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.patientquery.PatientQuery;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class PatientQueryTest {


    @Test
    public void testPatientQueryObjectCreation() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary-patientquery.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        PatientQuery patientQuery = mapper.readValue(content, PatientQuery.class);
        Assert.notNull(patientQuery, "PatientQuery object not successfully created");
    }
}
