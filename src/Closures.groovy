class Closures {

    static void main(String[] args) {

        def getFactorial = { num -> (num <= 1 ? 1 : num * call(num - 1)) }
        def num = 4;
        println("getFactorial(${num}) with closure: " + getFactorial(num))

        def greeting = "Goodbye"
        def sayGoodbye = { theName -> println("$greeting $theName") }
        sayGoodbye "Tim"

        def numList = [1, 2, 3, 4]
        numList.each { println it }

        def employees = [
                "Tim" : 34,
                "Bob" : 33,
                "Mara": 35
        ]
        employees.each { println "$it.key's age us: $it.value" }

        def randNums = [1, 2, 3, 4, 5, 6]
        randNums.each { n -> if (n % 2 == 0) println(n) }

        def nameList = ["Tim", "Bob", "Mara"]
        println nameList.find { item -> item == "Bob" }
        println nameList.find { it == "John" }

        def randNumList = [1, 2, 3, 4, 5, 6]
        println "findAll " + randNumList.findAll { item -> item > 4 }
        println "any item is greater than 5: " + randNumList.any { item -> item > 5 }
        println "every item is greater than 1: " + randNumList.every { item -> item > 1 }
        println "collect - double every item in the list: " + randNumList.collect { item -> item * 2 }

        def getEvenBoolean = {number -> return number%2 == 0 }
        def evenNumsBoolean = listEditFind(randNumList, getEvenBoolean)
        println "(findAll) even numbers (boolean): " + evenNumsBoolean

        def getEven = {number -> if(number%2 == 0) return number}
        def evenNums = listEditCollect(randNumList, getEven)
        println "(collect) even numbers: " + evenNums

        def getEven2 = {number -> if(number%2 == 0) return number}
        def evenNums2 = listEditEvery(randNumList, getEven2)
        println "(every) even numbers: " + evenNums2

        def getEven3 = {number -> if(number%2 == 0) return number}
        def evenNums3 = listEditAny(randNumList, getEven3)
        println "(every) even numbers: " + evenNums3
    }

    static def listEditFind(list, closure){
        return list.findAll(closure)
    }
    static def listEditCollect(list, closure){
        return list.collect(closure)
    }
    static def listEditEvery(list, closure){
        return list.every(closure)
    }
    static def listEditAny(list, closure){
        return list.any(closure)
    }
}
