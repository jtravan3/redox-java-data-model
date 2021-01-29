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
public class Pharmacy_Common {

    private NewMedications medication;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:medications/newMedications/medications-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        medication = mapper.readValue(content, NewMedications.class);
        Assert.notNull(medication, "New Medication object not successfully created");
    }

    @Test
    public void pharmacy1() {
        Pharmacy pharmacy = medication.getOrder().getPharmacy();
        Assert.notNull(pharmacy.getCode(), "Code object not successfully created");
        Assert.notNull(pharmacy.getCodeset(), "Code Set object not successfully created");
        Assert.notNull(pharmacy.getDescription(), "Description object not successfully created");
        Assert.notNull(pharmacy.getAddress(), "Address object not successfully created");
        Assert.notNull(pharmacy.getPhoneNumber(), "Phone Number object not successfully created");
    }
}
