public class Ex07_ArrayTest2 {
    public static void main(String[] args){
        double[] num = new double[5]; // 5칸의 공간 생성
        int size = 0;

        num[0] = 10.0; size++;
        num[1] = 20.0; size++;
        num[2] = 30.0; size++;

        double total = 1;

        for(int i = 0; i < size; i++){
            //size는 현재 값이 들어있는 개수만 셈 -> 3번 돌아감
            //num.length로 하면 비어있는 num[3], num[4]를 합친 5번이 돌아감
            System.out.println(num[i]);
            total *= num[i]; // total = total * num[i];
        }
        System.out.println("total은 : " + total);
    }
}
