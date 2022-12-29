public class Employee extends Person{
    private String status;
    public Employee() {
        super("someNames", "someAddress");
        this.status = status;
    }

    public String getStatus() {
        System.out.print("Status : ");
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}

