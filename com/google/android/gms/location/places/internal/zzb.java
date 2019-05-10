package com.google.android.gms.location.places.internal;

import android.os.Parcelable.Creator;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

public class zzb
  extends zzt
  implements AutocompletePrediction
{
  public zzb(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  private String zzzh()
  {
    return zzG("ap_description", "");
  }
  
  private String zzzi()
  {
    return zzG("ap_primary_text", "");
  }
  
  private String zzzj()
  {
    return zzG("ap_secondary_text", "");
  }
  
  private List zzzk()
  {
    Parcelable.Creator localCreator = AutocompletePredictionEntity.SubstringEntity.CREATOR;
    List localList = Collections.emptyList();
    return zza("ap_matched_subscriptions", localCreator, localList);
  }
  
  private List zzzl()
  {
    Parcelable.Creator localCreator = AutocompletePredictionEntity.SubstringEntity.CREATOR;
    List localList = Collections.emptyList();
    return zza("ap_primary_text_matched", localCreator, localList);
  }
  
  private List zzzm()
  {
    Parcelable.Creator localCreator = AutocompletePredictionEntity.SubstringEntity.CREATOR;
    List localList = Collections.emptyList();
    return zza("ap_secondary_text_matched", localCreator, localList);
  }
  
  public String getDescription()
  {
    return zzzh();
  }
  
  public CharSequence getFullText(CharacterStyle paramCharacterStyle)
  {
    String str = zzzh();
    List localList = zzzk();
    return zzc.zza(str, localList, paramCharacterStyle);
  }
  
  public List getMatchedSubstrings()
  {
    return zzzk();
  }
  
  public String getPlaceId()
  {
    return zzG("ap_place_id", null);
  }
  
  public List getPlaceTypes()
  {
    List localList = Collections.emptyList();
    return zza("ap_place_types", localList);
  }
  
  public CharSequence getPrimaryText(CharacterStyle paramCharacterStyle)
  {
    String str = zzzi();
    List localList = zzzl();
    return zzc.zza(str, localList, paramCharacterStyle);
  }
  
  public CharSequence getSecondaryText(CharacterStyle paramCharacterStyle)
  {
    String str = zzzj();
    List localList = zzzm();
    return zzc.zza(str, localList, paramCharacterStyle);
  }
  
  public AutocompletePrediction zzzf()
  {
    String str1 = getPlaceId();
    List localList1 = getPlaceTypes();
    int i = zzzg();
    String str2 = zzzh();
    List localList2 = zzzk();
    String str3 = zzzi();
    List localList3 = zzzl();
    String str4 = zzzj();
    List localList4 = zzzm();
    return AutocompletePredictionEntity.zza(str1, localList1, i, str2, localList2, str3, localList3, str4, localList4);
  }
  
  public int zzzg()
  {
    return zzz("ap_personalization_type", 6);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */