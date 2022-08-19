package creational.factory_method.model

import creational.factory_method.ICurrency

class Dollar: ICurrency {
    override fun symbol(): String {
        return "$"
    }
    override fun code(): String {
        return "USD"
    }
}