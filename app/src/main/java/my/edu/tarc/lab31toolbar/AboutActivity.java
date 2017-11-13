package my.edu.tarc.lab31toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {
    private String url = "https://www.google.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        setContentView(webView);

        //WebView webViewAbout = (WebView)findViewById(R.id.webViewAbout);
        webView.loadUrl(url);
        //or webViewAbout.loadUrl("http://www.google.com");
    }
}
