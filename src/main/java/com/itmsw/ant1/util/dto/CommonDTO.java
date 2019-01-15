package com.itmsw.ant1.util.dto;

import lombok.Data;

/**
 * 通用返回模板
 * @author tianyi
 * @date 2018-04-29 01:52
 */
@Data
public class CommonDTO<T> {

    /** 错误码. */
    private Integer resultCode;

    /** 提示信息. */
    private String resultMsg;

    /* 内容主体 */
    private T data;
}
