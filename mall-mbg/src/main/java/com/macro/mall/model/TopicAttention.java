package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;

public class TopicAttention {

    @ApiModelProperty(value = "关注人数")
    private Integer attentionCount;

    public TopicAttention(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    public Integer getAttentionCount() {
        return attentionCount;
    }

    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }
}