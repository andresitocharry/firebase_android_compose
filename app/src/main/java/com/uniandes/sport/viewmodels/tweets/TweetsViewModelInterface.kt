package com.uniandes.sport.viewmodels.tweets

import android.graphics.Bitmap
import com.uniandes.sport.models.Tweet
import com.uniandes.sport.viewmodels.storage.StorageViewModelInterface

interface TweetsViewModelInterface {
    fun fetchTweets(onSuccess: (List<Tweet>) -> Unit, onFailure: (Exception) -> Unit)
    fun postTweet(tweet: Tweet, onSuccess: () -> Unit, onFailure: (Exception) -> Unit)
}