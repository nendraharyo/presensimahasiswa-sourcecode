package com.google.android.gms.internal;

public final class zzqb$zze
  extends zzsu
{
  private static volatile zze[] zzbak;
  public String appId;
  public String osVersion;
  public String zzaMV;
  public String zzaVt;
  public String zzaVu;
  public String zzaVx;
  public Boolean zzbaA;
  public String zzbaB;
  public Long zzbaC;
  public Integer zzbaD;
  public Boolean zzbaE;
  public zzqb.zza[] zzbaF;
  public Integer zzbal;
  public zzqb.zzb[] zzbam;
  public zzqb.zzg[] zzban;
  public Long zzbao;
  public Long zzbap;
  public Long zzbaq;
  public Long zzbar;
  public Long zzbas;
  public String zzbat;
  public String zzbau;
  public String zzbav;
  public Integer zzbaw;
  public Long zzbax;
  public Long zzbay;
  public String zzbaz;
  
  public zzqb$zze()
  {
    zzDX();
  }
  
  public static zze[] zzDW()
  {
    zze[] arrayOfzze = zzbak;
    if (arrayOfzze == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzze = zzbak;
      if (arrayOfzze == null)
      {
        arrayOfzze = null;
        arrayOfzze = new zze[0];
        zzbak = arrayOfzze;
      }
      return zzbak;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zze;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zze)paramObject;
        Object localObject1 = this.zzbal;
        if (localObject1 == null)
        {
          localObject1 = ((zze)paramObject).zzbal;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbal;
          localObject2 = ((zze)paramObject).zzbal;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzbam;
        Object localObject2 = ((zze)paramObject).zzbam;
        bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          localObject1 = this.zzban;
          localObject2 = ((zze)paramObject).zzban;
          bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
          if (!bool2)
          {
            bool1 = false;
          }
          else
          {
            localObject1 = this.zzbao;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbao;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbao;
              localObject2 = ((zze)paramObject).zzbao;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbap;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbap;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbap;
              localObject2 = ((zze)paramObject).zzbap;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaq;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbaq;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbaq;
              localObject2 = ((zze)paramObject).zzbaq;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbar;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbar;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbar;
              localObject2 = ((zze)paramObject).zzbar;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbas;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbas;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbas;
              localObject2 = ((zze)paramObject).zzbas;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbat;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbat;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbat;
              localObject2 = ((zze)paramObject).zzbat;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.osVersion;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).osVersion;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.osVersion;
              localObject2 = ((zze)paramObject).osVersion;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbau;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbau;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbau;
              localObject2 = ((zze)paramObject).zzbau;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbav;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbav;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbav;
              localObject2 = ((zze)paramObject).zzbav;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaw;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbaw;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbaw;
              localObject2 = ((zze)paramObject).zzbaw;
              bool2 = ((Integer)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzaVu;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzaVu;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzaVu;
              localObject2 = ((zze)paramObject).zzaVu;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.appId;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).appId;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.appId;
              localObject2 = ((zze)paramObject).appId;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzaMV;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzaMV;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzaMV;
              localObject2 = ((zze)paramObject).zzaMV;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbax;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbax;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbax;
              localObject2 = ((zze)paramObject).zzbax;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbay;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbay;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbay;
              localObject2 = ((zze)paramObject).zzbay;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaz;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbaz;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbaz;
              localObject2 = ((zze)paramObject).zzbaz;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaA;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbaA;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbaA;
              localObject2 = ((zze)paramObject).zzbaA;
              bool2 = ((Boolean)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaB;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbaB;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbaB;
              localObject2 = ((zze)paramObject).zzbaB;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaC;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbaC;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbaC;
              localObject2 = ((zze)paramObject).zzbaC;
              bool2 = ((Long)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaD;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbaD;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbaD;
              localObject2 = ((zze)paramObject).zzbaD;
              bool2 = ((Integer)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzaVx;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzaVx;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzaVx;
              localObject2 = ((zze)paramObject).zzaVx;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzaVt;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzaVt;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzaVt;
              localObject2 = ((zze)paramObject).zzaVt;
              bool2 = ((String)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaE;
            if (localObject1 == null)
            {
              localObject1 = ((zze)paramObject).zzbaE;
              if (localObject1 != null) {
                bool1 = false;
              }
            }
            else
            {
              localObject1 = this.zzbaE;
              localObject2 = ((zze)paramObject).zzbaE;
              bool2 = ((Boolean)localObject1).equals(localObject2);
              if (!bool2)
              {
                bool1 = false;
                continue;
              }
            }
            localObject1 = this.zzbaF;
            localObject2 = ((zze)paramObject).zzbaF;
            bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    Boolean localBoolean = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject1 = this.zzbal;
    if (localObject1 == null)
    {
      j = 0;
      localObject1 = null;
      j = (j + k) * 31;
      k = zzss.hashCode(this.zzbam);
      j = (j + k) * 31;
      Object localObject2 = this.zzban;
      k = zzss.hashCode((Object[])localObject2);
      j += k;
      k = j * 31;
      localObject1 = this.zzbao;
      if (localObject1 != null) {
        break label726;
      }
      j = 0;
      localObject1 = null;
      label106:
      j += k;
      k = j * 31;
      localObject1 = this.zzbap;
      if (localObject1 != null) {
        break label741;
      }
      j = 0;
      localObject1 = null;
      label133:
      j += k;
      k = j * 31;
      localObject1 = this.zzbaq;
      if (localObject1 != null) {
        break label756;
      }
      j = 0;
      localObject1 = null;
      label160:
      j += k;
      k = j * 31;
      localObject1 = this.zzbar;
      if (localObject1 != null) {
        break label771;
      }
      j = 0;
      localObject1 = null;
      label187:
      j += k;
      k = j * 31;
      localObject1 = this.zzbas;
      if (localObject1 != null) {
        break label786;
      }
      j = 0;
      localObject1 = null;
      label214:
      j += k;
      k = j * 31;
      localObject1 = this.zzbat;
      if (localObject1 != null) {
        break label801;
      }
      j = 0;
      localObject1 = null;
      label241:
      j += k;
      k = j * 31;
      localObject1 = this.osVersion;
      if (localObject1 != null) {
        break label816;
      }
      j = 0;
      localObject1 = null;
      label268:
      j += k;
      k = j * 31;
      localObject1 = this.zzbau;
      if (localObject1 != null) {
        break label831;
      }
      j = 0;
      localObject1 = null;
      label295:
      j += k;
      k = j * 31;
      localObject1 = this.zzbav;
      if (localObject1 != null) {
        break label846;
      }
      j = 0;
      localObject1 = null;
      label322:
      j += k;
      k = j * 31;
      localObject1 = this.zzbaw;
      if (localObject1 != null) {
        break label861;
      }
      j = 0;
      localObject1 = null;
      label349:
      j += k;
      k = j * 31;
      localObject1 = this.zzaVu;
      if (localObject1 != null) {
        break label876;
      }
      j = 0;
      localObject1 = null;
      label376:
      j += k;
      k = j * 31;
      localObject1 = this.appId;
      if (localObject1 != null) {
        break label891;
      }
      j = 0;
      localObject1 = null;
      label403:
      j += k;
      k = j * 31;
      localObject1 = this.zzaMV;
      if (localObject1 != null) {
        break label906;
      }
      j = 0;
      localObject1 = null;
      label430:
      j += k;
      k = j * 31;
      localObject1 = this.zzbax;
      if (localObject1 != null) {
        break label921;
      }
      j = 0;
      localObject1 = null;
      label457:
      j += k;
      k = j * 31;
      localObject1 = this.zzbay;
      if (localObject1 != null) {
        break label936;
      }
      j = 0;
      localObject1 = null;
      label484:
      j += k;
      k = j * 31;
      localObject1 = this.zzbaz;
      if (localObject1 != null) {
        break label951;
      }
      j = 0;
      localObject1 = null;
      label511:
      j += k;
      k = j * 31;
      localObject1 = this.zzbaA;
      if (localObject1 != null) {
        break label966;
      }
      j = 0;
      localObject1 = null;
      label538:
      j += k;
      k = j * 31;
      localObject1 = this.zzbaB;
      if (localObject1 != null) {
        break label981;
      }
      j = 0;
      localObject1 = null;
      label565:
      j += k;
      k = j * 31;
      localObject1 = this.zzbaC;
      if (localObject1 != null) {
        break label996;
      }
      j = 0;
      localObject1 = null;
      label592:
      j += k;
      k = j * 31;
      localObject1 = this.zzbaD;
      if (localObject1 != null) {
        break label1011;
      }
      j = 0;
      localObject1 = null;
      label619:
      j += k;
      k = j * 31;
      localObject1 = this.zzaVx;
      if (localObject1 != null) {
        break label1026;
      }
      j = 0;
      localObject1 = null;
      label646:
      j += k;
      k = j * 31;
      localObject1 = this.zzaVt;
      if (localObject1 != null) {
        break label1041;
      }
      j = 0;
      localObject1 = null;
      label673:
      j = (j + k) * 31;
      localObject2 = this.zzbaE;
      if (localObject2 != null) {
        break label1056;
      }
    }
    for (;;)
    {
      j = (j + i) * 31;
      i = zzss.hashCode(this.zzbaF);
      return j + i;
      localObject1 = this.zzbal;
      j = ((Integer)localObject1).hashCode();
      break;
      label726:
      localObject1 = this.zzbao;
      j = ((Long)localObject1).hashCode();
      break label106;
      label741:
      localObject1 = this.zzbap;
      j = ((Long)localObject1).hashCode();
      break label133;
      label756:
      localObject1 = this.zzbaq;
      j = ((Long)localObject1).hashCode();
      break label160;
      label771:
      localObject1 = this.zzbar;
      j = ((Long)localObject1).hashCode();
      break label187;
      label786:
      localObject1 = this.zzbas;
      j = ((Long)localObject1).hashCode();
      break label214;
      label801:
      localObject1 = this.zzbat;
      j = ((String)localObject1).hashCode();
      break label241;
      label816:
      localObject1 = this.osVersion;
      j = ((String)localObject1).hashCode();
      break label268;
      label831:
      localObject1 = this.zzbau;
      j = ((String)localObject1).hashCode();
      break label295;
      label846:
      localObject1 = this.zzbav;
      j = ((String)localObject1).hashCode();
      break label322;
      label861:
      localObject1 = this.zzbaw;
      j = ((Integer)localObject1).hashCode();
      break label349;
      label876:
      localObject1 = this.zzaVu;
      j = ((String)localObject1).hashCode();
      break label376;
      label891:
      localObject1 = this.appId;
      j = ((String)localObject1).hashCode();
      break label403;
      label906:
      localObject1 = this.zzaMV;
      j = ((String)localObject1).hashCode();
      break label430;
      label921:
      localObject1 = this.zzbax;
      j = ((Long)localObject1).hashCode();
      break label457;
      label936:
      localObject1 = this.zzbay;
      j = ((Long)localObject1).hashCode();
      break label484;
      label951:
      localObject1 = this.zzbaz;
      j = ((String)localObject1).hashCode();
      break label511;
      label966:
      localObject1 = this.zzbaA;
      j = ((Boolean)localObject1).hashCode();
      break label538;
      label981:
      localObject1 = this.zzbaB;
      j = ((String)localObject1).hashCode();
      break label565;
      label996:
      localObject1 = this.zzbaC;
      j = ((Long)localObject1).hashCode();
      break label592;
      label1011:
      localObject1 = this.zzbaD;
      j = ((Integer)localObject1).hashCode();
      break label619;
      label1026:
      localObject1 = this.zzaVx;
      j = ((String)localObject1).hashCode();
      break label646;
      label1041:
      localObject1 = this.zzaVt;
      j = ((String)localObject1).hashCode();
      break label673;
      label1056:
      localBoolean = this.zzbaE;
      i = localBoolean.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 0;
    Object localObject1 = this.zzbal;
    int j;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      j = 1;
      localObject2 = this.zzbal;
      k = ((Integer)localObject2).intValue();
      paramzzsn.zzA(j, k);
    }
    localObject1 = this.zzbam;
    int i1;
    if (localObject1 != null)
    {
      localObject1 = this.zzbam;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbam;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzbam[j];
          if (localObject2 != null)
          {
            i1 = 2;
            paramzzsn.zza(i1, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzban;
    if (localObject1 != null)
    {
      localObject1 = this.zzban;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzban;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzban[j];
          if (localObject2 != null)
          {
            i1 = 3;
            paramzzsn.zza(i1, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzbao;
    long l;
    if (localObject1 != null)
    {
      j = 4;
      localObject2 = this.zzbao;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzbap;
    if (localObject1 != null)
    {
      j = 5;
      localObject2 = this.zzbap;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzbaq;
    if (localObject1 != null)
    {
      j = 6;
      localObject2 = this.zzbaq;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzbas;
    if (localObject1 != null)
    {
      j = 7;
      localObject2 = this.zzbas;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzbat;
    if (localObject1 != null)
    {
      j = 8;
      localObject2 = this.zzbat;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.osVersion;
    if (localObject1 != null)
    {
      j = 9;
      localObject2 = this.osVersion;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzbau;
    if (localObject1 != null)
    {
      j = 10;
      localObject2 = this.zzbau;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzbav;
    if (localObject1 != null)
    {
      j = 11;
      localObject2 = this.zzbav;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzbaw;
    if (localObject1 != null)
    {
      j = 12;
      localObject2 = this.zzbaw;
      k = ((Integer)localObject2).intValue();
      paramzzsn.zzA(j, k);
    }
    localObject1 = this.zzaVu;
    if (localObject1 != null)
    {
      j = 13;
      localObject2 = this.zzaVu;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.appId;
    if (localObject1 != null)
    {
      j = 14;
      localObject2 = this.appId;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzaMV;
    if (localObject1 != null)
    {
      j = 16;
      localObject2 = this.zzaMV;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzbax;
    if (localObject1 != null)
    {
      j = 17;
      localObject2 = this.zzbax;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzbay;
    if (localObject1 != null)
    {
      j = 18;
      localObject2 = this.zzbay;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzbaz;
    if (localObject1 != null)
    {
      j = 19;
      localObject2 = this.zzbaz;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzbaA;
    if (localObject1 != null)
    {
      j = 20;
      localObject2 = this.zzbaA;
      boolean bool1 = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(j, bool1);
    }
    localObject1 = this.zzbaB;
    if (localObject1 != null)
    {
      j = 21;
      localObject2 = this.zzbaB;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzbaC;
    if (localObject1 != null)
    {
      j = 22;
      localObject2 = this.zzbaC;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzbaD;
    if (localObject1 != null)
    {
      j = 23;
      localObject2 = this.zzbaD;
      int m = ((Integer)localObject2).intValue();
      paramzzsn.zzA(j, m);
    }
    localObject1 = this.zzaVx;
    if (localObject1 != null)
    {
      j = 24;
      localObject2 = this.zzaVx;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzaVt;
    if (localObject1 != null)
    {
      j = 25;
      localObject2 = this.zzaVt;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzbar;
    if (localObject1 != null)
    {
      j = 26;
      localObject2 = this.zzbar;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzbaE;
    if (localObject1 != null)
    {
      j = 28;
      localObject2 = this.zzbaE;
      boolean bool2 = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(j, bool2);
    }
    localObject1 = this.zzbaF;
    if (localObject1 != null)
    {
      localObject1 = this.zzbaF;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = this.zzbaF;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          localObject1 = this.zzbaF[i];
          if (localObject1 != null)
          {
            int n = 29;
            paramzzsn.zza(n, (zzsu)localObject1);
          }
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zze zzDX()
  {
    this.zzbal = null;
    Object localObject = zzqb.zzb.zzDR();
    this.zzbam = ((zzqb.zzb[])localObject);
    localObject = zzqb.zzg.zzDZ();
    this.zzban = ((zzqb.zzg[])localObject);
    this.zzbao = null;
    this.zzbap = null;
    this.zzbaq = null;
    this.zzbar = null;
    this.zzbas = null;
    this.zzbat = null;
    this.osVersion = null;
    this.zzbau = null;
    this.zzbav = null;
    this.zzbaw = null;
    this.zzaVu = null;
    this.appId = null;
    this.zzaMV = null;
    this.zzbax = null;
    this.zzbay = null;
    this.zzbaz = null;
    this.zzbaA = null;
    this.zzbaB = null;
    this.zzbaC = null;
    this.zzbaD = null;
    this.zzaVx = null;
    this.zzaVt = null;
    this.zzbaE = null;
    localObject = zzqb.zza.zzDP();
    this.zzbaF = ((zzqb.zza[])localObject);
    this.zzbuu = -1;
    return this;
  }
  
  public zze zzG(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject1;
      int n;
      Object localObject2;
      Object localObject3;
      int i1;
      long l;
      switch (i)
      {
      default: 
        boolean bool1 = zzsx.zzb(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = paramzzsm.zzJb();
        localObject1 = Integer.valueOf(j);
        this.zzbal = ((Integer)localObject1);
        break;
      case 18: 
        j = 18;
        n = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbam;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          n += j;
          localObject2 = new zzqb.zzb[n];
          if (j != 0)
          {
            localObject3 = this.zzbam;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            i1 = localObject2.length + -1;
            if (j >= i1) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzqb$zzb;
            ((zzqb.zzb)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbam;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzqb$zzb;
        ((zzqb.zzb)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzbam = ((zzqb.zzb[])localObject2);
        break;
      case 26: 
        j = 26;
        n = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzban;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          n += j;
          localObject2 = new zzqb.zzg[n];
          if (j != 0)
          {
            localObject3 = this.zzban;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            i1 = localObject2.length + -1;
            if (j >= i1) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzqb$zzg;
            ((zzqb.zzg)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzban;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzqb$zzg;
        ((zzqb.zzg)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzban = ((zzqb.zzg[])localObject2);
        break;
      case 32: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbao = ((Long)localObject1);
        break;
      case 40: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbap = ((Long)localObject1);
        break;
      case 48: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbaq = ((Long)localObject1);
        break;
      case 56: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbas = ((Long)localObject1);
        break;
      case 66: 
        localObject1 = paramzzsm.readString();
        this.zzbat = ((String)localObject1);
        break;
      case 74: 
        localObject1 = paramzzsm.readString();
        this.osVersion = ((String)localObject1);
        break;
      case 82: 
        localObject1 = paramzzsm.readString();
        this.zzbau = ((String)localObject1);
        break;
      case 90: 
        localObject1 = paramzzsm.readString();
        this.zzbav = ((String)localObject1);
        break;
      case 96: 
        j = paramzzsm.zzJb();
        localObject1 = Integer.valueOf(j);
        this.zzbaw = ((Integer)localObject1);
        break;
      case 106: 
        localObject1 = paramzzsm.readString();
        this.zzaVu = ((String)localObject1);
        break;
      case 114: 
        localObject1 = paramzzsm.readString();
        this.appId = ((String)localObject1);
        break;
      case 130: 
        localObject1 = paramzzsm.readString();
        this.zzaMV = ((String)localObject1);
        break;
      case 136: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbax = ((Long)localObject1);
        break;
      case 144: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbay = ((Long)localObject1);
        break;
      case 154: 
        localObject1 = paramzzsm.readString();
        this.zzbaz = ((String)localObject1);
        break;
      case 160: 
        boolean bool2 = paramzzsm.zzJc();
        localObject1 = Boolean.valueOf(bool2);
        this.zzbaA = ((Boolean)localObject1);
        break;
      case 170: 
        localObject1 = paramzzsm.readString();
        this.zzbaB = ((String)localObject1);
        break;
      case 176: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbaC = ((Long)localObject1);
        break;
      case 184: 
        int k = paramzzsm.zzJb();
        localObject1 = Integer.valueOf(k);
        this.zzbaD = ((Integer)localObject1);
        break;
      case 194: 
        localObject1 = paramzzsm.readString();
        this.zzaVx = ((String)localObject1);
        break;
      case 202: 
        localObject1 = paramzzsm.readString();
        this.zzaVt = ((String)localObject1);
        break;
      case 208: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbar = ((Long)localObject1);
        break;
      case 224: 
        boolean bool3 = paramzzsm.zzJc();
        localObject1 = Boolean.valueOf(bool3);
        this.zzbaE = ((Boolean)localObject1);
        break;
      case 234: 
        int m = 234;
        n = zzsx.zzc(paramzzsm, m);
        localObject1 = this.zzbaF;
        if (localObject1 == null)
        {
          m = 0;
          localObject1 = null;
        }
        for (;;)
        {
          n += m;
          localObject2 = new zzqb.zza[n];
          if (m != 0)
          {
            localObject3 = this.zzbaF;
            System.arraycopy(localObject3, 0, localObject2, 0, m);
          }
          for (;;)
          {
            i1 = localObject2.length + -1;
            if (m >= i1) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzqb$zza;
            ((zzqb.zza)localObject3).<init>();
            localObject2[m] = localObject3;
            localObject3 = localObject2[m];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            m += 1;
          }
          localObject1 = this.zzbaF;
          m = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzqb$zza;
        ((zzqb.zza)localObject3).<init>();
        localObject2[m] = localObject3;
        localObject1 = localObject2[m];
        paramzzsm.zza((zzsu)localObject1);
        this.zzbaF = ((zzqb.zza[])localObject2);
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int j = super.zzz();
    Object localObject1 = this.zzbal;
    Object localObject2;
    int k;
    int i1;
    if (localObject1 != null)
    {
      localObject2 = this.zzbal;
      k = ((Integer)localObject2).intValue();
      i1 = zzsn.zzC(1, k);
      j += i1;
    }
    localObject1 = this.zzbam;
    int i2;
    if (localObject1 != null)
    {
      localObject1 = this.zzbam;
      i1 = localObject1.length;
      if (i1 > 0)
      {
        i1 = j;
        j = 0;
        for (;;)
        {
          localObject2 = this.zzbam;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzbam[j];
          if (localObject2 != null)
          {
            i2 = 2;
            k = zzsn.zzc(i2, (zzsu)localObject2);
            i1 += k;
          }
          j += 1;
        }
        j = i1;
      }
    }
    localObject1 = this.zzban;
    if (localObject1 != null)
    {
      localObject1 = this.zzban;
      i1 = localObject1.length;
      if (i1 > 0)
      {
        i1 = j;
        j = 0;
        for (;;)
        {
          localObject2 = this.zzban;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzban[j];
          if (localObject2 != null)
          {
            i2 = 3;
            k = zzsn.zzc(i2, (zzsu)localObject2);
            i1 += k;
          }
          j += 1;
        }
        j = i1;
      }
    }
    localObject1 = this.zzbao;
    long l;
    if (localObject1 != null)
    {
      localObject2 = this.zzbao;
      l = ((Long)localObject2).longValue();
      i1 = zzsn.zzd(4, l);
      j += i1;
    }
    localObject1 = this.zzbap;
    if (localObject1 != null)
    {
      localObject2 = this.zzbap;
      l = ((Long)localObject2).longValue();
      i1 = zzsn.zzd(5, l);
      j += i1;
    }
    localObject1 = this.zzbaq;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaq;
      l = ((Long)localObject2).longValue();
      i1 = zzsn.zzd(6, l);
      j += i1;
    }
    localObject1 = this.zzbas;
    if (localObject1 != null)
    {
      localObject2 = this.zzbas;
      l = ((Long)localObject2).longValue();
      i1 = zzsn.zzd(7, l);
      j += i1;
    }
    localObject1 = this.zzbat;
    if (localObject1 != null)
    {
      localObject2 = this.zzbat;
      i1 = zzsn.zzo(8, (String)localObject2);
      j += i1;
    }
    localObject1 = this.osVersion;
    if (localObject1 != null)
    {
      localObject2 = this.osVersion;
      i1 = zzsn.zzo(9, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzbau;
    if (localObject1 != null)
    {
      localObject2 = this.zzbau;
      i1 = zzsn.zzo(10, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzbav;
    if (localObject1 != null)
    {
      localObject2 = this.zzbav;
      i1 = zzsn.zzo(11, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzbaw;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaw;
      k = ((Integer)localObject2).intValue();
      i1 = zzsn.zzC(12, k);
      j += i1;
    }
    localObject1 = this.zzaVu;
    if (localObject1 != null)
    {
      localObject2 = this.zzaVu;
      i1 = zzsn.zzo(13, (String)localObject2);
      j += i1;
    }
    localObject1 = this.appId;
    if (localObject1 != null)
    {
      localObject2 = this.appId;
      i1 = zzsn.zzo(14, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzaMV;
    if (localObject1 != null)
    {
      localObject2 = this.zzaMV;
      i1 = zzsn.zzo(16, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzbax;
    if (localObject1 != null)
    {
      localObject2 = this.zzbax;
      l = ((Long)localObject2).longValue();
      i1 = zzsn.zzd(17, l);
      j += i1;
    }
    localObject1 = this.zzbay;
    if (localObject1 != null)
    {
      localObject2 = this.zzbay;
      l = ((Long)localObject2).longValue();
      i1 = zzsn.zzd(18, l);
      j += i1;
    }
    localObject1 = this.zzbaz;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaz;
      i1 = zzsn.zzo(19, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzbaA;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaA;
      boolean bool1 = ((Boolean)localObject2).booleanValue();
      i1 = zzsn.zzf(20, bool1);
      j += i1;
    }
    localObject1 = this.zzbaB;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaB;
      i1 = zzsn.zzo(21, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzbaC;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaC;
      l = ((Long)localObject2).longValue();
      i1 = zzsn.zzd(22, l);
      j += i1;
    }
    localObject1 = this.zzbaD;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaD;
      int m = ((Integer)localObject2).intValue();
      i1 = zzsn.zzC(23, m);
      j += i1;
    }
    localObject1 = this.zzaVx;
    if (localObject1 != null)
    {
      localObject2 = this.zzaVx;
      i1 = zzsn.zzo(24, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzaVt;
    if (localObject1 != null)
    {
      localObject2 = this.zzaVt;
      i1 = zzsn.zzo(25, (String)localObject2);
      j += i1;
    }
    localObject1 = this.zzbar;
    if (localObject1 != null)
    {
      localObject2 = this.zzbar;
      l = ((Long)localObject2).longValue();
      i1 = zzsn.zzd(26, l);
      j += i1;
    }
    localObject1 = this.zzbaE;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaE;
      boolean bool2 = ((Boolean)localObject2).booleanValue();
      i1 = zzsn.zzf(28, bool2);
      j += i1;
    }
    localObject1 = this.zzbaF;
    if (localObject1 != null)
    {
      localObject1 = this.zzbaF;
      i1 = localObject1.length;
      if (i1 > 0) {
        for (;;)
        {
          localObject1 = this.zzbaF;
          i1 = localObject1.length;
          if (i >= i1) {
            break;
          }
          localObject1 = this.zzbaF[i];
          if (localObject1 != null)
          {
            int n = 29;
            i1 = zzsn.zzc(n, (zzsu)localObject1);
            j += i1;
          }
          i += 1;
        }
      }
    }
    return j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqb$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */