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
    private int cnt = 0;
    private final Map<Integer, String> items  = new HashMap<Integer, String>();

    @Override
    public void addProduct(BasketData item) {
        ArrayList<String> products = item.getProductName();
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

    @Override
    public int inc() {
        return cnt++;
    }
}
