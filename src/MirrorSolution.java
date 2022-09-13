public class MirrorSolution {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        line();
        topHalf();
        bottomHalf();
        line();
    }

    public static void topHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 1; space <= ( line * -2 + (2 * SIZE)); space++) {
                System.out.print(" ");  // note we used print and NOT println
            }
            System.out.print("<>");
            for (int dot = 1; dot <= ( line * 4 - 4 ); dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= ( line * -2 + (2 * SIZE)); space++) {
                System.out.print(" ");  // note we used print and NOT println
            }
            System.out.println("|");
        }
    }

    public static void bottomHalf() {
        for (int line = SIZE; line >= 1; line--) {  // note:  this is the same as the topHalf but the loop runs backward
            System.out.print("|");
            for (int space = 1; space <= ( line * -2 + (2 * SIZE)); space++) {
                System.out.print(" ");  // note we used print and NOT println
            }
            System.out.print("<>");
            for (int dot = 1; dot <= ( line * 4 - 4 ); dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= ( line * -2 + (2 * SIZE)); space++) {
                System.out.print(" ");  // note we used print and NOT println
            }
            System.out.println("|");
        }
    }

    public static void line() {
        System.out.print("#");
        for (int i = 0; i < SIZE*4; i++) {  // Start at zero and make the test < SIZE * 4 [SIZE=3,12   =4, 16    =6,24]
            System.out.print("=");
        }
        System.out.println("#");
    }
}