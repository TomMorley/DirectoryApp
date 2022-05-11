package dev.tommorley.directoryapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.tommorley.directoryapp.data.models.Contact
import dev.tommorley.directoryapp.databinding.ListItemContactBinding

class ContactListAdapter() :  RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {
    private var contacts : List<Contact> = listOf<Contact>()

    class ViewHolder(private val binding: ListItemContactBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
        }

        fun bind(item : Contact) {
            binding.contact = item
            binding.executePendingBindings()
        }
    }

    fun addContacts(contacts : List<Contact>) {
        this.contacts = contacts
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ListItemContactBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact : Contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount() = contacts.size
}