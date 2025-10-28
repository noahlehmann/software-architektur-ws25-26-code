import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        var path = Path.of("access.log");
        try (var stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }
    }
}