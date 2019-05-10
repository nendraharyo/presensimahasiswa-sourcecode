package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzoj.zza;
import java.util.Collections;
import java.util.List;

public class DataTypeCreateRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  private final int mVersionCode;
  private final zzoj zzaBa;
  private final List zzawE;
  
  static
  {
    zzi localzzi = new com/google/android/gms/fitness/request/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  DataTypeCreateRequest(int paramInt, String paramString, List paramList, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.mName = paramString;
    Object localObject = Collections.unmodifiableList(paramList);
    this.zzawE = ((List)localObject);
    localObject = zzoj.zza.zzbE(paramIBinder);
    this.zzaBa = ((zzoj)localObject);
  }
  
  private DataTypeCreateRequest(DataTypeCreateRequest.Builder paramBuilder)
  {
    this(str, localList, null);
  }
  
  public DataTypeCreateRequest(DataTypeCreateRequest paramDataTypeCreateRequest, zzoj paramzzoj)
  {
    this(str, localList, paramzzoj);
  }
  
  public DataTypeCreateRequest(String paramString, List paramList, zzoj paramzzoj)
  {
    this.mVersionCode = 3;
    this.mName = paramString;
    List localList = Collections.unmodifiableList(paramList);
    this.zzawE = localList;
    this.zzaBa = paramzzoj;
  }
  
  private boolean zzb(DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    Object localObject1 = this.mName;
    Object localObject2 = paramDataTypeCreateRequest.mName;
    boolean bool = zzw.equal(localObject1, localObject2);
    if (bool)
    {
      localObject1 = this.zzawE;
      localObject2 = paramDataTypeCreateRequest.zzawE;
      bool = zzw.equal(localObject1, localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof DataTypeCreateRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (DataTypeCreateRequest)paramObject;
      bool = zzb((DataTypeCreateRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaBa;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaBa.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public List getFields()
  {
    return this.zzawE;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.mName;
    arrayOfObject[0] = localObject;
    localObject = this.zzawE;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.mName;
    localzza = localzza.zzg("name", localObject);
    localObject = this.zzawE;
    return localzza.zzg("fields", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataTypeCreateRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */