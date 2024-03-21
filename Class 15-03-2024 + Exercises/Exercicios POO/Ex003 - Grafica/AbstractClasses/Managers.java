abstract class Managers extends User {
    protected int idManager; 
    protected String nameManager;
    protected double salaryManager;   
    protected String dateHireManager; 
    protected String addressManager; 
    protected String phoneManager; 
    protected Boolean adminPermission = true;

    public Managers(
        int idManager, 
        String nameManager,
        double salaryManager,   
        String dateHireManager, 
        String addressManager, 
        String phoneManager
    ) {
        this.idManager = idManager; 
        this.nameManager = nameManager; 
        this.salaryManager = salaryManager; 
        this.dateHireManager = dateHireManager; 
        this.addressManager = addressManager; 
        this.phoneManager = phoneManager;
    }
    
    public int getIdManager() {
        return idManager;
    }

    public void setIdManger(int idManager) {
        this.idManager = idManager; 
    }
        
    public String getNameManager() {
        return nameManager;
    }
    
    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }
    
    public double getSalaryManager() {
        return salaryManager;
    }
    
    public void setSalaryManager(double salaryManager) {
        this.salaryManager = salaryManager;
    }
    
    public String getdateHireManager() {
        return dateHireManager;
    }
    
    public void setdateHireManager(String dateHireManager) {
        this.dateHireManager = dateHireManager;
    }
    
    public String getAddressManager() {
        return addressManager;
    }
    
    public void setAddressManager(String addressManager) {
        this.addressManager = addressManager;
    }
    
    public String getPhoneManager() {
        return phoneManager;
    }
    
    public void setPhoneManager(String phoneManager) {
        this.phoneManager = phoneManager;
    }
    
    public Boolean getAdminPermission() {
        return adminPermission;
    }
    
    public void setAdminPermission(Boolean adminPermission) {
        this.adminPermission = adminPermission;
    } 

    // protected Role role; 
}


