package repositoty

import data.User

class UserService(private val userRepository: UserRepository) {
    fun registerUser(name:String, email: String){
        val user = User(name,email)
        userRepository.addUser(user)
    }
    fun getUser():List<User>{
        return userRepository.getUsers()
    }

}