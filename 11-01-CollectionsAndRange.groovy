def range = 5..8
assert range.size() == 4
assert range.contains(7)
assert range instanceof java.util.List
assert range.get(3) == 8
println range.get(3)