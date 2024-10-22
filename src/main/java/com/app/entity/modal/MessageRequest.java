package com.app.entity.modal;

public class MessageRequest {
    private String targetId;
    private String message;
    private String senderName;

    public MessageRequest() {
    }

    public MessageRequest(String targetId, String message, String senderName) {
        this.targetId = targetId;
        this.message = message;
        this.senderName = senderName;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    // Getters and setters
}
