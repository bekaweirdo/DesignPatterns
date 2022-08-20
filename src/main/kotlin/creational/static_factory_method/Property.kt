package creational.static_factory_method

interface Property {
    val name: String
    val value: Any
}

data class PropertyImpl(
    override val name: String,
    override val value: Any
): Property