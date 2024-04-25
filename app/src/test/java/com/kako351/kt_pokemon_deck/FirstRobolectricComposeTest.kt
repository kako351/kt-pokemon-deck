package com.kako351.kt_pokemon_deck

import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@RunWith(RobolectricTestRunner::class)
class FirstRobolectricComposeTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun roborazziTest() {
        composeRule.setContent {
            Greeting(name = "Android")
        }

        composeRule
            .onNode(hasText("Hello World Android!"))
            .captureRoboImage()

        composeRule
            .onRoot()
            .captureRoboImage()
    }
}