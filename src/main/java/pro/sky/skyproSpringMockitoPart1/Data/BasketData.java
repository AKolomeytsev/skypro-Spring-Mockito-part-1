package pro.sky.skyproSpringMockitoPart1.Data;

import java.util.ArrayList;

public class BasketData {
    private ArrayList<String> productName;

    public BasketData(ArrayList<String> productName){
        this.setProductName(productName);
    }

    public ArrayList<String> getProductName() {
        return productName;
    }


    public void setProductName(ArrayList<String> productName) {
        this.productName = productName;
    }
}
