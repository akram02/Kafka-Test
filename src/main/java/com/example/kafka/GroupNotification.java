package com.example.kafka;


import java.util.List;

public class GroupNotification {
    private List<Object> groupList;
    private String type;
    private Long time;

    public List<Object> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Object> groupList) {
        this.groupList = groupList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
