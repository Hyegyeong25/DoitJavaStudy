import java.util.Scanner;

public class Ex00_Multiple {
    public static void main(String[] args) {
        //입력받은 값 이하의 자연수 중 입력값 2의 배수 출력하기
        int a = 10;
        int multiple = 3;

        Scanner s = new Scanner(System.in);
        System.out.print("입력값 : ");
        a = s.nextInt();
        System.out.print("배수 입력 : ");
        multiple = s.nextInt();
        System.out.print(multiple+"의 배수는 : ");
        for(int i = 1; i<=a; i++){
            if(i%multiple == 0){
                if(a-multiple >= i)
                    System.out.print(i+", ");
                else
                    System.out.print(i);
            }
        }
    }
}
