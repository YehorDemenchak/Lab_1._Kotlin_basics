import java.util.Locale
import java.util.Locale.getDefault

fun toUpperCaseSafe(text: String?): String {
    // TODO: Перевірте if (text != null), використайте .uppercase(), інакше поверніть "EMPTY"
    if (text != null) {
        return text.uppercase(getDefault())
    } else return "EMPTY"
}