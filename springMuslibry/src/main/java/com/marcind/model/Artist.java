package com.marcind.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"id"})
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
}
