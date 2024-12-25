package com.upload.fetchrewardscodingexercise

import com.upload.fetchrewardscodingexercise.network.ApiService

class ItemRepository(private val apiService: ApiService) {
    suspend fun fetchItems(): List<Item> {
        val items = apiService.getItems()
        return items.filter { it.name.isNullOrEmpty().not() }
            .sortedWith(compareBy({ it.listId }, { it.name }))
    }
}
