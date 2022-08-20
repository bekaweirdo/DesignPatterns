package structural.decorator.base

interface StarsRepository {
    operator fun get(name: String): String
    operator fun set(name: String,captainName: String)
}