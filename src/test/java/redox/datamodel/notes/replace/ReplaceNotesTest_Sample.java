package redox.datamodel.notes.replace;

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
public class ReplaceNotesTest_Sample {

    private Replace replace;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:notes/replace/notes-replace.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        replace = mapper.readValue(content, Replace.class);
        Assert.notNull(replace, "Replace object not successfully created");
    }



    @Test
    public void testReplace_Meta() {
        Assert.notNull(replace.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testReplace_Patient() {
        Assert.notNull(replace.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testReplace_Visit() {
        Assert.notNull(replace.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testReplace_Note() {
        Assert.notNull(replace.getNote(), "Note object not successfully created");
    }

    @Test
    public void testReplace_Orders() {
        Assert.notNull(replace.getOrders(), "Orders object not successfully created");
    }}