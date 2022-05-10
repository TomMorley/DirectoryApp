package dev.tommorley.directoryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.tommorley.directoryapp.databinding.FragmentRoomsBinding

class RoomsFragment : Fragment() {


    private lateinit var binding: FragmentRoomsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRoomsBinding.inflate(inflater, container, false)
//        val adapter = GardenPlantingAdapter()
//        binding.gardenList.adapter = adapter

//        binding.addPlant.setOnClickListener {
//            navigateToPlantListPage()
//        }

//        subscribeUi(adapter, binding)
        return binding.root
    }
}