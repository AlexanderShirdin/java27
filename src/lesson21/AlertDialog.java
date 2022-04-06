package lesson21;

public class AlertDialog {
    private String title;

    public AlertDialog(String title) {
        this.title = title;
    }

    public void show(){
        System.out.println(this);
    }

    static Builder newBuilder(){
        return new Builder(null);
    }

    static class Builder {

        private String title;

        public Builder(Object o) {

        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;

        }

        public AlertDialog build() {
            return new AlertDialog(title);
        }
    }
}

class Main {
    public static void main(String[] args) {




    }
}

