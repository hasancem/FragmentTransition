package edu.sabanciuniv.it535.fragmenttransition

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import edu.sabanciuniv.it535.fragmenttransition.databinding.FragmentXBinding

class XFragment : Fragment() {

    private lateinit var binding: FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentXBinding.inflate(inflater, container, false)
        binding.buttonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.YFragment)
        }
        return binding.root
    }
}