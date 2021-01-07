package redox.datamodel.medications.newMedications;

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
public class NewMedicationTest_Barbara {

    private NewMedications newMedications;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/newMedications/redox-example-medications-new_Barbara.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        newMedications = mapper.readValue(content, NewMedications.class);
        Assert.notNull(newMedications, "New Medications object not successfully created");
    }

    @Test
    public void testNewMeds_Meta() {
            Assert.notNull(newMedications.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewMeds_Patient() {
        Assert.notNull(newMedications.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testNewMeds_Visit() {
        Assert.notNull(newMedications.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testNewMeds_Order() {
        Assert.notNull(newMedications.getOrder(), "Order object not successfully created");
    }

}