package lesson16;

public class Main1 {
    public static void main(String[] args) {
        StringUtilImpl util = new StringUtilImpl();
        util.div("23", "3");

        double[] nums = null;
        try {
            nums = (util.findNumbers("ssdsdsdsd23dsadd343.232sdsd-656sdad"));
        } catch (CustomException e) {
            e.printStackTrace();
        }
        for (double d : nums) {
            System.out.println(d);
        }

        int[] words;
        words = (util.findWord("I768 love you soiopio much I love 887you so muchIlove you 678so much", "love"));
        for (int t : words) {
            System.out.println(t);
        }
    }
}
