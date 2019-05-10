package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CastDevice
  implements SafeParcelable
{
  public static final int CAPABILITY_AUDIO_IN = 8;
  public static final int CAPABILITY_AUDIO_OUT = 4;
  public static final int CAPABILITY_MULTIZONE_GROUP = 32;
  public static final int CAPABILITY_VIDEO_IN = 2;
  public static final int CAPABILITY_VIDEO_OUT = 1;
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private int zzBc;
  private String zzZT;
  String zzZU;
  private Inet4Address zzZV;
  private String zzZW;
  private String zzZX;
  private String zzZY;
  private int zzZZ;
  private List zzaaa;
  private int zzaab;
  private String zzaac;
  
  static
  {
    zzb localzzb = new com/google/android/gms/cast/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  private CastDevice()
  {
    this(4, null, null, null, null, null, i, localArrayList, 0, i, null);
  }
  
  CastDevice(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, List paramList, int paramInt3, int paramInt4, String paramString6)
  {
    this.mVersionCode = paramInt1;
    Object localObject = zzbZ(paramString1);
    this.zzZT = ((String)localObject);
    localObject = zzbZ(paramString2);
    this.zzZU = ((String)localObject);
    localObject = this.zzZU;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool1) {}
    try
    {
      localObject = this.zzZU;
      localObject = InetAddress.getByName((String)localObject);
      boolean bool2 = localObject instanceof Inet4Address;
      if (bool2)
      {
        localObject = (Inet4Address)localObject;
        this.zzZV = ((Inet4Address)localObject);
      }
    }
    catch (UnknownHostException localUnknownHostException)
    {
      for (;;)
      {
        String str2 = "CastDevice";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Unable to convert host address (");
        String str3 = this.zzZU;
        localStringBuilder = localStringBuilder.append(str3);
        str3 = ") to ipaddress: ";
        localStringBuilder = localStringBuilder.append(str3);
        String str1 = localUnknownHostException.getMessage();
        str1 = str1;
        Log.i(str2, str1);
        continue;
        paramList = new java/util/ArrayList;
        paramList.<init>();
      }
    }
    localObject = zzbZ(paramString3);
    this.zzZW = ((String)localObject);
    localObject = zzbZ(paramString4);
    this.zzZX = ((String)localObject);
    localObject = zzbZ(paramString5);
    this.zzZY = ((String)localObject);
    this.zzZZ = paramInt2;
    if (paramList != null)
    {
      this.zzaaa = paramList;
      this.zzaab = paramInt3;
      this.zzBc = paramInt4;
      localObject = zzbZ(paramString6);
      this.zzaac = ((String)localObject);
      return;
    }
  }
  
  public static CastDevice getFromBundle(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (Object localObject = null;; localObject = (CastDevice)paramBundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE"))
    {
      return (CastDevice)localObject;
      localObject = CastDevice.class.getClassLoader();
      paramBundle.setClassLoader((ClassLoader)localObject);
    }
  }
  
  private static String zzbZ(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    return paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof CastDevice;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (CastDevice)paramObject;
        Object localObject1 = this.zzZT;
        if (localObject1 == null)
        {
          localObject1 = ((CastDevice)paramObject).zzZT;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzZT;
          Object localObject2 = ((CastDevice)paramObject).zzZT;
          bool2 = zzf.zza(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.zzZV;
            localObject2 = ((CastDevice)paramObject).zzZV;
            bool2 = zzf.zza(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = this.zzZX;
              localObject2 = ((CastDevice)paramObject).zzZX;
              bool2 = zzf.zza(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = this.zzZW;
                localObject2 = ((CastDevice)paramObject).zzZW;
                bool2 = zzf.zza(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = this.zzZY;
                  localObject2 = ((CastDevice)paramObject).zzZY;
                  bool2 = zzf.zza(localObject1, localObject2);
                  if (bool2)
                  {
                    int i = this.zzZZ;
                    int k = ((CastDevice)paramObject).zzZZ;
                    if (i == k)
                    {
                      localObject1 = this.zzaaa;
                      localObject2 = ((CastDevice)paramObject).zzaaa;
                      boolean bool3 = zzf.zza(localObject1, localObject2);
                      if (bool3)
                      {
                        int j = this.zzaab;
                        k = ((CastDevice)paramObject).zzaab;
                        if (j == k)
                        {
                          j = this.zzBc;
                          k = ((CastDevice)paramObject).zzBc;
                          if (j == k)
                          {
                            localObject1 = this.zzaac;
                            localObject2 = ((CastDevice)paramObject).zzaac;
                            boolean bool4 = zzf.zza(localObject1, localObject2);
                            if (bool4) {
                              continue;
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
          bool1 = false;
        }
      }
    }
  }
  
  public int getCapabilities()
  {
    return this.zzaab;
  }
  
  public String getDeviceId()
  {
    String str1 = this.zzZT;
    String str2 = "__cast_nearby__";
    boolean bool = str1.startsWith(str2);
    int i;
    if (bool)
    {
      str1 = this.zzZT;
      str2 = "__cast_nearby__";
      i = str2.length() + 1;
    }
    for (str1 = str1.substring(i);; str1 = this.zzZT) {
      return str1;
    }
  }
  
  public String getDeviceVersion()
  {
    return this.zzZY;
  }
  
  public String getFriendlyName()
  {
    return this.zzZW;
  }
  
  public WebImage getIcon(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = this.zzaaa;
    boolean bool = ((List)localObject2).isEmpty();
    if (bool) {}
    for (;;)
    {
      return (WebImage)localObject1;
      if ((paramInt1 > 0) && (paramInt2 > 0)) {
        break;
      }
      localObject2 = (WebImage)this.zzaaa.get(0);
      localObject1 = localObject2;
    }
    localObject2 = this.zzaaa;
    Iterator localIterator = ((List)localObject2).iterator();
    Object localObject3 = null;
    label71:
    bool = localIterator.hasNext();
    int i;
    int j;
    int k;
    if (bool)
    {
      localObject2 = (WebImage)localIterator.next();
      i = ((WebImage)localObject2).getWidth();
      j = ((WebImage)localObject2).getHeight();
      if ((i >= paramInt1) && (j >= paramInt2))
      {
        if (localObject3 != null)
        {
          k = ((WebImage)localObject3).getWidth();
          if (k <= i) {
            break label266;
          }
          i = ((WebImage)localObject3).getHeight();
          if (i <= j) {
            break label266;
          }
        }
        Object localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject4;
      }
    }
    for (;;)
    {
      localObject3 = localObject1;
      localObject1 = localObject2;
      break label71;
      if ((i < paramInt1) && (j < paramInt2)) {
        if (localObject1 != null)
        {
          k = ((WebImage)localObject1).getWidth();
          if (k < i)
          {
            i = ((WebImage)localObject1).getHeight();
            if (i >= j) {}
          }
        }
        else
        {
          localObject1 = localObject3;
          continue;
          if (localObject3 != null) {}
          for (;;)
          {
            localObject1 = localObject3;
            break;
            if (localObject1 != null)
            {
              localObject3 = localObject1;
            }
            else
            {
              localObject2 = (WebImage)this.zzaaa.get(0);
              localObject3 = localObject2;
            }
          }
        }
      }
      label266:
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
  }
  
  public List getIcons()
  {
    return Collections.unmodifiableList(this.zzaaa);
  }
  
  public Inet4Address getIpAddress()
  {
    return this.zzZV;
  }
  
  public String getModelName()
  {
    return this.zzZX;
  }
  
  public int getServicePort()
  {
    return this.zzZZ;
  }
  
  public int getStatus()
  {
    return this.zzBc;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean hasCapabilities(int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    if (paramArrayOfInt == null) {}
    for (;;)
    {
      return bool1;
      int i = paramArrayOfInt.length;
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label48;
        }
        int k = paramArrayOfInt[j];
        boolean bool2 = hasCapability(k);
        if (!bool2) {
          break;
        }
        j += 1;
      }
      label48:
      bool1 = true;
    }
  }
  
  public boolean hasCapability(int paramInt)
  {
    int i = this.zzaab & paramInt;
    if (i == paramInt) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public boolean hasIcons()
  {
    List localList = this.zzaaa;
    boolean bool = localList.isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  public int hashCode()
  {
    String str = this.zzZT;
    int i;
    if (str == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return i;
      str = this.zzZT;
      i = str.hashCode();
    }
  }
  
  public boolean isOnLocalNetwork()
  {
    String str1 = this.zzZT;
    String str2 = "__cast_nearby__";
    boolean bool = str1.startsWith(str2);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public boolean isSameDevice(CastDevice paramCastDevice)
  {
    boolean bool = false;
    String str1 = null;
    if (paramCastDevice == null) {}
    for (;;)
    {
      return bool;
      String str2 = this.zzZT;
      if (str2 == null)
      {
        str2 = paramCastDevice.zzZT;
        if (str2 == null) {
          bool = true;
        }
      }
      else
      {
        str1 = this.zzZT;
        str2 = paramCastDevice.zzZT;
        bool = zzf.zza(str1, str2);
      }
    }
  }
  
  public void putInBundle(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      String str = "com.google.android.gms.cast.EXTRA_CAST_DEVICE";
      paramBundle.putParcelable(str, this);
    }
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    String str = this.zzZW;
    arrayOfObject[0] = str;
    str = this.zzZT;
    arrayOfObject[1] = str;
    return String.format("\"%s\" (%s)", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzny()
  {
    return this.zzZT;
  }
  
  public String zznz()
  {
    return this.zzaac;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastDevice.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */