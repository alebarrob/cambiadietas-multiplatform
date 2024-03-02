package core.domain.model

import core.domain.enum.FoodCategory
import core.domain.enum.FoodUnit

data class Food(
    val id: Int,

    val name: String,

    val category: FoodCategory,

    val conversionAmount: Double,

    val unit: FoodUnit
)
