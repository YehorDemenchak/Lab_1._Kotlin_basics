fun processInput(input: Any): Int {
    when (input) {
        is String -> return input.length
        is Int ->return input * 2
        else -> return 0
    }
}