package com.github.cesar1287.turma3sib

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.github.cesar1287.turma3sib.RegisterFragment.Companion.KEY_INTENT_USER
import com.github.cesar1287.turma3sib.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val user = arguments?.getParcelable(KEY_INTENT_USER) as? User

        val textView = activity?.findViewById<TextView>(R.id.tvMainHelloWorld)
        val randomButton = activity?.findViewById<Button>(R.id.btMainRandom)

        textView?.text = "Meu nome é ${user?.name}\n" +
                "Meu email é ${user?.email}\n" +
                "Minha senha é ${user?.password}\n" +
                "E minha idade é ${user?.age}"

        randomButton?.setOnClickListener {
            val randomNumber = (Math.random() * 10).toInt()
            val text = getString(
                R.string.sorted_number,
                randomNumber,
                "sorteado é"
            )
            textView?.text = text
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}