package lesson17;

import java.io.*;

public class CopyStream implements CopyUtils {

    @Override
    public void copy(String from, String to) {
        InputStream original = null;
        OutputStream copied = null;
        try {
            original = new FileInputStream(from);
            copied = new FileOutputStream(to);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = original.read(buffer)) > 0) {
                copied.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
