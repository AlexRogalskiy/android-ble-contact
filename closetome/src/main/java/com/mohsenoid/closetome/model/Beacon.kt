/*
 * Copyright 2020 Mohsen Mirhoseini
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mohsenoid.closetome.model

@ExperimentalUnsignedTypes
data class Beacon(
    val address: String,
    val manufacturerUuid: String,
    val major: UShort,
    val minor: UShort,
    val userUuid: String?,
    val lastSeen: Long,
    val distanceInMeter: Double,
    val minDistanceInMeter: Double = Double.MAX_VALUE,
    val isNear: Boolean,
    var isVisible: Boolean
)
