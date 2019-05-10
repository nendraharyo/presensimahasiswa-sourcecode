package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzpz.zzd;

class zzs
{
  final boolean zzaWY;
  final int zzaWZ;
  long zzaXa;
  float zzaXb;
  long zzaXc;
  float zzaXd;
  long zzaXe;
  float zzaXf;
  final boolean zzaXg;
  
  public zzs(zzpz.zzd paramzzd)
  {
    zzx.zzz(paramzzd);
    Object localObject1 = paramzzd.zzaZF;
    int m;
    if (localObject1 != null)
    {
      localObject1 = paramzzd.zzaZF;
      m = ((Integer)localObject1).intValue();
      if (m != 0) {}
    }
    else
    {
      m = 0;
      localObject1 = null;
    }
    for (;;)
    {
      label101:
      Object localObject2;
      int k;
      if (m != 0)
      {
        int n = paramzzd.zzaZF.intValue();
        this.zzaWZ = n;
        Boolean localBoolean = paramzzd.zzaZG;
        if (localBoolean != null)
        {
          localBoolean = paramzzd.zzaZG;
          boolean bool = localBoolean.booleanValue();
          if (bool)
          {
            this.zzaWY = j;
            localObject2 = paramzzd.zzaZF;
            j = ((Integer)localObject2).intValue();
            if (j != i) {
              break label291;
            }
            k = this.zzaWY;
            if (k == 0) {
              break label254;
            }
            f = Float.parseFloat(paramzzd.zzaZI);
            this.zzaXd = f;
            localObject2 = paramzzd.zzaZJ;
            f = Float.parseFloat((String)localObject2);
            this.zzaXf = f;
          }
        }
      }
      for (;;)
      {
        this.zzaXg = m;
        return;
        localObject1 = paramzzd.zzaZF;
        m = ((Integer)localObject1).intValue();
        if (m != i)
        {
          localObject1 = paramzzd.zzaZH;
          if (localObject1 != null) {
            break label357;
          }
          m = 0;
          localObject1 = null;
          break;
        }
        localObject1 = paramzzd.zzaZI;
        if (localObject1 != null)
        {
          localObject1 = paramzzd.zzaZJ;
          if (localObject1 != null) {
            break label357;
          }
        }
        m = 0;
        localObject1 = null;
        break;
        k = 0;
        localObject2 = null;
        f = 0.0F;
        break label101;
        label254:
        long l = Long.parseLong(paramzzd.zzaZI);
        this.zzaXc = l;
        localObject2 = paramzzd.zzaZJ;
        l = Long.parseLong((String)localObject2);
        this.zzaXe = l;
        continue;
        label291:
        k = this.zzaWY;
        if (k != 0)
        {
          localObject2 = paramzzd.zzaZH;
          f = Float.parseFloat((String)localObject2);
          this.zzaXb = f;
        }
        else
        {
          localObject2 = paramzzd.zzaZH;
          l = Long.parseLong((String)localObject2);
          this.zzaXa = l;
          continue;
          this.zzaWZ = 0;
          this.zzaWY = false;
        }
      }
      label357:
      m = k;
    }
  }
  
  public Boolean zzac(long paramLong)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    boolean bool3 = this.zzaXg;
    Boolean localBoolean;
    if (!bool3)
    {
      bool2 = false;
      localBoolean = null;
    }
    for (;;)
    {
      return localBoolean;
      bool3 = this.zzaWY;
      if (bool3)
      {
        bool2 = false;
        localBoolean = null;
      }
      else
      {
        int i = this.zzaWZ;
        switch (i)
        {
        default: 
          bool2 = false;
          localBoolean = null;
        }
      }
    }
    long l = this.zzaXa;
    bool1 = paramLong < l;
    if (bool1) {}
    for (;;)
    {
      localBoolean = Boolean.valueOf(bool2);
      break;
      bool2 = false;
      localBoolean = null;
    }
    l = this.zzaXa;
    bool1 = paramLong < l;
    if (bool1) {}
    for (;;)
    {
      localBoolean = Boolean.valueOf(bool2);
      break;
      bool2 = false;
      localBoolean = null;
    }
    l = this.zzaXa;
    bool1 = paramLong < l;
    if (!bool1) {}
    for (;;)
    {
      localBoolean = Boolean.valueOf(bool2);
      break;
      bool2 = false;
      localBoolean = null;
    }
    l = this.zzaXc;
    bool1 = paramLong < l;
    if (!bool1)
    {
      l = this.zzaXe;
      bool1 = paramLong < l;
      if (bool1) {}
    }
    for (;;)
    {
      localBoolean = Boolean.valueOf(bool2);
      break;
      bool2 = false;
      localBoolean = null;
    }
  }
  
  public Boolean zzi(float paramFloat)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    boolean bool2 = true;
    boolean bool3 = false;
    boolean bool4 = this.zzaXg;
    Boolean localBoolean;
    if (!bool4)
    {
      bool2 = false;
      localBoolean = null;
    }
    for (;;)
    {
      return localBoolean;
      bool4 = this.zzaWY;
      if (!bool4)
      {
        bool2 = false;
        localBoolean = null;
      }
      else
      {
        int i = this.zzaWZ;
        switch (i)
        {
        default: 
          bool2 = false;
          localBoolean = null;
          break;
        case 1: 
          f1 = this.zzaXb;
          bool1 = paramFloat < f1;
          if (bool1) {}
          for (;;)
          {
            localBoolean = Boolean.valueOf(bool2);
            break;
            bool2 = false;
            localBoolean = null;
          }
        case 2: 
          f1 = this.zzaXb;
          bool1 = paramFloat < f1;
          if (bool1) {}
          for (;;)
          {
            localBoolean = Boolean.valueOf(bool2);
            break;
            bool2 = false;
            localBoolean = null;
          }
        case 3: 
          f1 = this.zzaXb;
          bool1 = paramFloat < f1;
          if (bool1)
          {
            f1 = this.zzaXb;
            f1 = Math.abs(paramFloat - f1);
            i = 1073741824;
            float f2 = Math.ulp(paramFloat);
            float f3 = Math.ulp(this.zzaXb);
            f2 = Math.max(f2, f3);
            float f4 = 2.0F * f2;
            bool1 = f1 < f4;
            if (!bool1) {}
          }
          else
          {
            bool3 = bool2;
          }
          localBoolean = Boolean.valueOf(bool3);
        }
      }
    }
    f1 = this.zzaXd;
    bool1 = paramFloat < f1;
    if (!bool1)
    {
      f1 = this.zzaXf;
      bool1 = paramFloat < f1;
      if (bool1) {}
    }
    for (;;)
    {
      localBoolean = Boolean.valueOf(bool2);
      break;
      bool2 = false;
      localBoolean = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */