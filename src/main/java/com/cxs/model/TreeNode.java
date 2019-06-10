package com.cxs.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/3/23 17:06
 * 高层封装的树模型
 */
public class TreeNode implements Serializable {
    /**
     * id
     */
    private Integer id;
    /**
     * pid
     */
    private Integer pid;
    /**
     * 节点名字
     */
    private String name;
    /**
     * 是否展开
     */
    private Boolean isOpen;
    /**
     * 拓展属性
     */
    private String attr;
    /**
     * 子节点
     */
    private List<TreeNode> children;


    public TreeNode() {
    }

    public TreeNode(Integer id, Integer pid, String name, Boolean isOpen, String attr, List<TreeNode> children) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.isOpen = isOpen;
        this.attr = attr;
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean open) {
        isOpen = open;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
