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
package org.seeingpixels.adoptionimpact.app.startup

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.seeingpixels.adoptionimpact.app.app
import org.seeingpixels.adoptionimpact.common.network.network
import org.seeingpixels.adoptionimpact.features.adoption.animals
import org.seeingpixels.adoptionimpact.features.facts.petFacts
import org.seeingpixels.adoptionimpact.features.petfinder.petFinder

object KoinInitializer : Initializer {

    override fun initialize(context: Context) {
        startKoin {
            androidContext(androidContext = context)
            modules(app, animals, network, petFacts, petFinder)
        }
    }
}
