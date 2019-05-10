package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzmo;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse
  extends FastJsonResponse
  implements SafeParcelable
{
  public static final zze CREATOR;
  private final String mClassName;
  private final int mVersionCode;
  private final FieldMappingDictionary zzamT;
  private final Parcel zzana;
  private final int zzanb;
  private int zzanc;
  private int zzand;
  
  static
  {
    zze localzze = new com/google/android/gms/common/server/response/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  SafeParcelResponse(int paramInt, Parcel paramParcel, FieldMappingDictionary paramFieldMappingDictionary)
  {
    this.mVersionCode = paramInt;
    Object localObject = (Parcel)zzx.zzz(paramParcel);
    this.zzana = ((Parcel)localObject);
    this.zzanb = i;
    this.zzamT = paramFieldMappingDictionary;
    localObject = this.zzamT;
    if (localObject == null) {
      localObject = null;
    }
    for (this.mClassName = null;; this.mClassName = ((String)localObject))
    {
      this.zzanc = i;
      return;
      localObject = this.zzamT.zzrB();
    }
  }
  
  private SafeParcelResponse(SafeParcelable paramSafeParcelable, FieldMappingDictionary paramFieldMappingDictionary, String paramString)
  {
    this.mVersionCode = i;
    Object localObject = Parcel.obtain();
    this.zzana = ((Parcel)localObject);
    localObject = this.zzana;
    paramSafeParcelable.writeToParcel((Parcel)localObject, 0);
    this.zzanb = i;
    localObject = (FieldMappingDictionary)zzx.zzz(paramFieldMappingDictionary);
    this.zzamT = ((FieldMappingDictionary)localObject);
    localObject = (String)zzx.zzz(paramString);
    this.mClassName = ((String)localObject);
    this.zzanc = 2;
  }
  
  private static HashMap zzN(Map paramMap)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      int i = ((FastJsonResponse.Field)((Map.Entry)localObject).getValue()).zzrs();
      Integer localInteger = Integer.valueOf(i);
      localHashMap.put(localInteger, localObject);
    }
    return localHashMap;
  }
  
  public static SafeParcelResponse zza(FastJsonResponse paramFastJsonResponse)
  {
    String str = paramFastJsonResponse.getClass().getCanonicalName();
    FieldMappingDictionary localFieldMappingDictionary = zzb(paramFastJsonResponse);
    SafeParcelResponse localSafeParcelResponse = new com/google/android/gms/common/server/response/SafeParcelResponse;
    paramFastJsonResponse = (SafeParcelable)paramFastJsonResponse;
    localSafeParcelResponse.<init>(paramFastJsonResponse, localFieldMappingDictionary, str);
    return localSafeParcelResponse;
  }
  
  private static void zza(FieldMappingDictionary paramFieldMappingDictionary, FastJsonResponse paramFastJsonResponse)
  {
    Object localObject1 = paramFastJsonResponse.getClass();
    boolean bool1 = paramFieldMappingDictionary.zzb((Class)localObject1);
    if (!bool1)
    {
      Object localObject2 = paramFastJsonResponse.zzrl();
      paramFieldMappingDictionary.zza((Class)localObject1, (Map)localObject2);
      localObject1 = ((Map)localObject2).keySet();
      Object localObject3 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject3).hasNext();
        if (bool2)
        {
          localObject1 = (String)((Iterator)localObject3).next();
          localObject1 = (FastJsonResponse.Field)((Map)localObject2).get(localObject1);
          Object localObject4 = ((FastJsonResponse.Field)localObject1).zzrt();
          if (localObject4 != null) {
            try
            {
              localObject4 = ((Class)localObject4).newInstance();
              localObject4 = (FastJsonResponse)localObject4;
              zza(paramFieldMappingDictionary, (FastJsonResponse)localObject4);
            }
            catch (InstantiationException localInstantiationException)
            {
              localObject2 = new java/lang/IllegalStateException;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("Could not instantiate an object of type ");
              localObject1 = ((FastJsonResponse.Field)localObject1).zzrt().getCanonicalName();
              localObject1 = (String)localObject1;
              ((IllegalStateException)localObject2).<init>((String)localObject1, localInstantiationException);
              throw ((Throwable)localObject2);
            }
            catch (IllegalAccessException localIllegalAccessException)
            {
              localObject2 = new java/lang/IllegalStateException;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("Could not access object of type ");
              localObject1 = ((FastJsonResponse.Field)localObject1).zzrt().getCanonicalName();
              localObject1 = (String)localObject1;
              ((IllegalStateException)localObject2).<init>((String)localObject1, localIllegalAccessException);
              throw ((Throwable)localObject2);
            }
          }
        }
      }
    }
  }
  
  private void zza(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    Object localObject2;
    switch (paramInt)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unknown type = " + paramInt;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      paramStringBuilder.append(paramObject);
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      for (;;)
      {
        return;
        localObject1 = paramStringBuilder.append("\"");
        localObject2 = zznb.zzcU(paramObject.toString());
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = "\"";
        ((StringBuilder)localObject1).append((String)localObject2);
        continue;
        localObject1 = paramStringBuilder.append("\"");
        paramObject = (byte[])paramObject;
        localObject2 = zzmo.zzj((byte[])paramObject);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = "\"";
        ((StringBuilder)localObject1).append((String)localObject2);
        continue;
        localObject1 = paramStringBuilder.append("\"");
        paramObject = (byte[])paramObject;
        localObject2 = zzmo.zzk((byte[])paramObject);
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = "\"";
        paramStringBuilder.append((String)localObject1);
        continue;
        paramObject = (HashMap)paramObject;
        zznc.zza(paramStringBuilder, (HashMap)paramObject);
      }
    }
    Object localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>("Method does not accept concrete type.");
    throw ((Throwable)localObject1);
  }
  
  private void zza(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, Parcel paramParcel, int paramInt)
  {
    int i = paramField.zzrk();
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unknown field out type = ");
      int j = paramField.zzrk();
      localObject2 = j;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 0: 
      i = zza.zzg(paramParcel, paramInt);
      localObject1 = Integer.valueOf(i);
      localObject1 = zza(paramField, localObject1);
      zzb(paramStringBuilder, paramField, localObject1);
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      for (;;)
      {
        return;
        localObject1 = zza.zzk(paramParcel, paramInt);
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
        continue;
        long l = zza.zzi(paramParcel, paramInt);
        localObject1 = Long.valueOf(l);
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
        continue;
        float f = zza.zzl(paramParcel, paramInt);
        localObject1 = Float.valueOf(f);
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
        continue;
        double d = zza.zzn(paramParcel, paramInt);
        localObject1 = Double.valueOf(d);
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
        continue;
        localObject1 = zza.zzo(paramParcel, paramInt);
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
        continue;
        boolean bool = zza.zzc(paramParcel, paramInt);
        localObject1 = Boolean.valueOf(bool);
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
        continue;
        localObject1 = zza.zzp(paramParcel, paramInt);
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
        continue;
        localObject1 = zza.zzs(paramParcel, paramInt);
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
        continue;
        localObject1 = zzl(zza.zzr(paramParcel, paramInt));
        localObject1 = zza(paramField, localObject1);
        zzb(paramStringBuilder, paramField, localObject1);
      }
    }
    Object localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>("Method does not accept concrete type.");
    throw ((Throwable)localObject1);
  }
  
  private void zza(StringBuilder paramStringBuilder, String paramString, FastJsonResponse.Field paramField, Parcel paramParcel, int paramInt)
  {
    StringBuilder localStringBuilder = paramStringBuilder.append("\"").append(paramString);
    String str = "\":";
    localStringBuilder.append(str);
    boolean bool = paramField.zzrv();
    if (bool) {
      zza(paramStringBuilder, paramField, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      zzb(paramStringBuilder, paramField, paramParcel, paramInt);
    }
  }
  
  private void zza(StringBuilder paramStringBuilder, Map paramMap, Parcel paramParcel)
  {
    HashMap localHashMap = zzN(paramMap);
    paramStringBuilder.append('{');
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    for (;;)
    {
      j = paramParcel.dataPosition();
      if (j >= i) {
        break;
      }
      int m = zza.zzat(paramParcel);
      j = zza.zzca(m);
      localObject1 = Integer.valueOf(j);
      localObject1 = (Map.Entry)localHashMap.get(localObject1);
      if (localObject1 != null)
      {
        if (k != 0)
        {
          localObject2 = ",";
          paramStringBuilder.append((String)localObject2);
        }
        String str = (String)((Map.Entry)localObject1).getKey();
        FastJsonResponse.Field localField = (FastJsonResponse.Field)((Map.Entry)localObject1).getValue();
        localObject1 = this;
        localObject2 = paramStringBuilder;
        zza(paramStringBuilder, str, localField, paramParcel, m);
        j = 1;
        k = j;
      }
    }
    j = paramParcel.dataPosition();
    if (j != i)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    paramStringBuilder.append('}');
  }
  
  private static FieldMappingDictionary zzb(FastJsonResponse paramFastJsonResponse)
  {
    FieldMappingDictionary localFieldMappingDictionary = new com/google/android/gms/common/server/response/FieldMappingDictionary;
    Class localClass = paramFastJsonResponse.getClass();
    localFieldMappingDictionary.<init>(localClass);
    zza(localFieldMappingDictionary, paramFastJsonResponse);
    localFieldMappingDictionary.zzrz();
    localFieldMappingDictionary.zzry();
    return localFieldMappingDictionary;
  }
  
  private void zzb(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, Parcel paramParcel, int paramInt)
  {
    boolean bool1 = paramField.zzrq();
    Object localObject1;
    int i;
    if (bool1)
    {
      localObject1 = "[";
      paramStringBuilder.append((String)localObject1);
      i = paramField.zzrk();
      switch (i)
      {
      default: 
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Unknown field type out.");
        throw ((Throwable)localObject1);
      case 0: 
        localObject1 = zza.zzv(paramParcel, paramInt);
        zzmn.zza(paramStringBuilder, (int[])localObject1);
        localObject1 = "]";
        paramStringBuilder.append((String)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject1 = zza.zzx(paramParcel, paramInt);
      zzmn.zza(paramStringBuilder, (Object[])localObject1);
      break;
      localObject1 = zza.zzw(paramParcel, paramInt);
      zzmn.zza(paramStringBuilder, (long[])localObject1);
      break;
      localObject1 = zza.zzy(paramParcel, paramInt);
      zzmn.zza(paramStringBuilder, (float[])localObject1);
      break;
      localObject1 = zza.zzz(paramParcel, paramInt);
      zzmn.zza(paramStringBuilder, (double[])localObject1);
      break;
      localObject1 = zza.zzA(paramParcel, paramInt);
      zzmn.zza(paramStringBuilder, (Object[])localObject1);
      break;
      localObject1 = zza.zzu(paramParcel, paramInt);
      zzmn.zza(paramStringBuilder, (boolean[])localObject1);
      break;
      localObject1 = zza.zzB(paramParcel, paramInt);
      zzmn.zza(paramStringBuilder, (String[])localObject1);
      break;
      localObject1 = new java/lang/UnsupportedOperationException;
      ((UnsupportedOperationException)localObject1).<init>("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
      throw ((Throwable)localObject1);
      Object localObject2 = zza.zzF(paramParcel, paramInt);
      int j = localObject2.length;
      i = 0;
      localObject1 = null;
      float f = 0.0F;
      Object localObject3;
      Object localObject4;
      while (i < j)
      {
        if (i > 0)
        {
          localObject3 = ",";
          paramStringBuilder.append((String)localObject3);
        }
        localObject2[i].setDataPosition(0);
        localObject3 = paramField.zzrx();
        localObject4 = localObject2[i];
        zza(paramStringBuilder, (Map)localObject3, (Parcel)localObject4);
        i += 1;
      }
      break;
      i = paramField.zzrk();
      boolean bool2;
      switch (i)
      {
      default: 
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Unknown field type out");
        throw ((Throwable)localObject1);
      case 0: 
        i = zza.zzg(paramParcel, paramInt);
        paramStringBuilder.append(i);
        break;
      case 1: 
        localObject1 = zza.zzk(paramParcel, paramInt);
        paramStringBuilder.append(localObject1);
        break;
      case 2: 
        long l = zza.zzi(paramParcel, paramInt);
        paramStringBuilder.append(l);
        break;
      case 3: 
        f = zza.zzl(paramParcel, paramInt);
        paramStringBuilder.append(f);
        break;
      case 4: 
        double d = zza.zzn(paramParcel, paramInt);
        paramStringBuilder.append(d);
        break;
      case 5: 
        localObject1 = zza.zzo(paramParcel, paramInt);
        paramStringBuilder.append(localObject1);
        break;
      case 6: 
        bool2 = zza.zzc(paramParcel, paramInt);
        paramStringBuilder.append(bool2);
        break;
      case 7: 
        localObject1 = zza.zzp(paramParcel, paramInt);
        localObject2 = paramStringBuilder.append("\"");
        localObject1 = zznb.zzcU((String)localObject1);
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = "\"";
        ((StringBuilder)localObject1).append((String)localObject2);
        break;
      case 8: 
        localObject1 = zza.zzs(paramParcel, paramInt);
        localObject2 = paramStringBuilder.append("\"");
        localObject1 = zzmo.zzj((byte[])localObject1);
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = "\"";
        ((StringBuilder)localObject1).append((String)localObject2);
        break;
      case 9: 
        localObject1 = zza.zzs(paramParcel, paramInt);
        localObject2 = paramStringBuilder.append("\"");
        localObject1 = zzmo.zzk((byte[])localObject1);
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject1 = "\"";
        paramStringBuilder.append((String)localObject1);
        break;
      case 10: 
        Bundle localBundle = zza.zzr(paramParcel, paramInt);
        localObject2 = localBundle.keySet();
        ((Set)localObject2).size();
        localObject1 = "{";
        paramStringBuilder.append((String)localObject1);
        bool2 = true;
        f = Float.MIN_VALUE;
        localObject3 = ((Set)localObject2).iterator();
        boolean bool3 = bool2;
        for (;;)
        {
          bool2 = ((Iterator)localObject3).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (String)((Iterator)localObject3).next();
          if (!bool3)
          {
            localObject2 = ",";
            paramStringBuilder.append((String)localObject2);
          }
          localObject2 = paramStringBuilder.append("\"").append((String)localObject1);
          localObject4 = "\"";
          ((StringBuilder)localObject2).append((String)localObject4);
          paramStringBuilder.append(":");
          localObject2 = paramStringBuilder.append("\"");
          localObject1 = zznb.zzcU(localBundle.getString((String)localObject1));
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject1).append("\"");
          bool3 = false;
          localObject2 = null;
        }
        localObject1 = "}";
        paramStringBuilder.append((String)localObject1);
        break;
      case 11: 
        localObject1 = zza.zzE(paramParcel, paramInt);
        ((Parcel)localObject1).setDataPosition(0);
        localObject2 = paramField.zzrx();
        zza(paramStringBuilder, (Map)localObject2, (Parcel)localObject1);
      }
    }
  }
  
  private void zzb(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, Object paramObject)
  {
    boolean bool = paramField.zzrp();
    if (bool)
    {
      paramObject = (ArrayList)paramObject;
      zzb(paramStringBuilder, paramField, (ArrayList)paramObject);
    }
    for (;;)
    {
      return;
      int i = paramField.zzrj();
      zza(paramStringBuilder, i, paramObject);
    }
  }
  
  private void zzb(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, ArrayList paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = paramArrayList.size();
    int j = 0;
    while (j < i)
    {
      if (j != 0)
      {
        String str = ",";
        paramStringBuilder.append(str);
      }
      int k = paramField.zzrj();
      Object localObject = paramArrayList.get(j);
      zza(paramStringBuilder, k, localObject);
      j += 1;
    }
    paramStringBuilder.append("]");
  }
  
  public static HashMap zzl(Bundle paramBundle)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = paramBundle.getString((String)localObject);
      localHashMap.put(localObject, str);
    }
    return localHashMap;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    zzx.zzb(this.zzamT, "Cannot convert to JSON on client side.");
    Parcel localParcel = zzrD();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(100);
    Object localObject = this.zzamT;
    String str = this.mClassName;
    localObject = ((FieldMappingDictionary)localObject).zzcR(str);
    zza(localStringBuilder, (Map)localObject, localParcel);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  protected Object zzcN(String paramString)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Converting to JSON does not require this method.");
    throw localUnsupportedOperationException;
  }
  
  protected boolean zzcO(String paramString)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Converting to JSON does not require this method.");
    throw localUnsupportedOperationException;
  }
  
  public Parcel zzrD()
  {
    int i = 2;
    int j = this.zzanc;
    switch (j)
    {
    }
    for (;;)
    {
      return this.zzana;
      j = zzb.zzav(this.zzana);
      this.zzand = j;
      Parcel localParcel = this.zzana;
      int k = this.zzand;
      zzb.zzI(localParcel, k);
      this.zzanc = i;
      continue;
      localParcel = this.zzana;
      k = this.zzand;
      zzb.zzI(localParcel, k);
      this.zzanc = i;
    }
  }
  
  FieldMappingDictionary zzrE()
  {
    int i = this.zzanb;
    Object localObject1;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid creation type: ");
      int j = this.zzanb;
      localObject2 = j;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 0: 
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (FieldMappingDictionary)localObject1;
      localObject1 = this.zzamT;
      continue;
      localObject1 = this.zzamT;
    }
  }
  
  public Map zzrl()
  {
    Object localObject = this.zzamT;
    if (localObject == null) {}
    String str;
    for (localObject = null;; localObject = ((FieldMappingDictionary)localObject).zzcR(str))
    {
      return (Map)localObject;
      localObject = this.zzamT;
      str = this.mClassName;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\SafeParcelResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */