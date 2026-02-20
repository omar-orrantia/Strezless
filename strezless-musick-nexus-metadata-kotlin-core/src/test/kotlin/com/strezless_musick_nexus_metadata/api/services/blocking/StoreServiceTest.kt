// File generated from our OpenAPI spec by Stainless.

package com.strezless_musick_nexus_metadata.api.services.blocking

import com.strezless_musick_nexus_metadata.api.client.okhttp.StrezlessMusickNexusMetadataOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInventory() {
        val client = StrezlessMusickNexusMetadataOkHttpClient.builder().apiKey("My API Key").build()
        val storeService = client.store()

        val response = storeService.listInventory()

        response.validate()
    }
}
