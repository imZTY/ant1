package com.sys.company.dao;

import com.common.entity.CompanyInfo;
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
