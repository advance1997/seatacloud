package com.advance.cloud.domain;

/**
 * 返回体
 */
public class ResultFactory {

    public static  Result success(Object data){
        Result result = new Result();
        result.setSuccess(true);
        result.setData(data);
        result.setCode(Message.SUCCESS.getCode());
        result.setMsg(Message.SUCCESS.getMsg());
        return result;
    }

    public static Result success(){
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(Message.SUCCESS.getCode());
        result.setMsg(Message.SUCCESS.getMsg());
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(Message.ERROR.getCode());
        result.setMsg(Message.ERROR.getMsg());
        return result;
    }

    public static Result error(Object data){
        Result result = new Result();
        result.setSuccess(false);
        result.setData(data);
        result.setCode(Message.ERROR.getCode());
        result.setMsg(Message.ERROR.getMsg());
        return result;
    }

    public static Result error(Integer code, String msg, Object data){
        Result result = new Result();
        result.setSuccess(false);
        result.setData(data);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String msg, Object data){
        Result result = new Result();
        result.setSuccess(false);
        result.setData(data);
        result.setCode(Message.ERROR.getCode());
        result.setMsg(msg);
        return result;
    }

    public static Result error(Integer code, Object data){
        Result result = new Result();
        result.setSuccess(false);
        result.setData(data);
        result.setCode(code);
        result.setMsg(Message.ERROR.getMsg());
        return result;
    }

    public static Result failed(){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg(Message.FAILED.getMsg());
        result.setCode(Message.FAILED.getCode());
        return result;
    }

    public static Result failed(Object data){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg(Message.FAILED.getMsg());
        result.setCode(Message.FAILED.getCode());
        result.setData(data);
        return result;
    }

    public static Result failed(Integer code, String msg, Object data){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg(msg);
        result.setCode(code);
        result.setData(data);
        return result;
    }

    public static Result failed(Integer code, Object data){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg(Message.FAILED.getMsg());
        result.setCode(code);
        result.setData(data);
        return result;
    }

    public static Result failed(String msg, Object data){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg(msg);
        result.setCode(Message.FAILED.getCode());
        result.setData(data);
        return result;
    }

}
