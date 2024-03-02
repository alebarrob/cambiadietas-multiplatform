package core.domain.use_case

import core.domain.model.Food
import core.domain.repository.FoodRepository
import kotlinx.coroutines.flow.Flow

class GetFoodByCategory(private val foodRepository: FoodRepository) {
    operator fun invoke(category: String): Flow<List<Food>> {
        return foodRepository.getFoodByCategory(category)
    }
}