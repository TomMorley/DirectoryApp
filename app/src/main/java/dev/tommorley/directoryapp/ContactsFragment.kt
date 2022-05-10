package dev.tommorley.directoryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.tommorley.directoryapp.databinding.FragmentContactsBinding

class ContactsFragment : Fragment() {

    private lateinit var binding: FragmentContactsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentContactsBinding.inflate(inflater, container, false)
//        val adapter = GardenPlantingAdapter()
//        binding.gardenList.adapter = adapter

//        binding.addPlant.setOnClickListener {
//            navigateToPlantListPage()
//        }

//        subscribeUi(adapter, binding)
        return binding.root
    }
}