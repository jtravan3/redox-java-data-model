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
public class Allergy_Common {

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
    public void allergy1() {
        Allergy allergy = patientPush.getAllergies().get(0);
        Assert.notNull(allergy.getType(), "Type object not successfully created");
        Assert.notNull(allergy.getSubstance(), "Substance object not successfully created");
        Assert.notNull(allergy.getReaction(), "Reaction object not successfully created");
        Assert.notNull(allergy.getSeverity(), "Severity object not successfully created");
        Assert.notNull(allergy.getCriticality(), "Criticality object not successfully created");
        Assert.notNull(allergy.getStatus(), "Status object not successfully created");
        Assert.isTrue(allergy.getStartDate() == null, "Start Date object not successfully created");
        Assert.isTrue(allergy.getEndDate() == null, "End Date object not successfully created");
        Assert.notNull(allergy.getComment(), "Comment object not successfully created");
    }

    @Test
    public void allergy2() {
        Allergy allergy = patientPush.getAllergies().get(1);
        Assert.notNull(allergy.getType(), "Type object not successfully created");
        Assert.notNull(allergy.getSubstance(), "Substance object not successfully created");
        Assert.notNull(allergy.getReaction(), "Reaction object not successfully created");
        Assert.notNull(allergy.getSeverity(), "Severity object not successfully created");
        Assert.notNull(allergy.getCriticality(), "Criticality object not successfully created");
        Assert.notNull(allergy.getStatus(), "Status object not successfully created");
        Assert.isTrue(allergy.getStartDate() == null, "Start Date object not successfully created");
        Assert.isTrue(allergy.getEndDate() == null, "End Date object not successfully created");
        Assert.isTrue(allergy.getComment() == null, "Comment object not successfully created");
    }

    @Test
    public void allergy3() {
        Allergy allergy = patientPush.getAllergies().get(2);
        Assert.notNull(allergy.getType(), "Type object not successfully created");
        Assert.notNull(allergy.getSubstance(), "Substance object not successfully created");
        Assert.notNull(allergy.getReaction(), "Reaction object not successfully created");
        Assert.notNull(allergy.getSeverity(), "Severity object not successfully created");
        Assert.notNull(allergy.getCriticality(), "Criticality object not successfully created");
        Assert.notNull(allergy.getStatus(), "Status object not successfully created");
        Assert.isTrue(allergy.getStartDate() == null, "Start Date object not successfully created");
        Assert.isTrue(allergy.getEndDate() == null, "End Date object not successfully created");
        Assert.isTrue(allergy.getComment() == null, "Comment object not successfully created");
    }

}
