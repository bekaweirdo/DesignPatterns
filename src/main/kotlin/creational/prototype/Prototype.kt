package creational.prototype

import creational.prototype.model.Role
import creational.prototype.model.User

class Prototype {
    val allUsers = mutableListOf<User>()
    fun createUser(name: String, role: Role){
        for(u in allUsers) {
            if(u.role == role){
                allUsers += u.copy(name = name)
                return
            }
        }
    }
}