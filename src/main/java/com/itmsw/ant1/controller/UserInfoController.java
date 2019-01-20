package com.itmsw.ant1.controller;

import com.itmsw.ant1.entity.UserInfo;
import com.itmsw.ant1.service.UserInfoService;
import com.itmsw.ant1.util.dto.CommonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2019-01-15 11:36
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * @apiDefine UserInfo 用户
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /user/login 用户登录
     * @apiGroup UserInfo
     * @apiParam {String} userName 用户名
     * @apiParam {String} password 密码
     * @apiSuccessExample Success-Request:
     * {
     *     userName:zty
    password:123
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
    "id": 3,
    "roleId": 1,
    "loginCode": "565718",
    "password": "123",
    "passwordSrc": "123",
    "userName": "zty",
    "phone": "18320444515",
    "sex": "",
    "disabled": 0
    }
     * }
     */
    @PostMapping("/login")
    public CommonDTO login(UserInfo userInfo){
        return userInfoService.login(userInfo);
    }

    /**
     * @api {post} /user/add 添加用户
     * @apiGroup UserInfo
     * @apiParam {int} roleId 初始角色id
     * @apiParam {String} loginCode 初始验证码？？
     * @apiParam {String} userName 初始用户名
     * @apiParam {String} password 初始密码
     * @apiParam {String} passwordSrc 初始密码的？？
     * @apiParam {String} phone 初始手机号
     * @apiParam {String} sex 初始性别
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     roleId:1
    userName:zty
    password:123
    passwordSrc:123
    loginCode:565718
    phone:18320444515
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
    public CommonDTO add(UserInfo userInfo){
        return userInfoService.addUser(userInfo);
    }

    /**
     * @api {post} /user/update 修改用户信息
     * @apiGroup UserInfo
     * @apiParam {int} id 用户id
     * @apiParam {int} roleId 用户角色id
     * @apiParam {String} loginCode 用户验证码？？
     * @apiParam {String} userName 用户用户名
     * @apiParam {String} password 用户密码
     * @apiParam {String} passwordSrc 用户密码的？？
     * @apiParam {String} phone 用户手机号
     * @apiParam {String} sex 用户性别
     * @apiParam {int} disabled 是否启用？
     * @apiSuccessExample Success-Request:
     * {
     *     id:4
    roleId:2
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
    public CommonDTO update(UserInfo userInfo){
        return userInfoService.update(userInfo);
    }

    /**
     * @api {post} /user/delete 删除用户
     * @apiGroup UserInfo
     * @apiParam {int} id 用户id
     * @apiSuccessExample Success-Request:
     * {
     *     id:4
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
    public CommonDTO delete(UserInfo userInfo){
        return userInfoService.delete(userInfo);
    }

    /**
     * @api {get} /user/list 按页获取列表
     * @apiGroup UserInfo
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
    "id": 2,
    "roleId": 1,
    "loginCode": "oh",
    "password": "123456",
    "passwordSrc": "123456",
    "userName": "带",
    "phone": "",
    "sex": "男",
    "disabled": 0
    },
    {
    "ids": null,
    "rows": 10,
    "page": 0,
    "pageStart": 0,
    "id": 3,
    "roleId": 1,
    "loginCode": "565718",
    "password": "123",
    "passwordSrc": "123",
    "userName": "zty",
    "phone": "18320444515",
    "sex": "",
    "disabled": 0
    }
    ]
     * }
     */
    @GetMapping("/list")
    public CommonDTO getList(UserInfo userInfo){
        userInfo.setPageStart( (userInfo.getPage()-1) * userInfo.getRows() );
        return userInfoService.getListByPage(userInfo);
    }
}
