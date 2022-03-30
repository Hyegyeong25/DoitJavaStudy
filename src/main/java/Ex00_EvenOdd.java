import java.util.Scanner;

public class Ex00_EvenOdd {
    public static void main(String[] args) {
        // 정수의 짝/홀수판단
        Scanner s = new Scanner(System.in);
        System.out.println("---- 정수의 홀/짝 판단 ----");
        System.out.print("정수 입력 : ");
        int num = s.nextInt();

        if(num%2==0){
            System.out.println(num+"은/는 짝수입니다.");
        } else {
            System.out.println(num+"은/는 홀수입니다.");
        }

    }
}
