package OOP

import groovy.transform.ToString;

@ToString(includeNames = true, includeFields = true, includeSuper = true)
class Dog extends Animal {

    def owner;

    def Dog(name, sound, owner) {
        super(name, sound);
        this.owner = owner;
    }

    def makeSound() {
        println "$name says bark and $sound";
    }
}
