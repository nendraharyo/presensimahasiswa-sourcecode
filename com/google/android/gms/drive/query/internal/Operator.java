package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final Operator zzauA;
  public static final Operator zzauB;
  public static final Operator zzauC;
  public static final Operator zzauD;
  public static final Operator zzauE;
  public static final Operator zzauF;
  public static final Operator zzaux;
  public static final Operator zzauy;
  public static final Operator zzauz;
  final String mTag;
  final int mVersionCode;
  
  static
  {
    Object localObject = new com/google/android/gms/drive/query/internal/zzn;
    ((zzn)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>("=");
    zzaux = (Operator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>("<");
    zzauy = (Operator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>("<=");
    zzauz = (Operator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>(">");
    zzauA = (Operator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>(">=");
    zzauB = (Operator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>("and");
    zzauC = (Operator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>("or");
    zzauD = (Operator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>("not");
    zzauE = (Operator)localObject;
    localObject = new com/google/android/gms/drive/query/internal/Operator;
    ((Operator)localObject).<init>("contains");
    zzauF = (Operator)localObject;
  }
  
  Operator(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    this.mTag = paramString;
  }
  
  private Operator(String paramString)
  {
    this(1, paramString);
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
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        Object localObject1 = getClass();
        Object localObject2 = paramObject.getClass();
        if (localObject1 != localObject2)
        {
          bool1 = false;
        }
        else
        {
          paramObject = (Operator)paramObject;
          localObject1 = this.mTag;
          if (localObject1 == null)
          {
            localObject1 = ((Operator)paramObject).mTag;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.mTag;
            localObject2 = ((Operator)paramObject).mTag;
            boolean bool2 = ((String)localObject1).equals(localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public String getTag()
  {
    return this.mTag;
  }
  
  public int hashCode()
  {
    String str = this.mTag;
    int i;
    if (str == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return i + 31;
      str = this.mTag;
      i = str.hashCode();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\Operator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */