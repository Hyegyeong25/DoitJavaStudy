package Today0504;

import java.util.ArrayList;
import java.util.List;

public class Arraylist01 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        
        li.add("주혜경");
        li.add("김성현");
        li.add("김규린");
        li.add("박우정");
        li.add("김연");

        for(int i = 0; i < li.size(); i++){
            System.out.println(li.get(i));
        }


    }
}
