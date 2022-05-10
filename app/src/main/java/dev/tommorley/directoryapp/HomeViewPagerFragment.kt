package dev.tommorley.directoryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import dev.tommorley.directoryapp.adapters.CONTACTS_PAGE_INDEX
import dev.tommorley.directoryapp.adapters.DirectoryAdapter
import dev.tommorley.directoryapp.adapters.ROOMS_PAGE_INDEX
import dev.tommorley.directoryapp.databinding.FragmentViewPagerBinding

class HomeViewPagerFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val tabLayout = binding.tabs
        val viewPager = binding.viewPager

        viewPager.adapter = DirectoryAdapter(this)

        // Set the icon and text for each tab
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
//            tab.setIcon(getTabIcon(position))
            tab.text = getTabTitle(position)
        }.attach()

//        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)

        return binding.root
    }

    private fun getTabTitle(position: Int): String? {
        return when (position) {
            CONTACTS_PAGE_INDEX -> getString(R.string.contact_list_title)
            ROOMS_PAGE_INDEX -> getString(R.string.room_list_title)
            else -> null
        }
    }
}