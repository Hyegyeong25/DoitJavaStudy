package Today0504;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setlist01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("주혜경");
        set.add("김성현");
        set.add("김규린");
        set.add("박우정");
        set.add("김연");

        for(String name : set){
            System.out.println(name);
        }

        
    }
}
