package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.zzw;
import java.net.URI;
import java.net.URISyntaxException;

public class zzjy
  extends WebViewClient
{
  private final zzgo zzGs;
  private final String zzOl;
  private boolean zzOm;
  private final zzjp zzpD;
  
  public zzjy(zzgo paramzzgo, zzjp paramzzjp, String paramString)
  {
    String str = zzaR(paramString);
    this.zzOl = str;
    this.zzOm = false;
    this.zzpD = paramzzjp;
    this.zzGs = paramzzgo;
  }
  
  private String zzaR(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return paramString;
      String str = "/";
      try
      {
        bool = paramString.endsWith(str);
        if (bool)
        {
          bool = false;
          str = null;
          int i = paramString.length() + -1;
          paramString = paramString.substring(0, i);
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        str = localIndexOutOfBoundsException.getMessage();
        zzin.e(str);
      }
    }
  }
  
  public void onLoadResource(WebView paramWebView, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = "JavascriptAdWebViewClient::onLoadResource: ";
    localObject1 = (String)localObject2 + paramString;
    zzin.zzaI((String)localObject1);
    boolean bool = zzaQ(paramString);
    if (!bool)
    {
      localObject1 = this.zzpD.zzhU();
      localObject2 = this.zzpD.getWebView();
      ((zzjq)localObject1).onLoadResource((WebView)localObject2, paramString);
    }
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = "JavascriptAdWebViewClient::onPageFinished: ";
    localObject = str + paramString;
    zzin.zzaI((String)localObject);
    boolean bool = this.zzOm;
    if (!bool)
    {
      localObject = this.zzGs;
      ((zzgo)localObject).zzge();
      bool = true;
      this.zzOm = bool;
    }
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = "JavascriptAdWebViewClient::shouldOverrideUrlLoading: ";
    localObject1 = (String)localObject2 + paramString;
    zzin.zzaI((String)localObject1);
    boolean bool = zzaQ(paramString);
    if (bool)
    {
      localObject1 = "shouldOverrideUrlLoading: received passback url";
      zzin.zzaI((String)localObject1);
    }
    for (bool = true;; bool = ((zzjq)localObject1).shouldOverrideUrlLoading((WebView)localObject2, paramString))
    {
      return bool;
      localObject1 = this.zzpD.zzhU();
      localObject2 = this.zzpD.getWebView();
    }
  }
  
  protected boolean zzaQ(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = zzaR(paramString);
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool3) {}
    for (;;)
    {
      return bool2;
      try
      {
        Object localObject2 = new java/net/URI;
        ((URI)localObject2).<init>((String)localObject1);
        localObject1 = "passback";
        String str1 = ((URI)localObject2).getScheme();
        boolean bool4 = ((String)localObject1).equals(str1);
        if (bool4)
        {
          localObject1 = "Passback received";
          zzin.zzaI((String)localObject1);
          localObject1 = this.zzGs;
          ((zzgo)localObject1).zzgf();
          bool2 = bool1;
        }
        else
        {
          localObject1 = this.zzOl;
          bool4 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool4)
          {
            localObject1 = new java/net/URI;
            str1 = this.zzOl;
            ((URI)localObject1).<init>(str1);
            str1 = ((URI)localObject1).getHost();
            String str2 = ((URI)localObject2).getHost();
            localObject1 = ((URI)localObject1).getPath();
            localObject2 = ((URI)localObject2).getPath();
            boolean bool5 = zzw.equal(str1, str2);
            if (bool5)
            {
              bool4 = zzw.equal(localObject1, localObject2);
              if (bool4)
              {
                localObject1 = "Passback received";
                zzin.zzaI((String)localObject1);
                localObject1 = this.zzGs;
                ((zzgo)localObject1).zzgf();
                bool2 = bool1;
              }
            }
          }
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        String str3 = localURISyntaxException.getMessage();
        zzin.e(str3);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */