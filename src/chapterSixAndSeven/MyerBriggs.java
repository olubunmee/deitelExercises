package chapterSixAndSeven;

import java.util.Scanner;

public class MyerBriggs {


    static Scanner input = new Scanner(System.in);
    static int extrovert = 0;
    static int introvert = 0;
    static int sensor = 0;
    static int intuitive = 0;
    static int feeler = 0;
    static int thinker = 0;
    static int judger = 0;
    static int perceiver = 0;

    public static void questionOne() {
        System.out.println("""
                1.
                A expend energy, enjoy groups
                B conserve energy, enjoy one-on-one""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A")) extrovert++;
        else introvert++;
    }
    public static void questionTwo(){
        System.out.println("""
                2.
                A interpret literally
                B look for meaning and possibilities""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))sensor++;
        else intuitive++;
    }
    public static void questionThree(){
        System.out.println("""
                3.
                A logical, thinking, questioning
                B empathetic, feeling, accommodating""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))thinker++;
        else feeler++;
    }
    public static void questionFour(){
        System.out.println("""
                4.
                A organised, orderly
                B flexible, adaptable""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))judger++;
        else perceiver++;
    }
    public static void questionFive() {
        System.out.println("""
                5.
                A more outgoing, think out loud
                B more reserved, think to yourself""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))extrovert++;
        else introvert++;
    }
    public static void questionSix() {
        System.out.println("""
                6.
                A practical, realistic, experiential
                B imaginative, innovative, theoretical""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))sensor++;
        else intuitive++;
    }
    public static void questionSeven() {
        System.out.println("""
                7.
                A candid, straight forward, frank
                B tactful, kind, encouraging""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))thinker++;
        else feeler++;
    }
    public static void questionEight() {
        System.out.println("""
                8.
                A plan, schedule
                B unplanned, spontaneous""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))judger++;
        else perceiver++;
    }
    public static void questionNine() {
        System.out.println("""
                9.
                A seek many tasks, public activities, interaction with others
                B seek private, solitary activities with quiet to concentrate""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))extrovert++;
        else introvert++;
    }
    public static void questionTen() {
        System.out.println("""
                10.
                A standard, usual, conventional
                B different, novel, unique""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))sensor++;
        else intuitive++;
    }
    public static void questionEleven() {
        System.out.println("""
                11.
                A firm, tend to criticize, hold the line
                B gentle, tend to appreciate, conciliate""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))thinker++;
        else feeler++;
    }
    public static void questionTwelve() {
        System.out.println("""
                12.
                A regulated, structured
                B easygoing, "live" and "let live""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))judger++;
        else perceiver++;
    }
    public static void questionThirteen() {
        System.out.println("""
                13.
                A external, communicative, express yourself
                B internal, reticent, keep to yourself""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))extrovert++;
        else introvert++;
    }
    public static void questionFourteen() {
        System.out.println("""
                14.
                A focus on here-and-now
                B look to the future, global perspective, "big picture""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))sensor++;
        else intuitive++;
    }
    public static void questionFifteen() {
        System.out.println("""
                15.
                A tough-minded, just
                B tender-hearted, merciful""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))thinker++;
        else feeler++;
    }
    public static void questionSixteen() {
        System.out.println("""
                16.
                A preparation, plan ahead
                B go with the flow, adapt as you go""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))judger++;
        else perceiver++;
    }
    public static void questionSeventeen() {
        System.out.println("""
                17.
                A active, initiate
                B reflective, deliberate""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))extrovert++;
        introvert++;
    }
    public static void questionEighteen() {
        System.out.println("""
                18.
                A facts, things, "what is
                B ideas, dreams, "what could be", philosophical""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))sensor++;
        else intuitive++;
    }
    public static void questionNineteen() {
        System.out.println("""
                19.
                A matter of fact, issue-oriented
                B sensitive, people-oriented, compassionate""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))thinker++;
        else feeler++;
    }
    public static void questionTwenty() {
        System.out.println("""
                20.
                A control, govern
                B latitude, freedom""");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("A"))judger++;
        else perceiver++;
    }

    public static void result(){
        if (extrovert > introvert)
            System.out.println("E");
        else System.out.println("I");

        if (sensor > intuitive)
            System.out.println("S");
        else System.out.println("N");

        if (thinker > feeler)
            System.out.println("T");
        else System.out.println("F");

        if (judger > perceiver)
            System.out.println("J");
        else System.out.println("P");
    }


}
