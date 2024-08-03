class Animal {
    public void makeSound() {
        System.out.println("Animal Make Sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog's Barks");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meow");
    }
}


public class overwriting {

    public static void main(String[] args) {
        
        Animal animalObject = new Animal();
        Animal dogAnimal = new Dog();
        Animal catAnimal = new Cat();
        animalObject.makeSound();
        dogAnimal.makeSound();
        catAnimal.makeSound();
    }
}
