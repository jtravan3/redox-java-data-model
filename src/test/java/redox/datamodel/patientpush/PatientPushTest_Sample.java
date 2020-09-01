package redox.datamodel.patientpush;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.common.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class PatientPushTest_Sample {

    private PatientPush patientPush;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:patient_push/clinicalsummary-patientpush.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        patientPush = mapper.readValue(content, PatientPush.class);
        Assert.notNull(patientPush, "PatientPush object not successfully created");
    }

    @Test
    public void testPatientPush_Allergies() {
        for (Allergy allergy: patientPush.getAllergies()) {
            Assert.notNull(allergy, "Allergy object not successfully created");
        }
    }

    @Test
    public void testPatientPush_Encounters() {
        for (Encounter encounter: patientPush.getEncounters()) {
            Assert.notNull(encounter, "Encounter object not successfully created");
        }
    }

    @Test
    public void testPatientPush_FamilyHistory() {
        for (FamilyHistory familyHistory: patientPush.getFamilyHistory()) {
            Assert.notNull(familyHistory, "Family history object not successfully created");
        }
    }

    @Test
    public void testPatientPush_Header() {
            Assert.notNull(patientPush.getHeader(), "Header object not successfully created");
    }

    @Test
    public void testPatientPush_Meta() {
        Assert.notNull(patientPush.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testPatientPush_AdvanceDirectivesText() {
        Assert.notNull(patientPush.getAdvanceDirectivesText(), "AdvanceDirectivesText object not successfully created");
    }

    @Test
    public void testPatientPush_AdvanceDirectives() {
        Assert.notNull(patientPush.getAdvanceDirectives(), "AdvanceDirectives object not successfully created");
    }

    @Test
    public void testPatientPush_AllergyText() {
        Assert.notNull(patientPush.getAllergyText(), "AllergyText object not successfully created");
    }

    @Test
    public void testPatientPush_EncountersText() {
        Assert.notNull(patientPush.getEncountersText(), "Encounters object not successfully created");
    }

    @Test
    public void testPatientPush_FamilyHistoryText() {
        Assert.notNull(patientPush.getFamilyHistoryText(), "FamilyHistoryText object not successfully created");
    }

    @Test
    public void testPatientPush_ImmunizationText() {
        Assert.notNull(patientPush.getImmunizationText(), "ImmunizationsText object not successfully created");
    }

    @Test
    public void testPatientPush_Immunizations() {
        Assert.notNull(patientPush.getImmunizations(), "Immunizations object not successfully created");
    }

    @Test
    public void testPatientPush_InsurancesText() {
        Assert.notNull(patientPush.getInsurancesText(), "InsurancesText object not successfully created");
    }

    @Test
    public void testPatientPush_Insurances() {
        Assert.notNull(patientPush.getInsurances(), "Insurances object not successfully created");
    }

    @Test
    public void testPatientPush_MedicalEquipmentText() {
        Assert.notNull(patientPush.getMedicalEquipmentText(), "MedicalEquipmentText object not successfully created");
    }

    @Test
    public void testPatientPush_MedicalEquipment() {
        Assert.notNull(patientPush.getMedicalEquipment(), "MedicalEquipment object not successfully created");
    }

    @Test
    public void testPatientPush_MedicationsText() {
        Assert.notNull(patientPush.getMedicationsText(), "MedicationsText object not successfully created");
    }

    @Test
    public void testPatientPush_Medications() {
        Assert.notNull(patientPush.getMedications(), "Medications object not successfully created");
    }

    @Test
    public void testPatientPush_PlanOfCareText() {
        Assert.notNull(patientPush.getPlanOfCareText(), "PlanOfCareText object not successfully created");
    }

    @Test
    public void testPatientPush_PlanOfCare() {
        Assert.notNull(patientPush.getPlanOfCare(), "PlanOfCare object not successfully created");
    }

    @Test
    public void testPatientPush_ProblemsText() {
        Assert.notNull(patientPush.getProblemsText(), "ProblemsText object not successfully created");
    }

    @Test
    public void testPatientPush_Problems() {
        Assert.notNull(patientPush.getProblems(), "Problems object not successfully created");
    }

    @Test
    public void testPatientPush_ProceduresText() {
        Assert.notNull(patientPush.getProceduresText(), "ProceduresText object not successfully created");
    }

    @Test
    public void testPatientPush_Procedures() {
        Assert.notNull(patientPush.getProcedures(), "Procedures object not successfully created");
    }

    @Test
    public void testPatientPush_ResultText() {
        Assert.notNull(patientPush.getResultText(), "ResultText object not successfully created");
    }

    @Test
    public void testPatientPush_Results() {
        Assert.notNull(patientPush.getResults(), "Results object not successfully created");
    }

    @Test
    public void testPatientPush_SocialHistoryText() {
        Assert.notNull(patientPush.getSocialHistoryText(), "SocialHistoryText object not successfully created");
    }

    @Test
    public void testPatientPush_SocialHistory() {
        Assert.notNull(patientPush.getSocialHistory(), "SocialHistory object not successfully created");
        patientPush.getSocialHistory().getObservations().forEach(observation -> {
            Assert.notNull(observation, "Observations were not set correctly");
        });
    }

    @Test
    public void testPatientPush_VitalSignsText() {
        Assert.notNull(patientPush.getVitalSignsText(), "VitalSignsText object not successfully created");
    }

    @Test
    public void testPatientPush_VitalSigns() {
        Assert.notNull(patientPush.getVitalSigns(), "VitalSigns object not successfully created");
    }
}