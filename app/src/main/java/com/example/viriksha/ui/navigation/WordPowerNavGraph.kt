package com.example.viriksha.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.viriksha.R
import com.example.viriksha.data.repositoryImpl.CategoriesRepositoryImpl
import com.example.viriksha.ui.presentations.home.HomeScreen
import com.example.viriksha.ui.presentations.home.HomeViewModel
import com.example.viriksha.ui.presentations.news.NewsScreen

@Composable
fun WordPowerNavigationGraph(
    navHostController: NavHostController,
    startDestination: String,
    scrollState: LazyListState
) {
    NavHost(
        navController = navHostController,
        startDestination = startDestination,
    ) {
        composable(
            route = Screen.Home.route,
        ) {
            HomeScreen(
                navController = navHostController,
                viewModel = HomeViewModel(categoryRepository = CategoriesRepositoryImpl()),
            )
        }
        composable(
            route = Screen.News.route,
        ) {
            NewsScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SetupNavigation(startDestination: String) {

    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val scrollState = rememberLazyListState()
    val state by remember { derivedStateOf { scrollState.firstVisibleItemIndex == 0 } }

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = stringResource(R.string.news))
            }, actions = {
                IconButton(
                    onClick = { },
                ) {
                    Icon(
                        Icons.Rounded.Search,
                        contentDescription = stringResource(R.string.search)
                    )
                }
            })
        },
    ) {
        WordPowerNavigationGraph(
            navHostController = navController,
            scrollState = scrollState,
            startDestination = startDestination
        )
    }
}