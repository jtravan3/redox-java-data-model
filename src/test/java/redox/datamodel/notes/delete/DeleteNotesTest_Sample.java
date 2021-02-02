package redox.datamodel.notes.delete;

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
public class DeleteNotesTest_Sample {

    private Delete delete;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:notes/delete/notes-delete.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        delete = mapper.readValue(content, Delete.class);
        Assert.notNull(delete, "Delete object not successfully created");
    }


    @Test
    public void testDelete_Meta() {
        Assert.notNull(delete.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testDelete_Patient() {
        Assert.notNull(delete.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testDelete_Visit() {
        Assert.notNull(delete.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testDelete_Note() {
        Assert.notNull(delete.getNote(), "Note object not successfully created");
    }

    @Test
    public void testDelete_Orders() {
        Assert.notNull(delete.getOrders(), "Orders object not successfully created");
    }
}