package pro.sky.skyproSpringMockitoPart1.Interfaces;

import pro.sky.skyproSpringMockitoPart1.Data.BasketData;

import java.util.ArrayList;
import java.util.Map;

public interface IBasketService {
    void addProduct(BasketData item);
    Map<Integer, String> getProducts();

}
