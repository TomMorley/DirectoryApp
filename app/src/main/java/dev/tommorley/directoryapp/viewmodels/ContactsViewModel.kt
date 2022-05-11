package dev.tommorley.directoryapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dev.tommorley.directoryapp.api.DirectoryDataService
import dev.tommorley.directoryapp.data.models.ApiResult
import dev.tommorley.directoryapp.data.models.Contact
import kotlinx.coroutines.flow.flow

class ContactsViewModel constructor(private val service: DirectoryDataService) : ViewModel() {
    val contactsLiveData = flow {
        val response = service.getPeople()
        emit(response)
    }.asLiveData()
}