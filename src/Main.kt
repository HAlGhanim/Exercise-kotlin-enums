package userRole
fun main() {
    val humoud = UserRole.ADMIN
    val abdullah = UserRole.EDITOR
    val ahmed = UserRole.VIEWER

    humoud.access(3)
    abdullah.access(2)
    ahmed.access(2)
    humoud.access(4)

    println("-----")

    for (role in UserRole.entries) { // UserRole.values() also works but intellij is recommending entries for iterating enums
        println("${role.name} - ${role.accessLevel}")
    }
}