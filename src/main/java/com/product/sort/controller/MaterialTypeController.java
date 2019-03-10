package com.product.sort.controller;

import com.common.dto.CommonDTO;
import com.common.entity.MaterialType;
import com.product.sort.service.MaterialTypeService;
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
@RequestMapping("/product/sort/material")
public class MaterialTypeController {

    @Autowired
    private MaterialTypeService materialTypeService;

    /**
     * @apiDefine MaterialType 材料
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /product/sort/material/add 新增材料
     * @apiGroup MaterialType
     * @apiParam {int} companyId 生产公司的id？
     * @apiParam {String} materialName 中文材料名
     * @apiParam {String} materialNameEn 英文材料名
     * @apiParam {float} materialRank 材料排序
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     companyId:1
    materialName:金属制品
    materialNameEn:MT
    materialRank:1.0
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
    public CommonDTO addType(MaterialType materialType){
        return materialTypeService.add(materialType);
    }

    /**
     * @api {post} /product/sort/material/update 修改材料信息
     * @apiGroup MaterialType
     * @apiParam {int} id 材料id
     * @apiParam {int} companyId 生产公司的id？
     * @apiParam {String} materialName 中文材料名
     * @apiParam {String} materialNameEn 英文材料名
     * @apiParam {float} materialRank 材料排序
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     id:2
    materialRank:3.0
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
    public CommonDTO updateType(MaterialType materialType){
        return materialTypeService.update(materialType);
    }

    /**
     * @api {post} /product/sort/material/delete 删除材料
     * @apiGroup MaterialType
     * @apiParam {int} id 材料id
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
    public CommonDTO deleteType(MaterialType materialType){
        return materialTypeService.delete(materialType);
    }

    /**
     * @api {get} /product/sort/material/list 按页获取所有材料
     * @apiGroup MaterialType
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
    "id": 1,
    "companyId": 1,
    "materialName": "金属制品",
    "materialNameEn": "MT",
    "materialRank": 1,
    "disabled": 0,
    "productTypes": [
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
    }
    ]
    },
    {
    "id": 2,
    "companyId": 1,
    "materialName": "塑料制品",
    "materialNameEn": "PL",
    "materialRank": 3,
    "disabled": 0,
    "productTypes": [
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
    "disabled": 0
    }
    ]
    }
    ]
     * }
     */
    @GetMapping("/list")
    public CommonDTO getListByPage(MaterialType materialType){
        return materialTypeService.getListByPage(materialType);
    }
}
