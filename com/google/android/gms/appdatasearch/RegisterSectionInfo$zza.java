package com.google.android.gms.appdatasearch;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public final class RegisterSectionInfo$zza
{
  private final String mName;
  private String zzUk;
  private boolean zzUl;
  private int zzUm;
  private boolean zzUn;
  private String zzUo;
  private final List zzUp;
  private BitSet zzUq;
  private String zzUr;
  
  public RegisterSectionInfo$zza(String paramString)
  {
    this.mName = paramString;
    this.zzUm = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzUp = localArrayList;
  }
  
  public zza zzM(boolean paramBoolean)
  {
    this.zzUl = paramBoolean;
    return this;
  }
  
  public zza zzN(boolean paramBoolean)
  {
    this.zzUn = paramBoolean;
    return this;
  }
  
  public zza zzap(int paramInt)
  {
    BitSet localBitSet = this.zzUq;
    if (localBitSet == null)
    {
      localBitSet = new java/util/BitSet;
      localBitSet.<init>();
      this.zzUq = localBitSet;
    }
    this.zzUq.set(paramInt);
    return this;
  }
  
  public zza zzbB(String paramString)
  {
    this.zzUk = paramString;
    return this;
  }
  
  public zza zzbC(String paramString)
  {
    this.zzUr = paramString;
    return this;
  }
  
  public RegisterSectionInfo zzmh()
  {
    int i = 0;
    Object localObject1 = null;
    int[] arrayOfInt = null;
    Object localObject2 = this.zzUq;
    if (localObject2 != null)
    {
      arrayOfInt = new int[this.zzUq.cardinality()];
      localObject2 = this.zzUq;
      int j = ((BitSet)localObject2).nextSetBit(0);
      while (j >= 0)
      {
        int k = i + 1;
        arrayOfInt[i] = j;
        localObject1 = this.zzUq;
        j += 1;
        j = ((BitSet)localObject1).nextSetBit(j);
        i = k;
      }
    }
    localObject2 = new com/google/android/gms/appdatasearch/RegisterSectionInfo;
    localObject1 = this.mName;
    String str1 = this.zzUk;
    boolean bool1 = this.zzUl;
    int m = this.zzUm;
    boolean bool2 = this.zzUn;
    String str2 = this.zzUo;
    Object localObject3 = this.zzUp;
    Object localObject4 = new Feature[this.zzUp.size()];
    localObject3 = (Feature[])((List)localObject3).toArray((Object[])localObject4);
    localObject4 = this.zzUr;
    ((RegisterSectionInfo)localObject2).<init>((String)localObject1, str1, bool1, m, bool2, str2, (Feature[])localObject3, arrayOfInt, (String)localObject4);
    return (RegisterSectionInfo)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\RegisterSectionInfo$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */