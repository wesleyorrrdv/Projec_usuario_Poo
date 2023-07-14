package repositoty

import data.User

interface UserRepository {
    fun addUser(user: User)
    fun getUsers(): List<User>
}