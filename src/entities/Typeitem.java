package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the typeitem database table.
 * 
 */
@Entity
@NamedQuery(name="Typeitem.findAll", query="SELECT t FROM Typeitem t")
public class Typeitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTypeItem;

	private String nameTypeItem;

	//bi-directional many-to-one association to Item
	@OneToMany(mappedBy="typeitem")
	private List<Item> items;

	public Typeitem() {
	}

	public int getIdTypeItem() {
		return this.idTypeItem;
	}

	public void setIdTypeItem(int idTypeItem) {
		this.idTypeItem = idTypeItem;
	}

	public String getNameTypeItem() {
		return this.nameTypeItem;
	}

	public void setNameTypeItem(String nameTypeItem) {
		this.nameTypeItem = nameTypeItem;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Item addItem(Item item) {
		getItems().add(item);
		item.setTypeitem(this);

		return item;
	}

	public Item removeItem(Item item) {
		getItems().remove(item);
		item.setTypeitem(null);

		return item;
	}

}