package dev.tomco.a25a_10357_l08

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.tomco.a25a_10357_l08.adapters.MovieAdapter
import dev.tomco.a25a_10357_l08.databinding.ActivityMainBinding
import dev.tomco.a25a_10357_l08.interfaces.MovieCallback
import dev.tomco.a25a_10357_l08.models.DataManager
import dev.tomco.a25a_10357_l08.models.Movie

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val movieAdapter = MovieAdapter(DataManager.generateMovieList())
        movieAdapter.movieCallback = object : MovieCallback{
            override fun favoriteButtonClicked(movie: Movie, position: Int) {
                movie.isFavorite = !movie.isFavorite
                movieAdapter.notifyItemChanged(position)
            }

        }

        binding.mainRVList.adapter = movieAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        binding.mainRVList.layoutManager = linearLayoutManager

    }
}