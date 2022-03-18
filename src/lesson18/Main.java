package lesson18;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File startDir = new File("C://Users//cptbl//Downloads//2");
        if (!startDir.exists()) {
            try {
                startDir.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File download = new File("C://Users//cptbl//Downloads");
        File[] files = download.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                if (pathname.getName().endsWith(".mp4") || pathname.getName().endsWith(".mp4")) {
                    return true;
                }
                return false;
            }
        });
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
    }
}