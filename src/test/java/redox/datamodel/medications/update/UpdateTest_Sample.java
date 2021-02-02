package redox.datamodel.medications.update;

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
public class UpdateTest_Sample {

    private Update update;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/update/medications-update.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        update = mapper.readValue(content, Update.class);
        Assert.notNull(update, "New Medications object not successfully created");
    }

    @Test
    public void testNewMeds_Meta() {
        Assert.notNull(update.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewMeds_Patient() {
        Assert.notNull(update.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testNewMeds_Visit() {
        Assert.notNull(update.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testNewMeds_Order() {
        Assert.notNull(update.getOrder(), "Order object not successfully created");
    }

}