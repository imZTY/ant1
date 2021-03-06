package com.sys.user.service.impl;

import com.common.dto.CommonDTO;
import com.common.entity.UserInfo;
import com.common.util.CommonDTOUtil;
import com.sys.user.dao.IUserInfoDao;
import com.sys.user.filter.UserInfoFilter;
import com.sys.user.service.UserInfoService;
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
            if (userInfo.getIds() == null || userInfo.getId() != 0) {
                return CommonDTOUtil.success(userInfoDao.updateByPrimaryKeySelective(userInfo));
            }else{
                for (int id :
                        userInfo.getIds()) {
                    userInfo.setId(id);
                    userInfoDao.updateByPrimaryKeySelective(userInfo);
                }
                return CommonDTOUtil.success();
            }
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
            if (userInfo.getIds() == null || userInfo.getId() != 0) {
                return CommonDTOUtil.success(userInfoDao.deleteByPrimaryKey(userInfo.getId()));
            }else{
                for (int id :
                        userInfo.getIds()) {
                    userInfoDao.deleteByPrimaryKey(id);
                }
                return CommonDTOUtil.success();
            }
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 获取用户列表
     *
     * @param userInfoFilter 含有分页属性
     * @return
     */
    @Override
    public CommonDTO getListByPage(UserInfoFilter userInfoFilter) {
        try{
            userInfoFilter.setPageStart( (userInfoFilter.getPage()-1)*userInfoFilter.getRows() );
            return CommonDTOUtil.success(userInfoDao.getListByPage(userInfoFilter));
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
