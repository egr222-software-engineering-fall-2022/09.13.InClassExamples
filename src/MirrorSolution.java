public class MirrorSolution {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        border();
        topHalf();
        bottomHalf();
        border();
    }

    public static void topHalf() {
        for (int line = 1; line <= SIZE; line++) {
            bodyPattern(line);
        }
    }
    public static void bottomHalf() {
        for (int line = SIZE; line >= 1; line--) {  // note:  this is the same as the topHalf but the loop runs backward
            bodyPattern(line);
        }
    }

    public static void border() {
        System.out.print("#");
        printString("=", 4*SIZE); // Prints equals
//        for (int i = 0; i < SIZE*4; i++) {  // Start at zero and make the test < SIZE * 4 [SIZE=3,12   =4, 16    =6,24]
//            System.out.print("=");
//        }
        System.out.println("#");
    }

    public static void bodyPattern(int line) {
        System.out.print("|");
        printString(" ", line * -2 + (2*SIZE)); // Prints spaces
//        for (int space = 1; space <= ( line * -2 + (2 * SIZE)); space++) {
//            System.out.print(" ");  // note we used print and NOT println
//        }
        System.out.print("<>");
        printString(".", line * 4 - 4); 	 // Prints dots
//        for (int dot = 1; dot <= ( line * 4 - 4 ); dot++) {
//            System.out.print(".");
//        }
        System.out.print("<>");
        printString(" ", line * -2 + (2*SIZE)); // Prints spaces
//        for (int space = 1; space <= ( line * -2 + (2 * SIZE)); space++) {
//            System.out.print(" ");  // note we used print and NOT println
//        }
        System.out.println("|");
    }

    private static void printString(String str, int n){
        for (int i = 1 ; i <= n ; i++)
            System.out.print(str);
    }
}