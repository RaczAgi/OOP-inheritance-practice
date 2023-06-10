public class Staff {
    protected String school;
    protected double pay;

    public Staff(String name, String address, String school, double pay){
        super();
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
        return super.toString();
    }
}
