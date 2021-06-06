package redox.datamodel.patientadmin.discharge;

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
public class DischargeTest_Timothy {

    private Discharge discharge;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:patientadmin/discharge/redox-example-discharge-timothy.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        discharge = mapper.readValue(content, Discharge.class);
        Assert.notNull(discharge, "Discharge object not successfully created");
    }

    @Test
    public void testDischarge_Meta() {
        Assert.notNull(discharge.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testDischarge_Patient() {
        Assert.notNull(discharge.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testDischarge_Visit() {
        Assert.notNull(discharge.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testDischarge_AdditionalProperties() {
        Assert.isTrue(discharge.getAdditionalProperties().isEmpty(), "Additional Properties object was created when it should not have been");
    }
}