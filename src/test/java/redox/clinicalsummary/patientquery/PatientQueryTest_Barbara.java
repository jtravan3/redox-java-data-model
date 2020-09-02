package redox.clinicalsummary.patientquery;

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
public class PatientQueryTest_Barbara {

    private PatientQuery patientQuery;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_query/redox-example-patientquery-barbara.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        patientQuery = mapper.readValue(content, PatientQuery.class);
        Assert.notNull(patientQuery, "PatientQuery object not successfully created");
    }


    @Test
    public void testPatientQuery_Location() {
            Assert.notNull(patientQuery.getLocation(), "Location object not successfully created");
    }

    @Test
    public void testPatientQuery_Meta() {
        Assert.notNull(patientQuery.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testPatientQuery_Patient() {
        Assert.notNull(patientQuery.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testPatientQuery_AdditionalProperties() {
        Assert.isTrue(patientQuery.getAdditionalProperties().isEmpty(), "Additional Properties object was created when it should not have been");
    }

}
