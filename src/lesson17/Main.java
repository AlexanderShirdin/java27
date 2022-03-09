package lesson17;

public class Main {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithApache copyWithApache = new CopyWithApache();
        CopyWithGuava copyWithGuava = new CopyWithGuava();
        CopyStream copyStream = new CopyStream();
        CopyChannel copyChannel = new CopyChannel();
        CopySE7 copySE7 = new CopySE7();

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

        long start5 = System.currentTimeMillis();
       copyStream.copy("D:\\Distribution\\Games\\WOLF3D BRUTAL.zip", "C:\\Users\\cptbl\\Desktop\\WOLF3D BRUTAL5.zip");
        long end5 = System.currentTimeMillis();
        System.out.println("Копирование с Stream: " + (end5 - start5));

        long start6 = System.currentTimeMillis();
        copyChannel.copy("D:\\Distribution\\Games\\WOLF3D BRUTAL.zip", "C:\\Users\\cptbl\\Desktop\\WOLF3D BRUTAL6.zip");
        long end6 = System.currentTimeMillis();
        System.out.println("Копирование с Chanel: " + (end6 - start6));

        long start7 = System.currentTimeMillis();
        copySE7.copy("D:\\Distribution\\Games\\WOLF3D BRUTAL.zip", "C:\\Users\\cptbl\\Desktop\\WOLF3D BRUTAL7.zip");
        long end7 = System.currentTimeMillis();
        System.out.println("Копирование с SE7: " + (end7 - start7));
    }
}