public class App {
    
    public static void main(String args[]) {
        
        /* Creating invoices and calculating their final prices */

        
        
        Invoice invoice1 = new Invoice(1, "A delicious pizza", 2, 10.0);
        System.out.println("Your final invoice is: " + invoice1.calcInvoice() + "\n");  

 

        Invoice invoice2 = new Invoice(2, "A delicious coke", 3, 6.0);
        System.out.println(
            "--- Information about your invoice: --- \n" + 

            "--- Invoice id: " + invoice2.getItemId() + "\n" + 

            "--- Item description: " + invoice2.getItemDescription() + "\n" +

            "--- Unitary price: " + invoice2.getUnitaryPrice() + "\n" +
            
            "--- Item quantity price: " + invoice2.getItemQuantity() + "\n" +

            "--- Final price: " + invoice2.calcInvoice() + "\n"
        );


        
        /* Changing invoice attributes */

        invoice1.setItemQuantity(4);
        System.out.println("The final price is: " + invoice1.calcInvoice() + "\n");

        invoice2.setItemDescription("A tasty coke");
        invoice2.setUnitaryPrice(7.0);
        invoice2.setItemId(43);

        System.out.println(
            "--- Information about your invoice: --- \n" + 

            "--- Invoice id: " + invoice2.getItemId() + "\n" + 

            "--- Item description: " + invoice2.getItemDescription() + "\n" +

            "--- Unitary price: " + invoice2.getUnitaryPrice() + "\n" +
            
            "--- Item quantity price: " + invoice2.getItemQuantity() + "\n" +

            "--- Final price: " + invoice2.calcInvoice() + "\n"
        );

        
        /* Creating invalid invoice */

        Invoice invoice3 = new Invoice(3, "A healthy salad", -3, -5); 

        System.out.println(
            "--- Information about your invoice: --- \n" + 

            "--- Invoice id: " + invoice3.getItemId() + "\n" + 

            "--- Item description: " + invoice3.getItemDescription() + "\n" + 

            "--- Unitary price: " + invoice3.getUnitaryPrice() + "\n" +
            
            "--- Item quantity price: " + invoice3.getItemQuantity() + "\n" +

            "--- Final price: " + invoice3.calcInvoice() + "\n"
        );
        
    }
    
}
