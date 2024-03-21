public class Product {
    protected int idProduct; 
    protected String nameProduct; 
    protected double unitaryProductPrice = 30; 
    
    public int getIdProduct() {
        return this.idProduct; 
    } 

    public String getNameProduct() {
        return this.nameProduct; 
    }

    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct; 
    }

    public double getUnitaryProductPrice() {
        return this.unitaryProductPrice; 
    }

    public void setUnitaryProductPrice(double unitaryProductPrice) {
        this.unitaryProductPrice = unitaryProductPrice; 
    } 
}
