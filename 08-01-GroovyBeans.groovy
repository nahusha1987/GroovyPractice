class Person {
    Integer id
    String name
    
    static main(args) {
        def Person person = new Person(id:1, name:"Nahusha")
        println "Hello ${person.name}"
    }
}
