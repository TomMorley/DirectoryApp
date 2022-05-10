package dev.tommorley.directoryapp.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import dev.tommorley.directoryapp.ContactsFragment
import dev.tommorley.directoryapp.RoomsFragment

const val CONTACTS_PAGE_INDEX = 0
const val ROOMS_PAGE_INDEX = 1

class DirectoryAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {


    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        CONTACTS_PAGE_INDEX to { ContactsFragment() },
        ROOMS_PAGE_INDEX to { RoomsFragment() }
    )

    override fun getItemCount(): Int {
        return tabFragmentsCreators.size
    }

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}