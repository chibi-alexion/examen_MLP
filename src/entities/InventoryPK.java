package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the inventory database table.
 * 
 */
@Embeddable
public class InventoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int character_idCharacter;

	@Column(insertable=false, updatable=false)
	private int item_idItem;

	public InventoryPK() {
	}
	public int getCharacter_idCharacter() {
		return this.character_idCharacter;
	}
	public void setCharacter_idCharacter(int character_idCharacter) {
		this.character_idCharacter = character_idCharacter;
	}
	public int getItem_idItem() {
		return this.item_idItem;
	}
	public void setItem_idItem(int item_idItem) {
		this.item_idItem = item_idItem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InventoryPK)) {
			return false;
		}
		InventoryPK castOther = (InventoryPK)other;
		return 
			(this.character_idCharacter == castOther.character_idCharacter)
			&& (this.item_idItem == castOther.item_idItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.character_idCharacter;
		hash = hash * prime + this.item_idItem;
		
		return hash;
	}
}