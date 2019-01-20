package com.itmsw.ant1.service.impl;

import com.itmsw.ant1.dao.IMaterialTypeDao;
import com.itmsw.ant1.dao.IProductTypeDao;
import com.itmsw.ant1.entity.MaterialType;
import com.itmsw.ant1.entity.ProductType;
import com.itmsw.ant1.service.MaterialTypeService;
import com.itmsw.ant1.util.dto.CommonDTO;
import com.itmsw.ant1.util.dto.CommonDTOUtil;
import com.itmsw.ant1.util.dto.MaterialDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-15 16:55
 */
@Service
public class MaterialTypeServiceImpl implements MaterialTypeService {

    @Autowired
    private IMaterialTypeDao materialTypeDao;

    @Autowired
    private IProductTypeDao productTypeDao;

    /**
     * 添加材料
     *
     * @param materialType spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO add(MaterialType materialType) {
        try{
            return CommonDTOUtil.success(materialTypeDao.insertSelective(materialType));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 修改材料信息
     *
     * @param materialType spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO update(MaterialType materialType) {
        try{
            return CommonDTOUtil.success(materialTypeDao.updateByPrimaryKeySelective(materialType));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 删除材料
     *
     * @param materialType spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO delete(MaterialType materialType) {
        try{
            return CommonDTOUtil.success(materialTypeDao.deleteByPrimaryKey(materialType.getId()));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * 按页取列表
     *
     * @param materialType spring自动装配的对象
     * @return
     */
    @Override
    public CommonDTO getListByPage(MaterialType materialType) {
        try{
            materialType.setPageStart( (materialType.getPage()-1)*materialType.getRows() );
            List<MaterialType> materialTypeList = materialTypeDao.getListByPage(materialType);
            List<MaterialDTO> rt = new ArrayList<MaterialDTO>(materialTypeList.size());
            for (MaterialType per:
                    materialTypeList) {
                List<ProductType> productTypeList = productTypeDao.getListByMaterialId(per.getId());
                rt.add(new MaterialDTO(per,productTypeList));
            }
            return CommonDTOUtil.success(rt);
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }
}
