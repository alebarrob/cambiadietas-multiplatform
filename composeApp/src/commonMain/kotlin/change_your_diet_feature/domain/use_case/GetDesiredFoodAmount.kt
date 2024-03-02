package change_your_diet_feature.domain.use_case

import core.domain.model.Food

/**
 * A Use Case for converting a specific food amount to the equivalent amount of a desired food.
 *
 * The conversion is performed in two steps:
 * 1. The original `foodAmount` is first converted to a standard intermediate amount
 *    using `food.category.referenceAmount` and `food.conversionAmount`.
 * 2. The standard amount is then converted to the equivalent amount of the `desiredFood`
 *    using `desiredFood.conversionAmount` and `food.category.referenceAmount`.
 *
 * @param food The original food.
 * @param foodAmount The amount of `food` to be converted to `desiredFood`.
 * @param desiredFood The desired food whose amount will be calculated from the `foodAmount`.
 * @return The equivalent amount of `desiredFood` based on the `foodAmount`.
 */
class GetDesiredFoodAmount {
    operator fun invoke(
        food: Food,
        foodAmount: Double,
        desiredFood: Food,
    ): Double {
        val standardAmount = foodAmount * food.category.referenceAmount / food.conversionAmount

        return standardAmount * desiredFood.conversionAmount / food.category.referenceAmount
    }
}