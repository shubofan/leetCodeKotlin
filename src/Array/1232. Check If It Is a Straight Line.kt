package Array

class Solution {
	fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
		if(coordinates.size == 2) return true
		var slope: Double = (coordinates[1][1] - coordinates[0][1]).toDouble().div(coordinates[1][0] - coordinates[0][0])
		for(i in 2 until coordinates.size) {
			if((coordinates[i][1]- coordinates[0][1]).toDouble().div(coordinates[i][0] - coordinates[0][0]) != slope) return false
		}
		return true
	}
}