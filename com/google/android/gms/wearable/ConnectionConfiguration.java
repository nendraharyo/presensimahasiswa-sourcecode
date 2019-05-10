package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class ConnectionConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  final int mVersionCode;
  private boolean zzTb;
  private final int zzabB;
  private final int zzapo;
  private final String zzawc;
  private final boolean zzbqY;
  private String zzbqZ;
  private boolean zzbra;
  private String zzbrb;
  
  static
  {
    zzg localzzg = new com/google/android/gms/wearable/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  ConnectionConfiguration(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, String paramString3, boolean paramBoolean3, String paramString4)
  {
    this.mVersionCode = paramInt1;
    this.mName = paramString1;
    this.zzawc = paramString2;
    this.zzabB = paramInt2;
    this.zzapo = paramInt3;
    this.zzbqY = paramBoolean1;
    this.zzTb = paramBoolean2;
    this.zzbqZ = paramString3;
    this.zzbra = paramBoolean3;
    this.zzbrb = paramString4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof ConnectionConfiguration;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (ConnectionConfiguration)paramObject;
      Object localObject1 = Integer.valueOf(this.mVersionCode);
      int i = ((ConnectionConfiguration)paramObject).mVersionCode;
      Object localObject2 = Integer.valueOf(i);
      bool2 = zzw.equal(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = this.mName;
        localObject2 = ((ConnectionConfiguration)paramObject).mName;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzawc;
          localObject2 = ((ConnectionConfiguration)paramObject).zzawc;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = Integer.valueOf(this.zzabB);
            i = ((ConnectionConfiguration)paramObject).zzabB;
            localObject2 = Integer.valueOf(i);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Integer.valueOf(this.zzapo);
              i = ((ConnectionConfiguration)paramObject).zzapo;
              localObject2 = Integer.valueOf(i);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = Boolean.valueOf(this.zzbqY);
                boolean bool3 = ((ConnectionConfiguration)paramObject).zzbqY;
                localObject2 = Boolean.valueOf(bool3);
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = Boolean.valueOf(this.zzbra);
                  bool3 = ((ConnectionConfiguration)paramObject).zzbra;
                  localObject2 = Boolean.valueOf(bool3);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2) {
                    bool1 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public String getAddress()
  {
    return this.zzawc;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getNodeId()
  {
    return this.zzbrb;
  }
  
  public int getRole()
  {
    return this.zzapo;
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    Object localObject = Integer.valueOf(this.mVersionCode);
    arrayOfObject[0] = localObject;
    localObject = this.mName;
    arrayOfObject[1] = localObject;
    localObject = this.zzawc;
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzabB);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.zzapo);
    arrayOfObject[4] = localObject;
    localObject = Boolean.valueOf(this.zzbqY);
    arrayOfObject[5] = localObject;
    localObject = Boolean.valueOf(this.zzbra);
    arrayOfObject[6] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isConnected()
  {
    return this.zzTb;
  }
  
  public boolean isEnabled()
  {
    return this.zzbqY;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("ConnectionConfiguration[ ");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("mName=");
    String str = this.mName;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", mAddress=");
    str = this.zzawc;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", mType=");
    int i = this.zzabB;
    localObject = i;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", mRole=");
    i = this.zzapo;
    localObject = i;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", mEnabled=");
    boolean bool = this.zzbqY;
    localObject = bool;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", mIsConnected=");
    bool = this.zzTb;
    localObject = bool;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", mPeerNodeId=");
    str = this.zzbqZ;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", mBtlePriority=");
    bool = this.zzbra;
    localObject = bool;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", mNodeId=");
    str = this.zzbrb;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public String zzIt()
  {
    return this.zzbqZ;
  }
  
  public boolean zzIu()
  {
    return this.zzbra;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\ConnectionConfiguration.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */