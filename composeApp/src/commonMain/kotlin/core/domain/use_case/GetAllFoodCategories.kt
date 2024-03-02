package core.domain.use_case

import core.domain.enum.FoodCategory
import core.domain.repository.FoodRepository
import kotlinx.coroutines.flow.Flow

class GetAllFoodCategories(private val foodRepository: FoodRepository) {
    operator fun invoke(): Flow<List<FoodCategory>> {
        return foodRepository.getAllFoodCategories()
    }
}