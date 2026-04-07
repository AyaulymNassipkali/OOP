package practice5;
public class Main {
    public static void main(String[] args) {
        System.out.println("---Pet Management System Test---\n");

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "Artificial Intelligence");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal tweety = new Bird("Tweety", 1);
        Animal goldie = new Fish("Goldie", 2);

        System.out.println("---Creating animals---");
        System.out.println(murka);
        System.out.println(rex);
        System.out.println(tweety);
        System.out.println(goldie);
        System.out.println();


        PersonRegistry registry = new PersonRegistry();

        System.out.println("---Adding people to registry---");
        registry.addPerson(john);
        registry.addPerson(alice);
        System.out.println();

        System.out.println("---Assigning pets---");
        john.assignPet(murka);
        alice.assignPet(rex);

        System.out.println("\n---Trying to give PhD student a dog (should fail)---");
        alice.assignPet(rex);

        System.out.println("\n---PhD student gets a cat---");
        alice.assignPet(goldie);
        System.out.println();

        System.out.println("---Registry after assigning pets---");
        System.out.println(registry);
        System.out.println();


        System.out.println("---John goes on vacation---");
        john.leavePetWith(alice);
        System.out.println();

        System.out.println("---Registry after leaving pet---");
        System.out.println(registry);
        System.out.println();


        System.out.println("---Trying to leave dog with PhD student (be fail)---");
        john.leavePetWith(alice);
        System.out.println();

        System.out.println("---John returns from vacation---");
        john.retrievePetFrom(alice);
        System.out.println();

        System.out.println("---Final registry---");
        System.out.println(registry);
        System.out.println();

        System.out.println("---People with pets---");
        for (Person p : registry.findPeopleWithPets()) {
            System.out.println(p.getName() + " has: " + p.getPet().getName());
        }

        System.out.println("\n---People without pets---");
        for (Person p : registry.findPeopleWithoutPets()) {
            System.out.println(p.getName());
        }
    }
}