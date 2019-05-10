package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzd;

public class AncsNotificationParcelable
  implements SafeParcelable, zzd
{
  public static final Parcelable.Creator CREATOR;
  private int mId;
  final int mVersionCode;
  private String zzTJ;
  private String zzWQ;
  private final String zzaDH;
  private final String zzaUa;
  private final String zzaaH;
  private final String zzapg;
  private final String zzbrH;
  private byte zzbrI;
  private byte zzbrJ;
  private byte zzbrK;
  private byte zzbrL;
  
  static
  {
    zzh localzzh = new com/google/android/gms/wearable/internal/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  AncsNotificationParcelable(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, String paramString7)
  {
    this.mId = paramInt2;
    this.mVersionCode = paramInt1;
    this.zzaUa = paramString1;
    this.zzbrH = paramString2;
    this.zzaaH = paramString3;
    this.zzapg = paramString4;
    this.zzaDH = paramString5;
    this.zzWQ = paramString6;
    this.zzbrI = paramByte1;
    this.zzbrJ = paramByte2;
    this.zzbrK = paramByte3;
    this.zzbrL = paramByte4;
    this.zzTJ = paramString7;
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
      paramObject = (AncsNotificationParcelable)paramObject;
      int i = this.zzbrL;
      int j = ((AncsNotificationParcelable)paramObject).zzbrL;
      if (i != j)
      {
        bool1 = false;
      }
      else
      {
        i = this.zzbrK;
        j = ((AncsNotificationParcelable)paramObject).zzbrK;
        if (i != j)
        {
          bool1 = false;
        }
        else
        {
          i = this.zzbrJ;
          j = ((AncsNotificationParcelable)paramObject).zzbrJ;
          if (i != j)
          {
            bool1 = false;
          }
          else
          {
            i = this.zzbrI;
            j = ((AncsNotificationParcelable)paramObject).zzbrI;
            if (i != j)
            {
              bool1 = false;
            }
            else
            {
              i = this.mId;
              j = ((AncsNotificationParcelable)paramObject).mId;
              if (i != j)
              {
                bool1 = false;
              }
              else
              {
                i = this.mVersionCode;
                j = ((AncsNotificationParcelable)paramObject).mVersionCode;
                if (i != j)
                {
                  bool1 = false;
                }
                else
                {
                  localObject1 = this.zzaUa;
                  localObject2 = ((AncsNotificationParcelable)paramObject).zzaUa;
                  boolean bool2 = ((String)localObject1).equals(localObject2);
                  if (!bool2)
                  {
                    bool1 = false;
                  }
                  else
                  {
                    localObject1 = this.zzbrH;
                    if (localObject1 != null)
                    {
                      localObject1 = this.zzbrH;
                      localObject2 = ((AncsNotificationParcelable)paramObject).zzbrH;
                      bool2 = ((String)localObject1).equals(localObject2);
                      if (bool2) {}
                    }
                    else
                    {
                      do
                      {
                        bool1 = false;
                        break;
                        localObject1 = ((AncsNotificationParcelable)paramObject).zzbrH;
                      } while (localObject1 != null);
                    }
                    localObject1 = this.zzWQ;
                    localObject2 = ((AncsNotificationParcelable)paramObject).zzWQ;
                    bool2 = ((String)localObject1).equals(localObject2);
                    if (!bool2)
                    {
                      bool1 = false;
                    }
                    else
                    {
                      localObject1 = this.zzaaH;
                      localObject2 = ((AncsNotificationParcelable)paramObject).zzaaH;
                      bool2 = ((String)localObject1).equals(localObject2);
                      if (!bool2)
                      {
                        bool1 = false;
                      }
                      else
                      {
                        localObject1 = this.zzaDH;
                        localObject2 = ((AncsNotificationParcelable)paramObject).zzaDH;
                        bool2 = ((String)localObject1).equals(localObject2);
                        if (!bool2)
                        {
                          bool1 = false;
                        }
                        else
                        {
                          localObject1 = this.zzapg;
                          localObject2 = ((AncsNotificationParcelable)paramObject).zzapg;
                          bool2 = ((String)localObject1).equals(localObject2);
                          if (!bool2) {
                            bool1 = false;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public String getDisplayName()
  {
    String str = this.zzWQ;
    if (str == null) {}
    for (str = this.zzaUa;; str = this.zzWQ) {
      return str;
    }
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  public String getPackageName()
  {
    return this.zzTJ;
  }
  
  public String getTitle()
  {
    return this.zzapg;
  }
  
  public int hashCode()
  {
    int i = this.mVersionCode * 31;
    int j = this.mId;
    i = (i + j) * 31;
    String str1 = this.zzaUa;
    j = str1.hashCode();
    i += j;
    j = i * 31;
    String str2 = this.zzbrH;
    if (str2 != null)
    {
      str2 = this.zzbrH;
      i = str2.hashCode();
    }
    for (;;)
    {
      i = (i + j) * 31;
      j = this.zzaaH.hashCode();
      i = (i + j) * 31;
      j = this.zzapg.hashCode();
      i = (i + j) * 31;
      j = this.zzaDH.hashCode();
      i = (i + j) * 31;
      j = this.zzWQ.hashCode();
      i = (i + j) * 31;
      j = this.zzbrI;
      i = (i + j) * 31;
      j = this.zzbrJ;
      i = (i + j) * 31;
      j = this.zzbrK;
      i = (i + j) * 31;
      j = this.zzbrL;
      return i + j;
      i = 0;
      str2 = null;
    }
  }
  
  public String toString()
  {
    char c = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("AncsNotificationParcelable{mVersionCode=");
    int i = this.mVersionCode;
    localStringBuilder = localStringBuilder.append(i).append(", mId=");
    i = this.mId;
    localStringBuilder = localStringBuilder.append(i).append(", mAppId='");
    String str = this.zzaUa;
    localStringBuilder = localStringBuilder.append(str).append(c).append(", mDateTime='");
    str = this.zzbrH;
    localStringBuilder = localStringBuilder.append(str).append(c).append(", mNotificationText='");
    str = this.zzaaH;
    localStringBuilder = localStringBuilder.append(str).append(c).append(", mTitle='");
    str = this.zzapg;
    localStringBuilder = localStringBuilder.append(str).append(c).append(", mSubtitle='");
    str = this.zzaDH;
    localStringBuilder = localStringBuilder.append(str).append(c).append(", mDisplayName='");
    str = this.zzWQ;
    localStringBuilder = localStringBuilder.append(str).append(c).append(", mEventId=");
    i = this.zzbrI;
    localStringBuilder = localStringBuilder.append(i).append(", mEventFlags=");
    i = this.zzbrJ;
    localStringBuilder = localStringBuilder.append(i).append(", mCategoryId=");
    i = this.zzbrK;
    localStringBuilder = localStringBuilder.append(i).append(", mCategoryCount=");
    i = this.zzbrL;
    return i + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public String zzIB()
  {
    return this.zzbrH;
  }
  
  public String zzIC()
  {
    return this.zzaaH;
  }
  
  public byte zzID()
  {
    return this.zzbrI;
  }
  
  public byte zzIE()
  {
    return this.zzbrJ;
  }
  
  public byte zzIF()
  {
    return this.zzbrK;
  }
  
  public byte zzIG()
  {
    return this.zzbrL;
  }
  
  public String zzwK()
  {
    return this.zzaUa;
  }
  
  public String zzwc()
  {
    return this.zzaDH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\AncsNotificationParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */