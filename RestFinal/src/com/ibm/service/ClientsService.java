package com.ibm.service;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.ClientsMetier;
import model.Clients;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/ClientsService")
public class ClientsService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	ClientsMetier met = (ClientsMetier) context.getBean("ClientsMetier");

	@GET
	@Path("/Clients")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Clients> getallClients() {
		return met.getallClientss();
	}

	@GET
	@Path("/Clients/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Clients> getClientbyid(@PathParam(value = "id") int id) {
		return met.getClientsbyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteClients(id);
		 return "bien supprim�";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		//Clients c = met.getClientsbyid(id);
		//c.setVille(ville);
		// met.updateClients(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Clients")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addClients(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	@GET
	@Path("/Clients/image/{id}/{nom}")
	@Produces(MediaType.APPLICATION_JSON)
	public void imageClients(@PathParam(value = "id") int id,@PathParam(value = "nom") String nom) throws IOException, SQLException {
		
		String a = new File("").getAbsolutePath();
		String b=a+"\\photosClients";
    	File dir = new File (b);
    	dir.mkdirs();
		 met.imageClients(id, nom, b);
	    	System.out.println(b);
		 System.out.println("image bien enregisré");
	
		// picture po = new picture();
		  //po.draw(b);
	
		  return ;
			
	}
	
}
