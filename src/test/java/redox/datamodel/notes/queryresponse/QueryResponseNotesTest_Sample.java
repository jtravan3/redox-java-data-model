package redox.datamodel.notes.queryresponse;

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
public class QueryResponseNotesTest_Sample {

    private QueryResponse queryResponse;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:notes/queryresponse/notes-query-response.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        queryResponse = mapper.readValue(content, QueryResponse.class);
        Assert.notNull(queryResponse, "Query Response object not successfully created");
    }



    @Test
    public void testQueryResponse_Meta() {
            Assert.notNull(queryResponse.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testQueryResponse_Notes() {
        Assert.notNull(queryResponse.getNotes(), "Notes object not successfully created");
    }

   }