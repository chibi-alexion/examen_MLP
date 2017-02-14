package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achievementofcharacter database table.
 * 
 */
@Embeddable
public class AchievementofcharacterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int character_idCharacter;

	@Column(insertable=false, updatable=false)
	private int achievement_idAchievement;

	public AchievementofcharacterPK() {
	}
	public int getCharacter_idCharacter() {
		return this.character_idCharacter;
	}
	public void setCharacter_idCharacter(int character_idCharacter) {
		this.character_idCharacter = character_idCharacter;
	}
	public int getAchievement_idAchievement() {
		return this.achievement_idAchievement;
	}
	public void setAchievement_idAchievement(int achievement_idAchievement) {
		this.achievement_idAchievement = achievement_idAchievement;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchievementofcharacterPK)) {
			return false;
		}
		AchievementofcharacterPK castOther = (AchievementofcharacterPK)other;
		return 
			(this.character_idCharacter == castOther.character_idCharacter)
			&& (this.achievement_idAchievement == castOther.achievement_idAchievement);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.character_idCharacter;
		hash = hash * prime + this.achievement_idAchievement;
		
		return hash;
	}
}