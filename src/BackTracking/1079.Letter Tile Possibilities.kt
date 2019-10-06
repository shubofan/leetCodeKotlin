package BackTracking

class Solution {
	private val charSet = mutableSetOf<String>()

	fun numTilePossibilities(tiles: String): Int {
		var used = BooleanArray(tiles.length)

		for(i in tiles.indices)
			helper(tiles, StringBuilder(), used, charSet)
		return charSet.size
	}

	private fun helper(tiles:String, sb: StringBuilder, used: BooleanArray, charSet: MutableSet<String>) {
		for(i in tiles.indices) {
			if(used[i]) continue
			sb.append(tiles[i])
			charSet.add(sb.toString())

			used[i] = true
			helper(tiles, sb, used, charSet)
			used[i] = false
			sb.delete(sb.length - 1, sb.length)
		}
	}
}
