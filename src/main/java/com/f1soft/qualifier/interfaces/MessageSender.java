/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.qualifier.interfaces;

import javax.ws.rs.core.Response;

/**
 *
 * @author pramesh.bhattarai
 */
public interface MessageSender {
    
    public Response sendMessage();
    
}
