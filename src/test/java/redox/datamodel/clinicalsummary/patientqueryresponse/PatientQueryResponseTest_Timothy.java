package redox.datamodel.clinicalsummary.patientqueryresponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.clinicalsummary.common.FamilyHistory;
import redox.datamodel.common.Allergy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class PatientQueryResponseTest_Timothy {

    private PatientQueryResponse patientQueryResponse;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/patient_query_response/redox-example-patientqueryresponse-timothy.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        patientQueryResponse = mapper.readValue(content, PatientQueryResponse.class);
        Assert.notNull(patientQueryResponse, "PatientQueryResponse object not successfully created");
    }



    @Test
    public void testPatientQueryResponse_Allergies() {
        for (Allergy allergy: patientQueryResponse.getAllergies()) {
            Assert.notNull(allergy, "Allergy object not successfully created");
        }
    }

    @Test
    public void testPatientQueryResponse_Encounters() {
        for (Encounter encounter: patientQueryResponse.getEncounters()) {
            Assert.notNull(encounter, "Encounter object not successfully created");
        }
    }

    @Test
    public void testPatientQueryResponse_FamilyHistory() {
        for (FamilyHistory familyHistory: patientQueryResponse.getFamilyHistory()) {
            Assert.notNull(familyHistory, "Family history object not successfully created");
        }
    }

    @Test
    public void testPatientQueryResponse_Header() {
        Assert.notNull(patientQueryResponse.getHeader(), "Header object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Meta() {
        Assert.notNull(patientQueryResponse.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_AdvanceDirectivesText() {
        Assert.notNull(patientQueryResponse.getAdvanceDirectivesText(), "AdvanceDirectivesText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_AdvanceDirectives() {
        Assert.notNull(patientQueryResponse.getAdvanceDirectives(), "AdvanceDirectives object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_AllergyText() {
        Assert.notNull(patientQueryResponse.getAllergyText(), "AllergyText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_EncountersText() {
        Assert.notNull(patientQueryResponse.getEncountersText(), "Encounters object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_FamilyHistoryText() {
        Assert.notNull(patientQueryResponse.getFamilyHistoryText(), "FamilyHistoryText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_ImmunizationText() {
        Assert.notNull(patientQueryResponse.getImmunizationText(), "ImmunizationsText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Immunizations() {
        Assert.notNull(patientQueryResponse.getImmunizations(), "Immunizations object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_InsurancesText() {
        Assert.notNull(patientQueryResponse.getInsurancesText(), "InsurancesText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Insurances() {
        Assert.notNull(patientQueryResponse.getInsurances(), "Insurances object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_MedicalEquipmentText() {
        Assert.notNull(patientQueryResponse.getMedicalEquipmentText(), "MedicalEquipmentText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_MedicalEquipment() {
        Assert.notNull(patientQueryResponse.getMedicalEquipment(), "MedicalEquipment object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_MedicationsText() {
        Assert.notNull(patientQueryResponse.getMedicationsText(), "MedicationsText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Medications() {
        Assert.notNull(patientQueryResponse.getMedications(), "Medications object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_PlanOfCareText() {
        Assert.notNull(patientQueryResponse.getPlanOfCareText(), "PlanOfCareText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_PlanOfCare() {
        Assert.notNull(patientQueryResponse.getPlanOfCare(), "PlanOfCare object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_ProblemsText() {
        Assert.notNull(patientQueryResponse.getProblemsText(), "ProblemsText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Problems() {
        Assert.notNull(patientQueryResponse.getProblems(), "Problems object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_ProceduresText() {
        Assert.notNull(patientQueryResponse.getProceduresText(), "ProceduresText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Procedures() {
        Assert.notNull(patientQueryResponse.getProcedures(), "Procedures object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_ResultText() {
        Assert.notNull(patientQueryResponse.getResultText(), "ResultText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_Results() {
        Assert.notNull(patientQueryResponse.getResults(), "Results object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_SocialHistoryText() {
        Assert.notNull(patientQueryResponse.getSocialHistoryText(), "SocialHistoryText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_SocialHistory() {
        Assert.notNull(patientQueryResponse.getSocialHistory(), "SocialHistory object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_VitalSignsText() {
        Assert.notNull(patientQueryResponse.getVitalSignsText(), "VitalSignsText object not successfully created");
    }

    @Test
    public void testPatientQueryResponse_VitalSigns() {
        Assert.notNull(patientQueryResponse.getVitalSigns(), "VitalSigns object not successfully created");
    }

    @Test
    public void testPatientQuery_AdditionalProperties() {
        Assert.isTrue(patientQueryResponse.getAdditionalProperties().isEmpty(), "Additional Properties object was created when it should not have been");
    }
}