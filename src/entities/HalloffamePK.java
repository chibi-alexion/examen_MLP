package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the halloffame database table.
 * 
 */
@Embeddable
public class HalloffamePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int character_idCharacter;

	@Column(insertable=false, updatable=false)
	private int category_idCategory;

	public HalloffamePK() {
	}
	public int getCharacter_idCharacter() {
		return this.character_idCharacter;
	}
	public void setCharacter_idCharacter(int character_idCharacter) {
		this.character_idCharacter = character_idCharacter;
	}
	public int getCategory_idCategory() {
		return this.category_idCategory;
	}
	public void setCategory_idCategory(int category_idCategory) {
		this.category_idCategory = category_idCategory;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HalloffamePK)) {
			return false;
		}
		HalloffamePK castOther = (HalloffamePK)other;
		return 
			(this.character_idCharacter == castOther.character_idCharacter)
			&& (this.category_idCategory == castOther.category_idCategory);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.character_idCharacter;
		hash = hash * prime + this.category_idCategory;
		
		return hash;
	}
}