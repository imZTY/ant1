package com.itmsw.ant1.service.impl;

import com.itmsw.ant1.dao.ICompanyInfoDao;
import com.itmsw.ant1.entity.CompanyInfo;
import com.itmsw.ant1.service.CompanyInfoService;
import com.itmsw.ant1.util.dto.CommonDTO;
import com.itmsw.ant1.util.dto.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2019-01-15 16:09
 */
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService{

    @Autowired
    private ICompanyInfoDao companyInfoDao;

    /**
     * 添加公司
     *
     * @param companyInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO addCompany(CompanyInfo companyInfo) {
        try{
            return CommonDTOUtil.success(companyInfoDao.insertSelective(companyInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 修改公司信息
     *
     * @param companyInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO update(CompanyInfo companyInfo) {
        try{
            return CommonDTOUtil.success(companyInfoDao.updateByPrimaryKeySelective(companyInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    @Override
    public CommonDTO delete(CompanyInfo companyInfo) {
        try{
            return CommonDTOUtil.success(companyInfoDao.deleteByPrimaryKey(companyInfo.getId()));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    @Override
    public CommonDTO findById(CompanyInfo companyInfo) {
        try{
            return CommonDTOUtil.success(companyInfoDao.selectByPrimaryKey(companyInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    @Override
    public CommonDTO getListByPage(CompanyInfo companyInfo) {
        try{
            companyInfo.setPageStart( (companyInfo.getPage()-1)*companyInfo.getRows() );
            return CommonDTOUtil.success(companyInfoDao.getListByPage(companyInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }
}
