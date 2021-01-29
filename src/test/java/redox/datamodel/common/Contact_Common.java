package redox.datamodel.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.clinicalsummary.patientpush.PatientPush;
import redox.datamodel.results.newResults.Results;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class Contact_Common {

    private Results newResults;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:results/newResults/results-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        newResults = mapper.readValue(content, Results.class);
        Assert.notNull(newResults, "New Results object not successfully created");
    }

    @Test
    public void contact1() {
        Contact contact = newResults.getPatient().getContacts().get(0);
        Assert.notNull(contact.getFirstName(), "First Name object not successfully created");
        Assert.isTrue(contact.getMiddleName() == null, "Middle Name object not successfully created");
        Assert.notNull(contact.getLastName(), "Last Name object not successfully created");
        Assert.notNull(contact.getAddress(), "Address object not successfully created");
        Assert.notNull(contact.getPhoneNumber(), "Phone Number object not successfully created");
        Assert.notNull(contact.getRelationToPatient(), "Relation to Patient object not successfully created");
        Assert.notNull(contact.getEmailAddresses(), "Email Addresses object not successfully created");
        Assert.notNull(contact.getRoles(), "Roles object not successfully created");
    }

}
