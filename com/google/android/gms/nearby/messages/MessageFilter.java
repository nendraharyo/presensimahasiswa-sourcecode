package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.List;

public class MessageFilter
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final MessageFilter INCLUDE_ALL_MY_TYPES;
  final int mVersionCode;
  private final List zzbbB;
  private final List zzbbC;
  private final boolean zzbbD;
  
  static
  {
    Object localObject = new com/google/android/gms/nearby/messages/zzb;
    ((zzb)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    localObject = new com/google/android/gms/nearby/messages/MessageFilter$Builder;
    ((MessageFilter.Builder)localObject).<init>();
    INCLUDE_ALL_MY_TYPES = ((MessageFilter.Builder)localObject).includeAllMyTypes().build();
  }
  
  MessageFilter(int paramInt, List paramList1, List paramList2, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    List localList = Collections.unmodifiableList((List)zzx.zzz(paramList1));
    this.zzbbB = localList;
    this.zzbbD = paramBoolean;
    if (paramList2 == null) {
      paramList2 = Collections.emptyList();
    }
    localList = Collections.unmodifiableList(paramList2);
    this.zzbbC = localList;
  }
  
  private MessageFilter(List paramList1, List paramList2, boolean paramBoolean)
  {
    this(1, paramList1, paramList2, paramBoolean);
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
      boolean bool2 = paramObject instanceof MessageFilter;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (MessageFilter)paramObject;
        bool2 = this.zzbbD;
        boolean bool3 = ((MessageFilter)paramObject).zzbbD;
        if (bool2 == bool3)
        {
          List localList1 = this.zzbbB;
          List localList2 = ((MessageFilter)paramObject).zzbbB;
          bool2 = zzw.equal(localList1, localList2);
          if (bool2)
          {
            localList1 = this.zzbbC;
            localList2 = ((MessageFilter)paramObject).zzbbC;
            bool2 = zzw.equal(localList1, localList2);
            if (bool2) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzbbB;
    arrayOfObject[0] = localObject;
    localObject = this.zzbbC;
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.zzbbD);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("MessageFilter{includeAllMyTypes=");
    boolean bool = this.zzbbD;
    localStringBuilder = localStringBuilder.append(bool).append(", messageTypes=");
    List localList = this.zzbbB;
    return localList + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  List zzEo()
  {
    return this.zzbbB;
  }
  
  boolean zzEp()
  {
    return this.zzbbD;
  }
  
  List zzEq()
  {
    return this.zzbbC;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\MessageFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */