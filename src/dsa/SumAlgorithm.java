package dsa;

public class SumAlgorithm {
    static int[] firstSet = {3, 1, 7, 9};
    static int[] secondSet = {2, 4, 1, 9, 3};
    static int[] setOne = {12, 13, 6, 10};
    static int [] setTwo = {13, 10, 16, 15};

    public static void main(String[] args) {
        firstQuestion();
        secondQuestion();
    }

    public static void firstQuestion() {
        int sum = 0;
        for (int i = 0; i < firstSet.length; i++) {
            for (int j = 0; j < secondSet.length; j++) {
                if (firstSet[i] != secondSet[j]){
                    sum = firstSet[i] + secondSet[j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void secondQuestion() {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < setOne.length; i++) {
            for (int j = 0; j < setTwo.length; j++) {
                if (setOne[i] == setTwo[j]){
                    total = setOne[i] + setOne[i];
                    sum += total;
                }
            }
        }
        System.out.println(sum);
    }
}
// join two sets and sort?
