package change_your_diet_feature.domain.di

import change_your_diet_feature.domain.use_case.GetDesiredFoodAmount
import change_your_diet_feature.domain.use_case.GetFoodById
import org.koin.dsl.module

val changeYourDietDomainModule = module {
    factory {
        GetFoodById(get())
    }
    factory {
        GetDesiredFoodAmount()
    }
}