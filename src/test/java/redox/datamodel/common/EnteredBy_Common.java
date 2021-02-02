package redox.datamodel.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.medications.newMedications.NewMedications;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class EnteredBy_Common {

    private NewMedications newMed;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/newMedications/medications-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        newMed = mapper.readValue(content, NewMedications.class);
        Assert.notNull(newMed, "New Medication object not successfully created");
    }

    @Test
    public void enteredby1() {
        EnteredBy enteredBy = newMed.getOrder().getEnteredBy();
        Assert.notNull(enteredBy.getID(), "ID object not successfully created");
        Assert.notNull(enteredBy.getIDType(), "ID Type object not successfully created");
        Assert.notNull(enteredBy.getFirstName(), "First Name object not successfully created");
        Assert.notNull(enteredBy.getLastName(), "Last Name object not successfully created");
        Assert.notNull(enteredBy.getCredentials(), "Credentials object not successfully created");
        Assert.notNull(enteredBy.getAddress(), "Address object not successfully created");
        Assert.notNull(enteredBy.getEmailAddresses(), "Email Addresses object not successfully created");
        Assert.notNull(enteredBy.getPhoneNumber(), "Phone Number object not successfully created");
        Assert.notNull(enteredBy.getLocation(), "Location object not successfully created");
    }
}
