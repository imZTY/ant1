package com.product.sort.dao;

import com.common.entity.MaterialType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-15 16:51
 */
@Component
public interface IMaterialTypeDao {

    // 增
    int insertSelective(MaterialType materialType);

    // 删
    int deleteByPrimaryKey(Integer id);

    // 改
    int updateByPrimaryKeySelective(MaterialType materialType);

    // 查
    MaterialType selectByPrimaryKey(MaterialType materialType);

    // 取列表
    List<MaterialType> getListByPage(MaterialType materialType);
}
