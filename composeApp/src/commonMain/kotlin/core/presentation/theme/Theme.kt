package core.presentation.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

private val ColorScheme = lightColorScheme(
    background = Aquamarine,
    primary = Malachite,
    onPrimary = RaisinBlack,
    secondary = BabyPowder,
    onSecondary = RaisinBlack,
    tertiary = GhostWhite,
    onTertiary = RaisinBlack
)

@Composable
fun CambiaDietasTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colorScheme = ColorScheme,
            typography = getTypography(),
            content = content
        )
    }
}