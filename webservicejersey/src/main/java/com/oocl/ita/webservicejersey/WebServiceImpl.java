package com.oocl.ita.webservicejersey;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;


@Service
public class WebServiceImpl implements WebServiceInterface {
    private static int i = 0;
    private static int j = 0;

    @Override
    public SIPGCustomerResponse getSIPGCustomerResponse(RequestEntity requestEntity) {
        SIPGCustomerResponse sipgCustomerResponse = new SIPGCustomerResponse();
        sipgCustomerResponse.setStatusMessage("ok");
        sipgCustomerResponse.setStatusCode(0);
        SIPGCustomer sipgCustomer = new SIPGCustomer();
        sipgCustomer.setCUSCODE("000001");
        sipgCustomerResponse.setData(sipgCustomer);
        return sipgCustomerResponse;
    }

    @Override
    public EDOBasicResponse getSIPGCustomerCancelApproveResponse(RequestEntity requestEntity) {
        EDOBasicResponse edoBasicResponse = new EDOBasicResponse();
        edoBasicResponse.setStatusCode(0);
        edoBasicResponse.setStatusMessage("ok");
        return edoBasicResponse;
    }

    @Override
    public SvvdObject getSvvdResponsee(String blNumber) {
        System.out.println(blNumber);
        SvvdObject svvdObject = new SvvdObject();
        if (blNumber.equals("2624745720")) {
            svvdObject.setDirection("E");
            svvdObject.setVesselName("ATLANTIS");
            svvdObject.setServiceName("aaa");
            svvdObject.setVoyageNumber("110");
            return svvdObject;
        } else if (blNumber.equals("7894561230")) {
            svvdObject.setDirection("E");
            svvdObject.setVesselName("MELIGO");
            svvdObject.setServiceName("aaa");
            svvdObject.setVoyageNumber("040");
            return svvdObject;
        } else if (blNumber.equals("7418529630")) {
            svvdObject.setDirection("W");
            svvdObject.setVesselName("YELLOT");
            svvdObject.setServiceName("aaa");
            svvdObject.setVoyageNumber("051");
            return svvdObject;
        } else if (blNumber.equals("1234567890")) {
            svvdObject.setDirection("E");
            svvdObject.setVesselName("SUNNY");
            svvdObject.setServiceName("aaa");
            svvdObject.setVoyageNumber("121");
            return svvdObject;

        } else {
            return null;
        }
    }

    @Override
    public EDOStatusResponse getSIPGCustomerCancelApproveStatusResponse(RequestEntity requestEntity) {
        EDOStatusResponse edoStatusResponse = new EDOStatusResponse();
        edoStatusResponse.setStatusCode(0);
        edoStatusResponse.setStatusMessage("ok");
        DOStatus doStatus = new DOStatus();
        doStatus.setBlNumber(requestEntity.getBillNumber());
        doStatus.setStatus("cancelled");
        edoStatusResponse.setData(doStatus);
        OperationHistory operationHistory = new OperationHistory();
        operationHistory.setResponse("aaa");
        doStatus.setOperationHistory(operationHistory);
        return edoStatusResponse;
    }

    @Override
    public EDOBasicResponse getEDOAuthResponse(RequestEntity requestEntity) {
        EDOBasicResponse edoBasicResponse = new EDOBasicResponse();
        edoBasicResponse.setStatusCode(0);
        edoBasicResponse.setStatusMessage("ok");
        return edoBasicResponse;
    }

    @Override
    public EDOStatusResponse getSIPGCustomerAuthorizeStatusResponse(RequestEntity requestEntity) {
        EDOStatusResponse edoStatusResponse = new EDOStatusResponse();
        edoStatusResponse.setStatusCode(0);
        edoStatusResponse.setStatusMessage("ok");
        DOStatus doStatus = new DOStatus();
        doStatus.setBlNumber(requestEntity.getBillNumber());
        System.out.println(j);
        j++;
        if (j % 3 == 1) {
            doStatus.setStatus("created");
        } else if (j % 3 == 2) {
            doStatus.setStatus("authorized");
        } else {
            doStatus.setStatus("other");
        }
        edoStatusResponse.setData(doStatus);
        OperationHistory operationHistory = new OperationHistory();
        operationHistory.setResponse("aaa");
        doStatus.setOperationHistory(operationHistory);
        return edoStatusResponse;
    }

    @Override
    public EDOStatusResponse getSIPGCustomerCancelAuthorizeStatusResponse(RequestEntity requestEntity) {
        EDOStatusResponse edoStatusResponse = new EDOStatusResponse();
        edoStatusResponse.setStatusCode(0);
        edoStatusResponse.setStatusMessage("ok");
        DOStatus doStatus = new DOStatus();
        doStatus.setBlNumber(requestEntity.getBillNumber());
        System.out.println(j);
        j++;
        if (j % 3 == 1) {
            doStatus.setStatus("created");
        } else if (j % 3 == 2) {
            doStatus.setStatus("authorized");
        } else {
            doStatus.setStatus("other");
        }
        edoStatusResponse.setData(doStatus);
        OperationHistory operationHistory = new OperationHistory();
        operationHistory.setResponse("aaa");
        doStatus.setOperationHistory(operationHistory);
        return edoStatusResponse;
    }

    @Override
    public EDOBasicResponse getEDOFreshResponse(RequestEntity requestEntity) {
        EDOBasicResponse edoBasicResponse = new EDOBasicResponse();
        edoBasicResponse.setStatusCode(0);
        edoBasicResponse.setStatusMessage("ok");
        return edoBasicResponse;
    }

