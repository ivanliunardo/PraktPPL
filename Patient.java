public class Patient {
    private String patientName;
    private String address;
    private String email;
    private String phoneNumber; 
    private String creditcardNumber;
    private String testInfo;
    private String roomInfo;

    public Patient(String patientName, String address, String email, String phoneNumber, String creditcardNumber, String testInfo, String roomInfo) {
        this.patientName = patientName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.creditcardNumber = creditcardNumber;
        this.testInfo = testInfo;
        this.roomInfo = roomInfo;
    }

    public String displayProfile() {
        return this.patientName;
        return this.address;
        return this.email;
        return this.phoneNumber;
        return this.creditcardNumber;
    }
    

    public boolean displayInfo(){
        return this.testInfo;
        return this.roomInfo;
    }

}