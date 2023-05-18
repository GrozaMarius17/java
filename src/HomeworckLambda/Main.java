package HomeworckLambda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(List.of(
                new Person("Marius", "Groza", 27, "Oradea"),
                new Person("Raluca", "Chis", 25, "Cluj"),
                new Person("Marius", "Groza", 11, "Zalau"),
                new Person("Abel", "Faur", 4, "Timisoara")
        ));
        System.out.println("All persons: " + personService.listPersonsName());
        System.out.println("Person that are major: " + personService.listPersonThatAreMajor());
        System.out.println("Person from Oradea: " + personService.listPersonFromOradea());
        System.out.println("Person from Oradea or Cluj: " + personService.listPersonFromOradeaOrCluj());
        System.out.println("First names Capitalized: " + personService.listFirstNamesCapitalized());
        System.out.println("First letter from last name: " + personService.listFirstLetterFromLastName());
        System.out.println("Persons between 18 and 60 age: " + personService.listPersonsBetween18and60());
        System.out.println("Person having first name starting with A: " + personService.listPersonsHavingFirstNameStartingWithA());
        System.out.println("Person that first name are uniquely: " + personService.listFirstNameUniquely());
        System.out.println("Sort the person by the first name: " + personService.sortThePersonsByTheFirstName());
        System.out.println("Sort the person by the last name: " + personService.sortThePersonByTheLastName());
        System.out.println("Sort the person by first name, last name and age: " + personService.sortThePersonByFirstLastNameAndAge());
        System.out.println(personService.sortThePersonByFirstLastNameAndAgeComparator());
    }
}
