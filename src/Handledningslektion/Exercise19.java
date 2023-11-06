package Handledningslektion;

public class Exercise19 {

    public static void main(String[] args) {

        double timeWorkedWeek = 45;
        double hourlyPay = 142;

        if (timeWorkedWeek > 40) {
            double overTime = timeWorkedWeek - 40;
            double overTimePay = overTime * 1.5;
            double finalPay = (40 + overTimePay) * hourlyPay;
            System.out.println("our total pay: " + finalPay);
        }else {
            System.out.println("Our total pay: " + (40*hourlyPay));
        }
    }
}
