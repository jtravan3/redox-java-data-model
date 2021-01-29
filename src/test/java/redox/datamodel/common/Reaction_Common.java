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
public class Reaction_Common {

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
    public void reaction1() {
        Reaction reaction = patientPush.getAllergies().get(0).getReaction().get(0);
        Assert.notNull(reaction.getCode(), "Code object not successfully created");
        Assert.notNull(reaction.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(reaction.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(reaction.getName(), "Name object not successfully created");
        Assert.notNull(reaction.getAltCodes(), "Alt Codes object not successfully created");
        Assert.notNull(reaction.getSeverity(), "Severity object not successfully created");
        Assert.isTrue(reaction.getText() == null, "Text object not successfully created");
    }

    @Test
    public void reaction2() {
        Reaction reaction = patientPush.getAllergies().get(0).getReaction().get(1);
        Assert.notNull(reaction.getCode(), "Code object not successfully created");
        Assert.notNull(reaction.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(reaction.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(reaction.getName(), "Name object not successfully created");
        Assert.notNull(reaction.getAltCodes(), "Alt Codes object not successfully created");
        Assert.notNull(reaction.getSeverity(), "Severity object not successfully created");
        Assert.isTrue(reaction.getText() == null, "Text object not successfully created");
    }

    @Test
    public void reaction3() {
        Reaction reaction = patientPush.getAllergies().get(1).getReaction().get(0);
        Assert.notNull(reaction.getCode(), "Code object not successfully created");
        Assert.notNull(reaction.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(reaction.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(reaction.getName(), "Name object not successfully created");
        Assert.notNull(reaction.getAltCodes(), "Alt Codes object not successfully created");
        Assert.notNull(reaction.getSeverity(), "Severity object not successfully created");
        Assert.isTrue(reaction.getText() == null, "Text object not successfully created");
    }

    @Test
    public void reaction4() {
        Reaction reaction = patientPush.getAllergies().get(2).getReaction().get(0);
        Assert.notNull(reaction.getCode(), "Code object not successfully created");
        Assert.notNull(reaction.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(reaction.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(reaction.getName(), "Name object not successfully created");
        Assert.notNull(reaction.getAltCodes(), "Alt Codes object not successfully created");
        Assert.notNull(reaction.getSeverity(), "Severity object not successfully created");
        Assert.isTrue(reaction.getText() == null, "Text object not successfully created");
    }
}
