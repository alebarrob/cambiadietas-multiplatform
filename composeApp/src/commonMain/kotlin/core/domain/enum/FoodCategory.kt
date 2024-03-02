package core.domain.enum

enum class FoodCategory(val displayName: String, val referenceAmount: Double) {
    FRUITS("Frutas", 130.00),
    FATS_AND_PROTEINS("Grasas y Proteínas", 110.00),
    FATS("Grasas", 50.00),
    CARBOHYDRATES("Carbohidratos", 40.00),
    DAIRY("Lácteos", 100.00);

    companion object {
        fun fromDisplayName(displayName: String?): FoodCategory {
            return entries.find { it.displayName == displayName }
                ?: throw IllegalArgumentException("Wrong display name: $displayName")
        }
    }
}