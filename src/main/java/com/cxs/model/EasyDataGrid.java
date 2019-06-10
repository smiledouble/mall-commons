package com.cxs.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/3/23 11:56
 */
public class EasyDataGrid implements Serializable {
    private Long total;
    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public EasyDataGrid() {
    }

    public EasyDataGrid(Long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }
}
