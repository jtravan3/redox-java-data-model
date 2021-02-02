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
public class PhoneNumber_Common {

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
    public void phoneNumber1() {
        PhoneNumber phoneNumber = patientPush.getHeader().getDocument().getAuthor().getPhoneNumber();
        Assert.notNull(phoneNumber.getOffice(), "Office object not successfully created");
        Assert.isTrue(phoneNumber.getHome() == null, "Home object not successfully created");
        Assert.isTrue(phoneNumber.getMobile() == null, "Mobile object not successfully created");
    }

    @Test
    public void phoneNumber2() {
        PhoneNumber phoneNumber = patientPush.getHeader().getPatient().getDemographics().getPhoneNumber();
        Assert.isTrue(phoneNumber.getOffice() == null, "Office object not successfully created");
        Assert.notNull(phoneNumber.getHome(), "Home object not successfully created");
        Assert.isTrue(phoneNumber.getMobile() == null, "Mobile object not successfully created");
    }

    @Test
    public void phoneNumber3() {
        PhoneNumber phoneNumber = patientPush.getHeader().getPCP().getPhoneNumber();
        Assert.isTrue(phoneNumber.getOffice() == null, "Office object not successfully created");
        Assert.isTrue(phoneNumber.getHome() == null, "Home object not successfully created");
        Assert.isTrue(phoneNumber.getMobile() == null, "Mobile object not successfully created");
    }

    @Test
    public void phoneNumber4() {
        PhoneNumber phoneNumber = patientPush.getEncounters().get(0).getProviders().get(0).getPhoneNumber();
        Assert.isTrue(phoneNumber.getOffice() == null, "Office object not successfully created");
        Assert.isTrue(phoneNumber.getHome() == null, "Home object not successfully created");
        Assert.isTrue(phoneNumber.getMobile() == null, "Mobile object not successfully created");
    }
}
