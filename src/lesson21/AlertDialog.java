package lesson21;

public class AlertDialog {

    private String title;
    private String message;
    private String icon;

    public AlertDialog(String title, String message, String icon) {
        this.title = title;
        this.message = message;
        this.icon = icon;
    }

    public void show() {
        System.out.println(this);
    }

    static Builder newBuilder(){
        return new Builder(null);
    }

    @Override
    public String toString() {
        return "AlertDialog{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    static class Builder {

        private String title;
        private String message;
        private String icon;

        public Builder(Object o) {
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
        }

        public AlertDialog build(){
            return new AlertDialog(title, message, icon);
        }
    }
}

class Main {
    public static void main(String[] args) {
//        AlertDialog alertDialog = new AlertDialog.Builder(null)
//                .setTitle("Pattern Builder")
//                .setMessage("Hello pattern builder")
//                .setIcon("path to icon")
//                .build();

        AlertDialog alertDialog1 = AlertDialog.newBuilder().setIcon("Pattern Builder")
                .setTitle("Hello pattern builder").setMessage("path to icon").build();

        alertDialog1.show();
    }
}