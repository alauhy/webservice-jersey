package com.oocl.ita.webservicejersey;

import lombok.Data;

import java.util.List;

@Data
public class DoImage {
    private String billNumber;
    private String consignee;
    private String forwarder;
    private String vesselName;
    private String externalVoyageNumber;
    private String Pol;
    private String Pod;
    private String Eta;
    private String dischargePlace;
    private String typeOfMovement;
    private String firstVoyage;
    private List<Container> containers;
    private List<Cargos> cargos;
}

