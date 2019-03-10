package com.product.sort.service;


import com.common.dto.CommonDTO;
import com.common.entity.ProductType;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-15 16:08
 */
public interface ProductTypeService {

    /**
     * 添加子类
     * @param productType spring自动装配的对象
     * @return
     */
    public CommonDTO add(ProductType productType);

    /**
     * 修改子类信息
     * @param productType spring自动装配的对象
     * @return
     */
    public CommonDTO update(ProductType productType);

    /**
     * 删除子类
     * @param productType
     * @return
     */
    public CommonDTO delete(ProductType productType);

    /**
     * 按页取列表
     * @param productType
     * @return
     */
    public CommonDTO getListByPage(ProductType productType);
}
