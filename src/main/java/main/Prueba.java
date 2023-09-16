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
		
		List<TbUsuario> istUsuarios =em.createQuery("Select a From TbUsuario a", TbUsuario.class).getResultList();
		System.out.println("Nro de usuarios: "+istUsuarios.size());
		System.out.println("=========listar tabla del usuario=========");

	}

}
