package lesson14;

public class Main1 {
    public static void main(String[] args) {
        MultiMapImpl<String, String> telContacts = new MultiMapImpl<>();
        System.out.println(telContacts.countValues("Василий"));
        telContacts.put("Василий", "+7985565488");
        telContacts.put("Василий", "+3487384333");
        telContacts.put("Василий", "+5675896785");
        telContacts.put("Георгий", "+7938728374");
        telContacts.put("Георгий", "+7214115451");
        System.out.println(telContacts.countValues("Георгий"));
        System.out.println(telContacts.countValues("Василий"));
        System.out.println(telContacts.get("Василий"));

    }
}
