package com.olivebank.accounts.dto;

import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;
public class ErrorResponseDto {
    private String apiPath;
    private HttpStatusCode errorCode;
    private String errorMessage;
    private LocalDateTime errorTime;

    public ErrorResponseDto(String apiPath, HttpStatusCode errorCode, String errorMessage, LocalDateTime errorTime) {
        this.apiPath = apiPath;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public HttpStatusCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(HttpStatusCode errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(LocalDateTime errorTime) {
        this.errorTime = errorTime;
    }
}
