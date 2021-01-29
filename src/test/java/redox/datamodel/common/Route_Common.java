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
public class Route_Common {

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
    public void route1() {
        Route route = patientPush.getImmunizations().get(0).getRoute();
        Assert.notNull(route.getCode(), "Code object not successfully created");
        Assert.notNull(route.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(route.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(route.getName(), "Name object not successfully created");
        Assert.notNull(route.getAltCodes(), "Alt Codes object not successfully created");
    }

    @Test
    public void route2() {
        Route route = patientPush.getImmunizations().get(1).getRoute();
        Assert.notNull(route.getCode(), "Code object not successfully created");
        Assert.notNull(route.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(route.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(route.getName(), "Name object not successfully created");
        Assert.notNull(route.getAltCodes(), "Alt Codes object not successfully created");
    }

    @Test
    public void route3() {
        Route route = patientPush.getMedications().get(0).getRoute();
        Assert.notNull(route.getCode(), "Code object not successfully created");
        Assert.notNull(route.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(route.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(route.getName(), "Name object not successfully created");
        Assert.notNull(route.getAltCodes(), "Alt Codes object not successfully created");
    }

    @Test
    public void route4() {
        Route route = patientPush.getMedications().get(1).getRoute();
        Assert.notNull(route.getCode(), "Code object not successfully created");
        Assert.notNull(route.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(route.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(route.getName(), "Name object not successfully created");
        Assert.notNull(route.getAltCodes(), "Alt Codes object not successfully created");
    }

    @Test
    public void route5() {
        Route route = patientPush.getPlanOfCare().getMedicationAdministration().get(0).getRoute();
        Assert.notNull(route.getCode(), "Code object not successfully created");
        Assert.notNull(route.getCodeSystem(), "Code System object not successfully created");
        Assert.notNull(route.getCodeSystemName(), "Code System Name object not successfully created");
        Assert.notNull(route.getName(), "Name object not successfully created");
        Assert.notNull(route.getAltCodes(), "Alt Codes object not successfully created");
    }
}
