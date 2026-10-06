fun generateGreeting(name: String?): String {
    // TODO: Обробіть null та порожній рядок. Значення за замовчуванням - "Guest".
    // Поверніть рядок формату "Welcome, Name!"
    if (name == null) {
        return "Welcome, Guest!"
    } else if (name != null && name.isEmpty()) {
        return "Welcome, Guest!"
    } else return "Welcome, ${name}!"
}