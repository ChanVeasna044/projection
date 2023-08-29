package com.example.projection.api.repository;

import com.example.projection.api.model.Address;
import com.example.projection.api.model.Person;
import com.example.projection.api.view.PersonDto;
import com.example.projection.api.view.PersonView;
import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person,Long> {
    PersonView findByLastName(String lastName);

    PersonDto findByFirstName(String firstName);

    <T> T findByLastName(String lastName, Class<T> type);
}
