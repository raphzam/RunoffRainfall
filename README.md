#Runoff Rainfall

IPO

Input
Dimensions of the roof
number of inches of rainfall
Output
amount of water run off (in gallons)

Process:
BEGIN

GETTING THE INPUT
    
    Prompt user for length of roof
	Get length
	multiply length by 12 to get length in inches
	store result in lengthInches
	Prompt user for width of roof
	Get width
	multiply width by 12 to get width in inches
	store result in widthInches
	Prompt user for the number of inches of rainfall
	get rainFall

CALCULATING THE RESULT
	
	Multiply lengthInches * widthInches * rainFall
		store result in cubicWater
	Divide cubicWater by 231
		store result in gallonWater

OUTPUT
	
	Display gallonWater

END
