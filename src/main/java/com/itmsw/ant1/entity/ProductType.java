package com.itmsw.ant1.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 15:16
 */
@Data
public class ProductType extends PageEntity implements Serializable {

    private Integer id;

    private Integer materialId;

    private String productCode;

    private Integer productIndex;

    private String productName;

    private String productNameEn;

    private Float productRank;

    private Integer disabled;
}
