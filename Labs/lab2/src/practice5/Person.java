package practice5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    private Animal temporaryPet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.pet = null;
        this.temporaryPet = null;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Animal getPet(){
        return pet;
    }
    public Animal getTemporaryPet(){
    return temporaryPet;
    }

    public void assignPet(Animal pet){
        if(this.pet != null){
            System.out.println(name + " already has a pet: " + this.pet.getName());
            return;
        }

        if(this instanceof PhDStudent && pet instanceof  Dog){
            System.out.println("PhD students cannot have dogs! Too much responsibility.");
            return;
        }

        this.pet = pet;
        System.out.println(name + " now has a pet: " + pet.getName());
    }

    public void removePet(){
        if (this.pet == null){
            System.out.println(name + " doesn't have a pet to remove.");
            return;
        }
        System.out.println(name + " remove pet: " + this.pet.getName());
        this.pet = null;
    }
    public boolean hasPet(){
        return pet != null;
    }

    public boolean hasTemporaryPet(){
        return temporaryPet != null;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker){
        if(this.pet == null){
            System.out.println(this.name + " doesn't have a pet to leave.");
            return;
        }
        if (caretaker instanceof PhDStudent && this.pet instanceof Dog){
            System.out.println("Cannot leave a bird with a PhD student - they are too busy!");
            return;
        }
        caretaker.temporaryPet = this.pet;
        this.pet = null;
        System.out.println((this.name + " left their pet with " + caretaker.name));
    }

    public void retrievePetFrom(Person caretaker){
        if(caretaker.temporaryPet == null){
            System.out.println(caretaker.name + " doesn't have a pet to return");
            return;
        }
        if(this.pet != null){
            System.out.println(this.name + " already has a pet. Cannot take back.");
            return;
        }
        this.pet = caretaker.temporaryPet;
        caretaker.temporaryPet = null;
        System.out.println(this.name + " retrieved their pet from " + caretaker.name);
    }

    @Override
    public String toString(){
        String petInfo = (pet != null) ? pet.toString() : "no pet";
        String tempPetInfo = ( temporaryPet != null) ? ", taking care of: " + temporaryPet.getName() : "";
        return getClass().getSimpleName() + "{name='" + name + "', age=" + age +
                ", occupation='" + getOccupation() +
                "', pet=" + petInfo + tempPetInfo + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
