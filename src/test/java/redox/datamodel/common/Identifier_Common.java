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
public class Identifier_Common {

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
    public void identifier1() {
        Identifier identifier = patientPush.getHeader().getPatient().getIdentifiers().get(0);
        Assert.notNull(identifier.getID(), "ID object not successfully created");
        Assert.notNull(identifier.getIDType(), "ID Type object not successfully created");
        Assert.isTrue(identifier.getType() == null, "Type object not successfully created");
    }

    @Test
    public void identifier2() {
        Identifier identifier = patientPush.getEncounters().get(0).getIdentifiers().get(0);
        Assert.notNull(identifier.getID(), "ID object not successfully created");
        Assert.notNull(identifier.getIDType(), "ID Type object not successfully created");
        Assert.isTrue(identifier.getType() == null, "Type object not successfully created");
    }

    @Test
    public void identifier3() {
        Identifier identifier = patientPush.getEncounters().get(0).getIdentifiers().get(1);
        Assert.notNull(identifier.getID(), "ID object not successfully created");
        Assert.notNull(identifier.getIDType(), "ID Type object not successfully created");
        Assert.isTrue(identifier.getType() == null, "Type object not successfully created");
    }
}
