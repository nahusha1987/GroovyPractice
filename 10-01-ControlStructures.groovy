def method(bool) {
    try {
        if(bool) throw new Exception("Test")
        1
    } catch (e) {
        2
    } finally {
        3
    }
}

assert method(true) == 2
assert method(false) == 1
    