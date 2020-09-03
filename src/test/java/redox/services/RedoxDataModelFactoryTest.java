package redox.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.clinicalsummary.patientpush.PatientPush;
import redox.datamodel.clinicalsummary.patientquery.PatientQuery;
import redox.datamodel.clinicalsummary.patientqueryresponse.PatientQueryResponse;

import java.io.IOException;
import java.nio.file.Path;

@SpringBootTest(classes = {RedoxDataModelFactory.class})
@RunWith(SpringRunner.class)
@ContextConfiguration
public class RedoxDataModelFactoryTest {

    @Autowired
    private RedoxDataModelFactory redoxDataModelFactory;

    @Test
    public void parsePatientPushJson_Myra() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_push/redox-example-patientpush-myra.json").toPath();
        Assert.notNull(redoxDataModelFactory.parseRedoxJson(filePath, PatientPush.class), "PatientPush object is null");
    }

    @Test
    public void parsePatientPushJson_Sample() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_push/clinicalsummary-patientpush.json").toPath();
        Assert.notNull(redoxDataModelFactory.parseRedoxJson(filePath, PatientPush.class), "PatientPush object is null");
    }

    @Test
    public void parsePatientPushJson_Timothy() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_push/redox-example-patientpush-timothy.json").toPath();
        Assert.notNull(redoxDataModelFactory.parseRedoxJson(filePath, PatientPush.class), "PatientPush object is null");
    }

    @Test
    public void parsePatientQuery_Sample() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_query/clinicalsummary-patientquery.json").toPath();
        Assert.notNull(redoxDataModelFactory.parseRedoxJson(filePath, PatientQuery.class), "PatientQuery object is null");
    }

    @Test
    public void parsePatientQuery_Failure_Sample() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_query/clinicalsummary-patientquery.json").toPath();
        PatientPush patientPush = redoxDataModelFactory.parseRedoxJson(filePath, PatientPush.class);
        Assert.isTrue(!patientPush.getAdditionalProperties().isEmpty(), "PatientQuery object should have additional properties");
    }

    @Test
    public void parsePatientQueryResponse_Sample() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_query_response/clinicalsummary-patientqueryresponse.json").toPath();
        Assert.notNull(redoxDataModelFactory.parseRedoxJson(filePath, PatientQueryResponse.class), "PatientQueryResponse object is null");
    }

    @Test
    public void parsePatientQueryResponse_Failure_Sample() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_query_response/clinicalsummary-patientqueryresponse.json").toPath();
        PatientQuery patientQuery = redoxDataModelFactory.parseRedoxJson(filePath, PatientQuery.class);
        Assert.isTrue(!patientQuery.getAdditionalProperties().isEmpty(), "PatientQueryResponse object should have additional properties");
    }
}
