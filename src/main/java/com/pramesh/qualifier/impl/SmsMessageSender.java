/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pramesh.qualifier.impl;

import com.pramesh.qualifier.interfaces.MessageSender;
import com.pramesh.qualifier.response.JsonResponse;
import javax.inject.Named;
import javax.json.JsonObject;

/**
 *
 * @author pramesh.bhattarai
 */
@Named
public class SmsMessageSender implements MessageSender {

    @Override
    public JsonObject sendMessage() {

        System.out.println("-----------------------------");
        System.out.println("Sending message through SMS");
        System.out.println("-----------------------------");

        return JsonResponse.createResponse("Message send through SMS");

    }

}
