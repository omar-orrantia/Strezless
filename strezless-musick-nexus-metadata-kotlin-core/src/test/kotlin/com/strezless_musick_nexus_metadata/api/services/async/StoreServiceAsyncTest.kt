// File generated from our OpenAPI spec by Stainless.

package com.strezless_musick_nexus_metadata.api.services.async

import com.strezless_musick_nexus_metadata.api.client.okhttp.StrezlessMusickNexusMetadataOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listInventory() {
        val client =
            StrezlessMusickNexusMetadataOkHttpClientAsync.builder().apiKey("My API Key").build()
        val storeServiceAsync = client.store()

        val response = storeServiceAsync.listInventory()

        response.validate()
    }
}
