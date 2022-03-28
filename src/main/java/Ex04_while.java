public class Ex04_while {
    public static void main(String[] args){
        int num = 1;
        int sum = 0;

        while(num <= 10){
            sum += num; // sum = 1 + 2 + 3 ...
            num++; // num이 올라가야 루프에서 빠져나올 수 있다.
        }
        System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
    }
}
