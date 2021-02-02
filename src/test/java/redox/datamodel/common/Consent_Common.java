package redox.datamodel.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.clinicalsummary.patientpush.PatientPush;
import redox.datamodel.vaccination.newVaccination.NewVaccination;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class Consent_Common {

    private NewVaccination vaccination;

    @Test
    public void consent1() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:vaccination/newVaccination/vaccination-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        vaccination = mapper.readValue(content, NewVaccination.class);
        Assert.notNull(vaccination, "Vaccination object not successfully created");
        Consent consent = vaccination.getPatient().getConsent();
        Assert.isTrue(consent.getStatus() == null, "Status object not successfully created");
        Assert.isTrue(consent.getEffectiveDate() == null, "Status object not successfully created");
        Assert.isTrue(consent.getNotification() == null, "Status object not successfully created");
    }

    @Test
    public void consent2() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:vaccination/newVaccination/barbara.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        vaccination = mapper.readValue(content, NewVaccination.class);
        Assert.notNull(vaccination, "Vaccination object not successfully created");
        Consent consent = vaccination.getPatient().getConsent();
        Assert.isTrue(consent.getStatus() == null, "Status object not successfully created");
        Assert.isTrue(consent.getEffectiveDate() == null, "Status object not successfully created");
        Assert.isTrue(consent.getNotification() == null, "Status object not successfully created");
    }

    @Test
    public void consent3() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:vaccination/newVaccination/timothy.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        vaccination = mapper.readValue(content, NewVaccination.class);
        Assert.notNull(vaccination, "Vaccination object not successfully created");
        Consent consent = vaccination.getPatient().getConsent();
        Assert.isTrue(consent.getStatus() == null, "Status object not successfully created");
        Assert.isTrue(consent.getEffectiveDate() == null, "Status object not successfully created");
        Assert.isTrue(consent.getNotification() == null, "Status object not successfully created");
    }
}