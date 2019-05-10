package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HttpUrlFetcher
  implements DataFetcher
{
  static final HttpUrlFetcher.HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY;
  private static final int INVALID_STATUS_CODE = 255;
  private static final int MAXIMUM_REDIRECTS = 5;
  private static final String TAG = "HttpUrlFetcher";
  private final HttpUrlFetcher.HttpUrlConnectionFactory connectionFactory;
  private final GlideUrl glideUrl;
  private volatile boolean isCancelled;
  private InputStream stream;
  private final int timeout;
  private HttpURLConnection urlConnection;
  
  static
  {
    HttpUrlFetcher.DefaultHttpUrlConnectionFactory localDefaultHttpUrlConnectionFactory = new com/bumptech/glide/load/data/HttpUrlFetcher$DefaultHttpUrlConnectionFactory;
    localDefaultHttpUrlConnectionFactory.<init>();
    DEFAULT_CONNECTION_FACTORY = localDefaultHttpUrlConnectionFactory;
  }
  
  public HttpUrlFetcher(GlideUrl paramGlideUrl, int paramInt)
  {
    this(paramGlideUrl, paramInt, localHttpUrlConnectionFactory);
  }
  
  HttpUrlFetcher(GlideUrl paramGlideUrl, int paramInt, HttpUrlFetcher.HttpUrlConnectionFactory paramHttpUrlConnectionFactory)
  {
    this.glideUrl = paramGlideUrl;
    this.timeout = paramInt;
    this.connectionFactory = paramHttpUrlConnectionFactory;
  }
  
  private InputStream getStreamForSuccessfulRequest(HttpURLConnection paramHttpURLConnection)
  {
    Object localObject1 = paramHttpURLConnection.getContentEncoding();
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject2;
    if (bool1)
    {
      int i = paramHttpURLConnection.getContentLength();
      localObject2 = paramHttpURLConnection.getInputStream();
      long l = i;
      localObject1 = ContentLengthInputStream.obtain((InputStream)localObject2, l);
    }
    for (this.stream = ((InputStream)localObject1);; this.stream = ((InputStream)localObject1))
    {
      return this.stream;
      localObject1 = "HttpUrlFetcher";
      int j = 3;
      boolean bool2 = Log.isLoggable((String)localObject1, j);
      if (bool2)
      {
        localObject1 = "HttpUrlFetcher";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Got non empty content encoding: ");
        String str = paramHttpURLConnection.getContentEncoding();
        localObject2 = str;
        Log.d((String)localObject1, (String)localObject2);
      }
      localObject1 = paramHttpURLConnection.getInputStream();
    }
  }
  
  private static boolean isHttpOk(int paramInt)
  {
    int i = paramInt / 100;
    int k = 2;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  private static boolean isHttpRedirect(int paramInt)
  {
    int i = paramInt / 100;
    int k = 3;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  private InputStream loadDataWithRedirects(URL paramURL1, int paramInt, URL paramURL2, Map paramMap)
  {
    int i = 5;
    Object localObject1;
    if (paramInt >= i)
    {
      localObject1 = new com/bumptech/glide/load/HttpException;
      ((HttpException)localObject1).<init>("Too many (> 5) redirects!");
      throw ((Throwable)localObject1);
    }
    if (paramURL2 != null) {
      try
      {
        localObject1 = paramURL1.toURI();
        localObject3 = paramURL2.toURI();
        bool1 = ((URI)localObject1).equals(localObject3);
        if (bool1)
        {
          localObject1 = new com/bumptech/glide/load/HttpException;
          localObject3 = "In re-direct loop";
          ((HttpException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      catch (URISyntaxException localURISyntaxException) {}
    }
    Object localObject2 = this.connectionFactory.build(paramURL1);
    this.urlConnection = ((HttpURLConnection)localObject2);
    localObject2 = paramMap.entrySet();
    Object localObject4 = ((Set)localObject2).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Map.Entry)((Iterator)localObject4).next();
      HttpURLConnection localHttpURLConnection = this.urlConnection;
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      localHttpURLConnection.addRequestProperty((String)localObject3, (String)localObject2);
    }
    localObject2 = this.urlConnection;
    int k = this.timeout;
    ((HttpURLConnection)localObject2).setConnectTimeout(k);
    localObject2 = this.urlConnection;
    k = this.timeout;
    ((HttpURLConnection)localObject2).setReadTimeout(k);
    this.urlConnection.setUseCaches(false);
    localObject2 = this.urlConnection;
    k = 1;
    ((HttpURLConnection)localObject2).setDoInput(k);
    this.urlConnection.setInstanceFollowRedirects(false);
    this.urlConnection.connect();
    localObject2 = this.urlConnection.getInputStream();
    this.stream = ((InputStream)localObject2);
    boolean bool1 = this.isCancelled;
    if (bool1)
    {
      bool1 = false;
      localObject2 = null;
    }
    int j;
    for (;;)
    {
      return (InputStream)localObject2;
      localObject2 = this.urlConnection;
      j = ((HttpURLConnection)localObject2).getResponseCode();
      boolean bool2 = isHttpOk(j);
      if (bool2)
      {
        localObject2 = this.urlConnection;
        localObject2 = getStreamForSuccessfulRequest((HttpURLConnection)localObject2);
      }
      else
      {
        bool2 = isHttpRedirect(j);
        if (!bool2) {
          break;
        }
        localObject2 = this.urlConnection;
        localObject3 = "Location";
        localObject2 = ((HttpURLConnection)localObject2).getHeaderField((String)localObject3);
        bool2 = TextUtils.isEmpty((CharSequence)localObject2);
        if (bool2)
        {
          localObject2 = new com/bumptech/glide/load/HttpException;
          ((HttpException)localObject2).<init>("Received empty or null redirect url");
          throw ((Throwable)localObject2);
        }
        localObject3 = new java/net/URL;
        ((URL)localObject3).<init>(paramURL1, (String)localObject2);
        cleanup();
        j = paramInt + 1;
        localObject2 = loadDataWithRedirects((URL)localObject3, j, paramURL1, paramMap);
      }
    }
    int m = -1;
    if (j == m)
    {
      localObject3 = new com/bumptech/glide/load/HttpException;
      ((HttpException)localObject3).<init>(j);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/bumptech/glide/load/HttpException;
    localObject4 = this.urlConnection.getResponseMessage();
    ((HttpException)localObject3).<init>((String)localObject4, j);
    throw ((Throwable)localObject3);
  }
  
  public void cancel()
  {
    this.isCancelled = true;
  }
  
  public void cleanup()
  {
    Object localObject = this.stream;
    if (localObject != null) {}
    try
    {
      localObject = this.stream;
      ((InputStream)localObject).close();
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    localObject = this.urlConnection;
    if (localObject != null)
    {
      localObject = this.urlConnection;
      ((HttpURLConnection)localObject).disconnect();
    }
    this.urlConnection = null;
  }
  
  public Class getDataClass()
  {
    return InputStream.class;
  }
  
  public DataSource getDataSource()
  {
    return DataSource.REMOTE;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    int i = 2;
    long l = LogTime.getLogTime();
    try
    {
      Object localObject1 = this.glideUrl;
      localObject1 = ((GlideUrl)localObject1).toURL();
      bool1 = false;
      localObject3 = null;
      j = 0;
      localObject4 = null;
      localObject5 = this.glideUrl;
      localObject5 = ((GlideUrl)localObject5).getHeaders();
      localObject1 = loadDataWithRedirects((URL)localObject1, 0, null, (Map)localObject5);
      paramDataCallback.onDataReady(localObject1);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject3 = "HttpUrlFetcher";
        int j = 3;
        bool1 = Log.isLoggable((String)localObject3, j);
        if (bool1)
        {
          localObject3 = "HttpUrlFetcher";
          localObject4 = "Failed to load data for url";
          Log.d((String)localObject3, (String)localObject4, localIOException);
        }
        paramDataCallback.onLoadFailed(localIOException);
        String str1 = "HttpUrlFetcher";
        boolean bool2 = Log.isLoggable(str1, i);
        if (bool2)
        {
          str1 = "HttpUrlFetcher";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "Finished http url fetcher fetch in ";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          d = LogTime.getElapsedMillis(l);
          localObject3 = d;
          Log.v(str1, (String)localObject3);
        }
      }
    }
    finally
    {
      Object localObject4;
      Object localObject5;
      double d;
      Object localObject3 = "HttpUrlFetcher";
      boolean bool1 = Log.isLoggable((String)localObject3, i);
      if (bool1)
      {
        localObject3 = "HttpUrlFetcher";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "Finished http url fetcher fetch in ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        d = LogTime.getElapsedMillis(l);
        String str2 = d;
        Log.v((String)localObject3, str2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\HttpUrlFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */