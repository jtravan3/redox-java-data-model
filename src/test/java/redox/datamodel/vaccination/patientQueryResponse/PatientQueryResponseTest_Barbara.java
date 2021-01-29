package redox.datamodel.vaccination.patientQueryResponse;

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
public class PatientQueryResponseTest_Barbara {

    private PatientQueryResponse patientQueryResponse;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:vaccination/patientQueryResponse/barbara.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        patientQueryResponse = mapper.readValue(content, PatientQueryResponse.class);
        Assert.notNull(patientQueryResponse, "Patient Query Response object not successfully created");
    }



    @Test
    public void testPatientQueryResponse_Meta() {
            Assert.notNull(patientQueryResponse.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Patient() {
        Assert.notNull(patientQueryResponse.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Visit() {
        Assert.notNull(patientQueryResponse.getPotentialMatches(), "Potential Matches object not successfully created");
    }

}