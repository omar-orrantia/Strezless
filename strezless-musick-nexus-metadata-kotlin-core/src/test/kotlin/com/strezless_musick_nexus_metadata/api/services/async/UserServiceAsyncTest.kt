// File generated from our OpenAPI spec by Stainless.

package com.strezless_musick_nexus_metadata.api.services.async

import com.strezless_musick_nexus_metadata.api.client.okhttp.StrezlessMusickNexusMetadataOkHttpClientAsync
import com.strezless_musick_nexus_metadata.api.models.user.User
import com.strezless_musick_nexus_metadata.api.models.user.UserLoginParams
import com.strezless_musick_nexus_metadata.api.models.user.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            StrezlessMusickNexusMetadataOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        val user =
            userServiceAsync.create(
                User.builder()
                    .id(10L)
                    .email("john@email.com")
                    .firstName("John")
                    .lastName("James")
                    .password("12345")
                    .phone("12345")
                    .username("theUser")
                    .userStatus(1)
                    .build()
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            StrezlessMusickNexusMetadataOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        val user = userServiceAsync.retrieve("username")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            StrezlessMusickNexusMetadataOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        userServiceAsync.update(
            UserUpdateParams.builder()
                .existingUsername("username")
                .user(
                    User.builder()
                        .id(10L)
                        .email("john@email.com")
                        .firstName("John")
                        .lastName("James")
                        .password("12345")
                        .phone("12345")
                        .username("theUser")
                        .userStatus(1)
                        .build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            StrezlessMusickNexusMetadataOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        userServiceAsync.delete("username")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createWithList() {
        val client =
            StrezlessMusickNexusMetadataOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        val user =
            userServiceAsync.createWithList(
                listOf(
                    User.builder()
                        .id(10L)
                        .email("john@email.com")
                        .firstName("John")
                        .lastName("James")
                        .password("12345")
                        .phone("12345")
                        .username("theUser")
                        .userStatus(1)
                        .build()
                )
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun login() {
        val client =
            StrezlessMusickNexusMetadataOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        userServiceAsync.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun logout() {
        val client =
            StrezlessMusickNexusMetadataOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        userServiceAsync.logout()
    }
}
