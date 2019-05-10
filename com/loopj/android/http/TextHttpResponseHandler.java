package com.loopj.android.http;

import b.a.a.a.e;
import java.io.UnsupportedEncodingException;

public abstract class TextHttpResponseHandler
  extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "TextHttpRH";
  
  public TextHttpResponseHandler()
  {
    this("UTF-8");
  }
  
  public TextHttpResponseHandler(String paramString)
  {
    setCharset(paramString);
  }
  
  public static String getResponseString(byte[] paramArrayOfByte, String paramString)
  {
    Object localObject1 = null;
    String str1;
    Object localObject2;
    if (paramArrayOfByte == null)
    {
      str1 = null;
      if (str1 == null) {
        break label83;
      }
      localObject2 = "﻿";
    }
    for (;;)
    {
      try
      {
        int i = str1.startsWith((String)localObject2);
        if (i == 0) {
          break label83;
        }
        i = 1;
        localObject1 = str1.substring(i);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localObject2 = AsyncHttpClient.log;
        String str2 = "TextHttpRH";
        String str3 = "Encoding response into string failed";
        ((LogInterface)localObject2).e(str2, str3, localUnsupportedEncodingException);
        continue;
      }
      return (String)localObject1;
      str1 = new java/lang/String;
      str1.<init>(paramArrayOfByte, paramString);
      break;
      label83:
      localObject1 = localUnsupportedEncodingException;
    }
  }
  
  public abstract void onFailure(int paramInt, e[] paramArrayOfe, String paramString, Throwable paramThrowable);
  
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    String str = getCharset();
    str = getResponseString(paramArrayOfByte, str);
    onFailure(paramInt, paramArrayOfe, str, paramThrowable);
  }
  
  public abstract void onSuccess(int paramInt, e[] paramArrayOfe, String paramString);
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    String str = getCharset();
    str = getResponseString(paramArrayOfByte, str);
    onSuccess(paramInt, paramArrayOfe, str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\TextHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */