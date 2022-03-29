import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class random {
    public static void main(String[] args) {
        String[][] jo = new String[][] {
                {"허지혜", "주혜경", "김연", "김원집", "김다운"},
                {"김지태", "김규린", "최여진", "김성현", "이정훈"},
                {"고동준", "김도원", "윤서준", "홍세민", "박선우"},
                {"양준서", "최상호", "박수호", "양주홍", "김성택"},
                {"강석현", "권오근", "박우정", "이호준", "공석"},
                {"김예진", "하재형", "신경석", "임현석", "최윤성"}
        };

        String[][] newTeam = new String[6][6];
        for(int i=0; i < 6; i++) {
            double randomValue = Math.random();
            int intValue = (int)(randomValue * 4);
            if(jo[i][intValue] == "공석") {
                intValue = (int)(randomValue * 3);
                System.out.println("변경 될 사람은 "+jo[i][intValue]);
            } else {
                System.out.println("변경 될 사람은 "+jo[i][intValue]);
            }
            newTeam[i][0]= i+"";
            newTeam[i][1]=jo[i][intValue];
            jo[i][intValue] = "NULL";
        }

        double randomValue2 = Math.random();
        int newIntValue = (int)(randomValue2 * 5)+1;
        System.out.println(newIntValue+"칸 이동");

        for (int v = 0; v < newTeam[0].length; v++){
            if((Integer.parseInt(newTeam[v][0])+1+newIntValue) > 6) {
                newTeam[v][0] = ((Integer.parseInt(newTeam[v][0])+1+newIntValue) - 6)+"";
            } else {
                newTeam[v][0] = ((Integer.parseInt(newTeam[v][0])+1+newIntValue))+"";
            }
            System.out.println(newTeam[v][1]+" : "+newTeam[v][0]+"조");
        }
    }
}
