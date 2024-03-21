public class Invoice {

    private int itemID; 
    private String itemDescription; 
    private int itemQuantity; 
    private double unitaryPrice; 

    public Invoice(
        int itemId, 
        String itemDescription, 
        int itemQuantity, 
        double unitaryPrice
    ) {

        this.itemID = itemId; 
        this.itemDescription = itemDescription; 

        if (itemQuantity <= 0 ) {
            this.itemQuantity = 0; 
        
        } else {
            this.itemQuantity = itemQuantity; 
        }

        if (unitaryPrice <= 0) {
            unitaryPrice = 0; 
        
        } else {
            this.unitaryPrice = unitaryPrice; 
        }

    }

    public int getItemId() {
        return this.itemID; 
    }

    public void setItemId(int newItemId) {
        this.itemID = newItemId; 
    }

    public String getItemDescription() {
        return this.itemDescription; 
    }

    public void setItemDescription(String newItemDescription) {
        this.itemDescription = newItemDescription; 
    }

    public int getItemQuantity() {
        return this.itemQuantity; 
    }

    public void setItemQuantity(int newItemQuantity) {
        this.itemQuantity = newItemQuantity; 
    }

    public double getUnitaryPrice() {
        return this.unitaryPrice; 
    }

    public void setUnitaryPrice(double newUnitaryPrice) {
        this.unitaryPrice = newUnitaryPrice; 
    }

    public double calcInvoice() {
        return this.unitaryPrice * this.itemQuantity; 
    }

}





