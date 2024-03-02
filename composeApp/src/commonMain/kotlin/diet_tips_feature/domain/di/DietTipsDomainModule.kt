package diet_tips_feature.domain.di

import diet_tips_feature.domain.use_case.GetAllTips
import org.koin.dsl.module

val dietTipsDomainModule = module {
    factory {
        GetAllTips(get())
    }
}