fun greetUser(name: String): String {
    return "Welcome, $name!"
}

fun greetUser(): String {
    return "Welcome, Guest!"
}

fun callGreet(): String {
    return greetUser() // Цей виклик має запрацювати після вашої зміни
}