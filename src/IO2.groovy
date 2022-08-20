class IO2 {
    static void main(String[] args){
        print("What's your name ")
//        def fName = System.console().readLine()
        def fName = System.in.newReader().readLine()
        println "Hello, " + fName + "!"

        print "Enter a number "
        def num1 = System.in.newReader().readLine().toDouble()
        print "Enter a number "
        def num2 = System.in.newReader().readLine().toDouble()

        printf "%.2f + %.2f = %.2f \n", [num1, num2, num1 + num2]
    }
}
