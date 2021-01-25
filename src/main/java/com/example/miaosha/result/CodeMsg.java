package com.example.miaosha.result;

import lombok.Data;

@Data
public class CodeMsg {
    private int code;
    private String msg;

    public static CodeMsg SUCCESS = new CodeMsg(0,"success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务器异常");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
