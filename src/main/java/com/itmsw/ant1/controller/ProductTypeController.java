package com.itmsw.ant1.controller;

import com.itmsw.ant1.entity.ProductType;
import com.itmsw.ant1.service.ProductTypeService;
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
@RequestMapping("/type")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    /**
     * @apiDefine ProductType 子分类
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /type/add 新增子分类
     * @apiGroup ProductType
     * @apiParam {int} materialId
     * @apiParam {String} productCode
     * @apiParam {int} productIndex
     * @apiParam {String} productName
     * @apiParam {String} productNameEn
     * @apiParam {float} productRank
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     materialId:1
    productCode:BS
    productIndex:1
    productName:套装
    productNameEn:BarSET
    productRank:1.0
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
    public CommonDTO addType(ProductType productType){
        return productTypeService.add(productType);
    }

    /**
     * @api {post} /type/update 修改子分类信息
     * @apiGroup ProductType
     * @apiParam {int} id
     * @apiParam {int} materialId
     * @apiParam {String} productCode
     * @apiParam {int} productIndex
     * @apiParam {String} productName
     * @apiParam {String} productNameEn
     * @apiParam {float} productRank
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     id:3
    disabled:1
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
    public CommonDTO updateType(ProductType productType){
        return productTypeService.update(productType);
    }

    /**
     * @api {post} /type/delete 删除子分类
     * @apiGroup ProductType
     * @apiParam {int} id 子分类id
     * @apiSuccessExample Success-Request:
     * {
     *     id:3
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
    public CommonDTO deleteType(ProductType productType){
        return productTypeService.delete(productType);
    }

    /**
     * @api {get} /type/list 按页获取所有子分类
     * @apiGroup ProductType
     * @apiParam {int} page 页号
     * @apiSuccessExample Success-Request:
     * {
     *     page:1
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
    "materialId": 1,
    "productCode": "BS",
    "productIndex": 1,
    "productName": "套装",
    "productNameEn": "BarSET",
    "productRank": 1,
    "disabled": 0
    },
    {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 2,
    "materialId": 1,
    "productCode": "IBS",
    "productIndex": 2,
    "productName": "冰桶",
    "productNameEn": "Ice Bucket",
    "productRank": 2,
    "disabled": 0
    },
    {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 3,
    "materialId": 2,
    "productCode": "MG",
    "productIndex": 3,
    "productName": "杯子",
    "productNameEn": "Mug",
    "productRank": 3,
    "disabled": 1
    }
    ]
     * }
     */
    @GetMapping("/list")
    public CommonDTO getListByPage(ProductType productType){
        return productTypeService.getListByPage(productType);
    }
}
