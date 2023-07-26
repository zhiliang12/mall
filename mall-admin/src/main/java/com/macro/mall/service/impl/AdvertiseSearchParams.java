package com.macro.mall.service.impl;

public class AdvertiseSearchParams {
    private String name;
    private Integer type;
    private String endTime;
    private Integer pageSize;
    private Integer pageNum;

    public AdvertiseSearchParams(String name, Integer type, String endTime, Integer pageSize, Integer pageNum) {
        this.name = name;
        this.type = type;
        this.endTime = endTime;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

}
