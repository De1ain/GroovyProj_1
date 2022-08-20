def foo = 6.5

println "foo has value $foo"
println "foo is of class ${foo.class} and has value \"$foo\""

println foo+foo
println foo+2
println foo+"00"

foo="str"
println "foo is of class ${foo.class} and has value \"$foo\""

foo=42
println "foo is of class ${foo.class} and has value \"$foo\""

println "Operations on Integers:"
println("5 + 4 = " + 5+4)
println("5 + 4 = " + (5+4))
println("5 - 4 = " + 5-4)
println("5 - 4 = " + (5-4))
println("5 * 4 = " + 5*4)
println("5 / 4 = " + 5.intdiv(4))
println("5 % 4 = " + 5%4)

println "Operations on Floats:"
println("5.2 + 2.1 = " + 5.2+2.1)
println("5.2 + 2.1 = " + (5.2+2.1))
println("5.2 plus 2 = " + (5.2.plus(2.1)))
println("5.2 - 4.1 = " + 5.2 - 4.1)
println("5.2 - 4.1 = " + (5.2-4.1))
println("5.2 minus 4.1 = " + (5.2.minus(4.1)))
println("5.2 * 4.1 = " + 5.2*4.1)
println("5.2 multiply 4.1 = " + 5.2.multiply(4.1))
println("5.2 / 4.1 = " + 5.2 / 4.1)

println "Inc & Dec:"
def age = 34
println "age++ ${age++}"
println age
println "age++ " + age++
println age
println "++age ${++age}"

println "Min and Max values"
println "Integer.MAX_VALUE " + Integer.MAX_VALUE
println "Integer.MIN_VALUE " + Integer.MIN_VALUE
println "Float.MAX_VALUE " + Float.MAX_VALUE
println "Float.MIN_VALUE " + Float.MIN_VALUE
println "Double.MAX_VALUE " + Double.MAX_VALUE
println "Double.MIN_VALUE " + Double.MIN_VALUE
