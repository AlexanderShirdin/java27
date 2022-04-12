package project1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PTM ptm = new PTM(2303700, 7.941, 58, 6, 650000, 11);
        PTM ptm2 = new PTM(2303700, 7.941, 58, 6, 100000, 4);
        ptm.monthlyPayment();
    }
}

class PTM implements CreditCalculator {
    Integer LoanAmount;
    Double InterestRate;
    Integer LengthOfLoan;

    Integer BeginningOfPeriod;

    Integer EarlyPayment;
    Integer EarlyPaymentMonth;

    public PTM(Integer loanAmount, Double interestRate, Integer lengthOfLoan, Integer beginningOfPeriod, Integer earlyPayment, Integer earlyPaymentMonth) {
        LoanAmount = loanAmount;
        InterestRate = interestRate / 100;
        LengthOfLoan = lengthOfLoan;

        EarlyPayment = earlyPayment;

        BeginningOfPeriod = beginningOfPeriod - 1;
        EarlyPaymentMonth = earlyPaymentMonth;
    }


//    @Override
//    public String toString() {
//        return "Ежемесячный платеж = " + Math.round(((LoanAmount * Math.pow((1 + InterestRate / 12), LengthOfLoan)) * InterestRate / 12) / (Math.pow((1 + InterestRate / 12), LengthOfLoan) - 1)) +
//                " Проценты = " + Math.round(InterestRate / 12 * LoanAmount) +
//                " Основной долг = " + Math.round(((LoanAmount * Math.pow((1 + InterestRate / 12), LengthOfLoan)) * InterestRate / 12) / (Math.pow((1 + InterestRate / 12), LengthOfLoan) - 1) - (InterestRate / 12 * LoanAmount));
//    }

    @Override
    public double monthlyPayment() {
        List<String> mountly = new ArrayList<>();

        List<Number> one = new ArrayList<>();
        List<Number> two = new ArrayList<>();
        List<Number> three = new ArrayList<>();
        List<Number> four = new ArrayList<>();

        List<Number> five = new ArrayList<>();

        double paymentForLoan= (((LoanAmount * Math.pow((1 + InterestRate / 12), LengthOfLoan)) * InterestRate / 12) / (Math.pow((1 + InterestRate / 12), LengthOfLoan) - 1));
        double debtPayment = (((LoanAmount * Math.pow((1 + InterestRate / 12), LengthOfLoan)) * InterestRate / 12) / (Math.pow((1 + InterestRate / 12), LengthOfLoan) - 1) - (InterestRate / 12 * LoanAmount));
        double remainingDebt = (LoanAmount - debtPayment);
        double paymentForInterest = (InterestRate / 12 * LoanAmount);

        one.add(Math.round(paymentForInterest));
        two.add(Math.round(debtPayment));
        three.add(Math.round(remainingDebt));
        four.add(Math.round(paymentForLoan));

        int numberOfMonths = 0;
        int year = 2021;

        for (int i = 0; i < LengthOfLoan; i++) {

            numberOfMonths++;
            paymentForInterest = InterestRate / 12 * remainingDebt;
            debtPayment = (paymentForLoan - paymentForInterest);
            remainingDebt = remainingDebt - debtPayment;

            mountly.add("Январь " + year);
            mountly.add("Февраль " + year);
            mountly.add("Март " + year);
            mountly.add("Апрель " + year);
            mountly.add("Май " + year);
            mountly.add("Июнь " + year);
            mountly.add("Июль " + year);
            mountly.add("Август " + year);
            mountly.add("Сентябрь " + year);
            mountly.add("Октябрь " + year);
            mountly.add("Ноябрь " + year);
            mountly.add("Декабрь " + year);
            year++;


            one.add(Math.round(paymentForInterest));
            two.add(Math.round(debtPayment));
            four.add(Math.round(paymentForLoan));
            five.add(0);

            if (five.size() == EarlyPaymentMonth-1) {
                five.add(EarlyPaymentMonth-1, EarlyPayment);
                remainingDebt = remainingDebt - EarlyPayment;
                paymentForLoan= (((remainingDebt * Math.pow((1 + InterestRate / 12), LengthOfLoan-EarlyPaymentMonth)) * InterestRate / 12) / (Math.pow((1 + InterestRate / 12), LengthOfLoan-EarlyPaymentMonth) - 1));
            }

            three.add(Math.round(remainingDebt));
            System.out.println((numberOfMonths) + " | " + mountly.get(i + BeginningOfPeriod) + " | " + four.get(i) + " | " + one.get(i) + " | " + two.get(i) + " | " + three.get(i) + " | " + five.get(i));
        }
        return 0;
    }
}