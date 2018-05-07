class MyClass 
{
    Integer id
    String name
    String address
}

def myClass = new MyClass()
println myClass.metaClass.methods

println()

println MyClass.metaClass.properties

//println obj.metaClass.methods