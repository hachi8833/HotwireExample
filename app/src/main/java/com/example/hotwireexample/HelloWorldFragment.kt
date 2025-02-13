package com.example.hotwireexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.hotwire.navigation.destinations.HotwireDestinationDeepLink
import dev.hotwire.navigation.fragments.HotwireFragment
import com.example.hotwireexample.main.*

@HotwireDestinationDeepLink(uri = "hotwire://fragment/hello_world")
class HelloWorldFragment: HotwireFragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.hello_world, container, false)
  }
}
