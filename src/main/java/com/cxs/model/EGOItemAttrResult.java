package com.cxs.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/3/26 13:57
 */
public class EGOItemAttrResult implements Serializable {

    private Integer status;

    private Map<String, List<ItemGroup>> data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Map<String, List<ItemGroup>> getData() {
        return data;
    }

    public void setData(Map<String, List<ItemGroup>> data) {
        this.data = data;
    }

    public EGOItemAttrResult() {
    }

    public EGOItemAttrResult(Integer status, Map<String, List<ItemGroup>> data) {
        this.status = status;
        this.data = data;
    }
}
