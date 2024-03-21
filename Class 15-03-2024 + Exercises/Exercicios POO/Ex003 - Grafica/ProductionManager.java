public class ProductionManager extends Managers {
    public String sector; 
    public String[] productionEmployees;
    public double[] orders; 
    public String department; 

    public ProductionManager (
        String sector, 
        String[] productionEmployees, 
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
        this.productionEmployees = productionEmployees; 
        this.orders = orders;
        this.department = department; 

    }

}
