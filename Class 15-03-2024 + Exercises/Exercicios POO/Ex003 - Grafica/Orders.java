public class Orders {
    
    protected int idOrder; 
    protected Product product; 
    protected String dateTimeEmission;     
    protected String dateTimeConclusion;
    protected double quantityOrder;  

    public int getIdOrder() {
        return idOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDateTimeEmission() {
        return dateTimeEmission;
    }

    public void setDateTimeEmission(String dateTimeEmission) {
        this.dateTimeEmission = dateTimeEmission;
    }

    public String getDateTimeConclusion() {
        return dateTimeConclusion;
    }

    public void setDateTimeConclusion(String dateTimeConclusion) {
        this.dateTimeConclusion = dateTimeConclusion;
    }

    public double getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(double quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public double calcFullPrice(int productUnitaryPrice) {
        return this.quantityOrder * productUnitaryPrice; 
    }
}

