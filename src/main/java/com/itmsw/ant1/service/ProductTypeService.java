package com.itmsw.ant1.service;

import com.itmsw.ant1.entity.ProductType;

/**
 * @author tianyi
 * @date 2019-01-15 16:08
 */
public interface ProductTypeService {

    /**
     * 添加公司
     * @param productType spring自动装配的对象
     * @return
     */
    public ProductType addUser(ProductType productType);

    /**
     * 修改公司信息
     * @param productType spring自动装配的对象
     * @return
     */
    public int update(ProductType productType);

    /**
     * 删除公司
     * @param productType
     * @return
     */
    public int delete(ProductType productType);
}
