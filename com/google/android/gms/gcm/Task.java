package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

public abstract class Task
  implements Parcelable
{
  public static final int EXTRAS_LIMIT_BYTES = 10240;
  public static final int NETWORK_STATE_ANY = 2;
  public static final int NETWORK_STATE_CONNECTED = 0;
  public static final int NETWORK_STATE_UNMETERED = 1;
  protected static final long UNINITIALIZED = 255L;
  private final Bundle mExtras;
  private final String mTag;
  private final String zzaMh;
  private final boolean zzaMi;
  private final boolean zzaMj;
  private final int zzaMk;
  private final boolean zzaMl;
  private final zzd zzaMm;
  
  Task(Parcel paramParcel)
  {
    String str = "Constructing a Task object using a parcel.";
    Log.e("Task", str);
    Object localObject = paramParcel.readString();
    this.zzaMh = ((String)localObject);
    localObject = paramParcel.readString();
    this.mTag = ((String)localObject);
    int j = paramParcel.readInt();
    if (j == i)
    {
      j = i;
      this.zzaMi = j;
      j = paramParcel.readInt();
      if (j != i) {
        break label114;
      }
    }
    for (;;)
    {
      this.zzaMj = i;
      this.zzaMk = 2;
      this.zzaMl = false;
      localObject = zzd.zzaMc;
      this.zzaMm = ((zzd)localObject);
      this.mExtras = null;
      return;
      j = 0;
      localObject = null;
      break;
      label114:
      i = 0;
    }
  }
  
  Task(Task.Builder paramBuilder)
  {
    Object localObject = paramBuilder.gcmTaskService;
    this.zzaMh = ((String)localObject);
    localObject = paramBuilder.tag;
    this.mTag = ((String)localObject);
    boolean bool1 = paramBuilder.updateCurrent;
    this.zzaMi = bool1;
    bool1 = paramBuilder.isPersisted;
    this.zzaMj = bool1;
    int i = paramBuilder.requiredNetworkState;
    this.zzaMk = i;
    boolean bool2 = paramBuilder.requiresCharging;
    this.zzaMl = bool2;
    localObject = paramBuilder.zzaMn;
    this.zzaMm = ((zzd)localObject);
    localObject = paramBuilder.extras;
    this.mExtras = ((Bundle)localObject);
  }
  
  private static boolean zzD(Object paramObject)
  {
    boolean bool = paramObject instanceof Integer;
    if (!bool)
    {
      bool = paramObject instanceof Long;
      if (!bool)
      {
        bool = paramObject instanceof Double;
        if (!bool)
        {
          bool = paramObject instanceof String;
          if (!bool)
          {
            bool = paramObject instanceof Boolean;
            if (!bool) {
              break label49;
            }
          }
        }
      }
    }
    label49:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static void zzG(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Object localObject1 = Parcel.obtain();
      Object localObject2 = null;
      paramBundle.writeToParcel((Parcel)localObject1, 0);
      int i = ((Parcel)localObject1).dataSize();
      int j = 10240;
      if (i > j)
      {
        ((Parcel)localObject1).recycle();
        localObject1 = new java/lang/IllegalArgumentException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = "Extras exceeding maximum size(10240 bytes): " + i;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      ((Parcel)localObject1).recycle();
      localObject1 = paramBundle.keySet();
      localObject2 = ((Set)localObject1).iterator();
      boolean bool;
      do
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        localObject1 = paramBundle.get((String)localObject1);
        bool = zzD(localObject1);
      } while (bool);
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean. ");
      throw ((Throwable)localObject1);
    }
  }
  
  public static void zza(zzd paramzzd)
  {
    int i = 1;
    if (paramzzd != null)
    {
      int j = paramzzd.zzym();
      Object localObject1;
      StringBuilder localStringBuilder;
      Object localObject2;
      if ((j != i) && (j != 0))
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = "Must provide a valid RetryPolicy: " + j;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      int k = paramzzd.zzyn();
      int m = paramzzd.zzyo();
      if ((j == 0) && (k < 0))
      {
        localObject2 = new java/lang/IllegalArgumentException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = "InitialBackoffSeconds can't be negative: " + k;
        ((IllegalArgumentException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      if (j == i)
      {
        j = 10;
        if (k < j)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject2).<init>("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
          throw ((Throwable)localObject2);
        }
      }
      if (m < k)
      {
        localObject2 = new java/lang/IllegalArgumentException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
        m = paramzzd.zzyo();
        localObject1 = m;
        ((IllegalArgumentException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Bundle getExtras()
  {
    return this.mExtras;
  }
  
  public int getRequiredNetwork()
  {
    return this.zzaMk;
  }
  
  public boolean getRequiresCharging()
  {
    return this.zzaMl;
  }
  
  public String getServiceName()
  {
    return this.zzaMh;
  }
  
  public String getTag()
  {
    return this.mTag;
  }
  
  public boolean isPersisted()
  {
    return this.zzaMj;
  }
  
  public boolean isUpdateCurrent()
  {
    return this.zzaMi;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    Object localObject = this.mTag;
    paramBundle.putString("tag", (String)localObject);
    boolean bool1 = this.zzaMi;
    paramBundle.putBoolean("update_current", bool1);
    bool1 = this.zzaMj;
    paramBundle.putBoolean("persisted", bool1);
    localObject = this.zzaMh;
    paramBundle.putString("service", (String)localObject);
    int i = this.zzaMk;
    paramBundle.putInt("requiredNetwork", i);
    boolean bool2 = this.zzaMl;
    paramBundle.putBoolean("requiresCharging", bool2);
    localObject = this.zzaMm;
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localObject = ((zzd)localObject).zzF(localBundle);
    paramBundle.putBundle("retryStrategy", (Bundle)localObject);
    localObject = this.mExtras;
    paramBundle.putBundle("extras", (Bundle)localObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    String str = this.zzaMh;
    paramParcel.writeString(str);
    str = this.mTag;
    paramParcel.writeString(str);
    int j = this.zzaMi;
    boolean bool;
    if (j != 0)
    {
      j = i;
      paramParcel.writeInt(j);
      bool = this.zzaMj;
      if (!bool) {
        break label72;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      return;
      bool = false;
      str = null;
      break;
      label72:
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\Task.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */