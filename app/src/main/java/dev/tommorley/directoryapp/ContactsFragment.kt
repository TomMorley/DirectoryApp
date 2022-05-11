package dev.tommorley.directoryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import dev.tommorley.directoryapp.api.DirectoryDataService
import dev.tommorley.directoryapp.databinding.FragmentContactsBinding
import dev.tommorley.directoryapp.viewmodels.ContactsViewModel
import dev.tommorley.directoryapp.viewmodels.ContactsViewModelFactory


class ContactsFragment : Fragment() {

    private lateinit var binding: FragmentContactsBinding
    private lateinit var viewModel: ContactsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentContactsBinding.inflate(inflater, container, false)

        val repository = DirectoryDataService.create()
        viewModel = ViewModelProvider(this, ContactsViewModelFactory(repository)).get(ContactsViewModel::class.java)

        getContacts()
        return binding.root
    }

    private fun getContacts() {
        viewModel.contactsLiveData.observe(viewLifecycleOwner) { result ->
            result
            binding.textView.text = result.size.toString()
        }
    }
}