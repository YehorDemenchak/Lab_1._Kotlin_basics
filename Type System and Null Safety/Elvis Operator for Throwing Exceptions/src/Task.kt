fun requireValidString(text: String?): String {
    // TODO: Поверніть text або викиньте IllegalArgumentException, використовуючи ?:
if (text == null) { throw IllegalArgumentException() }
    else return text
}