import java.util.Scanner;

public class Ex00_star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = 0;

        for(int i=0; i<2*a-1; i++){
            if(i<a){
                b++;
            } else {
                b--;
            }
            for(int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
