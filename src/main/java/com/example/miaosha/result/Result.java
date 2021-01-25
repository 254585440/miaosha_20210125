package com.example.miaosha.result;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    /**
     * 成功时调用
     * @param data
     * @param <T>
     * @return
     */
    public static <T>Result<T> success(T data){
        return new Result<>(data);
    }

    /**
     * 失败时候调用
     * @param codeMsg
     * @param <T>
     * @return
     */
    public static <T>Result<T> error(CodeMsg codeMsg){
        return new Result<>(codeMsg);
    }

    private Result(T data){
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg codeMsg){
        if(codeMsg == null){
            return;
        }

        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

}
