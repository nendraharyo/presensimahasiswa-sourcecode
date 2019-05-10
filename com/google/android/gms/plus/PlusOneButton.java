package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.plus.internal.zzg;

public final class PlusOneButton
  extends FrameLayout
{
  public static final int ANNOTATION_BUBBLE = 1;
  public static final int ANNOTATION_INLINE = 2;
  public static final int ANNOTATION_NONE = 0;
  public static final int DEFAULT_ACTIVITY_REQUEST_CODE = 255;
  public static final int SIZE_MEDIUM = 1;
  public static final int SIZE_SMALL = 0;
  public static final int SIZE_STANDARD = 3;
  public static final int SIZE_TALL = 2;
  private int mSize;
  private String zzF;
  private View zzbea;
  private int zzbeb;
  private int zzbec;
  private PlusOneButton.OnPlusOneClickListener zzbed;
  
  public PlusOneButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PlusOneButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = getSize(paramContext, paramAttributeSet);
    this.mSize = i;
    i = getAnnotation(paramContext, paramAttributeSet);
    this.zzbeb = i;
    this.zzbec = -1;
    Context localContext = getContext();
    zzar(localContext);
    boolean bool = isInEditMode();
    if (bool) {}
  }
  
  protected static int getAnnotation(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 1;
    int j = 0;
    String str1 = "PlusOneButton";
    String str2 = zzaf.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", paramContext, paramAttributeSet, i, false, str1);
    String str3 = "INLINE";
    boolean bool1 = str3.equalsIgnoreCase(str2);
    if (bool1) {
      j = 2;
    }
    for (;;)
    {
      return j;
      str3 = "NONE";
      boolean bool2 = str3.equalsIgnoreCase(str2);
      if (!bool2) {
        j = i;
      }
    }
  }
  
  protected static int getSize(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 1;
    int j = 0;
    String str1 = "PlusOneButton";
    String str2 = zzaf.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", paramContext, paramAttributeSet, i, false, str1);
    String str3 = "SMALL";
    boolean bool1 = str3.equalsIgnoreCase(str2);
    if (bool1) {}
    for (;;)
    {
      return j;
      str3 = "MEDIUM";
      bool1 = str3.equalsIgnoreCase(str2);
      if (bool1)
      {
        j = i;
      }
      else
      {
        str3 = "TALL";
        boolean bool2 = str3.equalsIgnoreCase(str2);
        if (bool2) {
          j = 2;
        } else {
          j = 3;
        }
      }
    }
  }
  
  private void zzar(Context paramContext)
  {
    Object localObject = this.zzbea;
    if (localObject != null)
    {
      localObject = this.zzbea;
      removeView((View)localObject);
    }
    int i = this.mSize;
    int j = this.zzbeb;
    String str = this.zzF;
    int k = this.zzbec;
    localObject = zzg.zza(paramContext, i, j, str, k);
    this.zzbea = ((View)localObject);
    localObject = this.zzbed;
    setOnPlusOneClickListener((PlusOneButton.OnPlusOneClickListener)localObject);
    localObject = this.zzbea;
    addView((View)localObject);
  }
  
  public void initialize(String paramString, int paramInt)
  {
    zzx.zza(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
    this.zzF = paramString;
    this.zzbec = paramInt;
    Context localContext = getContext();
    zzar(localContext);
  }
  
  public void initialize(String paramString, PlusOneButton.OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    this.zzF = paramString;
    this.zzbec = 0;
    Context localContext = getContext();
    zzar(localContext);
    setOnPlusOneClickListener(paramOnPlusOneClickListener);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = this.zzbea;
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    localView.layout(0, 0, i, j);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = this.zzbea;
    measureChild(localView, paramInt1, paramInt2);
    int i = localView.getMeasuredWidth();
    int j = localView.getMeasuredHeight();
    setMeasuredDimension(i, j);
  }
  
  public void plusOneClick()
  {
    this.zzbea.performClick();
  }
  
  public void setAnnotation(int paramInt)
  {
    this.zzbeb = paramInt;
    Context localContext = getContext();
    zzar(localContext);
  }
  
  public void setIntent(Intent paramIntent)
  {
    this.zzbea.setTag(paramIntent);
  }
  
  public void setOnPlusOneClickListener(PlusOneButton.OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    this.zzbed = paramOnPlusOneClickListener;
    View localView = this.zzbea;
    PlusOneButton.DefaultOnPlusOneClickListener localDefaultOnPlusOneClickListener = new com/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;
    localDefaultOnPlusOneClickListener.<init>(this, paramOnPlusOneClickListener);
    localView.setOnClickListener(localDefaultOnPlusOneClickListener);
  }
  
  public void setSize(int paramInt)
  {
    this.mSize = paramInt;
    Context localContext = getContext();
    zzar(localContext);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\PlusOneButton.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */