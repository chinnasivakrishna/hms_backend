package com.app.entity.modal;

public class CallAnswerRequest {
    private String to;
    private String mediaType;
    private boolean mediaStatus;

    public CallAnswerRequest() {
    }

    public CallAnswerRequest(String to, String mediaType, boolean mediaStatus) {
        this.to = to;
        this.mediaType = mediaType;
        this.mediaStatus = mediaStatus;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public boolean isMediaStatus() {
        return mediaStatus;
    }

    public void setMediaStatus(boolean mediaStatus) {
        this.mediaStatus = mediaStatus;
    }

    // Getters and setters
}
