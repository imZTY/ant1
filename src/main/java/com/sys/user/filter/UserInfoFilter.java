package com.sys.user.filter;

import com.common.entity.PageEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 用于多条件筛选的参数对象类
 * @author tianyi
 * @date 2019-03-10 16:36
 */
@Data
public class UserInfoFilter extends PageEntity implements Serializable {

    private int[] roleIds;

    private String sex;

    private Integer disabled;

    private String roleIdsStr;

    public String roleIdsToStr(){
        StringBuffer sb = new StringBuffer("");
        int len = roleIds.length;
        int i = 0;
        if (len == 0) {
            return null;
        }
        for (; i <  - 1; i++){
            sb.append(roleIds[i]+",");
        }
        if (i != 0){
            sb.append(roleIds[i]);
        }
        return sb.toString();
    }
}
