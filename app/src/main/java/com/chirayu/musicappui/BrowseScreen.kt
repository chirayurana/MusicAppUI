package com.chirayu.musicappui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable

@Composable
fun Browse(){
    val categories = listOf("Best Hits","Popular","All time","Global","Local","Worldwide")
    LazyVerticalGrid(columns = GridCells.Fixed(2)){
        items(categories){
            cat ->
            BrowserItem(cat = cat, drawable = R.drawable.baseline_apps_24)
        }

    }
}