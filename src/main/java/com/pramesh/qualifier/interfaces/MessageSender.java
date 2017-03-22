/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pramesh.qualifier.interfaces;

import javax.json.JsonObject;

/**
 *
 * @author pramesh.bhattarai
 */
public interface MessageSender {
    
    public JsonObject sendMessage();
    
}
