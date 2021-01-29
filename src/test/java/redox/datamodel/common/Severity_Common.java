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
public class Severity_Common {

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
    public void severity1() {
        Severity severity = patientPush.getAllergies().get(0).getSeverity();
        Assert.notNull(severity.getCode(), "Code object not successfully created");
        Assert.notNull(severity.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(severity.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(severity.getName(), "Name object not successfully created");
    }

    @Test
    public void severity2() {
        Severity severity = patientPush.getAllergies().get(0).getReaction().get(0).getSeverity();
        Assert.notNull(severity.getCode(), "Code object not successfully created");
        Assert.notNull(severity.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(severity.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(severity.getName(), "Name object not successfully created");
    }

    @Test
    public void severity3() {
        Severity severity = patientPush.getAllergies().get(0).getReaction().get(1).getSeverity();
        Assert.notNull(severity.getCode(), "Code object not successfully created");
        Assert.notNull(severity.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(severity.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(severity.getName(), "Name object not successfully created");
    }

    @Test
    public void severity4() {
        Severity severity = patientPush.getAllergies().get(1).getSeverity();
        Assert.notNull(severity.getCode(), "Code object not successfully created");
        Assert.notNull(severity.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(severity.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(severity.getName(), "Name object not successfully created");
    }

    @Test
    public void severity5() {
        Severity severity = patientPush.getAllergies().get(1).getReaction().get(0).getSeverity();
        Assert.notNull(severity.getCode(), "Code object not successfully created");
        Assert.notNull(severity.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(severity.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(severity.getName(), "Name object not successfully created");
    }

    @Test
    public void severity6() {
        Severity severity = patientPush.getAllergies().get(2).getSeverity();
        Assert.notNull(severity.getCode(), "Code object not successfully created");
        Assert.notNull(severity.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(severity.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(severity.getName(), "Name object not successfully created");
    }

    @Test
    public void severity7() {
        Severity severity = patientPush.getAllergies().get(2).getReaction().get(0).getSeverity();
        Assert.notNull(severity.getCode(), "Code object not successfully created");
        Assert.notNull(severity.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(severity.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(severity.getName(), "Name object not successfully created");
    }
}
