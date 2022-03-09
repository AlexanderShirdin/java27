package lesson17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyChannel implements CopyUtils {
    @Override
    public void copy(String from, String to) {
        FileChannel original = null;
        FileChannel copied = null;
        try {
            original = new FileInputStream(from).getChannel();
            copied = new FileOutputStream(to).getChannel();
            copied.transferFrom(original, 0, original.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}