package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzg.zza;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  public static final int COLOR_AUTO = 2;
  public static final int COLOR_DARK = 0;
  public static final int COLOR_LIGHT = 1;
  public static final int SIZE_ICON_ONLY = 2;
  public static final int SIZE_STANDARD = 0;
  public static final int SIZE_WIDE = 1;
  private int mColor;
  private int mSize;
  private Scope[] zzafT;
  private View zzafU;
  private View.OnClickListener zzafV = null;
  
  public SignInButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zza(paramContext, paramAttributeSet);
    int i = this.mSize;
    int j = this.mColor;
    Scope[] arrayOfScope = this.zzafT;
    setStyle(i, j, arrayOfScope);
  }
  
  private static Button zza(Context paramContext, int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    zzac localzzac = new com/google/android/gms/common/internal/zzac;
    localzzac.<init>(paramContext);
    Resources localResources = paramContext.getResources();
    localzzac.zza(localResources, paramInt1, paramInt2, paramArrayOfScope);
    return localzzac;
  }
  
  /* Error */
  private void zza(Context paramContext, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_1
    //   6: invokevirtual 66	android/content/Context:getTheme	()Landroid/content/res/Resources$Theme;
    //   9: astore 5
    //   11: getstatic 72	com/google/android/gms/R$styleable:SignInButton	[I
    //   14: astore 6
    //   16: aload 5
    //   18: aload_2
    //   19: aload 6
    //   21: iconst_0
    //   22: iconst_0
    //   23: invokevirtual 78	android/content/res/Resources$Theme:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   26: astore 5
    //   28: getstatic 81	com/google/android/gms/R$styleable:SignInButton_buttonSize	I
    //   31: istore 7
    //   33: iconst_0
    //   34: istore 8
    //   36: aconst_null
    //   37: astore 9
    //   39: aload 5
    //   41: iload 7
    //   43: iconst_0
    //   44: invokevirtual 87	android/content/res/TypedArray:getInt	(II)I
    //   47: istore 7
    //   49: aload_0
    //   50: iload 7
    //   52: putfield 40	com/google/android/gms/common/SignInButton:mSize	I
    //   55: getstatic 90	com/google/android/gms/R$styleable:SignInButton_colorScheme	I
    //   58: istore 7
    //   60: iconst_2
    //   61: istore 8
    //   63: aload 5
    //   65: iload 7
    //   67: iload 8
    //   69: invokevirtual 87	android/content/res/TypedArray:getInt	(II)I
    //   72: istore 7
    //   74: aload_0
    //   75: iload 7
    //   77: putfield 42	com/google/android/gms/common/SignInButton:mColor	I
    //   80: getstatic 94	com/google/android/gms/R$styleable:SignInButton_scopeUris	I
    //   83: istore 7
    //   85: aload 5
    //   87: iload 7
    //   89: invokevirtual 98	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   92: astore 6
    //   94: aload 6
    //   96: ifnonnull +19 -> 115
    //   99: iconst_0
    //   100: istore_3
    //   101: aconst_null
    //   102: astore 4
    //   104: aload_0
    //   105: aconst_null
    //   106: putfield 44	com/google/android/gms/common/SignInButton:zzafT	[Lcom/google/android/gms/common/api/Scope;
    //   109: aload 5
    //   111: invokevirtual 102	android/content/res/TypedArray:recycle	()V
    //   114: return
    //   115: aload 6
    //   117: invokevirtual 108	java/lang/String:trim	()Ljava/lang/String;
    //   120: astore 6
    //   122: ldc 110
    //   124: astore 9
    //   126: aload 6
    //   128: aload 9
    //   130: invokevirtual 114	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   133: astore 6
    //   135: aload 6
    //   137: arraylength
    //   138: istore 8
    //   140: iload 8
    //   142: anewarray 116	com/google/android/gms/common/api/Scope
    //   145: astore 9
    //   147: aload_0
    //   148: aload 9
    //   150: putfield 44	com/google/android/gms/common/SignInButton:zzafT	[Lcom/google/android/gms/common/api/Scope;
    //   153: aload 6
    //   155: arraylength
    //   156: istore 8
    //   158: iload_3
    //   159: iload 8
    //   161: if_icmpge -52 -> 109
    //   164: aload_0
    //   165: getfield 44	com/google/android/gms/common/SignInButton:zzafT	[Lcom/google/android/gms/common/api/Scope;
    //   168: astore 9
    //   170: new 116	com/google/android/gms/common/api/Scope
    //   173: astore 10
    //   175: aload 6
    //   177: iload_3
    //   178: aaload
    //   179: astore 11
    //   181: aload 11
    //   183: invokevirtual 119	java/lang/String:toString	()Ljava/lang/String;
    //   186: astore 11
    //   188: aload 10
    //   190: aload 11
    //   192: invokespecial 122	com/google/android/gms/common/api/Scope:<init>	(Ljava/lang/String;)V
    //   195: aload 9
    //   197: iload_3
    //   198: aload 10
    //   200: aastore
    //   201: iload_3
    //   202: iconst_1
    //   203: iadd
    //   204: istore_3
    //   205: goto -52 -> 153
    //   208: astore 4
    //   210: aload 5
    //   212: invokevirtual 102	android/content/res/TypedArray:recycle	()V
    //   215: aload 4
    //   217: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	SignInButton
    //   0	218	1	paramContext	Context
    //   0	218	2	paramAttributeSet	AttributeSet
    //   1	204	3	i	int
    //   3	100	4	localObject1	Object
    //   208	8	4	localObject2	Object
    //   9	202	5	localObject3	Object
    //   14	162	6	localObject4	Object
    //   31	57	7	j	int
    //   34	128	8	k	int
    //   37	159	9	localObject5	Object
    //   173	26	10	localScope	Scope
    //   179	12	11	str	String
    // Exception table:
    //   from	to	target	type
    //   28	31	208	finally
    //   43	47	208	finally
    //   50	55	208	finally
    //   55	58	208	finally
    //   67	72	208	finally
    //   75	80	208	finally
    //   80	83	208	finally
    //   87	92	208	finally
    //   105	109	208	finally
    //   115	120	208	finally
    //   128	133	208	finally
    //   135	138	208	finally
    //   140	145	208	finally
    //   148	153	208	finally
    //   153	156	208	finally
    //   164	168	208	finally
    //   170	173	208	finally
    //   177	179	208	finally
    //   181	186	208	finally
    //   190	195	208	finally
    //   198	201	208	finally
  }
  
  private void zzar(Context paramContext)
  {
    View localView = this.zzafU;
    if (localView != null)
    {
      localView = this.zzafU;
      removeView(localView);
    }
    try
    {
      i = this.mSize;
      int j = this.mColor;
      arrayOfScope = this.zzafT;
      localView = zzab.zzb(paramContext, i, j, arrayOfScope);
      this.zzafU = localView;
    }
    catch (zzg.zza localzza)
    {
      for (;;)
      {
        boolean bool;
        String str = "Sign in button not found, using placeholder instead";
        Log.w("SignInButton", str);
        int i = this.mSize;
        int k = this.mColor;
        Scope[] arrayOfScope = this.zzafT;
        Button localButton = zza(paramContext, i, k, arrayOfScope);
        this.zzafU = localButton;
      }
    }
    localView = this.zzafU;
    addView(localView);
    localView = this.zzafU;
    bool = isEnabled();
    localView.setEnabled(bool);
    this.zzafU.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    Object localObject = this.zzafV;
    if (localObject != null)
    {
      localObject = this.zzafU;
      if (paramView == localObject)
      {
        localObject = this.zzafV;
        ((View.OnClickListener)localObject).onClick(this);
      }
    }
  }
  
  public void setColorScheme(int paramInt)
  {
    int i = this.mSize;
    Scope[] arrayOfScope = this.zzafT;
    setStyle(i, paramInt, arrayOfScope);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.zzafU.setEnabled(paramBoolean);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.zzafV = paramOnClickListener;
    View localView = this.zzafU;
    if (localView != null)
    {
      localView = this.zzafU;
      localView.setOnClickListener(this);
    }
  }
  
  public void setScopes(Scope[] paramArrayOfScope)
  {
    int i = this.mSize;
    int j = this.mColor;
    setStyle(i, j, paramArrayOfScope);
  }
  
  public void setSize(int paramInt)
  {
    int i = this.mColor;
    Scope[] arrayOfScope = this.zzafT;
    setStyle(paramInt, i, arrayOfScope);
  }
  
  public void setStyle(int paramInt1, int paramInt2)
  {
    Scope[] arrayOfScope = this.zzafT;
    setStyle(paramInt1, paramInt2, arrayOfScope);
  }
  
  public void setStyle(int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    this.mSize = paramInt1;
    this.mColor = paramInt2;
    this.zzafT = paramArrayOfScope;
    Context localContext = getContext();
    zzar(localContext);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\SignInButton.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */