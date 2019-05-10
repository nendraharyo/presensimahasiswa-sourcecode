package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zznb;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
  public static final int SUBTYPE_CAPTIONS = 2;
  public static final int SUBTYPE_CHAPTERS = 4;
  public static final int SUBTYPE_DESCRIPTIONS = 3;
  public static final int SUBTYPE_METADATA = 5;
  public static final int SUBTYPE_NONE = 0;
  public static final int SUBTYPE_SUBTITLES = 1;
  public static final int SUBTYPE_UNKNOWN = 255;
  public static final int TYPE_AUDIO = 2;
  public static final int TYPE_TEXT = 1;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_VIDEO = 3;
  private String mName;
  private long zzUZ;
  private String zzaaL;
  private String zzaaN;
  private String zzaaP;
  private JSONObject zzaaU;
  private int zzabB;
  private int zzabC;
  
  MediaTrack(long paramLong, int paramInt)
  {
    clear();
    this.zzUZ = paramLong;
    if (paramInt > 0)
    {
      int i = 3;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid type " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.zzabB = paramInt;
  }
  
  MediaTrack(JSONObject paramJSONObject)
  {
    zzg(paramJSONObject);
  }
  
  private void clear()
  {
    this.zzUZ = 0L;
    this.zzabB = 0;
    this.zzaaN = null;
    this.mName = null;
    this.zzaaL = null;
    this.zzabC = -1;
    this.zzaaU = null;
  }
  
  private void zzg(JSONObject paramJSONObject)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    StringBuilder localStringBuilder = null;
    clear();
    long l = paramJSONObject.getLong("trackId");
    this.zzUZ = l;
    Object localObject1 = paramJSONObject.getString("type");
    Object localObject2 = "TEXT";
    boolean bool1 = ((String)localObject2).equals(localObject1);
    if (bool1)
    {
      this.zzabB = k;
      localObject1 = paramJSONObject.optString("trackContentId", null);
      this.zzaaN = ((String)localObject1);
      localObject1 = paramJSONObject.optString("trackContentType", null);
      this.zzaaP = ((String)localObject1);
      localObject1 = paramJSONObject.optString("name", null);
      this.mName = ((String)localObject1);
      localObject1 = paramJSONObject.optString("language", null);
      this.zzaaL = ((String)localObject1);
      localObject1 = "subtype";
      boolean bool2 = paramJSONObject.has((String)localObject1);
      if (!bool2) {
        break label432;
      }
      localObject1 = paramJSONObject.getString("subtype");
      localObject2 = "SUBTITLES";
      bool1 = ((String)localObject2).equals(localObject1);
      if (!bool1) {
        break label278;
      }
      this.zzabC = k;
    }
    for (;;)
    {
      localObject1 = paramJSONObject.optJSONObject("customData");
      this.zzaaU = ((JSONObject)localObject1);
      return;
      localObject2 = "AUDIO";
      bool1 = ((String)localObject2).equals(localObject1);
      if (bool1)
      {
        this.zzabB = j;
        break;
      }
      localObject2 = "VIDEO";
      bool1 = ((String)localObject2).equals(localObject1);
      if (bool1)
      {
        this.zzabB = i;
        break;
      }
      localObject2 = new org/json/JSONException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = "invalid type: " + (String)localObject1;
      ((JSONException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      label278:
      localObject2 = "CAPTIONS";
      bool1 = ((String)localObject2).equals(localObject1);
      if (bool1)
      {
        this.zzabC = j;
      }
      else
      {
        localObject2 = "DESCRIPTIONS";
        bool1 = ((String)localObject2).equals(localObject1);
        if (bool1)
        {
          this.zzabC = i;
        }
        else
        {
          localObject2 = "CHAPTERS";
          bool1 = ((String)localObject2).equals(localObject1);
          int m;
          if (bool1)
          {
            m = 4;
            this.zzabC = m;
          }
          else
          {
            localObject2 = "METADATA";
            bool1 = ((String)localObject2).equals(localObject1);
            if (bool1)
            {
              m = 5;
              this.zzabC = m;
            }
            else
            {
              localObject2 = new org/json/JSONException;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localObject1 = "invalid subtype: " + (String)localObject1;
              ((JSONException)localObject2).<init>((String)localObject1);
              throw ((Throwable)localObject2);
              label432:
              m = 0;
              localObject1 = null;
              this.zzabC = 0;
            }
          }
        }
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (this == paramObject) {
      bool2 = bool1;
    }
    Object localObject1;
    label43:
    Object localObject2;
    label57:
    do
    {
      do
      {
        return bool2;
        bool3 = paramObject instanceof MediaTrack;
      } while (!bool3);
      paramObject = (MediaTrack)paramObject;
      localObject1 = this.zzaaU;
      if (localObject1 != null) {
        break label283;
      }
      bool3 = bool1;
      localObject2 = ((MediaTrack)paramObject).zzaaU;
      if (localObject2 != null) {
        break label292;
      }
      boolean bool5 = bool1;
      if (bool3 != bool5) {
        break label299;
      }
      localObject1 = this.zzaaU;
      if (localObject1 == null) {
        break;
      }
      localObject1 = ((MediaTrack)paramObject).zzaaU;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.zzaaU;
      localObject2 = ((MediaTrack)paramObject).zzaaU;
      bool3 = zznb.zze(localObject1, localObject2);
    } while (!bool3);
    long l1 = this.zzUZ;
    long l2 = ((MediaTrack)paramObject).zzUZ;
    boolean bool3 = l1 < l2;
    int k;
    int j;
    if (!bool3)
    {
      int i = this.zzabB;
      k = ((MediaTrack)paramObject).zzabB;
      if (i == k)
      {
        localObject1 = this.zzaaN;
        localObject2 = ((MediaTrack)paramObject).zzaaN;
        boolean bool4 = zzf.zza(localObject1, localObject2);
        if (bool4)
        {
          localObject1 = this.zzaaP;
          localObject2 = ((MediaTrack)paramObject).zzaaP;
          bool4 = zzf.zza(localObject1, localObject2);
          if (bool4)
          {
            localObject1 = this.mName;
            localObject2 = ((MediaTrack)paramObject).mName;
            bool4 = zzf.zza(localObject1, localObject2);
            if (bool4)
            {
              localObject1 = this.zzaaL;
              localObject2 = ((MediaTrack)paramObject).zzaaL;
              bool4 = zzf.zza(localObject1, localObject2);
              if (bool4)
              {
                j = this.zzabC;
                k = ((MediaTrack)paramObject).zzabC;
                if (j != k) {}
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      label283:
      j = 0;
      localObject1 = null;
      break label43;
      label292:
      k = 0;
      localObject2 = null;
      break label57;
      label299:
      break;
      bool1 = false;
    }
  }
  
  public String getContentId()
  {
    return this.zzaaN;
  }
  
  public String getContentType()
  {
    return this.zzaaP;
  }
  
  public JSONObject getCustomData()
  {
    return this.zzaaU;
  }
  
  public long getId()
  {
    return this.zzUZ;
  }
  
  public String getLanguage()
  {
    return this.zzaaL;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public int getSubtype()
  {
    return this.zzabC;
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    Object localObject = Long.valueOf(this.zzUZ);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzabB);
    arrayOfObject[1] = localObject;
    localObject = this.zzaaN;
    arrayOfObject[2] = localObject;
    localObject = this.zzaaP;
    arrayOfObject[3] = localObject;
    localObject = this.mName;
    arrayOfObject[4] = localObject;
    localObject = this.zzaaL;
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(this.zzabC);
    arrayOfObject[6] = localObject;
    localObject = this.zzaaU;
    arrayOfObject[7] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void setContentId(String paramString)
  {
    this.zzaaN = paramString;
  }
  
  public void setContentType(String paramString)
  {
    this.zzaaP = paramString;
  }
  
  void setCustomData(JSONObject paramJSONObject)
  {
    this.zzaaU = paramJSONObject;
  }
  
  void setLanguage(String paramString)
  {
    this.zzaaL = paramString;
  }
  
  void setName(String paramString)
  {
    this.mName = paramString;
  }
  
  public JSONObject toJson()
  {
    localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = "trackId";
    for (;;)
    {
      try
      {
        long l = this.zzUZ;
        localJSONObject.put((String)localObject1, l);
        int i = this.zzabB;
        switch (i)
        {
        }
      }
      catch (JSONException localJSONException)
      {
        boolean bool;
        int j;
        continue;
        String str = "type";
        Object localObject2 = "AUDIO";
        localJSONObject.put(str, localObject2);
        continue;
        str = "type";
        localObject2 = "VIDEO";
        localJSONObject.put(str, localObject2);
        continue;
        str = "subtype";
        localObject2 = "SUBTITLES";
        localJSONObject.put(str, localObject2);
        continue;
        str = "subtype";
        localObject2 = "CAPTIONS";
        localJSONObject.put(str, localObject2);
        continue;
        str = "subtype";
        localObject2 = "DESCRIPTIONS";
        localJSONObject.put(str, localObject2);
        continue;
        str = "subtype";
        localObject2 = "CHAPTERS";
        localJSONObject.put(str, localObject2);
        continue;
        str = "subtype";
        localObject2 = "METADATA";
        localJSONObject.put(str, localObject2);
        continue;
      }
      localObject1 = this.zzaaN;
      if (localObject1 != null)
      {
        localObject1 = "trackContentId";
        localObject2 = this.zzaaN;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzaaP;
      if (localObject1 != null)
      {
        localObject1 = "trackContentType";
        localObject2 = this.zzaaP;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.mName;
      if (localObject1 != null)
      {
        localObject1 = "name";
        localObject2 = this.mName;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzaaL;
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = "language";
        localObject2 = this.zzaaL;
        localJSONObject.put((String)localObject1, localObject2);
      }
      j = this.zzabC;
      switch (j)
      {
      default: 
        localObject1 = this.zzaaU;
        if (localObject1 != null)
        {
          localObject1 = "customData";
          localObject2 = this.zzaaU;
          localJSONObject.put((String)localObject1, localObject2);
        }
        return localJSONObject;
        localObject1 = "type";
        localObject2 = "TEXT";
        localJSONObject.put((String)localObject1, localObject2);
      }
    }
  }
  
  void zzbe(int paramInt)
  {
    int i = -1;
    IllegalArgumentException localIllegalArgumentException;
    if (paramInt > i)
    {
      i = 5;
      if (paramInt <= i) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid subtype " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    if (paramInt != 0)
    {
      i = this.zzabB;
      int j = 1;
      if (i != j)
      {
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("subtypes are only valid for text tracks");
        throw localIllegalArgumentException;
      }
    }
    this.zzabC = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaTrack.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */