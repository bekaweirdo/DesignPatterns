package creational.factory_method

import creational.factory_method.model.Dollar
import creational.factory_method.model.Euro
import creational.factory_method.model.Pound

class FactoryMethod {
    fun currency(country: Country): ICurrency {
        return when (country) {
            Country.Spain, Country.Greece -> Euro()
            Country.UnitedStates -> Dollar()
            Country.UK -> Pound()
        }
    }
}