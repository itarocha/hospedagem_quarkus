package br.com.itarocha.chb.adapter.in.web.controller;

import br.com.itarocha.chb.domain.DestinacaoHospedagem;
import br.com.itarocha.chb.services.Service;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class GreetingController {

    @Inject
    private Service service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DestinacaoHospedagem> hello() {
        return service.teste();
    }
}