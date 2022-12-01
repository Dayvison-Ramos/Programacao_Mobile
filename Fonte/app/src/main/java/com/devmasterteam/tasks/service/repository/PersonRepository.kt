package com.devmasterteam.tasks.service.repository

import com.devmasterteam.tasks.service.model.PersonModel
import com.devmasterteam.tasks.service.repository.local.remote.PersonService
import com.devmasterteam.tasks.service.repository.local.remote.RetrofitClient
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class PersonRepository {

    val remote = RetrofitClient.getService(PersonService::class.java )

    fun login(email: String, password: String) {
       val call = remote.login(email, password)
        call.enqueue(object : Callback<PersonModel> {
            override fun onResponse(call: Call<PersonModel>, response: Response<PersonModel>) {

            }

            override fun onFailure(call: Call<PersonModel>, t: Throwable) {

            }

        })
    }
}