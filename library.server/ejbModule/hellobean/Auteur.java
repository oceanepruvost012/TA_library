package hellobean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Auteur {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String nom;
	private String prenom;
	
	@ManyToOne
	private Biblio biblio;
	
	@ManyToMany
	private final List<Livre> listLivres= new ArrayList<Livre>();

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

@ManyToOne
public Biblio getBiblio() {
	return biblio;
}

public void setBiblio(Biblio biblio) {
	this.biblio = biblio;
}

@ManyToMany
public List<Livre> getLivres() {
	return listLivres;
}


public void addLivre(Livre liv) {
	listLivres.add(liv);
	liv.addOneAuteur(this);
}

}
