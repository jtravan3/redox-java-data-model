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
public class Medication_Common {

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
    public void medication1() {
        Medication medication = patientPush.getMedications().get(0);
        Assert.notNull(medication.getPrescription(), "Prescription object not successfully created");
        Assert.isTrue(medication.getFreeTextSig() == null, "FreeTextSig object not successfully created");
        Assert.notNull(medication.getDose(), "Dose object not successfully created");
        Assert.notNull(medication.getRate(), "Rate object not successfully created");
        Assert.notNull(medication.getRoute(), "Route object not successfully created");
        Assert.notNull(medication.getStartDate(), "Start Date object not successfully created");
        Assert.isTrue(medication.getEndDate() == null, "End Date object not successfully created");
        Assert.notNull(medication.getFrequency(), "Frequency object not successfully created");
        Assert.isTrue(medication.getIsPRN() == null, "IsPRN object not successfully created");
        Assert.notNull(medication.getProduct(), "Product object not successfully created");
        Assert.isTrue(medication.getDispense() == null, "Dispense object not successfully created");
        Assert.isTrue(medication.getNumberOfRefillsRemaining() == null, "Number of Refills Remaining object not successfully created");
        Assert.isTrue(medication.getOrder() == null, "Order object not successfully created");
        Assert.isTrue(medication.getLotNumber() == null, "Lot Number object not successfully created");
    }

    @Test
    public void medication2() {
        Medication medication = patientPush.getMedications().get(1);
        Assert.notNull(medication.getPrescription(), "Prescription object not successfully created");
        Assert.isTrue(medication.getFreeTextSig() == null, "FreeTextSig object not successfully created");
        Assert.notNull(medication.getDose(), "Dose object not successfully created");
        Assert.notNull(medication.getRate(), "Rate object not successfully created");
        Assert.notNull(medication.getRoute(), "Route object not successfully created");
        Assert.notNull(medication.getStartDate(), "Start Date object not successfully created");
        Assert.notNull(medication.getEndDate(), "End Date object not successfully created");
        Assert.notNull(medication.getFrequency(), "Frequency object not successfully created");
        Assert.notNull(medication.getIsPRN(), "IsPRN object not successfully created");
        Assert.notNull(medication.getProduct(), "Product object not successfully created");
        Assert.isTrue(medication.getDispense() == null, "Dispense object not successfully created");
        Assert.isTrue(medication.getNumberOfRefillsRemaining() == null, "Number of Refills Remaining object not successfully created");
        Assert.isTrue(medication.getOrder() == null, "Order object not successfully created");
        Assert.isTrue(medication.getLotNumber() == null, "Lot Number object not successfully created");
    }
}
