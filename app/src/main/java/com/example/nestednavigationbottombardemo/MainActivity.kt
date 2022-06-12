package com.example.nestednavigationbottombardemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigationbottombardemo.graphs.RootNavigationGraph
import com.example.nestednavigationbottombardemo.ui.theme.NestedNavigationBottomBarDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedNavigationBottomBarDemoTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}