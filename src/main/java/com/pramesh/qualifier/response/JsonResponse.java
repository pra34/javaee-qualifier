/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pramesh.qualifier.response;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.core.Response;

/**
 *
 * @author prames
 */
public class JsonResponse {

    public static JsonObject createResponse(String message) {
        JsonObject response;
        response = Json.createObjectBuilder()
                .add("message", message)
                .add("status", "OK")
                .add("statusCode", Response.Status.OK.getStatusCode())
                .build();
        return response;
    }
}
