package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.util.Patterns;
import com.google.android.gms.common.internal.zzx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProxyRequest$Builder
{
  private String zzWC;
  private int zzWD;
  private long zzWE;
  private byte[] zzWF;
  private Bundle zzWG;
  
  public ProxyRequest$Builder(String paramString)
  {
    int i = ProxyRequest.HTTP_METHOD_GET;
    this.zzWD = i;
    long l = 3000L;
    this.zzWE = l;
    this.zzWF = null;
    Object localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    this.zzWG = ((Bundle)localObject1);
    zzx.zzcM(paramString);
    localObject1 = Patterns.WEB_URL.matcher(paramString);
    boolean bool = ((Matcher)localObject1).matches();
    if (bool)
    {
      this.zzWC = paramString;
      return;
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "The supplied url [ " + paramString + "] is not match Patterns.WEB_URL!";
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public ProxyRequest build()
  {
    Object localObject = this.zzWF;
    if (localObject == null)
    {
      localObject = new byte[0];
      this.zzWF = ((byte[])localObject);
    }
    localObject = new com/google/android/gms/auth/api/proxy/ProxyRequest;
    String str = this.zzWC;
    int i = this.zzWD;
    long l = this.zzWE;
    byte[] arrayOfByte = this.zzWF;
    Bundle localBundle = this.zzWG;
    ((ProxyRequest)localObject).<init>(2, str, i, l, arrayOfByte, localBundle);
    return (ProxyRequest)localObject;
  }
  
  public Builder putHeader(String paramString1, String paramString2)
  {
    zzx.zzh(paramString1, "Header name cannot be null or empty!");
    Bundle localBundle = this.zzWG;
    if (paramString2 == null) {
      paramString2 = "";
    }
    localBundle.putString(paramString1, paramString2);
    return this;
  }
  
  public Builder setBody(byte[] paramArrayOfByte)
  {
    this.zzWF = paramArrayOfByte;
    return this;
  }
  
  public Builder setHttpMethod(int paramInt)
  {
    if (paramInt >= 0)
    {
      i = ProxyRequest.LAST_CODE;
      if (paramInt > i) {}
    }
    for (int i = 1;; i = 0)
    {
      zzx.zzb(i, "Unrecognized http method code.");
      this.zzWD = paramInt;
      return this;
    }
  }
  
  public Builder setTimeoutMillis(long paramLong)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      zzx.zzb(bool, "The specified timeout must be non-negative.");
      this.zzWE = paramLong;
      return this;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\proxy\ProxyRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */