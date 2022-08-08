package br.com.fiap.smartcities.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fiap.smartcities.domain.Cliente2;

public class JPATesteClienteRead {

	public static void main(String[] args) {

		
		EntityManager em = null;

		try { 
		
			int idProcurado = 22001101;
			
			em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
			Cliente2 cliente = em.find(Cliente2.class, idProcurado);

			System.out.println("Nome Cliente: " + cliente.getNome());
			System.out.println("Celular Cliente: " + cliente.getCelular());
			System.out.println("Bar: " + cliente.getBar());
			System.out.println("Cerveja consumida: " + cliente.getCerveja());
			System.out.println("Quantidade consumida: " + cliente.getConsumo()+" Litros");
			System.out.println("Preço do litro: " + cliente.getPreco()+" Reais");
			System.out.println("Data de consumo: " + cliente.getDataCriacao());
			System.out.println("Total a pagar: " + cliente.getTotal()+" Reais");
			System.out.println("Consumo médio: " + cliente.getMedia_consumo()+" Litros");
			System.out.println("Preco cerveja médio: " + cliente.getMedia_gasto()+" Reais");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
	}

}
