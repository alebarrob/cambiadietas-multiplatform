package diet_tips_feature.domain.use_case

import diet_tips_feature.domain.model.Tip
import diet_tips_feature.domain.repository.TipsRepository
import kotlinx.coroutines.flow.Flow

class GetAllTips(private val tipRepository: TipsRepository) {
    operator fun invoke(): Flow<List<Tip>> {
        return tipRepository.getAllTips()
    }
}