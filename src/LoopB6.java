public class LoopB6 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
