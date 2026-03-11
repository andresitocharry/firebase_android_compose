package com.uniandes.sport.ui.screens.wallscreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.uniandes.sport.models.Tweet
import com.uniandes.sport.viewmodels.storage.StorageViewModelInterface


@Composable
fun TweetList(tweets: List<Tweet>, modifier: Modifier) {
    LazyColumn(modifier = modifier) {
        itemsIndexed(tweets) { _, tweet ->
            TweetCard(tweet)
            Divider()
        }
    }
}