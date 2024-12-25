# FetchRewardsCodingExercise
Android app in Kotlin that retrieves the data from https://fetch-hiring.s3.amazonaws.com/hiring.json.
# Implementation
1. Create the Project
Make sure you have created a new project in Android Studio with the appropriate settings and configurations.

2. Add Necessary Dependencies
Ensure your build.gradle.kts file includes dependencies for Retrofit, Coroutines, LiveData, ViewModel, and RecyclerView.
#MainActivity.kt:

This is the main activity that initializes the UI and sets up the RecyclerView to display the list of items.

#ItemViewModel.kt:

The ViewModel manages the UI-related data in a lifecycle-conscious way. It fetches data from the repository and exposes it to the UI.

#ItemRepository.kt:

The repository handles data operations, such as fetching data from the network and processing it (filtering, sorting).

#ApiService.kt:

Retrofit service interface that defines the network request to fetch the data.

#RetrofitInstance.kt:

Singleton object to create and configure the Retrofit instance for network operations.

#Item.kt:

Data class representing the JSON structure of the items fetched from the network.

#ItemAdapter.kt:

RecyclerView adapter that binds the data to the views in the RecyclerView.
