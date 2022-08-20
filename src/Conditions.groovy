class Conditions {
    static void main(String[] args) {
        def age = 11

        if (age <= 5) {
            println "toddler"
        } else if (age > 5 && age < 18) {
            println "kid"
        } else {
            println "old"
        }

        def canVote = true;
        println !canVote ? "Can Vote" : "Can NOT Vote!"

        switch (age) {
            case 16: println "You can drive"
            case 18:
                println "You can vote"
                break;
            default: println "Have fun!"
        }

        switch (age) {
            case 0..6: println "Child"
                break
            case 7..12: println "Teenager"
                break
            case 13..18: println "Young Adult"
                break
            default: println "You are an adult"
        }

    }
}
