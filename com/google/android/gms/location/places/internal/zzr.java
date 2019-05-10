package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zzd;
import com.google.android.gms.maps.model.zze;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class zzr
  extends zzt
  implements Place
{
  private final String zzaPH;
  
  public zzr(DataHolder paramDataHolder, int paramInt, Context paramContext)
  {
    super(paramDataHolder, paramInt);
    String str = zzG("place_id", "");
    this.zzaPH = str;
  }
  
  private PlaceImpl zzzA()
  {
    Object localObject1 = new com/google/android/gms/location/places/internal/PlaceImpl$zza;
    ((PlaceImpl.zza)localObject1).<init>();
    Object localObject2 = getAddress().toString();
    localObject1 = ((PlaceImpl.zza)localObject1).zzeo((String)localObject2);
    localObject2 = zzzq();
    localObject1 = ((PlaceImpl.zza)localObject1).zzy((List)localObject2);
    localObject2 = getId();
    localObject1 = ((PlaceImpl.zza)localObject1).zzem((String)localObject2);
    boolean bool = zzzr();
    localObject1 = ((PlaceImpl.zza)localObject1).zzan(bool);
    localObject2 = getLatLng();
    localObject1 = ((PlaceImpl.zza)localObject1).zza((LatLng)localObject2);
    float f = zzzo();
    localObject1 = ((PlaceImpl.zza)localObject1).zzf(f);
    localObject2 = getName().toString();
    localObject1 = ((PlaceImpl.zza)localObject1).zzen((String)localObject2);
    localObject2 = getPhoneNumber().toString();
    localObject1 = ((PlaceImpl.zza)localObject1).zzep((String)localObject2);
    int i = getPriceLevel();
    localObject1 = ((PlaceImpl.zza)localObject1).zzhX(i);
    f = getRating();
    localObject1 = ((PlaceImpl.zza)localObject1).zzg(f);
    localObject2 = getPlaceTypes();
    localObject1 = ((PlaceImpl.zza)localObject1).zzx((List)localObject2);
    localObject2 = getViewport();
    localObject1 = ((PlaceImpl.zza)localObject1).zza((LatLngBounds)localObject2);
    localObject2 = getWebsiteUri();
    localObject1 = ((PlaceImpl.zza)localObject1).zzo((Uri)localObject2).zzzx();
    localObject2 = getLocale();
    ((PlaceImpl)localObject1).setLocale((Locale)localObject2);
    return (PlaceImpl)localObject1;
  }
  
  private List zzzq()
  {
    List localList = Collections.emptyList();
    return zzb("place_attributions", localList);
  }
  
  public CharSequence getAddress()
  {
    return zzG("place_address", "");
  }
  
  public CharSequence getAttributions()
  {
    return zzc.zzj(zzzq());
  }
  
  public String getId()
  {
    return this.zzaPH;
  }
  
  public LatLng getLatLng()
  {
    zze localzze = LatLng.CREATOR;
    return (LatLng)zza("place_lat_lng", localzze);
  }
  
  public Locale getLocale()
  {
    Object localObject = "place_locale";
    String str = zzG((String)localObject, "");
    boolean bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      localObject = new java/util/Locale;
      ((Locale)localObject).<init>(str);
    }
    for (;;)
    {
      return (Locale)localObject;
      localObject = Locale.getDefault();
    }
  }
  
  public CharSequence getName()
  {
    return zzG("place_name", "");
  }
  
  public CharSequence getPhoneNumber()
  {
    return zzG("place_phone_number", "");
  }
  
  public List getPlaceTypes()
  {
    List localList = Collections.emptyList();
    return zza("place_types", localList);
  }
  
  public int getPriceLevel()
  {
    return zzz("place_price_level", -1);
  }
  
  public float getRating()
  {
    return zzb("place_rating", -1.0F);
  }
  
  public LatLngBounds getViewport()
  {
    zzd localzzd = LatLngBounds.CREATOR;
    return (LatLngBounds)zza("place_viewport", localzzd);
  }
  
  public Uri getWebsiteUri()
  {
    Uri localUri = null;
    String str = zzG("place_website_uri", null);
    if (str == null) {}
    for (;;)
    {
      return localUri;
      localUri = Uri.parse(str);
    }
  }
  
  public float zzzo()
  {
    return zzb("place_level_number", 0.0F);
  }
  
  public boolean zzzr()
  {
    return zzl("place_is_permanently_closed", false);
  }
  
  public Place zzzw()
  {
    return zzzA();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */