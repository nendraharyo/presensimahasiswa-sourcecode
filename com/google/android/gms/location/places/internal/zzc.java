package com.google.android.gms.location.places.internal;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.zzv;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class zzc
{
  public static CharSequence zza(String paramString, List paramList, CharacterStyle paramCharacterStyle)
  {
    if (paramCharacterStyle == null) {}
    for (;;)
    {
      return paramString;
      SpannableString localSpannableString = new android/text/SpannableString;
      localSpannableString.<init>(paramString);
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        AutocompletePredictionEntity.SubstringEntity localSubstringEntity = (AutocompletePredictionEntity.SubstringEntity)localIterator.next();
        CharacterStyle localCharacterStyle = CharacterStyle.wrap(paramCharacterStyle);
        int j = localSubstringEntity.getOffset();
        int k = localSubstringEntity.getOffset();
        int i = localSubstringEntity.getLength() + k;
        k = 0;
        localSpannableString.setSpan(localCharacterStyle, j, i, 0);
      }
      paramString = localSpannableString;
    }
  }
  
  public static String zzj(Collection paramCollection)
  {
    boolean bool;
    if (paramCollection != null)
    {
      bool = paramCollection.isEmpty();
      if (!bool) {}
    }
    else
    {
      bool = false;
    }
    for (String str = null;; str = zzv.zzcL(", ").zza(paramCollection)) {
      return str;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */