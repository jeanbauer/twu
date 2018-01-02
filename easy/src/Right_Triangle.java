public class Right_Triangle {
    public static void main(String[] args){
        int rows = 3;
        int x = 1;

        while(rows > 0) {
            String line = "";
            for(int i = 0; i < x; i++) {
                line += "*";
            }
            x++; rows--;
            System.out.println(line);
        }
    }
}
