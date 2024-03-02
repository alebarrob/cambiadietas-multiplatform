package core.domain.di

import core.domain.use_case.GetAllFoodCategories
import core.domain.use_case.GetFoodByCategory
import org.koin.dsl.module

val coreDomainModule = module {
    factory {
        GetAllFoodCategories(get())
    }
    factory {
        GetFoodByCategory(get())
    }
}