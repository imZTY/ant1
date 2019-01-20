package com.itmsw.ant1.service.impl;

import com.itmsw.ant1.dao.IUserInfoDao;
import com.itmsw.ant1.entity.UserInfo;
import com.itmsw.ant1.service.UserInfoService;
import com.itmsw.ant1.util.dto.CommonDTO;
import com.itmsw.ant1.util.dto.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2019-01-15 16:09
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

    /**
     * 添加用户
     *
     * @param userInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO addUser(UserInfo userInfo) {
        try {
            return CommonDTOUtil.success(userInfoDao.insertSelective(userInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 修改用户信息
     *
     * @param userInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO update(UserInfo userInfo) {
        try{
            return CommonDTOUtil.success(userInfoDao.updateByPrimaryKeySelective(userInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 删除用户
     *
     * @param userInfo
     * @return
     */
    @Override
    public CommonDTO delete(UserInfo userInfo) {
        try {
            return CommonDTOUtil.success(userInfoDao.deleteByPrimaryKey(userInfo.getId()));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 获取用户列表
     *
     * @param userInfo 含有分页属性
     * @return
     */
    @Override
    public CommonDTO getListByPage(UserInfo userInfo) {
        try{
            userInfo.setPageStart( (userInfo.getPage()-1)*userInfo.getRows() );
            return CommonDTOUtil.success(userInfoDao.getListByPage(userInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 用户登录
     * 目前只支持用户名登录
     * @param userInfo
     * @return
     */
    @Override
    public CommonDTO login(UserInfo userInfo) {
        try {
            UserInfo found = userInfoDao.selectByUserName(userInfo);
            if (found == null){
                return CommonDTOUtil.error(404, "找不到该用户");
            }else if (!found.getPassword().equals(userInfo.getPassword())){
                return CommonDTOUtil.error(501, "密码错误");
            }else {
                return CommonDTOUtil.success(found);
            }
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }
}
