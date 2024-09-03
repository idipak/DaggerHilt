package com.example.dipractice.data.location

import android.location.Location
import com.example.dipractice.domain.location.LocationTracker

class DefaultLocationTracker: LocationTracker {
    override suspend fun getLocation(): Location? {
        TODO("Not yet implemented")
    }
}