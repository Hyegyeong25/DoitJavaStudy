import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList {
    public static void main(String[] args) {
        // List 준비
        List<String> list = Arrays.asList("A", "B", "C", "A", "B");
        // 중복 제거
        List<String> newList = list.stream().distinct().collect(Collectors.toList());
        // 결과 출력
        System.out.println(newList);
    }
}
