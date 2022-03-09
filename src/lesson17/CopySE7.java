package lesson17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopySE7 implements CopyUtils {

    @Override
    public void copy(String from, String to) {
        File copied = new File(to);
        File original = new File(from);
        try {
            Files.copy(original.toPath(), copied.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
