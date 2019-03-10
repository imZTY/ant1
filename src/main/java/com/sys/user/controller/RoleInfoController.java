package com.sys.user.controller;

import com.common.dto.CommonDTO;
import com.common.entity.RoleInfo;
import com.sys.user.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2019-01-20 15:24
 */
@RestController
@RequestMapping("/sys/role")
public class RoleInfoController {

    @Autowired
    private RoleInfoService roleInfoService;

    /**
     * @apiDefine RoleInfo 角色
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /sys/role/add 新增角色
     * @apiGroup RoleInfo
     * @apiParam {String} roleName 角色名称
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     roleName:管理员
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
    public CommonDTO addType(RoleInfo roleInfo){
        return roleInfoService.add(roleInfo);
    }

    /**
     * @api {post} /sys/role/update 修改角色信息
     * @apiGroup RoleInfo
     * @apiParam {int} id 角色id
     * @apiParam {String} roleName 角色名称
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     id:8
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
    public CommonDTO updateType(RoleInfo roleInfo){
        return roleInfoService.update(roleInfo);
    }

    /**
     * @api {post} /sys/role/delete 删除角色
     * @apiGroup RoleInfo
     * @apiParam {int} id 角色id
     * @apiSuccessExample Success-Request:
     * {
     *     id:7
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
    public CommonDTO deleteType(RoleInfo roleInfo){
        return roleInfoService.delete(roleInfo);
    }

    /**
     * @api {get} /sys/role/list 按页获取所有角色
     * @apiGroup RoleInfo
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
    "roleName": "管理员",
    "disabled": 0
    },
    {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 2,
    "roleName": "主管",
    "disabled": 0
    },
    {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 3,
    "roleName": "员工",
    "disabled": 0
    }
    ]
     * }
     */
    @GetMapping("/list")
    public CommonDTO getListByPage(RoleInfo roleInfo){
        return roleInfoService.getListByPage(roleInfo);
    }
}
