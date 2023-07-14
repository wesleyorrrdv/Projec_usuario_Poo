import data.User
import repositoty.UserRepositotyImpl
import repositoty.UserService

fun main() {
    val userRepository = UserRepositotyImpl()
    val userService = UserService(userRepository)

    userService.registerUser("Wesley","wesleyorrr@gmail.com")
    userService.registerUser("Ana", "ana@gmail.com")

     val  users = userService.getUser()
    for (user in users){
        println("Name:${user.name}, Email: ${user.email}")
    }

}