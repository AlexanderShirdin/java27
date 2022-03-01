package lesson14;

import java.util.Iterator;

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

//        for (Iterator<String> iter = telContacts.valuesIterator("Василий");iter.hasNext();){
//            System.out.println(iter.next());
//        }

//        for(String tel:telContacts.values()){
//            System.out.println(tel);
//        }
        System.out.println(telContacts.countValues("Василий"));
        telContacts.remove("Василий");
//        System.out.println(telContacts.get("Василий"));
        System.out.println(telContacts.countValues("Василий"));
//        telContacts.clear();
    }
}