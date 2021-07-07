class employee {


    public void display_salary()
    {
      
    }
}


class manager extends employee {

    int prf,tax,incentive,baseSalaryOfManager;
          manager( int baseSalaryManager, int pf, int tax,int incentive) {
          this.baseSalaryManager=baseSalaryOfManager;
          this.prf=pf;
          this.tax=tax;
          this.incentive=incentive;
    }



    public void display_salary() {
      int totSalary=baseSalaryOfManager-(prf+tax)+ incentive;

        System.out.println("NetSalary of this Manager is:"totSalary+);
    }
}

 class labour extends employee {
      int baseSalaryLabour,prf,tax,overtime;
      labour(int pf,int tax,int overtime,int baseSalaryOfLabour) {
      this.baseSalaryLabour=baseSalaryOfLabour;
      this.prf=pf;
      this.tax=tax;
      this.overtime=overtime;
    }


    public void display_salary() {
      int totSalary=baseSalaryOfLabour-(prf+tax)+ overtime;

        System.out.println(" Labour salary is: "+totSalary+);
    }
}
public class program_start {
    public static void main(String[] args) {

      employee em=new employee();
      em.display_salary();
        manager man=new manager(26000,2500,800,2000);
        man.display_salary();
        labour lab = new labour(15000,2000,500,700);
        lab.display_salary();



    }
}