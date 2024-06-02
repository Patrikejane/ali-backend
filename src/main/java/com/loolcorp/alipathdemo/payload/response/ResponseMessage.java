package com.loolcorp.alipathdemo.payload.response;

/**
 * @author sskma
 * @Created 02/06/2024 - 3:57 PM
 * @project alipathdemo
 */
public class ResponseMessage {

    private String message;

    public ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
