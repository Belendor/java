// Create a class called Invoice that a hardware store might use to represent an 
// invoice for an item sold at the store.
public class Invoice {
    // An Invoice should include four attributes—
    private String partNumber; // a part number (type string),
    private String partDescription; // a part description (type string)
    private int quantity; // a quantity of the item being purchased (type int)
    private int pricePerItem; //  and a price per item (type int)

    // Your class should have a constructor that initializes the four attributes.
    public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    // Provide a set and a get method for each attribute.
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    // If the quantity is not positive, it should be set to 0.
    // If the price per item is not positive, it should be set to 0. 
    // is set to 0 if it is less than 0, using the Math.max method.
    public void setQuantity(int quantity) {
        this.quantity = Math.max(0, quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = Math.max(0, pricePerItem);
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    // In addition, provide a method named getInvoiceAmount 
    // that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
    public int getInvoiceAmount() {
        // then returns the amount as an int value.
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        testInvoice(args); //will run tests
    }
    
    public static void testInvoice(String[] args) {
        Invoice invoice = new Invoice("1234", "Screwdriver", 5, 10);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
