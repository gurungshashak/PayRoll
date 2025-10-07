package pluralsight;

public class Payroll {
    private int id;
    private String name;
    private double hourWorked;
    private double payRate;

   public  Payroll(){
       this.id=0;
       this.name="";
       this.hourWorked=0;
       this.payRate=0;
   }




    //gets sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getHourWorked() {
        return hourWorked;
    }
    public void setHourWorked(double hourWorked) {
        this.hourWorked = hourWorked;
    }

    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
