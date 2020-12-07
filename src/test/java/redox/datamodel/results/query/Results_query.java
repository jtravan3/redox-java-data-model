package redox.datamodel.results.query;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.common.Identifier;
import redox.datamodel.common.Meta;
import redox.datamodel.common.Patient;
import redox.datamodel.results.newResults.Results;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class Results_query {

    private Query query;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:results/query/query.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        query = mapper.readValue(content, Query.class);
        Assert.notNull(query, "Query object not successfully created");
    }

    @Test
    public void testResults_Meta() {
            Meta meta = query.getMeta();
        Assert.notNull(meta, "Meta object not successfully created");
        Assert.isTrue(meta.getDataModel().equals("Results"), "DataModel is correct");
        Assert.isTrue(meta.getEventType().equals("Query"), "EventType is correct");
        Assert.isTrue(meta.getEventDateTime().equals("2020-11-05T19:32:15.691Z"), "EventDateTime is correct");
        Assert.isTrue(meta.getTest(), "Test is correct");
        Assert.isTrue(meta.getDestinations().get(0).getID().equals("af394f14-b34a-464f-8d24-895f370af4c9"), "Destination ID is correct");
        Assert.isTrue(meta.getDestinations().get(0).getName().equals("Redox EMR"), "Destination Name is correct");
        Assert.isNull(meta.getFacilityCode(), "Facility Code is correct");
    }

    @Test
    public void testResults_Patients() {
        Assert.notNull(query.getPatients(), "Patient object not successfully created");
        Identifier identifier = query.getPatients().get(0).getIdentifiers().get(0);
        Assert.isTrue(identifier.getID().equals("000000001"), "Patient identifier ID iss correct");
        Assert.isTrue(identifier.getIDType().equals("MRN"), "Patient ID Type is correct");
    }

    @Test
    public void testResults_Completion() {
        Assert.notNull(query.getCompletion(), "Orders object not successfully created");
        Assert.isTrue(query.getCompletion().getStartDateTime().equals("2015-05-06T06:00:00.000Z"), "Completion StartDateTime is correct");
        Assert.isTrue(query.getCompletion().getEndDateTime().equals("2015-05-06T07:00:00.000Z"), "Completion enddatetime is correct");
    }

    @Test
    public void testResults_ResultStatuses() {
        Assert.notNull(query.getResultStatuses(), "Visit object not successfully created");
        Assert.isTrue(query.getResultStatuses().get(0).equals("Final"), "Result Statuses is correct");
    }

    @Test
    public void testResults_OrderIDs() {
        Assert.notNull(query.getOrderIDs(), "Order IDs object not successfully created");
        Assert.isTrue(query.getOrderIDs().get(0).equals("123"), "First order ID correct");
        Assert.isTrue(query.getOrderIDs().get(1).equals("456"), "Second order ID correct");
        Assert.isTrue(query.getOrderIDs().get(2).equals("789"), "Third order ID correct");
    }

    @Test
    public void testResults_Procedures() {
        Assert.notNull(query.getProcedures(), "Procedures object not successfully created");
        Assert.isTrue(query.getProcedures().size() == 0, "Procedures object is correct");
    }

}
