package redox.datamodel.medications.cancel;

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
public class CancelTest_Barbara {

    private Cancel cancel;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/cancel/redox-example-medications-cancel_Barbara.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        cancel = mapper.readValue(content, Cancel.class);
        Assert.notNull(cancel, "Cancel object not successfully created");
    }

    @Test
    public void testNewMeds_Meta() {
        Assert.notNull(cancel.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewMeds_Patient() {
        Assert.notNull(cancel.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testNewMeds_Visit() {
        Assert.notNull(cancel.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testNewMeds_Order() {
        Assert.notNull(cancel.getOrder(), "Order object not successfully created");
    }

}