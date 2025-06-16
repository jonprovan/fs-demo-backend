package com.skillstorm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Album;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer> {

}
