import static org.junit.Assert.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testTestFile() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("https://something.com", "some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testTestTwo() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testTestThree() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testTestFour() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testTestFive() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testTestSix() throws IOException {
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testTestSeven() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testTestEight() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("a link on the first line");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testExtraChar() throws IOException {
        Path fileName = Path.of("ExtraChar.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("https://osu.ppy.sh/");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFarApart() throws IOException {
        Path fileName = Path.of("FarApart.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testImage() throws IOException {
        Path fileName = Path.of("Image.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("https://osu.ppy.sh/");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void failingTest() {
        assertEquals(1, 1 + 1);
    }
}