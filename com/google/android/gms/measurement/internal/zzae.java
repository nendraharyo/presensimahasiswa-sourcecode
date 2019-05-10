package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzpz.zzf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class zzae
{
  final boolean zzaXg;
  final int zzaZh;
  final boolean zzaZi;
  final String zzaZj;
  final List zzaZk;
  final String zzaZl;
  
  public zzae(zzpz.zzf paramzzf)
  {
    zzx.zzz(paramzzf);
    Object localObject2 = paramzzf.zzaZN;
    int m;
    if (localObject2 != null)
    {
      localObject2 = paramzzf.zzaZN;
      m = ((Integer)localObject2).intValue();
      if (m != 0) {}
    }
    else
    {
      m = 0;
      localObject2 = null;
    }
    for (;;)
    {
      Object localObject3;
      boolean bool2;
      if (m != 0)
      {
        int n = paramzzf.zzaZN.intValue();
        this.zzaZh = n;
        localObject3 = paramzzf.zzaZP;
        if (localObject3 != null)
        {
          localObject3 = paramzzf.zzaZP;
          bool2 = ((Boolean)localObject3).booleanValue();
          if (bool2) {
            bool1 = j;
          }
        }
        this.zzaZi = bool1;
        bool1 = this.zzaZi;
        int k;
        if (!bool1)
        {
          k = this.zzaZh;
          if (k != j)
          {
            k = this.zzaZh;
            if (k != i) {
              break label289;
            }
          }
        }
        localObject1 = paramzzf.zzaZO;
        this.zzaZj = ((String)localObject1);
        label160:
        localObject1 = paramzzf.zzaZQ;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
          label177:
          this.zzaZk = ((List)localObject1);
          k = this.zzaZh;
          if (k != j) {
            break label343;
          }
          localObject1 = this.zzaZj;
          this.zzaZl = ((String)localObject1);
        }
      }
      for (;;)
      {
        this.zzaXg = m;
        return;
        localObject2 = paramzzf.zzaZN;
        m = ((Integer)localObject2).intValue();
        if (m == i)
        {
          localObject2 = paramzzf.zzaZQ;
          if (localObject2 != null)
          {
            localObject2 = paramzzf.zzaZQ;
            m = localObject2.length;
            if (m != 0) {
              break label379;
            }
          }
          m = 0;
          localObject2 = null;
          break;
        }
        localObject2 = paramzzf.zzaZO;
        if (localObject2 != null) {
          break label379;
        }
        m = 0;
        localObject2 = null;
        break;
        label289:
        localObject1 = paramzzf.zzaZO;
        localObject3 = Locale.ENGLISH;
        localObject1 = ((String)localObject1).toUpperCase((Locale)localObject3);
        this.zzaZj = ((String)localObject1);
        break label160;
        localObject1 = paramzzf.zzaZQ;
        bool2 = this.zzaZi;
        localObject1 = zza((String[])localObject1, bool2);
        break label177;
        label343:
        this.zzaZl = null;
        continue;
        this.zzaZh = 0;
        this.zzaZi = false;
        this.zzaZj = null;
        this.zzaZk = null;
        this.zzaZl = null;
      }
      label379:
      m = j;
    }
  }
  
  private List zza(String[] paramArrayOfString, boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      localObject = Arrays.asList(paramArrayOfString);
    }
    for (;;)
    {
      return (List)localObject;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      int i = paramArrayOfString.length;
      int j = 0;
      while (j < i)
      {
        String str = paramArrayOfString[j];
        Locale localLocale = Locale.ENGLISH;
        str = str.toUpperCase(localLocale);
        ((List)localObject).add(str);
        j += 1;
      }
    }
  }
  
  public Boolean zzfp(String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool3 = this.zzaXg;
    if (!bool3) {}
    for (;;)
    {
      return (Boolean)localObject1;
      bool3 = this.zzaZi;
      int k;
      if (!bool3)
      {
        k = this.zzaZh;
        int m = 1;
        if (k != m) {}
      }
      else
      {
        label44:
        k = this.zzaZh;
      }
      boolean bool2;
      switch (k)
      {
      default: 
        break;
      case 1: 
        i = this.zzaZi;
        if (i != 0)
        {
          i = 0;
          localObject1 = null;
        }
        for (;;)
        {
          Object localObject2 = this.zzaZl;
          boolean bool1 = Pattern.compile((String)localObject2, i).matcher(paramString).matches();
          localObject1 = Boolean.valueOf(bool1);
          break;
          localObject2 = Locale.ENGLISH;
          paramString = paramString.toUpperCase((Locale)localObject2);
          break label44;
          int j = 66;
        }
      case 2: 
        localObject1 = this.zzaZj;
        bool2 = paramString.startsWith((String)localObject1);
        localObject1 = Boolean.valueOf(bool2);
        break;
      case 3: 
        localObject1 = this.zzaZj;
        bool2 = paramString.endsWith((String)localObject1);
        localObject1 = Boolean.valueOf(bool2);
        break;
      case 4: 
        localObject1 = this.zzaZj;
        bool2 = paramString.contains((CharSequence)localObject1);
        localObject1 = Boolean.valueOf(bool2);
        break;
      case 5: 
        localObject1 = this.zzaZj;
        bool2 = paramString.equals(localObject1);
        localObject1 = Boolean.valueOf(bool2);
        break;
      case 6: 
        bool2 = this.zzaZk.contains(paramString);
        localObject1 = Boolean.valueOf(bool2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */