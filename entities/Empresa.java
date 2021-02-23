package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String nomeFantasia;
	private String cnpj;
	private String insc_estadual;
	private String insc_municipal;
	private String responsavel;
	private String departamento;
	private String email;
	private String telefone_fixo;
	private boolean _delete;
	Endereco endereco = new Endereco();
	
	
	//Construtor Vazio
	public Empresa() {
	}

	//Construtor com argumentos
	public Empresa(Integer id, String nome, String nomeFantasia, String cnpj, String insc_estadual,
			String insc_municipal, String responsavel, String departamento, String email, String telefone_fixo,
			boolean _delete, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.insc_estadual = insc_estadual;
		this.insc_municipal = insc_municipal;
		this.responsavel = responsavel;
		this.departamento = departamento;
		this.email = email;
		this.telefone_fixo = telefone_fixo;
		this._delete = _delete;
		this.endereco = endereco;
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


	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getInsc_estadual() {
		return insc_estadual;
	}


	public void setInsc_estadual(String insc_estadual) {
		this.insc_estadual = insc_estadual;
	}


	public String getInsc_municipal() {
		return insc_municipal;
	}


	public void setInsc_municipal(String insc_municipal) {
		this.insc_municipal = insc_municipal;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone_fixo() {
		return telefone_fixo;
	}


	public void setTelefone_fixo(String telefone_fixo) {
		this.telefone_fixo = telefone_fixo;
	}


	public boolean is_delete() {
		return _delete;
	}


	public void set_delete(boolean _delete) {
		this._delete = _delete;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	//Método ToString da Classe.
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + ", nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj
				+ ", insc_estadual=" + insc_estadual + ", insc_municipal=" + insc_municipal + ", responsavel="
				+ responsavel + ", departamento=" + departamento + ", email=" + email + ", telefone_fixo="
				+ telefone_fixo + ", _delete=" + _delete + ", endereco=" + endereco + "]";
	}
	
	
}