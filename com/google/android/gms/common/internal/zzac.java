package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;
import com.google.android.gms.R.color;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.common.api.Scope;

public final class zzac
  extends Button
{
  public zzac(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public zzac(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 16842824);
  }
  
  private void zza(Resources paramResources)
  {
    float f1 = 48.0F;
    float f2 = 0.5F;
    Typeface localTypeface = Typeface.DEFAULT_BOLD;
    setTypeface(localTypeface);
    setTextSize(14.0F);
    float f3 = paramResources.getDisplayMetrics().density;
    int i = (int)(f3 * f1 + f2);
    setMinHeight(i);
    int j = (int)(f3 * f1 + f2);
    setMinWidth(j);
  }
  
  private void zza(Resources paramResources, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j;
    int k;
    int m;
    if (paramBoolean)
    {
      i = R.drawable.common_plus_signin_btn_icon_dark;
      j = R.drawable.common_plus_signin_btn_icon_light;
      k = R.drawable.common_plus_signin_btn_icon_dark;
      i = zzf(paramInt2, i, j, k);
      j = R.drawable.common_plus_signin_btn_text_dark;
      k = R.drawable.common_plus_signin_btn_text_light;
      m = R.drawable.common_plus_signin_btn_text_dark;
      j = zzf(paramInt2, j, k, m);
    }
    for (int i = zzd(paramInt1, i, j);; i = zzd(paramInt1, i, j))
    {
      Drawable localDrawable = paramResources.getDrawable(i);
      setBackgroundDrawable(localDrawable);
      return;
      i = R.drawable.common_google_signin_btn_icon_dark;
      j = R.drawable.common_google_signin_btn_icon_light;
      k = R.drawable.common_google_signin_btn_icon_light;
      i = zzf(paramInt2, i, j, k);
      j = R.drawable.common_google_signin_btn_text_dark;
      k = R.drawable.common_google_signin_btn_text_light;
      m = R.drawable.common_google_signin_btn_text_light;
      j = zzf(paramInt2, j, k, m);
    }
  }
  
  private boolean zza(Scope[] paramArrayOfScope)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramArrayOfScope == null) {}
    label104:
    for (;;)
    {
      return bool2;
      int i = paramArrayOfScope.length;
      int j = 0;
      for (;;)
      {
        if (j >= i) {
          break label104;
        }
        String str1 = paramArrayOfScope[j].zzpb();
        String str2 = "/plus.";
        boolean bool3 = str1.contains(str2);
        if (bool3)
        {
          str2 = "https://www.googleapis.com/auth/plus.me";
          bool3 = str1.equals(str2);
          if (!bool3)
          {
            bool2 = bool1;
            break;
          }
        }
        str2 = "https://www.googleapis.com/auth/games";
        boolean bool4 = str1.equals(str2);
        if (bool4)
        {
          bool2 = bool1;
          break;
        }
        j += 1;
      }
    }
  }
  
  private void zzb(Resources paramResources, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j;
    int k;
    if (paramBoolean)
    {
      i = R.color.common_plus_signin_btn_text_dark;
      j = R.color.common_plus_signin_btn_text_light;
      k = R.color.common_plus_signin_btn_text_dark;
    }
    for (int i = zzf(paramInt2, i, j, k);; i = zzf(paramInt2, i, j, k))
    {
      localObject1 = (ColorStateList)zzx.zzz(paramResources.getColorStateList(i));
      setTextColor((ColorStateList)localObject1);
      switch (paramInt1)
      {
      default: 
        localObject1 = new java/lang/IllegalStateException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Unknown button size: " + paramInt1;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        i = R.color.common_google_signin_btn_text_dark;
        j = R.color.common_google_signin_btn_text_light;
        k = R.color.common_google_signin_btn_text_light;
      }
    }
    i = R.string.common_signin_button_text;
    Object localObject1 = paramResources.getString(i);
    setText((CharSequence)localObject1);
    for (;;)
    {
      setTransformationMethod(null);
      return;
      i = R.string.common_signin_button_text_long;
      localObject1 = paramResources.getString(i);
      setText((CharSequence)localObject1);
      continue;
      setText(null);
    }
  }
  
  private int zzd(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt1)
    {
    default: 
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Unknown button size: " + paramInt1;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    case 2: 
      paramInt3 = paramInt2;
    }
    return paramInt3;
  }
  
  private int zzf(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    switch (paramInt1)
    {
    default: 
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Unknown color scheme: " + paramInt1;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    for (paramInt2 = paramInt3;; paramInt2 = paramInt4) {
      return paramInt2;
    }
  }
  
  public void zza(Resources paramResources, int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    boolean bool = zza(paramArrayOfScope);
    zza(paramResources);
    zza(paramResources, paramInt1, paramInt2, bool);
    zzb(paramResources, paramInt1, paramInt2, bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */