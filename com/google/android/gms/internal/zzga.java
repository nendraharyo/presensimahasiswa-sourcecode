package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

public class zzga
  extends Handler
{
  private final zzfz zzFq;
  
  public zzga(Context paramContext)
  {
    this(localzzgb);
  }
  
  public zzga(zzfz paramzzfz)
  {
    this.zzFq = paramzzfz;
  }
  
  private void zzd(JSONObject paramJSONObject)
  {
    try
    {
      zzfz localzzfz = this.zzFq;
      String str1 = "request_id";
      str1 = paramJSONObject.getString(str1);
      String str2 = "base_url";
      str2 = paramJSONObject.getString(str2);
      String str3 = "html";
      str3 = paramJSONObject.getString(str3);
      localzzfz.zza(str1, str2, str3);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    for (;;)
    {
      try
      {
        localObject = paramMessage.getData();
        if (localObject == null) {
          return;
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        JSONObject localJSONObject;
        String str;
        boolean bool;
        continue;
      }
      localJSONObject = new org/json/JSONObject;
      str = "data";
      localObject = ((Bundle)localObject).getString(str);
      localJSONObject.<init>((String)localObject);
      localObject = "fetch_html";
      str = "message_name";
      str = localJSONObject.getString(str);
      bool = ((String)localObject).equals(str);
      if (bool) {
        zzd(localJSONObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzga.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */