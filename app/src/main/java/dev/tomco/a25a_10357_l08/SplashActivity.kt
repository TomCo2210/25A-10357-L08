package dev.tomco.a25a_10357_l08

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView

import dev.tomco.a25a_10357_l08.databinding.ActivitySplashBinding
import dev.tomco.a25a_10357_l08.databinding.MovieItemBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)

        setContentView(binding.root)

        startAnimation(binding.splashLOTTIELottie)
    }

    private fun startAnimation(lottieAnimationView: LottieAnimationView) {
        lottieAnimationView.resumeAnimation()
        lottieAnimationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator) {
                // Go fetch data from server
            }

            override fun onAnimationEnd(p0: Animator) {
                transactToMainActivity()
            }

            override fun onAnimationCancel(p0: Animator) {
                // Remove all data created and clean memory.
            }

            override fun onAnimationRepeat(p0: Animator) {
                // check if data received
                // if true - cancel repeats.
            }

        })
    }

    private fun transactToMainActivity() {
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
}