class Methods {
    static void main(String[] args) {

        sayHello()
        println sum(4, 6)
        println sum(3)
        println sum(2, 'asd')

        def myName = 'Tim'
        passByValue(myName)
        println("in Main: " + myName)

        def listToDouble = [1, 2, 3, 4]
        println listToDouble
        listToDouble = doubleList((listToDouble))
        println listToDouble

        def nums = sumAll(1, 2, 3, 4)
        println "Sum an unknown amount of args: " + nums

        println "factorial(4): " +  factorial(4)
    }

    static def sayHello() {
        println "Hello!"
    }

    static def sum(n1 = 0, n2 = 0) {
        return n1 + n2
    }

    static def passByValue(str) {
        println "In function: " + str
        str = 'asd';
        println "In function after change: " + str
    }

    static def doubleList(list) {
        def newList = list.collect { it * 2 }
        return newList;
    }

    static def sumAll(int ... num) {
        def sum = 0;
        num.each { sum += it }
        return sum
    }

    static def factorial(num) {
        if (num <= 1) {
            return 1
        } else {
            return (num * factorial(num - 1))
        }
    }
}
