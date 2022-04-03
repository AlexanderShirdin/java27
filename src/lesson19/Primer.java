package lesson19;

public class Primer {

    public static void main(String[] args) {

//        Account<String> acc1 = new Account<>("2334", 5000);
//        String acc1Id = acc1.getId();
//        System.out.println(acc1Id);
//
//        Account<Integer> acc2 = new Account<>(5523, 5000);
//        Integer acc2Id = acc2.getId();
//        System.out.println(acc2.getId());

        Accountable<String> acc1 = new Account("rwr2334", 5000);
        Account acc2 = new Account("2373", 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}

class Account <T>implements Accountable {

    private T id;
    private int sum;

    Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
