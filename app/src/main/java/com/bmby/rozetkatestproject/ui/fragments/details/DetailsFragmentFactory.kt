package com.bmby.rozetkatestproject.ui.fragments.details

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject

class DetailsFragmentFactory
@Inject
constructor(
): FragmentFactory() {

    lateinit var id : String

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            DetailsFragment::class.java.name -> {
                val fragment = DetailsFragment(id)
                fragment
            }
            else -> super.instantiate(classLoader, className)
        }
    }

}