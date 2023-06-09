package com.sametyilmaz.inventoryservice.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductResponse {
    private UUID id;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
    private String name;
}
