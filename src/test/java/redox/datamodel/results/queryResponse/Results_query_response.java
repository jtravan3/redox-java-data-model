package redox.datamodel.results.queryResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.common.Identifier;
import redox.datamodel.common.Meta;
import redox.datamodel.common.Patient;
import redox.datamodel.common.Provider;
import redox.datamodel.results.common.Order;
import redox.datamodel.results.common.Performer;
import redox.datamodel.results.common.PrimaryResultsInterpreter;
import redox.datamodel.results.common.Result;
import redox.datamodel.results.newResults.Results;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class Results_query_response {

    private QueryResponse queryResponse;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:results/queryResponse/query-response.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        queryResponse = mapper.readValue(content, QueryResponse.class);
        Assert.notNull(queryResponse, "Results object not successfully created");
    }

    @Test
    public void testResults_Meta() {
        Meta meta = queryResponse.getMeta();
        Assert.notNull(meta, "Meta object not successfully created");
        Assert.isTrue(meta.getDataModel().equals("Results"), "Data Model is correct");
        Assert.isTrue(meta.getEventType().equals("QueryResponse"), "Event Type is correct");
        Assert.isTrue(meta.getEventDateTime().equals("2020-11-05T19:32:15.691Z"), "Event Date Time is correct");
        Assert.isTrue(meta.getTest(), "Test is correct");
        Assert.isTrue(meta.getSource().getID().equals("7ce6f387-c33c-417d-8682-81e83628cbd9"), "Source ID is correct");
        Assert.isTrue(meta.getSource().getName().equals("Redox Dev Tools"), "Source Name is correct");
        Assert.isTrue(meta.getDestinations().get(0).getID().equals("af394f14-b34a-464f-8d24-895f370af4c9"), "Destination ID is correct");
        Assert.isTrue(meta.getDestinations().get(0).getName().equals("Redox EMR"), "Destination name is correct");
        long messageID = 5565;
        Assert.isTrue(meta.getMessage().getID().equals(messageID), "Message ID is correct");
        long transmissionID = 12414;
        Assert.isTrue(meta.getTransmission().getID().equals(transmissionID), "Transmission ID is correct");
        Assert.isNull(meta.getFacilityCode(), "Facility Code is correct");
    }

    @Test
    public void testResults_Orders() {
        Order order = queryResponse.getOrders().get(0);
        Assert.notNull(queryResponse.getOrders(), "Orders object not successfully created");
        Identifier identifier = order.getPatient().getIdentifiers().get(0);
        Assert.isTrue(identifier.getID().equals("000000001"), "Patient ID is correct");
        Assert.isTrue(identifier.getIDType().equals("MRN"), "Patient IDType is correct");
        Assert.isTrue(order.getVisit().getVisitNumber().equals(1234567), "Visit Number is correct");
        Assert.isTrue(order.getID().equals("157968300"), "ID is correct");
        Assert.isNull(order.getApplicationOrderID(), "ApplicationOrderID is correct");
        Assert.isTrue(order.getTransactionDateTime().equals("2015-05-06T06:00:58.872Z"), "Transaction Date Time is correct");
        Assert.isTrue(order.getCollectionDateTime().equals("2015-05-06T06:00:58.872Z"), "Collection Date Time is correct");
        Assert.isTrue(order.getCompletionDateTime().equals("2015-05-06T06:00:58.872Z"), "Completion Date TIme is correct");
        Assert.isTrue(order.getResultsStatus().equals("Final"), "ResultsStatus is correct");
        Assert.isTrue(order.getProcedure().getCode().equals("49086-2"), "Procedure code is correct");
        Assert.isNull(order.getProcedure().getCodeset(), "Procedure codeset is correct");
        Assert.isTrue(order.getProcedure().getDescription().equals("First trimester maternal screen with nuchal translucency panel"), "Procedure description is correct");
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

}
