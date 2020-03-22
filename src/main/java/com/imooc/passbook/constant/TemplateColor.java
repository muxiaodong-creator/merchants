package com.imooc.passbook.constant;

/**
 * program: merchants
 * <p>
 * description
 * <p>
 * author: muxd
 * <p>
 * create: 2020-03-19 00:04
 **/
public enum TemplateColor {
    RED(1,"红色"),
    GREEN(2,"绿色"),
    BLUE(3,"蓝色"),
    ;


    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    /** 颜色代码 */
    private Integer code;

    /** 颜色描述 */
    private String color;

    public Integer getCode() {
        return code;
    }



    public String getColor() {
        return color;
    }


}
