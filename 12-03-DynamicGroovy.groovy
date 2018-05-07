interface Test {
    String getName()
}

class Test1  {
    String getName() { "Test1" }
}

Test1.mixin Test

Test1.mixin DivingAbility, FlyingAbility

assert new Test1().fly() == "Fly test"
assert new Test1().dive() == "Dive test" 