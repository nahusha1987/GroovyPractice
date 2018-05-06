stringAccumulator = ""
greetings = ["Hello", "!!", "How", "are", "you"]
greetings.each {
    stringAccumulator += it + " "
}
println stringAccumulator

