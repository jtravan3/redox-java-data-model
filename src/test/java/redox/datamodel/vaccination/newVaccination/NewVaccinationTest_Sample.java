package redox.datamodel.vaccination.newVaccination;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.media.newmedia.NewMedia;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class NewVaccinationTest_Sample {

    private NewVaccination newVaccination;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:vaccination/newVaccination/vaccination-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        newVaccination = mapper.readValue(content, NewVaccination.class);
        Assert.notNull(newVaccination, "NewVaccination object not successfully created");
    }



    @Test
    public void testNewVaccination_Meta() {
            Assert.notNull(newVaccination.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewVaccination_Patient() {
        Assert.notNull(newVaccination.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testNewVaccination_Visit() {
        Assert.notNull(newVaccination.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testNewVaccination_Vaccinations() {
        Assert.notNull(newVaccination.getVaccinations(), "Vaccinations object not successfully created");
    }

}