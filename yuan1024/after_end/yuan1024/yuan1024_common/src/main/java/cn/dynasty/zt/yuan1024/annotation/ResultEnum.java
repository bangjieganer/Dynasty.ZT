package cn.dynasty.zt.yuan1024.annotation;

/**
 * @description: 返回结果的枚举类
 * @author: zhaotao
 * @date: 2019-04-27 19:12
 */
public enum ResultEnum {

    /*只有code为0时才代表返回成功*/
    Success(0, "success"),

    /****************************** 系统内部错误开始 **********************************/
    failure(1, "failure"),
    ILLEGAL_OPERATION(2, "非法调用接口，如继续操作，我们将追究其法律责任。"),
    SIGN_EXPIRED(3, "请设置您的系统时间与北京时间一致"),
    TOKEN_EXPIRED(4, "你的账号可能在另一台手机上登陆"),
    /****************************** 系统内部错误结束 **********************************/

    ;


    /*枚举的状态码*/
    private int code;

    /*返回的信息*/
    private String message;

    private ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
