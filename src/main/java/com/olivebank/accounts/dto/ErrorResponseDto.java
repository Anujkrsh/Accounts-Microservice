package com.olivebank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {
    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;
    @Schema(
            description = "Error code representing the error happened"
    )
    private HttpStatusCode errorCode;

    @Schema(
            description = "Error message representing the error happened"
    )
    private String errorMessage;
    @Schema(
            description = "Time representing when the error happened"
    )
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
