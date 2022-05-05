package com.he.dao;

import com.he.pojo.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> queryProduct();
    List<Product> queryProduct1(int id);
    List<Product> queryProduct3(int typeid);
}
