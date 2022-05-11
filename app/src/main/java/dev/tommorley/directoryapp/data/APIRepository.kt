package dev.tommorley.directoryapp.data

import dev.tommorley.directoryapp.api.DirectoryDataService
import dev.tommorley.directoryapp.data.models.Contact
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow

//class APIRepository constructor(private val service: DirectoryDataService) {
//
//    fun getContacts() : Flow<List<Contact>> {
//        flow<List<Contact>> {
//            emit(service.getPeople())
//        }
//    }
//}