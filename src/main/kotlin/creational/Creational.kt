package creational

import creational.factory_method.Country
import creational.factory_method.FactoryMethod
import creational.singleton.Singleton

fun main(){
    //Singleton
    Singleton.printMovies(Singleton.cartoons)
//    print(NoMovies[0])
    //Factory Method
    println(FactoryMethod().currency(Country.UK).symbol())
    println(FactoryMethod().currency(Country.Spain).code())
    println(FactoryMethod().currency(Country.UnitedStates).symbol())
}