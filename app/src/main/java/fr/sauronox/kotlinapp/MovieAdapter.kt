package fr.sauronox.kotlinapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(val movies: List<Movie>): RecyclerView.Adapter<MovieAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleMovie = itemView.findViewById<TextView>(R.id.titleMovie)
        val descriptionMovie = itemView.findViewById<TextView>(R.id.descriptionMovie)
        val dateMovie = itemView.findViewById<TextView>(R.id.dateMovie)
        val realisatorMovie = itemView.findViewById<TextView>(R.id.realisatorMovie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val viewItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val movie = movies[position]
        // with(holder){}
        holder.titleMovie.text = movie.title
        holder.descriptionMovie.text = movie.description
        holder.dateMovie.text = "Sortie le  ${movie.filmDate.day} ${movie.filmDate.month} ${movie.filmDate.year}"

    }

    override fun getItemCount(): Int = movies.size
}