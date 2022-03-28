public class Ex04_doWhile {
    public static void main(String[] args){
        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++; //최소 1번은 실행한다.
        } while(num < 1); //실행 안됨
        System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
    }
}
