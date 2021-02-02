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
public class Product_Common {

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
    public void product1() {
        Product product = patientPush.getMedicalEquipment().get(0).getProduct();
        Assert.isTrue(product.getManufacturer() == null, "Manufacturer object not successfully created");
        Assert.notNull(product.getCode(), "Code object not successfully created");
        Assert.notNull(product.getCodeSystem(), "CodeSystem object not successfully created");
        Assert.notNull(product.getCodeSystemName(), "CodeSystemName object not successfully created");
        Assert.notNull(product.getName(), "Name object not successfully created");
        Assert.notNull(product.getAltCodes(), "AltCodes object not successfully created");
        Assert.isTrue(product.getLotNumber() == null, "LotNumber object not successfully created");
    }

    @Test
    public void product2() {
        Product product = patientPush.getMedicalEquipment().get(1).getProduct();
        Assert.isTrue(product.getManufacturer() == null, "Manufacturer object not successfully created");
        Assert.notNull(product.getCode(), "Code object not successfully created");
        Assert.notNull(product.getCodeSystem(), "CodeSystem object not successfully created");
        Assert.notNull(product.getCodeSystemName(), "CodeSystemName object not successfully created");
        Assert.notNull(product.getName(), "Name object not successfully created");
        Assert.notNull(product.getAltCodes(), "AltCodes object not successfully created");
        Assert.isTrue(product.getLotNumber() == null, "LotNumber object not successfully created");
    }

    @Test
    public void product3() {
        Product product = patientPush.getMedicalEquipment().get(2).getProduct();
        Assert.isTrue(product.getManufacturer() == null, "Manufacturer object not successfully created");
        Assert.notNull(product.getCode(), "Code object not successfully created");
        Assert.notNull(product.getCodeSystem(), "CodeSystem object not successfully created");
        Assert.notNull(product.getCodeSystemName(), "CodeSystemName object not successfully created");
        Assert.notNull(product.getName(), "Name object not successfully created");
        Assert.notNull(product.getAltCodes(), "AltCodes object not successfully created");
        Assert.isTrue(product.getLotNumber() == null, "LotNumber object not successfully created");
    }

    @Test
    public void product4() {
        Product product = patientPush.getMedications().get(0).getProduct();
        Assert.isTrue(product.getManufacturer() == null, "Manufacturer object not successfully created");
        Assert.notNull(product.getCode(), "Code object not successfully created");
        Assert.notNull(product.getCodeSystem(), "CodeSystem object not successfully created");
        Assert.notNull(product.getCodeSystemName(), "CodeSystemName object not successfully created");
        Assert.notNull(product.getName(), "Name object not successfully created");
        Assert.notNull(product.getAltCodes(), "AltCodes object not successfully created");
        Assert.isTrue(product.getLotNumber() == null, "LotNumber object not successfully created");
    }

    @Test
    public void product5() {
        Product product = patientPush.getMedications().get(1).getProduct();
        Assert.isTrue(product.getManufacturer() == null, "Manufacturer object not successfully created");
        Assert.notNull(product.getCode(), "Code object not successfully created");
        Assert.notNull(product.getCodeSystem(), "CodeSystem object not successfully created");
        Assert.notNull(product.getCodeSystemName(), "CodeSystemName object not successfully created");
        Assert.notNull(product.getName(), "Name object not successfully created");
        Assert.notNull(product.getAltCodes(), "AltCodes object not successfully created");
        Assert.isTrue(product.getLotNumber() == null, "LotNumber object not successfully created");
    }

    @Test
    public void product6() {
        Product product = patientPush.getPlanOfCare().getMedicationAdministration().get(0).getProduct();
        Assert.isTrue(product.getManufacturer() == null, "Manufacturer object not successfully created");
        Assert.notNull(product.getCode(), "Code object not successfully created");
        Assert.notNull(product.getCodeSystem(), "CodeSystem object not successfully created");
        Assert.notNull(product.getCodeSystemName(), "CodeSystemName object not successfully created");
        Assert.notNull(product.getName(), "Name object not successfully created");
        Assert.notNull(product.getAltCodes(), "AltCodes object not successfully created");
        Assert.isTrue(product.getLotNumber() == null, "LotNumber object not successfully created");
    }

    @Test
    public void product7() {
        Product product = patientPush.getImmunizations().get(0).getProduct();
        Assert.notNull(product.getManufacturer(), "Manufacturer object not successfully created");
        Assert.notNull(product.getCode(), "Code object not successfully created");
        Assert.notNull(product.getCodeSystem(), "CodeSystem object not successfully created");
        Assert.notNull(product.getCodeSystemName(), "CodeSystemName object not successfully created");
        Assert.notNull(product.getName(), "Name object not successfully created");
        Assert.notNull(product.getAltCodes(), "AltCodes object not successfully created");
        Assert.isTrue(product.getLotNumber() == null, "LotNumber object not successfully created");
    }

    @Test
    public void product8() {
        Product product = patientPush.getImmunizations().get(1).getProduct();
        Assert.notNull(product.getManufacturer(), "Manufacturer object not successfully created");
        Assert.notNull(product.getCode(), "Code object not successfully created");
        Assert.notNull(product.getCodeSystem(), "CodeSystem object not successfully created");
        Assert.notNull(product.getCodeSystemName(), "CodeSystemName object not successfully created");
        Assert.notNull(product.getName(), "Name object not successfully created");
        Assert.notNull(product.getAltCodes(), "AltCodes object not successfully created");
        Assert.isTrue(product.getLotNumber() == null, "LotNumber object not successfully created");
    }
}
