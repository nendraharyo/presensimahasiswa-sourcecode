package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.a.b;
import android.support.v4.widget.l;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

class SuggestionsAdapter
  extends l
  implements View.OnClickListener
{
  private static final boolean DBG = false;
  static final int INVALID_INDEX = 255;
  private static final String LOG_TAG = "SuggestionsAdapter";
  private static final int QUERY_LIMIT = 50;
  static final int REFINE_ALL = 2;
  static final int REFINE_BY_ENTRY = 1;
  static final int REFINE_NONE;
  private boolean mClosed = false;
  private final int mCommitIconResId;
  private int mFlagsCol;
  private int mIconName1Col;
  private int mIconName2Col;
  private final WeakHashMap mOutsideDrawablesCache;
  private final Context mProviderContext;
  private int mQueryRefinement;
  private final SearchManager mSearchManager;
  private final SearchView mSearchView;
  private final SearchableInfo mSearchable;
  private int mText1Col;
  private int mText2Col;
  private int mText2UrlCol;
  private ColorStateList mUrlColor;
  
  public SuggestionsAdapter(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap paramWeakHashMap)
  {
    super(paramContext, k, null, i);
    this.mQueryRefinement = i;
    this.mText1Col = j;
    this.mText2Col = j;
    this.mText2UrlCol = j;
    this.mIconName1Col = j;
    this.mIconName2Col = j;
    this.mFlagsCol = j;
    SearchManager localSearchManager = (SearchManager)this.mContext.getSystemService("search");
    this.mSearchManager = localSearchManager;
    this.mSearchView = paramSearchView;
    this.mSearchable = paramSearchableInfo;
    k = paramSearchView.getSuggestionCommitIconResId();
    this.mCommitIconResId = k;
    this.mProviderContext = paramContext;
    this.mOutsideDrawablesCache = paramWeakHashMap;
  }
  
  private Drawable checkIconCache(String paramString)
  {
    Object localObject = (Drawable.ConstantState)this.mOutsideDrawablesCache.get(paramString);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((Drawable.ConstantState)localObject).newDrawable()) {
      return (Drawable)localObject;
    }
  }
  
  private CharSequence formatUrl(CharSequence paramCharSequence)
  {
    int i = 0;
    Object localObject1 = this.mUrlColor;
    if (localObject1 == null)
    {
      localObject1 = new android/util/TypedValue;
      ((TypedValue)localObject1).<init>();
      Object localObject2 = this.mContext.getTheme();
      int j = R.attr.textColorSearchUrl;
      boolean bool = true;
      ((Resources.Theme)localObject2).resolveAttribute(j, (TypedValue)localObject1, bool);
      localObject2 = this.mContext.getResources();
      int k = ((TypedValue)localObject1).resourceId;
      localObject1 = ((Resources)localObject2).getColorStateList(k);
      this.mUrlColor = ((ColorStateList)localObject1);
    }
    SpannableString localSpannableString = new android/text/SpannableString;
    localSpannableString.<init>(paramCharSequence);
    localObject1 = new android/text/style/TextAppearanceSpan;
    ColorStateList localColorStateList = this.mUrlColor;
    ((TextAppearanceSpan)localObject1).<init>(null, 0, 0, localColorStateList, null);
    i = paramCharSequence.length();
    localSpannableString.setSpan(localObject1, 0, i, 33);
    return localSpannableString;
  }
  
  private Drawable getActivityIcon(ComponentName paramComponentName)
  {
    localObject1 = null;
    PackageManager localPackageManager = this.mContext.getPackageManager();
    int i = 128;
    try
    {
      localObject3 = localPackageManager.getActivityInfo(paramComponentName, i);
      j = ((ActivityInfo)localObject3).getIconResource();
      if (j != 0) {
        break label58;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int j;
        Object localObject3 = "SuggestionsAdapter";
        Object localObject2 = localNameNotFoundException.toString();
        Log.w((String)localObject3, (String)localObject2);
        continue;
        String str1 = paramComponentName.getPackageName();
        localObject3 = ((ActivityInfo)localObject3).applicationInfo;
        localObject2 = ((PackageManager)localObject2).getDrawable(str1, j, (ApplicationInfo)localObject3);
        if (localObject2 == null)
        {
          localObject2 = "SuggestionsAdapter";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str1 = "Invalid icon resource ";
          localObject3 = ((StringBuilder)localObject3).append(str1).append(j).append(" for ");
          String str2 = paramComponentName.flattenToShortString();
          localObject3 = str2;
          Log.w((String)localObject2, (String)localObject3);
        }
        else
        {
          localObject1 = localObject2;
        }
      }
    }
    return (Drawable)localObject1;
  }
  
  private Drawable getActivityIconWithCache(ComponentName paramComponentName)
  {
    Object localObject1 = null;
    String str = paramComponentName.flattenToShortString();
    Object localObject2 = this.mOutsideDrawablesCache;
    boolean bool = ((WeakHashMap)localObject2).containsKey(str);
    if (bool)
    {
      localObject2 = (Drawable.ConstantState)this.mOutsideDrawablesCache.get(str);
      if (localObject2 == null) {
        bool = false;
      }
      for (localObject2 = null;; localObject2 = ((Drawable.ConstantState)localObject2).newDrawable((Resources)localObject1))
      {
        return (Drawable)localObject2;
        localObject1 = this.mProviderContext.getResources();
      }
    }
    localObject2 = getActivityIcon(paramComponentName);
    if (localObject2 == null) {}
    for (;;)
    {
      WeakHashMap localWeakHashMap = this.mOutsideDrawablesCache;
      localWeakHashMap.put(str, localObject1);
      break;
      localObject1 = ((Drawable)localObject2).getConstantState();
    }
  }
  
  public static String getColumnString(Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    return getStringOrNull(paramCursor, i);
  }
  
  private Drawable getDefaultIcon1(Cursor paramCursor)
  {
    Object localObject = this.mSearchable.getSearchActivity();
    localObject = getActivityIconWithCache((ComponentName)localObject);
    if (localObject != null) {}
    for (;;)
    {
      return (Drawable)localObject;
      localObject = this.mContext.getPackageManager().getDefaultActivityIcon();
    }
  }
  
  /* Error */
  private Drawable getDrawable(Uri paramUri)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 274	android/net/Uri:getScheme	()Ljava/lang/String;
    //   4: astore_2
    //   5: ldc_w 276
    //   8: astore_3
    //   9: aload_3
    //   10: aload_2
    //   11: invokevirtual 281	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   14: istore 4
    //   16: iload 4
    //   18: ifeq +125 -> 143
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 285	android/support/v7/widget/SuggestionsAdapter:getDrawableFromResourceUri	(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    //   26: astore_2
    //   27: aload_2
    //   28: areturn
    //   29: astore_2
    //   30: new 287	java/io/FileNotFoundException
    //   33: astore_2
    //   34: new 210	java/lang/StringBuilder
    //   37: astore_3
    //   38: aload_3
    //   39: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   42: ldc_w 289
    //   45: astore 5
    //   47: aload_3
    //   48: aload 5
    //   50: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: astore_3
    //   54: aload_3
    //   55: aload_1
    //   56: invokevirtual 292	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   59: astore_3
    //   60: aload_3
    //   61: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: astore_3
    //   65: aload_2
    //   66: aload_3
    //   67: invokespecial 295	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   70: aload_2
    //   71: athrow
    //   72: astore_2
    //   73: ldc 17
    //   75: astore_3
    //   76: new 210	java/lang/StringBuilder
    //   79: astore 5
    //   81: aload 5
    //   83: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   86: aload 5
    //   88: ldc_w 297
    //   91: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: aload_1
    //   95: invokevirtual 292	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   98: astore 5
    //   100: ldc_w 299
    //   103: astore 6
    //   105: aload 5
    //   107: aload 6
    //   109: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: astore 5
    //   114: aload_2
    //   115: invokevirtual 302	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   118: astore_2
    //   119: aload 5
    //   121: aload_2
    //   122: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: astore_2
    //   129: aload_3
    //   130: aload_2
    //   131: invokestatic 195	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   134: pop
    //   135: iconst_0
    //   136: istore 4
    //   138: aconst_null
    //   139: astore_2
    //   140: goto -113 -> 27
    //   143: aload_0
    //   144: getfield 98	android/support/v7/widget/SuggestionsAdapter:mProviderContext	Landroid/content/Context;
    //   147: astore_2
    //   148: aload_2
    //   149: invokevirtual 306	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   152: astore_2
    //   153: aload_2
    //   154: aload_1
    //   155: invokevirtual 312	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   158: astore_3
    //   159: aload_3
    //   160: ifnonnull +45 -> 205
    //   163: new 287	java/io/FileNotFoundException
    //   166: astore_2
    //   167: new 210	java/lang/StringBuilder
    //   170: astore_3
    //   171: aload_3
    //   172: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   175: ldc_w 314
    //   178: astore 5
    //   180: aload_3
    //   181: aload 5
    //   183: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: astore_3
    //   187: aload_3
    //   188: aload_1
    //   189: invokevirtual 292	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   192: astore_3
    //   193: aload_3
    //   194: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: astore_3
    //   198: aload_2
    //   199: aload_3
    //   200: invokespecial 295	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   203: aload_2
    //   204: athrow
    //   205: iconst_0
    //   206: istore 4
    //   208: aconst_null
    //   209: astore_2
    //   210: aload_3
    //   211: aconst_null
    //   212: invokestatic 318	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   215: astore_2
    //   216: aload_3
    //   217: invokevirtual 323	java/io/InputStream:close	()V
    //   220: goto -193 -> 27
    //   223: astore_3
    //   224: ldc 17
    //   226: astore 5
    //   228: new 210	java/lang/StringBuilder
    //   231: astore 6
    //   233: aload 6
    //   235: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   238: ldc_w 325
    //   241: astore 7
    //   243: aload 6
    //   245: aload 7
    //   247: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: astore 6
    //   252: aload 6
    //   254: aload_1
    //   255: invokevirtual 292	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   258: astore 6
    //   260: aload 6
    //   262: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: astore 6
    //   267: aload 5
    //   269: aload 6
    //   271: aload_3
    //   272: invokestatic 329	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   275: pop
    //   276: goto -249 -> 27
    //   279: astore_2
    //   280: aload_3
    //   281: invokevirtual 323	java/io/InputStream:close	()V
    //   284: aload_2
    //   285: athrow
    //   286: astore_3
    //   287: ldc 17
    //   289: astore 5
    //   291: new 210	java/lang/StringBuilder
    //   294: astore 6
    //   296: aload 6
    //   298: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   301: ldc_w 325
    //   304: astore 7
    //   306: aload 6
    //   308: aload 7
    //   310: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: astore 6
    //   315: aload 6
    //   317: aload_1
    //   318: invokevirtual 292	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   321: astore 6
    //   323: aload 6
    //   325: invokevirtual 226	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   328: astore 6
    //   330: aload 5
    //   332: aload 6
    //   334: aload_3
    //   335: invokestatic 329	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   338: pop
    //   339: goto -55 -> 284
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	this	SuggestionsAdapter
    //   0	342	1	paramUri	Uri
    //   4	24	2	localObject1	Object
    //   29	1	2	localNotFoundException	Resources.NotFoundException
    //   33	38	2	localFileNotFoundException1	FileNotFoundException
    //   72	43	2	localFileNotFoundException2	FileNotFoundException
    //   118	98	2	localObject2	Object
    //   279	6	2	localObject3	Object
    //   8	209	3	localObject4	Object
    //   223	58	3	localIOException1	java.io.IOException
    //   286	49	3	localIOException2	java.io.IOException
    //   14	193	4	bool	boolean
    //   45	286	5	localObject5	Object
    //   103	230	6	localObject6	Object
    //   241	68	7	str	String
    // Exception table:
    //   from	to	target	type
    //   22	26	29	android/content/res/Resources$NotFoundException
    //   0	4	72	java/io/FileNotFoundException
    //   10	14	72	java/io/FileNotFoundException
    //   22	26	72	java/io/FileNotFoundException
    //   30	33	72	java/io/FileNotFoundException
    //   34	37	72	java/io/FileNotFoundException
    //   38	42	72	java/io/FileNotFoundException
    //   48	53	72	java/io/FileNotFoundException
    //   55	59	72	java/io/FileNotFoundException
    //   60	64	72	java/io/FileNotFoundException
    //   66	70	72	java/io/FileNotFoundException
    //   70	72	72	java/io/FileNotFoundException
    //   143	147	72	java/io/FileNotFoundException
    //   148	152	72	java/io/FileNotFoundException
    //   154	158	72	java/io/FileNotFoundException
    //   163	166	72	java/io/FileNotFoundException
    //   167	170	72	java/io/FileNotFoundException
    //   171	175	72	java/io/FileNotFoundException
    //   181	186	72	java/io/FileNotFoundException
    //   188	192	72	java/io/FileNotFoundException
    //   193	197	72	java/io/FileNotFoundException
    //   199	203	72	java/io/FileNotFoundException
    //   203	205	72	java/io/FileNotFoundException
    //   216	220	72	java/io/FileNotFoundException
    //   228	231	72	java/io/FileNotFoundException
    //   233	238	72	java/io/FileNotFoundException
    //   245	250	72	java/io/FileNotFoundException
    //   254	258	72	java/io/FileNotFoundException
    //   260	265	72	java/io/FileNotFoundException
    //   271	276	72	java/io/FileNotFoundException
    //   280	284	72	java/io/FileNotFoundException
    //   284	286	72	java/io/FileNotFoundException
    //   291	294	72	java/io/FileNotFoundException
    //   296	301	72	java/io/FileNotFoundException
    //   308	313	72	java/io/FileNotFoundException
    //   317	321	72	java/io/FileNotFoundException
    //   323	328	72	java/io/FileNotFoundException
    //   334	339	72	java/io/FileNotFoundException
    //   216	220	223	java/io/IOException
    //   211	215	279	finally
    //   280	284	286	java/io/IOException
  }
  
  private Drawable getDrawableFromResourceValue(String paramString)
  {
    if (paramString != null)
    {
      bool = paramString.isEmpty();
      if (!bool)
      {
        localObject1 = "0";
        bool = ((String)localObject1).equals(paramString);
        if (!bool) {
          break label33;
        }
      }
    }
    boolean bool = false;
    Object localObject1 = null;
    for (;;)
    {
      return (Drawable)localObject1;
      try
      {
        label33:
        int i = Integer.parseInt(paramString);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject4 = "android.resource://";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject4 = this.mProviderContext;
        localObject4 = ((Context)localObject4).getPackageName();
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject4 = "/";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject1 = ((StringBuilder)localObject1).append(i);
        localObject4 = ((StringBuilder)localObject1).toString();
        localObject1 = checkIconCache((String)localObject4);
        if (localObject1 == null)
        {
          localObject1 = this.mProviderContext;
          localObject1 = b.a((Context)localObject1, i);
          storeInIconCache((String)localObject4, (Drawable)localObject1);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Object localObject2 = checkIconCache(paramString);
        if (localObject2 == null)
        {
          localObject2 = Uri.parse(paramString);
          localObject2 = getDrawable((Uri)localObject2);
          storeInIconCache(paramString, (Drawable)localObject2);
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        Object localObject4 = "Icon resource not found: ";
        localObject5 = (String)localObject4 + paramString;
        Log.w("SuggestionsAdapter", (String)localObject5);
        bool = false;
        Object localObject3 = null;
      }
    }
  }
  
  private Drawable getIcon1(Cursor paramCursor)
  {
    int i = this.mIconName1Col;
    int j = -1;
    Object localObject;
    if (i == j)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (Drawable)localObject;
      i = this.mIconName1Col;
      localObject = paramCursor.getString(i);
      localObject = getDrawableFromResourceValue((String)localObject);
      if (localObject == null) {
        localObject = getDefaultIcon1(paramCursor);
      }
    }
  }
  
  private Drawable getIcon2(Cursor paramCursor)
  {
    int i = this.mIconName2Col;
    int j = -1;
    if (i == j) {
      i = 0;
    }
    for (Object localObject = null;; localObject = getDrawableFromResourceValue((String)localObject))
    {
      return (Drawable)localObject;
      i = this.mIconName2Col;
      localObject = paramCursor.getString(i);
    }
  }
  
  private static String getStringOrNull(Cursor paramCursor, int paramInt)
  {
    String str1 = null;
    int i = -1;
    if (paramInt == i) {}
    for (;;)
    {
      return str1;
      try
      {
        str1 = paramCursor.getString(paramInt);
      }
      catch (Exception localException)
      {
        String str2 = "SuggestionsAdapter";
        String str3 = "unexpected error retrieving valid column from cursor, did the remote process die?";
        Log.e(str2, str3, localException);
      }
    }
  }
  
  private void setViewDrawable(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null) {
      paramImageView.setVisibility(paramInt);
    }
    for (;;)
    {
      return;
      paramImageView.setVisibility(0);
      paramDrawable.setVisible(false, false);
      boolean bool = true;
      paramDrawable.setVisible(bool, false);
    }
  }
  
  private void setViewText(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    int i;
    if (bool)
    {
      i = 8;
      paramTextView.setVisibility(i);
    }
    for (;;)
    {
      return;
      i = 0;
      paramTextView.setVisibility(0);
    }
  }
  
  private void storeInIconCache(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      WeakHashMap localWeakHashMap = this.mOutsideDrawablesCache;
      Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
      localWeakHashMap.put(paramString, localConstantState);
    }
  }
  
  private void updateSpinnerState(Cursor paramCursor)
  {
    if (paramCursor != null) {}
    for (Bundle localBundle = paramCursor.getExtras();; localBundle = null)
    {
      if (localBundle != null)
      {
        String str = "in_progress";
        bool = localBundle.getBoolean(str);
        if (!bool) {}
      }
      return;
      boolean bool = false;
    }
  }
  
  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = 8;
    int j = 2;
    int k = 1;
    CharSequence localCharSequence = null;
    Object localObject1 = (SuggestionsAdapter.ChildViewCache)paramView.getTag();
    int m = this.mFlagsCol;
    int n = -1;
    if (m != n)
    {
      m = this.mFlagsCol;
      m = paramCursor.getInt(m);
    }
    for (;;)
    {
      Object localObject2 = ((SuggestionsAdapter.ChildViewCache)localObject1).mText1;
      Object localObject3;
      if (localObject2 != null)
      {
        n = this.mText1Col;
        localObject2 = getStringOrNull(paramCursor, n);
        localObject3 = ((SuggestionsAdapter.ChildViewCache)localObject1).mText1;
        setViewText((TextView)localObject3, (CharSequence)localObject2);
      }
      localObject2 = ((SuggestionsAdapter.ChildViewCache)localObject1).mText2;
      if (localObject2 != null)
      {
        n = this.mText2UrlCol;
        localObject2 = getStringOrNull(paramCursor, n);
        if (localObject2 != null)
        {
          localObject2 = formatUrl((CharSequence)localObject2);
          boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
          if (!bool) {
            break label372;
          }
          localObject3 = ((SuggestionsAdapter.ChildViewCache)localObject1).mText1;
          if (localObject3 != null)
          {
            ((SuggestionsAdapter.ChildViewCache)localObject1).mText1.setSingleLine(false);
            localObject3 = ((SuggestionsAdapter.ChildViewCache)localObject1).mText1;
            ((TextView)localObject3).setMaxLines(j);
          }
          label181:
          localObject3 = ((SuggestionsAdapter.ChildViewCache)localObject1).mText2;
          setViewText((TextView)localObject3, (CharSequence)localObject2);
        }
      }
      else
      {
        localObject2 = ((SuggestionsAdapter.ChildViewCache)localObject1).mIcon1;
        if (localObject2 != null)
        {
          localObject2 = ((SuggestionsAdapter.ChildViewCache)localObject1).mIcon1;
          localObject3 = getIcon1(paramCursor);
          int i2 = 4;
          setViewDrawable((ImageView)localObject2, (Drawable)localObject3, i2);
        }
        localObject2 = ((SuggestionsAdapter.ChildViewCache)localObject1).mIcon2;
        if (localObject2 != null)
        {
          localObject2 = ((SuggestionsAdapter.ChildViewCache)localObject1).mIcon2;
          localObject3 = getIcon2(paramCursor);
          setViewDrawable((ImageView)localObject2, (Drawable)localObject3, i);
        }
        n = this.mQueryRefinement;
        if (n != j)
        {
          n = this.mQueryRefinement;
          if (n != k) {
            break label411;
          }
          m &= 0x1;
          if (m == 0) {
            break label411;
          }
        }
        ((SuggestionsAdapter.ChildViewCache)localObject1).mIconRefine.setVisibility(0);
        localImageView = ((SuggestionsAdapter.ChildViewCache)localObject1).mIconRefine;
        localCharSequence = ((SuggestionsAdapter.ChildViewCache)localObject1).mText1.getText();
        localImageView.setTag(localCharSequence);
        localObject1 = ((SuggestionsAdapter.ChildViewCache)localObject1).mIconRefine;
        ((ImageView)localObject1).setOnClickListener(this);
      }
      for (;;)
      {
        return;
        int i1 = this.mText2Col;
        localObject2 = getStringOrNull(paramCursor, i1);
        break;
        label372:
        localObject3 = ((SuggestionsAdapter.ChildViewCache)localObject1).mText1;
        if (localObject3 == null) {
          break label181;
        }
        ((SuggestionsAdapter.ChildViewCache)localObject1).mText1.setSingleLine(k);
        localObject3 = ((SuggestionsAdapter.ChildViewCache)localObject1).mText1;
        ((TextView)localObject3).setMaxLines(k);
        break label181;
        label411:
        localObject1 = ((SuggestionsAdapter.ChildViewCache)localObject1).mIconRefine;
        ((ImageView)localObject1).setVisibility(i);
      }
      m = 0;
      ImageView localImageView = null;
    }
  }
  
  public void changeCursor(Cursor paramCursor)
  {
    boolean bool = this.mClosed;
    String str1;
    String str2;
    if (bool)
    {
      str1 = "SuggestionsAdapter";
      str2 = "Tried to change cursor after adapter was closed.";
      Log.w(str1, str2);
      if (paramCursor != null) {
        paramCursor.close();
      }
    }
    for (;;)
    {
      return;
      try
      {
        super.changeCursor(paramCursor);
        if (paramCursor != null)
        {
          str1 = "suggest_text_1";
          int i = paramCursor.getColumnIndex(str1);
          this.mText1Col = i;
          str1 = "suggest_text_2";
          i = paramCursor.getColumnIndex(str1);
          this.mText2Col = i;
          str1 = "suggest_text_2_url";
          i = paramCursor.getColumnIndex(str1);
          this.mText2UrlCol = i;
          str1 = "suggest_icon_1";
          i = paramCursor.getColumnIndex(str1);
          this.mIconName1Col = i;
          str1 = "suggest_icon_2";
          i = paramCursor.getColumnIndex(str1);
          this.mIconName2Col = i;
          str1 = "suggest_flags";
          i = paramCursor.getColumnIndex(str1);
          this.mFlagsCol = i;
        }
      }
      catch (Exception localException)
      {
        str2 = "SuggestionsAdapter";
        String str3 = "error changing cursor and caching columns";
        Log.e(str2, str3, localException);
      }
    }
  }
  
  public void close()
  {
    changeCursor(null);
    this.mClosed = true;
  }
  
  public CharSequence convertToString(Cursor paramCursor)
  {
    Object localObject1 = null;
    if (paramCursor == null) {}
    for (;;)
    {
      return (CharSequence)localObject1;
      Object localObject2 = getColumnString(paramCursor, "suggest_intent_query");
      if (localObject2 != null)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = this.mSearchable;
        boolean bool = ((SearchableInfo)localObject2).shouldRewriteQueryFromData();
        if (bool)
        {
          localObject2 = getColumnString(paramCursor, "suggest_intent_data");
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            continue;
          }
        }
        localObject2 = this.mSearchable;
        bool = ((SearchableInfo)localObject2).shouldRewriteQueryFromText();
        if (bool)
        {
          localObject2 = getColumnString(paramCursor, "suggest_text_1");
          if (localObject2 != null) {
            localObject1 = localObject2;
          }
        }
      }
    }
  }
  
  Drawable getDrawableFromResourceUri(Uri paramUri)
  {
    int i = 1;
    String str = paramUri.getAuthority();
    boolean bool = TextUtils.isEmpty(str);
    Object localObject1;
    Object localObject4;
    if (bool)
    {
      localObject1 = new java/io/FileNotFoundException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "No authority: " + paramUri;
      ((FileNotFoundException)localObject1).<init>((String)localObject4);
      throw ((Throwable)localObject1);
    }
    Resources localResources;
    Object localObject2;
    try
    {
      localObject1 = this.mContext;
      localObject1 = ((Context)localObject1).getPackageManager();
      localResources = ((PackageManager)localObject1).getResourcesForApplication(str);
      localObject4 = paramUri.getPathSegments();
      if (localObject4 == null)
      {
        localObject1 = new java/io/FileNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = "No path: " + paramUri;
        ((FileNotFoundException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject2 = new java/io/FileNotFoundException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "No package found for authority: " + paramUri;
      ((FileNotFoundException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
    }
    int j = ((List)localObject4).size();
    if (j == i)
    {
      j = 0;
      localObject2 = null;
    }
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject2 = ((List)localObject4).get(0);
        localObject2 = (String)localObject2;
        j = Integer.parseInt((String)localObject2);
        if (j != 0) {
          break;
        }
        localObject2 = new java/io/FileNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = "No resource found for: " + paramUri;
        ((FileNotFoundException)localObject2).<init>((String)localObject4);
        throw ((Throwable)localObject2);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject3 = new java/io/FileNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = "Single path segment is not a resource ID: " + paramUri;
        ((FileNotFoundException)localObject3).<init>((String)localObject4);
        throw ((Throwable)localObject3);
      }
      int k = 2;
      if (j == k)
      {
        localObject3 = (String)((List)localObject4).get(i);
        localObject4 = (String)((List)localObject4).get(0);
        j = localResources.getIdentifier((String)localObject3, (String)localObject4, str);
      }
      else
      {
        localObject3 = new java/io/FileNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = "More than two path segments: " + paramUri;
        ((FileNotFoundException)localObject3).<init>((String)localObject4);
        throw ((Throwable)localObject3);
      }
    }
    return localResources.getDrawable(j);
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      localObject1 = super.getDropDownView(paramInt, paramView, paramViewGroup);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", localRuntimeException);
        Object localObject1 = this.mContext;
        Object localObject2 = this.mCursor;
        localObject2 = newDropDownView((Context)localObject1, (Cursor)localObject2, paramViewGroup);
        if (localObject2 != null)
        {
          localObject1 = ((SuggestionsAdapter.ChildViewCache)((View)localObject2).getTag()).mText1;
          String str = localRuntimeException.toString();
          ((TextView)localObject1).setText(str);
        }
        localObject1 = localObject2;
      }
    }
    return (View)localObject1;
  }
  
  public int getQueryRefinement()
  {
    return this.mQueryRefinement;
  }
  
  Cursor getSearchManagerSuggestions(SearchableInfo paramSearchableInfo, String paramString, int paramInt)
  {
    Cursor localCursor = null;
    if (paramSearchableInfo == null) {}
    do
    {
      return localCursor;
      localObject1 = paramSearchableInfo.getSuggestAuthority();
    } while (localObject1 == null);
    Object localObject2 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject2).<init>();
    String str1 = "content";
    Object localObject1 = ((Uri.Builder)localObject2).scheme(str1).authority((String)localObject1).query("").fragment("");
    localObject2 = paramSearchableInfo.getSuggestPath();
    if (localObject2 != null) {
      ((Uri.Builder)localObject1).appendEncodedPath((String)localObject2);
    }
    localObject2 = "search_suggest_query";
    ((Uri.Builder)localObject1).appendPath((String)localObject2);
    str1 = paramSearchableInfo.getSuggestSelection();
    String[] arrayOfString;
    if (str1 != null)
    {
      arrayOfString = new String[1];
      localObject2 = null;
      arrayOfString[0] = paramString;
    }
    for (;;)
    {
      if (paramInt > 0)
      {
        localObject2 = "limit";
        str2 = String.valueOf(paramInt);
        ((Uri.Builder)localObject1).appendQueryParameter((String)localObject2, str2);
      }
      localObject2 = ((Uri.Builder)localObject1).build();
      localObject1 = this.mContext.getContentResolver();
      String str2 = null;
      localCursor = ((ContentResolver)localObject1).query((Uri)localObject2, null, str1, arrayOfString, null);
      break;
      ((Uri.Builder)localObject1).appendPath(paramString);
      arrayOfString = null;
    }
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      localObject1 = super.getView(paramInt, paramView, paramViewGroup);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", localRuntimeException);
        Object localObject1 = this.mContext;
        Object localObject2 = this.mCursor;
        localObject2 = newView((Context)localObject1, (Cursor)localObject2, paramViewGroup);
        if (localObject2 != null)
        {
          localObject1 = ((SuggestionsAdapter.ChildViewCache)((View)localObject2).getTag()).mText1;
          String str = localRuntimeException.toString();
          ((TextView)localObject1).setText(str);
        }
        localObject1 = localObject2;
      }
    }
    return (View)localObject1;
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
  
  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = super.newView(paramContext, paramCursor, paramViewGroup);
    Object localObject = new android/support/v7/widget/SuggestionsAdapter$ChildViewCache;
    ((SuggestionsAdapter.ChildViewCache)localObject).<init>(localView);
    localView.setTag(localObject);
    int i = R.id.edit_query;
    localObject = (ImageView)localView.findViewById(i);
    int j = this.mCommitIconResId;
    ((ImageView)localObject).setImageResource(j);
    return localView;
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    Cursor localCursor = getCursor();
    updateSpinnerState(localCursor);
  }
  
  public void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    Cursor localCursor = getCursor();
    updateSpinnerState(localCursor);
  }
  
  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    boolean bool = localObject instanceof CharSequence;
    if (bool)
    {
      SearchView localSearchView = this.mSearchView;
      localObject = (CharSequence)localObject;
      localSearchView.onQueryRefine((CharSequence)localObject);
    }
  }
  
  public Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence)
  {
    Object localObject1;
    Object localObject3;
    if (paramCharSequence == null)
    {
      localObject1 = "";
      localObject3 = this.mSearchView;
      int i = ((SearchView)localObject3).getVisibility();
      if (i == 0)
      {
        localObject3 = this.mSearchView;
        i = ((SearchView)localObject3).getWindowVisibility();
        if (i == 0) {
          break label54;
        }
      }
      localObject1 = null;
    }
    for (;;)
    {
      return (Cursor)localObject1;
      localObject1 = paramCharSequence.toString();
      break;
      try
      {
        label54:
        localObject3 = this.mSearchable;
        int j = 50;
        localObject1 = getSearchManagerSuggestions((SearchableInfo)localObject3, (String)localObject1, j);
        if (localObject1 != null) {
          ((Cursor)localObject1).getCount();
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        localObject3 = "SuggestionsAdapter";
        String str = "Search suggestions query threw an exception.";
        Log.w((String)localObject3, str, localRuntimeException);
        Object localObject2 = null;
      }
    }
  }
  
  public void setQueryRefinement(int paramInt)
  {
    this.mQueryRefinement = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SuggestionsAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */