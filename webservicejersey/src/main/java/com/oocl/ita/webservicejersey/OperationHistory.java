package com.oocl.ita.webservicejersey;

import lombok.Data;

@Data
public class OperationHistory {
    private String action;
    private String serialNumber;
    private String response;
    private String sipgCustomerCode;
}
