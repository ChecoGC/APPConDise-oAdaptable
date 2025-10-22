package com.example.reply.test

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.reply.ui.ReplyApp
import com.example.reply.test.onNodeWithTagForStringId
import org.junit.Rule
import org.junit.Test
import com.example.reply.R



class ReplyAppTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun compactDevice_verifyUsingBottomNavigation() {
        // Configura la ventana compacta
        composeTestRule.setContent {
            ReplyApp(windowSize = WindowWidthSizeClass.Companion.Compact)
        }

        // Verifica que la barra de navegación inferior exista
        composeTestRule.onNodeWithTagForStringId(R.string.navigation_bottom).assertExists()
    }
}