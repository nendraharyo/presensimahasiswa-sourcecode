package com.loopj.android.http;

import android.os.Looper;
import b.a.a.a.af;
import b.a.a.a.b.l;
import b.a.a.a.e;
import b.a.a.a.s;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class BinaryHttpResponseHandler
  extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "BinaryHttpRH";
  private String[] mAllowedContentTypes;
  
  public BinaryHttpResponseHandler()
  {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "application/octet-stream";
    arrayOfString[1] = "image/jpeg";
    arrayOfString[2] = "image/png";
    arrayOfString[3] = "image/gif";
    this.mAllowedContentTypes = arrayOfString;
  }
  
  public BinaryHttpResponseHandler(String[] paramArrayOfString)
  {
    int i = 4;
    Object localObject = new String[i];
    String str1 = null;
    localObject[0] = "application/octet-stream";
    localObject[1] = "image/jpeg";
    localObject[2] = "image/png";
    int j = 3;
    String str2 = "image/gif";
    localObject[j] = str2;
    this.mAllowedContentTypes = ((String[])localObject);
    if (paramArrayOfString != null) {
      this.mAllowedContentTypes = paramArrayOfString;
    }
    for (;;)
    {
      return;
      localObject = AsyncHttpClient.log;
      str1 = "BinaryHttpRH";
      str2 = "Constructor passed allowedContentTypes was null !";
      ((LogInterface)localObject).e(str1, str2);
    }
  }
  
  public BinaryHttpResponseHandler(String[] paramArrayOfString, Looper paramLooper)
  {
    super(paramLooper);
    int i = 4;
    Object localObject = new String[i];
    String str1 = null;
    localObject[0] = "application/octet-stream";
    localObject[1] = "image/jpeg";
    localObject[2] = "image/png";
    int j = 3;
    String str2 = "image/gif";
    localObject[j] = str2;
    this.mAllowedContentTypes = ((String[])localObject);
    if (paramArrayOfString != null) {
      this.mAllowedContentTypes = paramArrayOfString;
    }
    for (;;)
    {
      return;
      localObject = AsyncHttpClient.log;
      str1 = "BinaryHttpRH";
      str2 = "Constructor passed allowedContentTypes was null !";
      ((LogInterface)localObject).e(str1, str2);
    }
  }
  
  public String[] getAllowedContentTypes()
  {
    return this.mAllowedContentTypes;
  }
  
  public abstract void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable);
  
  public abstract void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte);
  
  public final void sendResponseMessage(s params)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = params.a();
    Object localObject2 = params.getHeaders("Content-Type");
    int k = localObject2.length;
    e[] arrayOfe;
    if (k != i)
    {
      j = ((af)localObject1).b();
      arrayOfe = params.getAllHeaders();
      localObject2 = new b/a/a/a/b/l;
      k = ((af)localObject1).b();
      localObject1 = "None, or more than one, Content-Type Header found!";
      ((l)localObject2).<init>(k, (String)localObject1);
      sendFailureMessage(j, arrayOfe, null, (Throwable)localObject2);
    }
    for (;;)
    {
      return;
      String str1 = localObject2[0];
      Object localObject3 = getAllowedContentTypes();
      int m = localObject3.length;
      String str2;
      for (k = 0; k < m; k = n)
      {
        str2 = localObject3[k];
        try
        {
          localObject2 = str1.d();
          boolean bool = Pattern.matches(str2, (CharSequence)localObject2);
          if (bool) {
            j = i;
          }
        }
        catch (PatternSyntaxException localPatternSyntaxException)
        {
          for (;;)
          {
            int n;
            LogInterface localLogInterface = AsyncHttpClient.log;
            String str3 = "BinaryHttpRH";
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            String str4 = "Given pattern is not valid: ";
            localStringBuilder = localStringBuilder.append(str4);
            str2 = str2;
            localLogInterface.e(str3, str2, localPatternSyntaxException);
          }
        }
        n = k + 1;
      }
      if (j == 0)
      {
        j = ((af)localObject1).b();
        arrayOfe = params.getAllHeaders();
        l locall = new b/a/a/a/b/l;
        k = ((af)localObject1).b();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject3 = "Content-Type (";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        str1 = str1.d();
        localObject1 = ((StringBuilder)localObject1).append(str1);
        str1 = ") not allowed!";
        localObject1 = str1;
        locall.<init>(k, (String)localObject1);
        sendFailureMessage(j, arrayOfe, null, locall);
      }
      else
      {
        super.sendResponseMessage(params);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\BinaryHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */