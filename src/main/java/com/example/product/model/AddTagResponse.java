package com.example.product.model;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.io.Serializable;
@Data
@GeneratePojoBuilder
public class AddTagResponse<T> implements Serializable {
    public String code;
    private T value;
}

