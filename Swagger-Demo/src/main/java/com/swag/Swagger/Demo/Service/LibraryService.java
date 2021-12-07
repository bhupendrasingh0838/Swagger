package com.swag.Swagger.Demo.Service;

import com.swag.Swagger.Demo.Dao.LibraryRepository;
import com.swag.Swagger.Demo.Model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository repository;


    public String createLibrary(Library library) {
        repository.save(library);
        return "Library created with Id "+ library.getLib_id();
    }

    public List<Library> getAllLibrary() {
        return (List<Library>) repository.findAll();
    }


    public Library getLibrary(int lib_id) {
        return repository.findOne(lib_id);
    }

    public List<Library> deleteLibrary(int lib_id) {
        repository.delete(lib_id);
        return repository.findAll();
    }

    public Library updateLibrary(int lib_id, Library library) {
        Library library1 = repository.findOne(lib_id);
        library1.setLibName(library.getLibName());
        repository.save(library1);
        return library1;
    }
}
