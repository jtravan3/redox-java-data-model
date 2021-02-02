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
public class Order_Common {

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
    public void order1() {
        Order order = medication.getOrder();
        Assert.notNull(order.getID(), "ID object not successfully created");
        Assert.notNull(order.getNotes(), "Notes object not successfully created");
        Assert.notNull(order.getMedication(), "Medication object not successfully created");
        Assert.notNull(order.getIndications(), "Indications object not successfully created");
        Assert.notNull(order.getProvider(), "Provider object not successfully created");
        Assert.notNull(order.getEnteredBy(), "EnteredBy object not successfully created");
        Assert.notNull(order.getVerifiedBy(), "VerifiedBy object not successfully created");
        Assert.isTrue(order.getPriority() == null, "Priority object not successfully created");
        Assert.notNull(order.getPharmacy(), "Pharmacy object not successfully created");
        Assert.isTrue(order.getName() == null, "Name object not successfully created");
    }
}
