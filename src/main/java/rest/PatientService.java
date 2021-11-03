package rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("patients")
public class PatientService {

    @GET
    public String getTest(){
        return "test";
    }

    @GET
    @Path("xml")
    @Produces(MediaType.APPLICATION_XML)
    public Patient getPatientXML(){
        return new Patient();
    }@GET

    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getPatientJSON(){
        return new Patient();
    }


}
