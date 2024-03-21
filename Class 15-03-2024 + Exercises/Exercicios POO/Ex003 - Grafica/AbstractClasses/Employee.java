abstract class Employee extends User{

    protected int idEmployee;  
    protected String nameEmployee; 
    protected String salaryEmployee; 
    protected String dateHireEmployee;  
    protected String addressEmployee; 
    protected String phoneEmployee; 
    protected Boolean adminPermission = false;
    
    public Employee(
         String nameEmployee, 
         String salaryEmployee, 
         String dateHireEmployee,  
         String addressEmployee, 
         String phoneEmployee,
         Boolean adminPermission
    ) {
        this.nameEmployee = nameEmployee; 
        this.salaryEmployee = salaryEmployee; 
        this.dateHireEmployee = dateHireEmployee; 
        this.addressEmployee = addressEmployee;
        this.phoneEmployee = phoneEmployee; 
    }



    public int getIdEmployee() {
        return idEmployee;
    }
        
    public String getNameEmployee() {
        return nameEmployee;
    }
    
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }
    
    public String getSalaryEmployee() {
        return salaryEmployee;
    }
    
    public void setSalaryEmployee(String salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
    
    public String getDateHireEmployee() {
        return dateHireEmployee;
    }
    
    public void setDateHireEmployee(String dateHireEmployee) {
        this.dateHireEmployee = dateHireEmployee;
    }
    
    public String getAddressEmployee() {
        return addressEmployee;
    }
    
    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }
    
    public String getPhoneEmployee() {
        return phoneEmployee;
    }
    
    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }
    
    public Boolean getAdminPermission() {
        return adminPermission;
    }
    
    public void setAdminPermission(Boolean adminPermission) {
        this.adminPermission = adminPermission;
    } 
}
