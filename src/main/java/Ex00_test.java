import java.util.Scanner;

public class Ex00_test {
    public static void main(String[] args) {
        //더하기 사이클
        Scanner s = new Scanner(System.in);

        System.out.print("(0~99) 정수 입력 : ");
        int n = s.nextInt();
        int num;
        int cnt=1;

        if(n>=0 && n <=99){
            if(n < 10){
                n *= 10;
            }
            num = n;
            while(true) {
                int ten = num / 10;
                int one = num % 10;
                int hap = ten+one;

                if(hap >= 10) {
                    hap %= 10; //1의자리
                }
                int newNum = (one*10)+hap;
                if(newNum == n){
                    break;
                } else {
                    num = newNum;
                    cnt++;
                }
            }
            System.out.println(cnt);
        } else {
            System.out.println("정수 범위 미만 또는 초과");
        }
    }
}
