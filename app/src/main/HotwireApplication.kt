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