    @Override
    public EDOImageResponse getEDOImageResponse(RequestEntity requestEntity) {
        EDOImageResponse edoImageResponse = new EDOImageResponse();
        edoImageResponse.setStatusCode(0);
        edoImageResponse.setStatusMessage("ok");
        DoImage doImage = new DoImage();
        doImage.setBillNumber(requestEntity.getBillNumber());
        doImage.setConsignee("易购百货有限公司");
        doImage.setForwarder("");
        doImage.setVesselName("MELIGO");
        doImage.setExternalVoyageNumber("040E");
        doImage.setPol("Hong Kong");
        doImage.setPod("Shanghai");
        doImage.setEta("2019-08-21 12:00:00");
        doImage.setDischargePlace("冠东集箱");
        doImage.setFirstVoyage("BAL BOAN 040E");
        doImage.setTypeOfMovement("FCL/FCL");
        Container container = new Container();
        container.setContainerNumber("OOLU8499280");
        container.setSealNumber("LC804075");
        Container container1 = new Container();
        container1.setContainerNumber("OOLU8499281");
        container1.setSealNumber("LC804076");
        Container container2 = new Container();
        container2.setContainerNumber("OOLU8499282");
        container2.setSealNumber("LC804077");
        doImage.setContainers(Arrays.asList(container, container1, container2));
        Cargos cargos = new Cargos();
        Cargos cargos1 = new Cargos();
        Cargos cargos2 = new Cargos();
        Cargos cargos3 = new Cargos();
        createCargo(cargos,"OOLU8499280","1X40HQ CONTAINER S.T.C. Motion Actuator");
        createCargo(cargos1,"OOLU8499281","1X40HQ CONTAINER A.L.F. Seafood");
        createCargo(cargos2,"OOLU8499282","1X40HQ CONTAINER S.L.F. Clothes");
        createCargo(cargos3,"OOLU8499282","1X40HQ CONTAINER C.T.C. Toys");
        doImage.setCargos(Arrays.asList(cargos, cargos1, cargos2, cargos3));
        edoImageResponse.setData(doImage);
        return edoImageResponse;
    }

    private void createCargo(Cargos cargos, String containerNumber,String desc) {
        cargos.setContainerNumber(containerNumber);
        cargos.setSequence(1);
        cargos.setMarks("IS76M015/80S21001");
        cargos.setDescription(desc);
        cargos.setPackageUnit("Crate");
        cargos.setPackageCount(2);
        cargos.setGrossWeightUnit("KG");
        cargos.setGrossWeight(565.000);
        cargos.setVolumeUnit("CBM");
        cargos.setVolume(314.000);
    }

    @Override
    public EDOStatusResponse getEDOStatusResponse(RequestEntity requestEntity) {
        EDOStatusResponse edoStatusResponse = new EDOStatusResponse();
        edoStatusResponse.setStatusCode(0);
        edoStatusResponse.setStatusMessage("ok");
        DOStatus doStatus = new DOStatus();
        doStatus.setBlNumber(requestEntity.getBillNumber());
        System.out.println(i);
        i++;
        if (i % 2 == 0) {
            doStatus.setStatus("created");
        } else {
            doStatus.setStatus("authorized");
        }
        edoStatusResponse.setData(doStatus);
        OperationHistory operationHistory = new OperationHistory();
        operationHistory.setResponse("aaa");
        doStatus.setOperationHistory(operationHistory);
        return edoStatusResponse;
    }

    @Override
    public BLDetailVO getBLDetailVO(String blNumber) throws ParseException {
        BLDetailVO blDetailVO = new BLDetailVO();
        blDetailVO.setBlNumber(blNumber);
        blDetailVO.setConsigneeName("易购百货有限公司");
        blDetailVO.setScac("OOLU");
        blDetailVO.setService("aaa");
        blDetailVO.setVesselName("MELIGO");
        blDetailVO.setVoyageNumber("040");
        blDetailVO.setDirection("E");
        blDetailVO.setPol("Hong Kong");
        blDetailVO.setPod("Shanghai");
        blDetailVO.setEta(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-09-12 08:12:11"));
        blDetailVO.setLloydsNumber("9795622");
        blDetailVO.setPlaceOfDischarge("冠东集箱");
        blDetailVO.setFirstLegTransportation("BAL BOAN 040E");
        blDetailVO.setPortOfDischarge("Shangha");
        blDetailVO.setTypeOfMovement("FCL/FCL");
        ContainerVO container = new ContainerVO();
        container.setContainerNumber("OOLU8499280");
        container.setSealNumber("LC804075");
        container.setContainerSizeType("40HQ");
        ContainerVO container1 = new ContainerVO();
        container1.setContainerNumber("OOLU8499281");
        container1.setSealNumber("LC804076");
        container1.setContainerSizeType("40HQ");
        ContainerVO container2 = new ContainerVO();
        container2.setContainerNumber("OOLU8499282");
        container2.setSealNumber("LC804077");
        container2.setContainerSizeType("40HQ");


        Cargos cargos = new Cargos();
        Cargos cargos1 = new Cargos();
        Cargos cargos2 = new Cargos();
        Cargos cargos3 = new Cargos();
        createCargo(cargos,"OOLU8499280","1X40HQ CONTAINER S.T.C. Motion Actuator");
        createCargo(cargos1,"OOLU8499281","1X40HQ CONTAINER A.L.F. Seafood");
        createCargo(cargos2,"OOLU8499282","1X40HQ CONTAINER S.L.F. Clothes");
        createCargo(cargos3,"OOLU8499282","1X40HQ CONTAINER C.T.C. Toys");
        blDetailVO.setContainerVOList(Arrays.asList(container, container1, container2));

        blDetailVO.setCargoVOList(Arrays.asList(cargos, cargos1, cargos2, cargos3));
        return blDetailVO;
    }
}
