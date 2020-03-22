package com.imooc.passbook.constant;

/**
 * program: merchants
 * description 错误码枚举定义
 * author: muxd
 * create: 2020-03-19 00:11
 **/
public enum ErrorCode {
    SUCCESS(0,""),
    DUPLICATE_NAME(1,"商户名称重复"),
    EMPTY_LOGO(2,"商户 logo 为空"),
    EMPTY_BUSINESS_LICENSE(3,"商户营业执照为空"),
    ERROR_PHONE(4,"商户联系电话错误"),
    EMPTY_ADDRESS(5,"商户地址为空"),
    MERCHANTS_NOT_EXIST(6,"商户不存在"),
    ;
    ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /** 错误代码 */
    private Integer code;

    /** 错误描述 */
    private String message;

    public Integer getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


}
