package justTest;

public class Ex0408_star {
    public static void main(String[] args) {
/*

*
**
***
**
*

*/
        int k = 0;

        for(int i = 0; i < 5; i++) {
            if(i < (5/2)+1){
                k++;
            } else {
                k--;
            }
            for(int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
