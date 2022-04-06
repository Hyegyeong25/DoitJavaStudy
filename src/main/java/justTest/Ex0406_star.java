package justTest;

import java.util.Scanner;

public class Ex0406_star {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // 회전 전체
        int k = 0; //*찍기

        for(int i = 0; i < num; i++){ // 5
            if(i < num/2+1) {
                k++;
            } else {
                k--;
            }
            for(int j = 0; j < k; j++){ // 3
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
