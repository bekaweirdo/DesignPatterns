package structural.decorator.base

class DefaultStarRepository: StarsRepository {
    private val starCaptains = mutableMapOf(
        "USS Enterprice" to "Jean-Luc Picard"
    )

    override fun get(name: String): String {
        return starCaptains[name] ?: "Unknown"
    }

    override fun set(name: String, captainName: String) {
        starCaptains[name] = captainName
    }
}