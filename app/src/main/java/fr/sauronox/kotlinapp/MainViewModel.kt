package fr.sauronox.kotlinapp

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

sealed class MainViewModelState(
    val errorMessage: String = "",
    val loading: Boolean = false
){
   class Loading(): MainViewModelState("",true)
   class Success(): MainViewModelState("", false)
   class Failure(errorMessage: String): MainViewModelState(errorMessage)
}

class MainViewModel: ViewModel() {
    private val state = MutableLiveData<MainViewModelState>()
    fun getState(): LiveData<MainViewModelState> = state
    fun login(email: String, password: String) {
        state.value = MainViewModelState.Loading()
        Handler().postDelayed({
            state.value = MainViewModelState.Success()
            if(email == "kotlin" && password == "rocks"){
                state.value = MainViewModelState.Success()
            }else{
                state.value = MainViewModelState.Failure("Error : wrong email or password.")
            }
        },3000)

    }
}