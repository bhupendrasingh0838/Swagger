package com.swag.Swagger.Demo.Dao;

import com.swag.Swagger.Demo.Model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library,Integer> {
}
