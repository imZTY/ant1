package com.itmsw.ant1.controller;

import com.itmsw.ant1.entity.CompanyInfo;
import com.itmsw.ant1.service.CompanyInfoService;
import com.itmsw.ant1.util.dto.CommonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2019-01-20 15:23
 */
@RestController
@RequestMapping("/company")
public class CompanyInfoController {

    @Autowired
    private CompanyInfoService companyInfoService;

    /**
     * @apiDefine CompanyInfo 公司
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /company/add 新增公司
     * @apiGroup CompanyInfo
     * @apiParam {String} companyName 公司名称
     * @apiParam {String} contactName 联系人姓名
     * @apiParam {String} contactPhone 联系人电话
     * @apiParam {String} companyLicence 公司证书
     * @apiParam {String} companyAddress 公司地址
     * @apiParam {String} companyLogo 公司图片文件
     * @apiParam {String} companyDesc 公司描述
     * @apiParam {String} country 国家
     * @apiParam {String} province 省份
     * @apiParam {String} city 城市
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     companyName:有间公司
    contactName:曾天臆
    contactPhone:18322222515
    companyAddress:广州中医药大学学生宿舍K722
    companyDesc:靠谱，欢迎投资
    country:中国
    province:广东
    city:广州
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @PostMapping("/add")
    public CommonDTO addCompany(CompanyInfo companyInfo){
        return companyInfoService.addCompany(companyInfo);
    }

    /**
     * @api {post} /company/update 修改公司信息
     * @apiGroup CompanyInfo
     * @apiParam {int} id 公司id
     * @apiParam {String} companyName 公司名称
     * @apiParam {String} contactName 联系人姓名
     * @apiParam {String} contactPhone 联系人电话
     * @apiParam {String} companyLicence 公司证书
     * @apiParam {String} companyAddress 公司地址
     * @apiParam {String} companyLogo 公司图片文件
     * @apiParam {String} companyDesc 公司描述
     * @apiParam {String} country 国家
     * @apiParam {String} province 省份
     * @apiParam {String} city 城市
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     id:1
    contactName:陈家杰
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @PostMapping("/update")
    public CommonDTO updateCompany(CompanyInfo companyInfo){
        return companyInfoService.update(companyInfo);
    }

    /**
     * @api {post} /company/delete 删除公司
     * @apiGroup CompanyInfo
     * @apiParam {int} id 公司id
     * @apiSuccessExample Success-Request:
     * {
     *     id:2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @PostMapping("/delete")
    public CommonDTO deleteCompany(CompanyInfo companyInfo){
        return companyInfoService.delete(companyInfo);
    }

    /**
     * @api {get} /company/list 按页获取公司列表
     * @apiGroup CompanyInfo
     * @apiParam {int} page 页号
     * @apiSuccessExample Success-Request:
     * {
     *     page = 1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 1,
    "companyName": "有间公司",
    "contactName": "陈家杰",
    "contactPhone": "18322222515",
    "companyLicence": "",
    "companyAddress": "广州中医药大学学生宿舍K722",
    "companyLogo": "",
    "companyDesc": "靠谱，欢迎投资",
    "country": "中国",
    "province": "广东",
    "city": "广州",
    "disabled": 0
    },
    {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 2,
    "companyName": "另一家公司",
    "contactName": "曾天臆",
    "contactPhone": "18322222515",
    "companyLicence": "",
    "companyAddress": "广州中医药大学学生宿舍K722",
    "companyLogo": "",
    "companyDesc": "靠谱，欢迎投资",
    "country": "中国",
    "province": "广东",
    "city": "广州",
    "disabled": 0
    }
    ]
     * }
     */
    @GetMapping("/list")
    public CommonDTO getListByPage(CompanyInfo companyInfo){
        return companyInfoService.getListByPage(companyInfo);
    }

    /**
     * @api {get} /company/one
     * @apiGroup CompanyInfo
     * @apiParam {int} id 公司id
     * @apiSuccessExample Success-Request:
     * {
     *     id:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 1,
    "companyName": "有间公司",
    "contactName": "陈家杰",
    "contactPhone": "18322222515",
    "companyLicence": "",
    "companyAddress": "广州中医药大学学生宿舍K722",
    "companyLogo": "",
    "companyDesc": "靠谱，欢迎投资",
    "country": "中国",
    "province": "广东",
    "city": "广州",
    "disabled": 0
    }
     * }
     */
    @GetMapping("/one")
    public CommonDTO getOneById(CompanyInfo companyInfo){
        return companyInfoService.findById(companyInfo);
    }
}
