package dev.tommorley.directoryapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.tommorley.directoryapp.api.DirectoryDataService

class ContactsViewModelFactory constructor(private val service: DirectoryDataService) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ContactsViewModel(service) as T
    }
}