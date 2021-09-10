package com.example.mobilenews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.mobilenews.databinding.FragmentNewsBinding
import com.example.mobilenews.util.getDetailheaderTitle

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NewsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewsFragment : Fragment() {

    private lateinit var binding: FragmentNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_news, container, false
        )
        // Set TExt
        binding.header = getDetailheaderTitle()
        binding.imageUrl =
            "https://blog.jetbrains.com/wp-content/uploads/2021/07/1.5.30-M1_banners-01.png"

        return binding.root


    }


}

//fun replace(view: View) {
//    val detailFragment = DetailFragment()
//
//    val trans = Activity?.supportFragmentManager?.beginTransaction()
//    trans?.replace(binding.frmContainerDetail.id, detailFragment)
//    trans?.commit()
//    Log.e("Eklendi","eklendi")
//}

//binding.frmContainerDetail1.setOnClickListener {
//    Log.e("Geldi","Geldi")
//    //
//    //            replace(it)
//}