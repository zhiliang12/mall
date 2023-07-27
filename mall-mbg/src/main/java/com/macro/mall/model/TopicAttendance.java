package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;

        import io.swagger.annotations.ApiModelProperty;

public class TopicAttendance {

    @ApiModelProperty(value = "参与人数")
    private Integer attendCount;
    @ApiModelProperty(value = "参与方式")
    private String attendType;

    public TopicAttendance(Integer attendCount, String attendType) {
        this.attendCount = attendCount;
        this.attendType = attendType;
    }

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public String getAttendType() {
        return attendType;
    }

    public void setAttendType(String attendType) {
        this.attendType = attendType;
    }
}