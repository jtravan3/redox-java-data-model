package redox.datamodel.patientpush;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Ignore;
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
public class PatientPushTest {

    private PatientPush patientPush;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary-patientpush.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        patientPush = mapper.readValue(content, PatientPush.class);
        Assert.notNull(patientPush, "PatientPush object not successfully created");
    }

    @Test
    public void testPatientPush_Allergies() {
        for (Allergy allergy: patientPush.getAllergies()) {
            Assert.notNull(allergy, "Allergy object not successfully created");
        }
    }

    @Test
    public void testPatientPush_Encounters() {
        for (Encounter encounter: patientPush.getEncounters()) {
            Assert.notNull(encounter, "Encounter object not successfully created");
        }
    }

    @Test
    @Ignore
    public void testPatientPush_FamilyHistory() {
        //TODO
    }
}
