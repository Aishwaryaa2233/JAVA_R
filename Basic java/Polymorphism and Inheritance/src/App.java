public class App {
    public static void main(String[] args) throws Exception {
       
        /*String firstName,
                 String lastName, 
                 int registration, 
                 int age, 
                 int daysWorked, 
                 int vacationDaysTaken,
                 double salary, 
                 int yearsWorked, 
                 double salesMade */

       SalesRep s1=new SalesRep("A", "sss", 10, 30, 730, 05, 30000, 2, 30000);
       SalesRep s2=new SalesRep("B", "ss", 10, 30, 730, 05, 30000, 2, 20000);
       SalesRep s3=new SalesRep("C", "sss", 10, 30, 730, 05, 30000, 2, 50000);
    
       Salesmanager SM=new Salesmanager("MNG", "sss", 10, 30, 730, 05, 30000, 2, 30000,s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());
       SM.calculateComission();
    }   
}
