package com.example.godspeed.fragments

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentManager
import com.example.godspeed.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TeamFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TeamFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private val alexandreFragment = AlexandreFragment()
    private val barbaraFragment = BarbaraFragment()
    private val goncaloFragment = GoncaloFragment()
    private val pedroFragment = PedroFragment()
    private val ricardoFragment = RicardoFragment()
    private val rafaelFragment = RafaelFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_team, container, false)
        val alexandreBtn: ImageButton = view.findViewById(R.id.btn_alexandre)
        val barbaraBtn: ImageButton = view.findViewById(R.id.btn_barbara)
        val goncaloBtn: ImageButton = view.findViewById(R.id.btn_goncalo)
        val pedroBtn: ImageButton = view.findViewById(R.id.btn_pedro)
        val rafaelBtn: ImageButton = view.findViewById(R.id.btn_rafael)
        val ricardoBtn: ImageButton = view.findViewById(R.id.btn_ricardo)
        alexandreBtn.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_alexandre -> {
                replaceFragment(alexandreFragment)
            }
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_container, fragment)
        transaction?.commit()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TeamFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TeamFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}