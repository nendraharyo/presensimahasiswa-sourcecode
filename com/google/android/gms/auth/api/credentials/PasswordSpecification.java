package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class PasswordSpecification
  implements SafeParcelable
{
  public static final zzf CREATOR;
  public static final PasswordSpecification zzWl;
  public static final PasswordSpecification zzWm;
  final int mVersionCode;
  final String zzWn;
  final List zzWo;
  final List zzWp;
  final int zzWq;
  final int zzWr;
  private final int[] zzWs;
  private final Random zzuy;
  
  static
  {
    int i = 16;
    int j = 12;
    int k = 1;
    Object localObject = new com/google/android/gms/auth/api/credentials/zzf;
    ((zzf)localObject).<init>();
    CREATOR = (zzf)localObject;
    localObject = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zza;
    ((PasswordSpecification.zza)localObject).<init>();
    zzWl = ((PasswordSpecification.zza)localObject).zzh(j, i).zzbG("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zze("abcdefghijkmnopqrstxyz", k).zze("ABCDEFGHJKLMNPQRSTXY", k).zze("3456789", k).zzmA();
    localObject = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zza;
    ((PasswordSpecification.zza)localObject).<init>();
    zzWm = ((PasswordSpecification.zza)localObject).zzh(j, i).zzbG("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zze("abcdefghijklmnopqrstuvwxyz", k).zze("ABCDEFGHIJKLMNOPQRSTUVWXYZ", k).zze("1234567890", k).zzmA();
  }
  
  PasswordSpecification(int paramInt1, String paramString, List paramList1, List paramList2, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzWn = paramString;
    Object localObject = Collections.unmodifiableList(paramList1);
    this.zzWo = ((List)localObject);
    localObject = Collections.unmodifiableList(paramList2);
    this.zzWp = ((List)localObject);
    this.zzWq = paramInt2;
    this.zzWr = paramInt3;
    localObject = zzmz();
    this.zzWs = ((int[])localObject);
    localObject = new java/security/SecureRandom;
    ((SecureRandom)localObject).<init>();
    this.zzuy = ((Random)localObject);
  }
  
  private int zza(char paramChar)
  {
    return paramChar + '￠';
  }
  
  private static String zzb(Collection paramCollection)
  {
    char[] arrayOfChar = new char[paramCollection.size()];
    boolean bool = false;
    Object localObject = null;
    Iterator localIterator = paramCollection.iterator();
    int i;
    for (int j = 0;; j = i)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Character)localIterator.next();
      int k = ((Character)localObject).charValue();
      i = j + 1;
      arrayOfChar[j] = k;
    }
    localObject = new java/lang/String;
    ((String)localObject).<init>(arrayOfChar);
    return (String)localObject;
  }
  
  private static boolean zzb(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < paramInt2) || (paramInt1 > paramInt3)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private int[] zzmz()
  {
    int[] arrayOfInt = new int[95];
    int i = -1;
    Arrays.fill(arrayOfInt, i);
    List localList = this.zzWo;
    Iterator localIterator = localList.iterator();
    int k;
    for (int m = 0;; m = k)
    {
      int j = localIterator.hasNext();
      if (j == 0) {
        break;
      }
      char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
      int n = arrayOfChar.length;
      j = 0;
      localList = null;
      while (j < n)
      {
        char c = arrayOfChar[j];
        int i1 = zza(c);
        arrayOfInt[i1] = m;
        j += 1;
      }
      k = m + 1;
    }
    return arrayOfInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\PasswordSpecification.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */