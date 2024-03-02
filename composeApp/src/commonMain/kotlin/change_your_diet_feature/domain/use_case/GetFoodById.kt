package change_your_diet_feature.domain.use_case

import core.domain.model.Food
import core.domain.repository.FoodRepository
import kotlinx.coroutines.flow.Flow

class GetFoodById(private val foodRepository: FoodRepository) {
    operator fun invoke(id: Int): Flow<Food> {
        return foodRepository.getFoodById(id)
    }
}