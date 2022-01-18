package pro.sky.skyproSpringMockitoPart1.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyproSpringMockitoPart1.Data.BasketData;

@Configuration
public class ConfigAppBasket {
    @Bean
    @SessionScope
    public BasketData createBasketData(){
        return  new BasketData();

    }
}
