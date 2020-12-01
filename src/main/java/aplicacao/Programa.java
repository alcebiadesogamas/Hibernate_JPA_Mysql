package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class Programa {

	public static void main(String[] args) {
		/*Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Alcebiades", "alcebiades@gmail.com");
		Pessoa p3 = new Pessoa(null, "Luiza", "luiza@gmail.com");
		*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		/*
		em.getTransaction().begin(); //iniciar uma transação com o bd
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); //confirma alterações no banco.
		*/
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		em.close();
		emf.close();
	}

}
