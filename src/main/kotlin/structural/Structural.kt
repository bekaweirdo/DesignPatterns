package structural

import structural.decorator.LoggingCaptainRepository
import structural.decorator.ValidateCaptainRepository
import structural.decorator.base.DefaultStarRepository

fun main () {
    val starRepository = DefaultStarRepository()
    val validate = ValidateCaptainRepository(starRepository)
    val logging = LoggingCaptainRepository(starRepository)
    logging["USS Enterprise"]
    logging["hi"] = "asd"
    logging["hi"]
    validate["hi"]
}