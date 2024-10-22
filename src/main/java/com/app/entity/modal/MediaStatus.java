package com.app.entity.modal;

public class MediaStatus {
    private String mediaType;
    private boolean isActive;

    public MediaStatus() {
    }

    public MediaStatus(String mediaType, boolean isActive) {
        this.mediaType = mediaType;
        this.isActive = isActive;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Getters and setters
}
