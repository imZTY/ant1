package com.product.sort.dto;

import com.common.entity.MaterialType;
import com.common.entity.ProductType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-01-20 16:19
 */
@Data
public class MaterialDTO {

    public MaterialDTO(MaterialType materialType, List<ProductType> productTypes){
        this.id = materialType.getId();
        this.companyId = materialType.getCompanyId();
        this.materialName = materialType.getMaterialName();
        this.materialNameEn = materialType.getMaterialNameEn();
        this.materialRank = materialType.getMaterialRank();
        this.disabled = materialType.getDisabled();
        this.productTypes = productTypes;
    }

    private Integer id;

    private Integer companyId;

    private String materialName;

    private String materialNameEn;

    private Float materialRank;

    private Integer disabled = 0;

    private List<ProductType> productTypes;
}
