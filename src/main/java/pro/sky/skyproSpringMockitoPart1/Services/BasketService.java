package pro.sky.skyproSpringMockitoPart1.Services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyproSpringMockitoPart1.Data.BasketData;
import pro.sky.skyproSpringMockitoPart1.Interfaces.IBasketService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class BasketService implements IBasketService {
    private final Map<Integer, String> items  = new HashMap<Integer, String>();
    private BasketData basketData = new BasketData(); // Если урать new, то BasketData null



    @Override
    public void addProduct() {
        ArrayList<String> products = basketData.getProductName();
        for(int i = 0; i<products.size(); i++)
        {
            if(!items.containsValue(products.get(i)))
                items.put(items.size(),products.get(i));
        }

    }

    @Override
    public Map<Integer, String> getProducts() {
        return items;
    }


    public void setBasketData(ArrayList<String> products) {
        this.basketData.setProductName(products);
    }
}
