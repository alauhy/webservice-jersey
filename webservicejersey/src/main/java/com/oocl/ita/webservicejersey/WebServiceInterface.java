package com.oocl.ita.webservicejersey;

import javax.ws.rs.core.Form;
import java.text.ParseException;

public interface WebServiceInterface {
    BLDetailVO getBLDetailVO(String blNumber) throws ParseException;

    EDOStatusResponse getEDOStatusResponse(RequestEntity requestEntity);

    EDOImageResponse getEDOImageResponse(RequestEntity requestEntity);

    EDOBasicResponse getEDOFreshResponse(RequestEntity requestEntity);

    EDOBasicResponse getEDOAuthResponse(RequestEntity requestEntity);

    SIPGCustomerResponse getSIPGCustomerResponse(RequestEntity requestEntity);

    EDOBasicResponse getSIPGCustomerCancelApproveResponse(RequestEntity requestEntity);

    EDOStatusResponse getSIPGCustomerCancelApproveStatusResponse(RequestEntity requestEntity);

    SvvdObject getSvvdResponsee(String blNumber);

    EDOStatusResponse getSIPGCustomerCancelAuthorizeStatusResponse(RequestEntity requestEntity);

    EDOStatusResponse getSIPGCustomerAuthorizeStatusResponse(RequestEntity requestEntity);
}
