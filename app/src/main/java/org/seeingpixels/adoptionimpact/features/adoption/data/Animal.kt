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
package org.seeingpixels.adoptionimpact.features.adoption.data

import org.seeingpixels.adoptionimpact.features.petfinder.data.AnimalResponse

data class Animal(
    val id: Int = 0,
    val name: String = "",
    val primaryBreed: String = "",
    val gender: String = "",
    val age: String = "",
    val size: String = "",
    val distance: Double? = 0.0,
    val croppedImageUrl: String? = null,
    val contact: AnimalResponse.Contact = AnimalResponse.Contact(),
)