package com.oocl.ita.webservicejersey;

import lombok.Data;

@Data
public class SvvdObject {
    private String serviceName;
    private String vesselName;
    private String voyageNumber;  //TODO
    private String direction;
}
