package com.itmsw.ant1.dao;

import com.itmsw.ant1.entity.RoleInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-15 16:52
 */
@Component
public interface IRoleInfoDao {

    // 增
    int insertSelective(RoleInfo roleInfo);

    // 删
    int deleteByPrimaryKey(Integer id);

    // 改
    int updateByPrimaryKeySelective(RoleInfo roleInfo);

    // 查
    RoleInfo selectByPrimaryKey(RoleInfo roleInfo);

    // 取列表
    List<RoleInfo> getListByPage(RoleInfo roleInfo);
}
