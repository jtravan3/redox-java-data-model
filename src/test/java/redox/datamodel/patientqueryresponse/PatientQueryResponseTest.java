package redox.datamodel.patientqueryresponse;

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
public class PatientQueryResponseTest {


    @Test
    public void testPatientQueryResponseObjectCreation() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary-patientqueryresponse.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        PatientQueryResponse patientQueryResponse = mapper.readValue(content, PatientQueryResponse.class);
        Assert.notNull(patientQueryResponse, "PatientQueryResponse object not successfully created");
    }
}
