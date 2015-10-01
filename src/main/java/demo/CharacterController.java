package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
class CharacterController {

    @Autowired
    private CharacterRepository repository;

    @RequestMapping("/characters")
    List<Character> characters() {
        return repository.findAll();
    }

    @RequestMapping(value = "/characters/{id}", method = RequestMethod.GET)
    Character get(@PathVariable("id") Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(value = "/characters/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable("id") Integer id) {
        repository.delete(id);
    }
}