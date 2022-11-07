import java.util.Scanner;

public class D221107 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[31];

        for (int i = 1; i < 29; i++) {
            int num = s.nextInt();
            arr[num] = 1;
            System.out.println(num+":"+arr[num]);
        }
        System.out.println("----------");
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != 1){
                System.out.println(i);
            }
        }
    }
}
