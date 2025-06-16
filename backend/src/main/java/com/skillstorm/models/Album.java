package com.skillstorm.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column
	public String title;
	
	@Column
	public String artist;

	public Album() {
		super();
	}

	public Album(int id, String title, String artist) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
}
