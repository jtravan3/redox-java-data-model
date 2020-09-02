package redox.media.newmedia;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
public class NewMediaTest_Timothy {

    private NewMedia newMedia;

    @Before
    public void initialize() throws IOException {
        Path filePath = ResourceUtils.getFile("classpath:media/new_media/redox-example-media-new-timothy.json").toPath();
        String content = Files.readString(filePath, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        newMedia = mapper.readValue(content, NewMedia.class);
        Assert.notNull(newMedia, "NewMedia object not successfully created");
    }



    @Test
    public void testNewMedia_Meta() {
            Assert.notNull(newMedia.getMeta(), "Meta object not successfully created");
    }

    @Test
    public void testNewMedia_Patient() {
        Assert.notNull(newMedia.getPatient(), "Patient object not successfully created");
    }

    @Test
    public void testNewMedia_Visit() {
        Assert.notNull(newMedia.getVisit(), "Visit object not successfully created");
    }

    @Test
    public void testNewMedia_Media() {
        Assert.notNull(newMedia.getMedia(), "Media object not successfully created");
    }
}