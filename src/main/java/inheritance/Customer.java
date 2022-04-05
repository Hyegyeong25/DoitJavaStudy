package inheritance;

public class Customer { //extends Object
    //protected 속성 : 상속 관계에서 접근 가능하게 함
    protected int customerID; //아이디
    protected String customerName; //이름
    protected String customerGrade; //등급
    int bonusPoint; // 포인트
    double bonusRatio; // 포인트 비율

    //고객 클래스
    /*
    public Customer() {
        super(); //상위 클래스 호출, 어떻게? 모든 자바 클래스는 상위에 Object 클래스를 갖고 있음
        customerGrade = "SILVER"; //기본등급 실버
        bonusRatio = 0.01;

        System.out.println("Customer() 호출");
    }*/

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) 호출");
    }

    //가격 계산, 포인트 적립
    public int calcPrice(int price){

        if(customerGrade == "SILVER") {
            bonusPoint += price * bonusRatio; // 가격 * 보너스퍼센트
        }
        return price;
    }

    //정보 출력
    public String showCustomerInfo() {
        return customerName + "님의 등급은 "+customerGrade+"이며, " +
                "보너스 포인트는 " + bonusPoint + " 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
