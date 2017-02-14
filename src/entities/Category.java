package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCategory;

	private String nameCategory;

	//bi-directional many-to-one association to Halloffame
	@OneToMany(mappedBy="category")
	private List<Halloffame> halloffames;

	public Category() {
	}

	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return this.nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public List<Halloffame> getHalloffames() {
		return this.halloffames;
	}

	public void setHalloffames(List<Halloffame> halloffames) {
		this.halloffames = halloffames;
	}

	public Halloffame addHalloffame(Halloffame halloffame) {
		getHalloffames().add(halloffame);
		halloffame.setCategory(this);

		return halloffame;
	}

	public Halloffame removeHalloffame(Halloffame halloffame) {
		getHalloffames().remove(halloffame);
		halloffame.setCategory(null);

		return halloffame;
	}

}