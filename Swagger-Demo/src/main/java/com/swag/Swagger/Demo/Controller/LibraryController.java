package com.swag.Swagger.Demo.Controller;

import com.swag.Swagger.Demo.Model.Library;
import com.swag.Swagger.Demo.Service.LibraryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/library")
@Api(value = "Library Services", description = "Library")
public class LibraryController {
    @Autowired
    LibraryService service;

    @PostMapping("/saveLibrary")
    @ApiOperation(value = "This is the Save Library  API")
    public String createLibrary(@RequestBody Library library){
        return service.createLibrary(library);
    }

    @GetMapping("/getLibrary")
    @ApiOperation(value = "This is the Get All Library API")
    public List<Library> getAllLibrary(){
        return (List<Library>) service.getAllLibrary();
    }

    @GetMapping("/getLibrary/{lib_id}")
    @ApiOperation(value = "This is the Get By Id Library API")
    public Library getLibrary(@PathVariable int lib_id){
        return service.getLibrary(lib_id);
    }

    @DeleteMapping("/deleteLibrary/{lib_id}")
    @ApiOperation(value = "The is the Delete API of Library by Id")
    public List<Library> deleteLibrary(@PathVariable int lib_id){
        return service.deleteLibrary(lib_id);
    }


    @PutMapping("/updateLibrary/{lib_id}")
    @ApiOperation(value = "This is the Update Library API by ID")
    public Library updateLibrary(@PathVariable int lib_id,@RequestBody Library library){
        service.updateLibrary(lib_id, library);
        return library;
    }
}
