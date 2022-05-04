package justTest;

import java.util.Scanner;

public class Ex0408_star2 {
    public static void main(String[] args) {
/*
  *
 ***
*****
 ***
  *

  조건 : 5줄 입력받기
  공백 for문 / 별 for문

* */
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = scan.nextInt();
        int k = 1;

        for(int i = 0; i < num; i++) {
           if(i > 0 && i < (num/2) + 1){
               k+=2;
           } else {
               k-=2;
           }
            for(int j = 1; j < num-i; j++) {
                System.out.print("@");
            }
            for(int j = 0; j < k; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

