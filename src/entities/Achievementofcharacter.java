package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achievementofcharacter database table.
 * 
 */
@Entity
@NamedQuery(name="Achievementofcharacter.findAll", query="SELECT a FROM Achievementofcharacter a")

public class Achievementofcharacter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchievementofcharacterPK id;

	private int place;

	//bi-directional many-to-one association to Character
	@ManyToOne
	private Character character;

	//bi-directional many-to-one association to Achievement
	@ManyToOne
	private Achievement achievement;

	public Achievementofcharacter() {
	}

	public AchievementofcharacterPK getId() {
		return this.id;
	}

	public void setId(AchievementofcharacterPK id) {
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

	public Achievement getAchievement() {
		return this.achievement;
	}

	public void setAchievement(Achievement achievement) {
		this.achievement = achievement;
	}

}