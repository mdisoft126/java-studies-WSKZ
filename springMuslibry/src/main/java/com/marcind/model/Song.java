package com.marcind.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	private String title;
	private String genre;
	private String ismn;
	private String year;
	
	@ManyToOne
	private Publisher publisher;
	
	@ManyToMany
	private Set<Artist> artists = new HashSet<>();

	
	// constructors
	public Song(String title, String genre, String ismn, String year, Publisher publisher) {
		super();
		this.title = title;
		this.genre = genre;
		this.ismn = ismn;
		this.year = year;
		this.publisher = publisher;
	}
	public Song() {
		super();
	}

	// getter and setters
	
	public String getTitle() {
		return title;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getIsmn() {
		return ismn;
	}

	public void setIsmn(String ismn) {
		this.ismn = ismn;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	
	// to string
	@Override
	public String toString() {
		return "Song [id=" + id + ", title=" + title + ", genre=" + genre + ", ismn=" + ismn + ", year=" + year
				+ ", publisher=" + publisher + ", artists=" + artists + "]";
	}

}
