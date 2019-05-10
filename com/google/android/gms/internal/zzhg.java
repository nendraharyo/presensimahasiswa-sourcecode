package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzhg
{
  private int mOrientation;
  private final AdRequestInfoParcel zzCu;
  private List zzGK;
  private boolean zzJA;
  private int zzJB;
  private String zzJC;
  private boolean zzJD;
  private RewardItemParcel zzJE;
  private List zzJF;
  private List zzJG;
  private boolean zzJH;
  private String zzJn;
  private String zzJo;
  private List zzJp;
  private String zzJq;
  private String zzJr;
  private List zzJs;
  private long zzJt;
  private boolean zzJu;
  private final long zzJv;
  private long zzJw;
  private boolean zzJx;
  private boolean zzJy;
  private boolean zzJz;
  private boolean zzuS;
  private String zzxY;
  
  public zzhg(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    this.zzJt = l;
    this.zzJu = false;
    this.zzJv = l;
    this.zzJw = l;
    this.mOrientation = -1;
    this.zzJx = false;
    this.zzJy = false;
    this.zzJz = false;
    this.zzJA = true;
    this.zzJB = 0;
    this.zzJC = "";
    this.zzJD = false;
    this.zzuS = false;
    this.zzJH = false;
    this.zzCu = paramAdRequestInfoParcel;
  }
  
  private void zzA(Map paramMap)
  {
    String str1 = zzd(paramMap, "X-Afma-Fluid");
    if (str1 != null)
    {
      String str2 = "height";
      boolean bool = str1.equals(str2);
      if (bool)
      {
        bool = true;
        this.zzJD = bool;
      }
    }
  }
  
  private void zzB(Map paramMap)
  {
    String str = zzd(paramMap, "X-Afma-Ad-Format");
    boolean bool = "native_express".equals(str);
    this.zzuS = bool;
  }
  
  private void zzC(Map paramMap)
  {
    RewardItemParcel localRewardItemParcel = RewardItemParcel.zzay(zzd(paramMap, "X-Afma-Rewards"));
    this.zzJE = localRewardItemParcel;
  }
  
  private void zzD(Map paramMap)
  {
    List localList = this.zzJF;
    if (localList != null) {}
    for (;;)
    {
      return;
      localList = zzf(paramMap, "X-Afma-Reward-Video-Start-Urls");
      this.zzJF = localList;
    }
  }
  
  private void zzE(Map paramMap)
  {
    List localList = this.zzJG;
    if (localList != null) {}
    for (;;)
    {
      return;
      localList = zzf(paramMap, "X-Afma-Reward-Video-Complete-Urls");
      this.zzJG = localList;
    }
  }
  
  private void zzF(Map paramMap)
  {
    boolean bool1 = this.zzJH;
    boolean bool2 = zzg(paramMap, "X-Afma-Use-Displayed-Impression");
    bool1 |= bool2;
    this.zzJH = bool1;
  }
  
  static String zzd(Map paramMap, String paramString)
  {
    Object localObject = (List)paramMap.get(paramString);
    if (localObject != null)
    {
      boolean bool = ((List)localObject).isEmpty();
      if (!bool) {
        bool = false;
      }
    }
    for (localObject = (String)((List)localObject).get(0);; localObject = null) {
      return (String)localObject;
    }
  }
  
  static long zze(Map paramMap, String paramString)
  {
    Object localObject1 = (List)paramMap.get(paramString);
    float f1;
    if (localObject1 != null)
    {
      boolean bool = ((List)localObject1).isEmpty();
      if (!bool)
      {
        bool = false;
        f1 = 0.0F;
        Object localObject2 = null;
        localObject1 = (String)((List)localObject1).get(0);
      }
    }
    for (;;)
    {
      try
      {
        float f2 = Float.parseFloat((String)localObject1);
        int i = 1148846080;
        f1 = 1000.0F;
        f2 *= f1;
        l = f2;
        return l;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Could not parse float from ").append(paramString);
        String str = " header: ";
        localStringBuilder = localStringBuilder.append(str);
        localObject1 = (String)localObject1;
        zzin.zzaK((String)localObject1);
      }
      long l = -1;
    }
  }
  
  static List zzf(Map paramMap, String paramString)
  {
    Object localObject = (List)paramMap.get(paramString);
    String str;
    if (localObject != null)
    {
      boolean bool = ((List)localObject).isEmpty();
      if (!bool)
      {
        bool = false;
        str = null;
        localObject = (String)((List)localObject).get(0);
        if (localObject != null)
        {
          localObject = ((String)localObject).trim();
          str = "\\s+";
        }
      }
    }
    for (localObject = Arrays.asList(((String)localObject).split(str));; localObject = null) {
      return (List)localObject;
    }
  }
  
  private boolean zzg(Map paramMap, String paramString)
  {
    Object localObject = (List)paramMap.get(paramString);
    boolean bool2;
    if (localObject != null)
    {
      boolean bool1 = ((List)localObject).isEmpty();
      if (!bool1)
      {
        localObject = Boolean.valueOf((String)((List)localObject).get(0));
        bool2 = ((Boolean)localObject).booleanValue();
        if (bool2) {
          bool2 = true;
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  private void zzk(Map paramMap)
  {
    String str = zzd(paramMap, "X-Afma-Ad-Size");
    this.zzJn = str;
  }
  
  private void zzl(Map paramMap)
  {
    List localList = zzf(paramMap, "X-Afma-Click-Tracking-Urls");
    if (localList != null) {
      this.zzJp = localList;
    }
  }
  
  private void zzm(Map paramMap)
  {
    Object localObject = (List)paramMap.get("X-Afma-Debug-Dialog");
    if (localObject != null)
    {
      boolean bool = ((List)localObject).isEmpty();
      if (!bool)
      {
        bool = false;
        localObject = (String)((List)localObject).get(0);
        this.zzJq = ((String)localObject);
      }
    }
  }
  
  private void zzn(Map paramMap)
  {
    List localList = zzf(paramMap, "X-Afma-Tracking-Urls");
    if (localList != null) {
      this.zzJs = localList;
    }
  }
  
  private void zzo(Map paramMap)
  {
    String str = "X-Afma-Interstitial-Timeout";
    long l1 = zze(paramMap, str);
    long l2 = -1;
    boolean bool = l1 < l2;
    if (bool) {
      this.zzJt = l1;
    }
  }
  
  private void zzp(Map paramMap)
  {
    String str = zzd(paramMap, "X-Afma-ActiveView");
    this.zzJr = str;
  }
  
  private void zzq(Map paramMap)
  {
    String str = zzd(paramMap, "X-Afma-Ad-Format");
    boolean bool = "native".equals(str);
    this.zzJy = bool;
  }
  
  private void zzr(Map paramMap)
  {
    boolean bool1 = this.zzJx;
    boolean bool2 = zzg(paramMap, "X-Afma-Custom-Rendering-Allowed");
    bool1 |= bool2;
    this.zzJx = bool1;
  }
  
  private void zzs(Map paramMap)
  {
    boolean bool1 = this.zzJu;
    boolean bool2 = zzg(paramMap, "X-Afma-Mediation");
    bool1 |= bool2;
    this.zzJu = bool1;
  }
  
  private void zzt(Map paramMap)
  {
    List localList = zzf(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (localList != null) {
      this.zzGK = localList;
    }
  }
  
  private void zzu(Map paramMap)
  {
    String str = "X-Afma-Refresh-Rate";
    long l1 = zze(paramMap, str);
    long l2 = -1;
    boolean bool = l1 < l2;
    if (bool) {
      this.zzJw = l1;
    }
  }
  
  private void zzv(Map paramMap)
  {
    Object localObject = (List)paramMap.get("X-Afma-Orientation");
    String str;
    if (localObject != null)
    {
      boolean bool1 = ((List)localObject).isEmpty();
      if (!bool1)
      {
        localObject = (String)((List)localObject).get(0);
        str = "portrait";
        bool1 = str.equalsIgnoreCase((String)localObject);
        if (!bool1) {
          break label70;
        }
        localObject = zzr.zzbE();
        int i = ((zzis)localObject).zzhw();
        this.mOrientation = i;
      }
    }
    for (;;)
    {
      return;
      label70:
      str = "landscape";
      boolean bool2 = str.equalsIgnoreCase((String)localObject);
      if (bool2)
      {
        localObject = zzr.zzbE();
        int j = ((zzis)localObject).zzhv();
        this.mOrientation = j;
      }
    }
  }
  
  private void zzw(Map paramMap)
  {
    Object localObject = (List)paramMap.get("X-Afma-Use-HTTPS");
    if (localObject != null)
    {
      boolean bool1 = ((List)localObject).isEmpty();
      if (!bool1)
      {
        bool1 = false;
        localObject = Boolean.valueOf((String)((List)localObject).get(0));
        boolean bool2 = ((Boolean)localObject).booleanValue();
        this.zzJz = bool2;
      }
    }
  }
  
  private void zzx(Map paramMap)
  {
    Object localObject = (List)paramMap.get("X-Afma-Content-Url-Opted-Out");
    if (localObject != null)
    {
      boolean bool1 = ((List)localObject).isEmpty();
      if (!bool1)
      {
        bool1 = false;
        localObject = Boolean.valueOf((String)((List)localObject).get(0));
        boolean bool2 = ((Boolean)localObject).booleanValue();
        this.zzJA = bool2;
      }
    }
  }
  
  private void zzy(Map paramMap)
  {
    Object localObject = zzf(paramMap, "X-Afma-OAuth-Token-Status");
    this.zzJB = 0;
    if (localObject == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = ((List)localObject).iterator();
      int i;
      do
      {
        i = localIterator.hasNext();
        if (i == 0) {
          break;
        }
        localObject = (String)localIterator.next();
        String str = "Clear";
        boolean bool = str.equalsIgnoreCase((String)localObject);
        if (bool)
        {
          i = 1;
          this.zzJB = i;
          break;
        }
        str = "No-Op";
        i = str.equalsIgnoreCase((String)localObject);
      } while (i == 0);
      this.zzJB = 0;
    }
  }
  
  private void zzz(Map paramMap)
  {
    Object localObject = (List)paramMap.get("X-Afma-Gws-Query-Id");
    if (localObject != null)
    {
      boolean bool = ((List)localObject).isEmpty();
      if (!bool)
      {
        bool = false;
        localObject = (String)((List)localObject).get(0);
        this.zzJC = ((String)localObject);
      }
    }
  }
  
  public void zzb(String paramString1, Map paramMap, String paramString2)
  {
    this.zzJo = paramString1;
    this.zzxY = paramString2;
    zzj(paramMap);
  }
  
  public AdResponseParcel zzj(long paramLong)
  {
    AdResponseParcel localAdResponseParcel = new com/google/android/gms/ads/internal/request/AdResponseParcel;
    AdRequestInfoParcel localAdRequestInfoParcel = this.zzCu;
    String str1 = this.zzJo;
    String str2 = this.zzxY;
    List localList1 = this.zzJp;
    List localList2 = this.zzJs;
    long l1 = this.zzJt;
    boolean bool1 = this.zzJu;
    List localList3 = this.zzGK;
    long l2 = this.zzJw;
    int i = this.mOrientation;
    String str3 = this.zzJn;
    String str4 = this.zzJq;
    String str5 = this.zzJr;
    boolean bool2 = this.zzJx;
    boolean bool3 = this.zzJy;
    boolean bool4 = this.zzJz;
    boolean bool5 = this.zzJA;
    int j = this.zzJB;
    String str6 = this.zzJC;
    boolean bool6 = this.zzJD;
    boolean bool7 = this.zzuS;
    RewardItemParcel localRewardItemParcel = this.zzJE;
    List localList4 = this.zzJF;
    List localList5 = this.zzJG;
    boolean bool8 = this.zzJH;
    localAdResponseParcel.<init>(localAdRequestInfoParcel, str1, str2, localList1, localList2, l1, bool1, -1, localList3, l2, i, str3, paramLong, str4, str5, bool2, bool3, bool4, bool5, false, j, str6, bool6, bool7, localRewardItemParcel, localList4, localList5, bool8);
    return localAdResponseParcel;
  }
  
  public void zzj(Map paramMap)
  {
    zzk(paramMap);
    zzl(paramMap);
    zzm(paramMap);
    zzn(paramMap);
    zzo(paramMap);
    zzs(paramMap);
    zzt(paramMap);
    zzu(paramMap);
    zzv(paramMap);
    zzp(paramMap);
    zzw(paramMap);
    zzr(paramMap);
    zzq(paramMap);
    zzx(paramMap);
    zzy(paramMap);
    zzz(paramMap);
    zzA(paramMap);
    zzB(paramMap);
    zzC(paramMap);
    zzD(paramMap);
    zzE(paramMap);
    zzF(paramMap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */