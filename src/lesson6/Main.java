package lesson6;

public class Main {
    public static void main(String[] args) {
        int count = StringUtils.countGlassFromText("kffdjk sdljf sjasl djasld jass");
        System.out.println(count);

        int count2 = StringUtils.countGlassFromText("qwqytwqweqeewrqreqwt");
        System.out.println(count2);

        StringUtils.printTextByWords("dbvkdbkd? j, .kdvhsjdbnk fjvkfn");

        StringUtils.coding("dDDDgfgfhtjjh hgtk.,78f90r");
    }
}