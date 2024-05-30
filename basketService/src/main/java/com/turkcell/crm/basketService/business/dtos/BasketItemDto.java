package com.turkcell.crm.basketService.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasketItemDto {
    private int productId;
    private String name;
    private double price;
}
