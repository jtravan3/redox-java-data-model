package redox.datamodel.notes.newNotes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;
import redox.datamodel.notes.delete.Delete;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class NewNotesTest_Sample {

    private NewNotes newNotes;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:notes/new_notes/notes-new.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        newNotes = mapper.readValue(content, NewNotes.class);
        Assert.notNull(newNotes, "New object not successfully created");
    }


    @Test
    public void testNewNotes_Meta() {
        Assert.notNull(newNotes.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewNotes_Patient() {
        Assert.notNull(newNotes.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testNewNotes_Visit() {
        Assert.notNull(newNotes.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testNewNotes_Note() {
        Assert.notNull(newNotes.getNote(), "Note object not successfully created");
    }

    @Test
    public void testNewNotes_Orders() {
        Assert.notNull(newNotes.getOrders(), "Orders object not successfully created");
    }
}