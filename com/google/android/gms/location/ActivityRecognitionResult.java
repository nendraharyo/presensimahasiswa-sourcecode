package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ActivityRecognitionResult
  implements SafeParcelable
{
  public static final ActivityRecognitionResultCreator CREATOR;
  Bundle extras;
  private final int mVersionCode;
  List zzaNu;
  long zzaNv;
  long zzaNw;
  int zzaNx;
  
  static
  {
    ActivityRecognitionResultCreator localActivityRecognitionResultCreator = new com/google/android/gms/location/ActivityRecognitionResultCreator;
    localActivityRecognitionResultCreator.<init>();
    CREATOR = localActivityRecognitionResultCreator;
  }
  
  public ActivityRecognitionResult(int paramInt1, List paramList, long paramLong1, long paramLong2, int paramInt2, Bundle paramBundle)
  {
    this.mVersionCode = paramInt1;
    this.zzaNu = paramList;
    this.zzaNv = paramLong1;
    this.zzaNw = paramLong2;
    this.zzaNx = paramInt2;
    this.extras = paramBundle;
  }
  
  public ActivityRecognitionResult(DetectedActivity paramDetectedActivity, long paramLong1, long paramLong2)
  {
    this(paramDetectedActivity, paramLong1, paramLong2, 0, null);
  }
  
  public ActivityRecognitionResult(DetectedActivity paramDetectedActivity, long paramLong1, long paramLong2, int paramInt, Bundle paramBundle)
  {
    this(localList, paramLong1, paramLong2, paramInt, paramBundle);
  }
  
  public ActivityRecognitionResult(List paramList, long paramLong1, long paramLong2)
  {
    this(paramList, paramLong1, paramLong2, 0, null);
  }
  
  public ActivityRecognitionResult(List paramList, long paramLong1, long paramLong2, int paramInt, Bundle paramBundle)
  {
    boolean bool;
    if (paramList != null)
    {
      int j = paramList.size();
      if (j > 0)
      {
        j = i;
        String str = "Must have at least 1 detected activity";
        zzx.zzb(j, str);
        bool = paramLong1 < l;
        if (!bool) {
          break label112;
        }
        bool = paramLong2 < l;
        if (!bool) {
          break label112;
        }
      }
    }
    for (;;)
    {
      zzx.zzb(i, "Must set times");
      this.mVersionCode = 2;
      this.zzaNu = paramList;
      this.zzaNv = paramLong1;
      this.zzaNw = paramLong2;
      this.zzaNx = paramInt;
      this.extras = paramBundle;
      return;
      bool = false;
      break;
      label112:
      i = 0;
    }
  }
  
  public static ActivityRecognitionResult extractResult(Intent paramIntent)
  {
    Object localObject1 = null;
    boolean bool1 = hasResult(paramIntent);
    Object localObject2;
    if (!bool1)
    {
      bool1 = false;
      localObject2 = null;
    }
    for (;;)
    {
      return (ActivityRecognitionResult)localObject2;
      localObject2 = paramIntent.getExtras();
      Object localObject3 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";
      localObject2 = ((Bundle)localObject2).get((String)localObject3);
      boolean bool2 = localObject2 instanceof byte[];
      int i;
      if (bool2)
      {
        localObject3 = Parcel.obtain();
        localObject1 = localObject2;
        localObject1 = (byte[])localObject2;
        i = ((byte[])localObject2).length;
        ((Parcel)localObject3).unmarshall((byte[])localObject1, 0, i);
        ((Parcel)localObject3).setDataPosition(0);
        localObject1 = CREATOR;
        localObject2 = ((ActivityRecognitionResultCreator)localObject1).createFromParcel((Parcel)localObject3);
      }
      else
      {
        bool2 = localObject2 instanceof ActivityRecognitionResult;
        if (bool2)
        {
          localObject2 = (ActivityRecognitionResult)localObject2;
        }
        else
        {
          i = 0;
          localObject2 = null;
        }
      }
    }
  }
  
  public static boolean hasResult(Intent paramIntent)
  {
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      str = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";
      bool = paramIntent.hasExtra(str);
    }
  }
  
  private static boolean zzc(Bundle paramBundle1, Bundle paramBundle2)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramBundle1 == null) && (paramBundle2 == null)) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      Object localObject1;
      if (((paramBundle1 == null) && (paramBundle2 != null)) || ((paramBundle1 != null) && (paramBundle2 == null)))
      {
        bool2 = false;
        localObject1 = null;
      }
      else
      {
        int i = paramBundle1.size();
        int j = paramBundle2.size();
        if (i != j)
        {
          i = 0;
          localObject1 = null;
        }
        else
        {
          localObject1 = paramBundle1.keySet();
          Iterator localIterator = ((Set)localObject1).iterator();
          label157:
          label213:
          do
          {
            do
            {
              do
              {
                bool3 = localIterator.hasNext();
                if (!bool3) {
                  break label249;
                }
                localObject1 = (String)localIterator.next();
                bool4 = paramBundle2.containsKey((String)localObject1);
                if (!bool4)
                {
                  bool3 = false;
                  localObject1 = null;
                  break;
                }
                localObject2 = paramBundle1.get((String)localObject1);
                if (localObject2 != null) {
                  break label157;
                }
                localObject1 = paramBundle2.get((String)localObject1);
              } while (localObject1 == null);
              bool3 = false;
              localObject1 = null;
              break;
              localObject2 = paramBundle1.get((String)localObject1);
              boolean bool4 = localObject2 instanceof Bundle;
              if (!bool4) {
                break label213;
              }
              localObject2 = paramBundle1.getBundle((String)localObject1);
              localObject1 = paramBundle2.getBundle((String)localObject1);
              bool3 = zzc((Bundle)localObject2, (Bundle)localObject1);
            } while (bool3);
            bool3 = false;
            localObject1 = null;
            break;
            Object localObject2 = paramBundle1.get((String)localObject1);
            localObject1 = paramBundle2.get((String)localObject1);
            bool3 = localObject2.equals(localObject1);
          } while (bool3);
          boolean bool3 = false;
          localObject1 = null;
          continue;
          label249:
          bool3 = bool1;
        }
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      Object localObject1;
      Object localObject2;
      if (paramObject != null)
      {
        localObject1 = getClass();
        localObject2 = paramObject.getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (ActivityRecognitionResult)paramObject;
      long l1 = this.zzaNv;
      long l2 = ((ActivityRecognitionResult)paramObject).zzaNv;
      boolean bool2 = l1 < l2;
      if (!bool2)
      {
        l1 = this.zzaNw;
        l2 = ((ActivityRecognitionResult)paramObject).zzaNw;
        bool2 = l1 < l2;
        if (!bool2)
        {
          int i = this.zzaNx;
          int j = ((ActivityRecognitionResult)paramObject).zzaNx;
          if (i == j)
          {
            localObject1 = this.zzaNu;
            localObject2 = ((ActivityRecognitionResult)paramObject).zzaNu;
            boolean bool3 = zzw.equal(localObject1, localObject2);
            if (bool3)
            {
              localObject1 = this.extras;
              localObject2 = ((ActivityRecognitionResult)paramObject).extras;
              bool3 = zzc((Bundle)localObject1, (Bundle)localObject2);
              if (bool3) {
                continue;
              }
            }
          }
        }
      }
      bool1 = false;
    }
  }
  
  public int getActivityConfidence(int paramInt)
  {
    Object localObject = this.zzaNu;
    Iterator localIterator = ((List)localObject).iterator();
    int j;
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DetectedActivity)localIterator.next();
      j = ((DetectedActivity)localObject).getType();
    } while (j != paramInt);
    int i = ((DetectedActivity)localObject).getConfidence();
    for (;;)
    {
      return i;
      i = 0;
      localObject = null;
    }
  }
  
  public long getElapsedRealtimeMillis()
  {
    return this.zzaNw;
  }
  
  public DetectedActivity getMostProbableActivity()
  {
    return (DetectedActivity)this.zzaNu.get(0);
  }
  
  public List getProbableActivities()
  {
    return this.zzaNu;
  }
  
  public long getTime()
  {
    return this.zzaNv;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Long.valueOf(this.zzaNv);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzaNw);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzaNx);
    arrayOfObject[2] = localObject;
    localObject = this.zzaNu;
    arrayOfObject[3] = localObject;
    localObject = this.extras;
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ActivityRecognitionResult [probableActivities=");
    List localList = this.zzaNu;
    localStringBuilder = localStringBuilder.append(localList).append(", timeMillis=");
    long l = this.zzaNv;
    localStringBuilder = localStringBuilder.append(l).append(", elapsedRealtimeMillis=");
    l = this.zzaNw;
    return l + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ActivityRecognitionResultCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\ActivityRecognitionResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */