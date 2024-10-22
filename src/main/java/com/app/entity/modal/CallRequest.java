package com.app.entity.modal;

public class CallRequest {
    private String targetId;
    private String signalData;
    private String senderId;
    private String senderName;

    public CallRequest() {
    }

    public CallRequest(String targetId, String signalData, String senderId, String senderName) {
        this.targetId = targetId;
        this.signalData = signalData;
        this.senderId = senderId;
        this.senderName = senderName;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getSignalData() {
        return signalData;
    }

    public void setSignalData(String signalData) {
        this.signalData = signalData;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    // Getters and setters
}
