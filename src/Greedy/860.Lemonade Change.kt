package Greedy

class Solution {
	fun lemonadeChange(bills: IntArray): Boolean {
		var five = 0
		var ten = 0
		for(bill in bills) {
			if (bill == 5)
				five ++
			if(bill == 10) {
				if (five > 0) {
					five --
					ten ++
				} else return false
			}

			if(bill == 20) {
				if(ten > 0 && five > 0) {
					ten --
					five --
				} else if(five > 2) {
					five -= 3
				} else return false
			}
		}
		return true
	}
}
