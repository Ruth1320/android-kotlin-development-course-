package com.example.movies_list.ui
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.movies_list.R
import androidx.recyclerview.widget.RecyclerView
import com.example.movies_list.data.models.MovieItem
import com.example.movies_list.databinding.ItemLayoutBinding

class ItemAdapter(val movieItems: List<MovieItem>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
    class ItemViewHolder(private val binding: ItemLayoutBinding): RecyclerView.
    ViewHolder(binding.root){
        fun bind(movieItem: MovieItem){
            binding.mainTitle.text = binding.root.context.getString(R.string.movie_title,
                movieItem.title, movieItem.releaseYear)
            binding.rating.text = movieItem.rating.toString()
            binding.overview.text = movieItem.overview
                //TODO LOAD THE IMAGE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemViewHolder(
        ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) =
        holder.bind(movieItems[position])

    override fun getItemCount() = movieItems.size

}