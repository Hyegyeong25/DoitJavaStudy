package inheritance;

class Tv {
    boolean power; //전원 상태
    int channel; //채널

    void power() { power = !power; }
    void channelUP() { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends Tv {
    boolean caption; //캡션 상태
    void displayCaption(String text) {
        if(caption){ //캡션 상태가 on 일때만 text 를 보여 준다.
            System.out.println(text);
        }
    }
}
class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();

        ctv.channel = 10;
        ctv.channelUP(); //Tv에 있는 함수 썼음
        System.out.println(ctv.channel); // 11

        ctv.displayCaption("java extends test"); // 출력 안됨
        ctv.caption = true; //캡션 켰음
        ctv.displayCaption("caption test on");

    }
}
