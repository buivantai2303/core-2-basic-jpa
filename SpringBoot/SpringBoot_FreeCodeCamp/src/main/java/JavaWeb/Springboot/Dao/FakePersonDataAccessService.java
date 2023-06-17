package JavaWeb.Springboot.Dao;
import JavaWeb.Springboot.Model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService  implements PersonDao{
    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public Optional<Person> deletePersonById(UUID id) {
        Optional<Person> personMaybe = selectPersonById(id);
        if (personMaybe.isEmpty()){
            return 0;
        }
        DB.remove(personMaybe.get());
        return 1;
    }

    // Update name of person by change ID of person
    @Override
    public int updatePersonById(UUID id, Person update) {
        return selectPersonById(id)
                .map(person -> {
                    int indexOfPersonUpdate = DB.indexOf(person);
                    if (indexOfPersonUpdate >= 0) {
                        DB.set(indexOfPersonUpdate, new Person(id, update.getName()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

}
