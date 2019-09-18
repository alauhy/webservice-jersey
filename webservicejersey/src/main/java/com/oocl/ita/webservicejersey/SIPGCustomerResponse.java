package com.oocl.ita.webservicejersey;

import lombok.Data;

@Data
public class SIPGCustomerResponse {
    private int statusCode;
    private String statusMessage;
    private SIPGCustomer data;

}
