def range = 10..<16
assert range.size() == 6
assert range.get(5) == 15
println range.get(5)


for (i in 5..8)
    print i + " "
    
for (i in 5..8)
    println "Number = $i"    
    
println()
println()
    
(1..5).each { print it + " "}
    