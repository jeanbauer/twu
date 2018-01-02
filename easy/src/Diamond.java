public class Diamond {
    public static void main(String[] args) {
        int n = 3;

        for(int i = 1; i <= n; i++) {
            for(int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }

            System.out.println("");

            // WIP
        }
    }
}
