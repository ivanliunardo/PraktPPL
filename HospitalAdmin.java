public class HospitalAdmin {
    private String adminName;
    private String email;
    private String orderList; 
    private Text testResult;
    private boolean roomStatus;
    private boolean fileVerified;

    public HospitalAdmin(String adminName, String email, String orderList, Text testResult, boolean roomStatus, boolean fileVerified ) {
        this.adminName = adminName;
        this.email = email;
        this.orderList = orderList;
        this.testResult = testResult;
        this.fileVerified = true;
        this.roomStatus = true;
    }

    public Text sendTestResult() {
        return this.testResult;
    }
    
    public boolean verifyFiles(){
        return this.fileVerified;
    }

    public boolean updateRoomStatus(){
        return this.roomStatus;
    }

}