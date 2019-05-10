package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

public class zzfs
{
  private final String zzDJ;
  private final zzjp zzpD;
  
  public zzfs(zzjp paramzzjp)
  {
    this(paramzzjp, "");
  }
  
  public zzfs(zzjp paramzzjp, String paramString)
  {
    this.zzpD = paramzzjp;
    this.zzDJ = paramString;
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "width";
      localJSONObject = localJSONObject.put((String)localObject, paramInt1);
      localObject = "height";
      localJSONObject = localJSONObject.put((String)localObject, paramInt2);
      localObject = "maxSizeWidth";
      localJSONObject = localJSONObject.put((String)localObject, paramInt3);
      localObject = "maxSizeHeight";
      localJSONObject = localJSONObject.put((String)localObject, paramInt4);
      localObject = "density";
      double d = paramFloat;
      localJSONObject = localJSONObject.put((String)localObject, d);
      localObject = "rotation";
      localJSONObject = localJSONObject.put((String)localObject, paramInt5);
      localObject = this.zzpD;
      String str = "onScreenInfoChanged";
      ((zzjp)localObject).zzb(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occured while obtaining screen information.";
        zzin.zzb((String)localObject, localJSONException);
      }
    }
  }
  
  public void zzam(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "message";
      localJSONObject = localJSONObject.put((String)localObject, paramString);
      localObject = "action";
      String str = this.zzDJ;
      localJSONObject = localJSONObject.put((String)localObject, str);
      localObject = this.zzpD;
      str = "onError";
      ((zzjp)localObject).zzb(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occurred while dispatching error event.";
        zzin.zzb((String)localObject, localJSONException);
      }
    }
  }
  
  public void zzan(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "js";
      localJSONObject = localJSONObject.put((String)localObject, paramString);
      localObject = this.zzpD;
      String str = "onReadyEventReceived";
      ((zzjp)localObject).zzb(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occured while dispatching ready Event.";
        zzin.zzb((String)localObject, localJSONException);
      }
    }
  }
  
  public void zzao(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "state";
      localJSONObject = localJSONObject.put((String)localObject, paramString);
      localObject = this.zzpD;
      String str = "onStateChanged";
      ((zzjp)localObject).zzb(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occured while dispatching state change.";
        zzin.zzb((String)localObject, localJSONException);
      }
    }
  }
  
  public void zzb(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "x";
      localJSONObject = localJSONObject.put((String)localObject, paramInt1);
      localObject = "y";
      localJSONObject = localJSONObject.put((String)localObject, paramInt2);
      localObject = "width";
      localJSONObject = localJSONObject.put((String)localObject, paramInt3);
      localObject = "height";
      localJSONObject = localJSONObject.put((String)localObject, paramInt4);
      localObject = this.zzpD;
      String str = "onSizeChanged";
      ((zzjp)localObject).zzb(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occured while dispatching size change.";
        zzin.zzb((String)localObject, localJSONException);
      }
    }
  }
  
  public void zzc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "x";
      localJSONObject = localJSONObject.put((String)localObject, paramInt1);
      localObject = "y";
      localJSONObject = localJSONObject.put((String)localObject, paramInt2);
      localObject = "width";
      localJSONObject = localJSONObject.put((String)localObject, paramInt3);
      localObject = "height";
      localJSONObject = localJSONObject.put((String)localObject, paramInt4);
      localObject = this.zzpD;
      String str = "onDefaultPositionReceived";
      ((zzjp)localObject).zzb(str, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject = "Error occured while dispatching default position.";
        zzin.zzb((String)localObject, localJSONException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */