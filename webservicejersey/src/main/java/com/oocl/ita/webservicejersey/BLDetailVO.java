package com.oocl.ita.webservicejersey;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BLDetailVO {
    private String blNumber;
    private String scac;
    private String consigneeName;
    private String service;
    private String vesselName;
    private String voyageNumber;
    private String direction;
    private String pol;
    private String pod;
    private Date eta;
    private String lloydsNumber;
    private String placeOfDischarge;
    private String firstLegTransportation;
    private String portOfDischarge;
    private String typeOfMovement;
    private List<ContainerVO> containerVOList;
    private List<Cargos> cargoVOList;
    private String edoNumber;
    private String status;
}


