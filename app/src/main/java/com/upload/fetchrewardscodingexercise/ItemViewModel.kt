package com.upload.fetchrewardscodingexercise



import androidx.lifecycle.*
import com.upload.fetchrewardscodingexercise.network.RetrofitInstance
import kotlinx.coroutines.launch

class ItemViewModel : ViewModel() {
    private val repository = ItemRepository(RetrofitInstance.apiService)

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> get() = _items

    fun fetchItems() {
        viewModelScope.launch {
            val fetchedItems = repository.fetchItems()
            _items.postValue(fetchedItems)
        }
    }
}
