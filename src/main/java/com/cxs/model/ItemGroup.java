package com.cxs.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/3/26 11:30
 */
public class ItemGroup implements Serializable {

    private Integer catId;
    private String group;
    private List<Object> params;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Object> getParams() {
        return params;
    }

    public void setParams(List<Object> params) {
        this.params = params;
    }

    public ItemGroup() {
    }

    public ItemGroup(Integer catId, String group, List<Object> params) {
        this.catId = catId;
        this.group = group;
        this.params = params;
    }
}
