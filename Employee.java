import java.util.Date;
import java.util.Random;

class Employee {
    private String name;
    private String empNum;
    private Date hireDate;




    public Employee(String name){
        this.name = name;
        this.hireDate = new Date();
        this.empNum = generateEmpNum();
    }

    static String generateEmpNum(){
        String letters = "ABCDEFGHIJKLM";
        Random rand = new Random();

        String strings;
        int firstDigit  = rand.nextInt(10);
        int secondDigit = rand.nextInt(10);
        int thirdDigit  = rand.nextInt(10);

        char c = letters.charAt(rand.nextInt(letters.length()));

        strings = firstDigit + secondDigit + thirdDigit + "-" + c;
        return strings;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpNum() {
        return this.empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getHireDate() {
        return this.hireDate.toString();
    }




}