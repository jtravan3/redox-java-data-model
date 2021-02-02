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
public class Dose_Common {

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
    public void dose1() {
        Dose dose = patientPush.getImmunizations().get(0).getDose();
        Assert.notNull(dose.getQuantity(), "Quantity object not successfully created");
        Assert.notNull(dose.getUnits(), "Units object not successfully created");
    }

    @Test
    public void dose2() {
        Dose dose = patientPush.getImmunizations().get(1).getDose();
        Assert.notNull(dose.getQuantity(), "Quantity object not successfully created");
        Assert.notNull(dose.getUnits(), "Units object not successfully created");
    }

    @Test
    public void dose3() {
        Dose dose = patientPush.getMedications().get(0).getDose();
        Assert.notNull(dose.getQuantity(), "Quantity object not successfully created");
        Assert.notNull(dose.getUnits(), "Units object not successfully created");
    }

    @Test
    public void dose4() {
        Dose dose = patientPush.getMedications().get(1).getDose();
        Assert.notNull(dose.getQuantity(), "Quantity object not successfully created");
        Assert.notNull(dose.getUnits(), "Units object not successfully created");
    }

    @Test
    public void dose5() {
        Dose dose = patientPush.getPlanOfCare().getMedicationAdministration().get(0).getDose();
        Assert.notNull(dose.getQuantity(), "Quantity object not successfully created");
        Assert.notNull(dose.getUnits(), "Units object not successfully created");
    }
}
