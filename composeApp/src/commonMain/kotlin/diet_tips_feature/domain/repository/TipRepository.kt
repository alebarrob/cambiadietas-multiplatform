package diet_tips_feature.domain.repository

import diet_tips_feature.domain.model.Tip
import kotlinx.coroutines.flow.Flow

interface TipsRepository {
    fun getAllTips(): Flow<List<Tip>>
}