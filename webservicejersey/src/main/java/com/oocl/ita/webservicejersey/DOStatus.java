package com.oocl.ita.webservicejersey;

import lombok.Data;

@Data
public class DOStatus {
    private String blNumber;
    private String status;
    private String creationSerialNumber;
    private String creationResponse;
    private String sipgCustomerCode;
    private String authorizationSerialNumber;
    private String authorizationResponse;
    private OperationHistory operationHistory;
}
