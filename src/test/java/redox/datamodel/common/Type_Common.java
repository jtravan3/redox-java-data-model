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
public class Type_Common {

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
    public void type1() {
        Type type = patientPush.getAllergies().get(0).getType();
        Assert.notNull(type.getCode(), "Code object not successfully created");
        Assert.notNull(type.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(type.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(type.getName(), "Name object not successfully created");
        Assert.notNull(type.getAltCodes(), "Code object not successfully created");
    }

    @Test
    public void type2() {
        Type type = patientPush.getAllergies().get(1).getType();
        Assert.notNull(type.getCode(), "Code object not successfully created");
        Assert.notNull(type.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(type.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(type.getName(), "Name object not successfully created");
        Assert.notNull(type.getAltCodes(), "Code object not successfully created");
    }

    @Test
    public void type3() {
        Type type = patientPush.getAllergies().get(2).getType();
        Assert.notNull(type.getCode(), "Code object not successfully created");
        Assert.notNull(type.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(type.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(type.getName(), "Name object not successfully created");
        Assert.notNull(type.getAltCodes(), "Code object not successfully created");
    }

    @Test
    public void type4() {
        Type type = patientPush.getEncounters().get(0).getType();
        Assert.notNull(type.getCode(), "Code object not successfully created");
        Assert.notNull(type.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(type.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(type.getName(), "Name object not successfully created");
        Assert.notNull(type.getAltCodes(), "Code object not successfully created");
    }
}
