package redox.datamodel.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.medications.newMedications.NewMedications;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class Frequency_Common {

    private NewMedications newMed;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/newMedications/medications-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        newMed = mapper.readValue(content, NewMedications.class);
        Assert.notNull(newMed, "New Medication object not successfully created");
    }

    @Test
    public void frequency1() {
        Frequency frequency = newMed.getOrder().getMedication().getFrequency();
        Assert.notNull(frequency.getPeriod(), "Period object not successfully created");
        Assert.notNull(frequency.getUnit(), "Unit object not successfully created");
    }
}
