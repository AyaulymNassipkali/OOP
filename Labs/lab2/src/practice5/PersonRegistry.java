package practice5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people; // коллекция для хранения людей

    public PersonRegistry() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (person == null) {
            System.out.println("Cannot add null person");
            return;
        }
        people.add(person);
        System.out.println("Added: " + person.getName());
    }

    public void removePerson(Person person) {
        if (people.remove(person)) {
            System.out.println("Removed: " + person.getName());
        } else {
            System.out.println("Person not found: " + person.getName());
        }
    }

    public List<Person> findPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (!person.hasPet() && !person.hasTemporaryPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findPeopleWithTemporaryPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasTemporaryPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getAllPeople() {
        return new ArrayList<>(people); // возвращаем копию для безопасности
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Person Registry ===\n");
        for (Person person : people) {
            sb.append(person).append("\n");
        }
        sb.append("Total: ").append(people.size()).append(" people");
        return sb.toString();
    }
}
