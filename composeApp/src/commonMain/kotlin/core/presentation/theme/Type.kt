package core.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import cambiadietas.composeapp.generated.resources.Res
import cambiadietas.composeapp.generated.resources.kulim_park_bold
import cambiadietas.composeapp.generated.resources.kulim_park_regular
import cambiadietas.composeapp.generated.resources.lato_bold
import cambiadietas.composeapp.generated.resources.lato_regular
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

@OptIn(ExperimentalResourceApi::class)
@Composable
fun getTypography(): Typography {
    val fontFamilyKulimPark = FontFamily(
        listOf(
            Font(
                resource = Res.font.kulim_park_regular,
                weight = FontWeight.Medium
            ),
            Font(
                resource = Res.font.kulim_park_bold,
                weight = FontWeight.Bold
            )
        )
    )

    val fontFamilyLato = FontFamily(
        listOf(
            Font(
                resource = Res.font.lato_regular,
                weight = FontWeight.Medium
            ),
            Font(
                resource = Res.font.lato_bold,
                weight = FontWeight.Bold
            )
        )
    )

    return Typography(
        displayLarge = TextStyle(
            fontFamily = fontFamilyKulimPark,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 32.sp
        ),
        displayMedium = TextStyle(
            fontFamily = fontFamilyKulimPark,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 22.sp
        ),
        displaySmall = TextStyle(
            fontFamily = fontFamilyKulimPark,
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = fontFamilyKulimPark,
            fontSize = 16.sp
        ),
        labelSmall = TextStyle(
            fontFamily = fontFamilyLato,
            fontSize = 11.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        )
    )
}
