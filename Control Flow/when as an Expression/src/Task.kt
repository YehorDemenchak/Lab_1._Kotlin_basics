fun trafficLightAction(color: String): String {
    when (color) {
        "Red" -> return "Stop"
        "Yellow" -> return "Wait"
        "Green" -> return "Go"
        else -> return "Error"
    }
}