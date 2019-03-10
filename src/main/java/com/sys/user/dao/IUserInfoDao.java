package com.sys.user.dao;

import com.common.entity.UserInfo;
import com.sys.user.filter.UserInfoFilter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-15 16:10
 */
@Component
public interface IUserInfoDao {

    // 增
    int insertSelective(UserInfo userInfo);

    // 删
    int deleteByPrimaryKey(Integer id);

    // 改
    int updateByPrimaryKeySelective(UserInfo userInfo);

    // 查
    UserInfo selectByPrimaryKey(UserInfo userInfo);

    // 取列表
    List<UserInfo> getListByPage(UserInfoFilter userInfoFilter);

    // 特殊
    UserInfo selectByUserName(UserInfo userInfo);


}
