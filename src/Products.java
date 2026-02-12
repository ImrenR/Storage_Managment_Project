public class Products {

//fields

private String productName;
private String producter;
private int id;
private String unit;
private int quantity;
private String shelf;

    //constructors

    public Products(String productName, String producter, String unit, int id) {
        this.productName = productName;
        this.producter = producter;
        this.unit = unit;
        this.id = id;
    }


    //getter setter

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducter() {
        return producter;
    }

    public void setProducter(String producter) {
        this.producter = producter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }
//toString


    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", producter='" + producter + '\'' +
                ", id=" + id +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}
