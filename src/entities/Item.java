package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the item database table.
 * 
 */
@Entity
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idItem;

	private int bonus;

	private int buyPrice;

	private int category_idCategory;

	private String descriptionItem;

	private String imageLinkItem;

	private int maxQuantity;

	private String nameItem;

	private byte quantityStatus;

	private int sellPrice;

	//bi-directional many-to-one association to Achievement
	@OneToMany(mappedBy="item")
	private List<Achievement> achievements;

	//bi-directional many-to-one association to Inventory
	@OneToMany(mappedBy="item")
	private List<Inventory> inventories;

	//bi-directional many-to-one association to Typeitem
	@ManyToOne
	private Typeitem typeitem;

	public Item() {
	}

	public int getIdItem() {
		return this.idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public int getBonus() {
		return this.bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBuyPrice() {
		return this.buyPrice;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getCategory_idCategory() {
		return this.category_idCategory;
	}

	public void setCategory_idCategory(int category_idCategory) {
		this.category_idCategory = category_idCategory;
	}

	public String getDescriptionItem() {
		return this.descriptionItem;
	}

	public void setDescriptionItem(String descriptionItem) {
		this.descriptionItem = descriptionItem;
	}

	public String getImageLinkItem() {
		return this.imageLinkItem;
	}

	public void setImageLinkItem(String imageLinkItem) {
		this.imageLinkItem = imageLinkItem;
	}

	public int getMaxQuantity() {
		return this.maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public String getNameItem() {
		return this.nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public byte getQuantityStatus() {
		return this.quantityStatus;
	}

	public void setQuantityStatus(byte quantityStatus) {
		this.quantityStatus = quantityStatus;
	}

	public int getSellPrice() {
		return this.sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public List<Achievement> getAchievements() {
		return this.achievements;
	}

	public void setAchievements(List<Achievement> achievements) {
		this.achievements = achievements;
	}

	public Achievement addAchievement(Achievement achievement) {
		getAchievements().add(achievement);
		achievement.setItem(this);

		return achievement;
	}

	public Achievement removeAchievement(Achievement achievement) {
		getAchievements().remove(achievement);
		achievement.setItem(null);

		return achievement;
	}

	public List<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public Inventory addInventory(Inventory inventory) {
		getInventories().add(inventory);
		inventory.setItem(this);

		return inventory;
	}

	public Inventory removeInventory(Inventory inventory) {
		getInventories().remove(inventory);
		inventory.setItem(null);

		return inventory;
	}

	public Typeitem getTypeitem() {
		return this.typeitem;
	}

	public void setTypeitem(Typeitem typeitem) {
		this.typeitem = typeitem;
	}

}