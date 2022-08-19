package creational.singleton

object Singleton {
    val cartoons = listOf(
        "Shrek",
        "Toy Story",
        "Up :)",
        "So on"
    )
    private val movies = listOf(
        "Mission Impossible",
        "Burn",
        "Les miserables"
    )

    fun printMovies(movie: List<String>){
        movie.forEach { item ->
            println(item)
        }
    }
}

//object EmptyList : List<Nothing>, RandomAccess {
//    private const val serialVersionUID: Long = -7390468764508069838L
//
//    override fun equals(other: Any?): Boolean = other is List<*> && other.isEmpty()
//    override fun hashCode(): Int = 1
//    override fun toString(): String = "[]"
//
//    override val size: Int get() = 0
//    override fun isEmpty(): Boolean = true
//    override fun contains(element: Nothing): Boolean = false
//    override fun containsAll(elements: Collection<Nothing>): Boolean = elements.isEmpty()
//
//    override fun get(index: Int): Nothing = throw IndexOutOfBoundsException("Empty list doesn't contain element at index $index.")
//    override fun indexOf(element: Nothing): Int = -1
//    override fun lastIndexOf(element: Nothing): Int = -1
//
//    override fun iterator(): Iterator<Nothing> = EmptyIterator
//    override fun listIterator(): ListIterator<Nothing> = EmptyIterator
//    override fun listIterator(index: Int): ListIterator<Nothing> {
//        if (index != 0) throw IndexOutOfBoundsException("Index: $index")
//        return EmptyIterator
//    }
//
//    override fun subList(fromIndex: Int, toIndex: Int): List<Nothing> {
//        if (fromIndex == 0 && toIndex == 0) return this
//        throw IndexOutOfBoundsException("fromIndex: $fromIndex, toIndex: $toIndex")
//    }
//
//    private fun readResolve(): Any = EmptyList
//}