package com.itmsw.ant1.dao;

import com.itmsw.ant1.entity.CompanyInfo;
import com.itmsw.ant1.entity.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-15 16:11
 */
@Component
public interface ICompanyInfoDao {

    // 增
    int insertSelective(CompanyInfo companyInfo);

    // 删
    int deleteByPrimaryKey(Integer id);

    // 改
    int updateByPrimaryKeySelective(CompanyInfo companyInfo);

    // 查
    CompanyInfo selectByPrimaryKey(CompanyInfo companyInfo);

    // 取列表
    List<CompanyInfo> getListByPage(CompanyInfo companyInfo);
}
