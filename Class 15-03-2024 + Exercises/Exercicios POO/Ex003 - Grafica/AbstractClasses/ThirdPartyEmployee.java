
abstract class ThirdPartyEmployee {

    protected int idThirdPartyEmployee;
    protected String thirdPartyCompany;
    protected String thirdPartyEmployeeName;
    protected String jobPeriod;
    protected double thirdPartyEmployeeSalary;
    protected Boolean adminPermission = false;

    public int getIdThirdPartyEmployee() {
        return idThirdPartyEmployee;
    }

    public String getThirdPartyCompany() {
        return thirdPartyCompany;
    }

    public void setThirdPartyCompany(String thirdPartyCompany) {
        this.thirdPartyCompany = thirdPartyCompany;
    }

    public String getThirdPartyEmployeeName() {
        return thirdPartyEmployeeName;
    }

    public void setThirdPartyEmployeeName(String thirdPartyEmployeeName) {
        this.thirdPartyEmployeeName = thirdPartyEmployeeName;
    }

    public String getJobPeriod() {
        return jobPeriod;
    }

    public void setJobPeriod(String jobPeriod) {
        this.jobPeriod = jobPeriod;
    }

    public double getThirdPartyEmployeeSalary() {
        return thirdPartyEmployeeSalary;
    }

    public void setThirdPartyEmployeeSalary(double thirdPartyEmployeeSalary) {
        this.thirdPartyEmployeeSalary = thirdPartyEmployeeSalary;
    }

    public Boolean getAdminPermission() {
        return adminPermission;
    }

    public void setAdminPermission(Boolean adminPermission) {
        this.adminPermission = adminPermission;
    }

}

// Class EmpregadoTerceirizado
// - ID
// - EmpresaTerceirizada
// - Nome
// - PeriodoTrabalho
// - Salario
// - Permissões Administrativas: false;