package HomeworckLambda;

import java.util.List;
import java.util.Comparator;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.toList;


public class PersonService {
    List<Person> personList;
    public PersonService(List<Person> personList) {
        this.personList = personList;
    }
    public List<String> listPersonsName(){
        return personList.stream()
                .map(person -> person.firstName() + " " + person.lastName())
                .toList();
    }

    public List<String> listPersonThatAreMajor() {
        return personList.stream()
                .filter(person -> person.age() > 18)
                .map(person -> person.firstName() + " " + person.lastName())
                .toList();
    }

    public List<String> listPersonFromOradea() {
        return personList.stream()
                .filter(person -> person.city() == "Oradea")
                .map(person -> person.firstName() + " " + person.lastName())
                .toList();
    }

    public List<String> listPersonFromOradeaOrCluj() {
        return personList.stream()
                .filter(person -> (person.city() == "Oradea") || (person.city() == "Cluj"))
                .map(person -> person.firstName() + " " + person.lastName())
                .toList();
    }

    public List<String> listFirstNamesCapitalized() {
        return personList.stream()
                .map(person -> person.firstName().toUpperCase())
                .toList();
    }

    public List<String> listFirstLetterFromLastName() {
        return personList.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0) + ".")
                .toList();
    }

    public List<Person> listPersonsBetween18and60() {
        return personList.stream()
                .filter(person -> (person.age() > 18) && (person.age() < 60))
                .toList();

    }

    public List<Person> listPersonsHavingFirstNameStartingWithA() {
        return personList.stream()
                .filter(person -> person.firstName().startsWith("A"))
                .toList();
    }

    public List<String> listFirstNameUniquely() {
        return personList.stream()
                .map(person -> person.firstName())
                .distinct()
                .sorted()
                .toList();
    }

    public List<Person> sortThePersonsByTheFirstName() {
        return personList.stream()
                .sorted((person1, person2)-> person1.firstName().compareTo(person2.firstName()))
                .toList();

    }

    public List<Person> sortThePersonByTheLastName() {
        return personList.stream()
                .sorted((person1, person2) -> person1.lastName().compareTo(person2.lastName()))
                .toList();
    }

    public List<Person> sortThePersonByFirstLastNameAndAge() {
        return personList.stream()
                .sorted((person1, person2) -> {
                    if(person1.firstName().compareTo(person2.firstName()) == 0)
                        if(person1.lastName().compareTo(person2.lastName()) == 0)
                            return person1.age() - person2.age();
                        else return person1.lastName().compareTo(person2.lastName());
                    return person1.firstName().compareTo(person2.firstName());
                })
                .toList();
    }

    public List<Person> sortThePersonByFirstLastNameAndAgeComparator(){
        return personList.stream()
                .sorted(Comparator
                        .comparing(Person::firstName)
                        .thenComparing(Person::lastName)
                        .thenComparing(Person::age)
                )
                .toList();

    }

}


