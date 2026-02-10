public class Products {

//fields

  private int id;
  private String productName;
  private String producter;
  private int miktar;
  private String birim;
  private String raf;

    //constructors

    public Products(int id, String productName, String producter, String birim) {
        this.id = id;
        this.productName = productName;
        this.producter = producter;
        this.birim = birim;
    }

    //getter setter

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProducter() {
        return producter;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getBirim() {
        return birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProducter(String producter) {
        this.producter = producter;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

//toString


    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", producter='" + producter + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
