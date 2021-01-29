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
public class Status_Common {

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
    public void status1() {
        Status status = patientPush.getAllergies().get(0).getStatus();
        Assert.notNull(status.getCode(), "Code object not successfully created");
        Assert.notNull(status.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(status.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(status.getName(), "Name object not successfully created");
    }

    @Test
    public void status2() {
        Status status = patientPush.getAllergies().get(1).getStatus();
        Assert.notNull(status.getCode(), "Code object not successfully created");
        Assert.notNull(status.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(status.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(status.getName(), "Name object not successfully created");
    }
}
