class Grade
{
    def A() { println "90-100" }
    def B() { println "80-90" }
    def C() { println "70-80" }
}

def doGrading(grade, result)
{
    grade."$result"()
}

def test = new Grade()

doGrading(test, "A")
doGrading(test, "B")
doGrading(test, "C")