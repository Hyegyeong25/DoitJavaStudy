package justTest;

public class Ex0407_star4 {
    public static void main(String[] args) {
/*
    *
   **
  ***
 ****
*****
*/
        for(int i = 0; i < 5; i++){

            for(int j = i; j < 5-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
