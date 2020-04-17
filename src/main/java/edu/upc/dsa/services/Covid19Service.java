package edu.upc.dsa.services;

import edu.upc.dsa.Covid19Manager;
import edu.upc.dsa.Covid19ManagerImpl;
import edu.upc.dsa.models.brote;
import edu.upc.dsa.models.caso;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/brotes", description = "Endpoint to Covid19 Service")
@Path("/brotes")
public class Covid19Service {

    private Covid19Manager covid;

    public Covid19Service() {
        this.covid = Covid19ManagerImpl.getInstance();
        if (covid.size()==0) {
            this.covid.addbrote("brote 1");
            this.covid.addbrote("brote 2");
            this.covid.addbrote("brote 3");
        }
    }

    @GET
    @ApiOperation(value = "obtener nombre todos los brotes")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = brote.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getbrotes() {

        List<brote> brotes = this.covid.allbrotes();

        GenericEntity<List<brote>> entity = new GenericEntity<List<brote>>(brotes) {};
        return Response.status(201).entity(entity).build()  ;

    }

    @POST
    @ApiOperation(value = "crear nuevo brote")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=brote.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addbrote(brote b) {

        if (b.getName()==null)  return Response.status(500).entity(b).build();
        this.covid.addbrote(b);
        return Response.status(201).entity(b).build();
    }

    @GET
    @ApiOperation(value = "obtener todos los casos de un brote")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = brote.class, responseContainer="List"),
            @ApiResponse(code = 404, message = "brote not found")
    })
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getcasos(@PathParam("name") String name) {

        List<caso> casos = this.covid.casosbrote(name);

        GenericEntity<List<caso>> entity = new GenericEntity<List<caso>>(casos) {};
        return Response.status(201).entity(entity).build()  ;
    }

}
