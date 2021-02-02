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
public class Address_Common {

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
    public void address1() {
        Address address = patientPush.getHeader().getDocument().getAuthor().getAddress();
        Assert.notNull(address.getStreetAddress(), "Street Address object not successfully created");
        Assert.notNull(address.getCity(), "City object not successfully created");
        Assert.notNull(address.getState(), "State object not successfully created");
        Assert.notNull(address.getZIP(), "ZIP object not successfully created");
        Assert.notNull(address.getCounty(), "County object not successfully created");
        Assert.notNull(address.getCountry(), "Country object not successfully created");
    }

    @Test
    public void address2() {
        Address address = patientPush.getHeader().getPatient().getDemographics().getAddress();
        Assert.notNull(address.getStreetAddress(), "Street Address object not successfully created");
        Assert.notNull(address.getCity(), "City object not successfully created");
        Assert.notNull(address.getState(), "State object not successfully created");
        Assert.notNull(address.getZIP(), "ZIP object not successfully created");
        Assert.isTrue(address.getCounty() == null, "County object created when original has no county");
        Assert.notNull(address.getCountry(), "Country object not successfully created");
    }

    @Test
    public void address3() {
        Address address = patientPush.getHeader().getPCP().getAddress();
        Assert.isTrue(address.getStreetAddress() == null, "Street Address object not successfully created");
        Assert.isTrue(address.getCity() == null, "City object not successfully created");
        Assert.isTrue(address.getState() == null, "State object not successfully created");
        Assert.isTrue(address.getZIP() == null, "ZIP object not successfully created");
        Assert.isTrue(address.getCounty() == null, "County object not successfully created");
        Assert.isTrue(address.getCountry() == null, "Country object not successfully created");
    }

    @Test
    public void address4() {
        Address address = patientPush.getAdvanceDirectives().get(0).getCustodians().get(0).getAddress();
        Assert.notNull(address.getStreetAddress(), "Street Address object not successfully created");
        Assert.notNull(address.getCity(), "City object not successfully created");
        Assert.notNull(address.getState(), "State object not successfully created");
        Assert.notNull(address.getZIP(), "ZIP object not successfully created");
        Assert.isTrue(address.getCounty() == null, "County object not successfully created");
        Assert.notNull(address.getCountry(), "Country object not successfully created");
    }
}
