package pro.sky.skyproSpringMockitoPart1.Data;

public class BasketData {
    private int id;
    private String productName;

    public BasketData(int id,String productName){
        this.setId(id);
        this.setProductName(productName);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
