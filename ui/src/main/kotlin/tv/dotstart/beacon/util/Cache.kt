/*
 * Copyright (C) 2019 Johannes Donath <johannesd@torchmind.com>
 * and other copyright owners as documented in the project's IP log.
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
package tv.dotstart.beacon.util

import tv.dotstart.beacon.core.cache.filesystem.FileSystemCache
import tv.dotstart.beacon.core.cache.filesystem.path.Murmur3PathProvider
import tv.dotstart.beacon.core.util.OperatingSystem

/**
 * Provides a caching solution for arbitrary blobs.
 *
 * This solution is primarily used in order to speed up the retrieval of repositories and extraction
 * of icons into a JavaFX compatible directory layout.
 *
 * @author [Johannes Donath](mailto:johannesd@torchmind.com)
 */
// TODO: Replace with configurable implementation
object Cache : FileSystemCache(
    OperatingSystem.current.storageDirectory.resolve("cache"),
    pathProvider = Murmur3PathProvider(424242L))
