package structural.decorator

import structural.decorator.base.StarsRepository

class LoggingCaptainRepository(
    private val repository: StarsRepository
): StarsRepository by repository {
    override fun get(name: String): String {
        println("Getting Captain for $name")
        return repository[name]
    }
}