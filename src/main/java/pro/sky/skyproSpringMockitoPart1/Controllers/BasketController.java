package pro.sky.skyproSpringMockitoPart1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyproSpringMockitoPart1.Data.BasketData;
import pro.sky.skyproSpringMockitoPart1.Services.BasketService;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class BasketController {

    private final BasketService basketService;
    private BasketData basketData; //= new BasketData();

    public BasketController(BasketService basketService,BasketData basketData) {
        this.basketData = basketData;
        this.basketService = basketService;

    }

    @GetMapping(path = "/order/add")
    public Map<Integer, String> add(@RequestParam("productName") ArrayList<String> productName){
        basketData.setProductName(productName);
        basketService.addProduct(basketData);
        return basketService.getProducts();
    }

    @GetMapping(path = "/order/get")
    public Map<Integer, String> getProducts(){
        return basketService.getProducts();
    }

}
