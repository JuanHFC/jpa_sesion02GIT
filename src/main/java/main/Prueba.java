package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.TbUsuario;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== PRuebas en JPA ======");
		System.out.println("INSERT A TABLA USUARIO");
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		EntityManager em = fabrica.createEntityManager();
		javax.persistence.Query query = em.createNativeQuery("{call usp_validaAcceso(?, ?)}", TbUsuario.class);
		query.setParameter(1, "U001@gmail.com");
		query.setParameter(2, "10001");
		TbUsuario  u = (TbUsuario)query.getSingleResult();
		if (u == null){
			System.out.println("Usuario no existe");
		}else
			{
				System.out.println("Bienvenido: "+u.getNomUsua());
			}
			System.out.println("_______________________________");
		

	}

}
