class List {
    static void main(String[] args) {
        def primes = [2, 3, 5, 7, 11, 13]

        println("2dd Prime " + primes[1])
        println("3rd Prime " + primes.get(3))
        primes.add(17)
        primes << 19
        println primes + [23,29];
        println primes
        println primes - [19]
        println primes
        println "primes.isEmpty() " + primes.isEmpty()
        println "primes[0..2]: " + primes[0..2]

        def employee = ["Tim", 34, 9.99, [11, 222, 3333]]

        println "2nd number of the list: " + employee[3][1]
        println "length of the employee: " + employee.size()
//        println "length of the list: " + employee[3]


        println "Match: " + primes.intersect([1, 2,3,7, 10])
        println "Reverse: " + primes.reverse()
        println "Sort: " + primes.sort()
        println "pop: " + primes.pop()
    }
}
