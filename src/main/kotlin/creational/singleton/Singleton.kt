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