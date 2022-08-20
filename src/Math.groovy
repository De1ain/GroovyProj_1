def n = 2.0
def text = "asd"

println "Math.abs(-n) " + Math.abs(-n)
println "Math.abs(-25) " + Math.abs(-25)
println "Math.pow(n, 2) " + Math.pow(n, 2)
println "3.0.equals(n) " + 3.0.equals(n)
println "3.0.equals(n+1) " + 3.0.equals(n+1)

println "n = Integer.NaN " + (n == Float.NaN)
println "text = Integer.NaN " + (text == Float.NaN)

println "Math.sqrt(n+7) " + Math.sqrt(n+7)
println "Math.cbrt(${(n + 7) * 3 }) " + Math.cbrt((n+7)*3)

println "Math.ceil(${n + 0.45}) " + Math.ceil(n+0.45)

println "Math.max(1, 4) " + Math.max(1, 4)

println "Math.random() " + Math.random()
println "new Random().nextInt() " + new Random().nextInt()
println "new Random().nextInt() % 100 " + new Random().nextInt() % 100