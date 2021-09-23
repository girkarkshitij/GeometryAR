package com.example.majorproject.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Solid (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)