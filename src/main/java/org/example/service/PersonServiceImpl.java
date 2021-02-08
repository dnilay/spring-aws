package org.example.service;
import org.example.dao.PersonDao;
import org.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service("personService")
public class PersonServiceImpl implements PersonService {
    private PersonDao personDao;
    @Autowired
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }
    public void addPerson(Person person) {
        personDao.addPerson(person);
 
    }
    public void editPerson(Person person, int personId) {
        personDao.editPerson(person, personId);
    }
    public void deletePerson(int personId) {
        personDao.deletePerson(personId);
    }
    public Person find(int personId) {
        return personDao.find(personId);
    }
    public List< Person > findAll() {
        return personDao.findAll();
    }
}