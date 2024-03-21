public class SalesManager extends Managers{
    public String sector; 
    public String[] salesEmployees;
    public double[] orders; 
    public String department;

    public SalesManager(
        String sector, 
        String[] salesEmployees, 
        double[] orders, 
        String department,
        int idManager, 
        String nameManager,
        double salaryManager,   
        String dateHireManager, 
        String addressManager, 
        String phoneManager
        ) {
            
        super(idManager, nameManager, salaryManager, dateHireManager, addressManager, phoneManager);
        this.sector = sector; 
        this.salesEmployees = salesEmployees; 
        this.orders = orders;
        this.department = department; 

    }
}
