/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pramesh.qualifier.producer;

import com.pramesh.qualifier.interfaces.MessageSender;
import com.pramesh.qualifier.transportType.Message;
import com.pramesh.qualifier.transportType.MessageTransport;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author pramesh.bhattarai
 */
@RequestScoped
public class MessageSenderFactory implements Serializable {

    @Produces
    @Message
    public MessageSender getMessageSender(@Any Instance<MessageSender> instance, InjectionPoint injectionPoint) {

        Annotated annotated = injectionPoint.getAnnotated();
        
        // Get program element annotation of a certain annotation type (i.e MessageTransport.class)
        MessageTransport enumQualifierAnnotatin = annotated.getAnnotation(MessageTransport.class);
        
        // Return the getMessageSenderClass, which return MessageSender.class
        Class<? extends MessageSender> messageSender = enumQualifierAnnotatin.value().getMessageSenderClass();
        return instance.select(messageSender).get();
    }
}
