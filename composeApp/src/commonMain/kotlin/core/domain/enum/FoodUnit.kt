package core.domain.enum

enum class FoodUnit {
    GRAMS,
    MILLILITERS,
    PIECES;

    companion object {
        fun fromValue(value: String?): FoodUnit {
            return when (value) {
                "gr." -> GRAMS
                "ml." -> MILLILITERS
                "unidades" -> PIECES
                else -> throw IllegalArgumentException("Wrong value: $value")
            }
        }
    }
}