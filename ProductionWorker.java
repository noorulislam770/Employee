public class ProductionWorker extends Employee{
 
    private int shift;
    private double payRate;


    public ProductionWorker(String name, int shift,double payRate){
        super(name);
        this.payRate = payRate;
        this.shift = shift;
    }


    public static void main(String[] args) {
        ProductionWorker p = new ProductionWorker("Inam", 2, 13423);
        System.out.println("Payrate : " + p.payRate);
        System.out.println("shift   : " + p.getShift());
    }




    public String getShift() {
        if (this.shift == 1){
            return "Day";
        }else{
            return "Night";
        }
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    

}