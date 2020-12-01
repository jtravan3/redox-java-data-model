package redox.datamodel.results.newResults;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.common.*;
import redox.datamodel.results.common.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Slf4j
public class Results_New {

    private Results results;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:results/newResults/results-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        results = mapper.readValue(content, Results.class);
        Assert.notNull(results, "Results object not successfully created");
    }

    @Test
    public void testResults_Meta() {
        Assert.notNull(results.getMeta(), "Meta object not successfully created");
        Assert.isTrue(results.getMeta().getDataModel().equals("Results"), "Data model is correct");
        Assert.isTrue(results.getMeta().getDestinations().get(0).getID().equals("af394f14-b34a-464f-8d24-895f370af4c9"), "Destination ID is correct");
        Assert.isTrue(results.getMeta().getDestinations().get(0).getName().equals("Redox EMR"), "Destination Name is correct");
        Assert.isTrue(results.getMeta().getEventDateTime().equals("2020-11-05T19:32:15.691Z"), "EventDateTime is correct");
        Assert.isTrue(results.getMeta().getEventType().equals("New"), "EventType is correct");
        Assert.isTrue(results.getMeta().getTest(), "Test is correct");
        Assert.isNull(results.getMeta().getFacilityCode(), "Facility Code is null");
        long messageID = 5565;
        Assert.isTrue(results.getMeta().getMessage().getID().equals(messageID), "MessageID is correct");
        Assert.isTrue(results.getMeta().getSource().getID().equals("7ce6f387-c33c-417d-8682-81e83628cbd9"), "SourceID is correct");
        Assert.isTrue(results.getMeta().getSource().getName().equals("Redox Dev Tools"), "SourceName is correct");
        long transmissionID = 12414;
        Assert.isTrue(results.getMeta().getTransmission().getID().equals(transmissionID), "Transmission ID is correct");
    }

    @Test
    public void testResults_Patient() {
        Patient patient = results.getPatient();
        Assert.notNull(patient, "Patient object not successfully created");
        Contact contact = patient.getContacts().get(0);
        List<Identifier> identifiers = patient.getIdentifiers();
        Demographics demographics = patient.getDemographics();
        Assert.isTrue(contact.getFirstName().equals("Barbara"), "Contact first name is correct");
        Assert.isTrue(contact.getLastName().equals("Bixby"), "Contact last name is correct");
        Assert.isNull(contact.getMiddleName(), "Contact middle name is correct");
        Assert.isTrue(contact.getAddress().getStreetAddress().equals("4762 Hickory Street"), "Contact street address is correct");
        Assert.isTrue(contact.getAddress().getCity().equals("Monroe"), "Contact city is correct");
        Assert.isTrue(contact.getAddress().getState().equals("WI"), "Contact state is correct");
        Assert.isTrue(contact.getAddress().getZIP().equals("53566"), "Contact zip is correct");
        Assert.isTrue(contact.getAddress().getCounty().equals("Green"), "Contact county is correct");
        Assert.isTrue(contact.getAddress().getCountry().equals("US"), "Contact country is correct");
        Assert.isTrue(contact.getPhoneNumber().getHome().equals("+18088675303"), "Contact home phone is correct");
        Assert.isTrue(contact.getPhoneNumber().getOffice().equals("+17077543758"), "Contact office phone is correct");
        Assert.isTrue(contact.getPhoneNumber().getMobile().equals("+19189368865"), "Contact mobile phone is correct");
        Assert.isTrue(contact.getRelationToPatient().equals("Mother"), "Contact relation is correct");
        Assert.isTrue(contact.getEmailAddresses().get(0).equals("barb.bixby@test.net"), "Contact email is correct");
        Assert.isTrue(contact.getRoles().get(0).equals("Emergency Contact"), "Contact role is correct");
        Assert.isTrue(identifiers.get(0).getID().equals("0000000001"), "Identifier 1 ID is correct");
        Assert.isTrue(identifiers.get(0).getIDType().equals("MR"), "Identifier 1 ID Type is correct");
        Assert.isTrue(identifiers.get(1).getID().equals("e167267c-16c9-4fe3-96ae-9cff5703e90a"), "Identifier 2 ID is correct");
        Assert.isTrue(identifiers.get(1).getIDType().equals("EHRID"), "Identifier 2 ID Type is correct");
        Assert.isTrue(identifiers.get(2).getID().equals("a1d4ee8aba494ca"), "Identifier 3 ID is correct");
        Assert.isTrue(identifiers.get(2).getIDType().equals("NIST"), "Identifier 3 ID Type is correct");
        Assert.isTrue(demographics.getFirstName().equals("Timothy"), "First name is correct");
        Assert.isTrue(demographics.getMiddleName().equals("Paul"), "Middle name is correct");
        Assert.isTrue(demographics.getLastName().equals("Bixby"), "Last name is correct");
        Assert.isTrue(demographics.getDOB().equals("2008-01-06"), "DOB is correct");
        Assert.isTrue(demographics.getSSN().equals("101-01-0001"), "SSN is correct");
        Assert.isTrue(demographics.getSex().equals("Male"), "Sex is correct");
        Assert.isTrue(demographics.getRace().equals("White"), "Race is correct");
        Assert.isNull(demographics.getIsHispanic(), "isHispanic is null");
        Assert.isTrue(demographics.getMaritalStatus().equals("Married"), "Maritial status is correct");
        Assert.isNull(demographics.getIsDeceased(), "isDecreased is null");
        Assert.isNull(demographics.getDeathDateTime(), "DeathDateTime is null");
        Assert.isTrue(demographics.getPhoneNumber().getHome().equals("+18088675301"), "Home phone is correct");
        Assert.isNull(demographics.getPhoneNumber().getOffice(), "Office number is null");
        Assert.isNull(demographics.getPhoneNumber().getMobile(), "Mobile number is null");
        Assert.isTrue(demographics.getEmailAddresses().size() == 0, "Email addresses is empty");
        Assert.isTrue(demographics.getLanguage().equals("en"), "Language is correct");
        Assert.isTrue(demographics.getCitizenship().size() == 0, "Citizenship is empty");
        Assert.isTrue(demographics.getAddress().getStreetAddress().equals("4762 Hickory Street"), "Contact street address is correct");
        Assert.isTrue(demographics.getAddress().getCity().equals("Monroe"), "City is correct");
        Assert.isTrue(demographics.getAddress().getState().equals("WI"), "State is correct");
        Assert.isTrue(demographics.getAddress().getZIP().equals("53566"), "Zip is correct");
        Assert.isTrue(demographics.getAddress().getCounty().equals("Green"), "County is correct");
        Assert.isTrue(demographics.getAddress().getCountry().equals("US"), "Country is correct");
    }

    @Test
    public void testResults_Orders() {

        Assert.notNull(results.getOrders(), "Orders object not successfully created");
        Order order = results.getOrders().get(0);
        Assert.isTrue(order.getID().equals("157968300"), "Order ID is correct");
        Assert.isNull(order.getApplicationOrderID(), "Application Order ID is correct");
        Assert.isTrue(order.getTransactionDateTime().equals("2015-05-06T06:00:58.872Z"), "TransactionDateTime is correct");
        Assert.isTrue(order.getCollectionDateTime().equals("2015-05-06T06:00:58.872Z"), "CollectionDateTime is correct");
        Assert.isTrue(order.getCompletionDateTime().equals("2015-05-06T06:00:58.872Z"), "CompletionDateTime is correct");
        Assert.isTrue(order.getResultsStatus().equals("Final"), "ResultsStatus is correct");
        Assert.isTrue(order.getProcedure().getCode().equals("49086-2"), "Procedure code is correct");
        Assert.isNull(order.getProcedure().getCodeset(), "Codeset is correct");
        Assert.isTrue(order.getProcedure().getDescription().equals("First trimester maternal screen with nuchal translucency panel"), "Description is correct");
        Provider provider = order.getProvider();
        Assert.isTrue(provider.getNPI().equals("4356789876"), "ProviderNPI is correct");
        Assert.isNull(provider.getID(), "Provider ID is correct");
        Assert.isNull(provider.getIDType(), "Provider ID type is correct");
        Assert.isTrue(provider.getFirstName().equals("Pat"), "Provider first name is correct");
        Assert.isTrue(provider.getLastName().equals("Granite"), "Provider last name is correct");
        Assert.isNull(provider.getAddress().getStreetAddress(), "Provider street address is correct");
        Assert.isNull(provider.getAddress().getCity(), "Provider city is correct");
        Assert.isNull(provider.getAddress().getState(), "Provider state is correct");
        Assert.isNull(provider.getAddress().getZIP(), "Provider zip is correct");
        Assert.isNull(provider.getAddress().getCounty(), "Provider county is correct");
        Assert.isNull(provider.getAddress().getCountry(), "Provider country is correct");
        Assert.isNull(provider.getPhoneNumber().getOffice(), "Provider phone number is correct");
        Assert.isNull(provider.getLocation().getType(), "Provider location type is correct");
        Assert.isNull(provider.getLocation().getFacility(), "Provider location facility is correct");
        Assert.isNull(provider.getLocation().getDepartment(), "Provider location department is correct");
        Assert.isNull(provider.getLocation().getRoom(), "Provider location room is correct");
        Assert.isTrue(order.getStatus().equals("Resulted"), "Status is correct");
        Assert.isTrue(order.getResponseFlag().equals("Associated Segments"), "Response Flag is correct");
        Assert.isTrue(order.getPriority().equals("Stat"), "Priority is correct");
        Result result1 = order.getResults().get(0);
        Result result2 = order.getResults().get(1);
        //result 1
        Assert.isTrue(result1.getCode().equals("TEST0001"), "First result code is correct");
        Assert.isNull(result1.getCodeset(), "First result codeset is correct");
        Assert.isTrue(result1.getDescription().equals("Cystic Fibrosis"), "First result description is correct");
        Assert.isNull(result1.getRelatedGroupID(), "First result related group ID is correct");
        Assert.isNull(result1.getSpecimen().getSource(), "First result specimen source is correct");
        Assert.isNull(result1.getSpecimen().getBodySite(), "First result specimen body site is correct");
        Assert.isNull(result1.getSpecimen().getID(), "First result specimen ID is correct");
        Assert.isTrue(result1.getValue().equals("Positive Result"), "First result value is correct");
        Assert.isTrue(result1.getValueType().equals("String"), "First result value type is correct");
        Assert.isNull(result1.getCompletionDateTime(), "First result completionDateTime is correct");
        Assert.isNull(result1.getFileType(), "First result file type is correct");
        Assert.isNull(result1.getUnits(), "First result units is correct");
        Assert.isTrue(result1.getAbnormalFlag().equals("Very Abnormal"), "First result abnormal flag is correct");
        Assert.isTrue(result1.getStatus().equals("Final"), "First result status is correct");
        PrimaryResultsInterpreter res1PrimResInt = result1.getPrimaryResultsInterpreter();
        Assert.isNull(res1PrimResInt.getNPI(), "First result primary results interpreter NPI is correct");
        Assert.isNull(res1PrimResInt.getID(), "First result primary results interpreter ID is correct");
        Assert.isNull(res1PrimResInt.getIDType(), "First result primary results interpreter IDType is correct");
        Assert.isNull(res1PrimResInt.getFirstName(), "First result primary results interpreter FirstName is correct");
        Assert.isNull(res1PrimResInt.getLastName(), "First result primary results interpreter LastName is correct");
        Assert.isNull(res1PrimResInt.getAddress().getStreetAddress(), "First result primary results interpreter street address is correct");
        Assert.isNull(res1PrimResInt.getAddress().getCity(), "First result primary results interpreter address city is correct");
        Assert.isNull(res1PrimResInt.getAddress().getState(), "First result primary results interpreter address state is correct");
        Assert.isNull(res1PrimResInt.getAddress().getZIP(), "First result primary results interpreter address ZIP is correct");
        Assert.isNull(res1PrimResInt.getAddress().getCounty(), "First result primary results interpreter address County is correct");
        Assert.isNull(res1PrimResInt.getAddress().getCountry(), "First result primary results interpreter address country is correct");
        Assert.isNull(res1PrimResInt.getPhoneNumber().getOffice(), "First result primary results interpreter phone number is correct");
        Assert.isNull(res1PrimResInt.getLocation().getType(), "First result primary results interpreter location type is correct");
        Assert.isNull(res1PrimResInt.getLocation().getFacility(), "First result primary results interpreter location facility is correct");
        Assert.isNull(res1PrimResInt.getLocation().getDepartment(), "First result primary results interpreter location department is correct");
        Assert.isNull(res1PrimResInt.getLocation().getRoom(), "First result primary results interpreter location room is correct");
        Assert.isNull(result1.getReferenceRange().getLow(), "First result reference range low is correct");
        Assert.isNull(result1.getReferenceRange().getHigh(), "First result reference range high is correct");
        Assert.isNull(result1.getReferenceRange().getText(), "First result reference range text is correct");
        Assert.isNull(result1.getObservationMethod().getCode(), "First result observation method code is correct");
        Assert.isNull(result1.getObservationMethod().getCodeset(), "First result observation method codeset is correct");
        Assert.isNull(result1.getObservationMethod().getDescription(), "First result observation method description is correct");
        //result 2
        Assert.isTrue(result2.getCode().equals("TEST0004"), "Second result code is correct");
        Assert.isNull(result2.getCodeset(), "Second result codeset is correct");
        Assert.isTrue(result2.getDescription().equals("Primary Carnitine Deficiency"), "Second result description is correct");
        Assert.isNull(result2.getRelatedGroupID(), "Second result related group ID is correct");
        Assert.isNull(result2.getSpecimen().getSource(), "Second result specimen source is correct");
        Assert.isNull(result2.getSpecimen().getBodySite(), "Second result specimen body site is correct");
        Assert.isNull(result2.getSpecimen().getID(), "Second result specimen ID is correct");
        Assert.isTrue(result2.getValue().equals("Negative Result"), "Second result value is correct");
        Assert.isTrue(result2.getValueType().equals("String"), "Second result value type is correct");
        Assert.isNull(result2.getCompletionDateTime(), "Second result completionDateTime is correct");
        Assert.isNull(result2.getFileType(), "Second result file type is correct");
        Assert.isNull(result2.getUnits(), "Second result units is correct");
        Assert.isTrue(result2.getAbnormalFlag().equals("Normal"), "Second result abnormal flag is correct");
        Assert.isTrue(result2.getStatus().equals("Final"), "Second result status is correct");
        PrimaryResultsInterpreter res2PrimResInt = result2.getPrimaryResultsInterpreter();
        Assert.isNull(res2PrimResInt.getNPI(), "Second result primary results interpreter NPI is correct");
        Assert.isNull(res2PrimResInt.getID(), "Second result primary results interpreter ID is correct");
        Assert.isNull(res2PrimResInt.getIDType(), "Second result primary results interpreter IDType is correct");
        Assert.isNull(res2PrimResInt.getFirstName(), "Second result primary results interpreter FirstName is correct");
        Assert.isNull(res2PrimResInt.getLastName(), "Second result primary results interpreter LastName is correct");
        Assert.isNull(res2PrimResInt.getAddress().getStreetAddress(), "Second result primary results interpreter street address is correct");
        Assert.isNull(res2PrimResInt.getAddress().getCity(), "Second result primary results interpreter address city is correct");
        Assert.isNull(res2PrimResInt.getAddress().getState(), "Second result primary results interpreter address state is correct");
        Assert.isNull(res2PrimResInt.getAddress().getZIP(), "Second result primary results interpreter address ZIP is correct");
        Assert.isNull(res2PrimResInt.getAddress().getCounty(), "Second result primary results interpreter address County is correct");
        Assert.isNull(res2PrimResInt.getAddress().getCountry(), "Second result primary results interpreter address country is correct");
        Assert.isNull(res2PrimResInt.getPhoneNumber().getOffice(), "Second result primary results interpreter phone number is correct");
        Assert.isNull(res2PrimResInt.getLocation().getType(), "Second result primary results interpreter location type is correct");
        Assert.isNull(res2PrimResInt.getLocation().getFacility(), "Second result primary results interpreter location facility is correct");
        Assert.isNull(res2PrimResInt.getLocation().getDepartment(), "Second result primary results interpreter location department is correct");
        Assert.isNull(res2PrimResInt.getLocation().getRoom(), "Second result primary results interpreter location room is correct");
        Assert.isNull(result2.getReferenceRange().getLow(), "Second result reference range low is correct");
        Assert.isNull(result2.getReferenceRange().getHigh(), "Second result reference range high is correct");
        Assert.isNull(result2.getReferenceRange().getText(), "Second result reference range text is correct");
        Assert.isNull(result2.getObservationMethod().getCode(), "Second result observation method code is correct");
        Assert.isNull(result2.getObservationMethod().getCodeset(), "Second result observation method codeset is correct");
        Assert.isNull(result2.getObservationMethod().getDescription(), "Second result observation method description is correct");
        Performer res2performer = result2.getPerformer();
        Assert.isNull(res2performer.getID(), "Second result performer ID is correct");
        Assert.isNull(res2performer.getIDType(), "Second result performer ID Type is correct");
        Assert.isTrue(res2performer.getFirstName().equals("Bob"), "Second result perfomer first name is correct");
        Assert.isTrue(res2performer.getLastName().equals("Smith"), "Second result performer last name is correct");
        Assert.isTrue(res2performer.getCredentials().get(0).equals("MD"), "Second result credentials is correct");
        Assert.isNull(res2performer.getAddress().getStreetAddress(), "First result primary results interpreter street address is correct");
        Assert.isNull(res2performer.getAddress().getCity(), "Second result performer address city is correct");
        Assert.isNull(res2performer.getAddress().getState(), "Second result performer address state is correct");
        Assert.isNull(res2performer.getAddress().getZIP(), "Second result performer address ZIP is correct");
        Assert.isNull(res2performer.getAddress().getCounty(), "Second result performer address County is correct");
        Assert.isNull(res2performer.getAddress().getCountry(), "Second result performer address country is correct");
        Assert.isTrue(res2performer.getEmailAddresses().size() == 0, "Email addresses is empty");
        Assert.isNull(res2performer.getPhoneNumber().getOffice(), "First result primary results interpreter phone number is correct");
        Assert.isNull(res2performer.getLocation().getType(), "First result primary results interpreter location type is correct");
        Assert.isNull(res2performer.getLocation().getFacility(), "First result primary results interpreter location facility is correct");
        Assert.isNull(res2performer.getLocation().getDepartment(), "First result primary results interpreter location department is correct");
        Assert.isNull(res2performer.getLocation().getRoom(), "First result primary results interpreter location room is correct");

    }

    @Test
    public void testResults_Visit() {
        Visit visit = results.getVisit();
        Assert.notNull(visit, "Visit object not successfully created");
        Assert.isNull(visit.getVisitDateTime(), "VisitDateTime is correct");
        Assert.isNull(visit.getVisitNumber(), "VisitNumber is correct");
        Assert.isNull(visit.getAccountNumber(), "Account Number is correct");
        Assert.isNull(visit.getPatientClass(), "PatientClass is correct");
        Assert.isNull(visit.getLocation().getType(), "Visit location type is correct");
        Assert.isNull(visit.getLocation().getFacility(), "Visit location facility is correct");
        Assert.isNull(visit.getLocation().getDepartment(), "Visit location department is correct");
        Assert.isNull(visit.getLocation().getRoom(), "Visit location room is correct");
        Assert.isNull(visit.getAttendingProvider().getID(), "Visit Attending Provider ID is correct");
        Assert.isNull(visit.getAttendingProvider().getIDType(), "Visit Attending Provider ID type is correct");
        Assert.isNull(visit.getAttendingProvider().getFirstName(), "Visit Attending Provider first name is correct");
        Assert.isNull(visit.getAttendingProvider().getLastName(), "Visit Attending Provider last name is correct");
        Assert.isNull(visit.getAttendingProvider().getAddress().getStreetAddress(), "Visit Attending Provider street address is correct");
        Assert.isNull(visit.getAttendingProvider().getAddress().getCity(), "Visit Attending Provider city is correct");
        Assert.isNull(visit.getAttendingProvider().getAddress().getState(), "Visit Attending Provider state is correct");
        Assert.isNull(visit.getAttendingProvider().getAddress().getZIP(), "Visit Attending Provider zip is correct");
        Assert.isNull(visit.getAttendingProvider().getAddress().getCounty(), "Visit Attending Provider county is correct");
        Assert.isNull(visit.getAttendingProvider().getAddress().getCountry(), "Visit Attending Provider country is correct");
        Assert.isTrue(visit.getAttendingProvider().getEmailAddresses().size() == 0, "Email addresses is empty");
        Assert.isNull(visit.getAttendingProvider().getPhoneNumber().getOffice(), "Visit Attending Provider phone number is correct");
        Assert.isNull(visit.getAttendingProvider().getLocation().getType(), "Visit Attending Provider location type is correct");
        Assert.isNull(visit.getAttendingProvider().getLocation().getFacility(), "Visit Attending Provider location facility is correct");
        Assert.isNull(visit.getAttendingProvider().getLocation().getDepartment(), "Visit Attending Provider location department is correct");
        Assert.isNull(visit.getAttendingProvider().getLocation().getRoom(), "Visit Attending Provider location room is correct");
        Assert.isNull(visit.getReferringProvider().getID(), "Visit Referring Provider ID is correct");
        Assert.isNull(visit.getReferringProvider().getIDType(), "Visit Referring Provider ID type is correct");
        Assert.isNull(visit.getReferringProvider().getFirstName(), "Visit Referring Provider first name is correct");
        Assert.isNull(visit.getReferringProvider().getLastName(), "Visit Referring Provider last name is correct");
        Assert.isNull(visit.getReferringProvider().getAddress().getStreetAddress(), "Visit Referring Provider street address is correct");
        Assert.isNull(visit.getReferringProvider().getAddress().getCity(), "Visit Referring Provider city is correct");
        Assert.isNull(visit.getReferringProvider().getAddress().getState(), "Visit Referring Provider state is correct");
        Assert.isNull(visit.getReferringProvider().getAddress().getZIP(), "Visit Referring Provider zip is correct");
        Assert.isNull(visit.getReferringProvider().getAddress().getCounty(), "Visit Referring Provider county is correct");
        Assert.isNull(visit.getReferringProvider().getAddress().getCountry(), "Visit Referring Provider country is correct");
        Assert.isTrue(visit.getReferringProvider().getEmailAddresses().size() == 0, "Email addresses is empty");
        Assert.isNull(visit.getReferringProvider().getPhoneNumber().getOffice(), "Visit Referring Provider phone number is correct");
        Assert.isNull(visit.getReferringProvider().getLocation().getType(), "Visit Referring Provider location type is correct");
        Assert.isNull(visit.getReferringProvider().getLocation().getFacility(), "Visit Referring Provider location facility is correct");
        Assert.isNull(visit.getReferringProvider().getLocation().getDepartment(), "Visit Referring Provider location department is correct");
        Assert.isNull(visit.getReferringProvider().getLocation().getRoom(), "Visit Referring Provider location room is correct");
    }

}
