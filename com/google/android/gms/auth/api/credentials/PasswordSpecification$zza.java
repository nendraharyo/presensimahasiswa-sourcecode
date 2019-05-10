package com.google.android.gms.auth.api.credentials;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class PasswordSpecification$zza
{
  private final List zzWo;
  private final List zzWp;
  private int zzWq;
  private int zzWr;
  private final TreeSet zzWt;
  
  public PasswordSpecification$zza()
  {
    Object localObject = new java/util/TreeSet;
    ((TreeSet)localObject).<init>();
    this.zzWt = ((TreeSet)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzWo = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzWp = ((List)localObject);
    this.zzWq = 12;
    this.zzWr = 16;
  }
  
  private void zzmB()
  {
    boolean bool = false;
    Object localObject = null;
    Iterator localIterator = this.zzWp.iterator();
    for (int j = 0;; j = i)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Integer)localIterator.next();
      i = ((Integer)localObject).intValue() + j;
    }
    int i = this.zzWr;
    if (j > i)
    {
      localObject = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zzb;
      ((PasswordSpecification.zzb)localObject).<init>("required character count cannot be greater than the max password size");
      throw ((Throwable)localObject);
    }
  }
  
  private void zzmC()
  {
    int i = 95;
    Object localObject1 = new boolean[i];
    Object localObject2 = this.zzWo;
    Iterator localIterator = ((List)localObject2).iterator();
    for (;;)
    {
      int j = localIterator.hasNext();
      if (j == 0) {
        break;
      }
      char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
      int m = arrayOfChar.length;
      j = 0;
      localObject2 = null;
      while (j < m)
      {
        int n = arrayOfChar[j];
        int i2 = n + -32;
        i2 = localObject1[i2];
        if (i2 != 0)
        {
          localObject2 = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zzb;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = "character " + n + " occurs in more than one required character set";
          ((PasswordSpecification.zzb)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
        int i1;
        n += -32;
        i2 = 1;
        localObject1[i1] = i2;
        int k;
        j += 1;
      }
    }
  }
  
  private TreeSet zzq(String paramString1, String paramString2)
  {
    int i = TextUtils.isEmpty(paramString1);
    if (i != 0)
    {
      localzzb = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zzb;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString2 + " cannot be null or empty";
      localzzb.<init>((String)localObject);
      throw localzzb;
    }
    Object localObject = new java/util/TreeSet;
    ((TreeSet)localObject).<init>();
    char[] arrayOfChar = paramString1.toCharArray();
    int k = arrayOfChar.length;
    i = 0;
    PasswordSpecification.zzb localzzb = null;
    while (i < k)
    {
      char c = arrayOfChar[i];
      int m = 126;
      boolean bool = PasswordSpecification.zzc(c, 32, m);
      if (bool)
      {
        localzzb = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zzb;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = paramString2 + " must only contain ASCII printable characters";
        localzzb.<init>((String)localObject);
        throw localzzb;
      }
      Character localCharacter = Character.valueOf(c);
      ((TreeSet)localObject).add(localCharacter);
      int j;
      i += 1;
    }
    return (TreeSet)localObject;
  }
  
  public zza zzbG(String paramString)
  {
    TreeSet localTreeSet1 = this.zzWt;
    TreeSet localTreeSet2 = zzq(paramString, "allowedChars");
    localTreeSet1.addAll(localTreeSet2);
    return this;
  }
  
  public zza zze(String paramString, int paramInt)
  {
    int i = 1;
    if (paramInt < i)
    {
      localObject1 = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zzb;
      ((PasswordSpecification.zzb)localObject1).<init>("count must be at least 1");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = zzq(paramString, "requiredChars");
    Object localObject2 = this.zzWo;
    localObject1 = PasswordSpecification.zzc((Collection)localObject1);
    ((List)localObject2).add(localObject1);
    localObject1 = this.zzWp;
    localObject2 = Integer.valueOf(paramInt);
    ((List)localObject1).add(localObject2);
    return this;
  }
  
  public zza zzh(int paramInt1, int paramInt2)
  {
    int i = 1;
    PasswordSpecification.zzb localzzb;
    if (paramInt1 < i)
    {
      localzzb = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zzb;
      localzzb.<init>("minimumSize must be at least 1");
      throw localzzb;
    }
    if (paramInt1 > paramInt2)
    {
      localzzb = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zzb;
      localzzb.<init>("maximumSize must be greater than or equal to minimumSize");
      throw localzzb;
    }
    this.zzWq = paramInt1;
    this.zzWr = paramInt2;
    return this;
  }
  
  public PasswordSpecification zzmA()
  {
    Object localObject = this.zzWt;
    boolean bool = ((TreeSet)localObject).isEmpty();
    if (bool)
    {
      localObject = new com/google/android/gms/auth/api/credentials/PasswordSpecification$zzb;
      ((PasswordSpecification.zzb)localObject).<init>("no allowed characters specified");
      throw ((Throwable)localObject);
    }
    zzmB();
    zzmC();
    localObject = new com/google/android/gms/auth/api/credentials/PasswordSpecification;
    String str = PasswordSpecification.zzc(this.zzWt);
    List localList1 = this.zzWo;
    List localList2 = this.zzWp;
    int i = this.zzWq;
    int j = this.zzWr;
    ((PasswordSpecification)localObject).<init>(1, str, localList1, localList2, i, j);
    return (PasswordSpecification)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\PasswordSpecification$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */