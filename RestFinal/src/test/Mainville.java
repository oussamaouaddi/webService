package test;
import metier.VilleMetier;
import model.Pays;
import model.Ville;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mainville {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		VilleMetier v = (VilleMetier) context.getBean("VilleMetier");
	
		//Ville b = v.getVillebyid(2) ;
		//b.setName("dakhla");;
		//v.updateVille(b);
		/*  met.deleteClient(14);  */ 
		/*
		System.out.println(b.getName()); 
		
		System.out.println("------------------------------");

		Pays p1 = b.getPays();
		
		System.out.println(p1.getName());
		
		System.out.println("---------- finished--------------------");
  */
		//System.out.println(p1);
		//int k = b.getPays().getIdPays();
		
		//Pays p = v.getPaysByVille(k);
		//System.out.println( " "+p.getName());
		
		
		
		
		}
}
