package redox.datamodel.vaccination.patientQuery;

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
public class PatientQueryTest_Timothy {

    private PatientQuery patientQuery;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:vaccination/patientQuery/timothy.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        patientQuery = mapper.readValue(content, PatientQuery.class);
        Assert.notNull(patientQuery, "Patient Query object not successfully created");
    }



    @Test
    public void testPatientQuery_Meta() {
            Assert.notNull(patientQuery.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewVaccination_Patient() {
        Assert.notNull(patientQuery.getPatient(), "Patient object not successfully created");
    }

}