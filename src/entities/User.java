package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUser;

	private String answer;

	private String e_mail;

	private String login;

	private String password;

	//bi-directional many-to-one association to Character
	@OneToMany(mappedBy="user")
	private List<Character> characters;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	//bi-directional many-to-one association to Secretquestion
	@ManyToOne
	private Secretquestion secretquestion;

	public User() {
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getE_mail() {
		return this.e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Character> getCharacters() {
		return this.characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public Character addCharacter(Character character) {
		getCharacters().add(character);
		character.setUser(this);

		return character;
	}

	public Character removeCharacter(Character character) {
		getCharacters().remove(character);
		character.setUser(null);

		return character;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Secretquestion getSecretquestion() {
		return this.secretquestion;
	}

	public void setSecretquestion(Secretquestion secretquestion) {
		this.secretquestion = secretquestion;
	}

}