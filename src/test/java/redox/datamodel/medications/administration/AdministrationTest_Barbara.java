package redox.datamodel.medications.administration;

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
public class AdministrationTest_Barbara {

    private Administration administration;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/administration/redox-example-medications-administration_Barbara.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        administration = mapper.readValue(content, Administration.class);
        Assert.notNull(administration, "Administration object not successfully created");
    }

    @Test
    public void testNewMeds_Meta() {
        Assert.notNull(administration.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewMeds_Patient() {
        Assert.notNull(administration.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testNewMeds_Visit() {
        Assert.notNull(administration.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testNewMeds_Order() {
        Assert.notNull(administration.getAdministrations(), "Administrations object not successfully created");
    }

}