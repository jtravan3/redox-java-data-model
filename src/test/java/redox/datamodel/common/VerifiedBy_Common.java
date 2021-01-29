package redox.datamodel.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.clinicalsummary.patientpush.PatientPush;
import redox.datamodel.medications.newMedications.NewMedications;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class VerifiedBy_Common {

    private NewMedications medications;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/newMedications/medications-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        medications = mapper.readValue(content, NewMedications.class);
        Assert.notNull(medications, "Medication object not successfully created");
    }

    @Test
    public void verifiedBy1() {
        VerifiedBy verifiedBy = medications.getOrder().getVerifiedBy();
        Assert.isTrue(verifiedBy.getID() == null, "ID object not successfully created");
        Assert.isTrue(verifiedBy.getIDType() == null, "ID Type object not successfully created");
        Assert.isTrue(verifiedBy.getFirstName() == null, "First Name object not successfully created");
        Assert.isTrue(verifiedBy.getLastName() == null, "Last Name object not successfully created");
        Assert.notNull(verifiedBy.getCredentials(), "Credentials object not successfully created");
        Assert.notNull(verifiedBy.getAddress(), "Address object not successfully created");
        Assert.notNull(verifiedBy.getEmailAddresses(), "Email Addresses object not successfully created");
        Assert.notNull(verifiedBy.getPhoneNumber(), "Phone Number object not successfully created");
        Assert.notNull(verifiedBy.getLocation() , "Location object not successfully created");
        Assert.isTrue(verifiedBy.getDateTime() == null, "Date Time object not successfully created");
    }
}
