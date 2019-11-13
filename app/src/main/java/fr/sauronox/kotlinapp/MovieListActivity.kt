package fr.sauronox.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*
import java.util.*

class MovieListActivity : AppCompatActivity() {

    var Movies = listOf<Movie>(
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe"),
        Movie(title="Test 1", description="Description film 1", pathImg="url img", rate=1, filmDate= Date(1998, 5, 10), realisator = "John Doe")
    )

    private lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        adapter = MovieAdapter(Movies)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun generateFakeData(numberData: Int): List<Movie>{
        val list = listOf<Movie>()
       // for()
        return list
    }
}

