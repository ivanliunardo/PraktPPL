public class Test {
    private String testId;
    private String testType;
    private int price;

    public Test(String testId, String testType, int price ) {
        this.testId = testId;
        this.testType = testType;
        this.price = 0;
    }

    public String selectTest() {
        return this.testId;
        return this.testType;
        return this.price;
    }

}