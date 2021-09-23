package com.example.majorproject.daos

import com.example.majorproject.R
import com.example.majorproject.models.Solid

class SolidDao {
    fun loadSolid(): List<Solid> {
        return listOf<Solid>(
            Solid (R.string.cone, R.drawable.cone),
            Solid(R.string.cube, R.drawable.cube),
            Solid(R.string.cuboid, R.drawable.cuboid),
            Solid(R.string.cylinder, R.drawable.cylinder),
            Solid(R.string.sphere, R.drawable.sphere)
        )
    }
}