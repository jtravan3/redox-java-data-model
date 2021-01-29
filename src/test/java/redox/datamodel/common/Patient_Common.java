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
public class Patient_Common {

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
    public void patient1() {
        Patient patient = patientPush.getHeader().getPatient();
        Assert.notNull(patient.getIdentifiers(), "Identifiers object not successfully created");
        Assert.notNull(patient.getDemographics(), "Demographics object not successfully created");
        Assert.isTrue(patient.getNotes() == null, "Notes object not successfully created");
        Assert.isTrue(patient.getContacts() == null, "Contacts object not successfully created");
        Assert.isTrue(patient.getAllergies() == null, "Allergies object not successfully created");
        Assert.isTrue(patient.getConsent() == null, "Consent object not successfully created");
        }
}
