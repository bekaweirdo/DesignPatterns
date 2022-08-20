package structural.decorator

import structural.decorator.base.StarsRepository

class ValidateCaptainRepository(
    private val repository: StarsRepository
) : StarsRepository by repository {
    private val maxNameLength = 15
    override fun set(name: String,
                            captainName: String) {
        require (captainName.length < maxNameLength) {
            "$captainName name is longer than $maxNameLength characters!"
        }
        repository[name] = captainName
    }
}