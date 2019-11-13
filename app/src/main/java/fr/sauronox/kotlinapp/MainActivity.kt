package fr.sauronox.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]
        viewModel.getState().observe(this, Observer { updateUi(it!!) })

        connection.setOnClickListener{
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            viewModel.login(email, password)
//            if(name == "kotlin" && password == "rocks"){
//                Toast.makeText(this, "Identifiant de connexion correct.", Toast.LENGTH_LONG).show()
//                val intent = Intent(this, MovieListActivity::class.java)
//                startActivity(intent)
//                // setContentView(R.layout.activity_movie_list)
//            }else{
//                Toast.makeText(this, "Wrong password and name.", Toast.LENGTH_LONG).show()
//                errorMsg.text = "Wrong password or name !!";
//                errorMsg.visibility = View.VISIBLE;
//                Handler().postDelayed({
//                    errorMsg.visibility = View.INVISIBLE;
//                    errorMsg.text = ""
//                    //Do something after 100ms
//                }, 3000)
//            }
        }
    }

    private fun updateUi(state : MainViewModelState) {
        return when(state){
            is MainViewModelState.Loading -> {

            }
            is MainViewModelState.Success -> {
                val intent = Intent(this, MovieListActivity::class.java)
                startActivity(intent)

            }
            is MainViewModelState.Failure ->{
                Toast.makeText(this, state.errorMessage, Toast.LENGTH_LONG).show()
            }
        }
    }

    public override fun onStart() {
        super.onStart()

        // manage other components that need to respond
        // to the activity lifecycle
    }

    public override fun onStop() {
        super.onStop()

        // manage other components that need to respond
        // to the activity lifecycle
    }
}
