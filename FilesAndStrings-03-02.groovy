date = "05-05-2018"
dateArray = date.split("-")
year = dateArray[2].toInteger()
year++
newDate = dateArray[0] + "-" + dateArray[1] + "-" + year
print newDate