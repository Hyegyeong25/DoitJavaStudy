import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = scan.nextInt();

        if(num%15==0){
            System.out.println("3과 5를 모두 만족하는 값입니다.");
        } else if(num%3==0) {
            System.out.println("입력한 값은 3의 배수 입니다.");
        } else if(num%5==0) {
            System.out.println("입력한 값은 5의 배수 입니다.");
        } else {
            System.out.println("입력한 값은 모두 충족하지 않습니다.");
        }
    }
}
