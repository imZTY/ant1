package com.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 16:49
 */
@Data
public class MaterialType extends PageEntity implements Serializable {

    private Integer id;

    private Integer companyId;

    private String materialName;

    private String materialNameEn;

    private Float materialRank;

    private Integer disabled = 0;
}
