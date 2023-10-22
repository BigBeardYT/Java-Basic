package com.yt.exception;

public class BaseException extends RuntimeException{
    /**
     * 在一个大型项目中，可以定义新的异常类型，但是，保持一个合理的异常继承体系是非常重要的
     * 一个常见的做法是自定义一个BaseException作为“根异常”，然后派生出其他各种业务类型的异常
     */

    // 自定义的“根异常”应该提供多个构造方法
    public BaseException() {
        super();
    }
    public BaseException(String message) {
        super(message);
    }
    public BaseException(Throwable cause) {
        super(cause);
    }
    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
