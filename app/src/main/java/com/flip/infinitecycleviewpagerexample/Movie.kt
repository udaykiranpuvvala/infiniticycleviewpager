package com.flip.infinitecycleviewpagerexample

class Movie {
    var name: String? = null
    var description: String? = null
    var image: Int = 0

    constructor(name: String, description: String, image: Int) {
        this.name = name
        this.description = description
        this.image = image
    }
}