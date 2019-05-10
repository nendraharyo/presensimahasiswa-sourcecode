package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

public class zzbc
{
  private final Object zzpV;
  private final int zzsK;
  private final int zzsL;
  private final int zzsM;
  private final zzbh zzsN;
  private ArrayList zzsO;
  private ArrayList zzsP;
  private int zzsQ;
  private int zzsR;
  private int zzsS;
  private int zzsT;
  private String zzsU;
  private String zzsV;
  
  public zzbc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzsO = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzsP = ((ArrayList)localObject);
    this.zzsQ = 0;
    this.zzsR = 0;
    this.zzsS = 0;
    this.zzsU = "";
    this.zzsV = "";
    this.zzsK = paramInt1;
    this.zzsL = paramInt2;
    this.zzsM = paramInt3;
    localObject = new com/google/android/gms/internal/zzbh;
    ((zzbh)localObject).<init>(paramInt4);
    this.zzsN = ((zzbh)localObject);
  }
  
  private String zza(ArrayList paramArrayList, int paramInt)
  {
    boolean bool = paramArrayList.isEmpty();
    String str;
    if (bool) {
      str = "";
    }
    for (;;)
    {
      return str;
      StringBuffer localStringBuffer = new java/lang/StringBuffer;
      localStringBuffer.<init>();
      Iterator localIterator = paramArrayList.iterator();
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        str = (String)localIterator.next();
        localStringBuffer.append(str);
        localStringBuffer.append(' ');
        i = localStringBuffer.length();
      } while (i <= paramInt);
      int i = localStringBuffer.length() + -1;
      localStringBuffer.deleteCharAt(i);
      str = localStringBuffer.toString();
      int j = str.length();
      if (j >= paramInt)
      {
        j = 0;
        localStringBuffer = null;
        str = str.substring(0, paramInt);
      }
    }
  }
  
  private void zze(String paramString, boolean paramBoolean)
  {
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      int j = this.zzsM;
      if (i >= j) {
        break label22;
      }
    }
    for (;;)
    {
      return;
      label22:
      synchronized (this.zzpV)
      {
        ArrayList localArrayList = this.zzsO;
        localArrayList.add(paramString);
        i = this.zzsQ;
        int k = paramString.length();
        i += k;
        this.zzsQ = i;
        if (paramBoolean)
        {
          localArrayList = this.zzsP;
          localArrayList.add(paramString);
        }
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = paramObject instanceof zzbc;
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      if (paramObject == this)
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (zzbc)paramObject;
        String str1 = ((zzbc)paramObject).zzcy();
        if (str1 != null)
        {
          str1 = ((zzbc)paramObject).zzcy();
          String str2 = zzcy();
          bool3 = str1.equals(str2);
          if (bool3) {
            bool2 = bool1;
          }
        }
      }
    }
  }
  
  public int getScore()
  {
    return this.zzsT;
  }
  
  public int hashCode()
  {
    return zzcy().hashCode();
  }
  
  public String toString()
  {
    int i = 100;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ActivityContent fetchId: ");
    int j = this.zzsR;
    localStringBuilder = localStringBuilder.append(j).append(" score:");
    j = this.zzsT;
    localStringBuilder = localStringBuilder.append(j).append(" total_length:");
    j = this.zzsQ;
    localStringBuilder = localStringBuilder.append(j).append("\n text: ");
    Object localObject = this.zzsO;
    localObject = zza((ArrayList)localObject, i);
    localStringBuilder = localStringBuilder.append((String)localObject).append("\n viewableText");
    localObject = this.zzsP;
    localObject = zza((ArrayList)localObject, i);
    localStringBuilder = localStringBuilder.append((String)localObject).append("\n signture: ");
    localObject = this.zzsU;
    localStringBuilder = localStringBuilder.append((String)localObject).append("\n viewableSignture: ");
    localObject = this.zzsV;
    return (String)localObject;
  }
  
  int zzb(int paramInt1, int paramInt2)
  {
    int i = this.zzsK * paramInt1;
    int j = this.zzsL * paramInt2;
    return i + j;
  }
  
  public void zzc(String paramString, boolean paramBoolean)
  {
    zze(paramString, paramBoolean);
    synchronized (this.zzpV)
    {
      int i = this.zzsS;
      if (i < 0)
      {
        String str = "ActivityContent: negative number of WebViews.";
        zzin.zzaI(str);
      }
      zzcD();
      return;
    }
  }
  
  public void zzcA()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzsT + -100;
      this.zzsT = i;
      return;
    }
  }
  
  public void zzcB()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzsS + -1;
      this.zzsS = i;
      return;
    }
  }
  
  public void zzcC()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzsS + 1;
      this.zzsS = i;
      return;
    }
  }
  
  public void zzcD()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzsQ;
      int j = this.zzsR;
      i = zzb(i, j);
      j = this.zzsT;
      if (i > j)
      {
        this.zzsT = i;
        Object localObject2 = this.zzsN;
        ArrayList localArrayList = this.zzsO;
        localObject2 = ((zzbh)localObject2).zza(localArrayList);
        this.zzsU = ((String)localObject2);
        localObject2 = this.zzsN;
        localArrayList = this.zzsP;
        localObject2 = ((zzbh)localObject2).zza(localArrayList);
        this.zzsV = ((String)localObject2);
      }
      return;
    }
  }
  
  int zzcE()
  {
    return this.zzsQ;
  }
  
  public boolean zzcx()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzsS;
      if (i == 0)
      {
        i = 1;
        return i;
      }
      int j = 0;
      Object localObject2 = null;
    }
  }
  
  public String zzcy()
  {
    return this.zzsU;
  }
  
  public String zzcz()
  {
    return this.zzsV;
  }
  
  public void zzd(String paramString, boolean paramBoolean)
  {
    zze(paramString, paramBoolean);
  }
  
  public void zzh(int paramInt)
  {
    this.zzsR = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */