inputDir ="C:\\Users\\nnarasimhamurthy\\Documents\\Work\\Groovy practice\\"
inputFileName = "Variables&Date-01-2.groovy"
inFile = new File(inputDir + inputFileName)
printFile = { println "output : " + it }
inFile.eachLine(printFile)