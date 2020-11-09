public class Order {
    private String orderId;
    private String dateCreated;
    private String patientName; 
    private String patientId;
    private String orderType;
    

    public HospitalAdmin(String orderId, String dateCreated, String patientName, String patientId, String orderType) {
        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.patientName = patientName;
        this.patientId = patientId;
        this.orderType = orderType;
    }

    public String displayOrder(){
        return this.orderId;
        return this.dateCreated;
        return this.patientName;
        return this.patientId;
        return this.orderType;
    }

}