package com.example.movies_list.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies_list.databinding.HomeScreenBinding

class HomeScreenFragment: Fragment() {

    private var _binding : HomeScreenBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ItemsViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        _binding = HomeScreenBinding .inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.items?.observe(viewLifecycleOwner){
            binding.recycler.adapter = ItemAdapter(it, object: ItemAdapter.ItemListener{}
            binding.recycler.layoutManager= LinearLayoutManager(requireContext())

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}