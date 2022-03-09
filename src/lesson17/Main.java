package lesson17;

public class Main {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithApache copyWithApache = new CopyWithApache();
        CopyWithGuava copyWithGuava = new CopyWithGuava();

        long start1 = System.currentTimeMillis();
        copyWithOneByte.copy("D:\\Distribution\\Games\\WOLF3D BRUTAL.zip", "C:\\Users\\cptbl\\Desktop\\WOLF3D BRUTAL1.zip");
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с IO: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        copyWithNio.copy("D:\\Distribution\\Games\\WOLF3D BRUTAL.zip", "C:\\Users\\cptbl\\Desktop\\WOLF3D BRUTAL2.zip");
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование с NIO: " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        copyWithApache.copy("D:\\Distribution\\Games\\WOLF3D BRUTAL.zip", "C:\\Users\\cptbl\\Desktop\\WOLF3D BRUTAL3.zip");
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование с Apache: " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        copyWithGuava.copy("D:\\Distribution\\Games\\WOLF3D BRUTAL.zip", "C:\\Users\\cptbl\\Desktop\\WOLF3D BRUTAL4.zip");
        long end4 = System.currentTimeMillis();
        System.out.println("Копирование с Guava: " + (end4 - start4));
    }
}