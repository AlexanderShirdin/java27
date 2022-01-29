package lesson8;

public class Main1 {
    public static void main(String[] args) {
        Proizvoditel dell = new Proizvoditel();
        dell.setName("DELL");
        dell.setPathToImage("https://msk.metro-cc.ru/");

        User user = new User();
        user.setName("Пришелец");
        user.setPathToAvatar("https://prostomac.com/wp-content/uploads/2022/01/Universal-Control-guide-0.jpg");
        user.setRate(160);

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setRate(5);
        otziv.setText("Отличная работа, буду советовать");

        Tovar tovar = new Tovar();
        tovar.setId(121223);
        tovar.setPrice(14990);
        tovar.setName("Камера заднего вида Digma DCV-110");
        tovar.addOtziv(otziv);
        tovar.setProizvoditel(dell);
    }
}
