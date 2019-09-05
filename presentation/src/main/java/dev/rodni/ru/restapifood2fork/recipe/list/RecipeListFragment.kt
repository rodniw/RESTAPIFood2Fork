package dev.rodni.ru.restapifood2fork.recipe.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment

//todo create list adapter and implement it in this fragment
class RecipeListFragment : DaggerFragment() {

    companion object {

        private const val ARG_TYPE = "type"

        fun newInstance(type: Int): RecipeListFragment {
            val fragment = RecipeListFragment()
            val args = Bundle()
            args.putSerializable(ARG_TYPE, type)
            fragment.arguments = args
            return fragment
        }
    }

    //todo inject navigator and view model factory

    //todo data binding

    //todo attach to a view model

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //todo data binding inflate
        //todo callbacks to attach
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //this val is to get extras from creation the fragment and to use them later by view model
        val eventType = arguments?.getInt(ARG_TYPE)!!
        //todo load this eventtype to a special variable inside a view model
    }


}