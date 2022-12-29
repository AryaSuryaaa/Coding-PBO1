public class Student extends Person{
    public String npm;
    public Student() {
        super("SomeName", "SomeAddress");
        //Merupakan nilai default dan turunan dari constructor parent class
        this.npm = npm;
    }

    public int getNPM() {
        System.out.print("NPM : ");
        return Integer.parseInt(npm);
    }
    public void setNPM(int npm) {
        this.npm = String.valueOf(npm);
    }
}

