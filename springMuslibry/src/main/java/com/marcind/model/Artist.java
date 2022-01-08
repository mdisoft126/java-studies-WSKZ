package com.marcind.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lastName;
	private String nick;
	
	@ManyToMany(mappedBy = "artists")
	private Set<Song> songs = new HashSet<>();
	
	// constructors
	public Artist(String firstName, String lastName, String nick) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nick = nick;
	}
	public Artist() {
		super();
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Set<Song> getSongs() {
		return songs;
	}

	public void setSongs(Set<Song> songs) {
		this.songs = songs;
	}
	
	// to string
	@Override
	public String toString() {
		return "Artist [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nick=" + nick
				+ ", songs=" + songs + "]";
	}
	
}
