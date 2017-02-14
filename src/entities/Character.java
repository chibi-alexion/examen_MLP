package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the character database table.
 * 
 */
@Entity
@NamedQuery(name="Character.findAll", query="SELECT c FROM Character c")
public class Character implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCharacter;

	private int experience;

	private int gold;

	private int hitPointCharacter;

	private int level;

	private String nameCharacter;

	private byte sexe;

	private byte statusCharacter;

	//bi-directional many-to-one association to Achievementofcharacter
	@OneToMany(mappedBy="character")
	private List<Achievementofcharacter> achievementofcharacters;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	//bi-directional many-to-one association to Classe
	@ManyToOne
	private Classe classe;

	//bi-directional many-to-one association to Race
	@ManyToOne
	private Race race;

	//bi-directional many-to-one association to Halloffame
	@OneToMany(mappedBy="character")
	private List<Halloffame> halloffames;

	//bi-directional many-to-one association to Inventory
	@OneToMany(mappedBy="character")
	private List<Inventory> inventories;

	public Character() {
	}

	public int getIdCharacter() {
		return this.idCharacter;
	}

	public void setIdCharacter(int idCharacter) {
		this.idCharacter = idCharacter;
	}

	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getGold() {
		return this.gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getHitPointCharacter() {
		return this.hitPointCharacter;
	}

	public void setHitPointCharacter(int hitPointCharacter) {
		this.hitPointCharacter = hitPointCharacter;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getNameCharacter() {
		return this.nameCharacter;
	}

	public void setNameCharacter(String nameCharacter) {
		this.nameCharacter = nameCharacter;
	}

	public byte getSexe() {
		return this.sexe;
	}

	public void setSexe(byte sexe) {
		this.sexe = sexe;
	}

	public byte getStatusCharacter() {
		return this.statusCharacter;
	}

	public void setStatusCharacter(byte statusCharacter) {
		this.statusCharacter = statusCharacter;
	}

	public List<Achievementofcharacter> getAchievementofcharacters() {
		return this.achievementofcharacters;
	}

	public void setAchievementofcharacters(List<Achievementofcharacter> achievementofcharacters) {
		this.achievementofcharacters = achievementofcharacters;
	}

	public Achievementofcharacter addAchievementofcharacter(Achievementofcharacter achievementofcharacter) {
		getAchievementofcharacters().add(achievementofcharacter);
		achievementofcharacter.setCharacter(this);

		return achievementofcharacter;
	}

	public Achievementofcharacter removeAchievementofcharacter(Achievementofcharacter achievementofcharacter) {
		getAchievementofcharacters().remove(achievementofcharacter);
		achievementofcharacter.setCharacter(null);

		return achievementofcharacter;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Classe getClasse() {
		return this.classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Race getRace() {
		return this.race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public List<Halloffame> getHalloffames() {
		return this.halloffames;
	}

	public void setHalloffames(List<Halloffame> halloffames) {
		this.halloffames = halloffames;
	}

	public Halloffame addHalloffame(Halloffame halloffame) {
		getHalloffames().add(halloffame);
		halloffame.setCharacter(this);

		return halloffame;
	}

	public Halloffame removeHalloffame(Halloffame halloffame) {
		getHalloffames().remove(halloffame);
		halloffame.setCharacter(null);

		return halloffame;
	}

	public List<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public Inventory addInventory(Inventory inventory) {
		getInventories().add(inventory);
		inventory.setCharacter(this);

		return inventory;
	}

	public Inventory removeInventory(Inventory inventory) {
		getInventories().remove(inventory);
		inventory.setCharacter(null);

		return inventory;
	}

}