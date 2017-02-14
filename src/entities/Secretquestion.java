package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the secretquestion database table.
 * 
 */
@Entity
@NamedQuery(name="Secretquestion.findAll", query="SELECT s FROM Secretquestion s")
public class Secretquestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSecretQuestion;

	private String question;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="secretquestion")
	private List<User> users;

	public Secretquestion() {
	}

	public int getIdSecretQuestion() {
		return this.idSecretQuestion;
	}

	public void setIdSecretQuestion(int idSecretQuestion) {
		this.idSecretQuestion = idSecretQuestion;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setSecretquestion(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setSecretquestion(null);

		return user;
	}

}