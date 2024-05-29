package com.turkcell.crm.basketService.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBasketItemRequest {

    private String name;
    private String productId;
    private double price;
    private String accountId;
}