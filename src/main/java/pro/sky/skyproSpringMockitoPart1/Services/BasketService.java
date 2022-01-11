package pro.sky.skyproSpringMockitoPart1.Services;

import org.apache.catalina.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyproSpringMockitoPart1.Data.BasketData;
import pro.sky.skyproSpringMockitoPart1.Interfaces.IBasketService;

import java.util.HashMap;
import java.util.Map;

@Service
@SessionScope
public class BasketService implements IBasketService {
    private final Map<Integer, String> items  = new HashMap<>();
    @Override
    public void addProduct(BasketData item) {
        items.put(item.getId(),item.getProductName());
    }

    @Override
    public Map<Integer, String> getProducts() {
        return items;
    }
}
