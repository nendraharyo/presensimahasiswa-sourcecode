package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class zzdz
{
  private final Object[] mParams;
  private boolean zzAA;
  
  zzdz(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    Object[] arrayOfObject = zza(paramAdRequestParcel, paramString, paramInt);
    this.mParams = arrayOfObject;
  }
  
  private static Object[] zza(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    Object localObject1 = (String)zzbt.zzwF.get();
    Object localObject2 = new java/util/HashSet;
    localObject1 = Arrays.asList(((String)localObject1).split(","));
    ((HashSet)localObject2).<init>((Collection)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    ((ArrayList)localObject1).add(paramString);
    Object localObject3 = "networkType";
    boolean bool1 = ((Set)localObject2).contains(localObject3);
    if (bool1)
    {
      localObject3 = Integer.valueOf(paramInt);
      ((ArrayList)localObject1).add(localObject3);
    }
    localObject3 = "birthday";
    bool1 = ((Set)localObject2).contains(localObject3);
    if (bool1)
    {
      long l = paramAdRequestParcel.zztC;
      localObject3 = Long.valueOf(l);
      ((ArrayList)localObject1).add(localObject3);
    }
    localObject3 = "extras";
    bool1 = ((Set)localObject2).contains(localObject3);
    if (bool1)
    {
      localObject3 = zzc(paramAdRequestParcel.extras);
      ((ArrayList)localObject1).add(localObject3);
    }
    localObject3 = "gender";
    bool1 = ((Set)localObject2).contains(localObject3);
    if (bool1)
    {
      int i = paramAdRequestParcel.zztD;
      localObject3 = Integer.valueOf(i);
      ((ArrayList)localObject1).add(localObject3);
    }
    localObject3 = "keywords";
    boolean bool2 = ((Set)localObject2).contains(localObject3);
    boolean bool3;
    if (bool2)
    {
      localObject3 = paramAdRequestParcel.zztE;
      if (localObject3 != null)
      {
        localObject3 = paramAdRequestParcel.zztE.toString();
        ((ArrayList)localObject1).add(localObject3);
      }
    }
    else
    {
      localObject3 = "isTestDevice";
      bool2 = ((Set)localObject2).contains(localObject3);
      if (bool2)
      {
        bool2 = paramAdRequestParcel.zztF;
        localObject3 = Boolean.valueOf(bool2);
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject3 = "tagForChildDirectedTreatment";
      bool2 = ((Set)localObject2).contains(localObject3);
      if (bool2)
      {
        int j = paramAdRequestParcel.zztG;
        localObject3 = Integer.valueOf(j);
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject3 = "manualImpressionsEnabled";
      bool3 = ((Set)localObject2).contains(localObject3);
      if (bool3)
      {
        bool3 = paramAdRequestParcel.zztH;
        localObject3 = Boolean.valueOf(bool3);
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject3 = "publisherProvidedId";
      bool3 = ((Set)localObject2).contains(localObject3);
      if (bool3)
      {
        localObject3 = paramAdRequestParcel.zztI;
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject3 = "location";
      bool3 = ((Set)localObject2).contains(localObject3);
      if (bool3)
      {
        localObject3 = paramAdRequestParcel.zztK;
        if (localObject3 == null) {
          break label673;
        }
        localObject3 = paramAdRequestParcel.zztK.toString();
        ((ArrayList)localObject1).add(localObject3);
      }
      label441:
      localObject3 = "contentUrl";
      bool3 = ((Set)localObject2).contains(localObject3);
      if (bool3)
      {
        localObject3 = paramAdRequestParcel.zztL;
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject3 = "networkExtras";
      bool3 = ((Set)localObject2).contains(localObject3);
      if (bool3)
      {
        localObject3 = zzc(paramAdRequestParcel.zztM);
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject3 = "customTargeting";
      bool3 = ((Set)localObject2).contains(localObject3);
      if (bool3)
      {
        localObject3 = zzc(paramAdRequestParcel.zztN);
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject3 = "categoryExclusions";
      bool3 = ((Set)localObject2).contains(localObject3);
      if (bool3)
      {
        localObject3 = paramAdRequestParcel.zztO;
        if (localObject3 == null) {
          break label682;
        }
        localObject3 = paramAdRequestParcel.zztO.toString();
        ((ArrayList)localObject1).add(localObject3);
      }
    }
    for (;;)
    {
      localObject3 = "requestAgent";
      bool3 = ((Set)localObject2).contains(localObject3);
      if (bool3)
      {
        localObject3 = paramAdRequestParcel.zztP;
        ((ArrayList)localObject1).add(localObject3);
      }
      localObject3 = "requestPackage";
      boolean bool4 = ((Set)localObject2).contains(localObject3);
      if (bool4)
      {
        localObject2 = paramAdRequestParcel.zztQ;
        ((ArrayList)localObject1).add(localObject2);
      }
      return ((ArrayList)localObject1).toArray();
      ((ArrayList)localObject1).add(null);
      break;
      label673:
      ((ArrayList)localObject1).add(null);
      break label441;
      label682:
      ((ArrayList)localObject1).add(null);
    }
  }
  
  private static String zzc(Bundle paramBundle)
  {
    boolean bool1;
    if (paramBundle == null) {
      bool1 = false;
    }
    StringBuilder localStringBuilder;
    for (Object localObject1 = null;; localObject1 = localStringBuilder.toString())
    {
      return (String)localObject1;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = new java/util/ArrayList;
      Object localObject2 = paramBundle.keySet();
      ((ArrayList)localObject1).<init>((Collection)localObject2);
      Collections.sort((List)localObject1);
      localObject1 = paramBundle.keySet();
      localObject2 = ((Set)localObject1).iterator();
      bool1 = ((Iterator)localObject2).hasNext();
      if (bool1)
      {
        localObject1 = (String)((Iterator)localObject2).next();
        localObject1 = paramBundle.get((String)localObject1);
        if (localObject1 == null) {
          localObject1 = "null";
        }
        for (;;)
        {
          localStringBuilder.append((String)localObject1);
          break;
          boolean bool2 = localObject1 instanceof Bundle;
          if (bool2) {
            localObject1 = zzc((Bundle)localObject1);
          } else {
            localObject1 = localObject1.toString();
          }
        }
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof zzdz;
    Object[] arrayOfObject1;
    if (!bool)
    {
      bool = false;
      arrayOfObject1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (zzdz)paramObject;
      arrayOfObject1 = this.mParams;
      Object[] arrayOfObject2 = ((zzdz)paramObject).mParams;
      bool = Arrays.equals(arrayOfObject1, arrayOfObject2);
    }
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(this.mParams);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("[InterstitialAdPoolKey ");
    String str = Arrays.toString(this.mParams);
    return str + "]";
  }
  
  void zzeg()
  {
    this.zzAA = true;
  }
  
  boolean zzeh()
  {
    return this.zzAA;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */