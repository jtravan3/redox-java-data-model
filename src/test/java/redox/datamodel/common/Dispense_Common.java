package redox.datamodel.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.clinicalsummary.patientpush.PatientPush;
import redox.datamodel.medications.cancel.Cancel;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class Dispense_Common {

    private Cancel cancel;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/cancel/medications-cancel.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        cancel = mapper.readValue(content, Cancel.class);
        Assert.notNull(cancel, "Cancel object not successfully created");
    }

    @Test
    public void dispense1() {
        Dispense dispense = cancel.getOrder().getMedication().getDispense();
        Assert.isTrue(dispense.getAmount() == null, "Amount object not successfully created");
        Assert.isTrue(dispense.getUnits() == null, "Name object not successfully created");
    }
}
