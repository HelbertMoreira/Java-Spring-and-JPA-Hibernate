package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Endereco;
import entities.Pessoa;

public class Nexus {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nexus-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Instanciando objeto da classe "Pessoa" e passando os argumentos, incluindo objeto "Endereço" dentro dos argumentos do objeto Pessoa
		Pessoa p1 = new Pessoa(null, "Joao Manuel", 25, "000.000.000-00", "MG 99.999.999", false, new Endereco(null, "logradouro", 240, "complemento", "bairro", "cidade",
				"MG", "cep", false));
		Pessoa p2 = new Pessoa(null, "Maria Eugênia", 18, "000.000.000-00", "MG 88.888.888", false, new Endereco(null, "logradouro", 300, "complemento", "bairro", "cidade",
				"MG", "cep", false));
		
		//Inserir pessoa no banco
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();
		
		//Buscar pessoa no banco
		Pessoa p = em.find(Pessoa.class, 2);
		
		
		/*Para remover um objeto do banco de dados, esse objeto tem que estar monitorado (e não destacado).
		 * Para que consigamos isso sem problemas devemos seguir o código abaixo*/
		
		//--> Objeto monitorado é um objeto que vc acabou de inserir ou de buscar no banco de dados. <--
		
		p2 = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p2);
		em.getTransaction().commit();
		
		//Imprimindo no console o resultado!
		System.out.println(p);
		
		System.out.println("Realizado com sucesso!");
	}

}
