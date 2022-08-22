package chapterTwo;

import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class LongestSubString {


    public static void main(String[] args) {

        int triple = (IntStream.rangeClosed(1, 20).filter(x -> x % 2 == 1).map(x -> x * x * x).sum());
        System.out.println(triple);

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String [] m = input.split(" ");
        List<String> list = Stream.of(m).sorted().distinct().toList();
        System.out.println(list);
    }
}
