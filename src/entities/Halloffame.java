package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the halloffame database table.
 * 
 */
@Entity
@NamedQuery(name="Halloffame.findAll", query="SELECT h FROM Halloffame h")
public class Halloffame implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HalloffamePK id;

	private int place;

	//bi-directional many-to-one association to Character
	@ManyToOne
	private Character character;

	//bi-directional many-to-one association to Category
	@ManyToOne
	private Category category;

	public Halloffame() {
	}

	public HalloffamePK getId() {
		return this.id;
	}

	public void setId(HalloffamePK id) {
		this.id = id;
	}

	public int getPlace() {
		return this.place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public Character getCharacter() {
		return this.character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}