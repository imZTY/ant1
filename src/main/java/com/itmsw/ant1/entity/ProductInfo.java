package com.itmsw.ant1.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 15:16
 */
@Data
public class ProductInfo extends PageEntity implements Serializable {

    private Integer id;

    private Integer productId;

    private Integer userId;

    private String productCode;

    private String clientCode;

    // 时间戳
    private Long createTime;

    private String nameCn;

    private String nameEn;

    private String descCn;

    private String descEn;

    private String sizeCn;

    private String sizeEn;

    private String materialCn;

    private String materialEn;

    private String surfaceCn;

    private String surfaceEn;

    private String packageCn;

    private String packageEn;

    private String cartonCn;

    private String cartonEn;

    private Integer disabled = 0;
}
