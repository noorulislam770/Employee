public class ShiftSuperVisor extends Employee{
    private boolean reachedProdGoals;
    private double empSalary;
    private final int BONUS  = 10000;

    

    ShiftSuperVisor(String name,double salary,boolean reachedProdGoals){
        super(name);
        this.reachedProdGoals = reachedProdGoals;
        this.empSalary = salary;
    }


    public static void main(String[] args) {
        ShiftSuperVisor s = new ShiftSuperVisor("Adnan", 2324, true);
        System.out.println("reached prod goals : " + s.isReachedProdGoals());
        s.calculateYearlySalary();
    }

    
    void calculateYearlySalary(){
        double totalSalary;
        System.out.println("\nCalculating Yearly Salary");
        System.out.println("mothly salary : " + this.empSalary);
        System.out.println("Yearly salary : " + this.empSalary * 12);
        System.out.println("Reaced Production goals : " + this.reachedProdGoals);
        if (this.reachedProdGoals == true){
            totalSalary = empSalary * 12 + this.BONUS;
            System.out.println("Additional Salary " + this.BONUS);

        }else{
            System.out.println("No Early Bonus work hard next time.");
            totalSalary  = empSalary * 12;
        }
        System.out.println("Total Yearly Salary : " + (totalSalary));
    }


    public boolean isReachedProdGoals() {
        return this.reachedProdGoals;
    }

    public void setReachedProdGoals(boolean reachedProdGoals) {
        this.reachedProdGoals = reachedProdGoals;
    }

    public double getEmpSalary() {
        return this.empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

}