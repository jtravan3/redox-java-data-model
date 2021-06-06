package redox.datamodel.scheduling.modification;

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
public class ModificationTest_Timothy {

    private Modification modification;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:scheduling/modification/redox-example-modification-timothy.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        modification = mapper.readValue(content, Modification.class);
        Assert.notNull(modification, "Modification object not successfully created");
    }

    @Test
    public void testModification_Meta() {
        Assert.notNull(modification.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testModification_Patient() {
        Assert.notNull(modification.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testModification_Visit() {
        Assert.notNull(modification.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testModification_AdditionalProperties() {
        Assert.isTrue(modification.getAdditionalProperties().isEmpty(), "Additional Properties object was created when it should not have been");
    }
}
