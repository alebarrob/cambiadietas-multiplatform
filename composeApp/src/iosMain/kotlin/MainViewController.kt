import androidx.compose.ui.window.ComposeUIViewController
import change_your_diet_feature.domain.di.changeYourDietDomainModule
import core.domain.di.coreDomainModule
import diet_tips_feature.domain.di.dietTipsDomainModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController { App() }

fun initKoin() {
    startKoin {
        modules(
            coreDomainModule,
            dietTipsDomainModule,
            changeYourDietDomainModule
        )
    }
}