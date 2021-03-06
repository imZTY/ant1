package com.product.view.service;


import com.common.dto.CommonDTO;
import com.common.entity.ProductInfo;

import java.util.List;

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
    public CommonDTO add(ProductInfo productInfo);

    /**
     * 修改货品信息
     * @param productInfo spring自动装配的对象
     * @return
     */
    public CommonDTO update(ProductInfo productInfo);

    /**
     * 删除货品
     * @param productInfo
     * @return
     */
    public CommonDTO delete(ProductInfo productInfo);

    /**
     * 按页获取列表
     * @param productInfo
     * @return
     */
    public CommonDTO getListByPage(ProductInfo productInfo);
    
}
