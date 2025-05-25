package com.sdev.pokehome.service;

import com.sdev.pokehome.utilities.Response;

public class TrainerService {

    public Response<String> getParty(){
        try {



            return Response.success("");
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    public Response<String> getBox(){

        return Response.success("");
    }
}
