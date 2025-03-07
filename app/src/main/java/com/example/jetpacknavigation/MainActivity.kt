package com.example.jetpacknavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpacknavigation.ui.theme.JetpackNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackNavigationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun MyApp(modifier: Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "firstScreen"
    ){
        composable( route = "firstScreen" ){
            FirstScreen(modifier){name->
                navController.navigate("secondScreen/$name")
            }
        }
        composable( route = "secondScreen/{name}" ){
            SecondScreen(name = it.arguments?.getString("name")?:" no name" ){
                navController.navigate("firstScreen")
            }
        }
        composable( route = "thirdScreen" ){
            ThirdScreen()
        }
    }
}





