package com.sda.OnlineShop.dto;

import com.sda.OnlineShop.entities.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SelectedProductDto {
    private String name;
    private String quantity;
    private String price;
    private String priceTimesQuantity;

}
