package justTest;

public class Ex0406_star2 {
    public static void main(String[] args) {

/*
(기본)
 *
 **
 ***
 ****
 ******

i값이 오르는 만큼 j가 올라서 출력됨

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

 */
/*
 *****
 ****
 ***
 **
 *
 역순 출력
 */
        for(int i = 0; i < 5; i++){
            for(int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
