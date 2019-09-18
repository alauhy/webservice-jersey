package com.oocl.ita.webservicejersey;

import lombok.Data;


@Data
public class EDOImageResponse {
    private int statusCode;
    private String statusMessage;
    private DoImage data;
}
