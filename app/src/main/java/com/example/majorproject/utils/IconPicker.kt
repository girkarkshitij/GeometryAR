package com.example.majorproject.utils

import com.example.majorproject.R

object IconPicker {
    val icons = arrayOf(
        R.drawable.cube,
        R.drawable.cuboid,
        R.drawable.sphere,
        R.drawable.app_logo,
        R.drawable.app_logo_,
        R.drawable.app_logo_main
    )
    var currentIcon = 0

    fun getIcon(): Int {
        currentIcon = (currentIcon + 1) % icons.size
        return icons[currentIcon]
    }
}