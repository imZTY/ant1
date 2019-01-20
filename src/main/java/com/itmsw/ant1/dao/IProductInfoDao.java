package com.itmsw.ant1.dao;

import com.itmsw.ant1.entity.ProductInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-15 16:10
 */
@Component
public interface IProductInfoDao {

    // 增
    int insertSelective(ProductInfo productInfo);

    // 删
    int deleteByPrimaryKey(Integer id);

    // 改
    int updateByPrimaryKeySelective(ProductInfo productInfo);

    // 查
    ProductInfo selectByPrimaryKey(ProductInfo productInfo);

    // 取列表
    List<ProductInfo> getListByPage(ProductInfo productInfo);
}
