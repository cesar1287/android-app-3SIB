package com.github.cesar1287.turma3sib

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.cesar1287.turma3sib.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private var binding: FragmentRegisterBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.let {
            with(it) {
                btRegisterSave.setOnClickListener {
                    val name = tieRegisterName.text.toString()
                    val email = tieRegisterEmail.text.toString()
                    val password = tieRegisterPassword.text.toString()

                    if (name.isBlank()) {
                        tilRegisterName.error = getString(R.string.error_empty_field)
                    } else {
                        tilRegisterName.isErrorEnabled = false
                    }

                    val user = User(
                        age = 26,
                        password = password,
                        name = name,
                        email = email
                    )

                    val args = Bundle()
                    args.putParcelable(KEY_INTENT_USER, user)
                    findNavController()
                        .navigate(
                            R.id.action_registerFragment_to_mainFragment,
                            args
                        )
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        const val KEY_INTENT_USER = "user"
    }
}