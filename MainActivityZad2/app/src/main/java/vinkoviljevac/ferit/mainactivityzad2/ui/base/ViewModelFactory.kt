package vinkoviljevac.ferit.mainactivityzad2.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import vinkoviljevac.ferit.mainactivityzad2.data.api.ApiHelper
import vinkoviljevac.ferit.mainactivityzad2.data.repsitory.MainRepository
import vinkoviljevac.ferit.mainactivityzad2.ui.main.viewmodel.MainViewModel


class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}