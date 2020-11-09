public class Hospital {
    private String hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    private int totalCovidPatients;
    private int totalAvailableRooms;
    private int totalAvailableTest;

    public Hospital(String hospitalId, String hospitalName, String hospitalAddress, int totalCovidPatients, int totalAvailableRooms, int totalAvailableTest) {
        this.hospitalId = hospitalId
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.totalCovidPatients = 0;
        this.totalAvailableRooms = 0;
        this.totalAvailableTest = 0;
    }

    public String select(String hospitalName) {
        return this.hospitalName;
    }
    
    public boolean displayHospital(){
        return this.hospitalName;
        return this.hospitalAddress
    }

    public boolean getHospitalDetails(){
        return this.totalCovidPatients;
        return this.totalAvailableRooms;
        return this.totalAvailableTest;
    }

}