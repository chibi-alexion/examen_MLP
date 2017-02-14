package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the title database table.
 * 
 */
@Entity
@NamedQuery(name="Title.findAll", query="SELECT t FROM Title t")
public class Title implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTitle;

	private String nameTitle;

	//bi-directional many-to-one association to Achievement
	@OneToMany(mappedBy="title")
	private List<Achievement> achievements;

	public Title() {
	}

	public int getIdTitle() {
		return this.idTitle;
	}

	public void setIdTitle(int idTitle) {
		this.idTitle = idTitle;
	}

	public String getNameTitle() {
		return this.nameTitle;
	}

	public void setNameTitle(String nameTitle) {
		this.nameTitle = nameTitle;
	}

	public List<Achievement> getAchievements() {
		return this.achievements;
	}

	public void setAchievements(List<Achievement> achievements) {
		this.achievements = achievements;
	}

	public Achievement addAchievement(Achievement achievement) {
		getAchievements().add(achievement);
		achievement.setTitle(this);

		return achievement;
	}

	public Achievement removeAchievement(Achievement achievement) {
		getAchievements().remove(achievement);
		achievement.setTitle(null);

		return achievement;
	}

}