package redox.datamodel.clinicalsummary.visitpush;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.clinicalsummary.common.Encounter;
import redox.datamodel.clinicalsummary.common.FamilyHistory;
import redox.datamodel.common.Allergy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class VisitPushTest_Timothy {

    private VisitPush visitPush;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:clinicalsummary/visit_push/redox-example-visitpush-timothy.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        visitPush = mapper.readValue(content, VisitPush.class);
        Assert.notNull(visitPush, "VisitPush object not successfully created");
    }

    @Test
    public void testVisitPush_Allergies() {
        for (Allergy allergy: visitPush.getAllergies()) {
            Assert.notNull(allergy, "Allergy object not successfully created");
        }
    }

    @Test
    public void testVisitPush_Encounters() {
        for (Encounter encounter: visitPush.getEncounters()) {
            Assert.notNull(encounter, "Encounter object not successfully created");
        }
    }

    @Test
    public void testVisitPush_FamilyHistory() {
        for (FamilyHistory familyHistory: visitPush.getFamilyHistory()) {
            Assert.notNull(familyHistory, "Family history object not successfully created");
        }
    }

    @Test
    public void testVisitPush_Header() {
            Assert.notNull(visitPush.getHeader(), "Header object not successfully created");
    }

    @Test
    public void testVisitPush_Meta() {
        Assert.notNull(visitPush.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testVisitPush_AdvanceDirectivesText() {
        Assert.notNull(visitPush.getAdvanceDirectivesText(), "AdvanceDirectivesText object not successfully created");
    }

    @Test
    public void testVisitPush_AdvanceDirectives() {
        Assert.notNull(visitPush.getAdvanceDirectives(), "AdvanceDirectives object not successfully created");
    }

    @Test
    public void testVisitPush_AllergyText() {
        Assert.notNull(visitPush.getAllergyText(), "AllergyText object not successfully created");
    }

    @Test
    public void testVisitPush_EncountersText() {
        Assert.notNull(visitPush.getEncountersText(), "Encounters object not successfully created");
    }

    @Test
    public void testVisitPush_FamilyHistoryText() {
        Assert.notNull(visitPush.getFamilyHistoryText(), "FamilyHistoryText object not successfully created");
    }

    @Test
    public void testVisitPush_ImmunizationText() {
        Assert.notNull(visitPush.getImmunizationText(), "ImmunizationsText object not successfully created");
    }

    @Test
    public void testVisitPush_Immunizations() {
        Assert.notNull(visitPush.getImmunizations(), "Immunizations object not successfully created");
    }

    @Test
    public void testVisitPush_Insurances() {
        Assert.notNull(visitPush.getInsurances(), "Insurances object not successfully created");
    }

    @Test
    public void testVisitPush_MedicalEquipmentText() {
        Assert.notNull(visitPush.getMedicalEquipmentText(), "MedicalEquipmentText object not successfully created");
    }

    @Test
    public void testVisitPush_MedicalEquipment() {
        Assert.notNull(visitPush.getMedicalEquipment(), "MedicalEquipment object not successfully created");
    }

    @Test
    public void testVisitPush_MedicationsText() {
        Assert.notNull(visitPush.getMedicationsText(), "MedicationsText object not successfully created");
    }

    @Test
    public void testVisitPush_Medications() {
        Assert.notNull(visitPush.getMedications(), "Medications object not successfully created");
    }

    @Test
    public void testVisitPush_PlanOfCareText() {
        Assert.notNull(visitPush.getPlanOfCareText(), "PlanOfCareText object not successfully created");
    }

    @Test
    public void testVisitPush_PlanOfCare() {
        Assert.notNull(visitPush.getPlanOfCare(), "PlanOfCare object not successfully created");
    }

    @Test
    public void testVisitPush_ProblemsText() {
        Assert.notNull(visitPush.getProblemsText(), "ProblemsText object not successfully created");
    }

    @Test
    public void testVisitPush_Problems() {
        Assert.notNull(visitPush.getProblems(), "Problems object not successfully created");
    }

    @Test
    public void testVisitPush_ProceduresText() {
        Assert.notNull(visitPush.getProceduresText(), "ProceduresText object not successfully created");
    }

    @Test
    public void testVisitPush_Procedures() {
        Assert.notNull(visitPush.getProcedures(), "Procedures object not successfully created");
    }

    @Test
    public void testVisitPush_ResultText() {
        Assert.notNull(visitPush.getResultText(), "ResultText object not successfully created");
    }

    @Test
    public void testVisitPush_Results() {
        Assert.notNull(visitPush.getResults(), "Results object not successfully created");
    }

    @Test
    public void testVisitPush_SocialHistoryText() {
        Assert.notNull(visitPush.getSocialHistoryText(), "SocialHistoryText object not successfully created");
    }

    @Test
    public void testVisitPush_SocialHistory() {
        Assert.notNull(visitPush.getSocialHistory(), "SocialHistory object not successfully created");
        visitPush.getSocialHistory().getObservations().forEach(observation -> {
            Assert.notNull(observation, "Observations were not set correctly");
        });
    }

    @Test
    public void testVisitPush_VitalSignsText() {
        Assert.notNull(visitPush.getVitalSignsText(), "VitalSignsText object not successfully created");
    }

    @Test
    public void testVisitPush_VitalSigns() {
        Assert.notNull(visitPush.getVitalSigns(), "VitalSigns object not successfully created");
    }

    @Test
    public void testVisitPush_AdditionalProperties() {
        Assert.isTrue(visitPush.getAdditionalProperties().isEmpty(), "Additional Properties object was created when it should not have been");
    }
}