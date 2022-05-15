package chapterFourAndFive;

public class PrintTriangle {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 6; i++) {

        }
    }

    public static String areYouPlayingBanjo(String name) {
        if (name.startsWith("R")) return name + " plays banjo";
        else if (name.startsWith("r")) { return name + " does not play banjo";
        }
        else
        return name + "plays banjo";
    }
}
