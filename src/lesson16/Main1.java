package lesson16;

public class Main1 {
    public static void main(String[] args) {
        StringUtilImpl util = new StringUtilImpl();
//        util.div("23", "3");
        double[] nums = null;
        try {
            nums = (util.findNumbers("ssdsdsdsd23dsadd343.232sdsd-656sdad"));
        } catch (CustomException e) {
            e.printStackTrace();
        }
        for(double d:nums){
            System.out.println(d);
        }

    }
}
