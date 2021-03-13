/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.seeingpixels.bloom.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.seeingpixels.bloom.R

private val NunitoSans = FontFamily(
    Font(resId = R.font.nunitosans_bold, weight = FontWeight.Bold),
    Font(resId = R.font.nunitosans_semibold, weight = FontWeight.SemiBold),
    Font(resId = R.font.nunitosans_light, weight = FontWeight.Light),
    Font(resId = R.font.nunitosans_regular, weight = FontWeight.Normal),
)

val BloomTypography: Typography
    get() = Typography(
        defaultFontFamily = NunitoSans,
        h1 = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            letterSpacing = 0.sp
        ),
        h2 = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            letterSpacing = 0.15.sp
        ),
        subtitle1 = TextStyle(
            fontWeight = FontWeight.Light,
            fontSize = 16.sp,
            letterSpacing = 0.sp
        ),
        body1 = TextStyle(
            fontWeight = FontWeight.Light,
            fontSize = 14.sp,
            letterSpacing = 0.sp
        ),
        body2 = TextStyle(
            fontWeight = FontWeight.Light,
            fontSize = 12.sp,
            letterSpacing = 0.sp
        ),
        button = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            letterSpacing = 1.sp
        ),
        caption = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            letterSpacing = 0.sp
        )
    )

val MaterialTypography: Typography
    @Composable get() = MaterialTheme.typography
