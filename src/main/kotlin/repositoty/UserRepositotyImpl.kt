package repositoty

import data.User

class UserRepositotyImpl: UserRepository {
    private val userList = mutableListOf<User>()
    override fun addUser(user: User) {
        userList.add(user)
    }

    override fun getUsers(): List<User> {
        return userList
    }

}