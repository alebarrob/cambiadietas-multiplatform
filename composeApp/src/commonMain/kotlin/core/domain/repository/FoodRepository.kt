package core.domain.repository

import core.domain.enum.FoodCategory
import core.domain.model.Food
import kotlinx.coroutines.flow.Flow

interface FoodRepository {
    fun getAllFoodCategories(): Flow<List<FoodCategory>>

    fun getFoodByCategory(category: String): Flow<List<Food>>

    fun getFoodById(id: Int): Flow<Food>
}