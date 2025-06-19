package com.skillstorm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Album;
import com.skillstorm.repositories.AlbumRepository;

@RestController
@RequestMapping("/album")
public class AlbumController {

	@Autowired
	private AlbumRepository repo;
	
	@GetMapping
	public Iterable<Album> getAllAlbums() {
		return this.repo.findAll();
	}
	
	@PostMapping
	public Album createAlbum(@RequestBody Album album) {
		return this.repo.save(album);
	}
	
}