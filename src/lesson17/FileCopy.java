package lesson17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Distribution\\Games\\WOLF3D BRUTAL.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\cptbl\\Desktop\\WOLF3D BRUTAL.zip"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}