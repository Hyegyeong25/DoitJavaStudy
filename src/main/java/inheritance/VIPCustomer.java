package inheritance;

public class VIPCustomer extends Customer {

    /* 새 등급 VIP에게 필요한 것 */
    private double saleRatio; //제품 구매 할인율 10%
    private int agentID; //담당 전문 상담원 배정

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName); //상위 클래스 호출
        customerGrade = "VIP";
        bonusRatio = 0.05; // 5%
        saleRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 호출");
    }

    public int getAgentID() {
        return agentID;
    }
}
