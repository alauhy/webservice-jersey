package com.oocl.ita.webservicejersey;

import lombok.Data;

@Data
public class Cargos {
    private String containerNumber;
    private int sequence;
    private String marks;
    private String description;
    private String packageUnit;
    private int packageCount;
    private String grossWeightUnit;
    private double grossWeight;
    private String volumeUnit;
    private double volume;
}
