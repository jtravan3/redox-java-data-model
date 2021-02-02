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
public class Location_Common {

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
    public void location1() {
        Location location = patientPush.getHeader().getDocument().getAuthor().getLocation();
        Assert.isTrue(location.getType() == null, "Type object not successfully created");
        Assert.isTrue(location.getFacility() == null, "Facility object not successfully created");
        Assert.isTrue(location.getDepartment() == null, "Department object not successfully created");
        Assert.isTrue(location.getRoom() == null, "Room object not successfully created");
        Assert.isTrue(location.getBed() == null, "Bed object not successfully created");
        Assert.isTrue(location.getAddress() == null, "Address object not successfully created");
        Assert.isTrue(location.getName() == null, "Name object not successfully created");
    }
}
