package Trie

class Trie() {

	/** Initialize your data structure here. */
	private val root: TrieNode = TrieNode()

	/** Inserts a word into the trie. */
	fun insert(word: String) {
		var cur = root
		for (char in word.toCharArray()) {
			if (cur.children[char.minus('a')] == null) {
				cur.children[char.minus('a')] = TrieNode()
			}
			cur = cur.children[char.minus('a')]!!
		}
		cur.isEnd = true
	}

	/** Returns if the word is in the trie. */
	fun search(word: String): Boolean {
		var node = searchPrefix(word)
		return node != null && node.isEnd
	}

	/** Returns if there is any word in the trie that starts with the given prefix. */
	fun startsWith(prefix: String): Boolean {
		return searchPrefix(prefix) != null
	}

	private fun searchPrefix(prefix: String): TrieNode? {
		var cur = root
		for (char in prefix.toCharArray()) {
			if (cur.children[char.minus('a')] != null) {
				cur = cur.children[char.minus('a')]!!
			} else return null
		}
		return cur
	}

	private class TrieNode() {
		var children: Array<TrieNode?> = Array(26) { null }
		var isEnd: Boolean = false
	}
}
