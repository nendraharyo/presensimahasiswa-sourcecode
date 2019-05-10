package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class zzf
{
  private Bundle mExtras;
  private Location zzbj;
  private boolean zzpE;
  private long zztS;
  private int zztT;
  private List zztU;
  private boolean zztV;
  private int zztW;
  private String zztX;
  private SearchAdRequestParcel zztY;
  private String zztZ;
  private Bundle zzua;
  private Bundle zzub;
  private List zzuc;
  private String zzud;
  private String zzue;
  private boolean zzuf;
  
  public zzf()
  {
    this.zztS = -1;
    Object localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.mExtras = ((Bundle)localObject);
    this.zztT = i;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zztU = ((List)localObject);
    this.zztV = false;
    this.zztW = i;
    this.zzpE = false;
    this.zztX = null;
    this.zztY = null;
    this.zzbj = null;
    this.zztZ = null;
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.zzua = ((Bundle)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.zzub = ((Bundle)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzuc = ((List)localObject);
    this.zzud = null;
    this.zzue = null;
    this.zzuf = false;
  }
  
  public zzf(AdRequestParcel paramAdRequestParcel)
  {
    long l = paramAdRequestParcel.zztC;
    this.zztS = l;
    Object localObject = paramAdRequestParcel.extras;
    this.mExtras = ((Bundle)localObject);
    int i = paramAdRequestParcel.zztD;
    this.zztT = i;
    localObject = paramAdRequestParcel.zztE;
    this.zztU = ((List)localObject);
    boolean bool1 = paramAdRequestParcel.zztF;
    this.zztV = bool1;
    int j = paramAdRequestParcel.zztG;
    this.zztW = j;
    boolean bool2 = paramAdRequestParcel.zztH;
    this.zzpE = bool2;
    localObject = paramAdRequestParcel.zztI;
    this.zztX = ((String)localObject);
    localObject = paramAdRequestParcel.zztJ;
    this.zztY = ((SearchAdRequestParcel)localObject);
    localObject = paramAdRequestParcel.zztK;
    this.zzbj = ((Location)localObject);
    localObject = paramAdRequestParcel.zztL;
    this.zztZ = ((String)localObject);
    localObject = paramAdRequestParcel.zztM;
    this.zzua = ((Bundle)localObject);
    localObject = paramAdRequestParcel.zztN;
    this.zzub = ((Bundle)localObject);
    localObject = paramAdRequestParcel.zztO;
    this.zzuc = ((List)localObject);
    localObject = paramAdRequestParcel.zztP;
    this.zzud = ((String)localObject);
    localObject = paramAdRequestParcel.zztQ;
    this.zzue = ((String)localObject);
  }
  
  public zzf zza(Location paramLocation)
  {
    this.zzbj = paramLocation;
    return this;
  }
  
  public AdRequestParcel zzcN()
  {
    AdRequestParcel localAdRequestParcel = new com/google/android/gms/ads/internal/client/AdRequestParcel;
    long l = this.zztS;
    Bundle localBundle1 = this.mExtras;
    int i = this.zztT;
    List localList1 = this.zztU;
    boolean bool1 = this.zztV;
    int j = this.zztW;
    boolean bool2 = this.zzpE;
    String str1 = this.zztX;
    SearchAdRequestParcel localSearchAdRequestParcel = this.zztY;
    Location localLocation = this.zzbj;
    String str2 = this.zztZ;
    Bundle localBundle2 = this.zzua;
    Bundle localBundle3 = this.zzub;
    List localList2 = this.zzuc;
    String str3 = this.zzud;
    String str4 = this.zzue;
    boolean bool3 = this.zzuf;
    localAdRequestParcel.<init>(7, l, localBundle1, i, localList1, bool1, j, bool2, str1, localSearchAdRequestParcel, localLocation, str2, localBundle2, localBundle3, localList2, str3, str4, bool3);
    return localAdRequestParcel;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */