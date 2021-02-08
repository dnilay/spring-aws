package org.example.service;
import org.example.model.Person;
import java.util.List;
public interface PersonService {
    public void addPerson(Person person);
    public void editPerson(Person person, int personId);
    public void deletePerson(int personId);
    public Person find(int personId);
    public List< Person > findAll();
}