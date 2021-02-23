package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int idade;
	private String cpf;
	private String identidade;
	private boolean _delete;
	
	Endereco endereco_id = new Endereco();

	// Construtor vazio;
	public Pessoa () {
	}

	
	//Construtor da classe
	public Pessoa(Integer id, String nome, int idade, String cpf, String identidade, boolean _delete,
			Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.identidade = identidade;
		this._delete = _delete;
		this.endereco_id = endereco;
	}

	
	
	//Métodos GETs e SETs da classe.
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public boolean is_delete() {
		return _delete;
	}

	public void set_delete(boolean _delete) {
		this._delete = _delete;
	}

	public Endereco getEndereco() {
		return endereco_id;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco_id = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", identidade="
				+ identidade + ", _delete=" + _delete + ", endereco_id=" + endereco_id + "]";
	}
	
	
	
}
