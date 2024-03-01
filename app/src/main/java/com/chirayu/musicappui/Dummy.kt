package com.chirayu.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon:Int, val name:String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_music_video_24,"Playlist"),
    Lib(R.drawable.baseline_music_video_24,"Artists"),
    Lib(R.drawable.baseline_music_video_24,"Album"),
    Lib(R.drawable.baseline_music_video_24,"Songs"),
    Lib(R.drawable.baseline_music_video_24,"Genre"),
)
