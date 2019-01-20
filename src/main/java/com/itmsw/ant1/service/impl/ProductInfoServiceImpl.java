package com.itmsw.ant1.service.impl;

import com.itmsw.ant1.dao.IProductInfoDao;
import com.itmsw.ant1.entity.ProductInfo;
import com.itmsw.ant1.service.ProductInfoService;
import com.itmsw.ant1.util.dto.CommonDTO;
import com.itmsw.ant1.util.dto.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2019-01-15 16:09
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService{

    @Autowired
    private IProductInfoDao productInfoDao;

    /**
     * 添加货品
     *
     * @param productInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO add(ProductInfo productInfo) {
        try{
            return CommonDTOUtil.success(productInfoDao.insertSelective(productInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 修改货品信息
     *
     * @param productInfo spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO update(ProductInfo productInfo) {
        try{
            return CommonDTOUtil.success(productInfoDao.updateByPrimaryKeySelective(productInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 删除货品
     *
     * @param productInfo
     * @return
     */
    @Override
    public CommonDTO delete(ProductInfo productInfo) {
        try{
            return CommonDTOUtil.success(productInfoDao.deleteByPrimaryKey(productInfo.getId()));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 按页获取列表
     *
     * @param productInfo
     * @return
     */
    @Override
    public CommonDTO getListByPage(ProductInfo productInfo) {
        try{
            productInfo.setRows(productInfo.getRows()*2);
            productInfo.setPageStart( (productInfo.getPage()-1)*productInfo.getRows() );
            return CommonDTOUtil.success(productInfoDao.getListByPage(productInfo));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }
}
