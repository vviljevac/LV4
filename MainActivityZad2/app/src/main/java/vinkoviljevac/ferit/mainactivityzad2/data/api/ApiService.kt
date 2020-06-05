package vinkoviljevac.ferit.mainactivityzad2.data.api

import io.reactivex.Single
import vinkoviljevac.ferit.mainactivityzad2.data.model.User

interface ApiService {

    fun getUsers(): Single<List<User>>

}