package com.kclaassen.calorytracker.navigation

import androidx.navigation.NavController
import com.kclaassen.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}