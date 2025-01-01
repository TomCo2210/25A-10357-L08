package dev.tomco.a25a_10357_l08

import android.app.Application
import dev.tomco.a25a_10357_l08.utilities.ImageLoader

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        ImageLoader.init(this)
    }
}