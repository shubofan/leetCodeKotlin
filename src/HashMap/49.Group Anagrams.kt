package HashMap

class Solution {
	fun groupAnagrams(strs: Array<String>): List<List<String>> {
		var map = mutableMapOf<String, MutableList<String>>()

		for(str in strs) {
			val arr = str.toCharArray()
			val tem = arr.sorted().toString()

			if(!map.contains(tem)) {
				var lst = mutableListOf<String>()
				lst.add(str)
				map[tem] = lst
			} else map[tem]?.add(str)
		}
		return map.values.toList()
	}
}