package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.internal.zzi.zza;

public final class TileOverlayOptions
  implements SafeParcelable
{
  public static final zzo CREATOR;
  private final int mVersionCode;
  private zzi zzaTP;
  private TileProvider zzaTQ;
  private boolean zzaTR;
  private float zzaTh;
  private boolean zzaTi;
  
  static
  {
    zzo localzzo = new com/google/android/gms/maps/model/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  public TileOverlayOptions()
  {
    this.zzaTi = i;
    this.zzaTR = i;
    this.mVersionCode = i;
  }
  
  TileOverlayOptions(int paramInt, IBinder paramIBinder, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    this.zzaTi = bool;
    this.zzaTR = bool;
    this.mVersionCode = paramInt;
    Object localObject = zzi.zza.zzdm(paramIBinder);
    this.zzaTP = ((zzi)localObject);
    localObject = this.zzaTP;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      this.zzaTQ = ((TileProvider)localObject);
      this.zzaTi = paramBoolean1;
      this.zzaTh = paramFloat;
      this.zzaTR = paramBoolean2;
      return;
      localObject = new com/google/android/gms/maps/model/TileOverlayOptions$1;
      ((TileOverlayOptions.1)localObject).<init>(this);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public TileOverlayOptions fadeIn(boolean paramBoolean)
  {
    this.zzaTR = paramBoolean;
    return this;
  }
  
  public boolean getFadeIn()
  {
    return this.zzaTR;
  }
  
  public TileProvider getTileProvider()
  {
    return this.zzaTQ;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public float getZIndex()
  {
    return this.zzaTh;
  }
  
  public boolean isVisible()
  {
    return this.zzaTi;
  }
  
  public TileOverlayOptions tileProvider(TileProvider paramTileProvider)
  {
    this.zzaTQ = paramTileProvider;
    Object localObject = this.zzaTQ;
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      this.zzaTP = ((zzi)localObject);
      return this;
      localObject = new com/google/android/gms/maps/model/TileOverlayOptions$2;
      ((TileOverlayOptions.2)localObject).<init>(this, paramTileProvider);
    }
  }
  
  public TileOverlayOptions visible(boolean paramBoolean)
  {
    this.zzaTi = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
  
  public TileOverlayOptions zIndex(float paramFloat)
  {
    this.zzaTh = paramFloat;
    return this;
  }
  
  IBinder zzAm()
  {
    return this.zzaTP.asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\TileOverlayOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */