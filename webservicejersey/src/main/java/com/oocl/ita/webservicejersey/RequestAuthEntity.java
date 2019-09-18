package com.oocl.ita.webservicejersey;

import lombok.Data;

@Data
public class RequestAuthEntity {
    private String lloydsNumber;
    private String externalVoyageNumber;
    private String billNumber;
    private String sipgCustomerCode;

}
