package com.example.majorproject.daos

import com.example.majorproject.R
import com.example.majorproject.models.Solid

class SolidDao {
    fun loadSolid(): MutableList<Solid> {
        return mutableListOf<Solid>(
            Solid ("Cone", R.drawable.cone),
            Solid("Cube", R.drawable.cube),
            Solid("Cuboid", R.drawable.cuboid),
            Solid("Cylinder", R.drawable.cylinder),
            Solid("Sphere", R.drawable.sphere)
        )
    }
}