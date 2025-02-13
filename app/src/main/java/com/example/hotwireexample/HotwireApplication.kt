package com.example.hotwireexample.main

import android.app.Application
import dev.hotwire.core.config.Hotwire
import dev.hotwire.core.turbo.config.PathConfiguration
import dev.hotwire.navigation.config.defaultFragmentDestination
import dev.hotwire.navigation.config.registerFragmentDestinations
import com.example.hotwireexample.*

class HotwireApplication: Application() {
  override fun onCreate() {
    super.onCreate()
    configureApp()
  }

  private fun configureApp() {
    Hotwire.loadPathConfiguration(
      context = this,
      location = PathConfiguration.Location(
        assetFilePath = "json/path-configuration.json"
      )
    )

    Hotwire.defaultFragmentDestination = WebFragment::class

    Hotwire.registerFragmentDestinations(
      WebFragment::class,
      WebBottomSheetFragment::class,
    )
  }
}
