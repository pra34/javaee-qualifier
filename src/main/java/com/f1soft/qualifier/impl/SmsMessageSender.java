/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.qualifier.impl;

import com.f1soft.qualifier.interfaces.MessageSender;
import javax.inject.Named;
import javax.ws.rs.core.Response;

/**
 *
 * @author pramesh.bhattarai
 */
@Named
public class SmsMessageSender implements MessageSender {

    @Override
    public Response sendMessage() {
        
        System.out.println("-----------------------------");
        System.out.println("Sending message through SMS");
        System.out.println("-----------------------------");
        
        return Response.status(Response.Status.OK).entity("Sending message through SMS").build();
    }

}
