package com.example.myapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController



class LoginFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_login, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val emailEditText: EditText = view.findViewById(R.id.emailEditText)
            val passwordEditText: EditText = view.findViewById(R.id.passwordEditText)
            val loginButton: Button = view.findViewById(R.id.loginButton)

            loginButton.setOnClickListener {
                // Handle login logic
                findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            }
        }
    }
