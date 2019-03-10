package com.product.sort.service;


import com.common.dto.CommonDTO;
import com.common.entity.MaterialType;

/**
 * @author tianyi
 * @date 2019-01-15 16:53
 */
public interface MaterialTypeService {

    /**
     * 添加材料
     * @param materialType spring自动装配的对象
     * @return
     */
    public CommonDTO add(MaterialType materialType);

    /**
     * 修改材料信息
     * @param materialType spring自动装配的对象
     * @return
     */
    public CommonDTO update(MaterialType materialType);

    /**
     * 删除材料
     * @param materialType spring自动装配的对象
     * @return
     */
    public CommonDTO delete(MaterialType materialType);

    /**
     * 按页取列表
     * @param materialType spring自动装配的对象
     * @return
     */
    public CommonDTO getListByPage(MaterialType materialType);
}
