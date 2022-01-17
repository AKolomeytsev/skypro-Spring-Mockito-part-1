package pro.sky.skyproSpringMockitoPart1.Data;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Repository

public class BasketData {
    private ArrayList<String> productName;

    public BasketData(){

    }

    public ArrayList<String> getProductName() {
        return productName;
    }


    public void setProductName(ArrayList<String> productName) {

        this.productName = productName;
    }
}
