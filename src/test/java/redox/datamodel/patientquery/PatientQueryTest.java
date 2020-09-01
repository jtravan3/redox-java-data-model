package redox.datamodel.patientquery;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
//import redox.datamodel.patientpush.Encounter;
//import redox.datamodel.patientpush.PatientPush;
import redox.datamodel.patientquery.PatientQuery;
import redox.datamodel.common.Location;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class PatientQueryTest {

    private PatientQuery patientQuery;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:patient_query/clinicalsummary-patientquery.json").toPath();
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


}
