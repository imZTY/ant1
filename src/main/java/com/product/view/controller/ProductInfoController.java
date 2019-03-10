package com.product.view.controller;

import com.common.dto.CommonDTO;
import com.common.entity.ProductInfo;
import com.product.view.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2019-01-20 15:22
 */
@RestController
@RequestMapping("/product/view")
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    /**
     * @apiDefine ProductInfo 货品
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /product/view/add 新增货品
     * @apiGroup ProductInfo
     * @apiParam {int} productId 子分类id
     * @apiParam {int} userId 操作员id
     * @apiParam {String} productCode 货品编号
     * @apiParam {String} clientCode 手机验证码？
     * @apiParam {long} createTime 记录创建时间
     * @apiParam {String} nameCn 名称中文
     * @apiParam {String} nameEn 名称英文
     * @apiParam {String} descCn 描述中文
     * @apiParam {String} descEn 描述英文
     * @apiParam {String} sizeCn 规格中文
     * @apiParam {String} sizeEn 规格英文
     * @apiParam {String} materialCn 材质中文
     * @apiParam {String} materialEn 材质英文
     * @apiParam {String} surfaceCn 表面中文
     * @apiParam {String} surfaceEn 表面英文
     * @apiParam {String} packageCn 包装中文
     * @apiParam {String} packageEn 包装英文
     * @apiParam {String} cartonCn 外箱中文
     * @apiParam {String} cartonEn 外箱英文
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     productId:2
    userId:1
    productCode:BS001
    clientCode:AB123
    createTime:1234567890
    nameCn:箱子K34
    nameEn:box
    descCn:一个箱子
    descEn:a box
    sizeCn:30厘米
    sizeEn:30cm
    materialCn:塑料
    materialEn:plastic
    surfaceCn:光滑
    surfaceEn:smooth
    packageCn:精致
    packageEn:fine
    cartonCn:已完成
    cartonEn:finished

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
    public CommonDTO addProduct(ProductInfo productInfo){
        // TODO 文件的处理
        return productInfoService.add(productInfo);
    }

    /**
     * @api {post} /product/view/update 修改货品信息
     * @apiGroup ProductInfo
     * @apiParam {int} id 货品id
     * @apiParam {int} productId 子分类id
     * @apiParam {int} userId 操作员id
     * @apiParam {String} productCode 货品编号
     * @apiParam {String} clientCode 手机验证码？
     * @apiParam {long} createTime 记录创建时间
     * @apiParam {String} nameCn 名称中文
     * @apiParam {String} nameEn 名称英文
     * @apiParam {String} descCn 描述中文
     * @apiParam {String} descEn 描述英文
     * @apiParam {String} sizeCn 规格中文
     * @apiParam {String} sizeEn 规格英文
     * @apiParam {String} materialCn 材质中文
     * @apiParam {String} materialEn 材质英文
     * @apiParam {String} surfaceCn 表面中文
     * @apiParam {String} surfaceEn 表面英文
     * @apiParam {String} packageCn 包装中文
     * @apiParam {String} packageEn 包装英文
     * @apiParam {String} cartonCn 外箱中文
     * @apiParam {String} cartonEn 外箱英文
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     id:2
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
    public CommonDTO updateProduct(ProductInfo productInfo){
        // TODO 文件的处理
        return productInfoService.update(productInfo);
    }

    /**
     * @api {post} /product/view/delete 删除货品
     * @apiGroup ProductInfo
     * @apiParam {int} id
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
    public CommonDTO deleteProduct(ProductInfo productInfo){
        return productInfoService.delete(productInfo);
    }

    /**
     * @api {get} /product/view/list 按页获取所有货品
     * @apiGroup ProductInfo
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
    "productId": 2,
    "userId": 1,
    "productCode": "BS001",
    "clientCode": "AB123",
    "createTime": 1234567890,
    "nameCn": "箱子K34",
    "nameEn": "box",
    "descCn": "一个箱子",
    "descEn": "a box",
    "sizeCn": "30厘米",
    "sizeEn": "30cm",
    "materialCn": "塑料",
    "materialEn": null,
    "surfaceCn": "光滑",
    "surfaceEn": "smooth",
    "packageCn": "精致",
    "packageEn": "fine",
    "cartonCn": "已完成",
    "cartonEn": "finished",
    "disabled": 0
    },
    {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 2,
    "productId": 2,
    "userId": 1,
    "productCode": "BS001",
    "clientCode": "AB123",
    "createTime": 1234567890,
    "nameCn": "飞机K34",
    "nameEn": "plane",
    "descCn": "一台飞机",
    "descEn": "a plane",
    "sizeCn": "30米",
    "sizeEn": "30m",
    "materialCn": "轻钢铁",
    "materialEn": null,
    "surfaceCn": "光滑",
    "surfaceEn": "smooth",
    "packageCn": "精致",
    "packageEn": "fine",
    "cartonCn": "未完成",
    "cartonEn": "unfinished",
    "disabled": 1
    }
    ]
     * }
     */
    @GetMapping("/list")
    public CommonDTO getListByPage(ProductInfo productInfo){
        return productInfoService.getListByPage(productInfo);
    }

}
