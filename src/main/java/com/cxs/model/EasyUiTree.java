package com.cxs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/3/23 17:08
 * Easyui的树
 */
public class EasyUiTree implements Serializable {
    private Integer id;
    private String text;
    private String state;
    private Boolean checked;
    private String attributes;
    private List<EasyUiTree> children;

    /**
     * 高层的树转换成easyui类型的树 利用下面的构造器
     *
     * @param treeNodes
     * @return
     */
    public static List<EasyUiTree> tree2EastUiTree(List<TreeNode> treeNodes) {
        List<EasyUiTree> easyUiTrees = new ArrayList<>();
        treeNodes.forEach((treeNode) -> easyUiTrees.add(new EasyUiTree(treeNode)));
        return easyUiTrees;
    }


    /**
     * 把高层的树节点值 直接付给easyui的属性
     *
     * @param treeNode
     */
    public EasyUiTree(TreeNode treeNode) {
        this.id = treeNode.getId();
        this.text = treeNode.getName();
        this.state = treeNode.getIsOpen() ? "open" : "closed";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public List<EasyUiTree> getChildren() {
        return children;
    }

    public void setChildren(List<EasyUiTree> children) {
        this.children = children;
    }

    public EasyUiTree() {
    }

    public EasyUiTree(Integer id, String text, String state, Boolean checked, String attributes, List<EasyUiTree> children) {
        this.id = id;
        this.text = text;
        this.state = state;
        this.checked = checked;
        this.attributes = attributes;
        this.children = children;
    }

    public EasyUiTree(Integer id, String text, String state, List<EasyUiTree> children) {
        this.id = id;
        this.text = text;
        this.state = state;
        this.children = children;
    }
}
