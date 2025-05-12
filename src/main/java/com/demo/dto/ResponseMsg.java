package com.demo.dto;

import lombok.Data;

@Data
public class ResponseMsg {
    private int code;
    private String msg = "ok";
    private Object data;

    public ResponseMsg(){

    }

    public ResponseMsg(Object data){
        this.data = data;
    }

    public static ResponseMsg ok(){
        return new ResponseMsg();
    }

    public static ResponseMsg fail(String msg){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setCode(500);
        responseMsg.setMsg(msg);
        responseMsg.setData(null);
        return responseMsg;
    }

    public static ResponseMsg ok(Object data){
        return new ResponseMsg(data);
    }

}
