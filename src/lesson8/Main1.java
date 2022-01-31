package lesson8;

public class Main1 {
    public static void main(String[] args) {
        Proizvoditel dell = new Proizvoditel();
        dell.setName("DELL");
        dell.setPathToImage("https://c.dns-shop.ru/thumb/st4/fit/148/110/14b342854431f5becc1b89bed5ff3a3d/q95_ea23d2c34c4b38d81e093f96c156c6451319e08631258b1b6c0af51e006d5803.png");

        User user = new User();
        user.setName("Пришелец");
        user.setRate(160);
        user.setPathToAvatar("https://c.dns-shop.ru/thumb/st1/crop/300/300/ed0faa3982c4814aa7ec1507c76b6476/bb6fa769bbe393c849a725fde858008447abd5d70bc1309ef92fa65760f39295.png");

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setRate(5);
        otziv.setText("Отлично работает, буду советовать");

        Tovar tovar = new Tovar();
        tovar.setId(121223);
        tovar.setPrice(14990);
        tovar.setName("Камера заднего вида Digma DCV-110");
        tovar.addOtziv(otziv);
        tovar.setProizvoditel(dell);
        System.out.println();
    }
}
