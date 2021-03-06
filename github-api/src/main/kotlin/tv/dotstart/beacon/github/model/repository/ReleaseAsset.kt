/*
 * Copyright 2020 Johannes Donath <johannesd@torchmind.com>
 * and other copyright owners as documented in the project's IP log.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tv.dotstart.beacon.github.model.repository

import com.fasterxml.jackson.annotation.JsonProperty
import tv.dotstart.beacon.github.model.Author
import java.time.Instant

/**
 * @author [Johannes Donath](mailto:johannesd@torchmind.com)
 * @date 13/12/2020
 */
data class ReleaseAsset(
    val id: Long,
    @JsonProperty("node_id")
    val nodeId: String,

    val name: String,
    val label: String?,
    @JsonProperty("content_type")
    val contentType: String,
    val size: Long,
    @JsonProperty("download_count")
    val downloadCount: Long,
    val uploader: Author,
    @JsonProperty("browser_download_url")
    val url: String,

    @JsonProperty("created_at")
    val createdAt: Instant,
    @JsonProperty("updated_at")
    val updatedAt: Instant
)
