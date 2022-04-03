package lesson20;

public class TestStaticClass {
    public static void main(String[] args) {

      Car car = new Car ("Blue", "Lada", 200);
        System.out.println(car);


        Car.Engine car1 = car.new Engine(400);

    }
}

class Car {
    static String color;
    private String marka;
    Engine engine;

    public Car(String color, String marka, int hoursPower) {
        this.color = color;
        this.marka = marka;
        this.engine = this.new Engine(hoursPower);
    }

    static void print(){
        System.out.println("I am static method");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", marka='" + marka + '\'' +
                ", engine=" + engine +
                '}';
    }

    class Engine {
        int hoursPower;
        static double aDouble;

        public Engine(int hoursPower) {
            this.hoursPower = hoursPower;
            System.out.println(color);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "hoursPower=" + hoursPower +
                    '}';
        }
    }
}