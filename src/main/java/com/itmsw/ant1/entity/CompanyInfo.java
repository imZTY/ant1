package com.itmsw.ant1.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 15:16
 */
@Data
public class CompanyInfo implements Serializable {

    private Integer id;

    private String companyName;

    private String contactName;

    private String contactPhone;

    private String contactLicence;

    private String contactAddress;

    private String companyLogo;

    private String companyDesc;

    private String country;

    private String province;

    private String city;

    private Integer disabled = 0;
}
