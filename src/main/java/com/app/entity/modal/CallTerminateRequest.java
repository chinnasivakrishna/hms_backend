package com.app.entity.modal;

public class CallTerminateRequest {
    private String targetId;

    public CallTerminateRequest() {
    }

    public CallTerminateRequest(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    // Getters and setters
}
