# webViewAndroid
web view is a view that is used to display web pages inside the app.
it is used to turn the application into a web application

--- 
# add these to your gradle (app) file
```kotlin 
plugins{
id 'kotlin-android-extensions'
}
```
# step2
modify activity_main.xml 

```kotlin
<WebView 
  android:id = "@+id/webview"
  android:layout_width = "match_parent"
  android:layout_height = "match_parent"
  />
  ```
  # step3
  modify the mainActivity.kt file
  ```kotlin
  val findId= findViewById<WebView>(R.id.webview)
  webviewSetup(findId)
  }
  private fun webviewSetup(a:WebView)
  {
  a.WebViewClient= WebVIewClient()
  a.apply{
    Setting.javaScriptEnable = true
    loadUrl("enter your Web Url")
    }
  }
  
  ```
  # step 4
  add the internet permission goto the manifest file 
  add the 
  ```kotlin
  <uses-permission android:name="android.permission.INTERNET"/>
  ```
