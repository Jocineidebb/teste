package com.danielfireman.ifal.calcapi;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import io.jooby.annotations.PathParam;
import io.jooby.exception.BadRequestException;

@Path("/div/{op}")
public class Divisao {

    @GET
    public double calculaRaiz(@PathParam("op") String op, @PathParam("po") String po) {
        try {
            return(Double.parseDouble(op)/Double.parseDouble(po));
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Parâmetro inválido: " + op);
            throw new BadRequestException("Parâmetro inválido: " + po);
        }
    }
}