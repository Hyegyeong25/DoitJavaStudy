package justTest;
import java.util.Scanner;

public class Ex0407_star5 {
    public static void main(String[] args) {
/*
  *
 ***
*****

i - j - k
0 - 1(j<4-0) - 0(k<2*0+1) >> 공백 3개 출력, 별 1개 출력
1 - 0(j<3-1) - 0(k<2*1+1) >> 공백 2개 출력, 별 3개 출력
2 - 0(j<3-2) - 0(k<2*2+1) >> 공백 1개 출력, 별 5개 출력
3 - 0(j<3-3) => 실행 안됨 - 0(k<2*3+1) >> 공백 실행 안됨, 별 7개 출력
* */

//for(int i = 0; i < 4; i++) {
//    for(int j = 0; j < 3-i; j++){
//        System.out.printf(" ");
//    }
//    for(int k = 0; k < (2*i)+1; k++) {
//        System.out.print("*");
//    }
//    System.out.println();
//}

        Scanner scan = new Scanner(System.in);
        System.out.printf("피라미드 층 수 입력 : ");
        int num = scan.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 1; j < num-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j < i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
