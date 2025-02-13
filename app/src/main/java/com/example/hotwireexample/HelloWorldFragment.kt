package com.example.hotwireexample

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
