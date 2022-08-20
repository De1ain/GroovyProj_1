def add(a = 0, b = 0) {
    a + b
}

println add(2, 2)
println "call add for 3 and 7 returns: ${add(3, 7)}"
println "call add function with string parameters returns:" + add("Hello", "World")

def result = add 1, 2
println "result: " + result

result = add 1
println "result: " + result

result = add()
println "result: " + result

result = add add(4, 6), 5
println "result: " + result