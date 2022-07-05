package chapterTwo;

public class Toptal {

    public static int solution(int downloadFile, int [] downloadPerMinute, int timeRemaining){

        int sum = 0;
        for (int i = 0; i < downloadPerMinute.length - 1; i++) {
            sum = sum + i;
        }
        if (downloadFile != sum) {
            int downloadRemaining = downloadFile - sum;
            for (int i = downloadPerMinute.length - timeRemaining; i < downloadPerMinute.length; i++) {
                int sumTwo = 0;
                sumTwo = sumTwo + downloadPerMinute[i];
                int t = sumTwo / timeRemaining;
                return downloadRemaining / t;
            }
        } else {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] array = {10, 6, 6, 8};

        System.out.println(solution(100, array, 2));
    }
}
