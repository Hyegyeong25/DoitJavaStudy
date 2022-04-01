package hiding;

class BirthDay {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month == 2) {
            if (day < 1|| day > 28){
                System.out.println("날짜 오류입니다.");
            }
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class BirthDayTest {

    // 하나의 파일에 class를 여러개 사용하는 것은 가능
    // 그러나 public class는 하나여야한다.
    public static void main(String[] args) {
        BirthDay day = new BirthDay();

        day.setDay(30);
        day.setMonth(2);
        day.setYear(2018);
    }
}