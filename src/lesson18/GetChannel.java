package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
    public static void main(String[] args) throws IOException {
        // Запись в файл:
        FileChannel fc = new FileOutputStream("C://Users//cptbl//Downloads//data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        // Добавление в конец файла:
        fc = new RandomAccessFile("C://Users//cptbl//Downloads//data.txt", "rw").getChannel();
        fc.position(fc.size()); // Переходим в конец
        fc.write(ByteBuffer.wrap(" Some more".getBytes()));
        fc.close();
        // Чтение файла:
        fc = new FileInputStream("C://Users//cptbl//Downloads//data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(1024);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining())
            System.out.print((char) buff.get());
    }
}