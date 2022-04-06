package inheritance;

public class VIPCustomer extends Customer {

    /* 새 등급 VIP에게 필요한 것 */
    private double saleRatio; //제품 구매 할인율 10%
    private int agentID; //담당 전문 상담원 배정

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); //상위 클래스 호출
        customerGrade = "VIP";
        bonusRatio = 0.05; // 5%
        saleRatio = 0.1;
        this.agentID = agentID;

        System.out.println("VIPCustomer(int, String) 호출");
    }

    //가격 계산, 포인트 적립 + 할인
    //부모와 같은 클래스를 갖고 있으면서 새로 만드는게 메서드 오버라이딩인듯 하다
    //오버로딩 : 이름이 똑같은 메서드가 여러개
    //오버라이딩 : 덮어쓰다, 라이팅하다!
    public int calcPrice(int price){

        bonusPoint += price * bonusRatio; // 가격 * 보너스퍼센트
        return price - (int)(price * saleRatio);
    }
    public int getAgentID() {
        return agentID;
    }
}
