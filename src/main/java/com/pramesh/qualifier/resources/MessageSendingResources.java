/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pramesh.qualifier.resources;

import com.pramesh.qualifier.interfaces.MessageSender;
import com.pramesh.qualifier.transportType.Message;
import com.pramesh.qualifier.transportType.MessageTransport;
import com.pramesh.qualifier.transportType.MessageTransportType;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author pramesh.bhattarai
 */
@Path("sending")
public class MessageSendingResources {

    @Inject
    @Message
    @MessageTransport(MessageTransportType.Email)
    private MessageSender emailSender;

    @Inject
    @Message
    @MessageTransport(MessageTransportType.Sms)
    private MessageSender smsSender;

    @GET
    @Path("sms")
    public Response sendSmsMessage() {
        return Response.ok().entity(smsSender.sendMessage()).build();
    }

    @GET
    @Path("email")
    public Response sendEmailMessage() {
        return Response.ok().entity(emailSender.sendMessage()).build();
    }

}
