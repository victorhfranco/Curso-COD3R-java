package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //unidade de persistencia desejada.
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario); //retira de um objeto gerênciado
		usuario.setNome("Leonardo"); //alterado nome mysql
		
		//mesmo sem o merge conseguimos realizar a alteração
		em.merge(usuario);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
