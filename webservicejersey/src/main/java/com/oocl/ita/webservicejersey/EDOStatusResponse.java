package com.oocl.ita.webservicejersey;

import lombok.Data;

@Data
public class EDOStatusResponse {
    private int statusCode;
    private String statusMessage;
    private DOStatus data;
}
