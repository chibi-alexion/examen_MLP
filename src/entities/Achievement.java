package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the achievement database table.
 * 
 */
@Entity
@NamedQuery(name="Achievement.findAll", query="SELECT a FROM Achievement a")
public class Achievement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAchievement;

	private String descriptionAchievement;

	private String nameAchievement;

	//bi-directional many-to-one association to Title
	@ManyToOne
	private Title title;

	//bi-directional many-to-one association to Item
	@ManyToOne
	private Item item;

	//bi-directional many-to-one association to Achievementofcharacter
	@OneToMany(mappedBy="achievement")
	private List<Achievementofcharacter> achievementofcharacters;

	public Achievement() {
	}

	public int getIdAchievement() {
		return this.idAchievement;
	}

	public void setIdAchievement(int idAchievement) {
		this.idAchievement = idAchievement;
	}

	public String getDescriptionAchievement() {
		return this.descriptionAchievement;
	}

	public void setDescriptionAchievement(String descriptionAchievement) {
		this.descriptionAchievement = descriptionAchievement;
	}

	public String getNameAchievement() {
		return this.nameAchievement;
	}

	public void setNameAchievement(String nameAchievement) {
		this.nameAchievement = nameAchievement;
	}

	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<Achievementofcharacter> getAchievementofcharacters() {
		return this.achievementofcharacters;
	}

	public void setAchievementofcharacters(List<Achievementofcharacter> achievementofcharacters) {
		this.achievementofcharacters = achievementofcharacters;
	}

	public Achievementofcharacter addAchievementofcharacter(Achievementofcharacter achievementofcharacter) {
		getAchievementofcharacters().add(achievementofcharacter);
		achievementofcharacter.setAchievement(this);

		return achievementofcharacter;
	}

	public Achievementofcharacter removeAchievementofcharacter(Achievementofcharacter achievementofcharacter) {
		getAchievementofcharacters().remove(achievementofcharacter);
		achievementofcharacter.setAchievement(null);

		return achievementofcharacter;
	}

}