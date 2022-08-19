package creational.factory_method.model

import creational.factory_method.ICurrency

class Pound : ICurrency {
    override fun symbol(): String {
        return "£"
    }
    override fun code(): String {
        return "Penny"
    }
}