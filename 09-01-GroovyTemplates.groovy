import groovy.text.SimpleTemplateEngine

def text = '"Dear $fName $lName,"\n How are you doing in <%print city%>'
def binding = ["fName":"Beena", "lName":"Nahusha", "city":"Mangalore"] 
def engine = new SimpleTemplateEngine()
template = engine.createTemplate(text).make(binding)
print template.toString()