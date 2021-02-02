package redox.datamodel.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.clinicalsummary.patientpush.PatientPush;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class Meta_Common {

    private PatientPush patientPush;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_push/clinicalsummary-patientpush.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        patientPush = mapper.readValue(content, PatientPush.class);
        Assert.notNull(patientPush, "PatientPush object not successfully created");
    }

    @Test
    public void meta1() {
        Meta meta = patientPush.getMeta();
        Assert.notNull(meta.getDataModel(), "Data Model object not successfully created");
        Assert.notNull(meta.getEventType(), "EventType object not successfully created");
        Assert.notNull(meta.getEventDateTime(), "EventDateTime object not successfully created");
        Assert.notNull(meta.getTest(), "Test object not successfully created");
        Assert.notNull(meta.getSource(), "Source object not successfully created");
        Assert.notNull(meta.getDestinations(), "Destinations object not successfully created");
        Assert.notNull(meta.getMessage(), "Message object not successfully created");
        Assert.notNull(meta.getTransmission(), "Transmission object not successfully created");
        Assert.isTrue(meta.getFacilityCode() == null, "FacilityCode object not successfully created");
    }
}
