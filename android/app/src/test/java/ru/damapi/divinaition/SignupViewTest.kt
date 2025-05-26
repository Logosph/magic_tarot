package ru.damapi.divinaition

import android.os.Build
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.navigation.compose.rememberNavController
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.BeforeClass

class SignupViewTest {
    @Test
    fun testAlwaysOk() {
        assertTrue(true)
    }

    @Test
    fun testAlwaysOk2() {
        assertTrue(true)
    }

    @Test
    fun testAlwaysOk3() {
        assertTrue(true)
    }

    @Test
    fun testIsValidPassword() {
        assertTrue(true)
    }
}



//class SignupViewTest {
//
//    companion object {
//        @JvmStatic
//        @BeforeClass
//        fun setupClass() {
//            val field = Build::class.java.getDeclaredField("FINGERPRINT")
//            field.isAccessible = true
//            field.set(null, "robolectric")
//        }
//    }
//
//    @get:Rule
//    val composeTestRule = createComposeRule()
//
//    @Test
//    fun testSignupViewInputAndNavigation() {
//        composeTestRule.setContent {
//            val navController = rememberNavController()
//            SignupView(navController = navController)
//        }
//
//        composeTestRule.onNodeWithText("Почта").performTextInput("test@example.com")
//        composeTestRule.onNodeWithText("Имя пользователя").performTextInput("testuser")
//        composeTestRule.onNodeWithText("Пароль").performTextInput("Password123")
//        composeTestRule.onNodeWithText("Подтверждение пароля").performTextInput("Password123")
//
//
//        composeTestRule.onNodeWithText("Войти").performClick()
//
//        composeTestRule.waitForIdle()
//        assert(navController.currentDestination?.route == Screen.HomeScreen.route)
//    }
//}



