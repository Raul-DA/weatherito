package mx.uach.weather

data class Ciudad(val name: String, val weather: String, val message: String) {
    override fun toString() = "$name - $weather - $message";
}