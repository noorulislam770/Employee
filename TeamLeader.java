public class TeamLeader extends ProductionWorker {


    public static void main(String[] args) {
        TeamLeader inam = new TeamLeader("inam", 1, 2001, 22, 70);
        System.out.println("Training Done Successfully : " + inam.hasAttendedTraining());
        inam.getMonthlySalary();
        System.out.println("TeamLeader Shift : " + inam.getShift());
    }


    
    private final int hoursRequired = 20;
    private final int monthlyBounusAmount = 1200;
    private int attendedHours;
    private int workHours;

    TeamLeader(String name, int shift, int payRate,int attendedHours,int workHours){
        super(name, shift, payRate);
        this.attendedHours = attendedHours;
        this.workHours= workHours;
        
    }

    void getMonthlySalary(){
        double monthlySalary = workHours * this.getPayRate() * 30 + monthlyBounusAmount;
        System.out.println("TeamLeader Mothly Salry : " + monthlySalary );
        
    }

    boolean hasAttendedTraining(){
        if (this.attendedHours >= this.hoursRequired){
            return true;
        }
        else return false;
    }







    public int getMonthlyBounusAmount() {
        return this.monthlyBounusAmount;
    }


    public int getAttendedHours() {
        return this.attendedHours;
    }

    public void setAttendedHours(int attendedHours) {
        this.attendedHours = attendedHours;
    }
    
}