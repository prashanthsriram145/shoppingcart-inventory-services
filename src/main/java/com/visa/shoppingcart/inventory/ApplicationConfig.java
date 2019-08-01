package com.visa.shoppingcart.inventory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.visa.shoppingcart.common.dao", "com.visa.shoppingcart.common.entities"})
public class ApplicationConfig {
}
