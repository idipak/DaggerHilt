package com.example.dipractice.domain.location

import android.location.Location

interface LocationTracker {
    suspend fun getLocation(): Location?
}