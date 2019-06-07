package com.tutorial.h2.SpringBootH2Integration;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {}
