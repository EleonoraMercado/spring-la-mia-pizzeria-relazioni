package it.emercado.spring_la_mia_pizzeria_crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "la_pizza")
public class PizzaModel {

	//Strategy per farlo auto increment
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min=0, max=20, message="Il nome deve contenere tra le 0 e i 20 caratteri.")
	@NotBlank(message = "Il nome della pizza è obbligatorio.")
	@Column(name = "nome", nullable = false)
	private String nome;
	
	
	@NotBlank(message = "La descrizione della pizza è obbligatoria.")
	@Column(name = "descrizione", nullable = true, unique = true)
	private String descrizione;
	
	
	@Column(name = "foto_url", nullable = false)
	private String fotoUrl;
	
	@NotNull(message = "Il prezzo della pizza è obbligatorio.")
	@Column(name = "prezzo", nullable = false)
	private double prezzo;

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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", fotoUrl=" + fotoUrl
				+ ", prezzo=" + prezzo + "]";
	}
	
	
	
}

