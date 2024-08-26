package com.example.viriksha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.viriksha.ui.navigation.SetupNavigation
import com.example.viriksha.ui.presentations.splash.SplashViewModel
import com.example.viriksha.ui.theme.CustomTheme
import com.example.viriksha.ui.theme.VirikshaTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val splashViewModel = SplashViewModel()
        //val viewModel: SplashViewModel = viewModel() //viewmodel-compose It handles the ViewModel’s lifecycle automatically, aligning it with the Composable's lifecycle. This means you can easily obtain a ViewModel instance without manually setting up ViewModelProviders or dealing with the complexities of Fragment or Activity contexts.

        installSplashScreen().apply {
            setKeepOnScreenCondition { splashViewModel.isLoading.value }
        }

        setContent {
            CustomTheme {
                val screen by splashViewModel.startDestination
                SetupNavigation(
                    startDestination = screen
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VirikshaTheme {
        Greeting("Android")
    }
}