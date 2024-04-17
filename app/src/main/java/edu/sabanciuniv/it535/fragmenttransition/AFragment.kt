package edu.sabanciuniv.it535.fragmenttransition

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import edu.sabanciuniv.it535.fragmenttransition.databinding.FragmentABinding

class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentABinding.inflate(inflater, container, false)
        binding.buttonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.BFragment)
        }
        return binding.root
    }

}