package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


import br.com.fiap.smartcities.domain.Cliente2;

public class JPATesteClienteInsert {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
			
			em.getTransaction().begin();
			
			Cliente2 novo = new Cliente2();
			novo.setCelular(22334455);
			novo.setNome("Kleber");
			novo.setCerveja("Brahma");
			novo.setConsumo(9);
			novo.setPreco(3);
			novo.setBar("Bar 1");
			
			
			
			em.persist(novo);
			
			
			em.getTransaction().commit();
			
	
		} catch (Exception e) {
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally{
			if (em != null) {
				em.close();
			}
			System.exit(0);
		}
	}
}