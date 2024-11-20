package com.example.pertemuan8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FriendsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FriendsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var friendAdapter: MyFriendAdapter
    private val friend = mutableListOf<MyFriend>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_friends, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        setupRecycleView()
        return view
    }

    private fun setupRecycleView(){
        friend.addAll(
            listOf(
                MyFriend("Prabowo","08113600520", "example1@email.com"),
                MyFriend("Joko Widodo","08113600521", "example2@email.com"),
                MyFriend("Megawati","08113600522", "example3@email.com"),
                MyFriend("SBY","08113600523", "example4@email.com"),
                MyFriend("Gibran","08113600524", "example5@email.com"),
                MyFriend("Nadiem Makarim","08113600525", "example6@email.com"),
                MyFriend("Kaesang","08113600526", "example7@email.com"),
                MyFriend("Hamba Allah","08113600527", "example8@email.com"),
                MyFriend("Jendral Andika Perkasa","08113600528", "example9@email.com"),
                MyFriend("Deny Caknan","08113600529", "example10@email.com"),
                MyFriend("Happy Asmara","08113600530", "example11@email.com"),
                MyFriend("Ramuan Herbal","08113600531", "example12@email.com"),
            )
        )

        friendAdapter = MyFriendAdapter(friend)
        recyclerView.layoutManager = LinearLayoutManager (requireContext())
        recyclerView.adapter = friendAdapter
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FriendsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FriendsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}