package com.oocl.ita.webservicejersey;

import lombok.Data;

import java.util.List;

@Data
public class ContainerVO {
    private String containerNumber;
    private String sealNumber;
    private String containerSizeType;
    private List<Cargos> cargoVOS;
}
