package com.google.android.gms.cast;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class MediaStatus$zza
{
  private int zzabx = 0;
  private List zzaby;
  private SparseArray zzabz;
  
  MediaStatus$zza(MediaStatus paramMediaStatus)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzaby = ((List)localObject);
    localObject = new android/util/SparseArray;
    ((SparseArray)localObject).<init>();
    this.zzabz = ((SparseArray)localObject);
  }
  
  private void clear()
  {
    this.zzabx = 0;
    this.zzaby.clear();
    this.zzabz.clear();
  }
  
  private void zza(MediaQueueItem[] paramArrayOfMediaQueueItem)
  {
    this.zzaby.clear();
    this.zzabz.clear();
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfMediaQueueItem.length;
      if (i >= j) {
        break;
      }
      MediaQueueItem localMediaQueueItem = paramArrayOfMediaQueueItem[i];
      this.zzaby.add(localMediaQueueItem);
      SparseArray localSparseArray = this.zzabz;
      j = localMediaQueueItem.getItemId();
      Integer localInteger = Integer.valueOf(i);
      localSparseArray.put(j, localInteger);
      i += 1;
    }
  }
  
  private Integer zzbd(int paramInt)
  {
    return (Integer)this.zzabz.get(paramInt);
  }
  
  private boolean zzh(JSONObject paramJSONObject)
  {
    int i = 3;
    float f1 = 4.2E-45F;
    int m = 2;
    float f2 = 2.8E-45F;
    int n = 0;
    Object localObject1 = null;
    int i1 = 1;
    float f3 = Float.MIN_VALUE;
    Object localObject2 = "repeatMode";
    boolean bool1 = paramJSONObject.has((String)localObject2);
    String str1;
    Object localObject3;
    int i3;
    int i5;
    if (bool1)
    {
      int i2 = this.zzabx;
      str1 = "repeatMode";
      localObject3 = paramJSONObject.getString(str1);
      i3 = -1;
      i5 = ((String)localObject3).hashCode();
      switch (i5)
      {
      default: 
        switch (i3)
        {
        default: 
          m = i2;
        case 2: 
          label152:
          i = this.zzabx;
          if (i != m)
          {
            this.zzabx = m;
            m = i1;
          }
          break;
        }
        break;
      }
    }
    for (f2 = f3;; f2 = 0.0F)
    {
      String str2 = "items";
      int j = paramJSONObject.has(str2);
      if (j != 0)
      {
        localObject2 = paramJSONObject.getJSONArray("items");
        i3 = ((JSONArray)localObject2).length();
        localObject3 = new android/util/SparseArray;
        ((SparseArray)localObject3).<init>();
        j = 0;
        str2 = null;
        f1 = 0.0F;
        Object localObject5;
        int i4;
        for (;;)
        {
          if (j < i3)
          {
            localObject4 = ((JSONArray)localObject2).getJSONObject(j);
            localObject5 = "itemId";
            i5 = ((JSONObject)localObject4).getInt((String)localObject5);
            localObject4 = Integer.valueOf(i5);
            ((SparseArray)localObject3).put(j, localObject4);
            j += 1;
            continue;
            localObject4 = "REPEAT_OFF";
            boolean bool2 = ((String)localObject3).equals(localObject4);
            if (!bool2) {
              break;
            }
            i4 = 0;
            str1 = null;
            break;
            localObject4 = "REPEAT_ALL";
            bool2 = ((String)localObject3).equals(localObject4);
            if (!bool2) {
              break;
            }
            i4 = i1;
            break;
            localObject4 = "REPEAT_SINGLE";
            bool2 = ((String)localObject3).equals(localObject4);
            if (!bool2) {
              break;
            }
            i4 = m;
            break;
            localObject4 = "REPEAT_ALL_AND_SHUFFLE";
            bool2 = ((String)localObject3).equals(localObject4);
            if (!bool2) {
              break;
            }
            i4 = k;
            break;
            m = 0;
            localObject6 = null;
            f2 = 0.0F;
            break label152;
            m = i1;
            f2 = f3;
            break label152;
            m = k;
            f2 = f1;
            break label152;
          }
        }
        Object localObject4 = new MediaQueueItem[i4];
        int k = 0;
        str2 = null;
        f1 = 0.0F;
        n = m;
        if (k < i4)
        {
          localObject6 = (Integer)((SparseArray)localObject3).get(k);
          localObject5 = ((JSONArray)localObject2).getJSONObject(k);
          int i6 = ((Integer)localObject6).intValue();
          MediaQueueItem localMediaQueueItem = zzbb(i6);
          if (localMediaQueueItem != null)
          {
            int i7 = localMediaQueueItem.zzh((JSONObject)localObject5);
            n |= i7;
            localObject4[k] = localMediaQueueItem;
            m = ((Integer)localObject6).intValue();
            localObject6 = zzbd(m);
            m = ((Integer)localObject6).intValue();
            if (k != m)
            {
              m = i1;
              f2 = f3;
            }
          }
          else
          {
            for (;;)
            {
              k += 1;
              n = m;
              break;
              m = ((Integer)localObject6).intValue();
              localObject1 = this.zzabA;
              n = MediaStatus.zza((MediaStatus)localObject1);
              if (m == n)
              {
                localObject6 = new com/google/android/gms/cast/MediaQueueItem$Builder;
                localObject1 = MediaStatus.zzb(this.zzabA);
                ((MediaQueueItem.Builder)localObject6).<init>((MediaInfo)localObject1);
                localObject6 = ((MediaQueueItem.Builder)localObject6).build();
                localObject4[k] = localObject6;
                localObject6 = localObject4[k];
                ((MediaQueueItem)localObject6).zzh((JSONObject)localObject5);
                m = i1;
                f2 = f3;
              }
              else
              {
                localObject6 = new com/google/android/gms/cast/MediaQueueItem;
                ((MediaQueueItem)localObject6).<init>((JSONObject)localObject5);
                localObject4[k] = localObject6;
                m = i1;
                f2 = f3;
              }
            }
          }
        }
        else
        {
          localObject6 = this.zzaby;
          m = ((List)localObject6).size();
          if (m != i4) {
            label675:
            zza((MediaQueueItem[])localObject4);
          }
        }
      }
      for (;;)
      {
        return i1;
        i1 = n;
        break label675;
        m = n;
        break;
        i1 = m;
        f3 = f2;
      }
      m = 0;
      Object localObject6 = null;
    }
  }
  
  public int getItemCount()
  {
    return this.zzaby.size();
  }
  
  public int getRepeatMode()
  {
    return this.zzabx;
  }
  
  public MediaQueueItem zzbb(int paramInt)
  {
    Object localObject = (Integer)this.zzabz.get(paramInt);
    int i;
    if (localObject == null) {
      i = 0;
    }
    List localList;
    for (localObject = null;; localObject = (MediaQueueItem)localList.get(i))
    {
      return (MediaQueueItem)localObject;
      localList = this.zzaby;
      i = ((Integer)localObject).intValue();
    }
  }
  
  public MediaQueueItem zzbc(int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      localObject = this.zzaby;
      i = ((List)localObject).size();
      if (paramInt < i) {}
    }
    else
    {
      i = 0;
    }
    for (Object localObject = null;; localObject = (MediaQueueItem)this.zzaby.get(paramInt)) {
      return (MediaQueueItem)localObject;
    }
  }
  
  public List zznP()
  {
    return Collections.unmodifiableList(this.zzaby);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\MediaStatus$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */