package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Map;

public class GlideUrl
  implements Key
{
  private static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%;$";
  private volatile byte[] cacheKeyBytes;
  private int hashCode;
  private final Headers headers;
  private String safeStringUrl;
  private URL safeUrl;
  private final String stringUrl;
  private final URL url;
  
  public GlideUrl(String paramString)
  {
    this(paramString, localHeaders);
  }
  
  public GlideUrl(String paramString, Headers paramHeaders)
  {
    this.url = null;
    Object localObject = Preconditions.checkNotEmpty(paramString);
    this.stringUrl = ((String)localObject);
    localObject = (Headers)Preconditions.checkNotNull(paramHeaders);
    this.headers = ((Headers)localObject);
  }
  
  public GlideUrl(URL paramURL)
  {
    this(paramURL, localHeaders);
  }
  
  public GlideUrl(URL paramURL, Headers paramHeaders)
  {
    Object localObject = (URL)Preconditions.checkNotNull(paramURL);
    this.url = ((URL)localObject);
    this.stringUrl = null;
    localObject = (Headers)Preconditions.checkNotNull(paramHeaders);
    this.headers = ((Headers)localObject);
  }
  
  private byte[] getCacheKeyBytes()
  {
    Object localObject = this.cacheKeyBytes;
    if (localObject == null)
    {
      localObject = getCacheKey();
      Charset localCharset = CHARSET;
      localObject = ((String)localObject).getBytes(localCharset);
      this.cacheKeyBytes = ((byte[])localObject);
    }
    return this.cacheKeyBytes;
  }
  
  private String getSafeStringUrl()
  {
    String str1 = this.safeStringUrl;
    boolean bool1 = TextUtils.isEmpty(str1);
    if (bool1)
    {
      str1 = this.stringUrl;
      boolean bool2 = TextUtils.isEmpty(str1);
      if (bool2) {
        str1 = ((URL)Preconditions.checkNotNull(this.url)).toString();
      }
      String str2 = "@#&=*+-_.,:!?()/~'%;$";
      str1 = Uri.encode(str1, str2);
      this.safeStringUrl = str1;
    }
    return this.safeStringUrl;
  }
  
  private URL getSafeUrl()
  {
    URL localURL = this.safeUrl;
    if (localURL == null)
    {
      localURL = new java/net/URL;
      String str = getSafeStringUrl();
      localURL.<init>(str);
      this.safeUrl = localURL;
    }
    return this.safeUrl;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof GlideUrl;
    if (bool2)
    {
      paramObject = (GlideUrl)paramObject;
      Object localObject1 = getCacheKey();
      Object localObject2 = ((GlideUrl)paramObject).getCacheKey();
      bool2 = ((String)localObject1).equals(localObject2);
      if (bool2)
      {
        localObject1 = this.headers;
        localObject2 = ((GlideUrl)paramObject).headers;
        bool2 = localObject1.equals(localObject2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public String getCacheKey()
  {
    String str = this.stringUrl;
    if (str != null) {}
    for (str = this.stringUrl;; str = ((URL)Preconditions.checkNotNull(this.url)).toString()) {
      return str;
    }
  }
  
  public Map getHeaders()
  {
    return this.headers.getHeaders();
  }
  
  public int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
    {
      String str = getCacheKey();
      i = str.hashCode();
      this.hashCode = i;
      i = this.hashCode * 31;
      Headers localHeaders = this.headers;
      int j = localHeaders.hashCode();
      i += j;
      this.hashCode = i;
    }
    return this.hashCode;
  }
  
  public String toString()
  {
    return getCacheKey();
  }
  
  public String toStringUrl()
  {
    return getSafeStringUrl();
  }
  
  public URL toURL()
  {
    return getSafeUrl();
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    byte[] arrayOfByte = getCacheKeyBytes();
    paramMessageDigest.update(arrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\GlideUrl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */