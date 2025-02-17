package userRole

enum class UserRole(val accessLevel: Int) {
    ADMIN(3), EDITOR(2), VIEWER(1);

    fun access(levelRequired: Int): Boolean {
        if (this.accessLevel >= levelRequired) {
            println("You have access!")
            return true
        }
        else if(levelRequired > 3){
            println("Invalid access level.")
            return false
        }
        else {
            println("You don't have access.")
            return false
        }
    }
}