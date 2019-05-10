package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SearchAdRequestParcel
  implements SafeParcelable
{
  public static final zzam CREATOR;
  public final int backgroundColor;
  public final int versionCode;
  public final int zzvd;
  public final int zzve;
  public final int zzvf;
  public final int zzvg;
  public final int zzvh;
  public final int zzvi;
  public final int zzvj;
  public final String zzvk;
  public final int zzvl;
  public final String zzvm;
  public final int zzvn;
  public final int zzvo;
  public final String zzvp;
  
  static
  {
    zzam localzzam = new com/google/android/gms/ads/internal/client/zzam;
    localzzam.<init>();
    CREATOR = localzzam;
  }
  
  SearchAdRequestParcel(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, String paramString1, int paramInt10, String paramString2, int paramInt11, int paramInt12, String paramString3)
  {
    this.versionCode = paramInt1;
    this.zzvd = paramInt2;
    this.backgroundColor = paramInt3;
    this.zzve = paramInt4;
    this.zzvf = paramInt5;
    this.zzvg = paramInt6;
    this.zzvh = paramInt7;
    this.zzvi = paramInt8;
    this.zzvj = paramInt9;
    this.zzvk = paramString1;
    this.zzvl = paramInt10;
    this.zzvm = paramString2;
    this.zzvn = paramInt11;
    this.zzvo = paramInt12;
    this.zzvp = paramString3;
  }
  
  public SearchAdRequestParcel(SearchAdRequest paramSearchAdRequest)
  {
    this.versionCode = 1;
    int i = paramSearchAdRequest.getAnchorTextColor();
    this.zzvd = i;
    i = paramSearchAdRequest.getBackgroundColor();
    this.backgroundColor = i;
    i = paramSearchAdRequest.getBackgroundGradientBottom();
    this.zzve = i;
    i = paramSearchAdRequest.getBackgroundGradientTop();
    this.zzvf = i;
    i = paramSearchAdRequest.getBorderColor();
    this.zzvg = i;
    i = paramSearchAdRequest.getBorderThickness();
    this.zzvh = i;
    i = paramSearchAdRequest.getBorderType();
    this.zzvi = i;
    i = paramSearchAdRequest.getCallButtonColor();
    this.zzvj = i;
    String str = paramSearchAdRequest.getCustomChannels();
    this.zzvk = str;
    i = paramSearchAdRequest.getDescriptionTextColor();
    this.zzvl = i;
    str = paramSearchAdRequest.getFontFace();
    this.zzvm = str;
    i = paramSearchAdRequest.getHeaderTextColor();
    this.zzvn = i;
    i = paramSearchAdRequest.getHeaderTextSize();
    this.zzvo = i;
    str = paramSearchAdRequest.getQuery();
    this.zzvp = str;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzam.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\SearchAdRequestParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */