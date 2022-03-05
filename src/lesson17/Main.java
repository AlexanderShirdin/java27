package lesson17;

public class Main {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithApache copyWithApache = new CopyWithApache();
        CopyWithGuava copyWithGuava = new CopyWithGuava();

        long start1 = System.currentTimeMillis();
        copyWithOneByte.copy("C:\\Users\\cptbl\\Desktop\\Sacral women\\Массаж гуаша.mp4", "C:\\Users\\cptbl\\Desktop\\Массаж гуаша(copy).mp4");
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с IO: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        copyWithNio.copy("C:\\Users\\cptbl\\Desktop\\Sacral women\\Массаж гуаша.mp4", "C:\\Users\\cptbl\\Desktop\\Массаж гуаша(copy2).mp4");
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование с NIO: " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        copyWithApache.copy("C:\\Users\\cptbl\\Desktop\\Sacral women\\Массаж гуаша.mp4", "C:\\Users\\cptbl\\Desktop\\Массаж гуаша(copy3).mp4");
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование с Apache: " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        copyWithGuava.copy("C:\\Users\\cptbl\\Desktop\\Sacral women\\Массаж гуаша.mp4", "C:\\Users\\cptbl\\Desktop\\Массаж гуаша(copy4).mp4");
        long end4 = System.currentTimeMillis();
        System.out.println("Копирование с Guava: " + (end4 - start4));
    }
}