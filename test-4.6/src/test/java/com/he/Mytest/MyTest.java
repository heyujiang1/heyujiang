package com.he.Mytest;

import com.he.dao.CatagoryMapper;
import com.he.dao.ProductMapper;
import com.he.pojo.Product;
import com.he.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void testQueryProduct(){
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            ProductMapper mapper=session.getMapper(ProductMapper.class);
            List<Product> products=mapper.queryProduct();
            for (Product product : products) {
                System.out.println(product);
            }
    }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    @Test
    public void testQueryProduct1(){
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            ProductMapper mapper=session.getMapper(ProductMapper.class);
            List<Product> products=mapper.queryProduct1(2);
            for (Product product : products) {
                System.out.println(product);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    @Test
    public void testQueryProduct3(){
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            ProductMapper mapper=session.getMapper(ProductMapper.class);
            CatagoryMapper mapper1=session.getMapper(CatagoryMapper.class);
            List<Product> products=mapper.queryProduct3(2);
            for (Product product : products) {
                System.out.println(product);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
