package vinkoviljevac.ferit.mainactivityzad2.data.repsitory

import io.reactivex.Single
import vinkoviljevac.ferit.mainactivityzad2.data.api.ApiHelper
import vinkoviljevac.ferit.mainactivityzad2.data.model.User

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}