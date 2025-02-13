package com.example.hotwireexample.main

import android.app.Application
import dev.hotwire.core.config.Hotwire
import dev.hotwire.core.turbo.config.PathConfiguration

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
  }
}
