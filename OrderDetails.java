public class OrderDetails {
    private String orderId;
    private String testId;
    private String testType;
    private String roomId;

    public OrderDetails(String orderId, String testId, String testType, String roomId ) {
        this.orderId = orderId;
        this.testId = testId;
        this.testType = testType;
        this.roomId = roomId;
    }
    
    public String displayOrderDetails(){
        return this.orderId;
        return this.testId;
        return this.testType;
        return this.roomId;
    }    

}