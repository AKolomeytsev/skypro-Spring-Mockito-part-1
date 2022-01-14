package pro.sky.skyproSpringMockitoPart1.Data;

import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
@SessionScope
public class BasketData {
    private ArrayList<String> productName;

    public BasketData(){

    }
    @Bean
    public ArrayList<String> getProductName() {
        return productName;
    }

    @Bean
    public void setProductName(ArrayList<String> productName) {
        this.productName = productName;
    }
}
