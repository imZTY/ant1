package com.product.sort.service.impl;

import com.common.dto.CommonDTO;
import com.common.entity.ProductType;
import com.common.util.CommonDTOUtil;
import com.product.sort.dao.IProductTypeDao;
import com.product.sort.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianyi
 * @date 2019-01-15 16:09
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private IProductTypeDao productTypeDao;

    /**
     * 添加子类
     *
     * @param productType spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO add(ProductType productType) {
        try{
            return CommonDTOUtil.success(productTypeDao.insertSelective(productType));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 修改子类信息
     *
     * @param productType spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO update(ProductType productType) {
        try{
            return CommonDTOUtil.success(productTypeDao.updateByPrimaryKeySelective(productType));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 删除子类
     *
     * @param productType
     * @return
     */
    @Override
    public CommonDTO delete(ProductType productType) {
        try{
            return CommonDTOUtil.success(productTypeDao.deleteByPrimaryKey(productType.getId()));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 按页取列表
     *
     * @param productType
     * @return
     */
    @Override
    public CommonDTO getListByPage(ProductType productType) {
        try{
            productType.setPageStart( (productType.getPage()-1)*productType.getRows() );
            return CommonDTOUtil.success(productTypeDao.getListByPage(productType));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }
}
