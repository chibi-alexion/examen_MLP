package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inventory database table.
 * 
 */
@Entity
@NamedQuery(name="Inventory.findAll", query="SELECT i FROM Inventory i")
public class Inventory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InventoryPK id;

	private int quantity;

	private byte use;

	//bi-directional many-to-one association to Character
	@ManyToOne
	private Character character;

	//bi-directional many-to-one association to Item
	@ManyToOne
	private Item item;

	public Inventory() {
	}

	public InventoryPK getId() {
		return this.id;
	}

	public void setId(InventoryPK id) {
		this.id = id;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public byte getUse() {
		return this.use;
	}

	public void setUse(byte use) {
		this.use = use;
	}

	public Character getCharacter() {
		return this.character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}