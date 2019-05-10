package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.q;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class AppCompatSpinner
  extends Spinner
  implements q
{
  private static final int[] ATTRS_ANDROID_SPINNERMODE;
  private static final int MAX_ITEMS_MEASURED = 15;
  private static final int MODE_DIALOG = 0;
  private static final int MODE_DROPDOWN = 1;
  private static final int MODE_THEME = 255;
  private static final String TAG = "AppCompatSpinner";
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private int mDropDownWidth;
  private ForwardingListener mForwardingListener;
  private AppCompatSpinner.DropdownPopup mPopup;
  private final Context mPopupContext;
  private final boolean mPopupSet;
  private SpinnerAdapter mTempAdapter;
  private final Rect mTempRect;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843505;
    ATTRS_ANDROID_SPINNERMODE = arrayOfInt;
  }
  
  public AppCompatSpinner(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatSpinner(Context paramContext, int paramInt)
  {
    this(paramContext, null, i, paramInt);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  /* Error */
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 6
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: iload_3
    //   7: invokespecial 61	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   10: new 63	android/graphics/Rect
    //   13: astore 7
    //   15: aload 7
    //   17: invokespecial 66	android/graphics/Rect:<init>	()V
    //   20: aload_0
    //   21: aload 7
    //   23: putfield 68	android/support/v7/widget/AppCompatSpinner:mTempRect	Landroid/graphics/Rect;
    //   26: getstatic 73	android/support/v7/appcompat/R$styleable:Spinner	[I
    //   29: astore 7
    //   31: aload_1
    //   32: aload_2
    //   33: aload 7
    //   35: iload_3
    //   36: iconst_0
    //   37: invokestatic 79	android/support/v7/widget/TintTypedArray:obtainStyledAttributes	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/TintTypedArray;
    //   40: astore 8
    //   42: new 81	android/support/v7/widget/AppCompatBackgroundHelper
    //   45: astore 7
    //   47: aload 7
    //   49: aload_0
    //   50: invokespecial 84	android/support/v7/widget/AppCompatBackgroundHelper:<init>	(Landroid/view/View;)V
    //   53: aload_0
    //   54: aload 7
    //   56: putfield 86	android/support/v7/widget/AppCompatSpinner:mBackgroundTintHelper	Landroid/support/v7/widget/AppCompatBackgroundHelper;
    //   59: aload 5
    //   61: ifnull +370 -> 431
    //   64: new 88	android/support/v7/view/ContextThemeWrapper
    //   67: astore 7
    //   69: aload 7
    //   71: aload_1
    //   72: aload 5
    //   74: invokespecial 91	android/support/v7/view/ContextThemeWrapper:<init>	(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   77: aload_0
    //   78: aload 7
    //   80: putfield 93	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   83: aload_0
    //   84: getfield 93	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   87: astore 7
    //   89: aload 7
    //   91: ifnull +235 -> 326
    //   94: iconst_m1
    //   95: istore 9
    //   97: iload 4
    //   99: iload 9
    //   101: if_icmpne +75 -> 176
    //   104: getstatic 42	android/support/v7/widget/AppCompatSpinner:ATTRS_ANDROID_SPINNERMODE	[I
    //   107: astore 7
    //   109: iconst_0
    //   110: istore 10
    //   112: aconst_null
    //   113: astore 11
    //   115: aload_1
    //   116: aload_2
    //   117: aload 7
    //   119: iload_3
    //   120: iconst_0
    //   121: invokevirtual 98	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   124: astore 11
    //   126: iconst_0
    //   127: istore 9
    //   129: aconst_null
    //   130: astore 7
    //   132: aload 11
    //   134: iconst_0
    //   135: invokevirtual 104	android/content/res/TypedArray:hasValue	(I)Z
    //   138: istore 9
    //   140: iload 9
    //   142: ifeq +24 -> 166
    //   145: iconst_0
    //   146: istore 9
    //   148: aconst_null
    //   149: astore 7
    //   151: iconst_0
    //   152: istore 12
    //   154: aconst_null
    //   155: astore 13
    //   157: aload 11
    //   159: iconst_0
    //   160: iconst_0
    //   161: invokevirtual 108	android/content/res/TypedArray:getInt	(II)I
    //   164: istore 4
    //   166: aload 11
    //   168: ifnull +8 -> 176
    //   171: aload 11
    //   173: invokevirtual 111	android/content/res/TypedArray:recycle	()V
    //   176: iload 4
    //   178: iload 6
    //   180: if_icmpne +146 -> 326
    //   183: new 113	android/support/v7/widget/AppCompatSpinner$DropdownPopup
    //   186: astore 7
    //   188: aload_0
    //   189: getfield 93	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   192: astore 11
    //   194: aload 7
    //   196: aload_0
    //   197: aload 11
    //   199: aload_2
    //   200: iload_3
    //   201: invokespecial 116	android/support/v7/widget/AppCompatSpinner$DropdownPopup:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   204: aload_0
    //   205: getfield 93	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   208: astore 11
    //   210: getstatic 73	android/support/v7/appcompat/R$styleable:Spinner	[I
    //   213: astore 13
    //   215: aload 11
    //   217: aload_2
    //   218: aload 13
    //   220: iload_3
    //   221: iconst_0
    //   222: invokestatic 79	android/support/v7/widget/TintTypedArray:obtainStyledAttributes	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/TintTypedArray;
    //   225: astore 11
    //   227: getstatic 119	android/support/v7/appcompat/R$styleable:Spinner_android_dropDownWidth	I
    //   230: istore 12
    //   232: bipush -2
    //   234: istore 14
    //   236: aload 11
    //   238: iload 12
    //   240: iload 14
    //   242: invokevirtual 122	android/support/v7/widget/TintTypedArray:getLayoutDimension	(II)I
    //   245: istore 12
    //   247: aload_0
    //   248: iload 12
    //   250: putfield 124	android/support/v7/widget/AppCompatSpinner:mDropDownWidth	I
    //   253: getstatic 127	android/support/v7/appcompat/R$styleable:Spinner_android_popupBackground	I
    //   256: istore 12
    //   258: aload 11
    //   260: iload 12
    //   262: invokevirtual 131	android/support/v7/widget/TintTypedArray:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   265: astore 13
    //   267: aload 7
    //   269: aload 13
    //   271: invokevirtual 135	android/support/v7/widget/AppCompatSpinner$DropdownPopup:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   274: getstatic 138	android/support/v7/appcompat/R$styleable:Spinner_android_prompt	I
    //   277: istore 12
    //   279: aload 8
    //   281: iload 12
    //   283: invokevirtual 142	android/support/v7/widget/TintTypedArray:getString	(I)Ljava/lang/String;
    //   286: astore 13
    //   288: aload 7
    //   290: aload 13
    //   292: invokevirtual 146	android/support/v7/widget/AppCompatSpinner$DropdownPopup:setPromptText	(Ljava/lang/CharSequence;)V
    //   295: aload 11
    //   297: invokevirtual 147	android/support/v7/widget/TintTypedArray:recycle	()V
    //   300: aload_0
    //   301: aload 7
    //   303: putfield 149	android/support/v7/widget/AppCompatSpinner:mPopup	Landroid/support/v7/widget/AppCompatSpinner$DropdownPopup;
    //   306: new 151	android/support/v7/widget/AppCompatSpinner$1
    //   309: astore 11
    //   311: aload 11
    //   313: aload_0
    //   314: aload_0
    //   315: aload 7
    //   317: invokespecial 154	android/support/v7/widget/AppCompatSpinner$1:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/view/View;Landroid/support/v7/widget/AppCompatSpinner$DropdownPopup;)V
    //   320: aload_0
    //   321: aload 11
    //   323: putfield 156	android/support/v7/widget/AppCompatSpinner:mForwardingListener	Landroid/support/v7/widget/ForwardingListener;
    //   326: getstatic 159	android/support/v7/appcompat/R$styleable:Spinner_android_entries	I
    //   329: istore 9
    //   331: aload 8
    //   333: iload 9
    //   335: invokevirtual 163	android/support/v7/widget/TintTypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   338: astore 7
    //   340: aload 7
    //   342: ifnull +40 -> 382
    //   345: new 165	android/widget/ArrayAdapter
    //   348: astore 11
    //   350: ldc -90
    //   352: istore 12
    //   354: aload 11
    //   356: aload_1
    //   357: iload 12
    //   359: aload 7
    //   361: invokespecial 170	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   364: getstatic 175	android/support/v7/appcompat/R$layout:support_simple_spinner_dropdown_item	I
    //   367: istore 9
    //   369: aload 11
    //   371: iload 9
    //   373: invokevirtual 179	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   376: aload_0
    //   377: aload 11
    //   379: invokevirtual 183	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   382: aload 8
    //   384: invokevirtual 147	android/support/v7/widget/TintTypedArray:recycle	()V
    //   387: aload_0
    //   388: iload 6
    //   390: putfield 185	android/support/v7/widget/AppCompatSpinner:mPopupSet	Z
    //   393: aload_0
    //   394: getfield 187	android/support/v7/widget/AppCompatSpinner:mTempAdapter	Landroid/widget/SpinnerAdapter;
    //   397: astore 7
    //   399: aload 7
    //   401: ifnull +20 -> 421
    //   404: aload_0
    //   405: getfield 187	android/support/v7/widget/AppCompatSpinner:mTempAdapter	Landroid/widget/SpinnerAdapter;
    //   408: astore 7
    //   410: aload_0
    //   411: aload 7
    //   413: invokevirtual 183	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   416: aload_0
    //   417: aconst_null
    //   418: putfield 187	android/support/v7/widget/AppCompatSpinner:mTempAdapter	Landroid/widget/SpinnerAdapter;
    //   421: aload_0
    //   422: getfield 86	android/support/v7/widget/AppCompatSpinner:mBackgroundTintHelper	Landroid/support/v7/widget/AppCompatBackgroundHelper;
    //   425: aload_2
    //   426: iload_3
    //   427: invokevirtual 191	android/support/v7/widget/AppCompatBackgroundHelper:loadFromAttributes	(Landroid/util/AttributeSet;I)V
    //   430: return
    //   431: getstatic 194	android/support/v7/appcompat/R$styleable:Spinner_popupTheme	I
    //   434: istore 9
    //   436: aload 8
    //   438: iload 9
    //   440: iconst_0
    //   441: invokevirtual 197	android/support/v7/widget/TintTypedArray:getResourceId	(II)I
    //   444: istore 9
    //   446: iload 9
    //   448: ifeq +25 -> 473
    //   451: new 88	android/support/v7/view/ContextThemeWrapper
    //   454: astore 11
    //   456: aload 11
    //   458: aload_1
    //   459: iload 9
    //   461: invokespecial 200	android/support/v7/view/ContextThemeWrapper:<init>	(Landroid/content/Context;I)V
    //   464: aload_0
    //   465: aload 11
    //   467: putfield 93	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   470: goto -387 -> 83
    //   473: getstatic 205	android/os/Build$VERSION:SDK_INT	I
    //   476: istore 9
    //   478: bipush 23
    //   480: istore 10
    //   482: iload 9
    //   484: iload 10
    //   486: if_icmpge +15 -> 501
    //   489: aload_1
    //   490: astore 7
    //   492: aload_0
    //   493: aload 7
    //   495: putfield 93	android/support/v7/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   498: goto -415 -> 83
    //   501: iconst_0
    //   502: istore 9
    //   504: aconst_null
    //   505: astore 7
    //   507: goto -15 -> 492
    //   510: astore 7
    //   512: iconst_0
    //   513: istore 10
    //   515: aconst_null
    //   516: astore 11
    //   518: ldc 22
    //   520: astore 13
    //   522: ldc -48
    //   524: astore 15
    //   526: aload 13
    //   528: aload 15
    //   530: aload 7
    //   532: invokestatic 214	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   535: pop
    //   536: aload 11
    //   538: ifnull -362 -> 176
    //   541: aload 11
    //   543: invokevirtual 111	android/content/res/TypedArray:recycle	()V
    //   546: goto -370 -> 176
    //   549: astore 7
    //   551: iconst_0
    //   552: istore 10
    //   554: aconst_null
    //   555: astore 11
    //   557: aload 11
    //   559: ifnull +8 -> 567
    //   562: aload 11
    //   564: invokevirtual 111	android/content/res/TypedArray:recycle	()V
    //   567: aload 7
    //   569: athrow
    //   570: astore 7
    //   572: goto -15 -> 557
    //   575: astore 7
    //   577: goto -59 -> 518
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	580	0	this	AppCompatSpinner
    //   0	580	1	paramContext	Context
    //   0	580	2	paramAttributeSet	AttributeSet
    //   0	580	3	paramInt1	int
    //   0	580	4	paramInt2	int
    //   0	580	5	paramTheme	Resources.Theme
    //   1	388	6	i	int
    //   13	493	7	localObject1	Object
    //   510	21	7	localException1	Exception
    //   549	19	7	localObject2	Object
    //   570	1	7	localObject3	Object
    //   575	1	7	localException2	Exception
    //   40	397	8	localTintTypedArray	TintTypedArray
    //   95	33	9	j	int
    //   138	9	9	bool	boolean
    //   329	174	9	k	int
    //   110	443	10	m	int
    //   113	450	11	localObject4	Object
    //   152	206	12	n	int
    //   155	372	13	localObject5	Object
    //   234	7	14	i1	int
    //   524	5	15	str	String
    // Exception table:
    //   from	to	target	type
    //   104	107	510	java/lang/Exception
    //   120	124	510	java/lang/Exception
    //   104	107	549	finally
    //   120	124	549	finally
    //   134	138	570	finally
    //   160	164	570	finally
    //   530	536	570	finally
    //   134	138	575	java/lang/Exception
    //   160	164	575	java/lang/Exception
  }
  
  int compatMeasureContentWidth(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    int i = -2;
    int j = 0;
    Rect localRect = null;
    if (paramSpinnerAdapter == null) {
      return j;
    }
    int k = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int m = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int n = getSelectedItemPosition();
    n = Math.max(0, n);
    int i1 = paramSpinnerAdapter.getCount();
    int i2 = n + 15;
    int i3 = Math.min(i1, i2);
    i1 = i3 - n;
    i1 = 15 - i1;
    n -= i1;
    int i4 = Math.max(0, n);
    i1 = 0;
    View localView = null;
    i2 = 0;
    n = 0;
    Object localObject = null;
    label118:
    if (i4 < i3)
    {
      j = paramSpinnerAdapter.getItemViewType(i4);
      if (j == n) {
        break label293;
      }
      n = 0;
    }
    for (localObject = null;; localObject = localView)
    {
      localView = paramSpinnerAdapter.getView(i4, (View)localObject, this);
      localObject = localView.getLayoutParams();
      if (localObject == null)
      {
        localObject = new android/view/ViewGroup$LayoutParams;
        ((ViewGroup.LayoutParams)localObject).<init>(i, i);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      localView.measure(k, m);
      n = localView.getMeasuredWidth();
      i2 = Math.max(i2, n);
      i4 += 1;
      n = j;
      break label118;
      if (paramDrawable != null)
      {
        localRect = this.mTempRect;
        paramDrawable.getPadding(localRect);
        localRect = this.mTempRect;
        j = localRect.left;
        localObject = this.mTempRect;
        n = ((Rect)localObject).right;
        j = j + n + i2;
        break;
      }
      j = i2;
      break;
      label293:
      j = n;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.applySupportBackgroundTint();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    int i;
    if (localDropdownPopup != null)
    {
      localDropdownPopup = this.mPopup;
      i = localDropdownPopup.getHorizontalOffset();
    }
    for (;;)
    {
      return i;
      i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j)
      {
        i = super.getDropDownHorizontalOffset();
      }
      else
      {
        i = 0;
        localDropdownPopup = null;
      }
    }
  }
  
  public int getDropDownVerticalOffset()
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    int i;
    if (localDropdownPopup != null)
    {
      localDropdownPopup = this.mPopup;
      i = localDropdownPopup.getVerticalOffset();
    }
    for (;;)
    {
      return i;
      i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j)
      {
        i = super.getDropDownVerticalOffset();
      }
      else
      {
        i = 0;
        localDropdownPopup = null;
      }
    }
  }
  
  public int getDropDownWidth()
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    int i;
    if (localDropdownPopup != null) {
      i = this.mDropDownWidth;
    }
    for (;;)
    {
      return i;
      i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j)
      {
        i = super.getDropDownWidth();
      }
      else
      {
        i = 0;
        localDropdownPopup = null;
      }
    }
  }
  
  public Drawable getPopupBackground()
  {
    Object localObject = this.mPopup;
    if (localObject != null) {
      localObject = this.mPopup.getBackground();
    }
    for (;;)
    {
      return (Drawable)localObject;
      int i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j)
      {
        localObject = super.getPopupBackground();
      }
      else
      {
        i = 0;
        localObject = null;
      }
    }
  }
  
  public Context getPopupContext()
  {
    Object localObject = this.mPopup;
    if (localObject != null) {
      localObject = this.mPopupContext;
    }
    for (;;)
    {
      return (Context)localObject;
      int i = Build.VERSION.SDK_INT;
      int j = 23;
      if (i >= j)
      {
        localObject = super.getPopupContext();
      }
      else
      {
        i = 0;
        localObject = null;
      }
    }
  }
  
  public CharSequence getPrompt()
  {
    Object localObject = this.mPopup;
    if (localObject != null) {}
    for (localObject = this.mPopup.getHintText();; localObject = super.getPrompt()) {
      return (CharSequence)localObject;
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {}
    for (localObject = this.mBackgroundTintHelper.getSupportBackgroundTintList();; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {}
    for (localObject = this.mBackgroundTintHelper.getSupportBackgroundTintMode();; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    if (localDropdownPopup != null)
    {
      localDropdownPopup = this.mPopup;
      boolean bool = localDropdownPopup.isShowing();
      if (bool)
      {
        localDropdownPopup = this.mPopup;
        localDropdownPopup.dismiss();
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    if (localDropdownPopup != null)
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      int j = -1 << -1;
      if (i == j)
      {
        i = getMeasuredWidth();
        SpinnerAdapter localSpinnerAdapter = getAdapter();
        Drawable localDrawable = getBackground();
        j = compatMeasureContentWidth(localSpinnerAdapter, localDrawable);
        i = Math.max(i, j);
        j = View.MeasureSpec.getSize(paramInt1);
        i = Math.min(i, j);
        j = getMeasuredHeight();
        setMeasuredDimension(i, j);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    ForwardingListener localForwardingListener = this.mForwardingListener;
    if (localForwardingListener != null)
    {
      localForwardingListener = this.mForwardingListener;
      bool = localForwardingListener.onTouch(this, paramMotionEvent);
      if (!bool) {}
    }
    for (boolean bool = true;; bool = super.onTouchEvent(paramMotionEvent)) {
      return bool;
    }
  }
  
  public boolean performClick()
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    if (localDropdownPopup != null)
    {
      localDropdownPopup = this.mPopup;
      bool = localDropdownPopup.isShowing();
      if (!bool)
      {
        localDropdownPopup = this.mPopup;
        localDropdownPopup.show();
      }
    }
    for (boolean bool = true;; bool = super.performClick()) {
      return bool;
    }
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    boolean bool = this.mPopupSet;
    if (!bool) {
      this.mTempAdapter = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
      localObject = this.mPopup;
    } while (localObject == null);
    Object localObject = this.mPopupContext;
    if (localObject == null) {}
    for (localObject = getContext();; localObject = this.mPopupContext)
    {
      AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
      AppCompatSpinner.DropDownAdapter localDropDownAdapter = new android/support/v7/widget/AppCompatSpinner$DropDownAdapter;
      localObject = ((Context)localObject).getTheme();
      localDropDownAdapter.<init>(paramSpinnerAdapter, (Resources.Theme)localObject);
      localDropdownPopup.setAdapter(localDropDownAdapter);
      break;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.onSetBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.onSetBackgroundResource(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    if (localDropdownPopup != null)
    {
      localDropdownPopup = this.mPopup;
      localDropdownPopup.setHorizontalOffset(paramInt);
    }
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j) {
        super.setDropDownHorizontalOffset(paramInt);
      }
    }
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    if (localDropdownPopup != null)
    {
      localDropdownPopup = this.mPopup;
      localDropdownPopup.setVerticalOffset(paramInt);
    }
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j) {
        super.setDropDownVerticalOffset(paramInt);
      }
    }
  }
  
  public void setDropDownWidth(int paramInt)
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    if (localDropdownPopup != null) {
      this.mDropDownWidth = paramInt;
    }
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j) {
        super.setDropDownWidth(paramInt);
      }
    }
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    if (localDropdownPopup != null)
    {
      localDropdownPopup = this.mPopup;
      localDropdownPopup.setBackgroundDrawable(paramDrawable);
    }
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i >= j) {
        super.setPopupBackgroundDrawable(paramDrawable);
      }
    }
  }
  
  public void setPopupBackgroundResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getPopupContext(), paramInt);
    setPopupBackgroundDrawable(localDrawable);
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.mPopup;
    if (localDropdownPopup != null)
    {
      localDropdownPopup = this.mPopup;
      localDropdownPopup.setPromptText(paramCharSequence);
    }
    for (;;)
    {
      return;
      super.setPrompt(paramCharSequence);
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatSpinner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */