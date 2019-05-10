package com.loopj.android.http;

import java.io.InputStream;

public class RequestParams$StreamWrapper
{
  public final boolean autoClose;
  public final String contentType;
  public final InputStream inputStream;
  public final String name;
  
  public RequestParams$StreamWrapper(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.inputStream = paramInputStream;
    this.name = paramString1;
    this.contentType = paramString2;
    this.autoClose = paramBoolean;
  }
  
  static StreamWrapper newInstance(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    StreamWrapper localStreamWrapper = new com/loopj/android/http/RequestParams$StreamWrapper;
    if (paramString2 == null) {
      paramString2 = "application/octet-stream";
    }
    localStreamWrapper.<init>(paramInputStream, paramString1, paramString2, paramBoolean);
    return localStreamWrapper;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\RequestParams$StreamWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */