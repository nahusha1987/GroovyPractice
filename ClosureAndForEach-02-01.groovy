// Closure Syntax
// { [closureParameters -> ] statements }

inc = { ++it }
[10,100,1000,10000].collect(inc)

cube = { it * it * it }
cube(3)

[1,2,3,4].collect(cube)
[1,2,3,4].forEach(cube)


useEachMap = {key, value -> println key + " = " + value }
["John" : "Freshman", "Tom" : "Graduate", "Bob" : "Working"].each(useEachMap)

useForEachMap = {key, value -> println key + " = " + value }
["John" : "Freshman", "Tom" : "Graduate", "Bob" : "Working"].forEach(useForEachMap)