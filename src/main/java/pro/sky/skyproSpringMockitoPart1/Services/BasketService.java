package pro.sky.skyproSpringMockitoPart1.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyproSpringMockitoPart1.Data.BasketData;
import pro.sky.skyproSpringMockitoPart1.Interfaces.IBasketService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
@SessionScope
public class BasketService implements IBasketService {

    private final Map<Integer, String> items  = new HashMap<Integer, String>();
    private final BasketData basketData;// = new BasketData(); // Если убрать new, то BasketData null

    public BasketService(BasketData basketData) {
        this.basketData = basketData;
    }


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
