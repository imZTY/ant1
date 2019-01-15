package com.itmsw.ant1.service;

import com.itmsw.ant1.entity.ProductInfo;

/**
 * @author tianyi
 * @date 2019-01-15 16:08
 */
public interface ProductInfoService {

    /**
     * 添加货品
     * @param productInfo spring自动装配的对象
     * @return
     */
    public ProductInfo addUser(ProductInfo productInfo);

    /**
     * 修改货品信息
     * @param productInfo spring自动装配的对象
     * @return
     */
    public int update(ProductInfo productInfo);

    /**
     * 删除货品
     * @param productInfo
     * @return
     */
    public int delete(ProductInfo productInfo);
    
}
