package app.z0nen.slidemenu;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Z0NEN on 10/22/2014.
 */
public class menu3_Fragment extends Fragment {
    View rootView;
    WebView web2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.menu3_layout, container, false);
        web2 = (WebView) rootView.findViewById(R.id.webViewMoodle);
        web2.setWebViewClient(new myWebClient());
        web2.getSettings().setJavaScriptEnabled(true);
        web2.loadUrl("http://moodle.baskent.edu.tr/");

        web2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        web2.getSettings().setUseWideViewPort(true);
        web2.getSettings().setLoadWithOverviewMode(true);
        web2.getSettings().setSupportZoom(true);
        web2.getSettings().setBuiltInZoomControls(true);

        return rootView;
    }
    public class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            return true;

        }
    }
}
