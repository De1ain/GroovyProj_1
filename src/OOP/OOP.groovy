package OOP

class OOP {
    static void main(String[] args) {

        def king = new Animal('King', 'Growl');
        println "$king.name says $king.sound";
        king.setSound("Grrrr");
        println "$king.name says $king.sound";
        king.run();
        println king.toString();

        def harleyTheDog = new Dog("Harley", "Woof", "Tim");
        harleyTheDog.makeSound();
        println harleyTheDog.toString();
    }
}
