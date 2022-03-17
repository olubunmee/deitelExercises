package chapterTwo;

import java.math.BigDecimal;
public class TwoPointThreeFour{

    public static void main(String[] args){

    long worldPopulation = 7_874_965_825L;

    double growthRate = 1.05 / 100;

    double growthRateNumber1 = growthRate * worldPopulation;

    long growthRate1 = (long)(growthRateNumber1 + worldPopulation);

    System.out.printf("Estimated world population Year 1 is %d%n", growthRate1);

    double growthRateNumber2 = growthRate * growthRate1;

    long growthRate2 = (long)(growthRateNumber2 + growthRate1);

    System.out.printf("Estimated world population Year 2 is %d%n", growthRate2);

    double growthRateNumber3 = growthRate * growthRate2;

    long growthRate3 = (long)(growthRateNumber3 + growthRate2);

    System.out.printf("Estimated world population Year 3 is %d%n", growthRate3);

    double growthRateNumber4 = growthRate * growthRate3;

    long growthRate4 = (long)(growthRateNumber4 + growthRate3);

    System.out.printf("Estimated world population Year 4 is %d%n", growthRate4);

    double growthRateNumber5 = growthRate * growthRate4;

    long growthRate5 = (long)(growthRateNumber5 + growthRate4);

    System.out.printf("Estimated world population Year 5 is %d%n", growthRate5); 

    }

}
