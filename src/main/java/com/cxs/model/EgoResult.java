package com.cxs.model;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/3/23 19:02
 */
public class EgoResult {

    private Integer status;
    private String msg;
    private Object data;


    /**
     * 成功返回
     *
     * @return
     */
    public static EgoResult ok() {
        return ok(null);
    }

    public static EgoResult ok(Object data) {
        EgoResult egoResult = new EgoResult();
        egoResult.setMsg("OK");
        egoResult.setData(data);
        egoResult.setStatus(200);
        return egoResult;
    }

    /**
     * 失败返回
     *
     * @param status
     * @param msg
     * @return
     */
    public static EgoResult fail(Integer status, String msg) {
        EgoResult egoResult = new EgoResult();
        egoResult.setMsg(msg);
        egoResult.setStatus(status);
        return egoResult;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public EgoResult() {
    }

    public EgoResult(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
