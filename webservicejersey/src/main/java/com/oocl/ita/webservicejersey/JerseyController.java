package com.oocl.ita.webservicejersey;

import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Map;

/*
 * 所有注册的端点都应该被@Components和HTTP资源annotations（比如@GET）注解。
 * 1、因为是@Component，所以其生命周期受Spring管理。
 * 		并且你可以使用@Autowired添加依赖及使用@Value注入外部配置。
 */
//@Component
@RestController
@Path("/jersey")
public class JerseyController {
    @Autowired
    private WebServiceInterface webServiceInterface;

    @GET
    @Path("/get/{blNumber}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public BLDetailVO getBLDetailVO(@PathParam("blNumber") String blNumber) throws ParseException {
        return webServiceInterface.getBLDetailVO(blNumber);
    }
    @POST
    @Path("/post")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public EDOStatusResponse getEDOStatusResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getEDOStatusResponse(requestEntity);
    }
    @POST
    @Path("/api/EDO/SHA/DoImage")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public EDOImageResponse getEDOImageResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getEDOImageResponse(requestEntity);
    }

    @POST
    @Path("/api/EDO/SHA/Refresh")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public EDOBasicResponse getEDORefreshResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getEDOFreshResponse(requestEntity);
    }
    @POST
    @Path("/api/EDO/SHA/Authorize")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public EDOBasicResponse getEDOAuthResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getEDOAuthResponse(requestEntity);
    }
    @GET
    @Path("/api/EDO/SHA/SIPGCustomerList")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public SIPGCustomerResponse getSIPGCustomerResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getSIPGCustomerResponse(requestEntity);
    }

    @POST
    @Path("/api/EDO/SHA/Approve/Cancel")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public EDOBasicResponse getSIPGCustomerCancelApproveResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getSIPGCustomerCancelApproveResponse(requestEntity);
    }

    @POST
    @Path("/api/EDO/SHA/Approve/Cancel/Status")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public EDOStatusResponse getSIPGCustomerCancelApproveStatusResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getSIPGCustomerCancelApproveStatusResponse(requestEntity);
    }
    @GET
    @Path("/svvd/bl/{blNumber}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public SvvdObject getSvvdResponse(@PathParam("blNumber") String blNumber){
        return webServiceInterface.getSvvdResponsee(blNumber);
    }

    @POST
    @Path("/api/EDO/SHA/Authorize/Cancel/Status")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public EDOStatusResponse getSIPGCustomerCancelAuthorizeStatusResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getSIPGCustomerCancelAuthorizeStatusResponse(requestEntity);
    }

    @POST
    @Path("/api/EDO/SHA/Authorize/status")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public EDOStatusResponse getSIPGCustomerAuthorizeStatusResponse(@RequestBody RequestEntity requestEntity){
        return webServiceInterface.getSIPGCustomerAuthorizeStatusResponse(requestEntity);
    }
}
