package cn.dynasty.zt.yuan1024.entity;

import cn.dynasty.zt.yuan1024.annotation.ResultEnum;
import lombok.Data;

/*
 * 返回的结果对象
 */
@Data
public class Result {

    /*自定义返回编号*/
    private Integer code;

    /*返回的数据*/
    private Object data;

    /*自定义返回信息*/
    private String msg;

    /*
     * 返回成功的方法
     */
    public static Result success() {
        Result result = new Result();
        result.setCode(ResultEnum.Success.getCode());
        result.setMsg(ResultEnum.Success.getMessage());
        return result;
    }


    /*
     * 返回失败的方法
     */
    public static Result failure() {
        Result result = new Result();
        result.setCode(ResultEnum.failure.getCode());
        result.setMsg(ResultEnum.failure.getMessage());
        return result;
    }

}
