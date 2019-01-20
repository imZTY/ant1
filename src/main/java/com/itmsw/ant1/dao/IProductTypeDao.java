package com.itmsw.ant1.dao;


import com.itmsw.ant1.entity.ProductType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-15 16:11
 */
@Component
public interface IProductTypeDao {

    // 增
    int insertSelective(ProductType productType);

    // 删
    int deleteByPrimaryKey(Integer id);

    // 改
    int updateByPrimaryKeySelective(ProductType productType);

    // 查
    ProductType selectByPrimaryKey(ProductType productType);

    // 取列表
    List<ProductType> getListByPage(ProductType productType);

    // 取列表
    List<ProductType> getListByMaterialId(Integer materialId);
}
