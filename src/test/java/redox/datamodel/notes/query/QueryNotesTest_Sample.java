package redox.datamodel.notes.query;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.media.newmedia.NewMedia;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class QueryNotesTest_Sample {

    private Query query;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:notes/query/notes-query.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        query = mapper.readValue(content, Query.class);
        Assert.notNull(query, "Query object not successfully created");
    }



    @Test
    public void testQuery_Meta() {
            Assert.notNull(query.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testQuery_Patients() {
        Assert.notNull(query.getPatients(), "Patients object not successfully created");
    }

    @Test
    public void testQuery_VisitNumbers() {
        Assert.notNull(query.getVisitNumbers(), "Visit Numbers object not successfully created");
    }

    @Test
    public void testQuery_DocumentTypes() {
        Assert.notNull(query.getDocumentTypes(), "Document Types object not successfully created");
    }

    @Test
    public void testQuery_DocumentIDs() {
        Assert.notNull(query.getDocumentIDs(), "Document IDs object not successfully created");
    }
}