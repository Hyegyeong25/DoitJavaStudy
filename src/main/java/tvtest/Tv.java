package tvtest;

public class Tv {
    //Tv의 속성(멤버변수)
    String color; //색상
    boolean power; //전원상태(on/off)
    int channel; //채널

    //Tv의 기능(메서드)
    void power(){ power = !power; } //Tv on/off
    void channelUP(){ ++channel; } // channel UP
    void channelDown(){ --channel; } // channel Down
}
