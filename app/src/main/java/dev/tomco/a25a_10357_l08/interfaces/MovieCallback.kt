package dev.tomco.a25a_10357_l08.interfaces

import dev.tomco.a25a_10357_l08.models.Movie

interface MovieCallback {
    fun favoriteButtonClicked(movie: Movie, position: Int)
}