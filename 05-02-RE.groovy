def spellCheck(input, reg)
{
    if (input ==~ reg)
        println "Good Job"
    else
        println "Please try again"
}


// ? - Denotes 0 or mote occurance of the previous character
regEx = /na(hu)?(sh)?a?/
spellCheck("nash",regEx)
spellCheck("nahusha",regEx)