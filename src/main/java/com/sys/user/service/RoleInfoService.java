package com.sys.user.service;


import com.common.dto.CommonDTO;
import com.common.entity.RoleInfo;

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
