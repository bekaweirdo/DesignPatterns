package creational.prototype.model

data class User(
    val name: String,
    val role: Role,
    private val permissions: Set<String>,
    val tasks: List<String>
)