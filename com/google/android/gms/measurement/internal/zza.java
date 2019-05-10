package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;

class zza
{
  private String zzSF;
  private final zzw zzaTV;
  private final String zzaUa;
  private String zzaVc;
  private String zzaVd;
  private String zzaVe;
  private long zzaVf;
  private long zzaVg;
  private long zzaVh;
  private String zzaVi;
  private long zzaVj;
  private long zzaVk;
  private boolean zzaVl;
  private long zzaVm;
  private long zzaVn;
  private long zzaVo;
  private long zzaVp;
  private boolean zzaVq;
  private long zzaVr;
  private long zzaVs;
  
  zza(zzw paramzzw, String paramString)
  {
    zzx.zzz(paramzzw);
    zzx.zzcM(paramString);
    this.zzaTV = paramzzw;
    this.zzaUa = paramString;
    this.zzaTV.zzjk();
  }
  
  public void setAppVersion(String paramString)
  {
    this.zzaTV.zzjk();
    boolean bool1 = this.zzaVq;
    boolean bool2 = zzaj.zzQ(this.zzSF, paramString);
    bool1 |= bool2;
    this.zzaVq = bool1;
    this.zzSF = paramString;
  }
  
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    boolean bool2 = this.zzaVl;
    if (bool2 != paramBoolean) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVl = paramBoolean;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public boolean zzAr()
  {
    this.zzaTV.zzjk();
    return this.zzaVl;
  }
  
  public void zzBi()
  {
    this.zzaTV.zzjk();
    this.zzaVq = false;
  }
  
  public String zzBj()
  {
    this.zzaTV.zzjk();
    return this.zzaVc;
  }
  
  public String zzBk()
  {
    this.zzaTV.zzjk();
    return this.zzaVd;
  }
  
  public String zzBl()
  {
    this.zzaTV.zzjk();
    return this.zzaVe;
  }
  
  public long zzBm()
  {
    this.zzaTV.zzjk();
    return this.zzaVg;
  }
  
  public long zzBn()
  {
    this.zzaTV.zzjk();
    return this.zzaVh;
  }
  
  public String zzBo()
  {
    this.zzaTV.zzjk();
    return this.zzaVi;
  }
  
  public long zzBp()
  {
    this.zzaTV.zzjk();
    return this.zzaVj;
  }
  
  public long zzBq()
  {
    this.zzaTV.zzjk();
    return this.zzaVk;
  }
  
  public long zzBr()
  {
    this.zzaTV.zzjk();
    return this.zzaVf;
  }
  
  public long zzBs()
  {
    this.zzaTV.zzjk();
    return this.zzaVr;
  }
  
  public long zzBt()
  {
    this.zzaTV.zzjk();
    return this.zzaVs;
  }
  
  public void zzBu()
  {
    Object localObject = this.zzaTV;
    ((zzw)localObject).zzjk();
    long l1 = this.zzaVf + 1L;
    long l2 = 2147483647L;
    boolean bool = l1 < l2;
    if (bool)
    {
      localObject = this.zzaTV.zzAo().zzCF();
      String str = "Bundle index overflow";
      ((zzp.zza)localObject).zzfg(str);
      l1 = 0L;
    }
    this.zzaVq = true;
    this.zzaVf = l1;
  }
  
  public long zzBv()
  {
    this.zzaTV.zzjk();
    return this.zzaVm;
  }
  
  public long zzBw()
  {
    this.zzaTV.zzjk();
    return this.zzaVn;
  }
  
  public long zzBx()
  {
    this.zzaTV.zzjk();
    return this.zzaVo;
  }
  
  public long zzBy()
  {
    this.zzaTV.zzjk();
    return this.zzaVp;
  }
  
  public void zzO(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVg;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVg = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzP(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVh;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVh = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzQ(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVj;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVj = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzR(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVk;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVk = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzS(long paramLong)
  {
    boolean bool1 = true;
    long l = 0L;
    boolean bool2 = paramLong < l;
    zzw localzzw;
    if (!bool2)
    {
      bool2 = bool1;
      zzx.zzac(bool2);
      localzzw = this.zzaTV;
      localzzw.zzjk();
      bool2 = this.zzaVq;
      l = this.zzaVf;
      boolean bool3 = l < paramLong;
      if (!bool3) {
        break label85;
      }
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVf = paramLong;
      return;
      bool2 = false;
      localzzw = null;
      break;
      label85:
      bool1 = false;
    }
  }
  
  public void zzT(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVr;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVr = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzU(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVs;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVs = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzV(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVm;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVm = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzW(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVn;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVn = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzX(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVo;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVo = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzY(long paramLong)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = this.zzaVq;
    long l = this.zzaVp;
    boolean bool2 = l < paramLong;
    if (bool2) {
      bool2 = true;
    }
    for (;;)
    {
      bool2 |= bool1;
      this.zzaVq = bool2;
      this.zzaVp = paramLong;
      return;
      bool2 = false;
      localzzw = null;
    }
  }
  
  public void zzeM(String paramString)
  {
    this.zzaTV.zzjk();
    boolean bool1 = this.zzaVq;
    boolean bool2 = zzaj.zzQ(this.zzaVc, paramString);
    bool1 |= bool2;
    this.zzaVq = bool1;
    this.zzaVc = paramString;
  }
  
  public void zzeN(String paramString)
  {
    zzw localzzw = this.zzaTV;
    localzzw.zzjk();
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1) {
      paramString = null;
    }
    bool1 = this.zzaVq;
    boolean bool2 = zzaj.zzQ(this.zzaVd, paramString);
    bool1 |= bool2;
    this.zzaVq = bool1;
    this.zzaVd = paramString;
  }
  
  public void zzeO(String paramString)
  {
    this.zzaTV.zzjk();
    boolean bool1 = this.zzaVq;
    boolean bool2 = zzaj.zzQ(this.zzaVe, paramString);
    bool1 |= bool2;
    this.zzaVq = bool1;
    this.zzaVe = paramString;
  }
  
  public void zzeP(String paramString)
  {
    this.zzaTV.zzjk();
    boolean bool1 = this.zzaVq;
    boolean bool2 = zzaj.zzQ(this.zzaVi, paramString);
    bool1 |= bool2;
    this.zzaVq = bool1;
    this.zzaVi = paramString;
  }
  
  public String zzli()
  {
    this.zzaTV.zzjk();
    return this.zzSF;
  }
  
  public String zzwK()
  {
    this.zzaTV.zzjk();
    return this.zzaUa;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */