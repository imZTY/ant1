package com.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 15:16
 */
@Data
public class CompanyInfo extends PageEntity implements Serializable {

    private Integer id;

    private String companyName;

    private String contactName;

    private String contactPhone;

    private String companyLicence;

    private String companyAddress;

    private String companyLogo;

    private String companyDesc;

    private String country;

    private String province;

    private String city;

    private Integer disabled = 0;
}
