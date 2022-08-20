def range = 'a'..'x'
println "range: " + range
println "range.contains('b'): " + range.contains('b')
println "range.contains('x'): " + range.contains('x')
println "range.contains('y'): " + range.contains('y')
println "range.subList(5, 22): " + range.subList(5, 22)
println "range.subList(5, 22).contains('j'): " + range.subList(5, 22).contains('j')
println "range.subList(5, 22).contains('w'): " + range.subList(5, 22).contains('w')

def nums = 1..10
println "nums: " + nums
println "nums.size(): " + nums.size()
println "nums.get(5): " + nums.get(5)
println "nums.getFrom() (first item): " + nums.getFrom()
println "nums.getTo() (last item): " + nums.getTo()
