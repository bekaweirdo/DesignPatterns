package creational.static_factory_method

class StaticFactoryMethod {

    fun property(prop: String): Property {
        val (name,value) = prop.split(":")
        return when (name) {
            "port" -> PropertyImpl(name,value.trim().toInt())
            "environment" -> PropertyImpl(name,value.trim())
            else -> throw RuntimeException("Unknown property: $name")
        }
    }
}