package barrera.alejandro.cambiadietasapp

import android.app.Application
import change_your_diet_feature.domain.di.changeYourDietDomainModule
import core.domain.di.coreDomainModule
import diet_tips_feature.domain.di.dietTipsDomainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(
                coreDomainModule,
                dietTipsDomainModule,
                changeYourDietDomainModule
            )
        }
    }
}