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
public class Demographics_Common {

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
    public void demographics1() {
        Demographics demographics = patientPush.getHeader().getPatient().getDemographics();
        Assert.notNull(demographics.getFirstName(), "First Name object not successfully created");
        Assert.isTrue(demographics.getMiddleName() == null, "Middle Name object not successfully created");
        Assert.notNull(demographics.getLastName(), "Last Name object not successfully created");
        Assert.notNull(demographics.getDOB(), "DOB object not successfully created");
        Assert.notNull(demographics.getSSN(), "SSN object not successfully created");
        Assert.notNull(demographics.getSex(), "Sex object not successfully created");
        Assert.notNull(demographics.getRace(), "Race object not successfully created");
        Assert.isTrue(demographics.getIsHispanic() == null, "IsHispanic object not successfully created");
        Assert.notNull(demographics.getMaritalStatus(), "Marital Status object not successfully created");
        Assert.isTrue(demographics.getIsDeceased() == null, "IsDeceased object not successfully created");
        Assert.isTrue(demographics.getDeathDateTime() == null, "Death Date Time object not successfully created");
        Assert.notNull(demographics.getPhoneNumber(), "Phone Number object not successfully created");
        Assert.notNull(demographics.getEmailAddresses(), "Email Addresses object not successfully created");
        Assert.isTrue(demographics.getLanguage() == null, "Language object not successfully created");
        Assert.isTrue(demographics.getCitizenship() == null, "Citizenship object not successfully created");
        Assert.notNull(demographics.getAddress(), "Address object not successfully created");
        Assert.notNull(demographics.getEthnicity(), "Ethnicity object not successfully created");
        Assert.notNull(demographics.getReligion(), "Religion object not successfully created");
    }
}
