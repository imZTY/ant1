package com.sys.user.service.impl;

import com.common.dto.CommonDTO;
import com.common.entity.RoleInfo;
import com.common.util.CommonDTOUtil;
import com.sys.user.dao.IRoleInfoDao;
import com.sys.user.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2019-01-15 16:56
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    private IRoleInfoDao roleInfoDao;

    /**
     * 添加角色
     *
     * @param roleInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO add(RoleInfo roleInfo) {

        try{
            return CommonDTOUtil.success(roleInfoDao.insertSelective(roleInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 修改角色信息
     *
     * @param roleInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO update(RoleInfo roleInfo) {
        try{
            return CommonDTOUtil.success(roleInfoDao.updateByPrimaryKeySelective(roleInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 删除角色
     *
     * @param roleInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO delete(RoleInfo roleInfo) {
        try{
            return CommonDTOUtil.success(roleInfoDao.deleteByPrimaryKey(roleInfo.getId()));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 按页取列表
     *
     * @param roleInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO getListByPage(RoleInfo roleInfo) {
        try{
            roleInfo.setPageStart( (roleInfo.getPage()-1)*roleInfo.getRows() );
            return CommonDTOUtil.success(roleInfoDao.getListByPage(roleInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }
}
