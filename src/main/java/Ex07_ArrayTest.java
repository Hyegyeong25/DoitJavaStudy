public class Ex07_ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[] {0, 1, 2}; //선언 + 초기화
        int[] numbers2 = new int[3]; //값 없을땐 공간 지정
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        int[] numbers3; //선언만
        numbers3 = new int[3];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        System.out.println("numbers의 길이 : "+numbers.length);
        for(int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
    }
}
