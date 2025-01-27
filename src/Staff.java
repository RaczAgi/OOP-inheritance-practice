public class Staff extends Person{
    protected String school;
    protected double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool(){
        return this.school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getpay(){
        return this.pay;
    }
    public void setpay(double pay){
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" +
                super.toString() +
                ", scool= " + school +
                ", pay= " + pay +
                ']';
    }
}
