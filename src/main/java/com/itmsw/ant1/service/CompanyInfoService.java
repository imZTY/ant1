package com.itmsw.ant1.service;

import com.itmsw.ant1.dao.ICompanyInfoDao;
import com.itmsw.ant1.entity.CompanyInfo;
import com.itmsw.ant1.util.dto.CommonDTO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author tianyi
 * @date 2019-01-15 16:08
 */
public interface CompanyInfoService {

    /**
     * 添加公司
     * @param companyInfo spring自动装配的对象
     * @return
     */
    public CommonDTO addCompany(CompanyInfo companyInfo);

    /**
     * 修改公司信息
     * @param companyInfo spring自动装配的对象
     * @return
     */
    public CommonDTO update(CompanyInfo companyInfo);

    public CommonDTO delete(CompanyInfo companyInfo);

    public CommonDTO findById(CompanyInfo companyInfo);

    public CommonDTO getListByPage(CompanyInfo companyInfo);
}
