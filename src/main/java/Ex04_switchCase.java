import java.util.Scanner;

public class Ex04_switchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("메달을 입력하세요 : ");
        String medal = s.nextLine();
        medal = medal.toLowerCase(); //전부 소문자로 치환
        switch(medal) {
            case "gold" : {
                System.out.println("금메달입니다.");
                break;
            }
            case "silver" : {
                System.out.println("은메달입니다.");
                break;
            }
            case "bronze" : {
                System.out.println("동메달입니다.");
                break;
            }
            default: {
                System.out.println("메달이 없습니다.");
                break;
            }
        }
    }
}
