package com.itmsw.ant1.service.impl;

import com.itmsw.ant1.dao.IRoleInfoDao;
import com.itmsw.ant1.entity.RoleInfo;
import com.itmsw.ant1.service.RoleInfoService;
import com.itmsw.ant1.util.dto.CommonDTO;
import com.itmsw.ant1.util.dto.CommonDTOUtil;
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
