import processing.core.*
// setup vars
sprites = []
renderer = JAVA2D // P2D
setup = {
	ellipseMode CENTER
	frameRate 20
	smooth()
}

draw = {
	background 120
	
	nCount++
	nCount %= 90  // add additional sprites every so often:
	if ( ! nCount ) (1..20).each {
