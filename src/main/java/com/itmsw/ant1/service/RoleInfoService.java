package com.itmsw.ant1.service;

import com.itmsw.ant1.entity.RoleInfo;
import com.itmsw.ant1.util.dto.CommonDTO;

/**
 * @author tianyi
 * @date 2019-01-15 16:54
 */
public interface RoleInfoService {

    /**
     * 添加角色
     * @param roleInfo spring自动装配的对象
     * @return
     */
    public CommonDTO add(RoleInfo roleInfo);

    /**
     * 修改角色信息
     * @param roleInfo spring自动装配的对象
     * @return
     */
    public CommonDTO update(RoleInfo roleInfo);

    /**
     * 删除角色
     * @param roleInfo spring自动装配的对象
     * @return
     */
    public CommonDTO delete(RoleInfo roleInfo);

    /**
     * 按页取列表
     * @param roleInfo spring自动装配的对象
     * @return
     */
    public CommonDTO getListByPage(RoleInfo roleInfo);
}
