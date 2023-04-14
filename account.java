import java.util.Date;
/**
 *
 * @author yasmine
 */
public class account {
    private int id;
    private double balance,annualInterestRate;
    private Date dateCreated = new Date();
    Account(){
    }
    Account(int id,double balance){
     this.id=id;
     this.balance=balance;
    }
    public void setid(int id){
     if(id>0){
         this.id=id;
     }else{
         System.out.println("invalid ID");
     }
    } 
    public int getid(){
    return id;
    }
    public void setbalance(double balance){
    if(balance>0){
       this.balance=balance;
    }else{
        System.out.println("invalid Balance");
    }
    }
    public double getbalance(){
    return balance;
    }
    public void setannualInterestRate(double annualInterestRate){
     if(annualInterestRate>0){
       this.annualInterestRate=annualInterestRate;
     }else{
         System.out.println("invalid annual interest rate");
     }
    }
    public double getannualInterestRate(){
    return annualInterestRate;
    }
    public Date getdatecreated(){
     return dateCreated;
    }
    private double MonthlyInterestRate;
    public double getMonthlyInterestRate(){
      MonthlyInterestRate=(annualInterestRate/12)*100;
     return MonthlyInterestRate;
    }
    public double getMonthlyInterest(){
    return MonthlyInterestRate/100; 
    }
    public void withdraw(int num){
     if(balance>num){
      balance-=num;
     }else{
         System.out.println("not enough amount in balance");
     }
    }
    public void deposit(int num){
        balance+=num;
    }
}
