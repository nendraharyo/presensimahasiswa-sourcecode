package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.r;
import android.support.v4.widget.d;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.string;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.CollapsibleActionView;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView.OnEditorActionListener;
import java.util.WeakHashMap;

public class SearchView
  extends LinearLayoutCompat
  implements CollapsibleActionView
{
  static final boolean DBG = false;
  static final SearchView.AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER;
  private static final String IME_OPTION_NO_MICROPHONE = "nm";
  static final String LOG_TAG = "SearchView";
  private Bundle mAppSearchData;
  private boolean mClearingFocus;
  final ImageView mCloseButton;
  private final ImageView mCollapsedIcon;
  private int mCollapsedImeOptions;
  private final CharSequence mDefaultQueryHint;
  private final View mDropDownAnchor;
  private boolean mExpandedInActionView;
  final ImageView mGoButton;
  private boolean mIconified;
  private boolean mIconifiedByDefault;
  private int mMaxWidth;
  private CharSequence mOldQueryText;
  private final View.OnClickListener mOnClickListener;
  private SearchView.OnCloseListener mOnCloseListener;
  private final TextView.OnEditorActionListener mOnEditorActionListener;
  private final AdapterView.OnItemClickListener mOnItemClickListener;
  private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
  private SearchView.OnQueryTextListener mOnQueryChangeListener;
  View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
  private View.OnClickListener mOnSearchClickListener;
  private SearchView.OnSuggestionListener mOnSuggestionListener;
  private final WeakHashMap mOutsideDrawablesCache;
  private CharSequence mQueryHint;
  private boolean mQueryRefinement;
  private Runnable mReleaseCursorRunnable;
  final ImageView mSearchButton;
  private final View mSearchEditFrame;
  private final Drawable mSearchHintIcon;
  private final View mSearchPlate;
  final SearchView.SearchAutoComplete mSearchSrcTextView;
  private Rect mSearchSrcTextViewBounds;
  private Rect mSearchSrtTextViewBoundsExpanded;
  SearchableInfo mSearchable;
  private final View mSubmitArea;
  private boolean mSubmitButtonEnabled;
  private final int mSuggestionCommitIconResId;
  private final int mSuggestionRowLayout;
  d mSuggestionsAdapter;
  private int[] mTemp;
  private int[] mTemp2;
  View.OnKeyListener mTextKeyListener;
  private TextWatcher mTextWatcher;
  private SearchView.UpdatableTouchDelegate mTouchDelegate;
  private final Runnable mUpdateDrawableStateRunnable;
  private CharSequence mUserQuery;
  private final Intent mVoiceAppSearchIntent;
  final ImageView mVoiceButton;
  private boolean mVoiceButtonEnabled;
  private final Intent mVoiceWebSearchIntent;
  
  static
  {
    SearchView.AutoCompleteTextViewReflector localAutoCompleteTextViewReflector = new android/support/v7/widget/SearchView$AutoCompleteTextViewReflector;
    localAutoCompleteTextViewReflector.<init>();
    HIDDEN_METHOD_INVOKER = localAutoCompleteTextViewReflector;
  }
  
  public SearchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mSearchSrcTextViewBounds = ((Rect)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mSearchSrtTextViewBoundsExpanded = ((Rect)localObject1);
    localObject1 = new int[j];
    this.mTemp = ((int[])localObject1);
    localObject1 = new int[j];
    this.mTemp2 = ((int[])localObject1);
    localObject1 = new android/support/v7/widget/SearchView$1;
    ((SearchView.1)localObject1).<init>(this);
    this.mUpdateDrawableStateRunnable = ((Runnable)localObject1);
    localObject1 = new android/support/v7/widget/SearchView$2;
    ((SearchView.2)localObject1).<init>(this);
    this.mReleaseCursorRunnable = ((Runnable)localObject1);
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    this.mOutsideDrawablesCache = ((WeakHashMap)localObject1);
    localObject1 = new android/support/v7/widget/SearchView$5;
    ((SearchView.5)localObject1).<init>(this);
    this.mOnClickListener = ((View.OnClickListener)localObject1);
    localObject1 = new android/support/v7/widget/SearchView$6;
    ((SearchView.6)localObject1).<init>(this);
    this.mTextKeyListener = ((View.OnKeyListener)localObject1);
    localObject1 = new android/support/v7/widget/SearchView$7;
    ((SearchView.7)localObject1).<init>(this);
    this.mOnEditorActionListener = ((TextView.OnEditorActionListener)localObject1);
    localObject1 = new android/support/v7/widget/SearchView$8;
    ((SearchView.8)localObject1).<init>(this);
    this.mOnItemClickListener = ((AdapterView.OnItemClickListener)localObject1);
    localObject1 = new android/support/v7/widget/SearchView$9;
    ((SearchView.9)localObject1).<init>(this);
    this.mOnItemSelectedListener = ((AdapterView.OnItemSelectedListener)localObject1);
    localObject1 = new android/support/v7/widget/SearchView$10;
    ((SearchView.10)localObject1).<init>(this);
    this.mTextWatcher = ((TextWatcher)localObject1);
    localObject1 = R.styleable.SearchView;
    Object localObject2 = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject1, paramInt, 0);
    localObject1 = LayoutInflater.from(paramContext);
    int m = R.styleable.SearchView_layout;
    int n = R.layout.abc_search_view;
    m = ((TintTypedArray)localObject2).getResourceId(m, n);
    ((LayoutInflater)localObject1).inflate(m, this, bool1);
    int i1 = R.id.search_src_text;
    localObject1 = (SearchView.SearchAutoComplete)findViewById(i1);
    this.mSearchSrcTextView = ((SearchView.SearchAutoComplete)localObject1);
    this.mSearchSrcTextView.setSearchView(this);
    i1 = R.id.search_edit_frame;
    localObject1 = findViewById(i1);
    this.mSearchEditFrame = ((View)localObject1);
    i1 = R.id.search_plate;
    localObject1 = findViewById(i1);
    this.mSearchPlate = ((View)localObject1);
    i1 = R.id.submit_area;
    localObject1 = findViewById(i1);
    this.mSubmitArea = ((View)localObject1);
    i1 = R.id.search_button;
    localObject1 = (ImageView)findViewById(i1);
    this.mSearchButton = ((ImageView)localObject1);
    i1 = R.id.search_go_btn;
    localObject1 = (ImageView)findViewById(i1);
    this.mGoButton = ((ImageView)localObject1);
    i1 = R.id.search_close_btn;
    localObject1 = (ImageView)findViewById(i1);
    this.mCloseButton = ((ImageView)localObject1);
    i1 = R.id.search_voice_btn;
    localObject1 = (ImageView)findViewById(i1);
    this.mVoiceButton = ((ImageView)localObject1);
    i1 = R.id.search_mag_icon;
    localObject1 = (ImageView)findViewById(i1);
    this.mCollapsedIcon = ((ImageView)localObject1);
    localObject1 = this.mSearchPlate;
    m = R.styleable.SearchView_queryBackground;
    Object localObject3 = ((TintTypedArray)localObject2).getDrawable(m);
    r.a((View)localObject1, (Drawable)localObject3);
    localObject1 = this.mSubmitArea;
    m = R.styleable.SearchView_submitBackground;
    localObject3 = ((TintTypedArray)localObject2).getDrawable(m);
    r.a((View)localObject1, (Drawable)localObject3);
    localObject1 = this.mSearchButton;
    m = R.styleable.SearchView_searchIcon;
    localObject3 = ((TintTypedArray)localObject2).getDrawable(m);
    ((ImageView)localObject1).setImageDrawable((Drawable)localObject3);
    localObject1 = this.mGoButton;
    m = R.styleable.SearchView_goIcon;
    localObject3 = ((TintTypedArray)localObject2).getDrawable(m);
    ((ImageView)localObject1).setImageDrawable((Drawable)localObject3);
    localObject1 = this.mCloseButton;
    m = R.styleable.SearchView_closeIcon;
    localObject3 = ((TintTypedArray)localObject2).getDrawable(m);
    ((ImageView)localObject1).setImageDrawable((Drawable)localObject3);
    localObject1 = this.mVoiceButton;
    m = R.styleable.SearchView_voiceIcon;
    localObject3 = ((TintTypedArray)localObject2).getDrawable(m);
    ((ImageView)localObject1).setImageDrawable((Drawable)localObject3);
    localObject1 = this.mCollapsedIcon;
    m = R.styleable.SearchView_searchIcon;
    localObject3 = ((TintTypedArray)localObject2).getDrawable(m);
    ((ImageView)localObject1).setImageDrawable((Drawable)localObject3);
    i1 = R.styleable.SearchView_searchHintIcon;
    localObject1 = ((TintTypedArray)localObject2).getDrawable(i1);
    this.mSearchHintIcon = ((Drawable)localObject1);
    localObject1 = this.mSearchButton;
    localObject3 = getResources();
    n = R.string.abc_searchview_description_search;
    localObject3 = ((Resources)localObject3).getString(n);
    TooltipCompat.setTooltipText((View)localObject1, (CharSequence)localObject3);
    i1 = R.styleable.SearchView_suggestionRowLayout;
    m = R.layout.abc_search_dropdown_item_icons_2line;
    i1 = ((TintTypedArray)localObject2).getResourceId(i1, m);
    this.mSuggestionRowLayout = i1;
    i1 = R.styleable.SearchView_commitIcon;
    i1 = ((TintTypedArray)localObject2).getResourceId(i1, 0);
    this.mSuggestionCommitIconResId = i1;
    localObject1 = this.mSearchButton;
    localObject3 = this.mOnClickListener;
    ((ImageView)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    localObject1 = this.mCloseButton;
    localObject3 = this.mOnClickListener;
    ((ImageView)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    localObject1 = this.mGoButton;
    localObject3 = this.mOnClickListener;
    ((ImageView)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    localObject1 = this.mVoiceButton;
    localObject3 = this.mOnClickListener;
    ((ImageView)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    localObject1 = this.mSearchSrcTextView;
    localObject3 = this.mOnClickListener;
    ((SearchView.SearchAutoComplete)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    localObject1 = this.mSearchSrcTextView;
    localObject3 = this.mTextWatcher;
    ((SearchView.SearchAutoComplete)localObject1).addTextChangedListener((TextWatcher)localObject3);
    localObject1 = this.mSearchSrcTextView;
    localObject3 = this.mOnEditorActionListener;
    ((SearchView.SearchAutoComplete)localObject1).setOnEditorActionListener((TextView.OnEditorActionListener)localObject3);
    localObject1 = this.mSearchSrcTextView;
    localObject3 = this.mOnItemClickListener;
    ((SearchView.SearchAutoComplete)localObject1).setOnItemClickListener((AdapterView.OnItemClickListener)localObject3);
    localObject1 = this.mSearchSrcTextView;
    localObject3 = this.mOnItemSelectedListener;
    ((SearchView.SearchAutoComplete)localObject1).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject3);
    localObject1 = this.mSearchSrcTextView;
    localObject3 = this.mTextKeyListener;
    ((SearchView.SearchAutoComplete)localObject1).setOnKeyListener((View.OnKeyListener)localObject3);
    localObject1 = this.mSearchSrcTextView;
    localObject3 = new android/support/v7/widget/SearchView$3;
    ((SearchView.3)localObject3).<init>(this);
    ((SearchView.SearchAutoComplete)localObject1).setOnFocusChangeListener((View.OnFocusChangeListener)localObject3);
    i1 = R.styleable.SearchView_iconifiedByDefault;
    boolean bool2 = ((TintTypedArray)localObject2).getBoolean(i1, bool1);
    setIconifiedByDefault(bool2);
    int i2 = R.styleable.SearchView_android_maxWidth;
    i2 = ((TintTypedArray)localObject2).getDimensionPixelSize(i2, k);
    if (i2 != k) {
      setMaxWidth(i2);
    }
    i2 = R.styleable.SearchView_defaultQueryHint;
    localObject1 = ((TintTypedArray)localObject2).getText(i2);
    this.mDefaultQueryHint = ((CharSequence)localObject1);
    i2 = R.styleable.SearchView_queryHint;
    localObject1 = ((TintTypedArray)localObject2).getText(i2);
    this.mQueryHint = ((CharSequence)localObject1);
    i2 = R.styleable.SearchView_android_imeOptions;
    i2 = ((TintTypedArray)localObject2).getInt(i2, k);
    if (i2 != k) {
      setImeOptions(i2);
    }
    i2 = R.styleable.SearchView_android_inputType;
    i2 = ((TintTypedArray)localObject2).getInt(i2, k);
    if (i2 != k) {
      setInputType(i2);
    }
    i2 = R.styleable.SearchView_android_focusable;
    boolean bool3 = ((TintTypedArray)localObject2).getBoolean(i2, bool1);
    setFocusable(bool3);
    ((TintTypedArray)localObject2).recycle();
    localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("android.speech.action.WEB_SEARCH");
    this.mVoiceWebSearchIntent = ((Intent)localObject1);
    this.mVoiceWebSearchIntent.addFlags(i);
    localObject1 = this.mVoiceWebSearchIntent;
    localObject3 = "web_search";
    ((Intent)localObject1).putExtra("android.speech.extra.LANGUAGE_MODEL", (String)localObject3);
    localObject1 = new android/content/Intent;
    localObject2 = "android.speech.action.RECOGNIZE_SPEECH";
    ((Intent)localObject1).<init>((String)localObject2);
    this.mVoiceAppSearchIntent = ((Intent)localObject1);
    this.mVoiceAppSearchIntent.addFlags(i);
    int i3 = this.mSearchSrcTextView.getDropDownAnchor();
    localObject1 = findViewById(i3);
    this.mDropDownAnchor = ((View)localObject1);
    localObject1 = this.mDropDownAnchor;
    if (localObject1 != null)
    {
      localObject1 = this.mDropDownAnchor;
      localObject2 = new android/support/v7/widget/SearchView$4;
      ((SearchView.4)localObject2).<init>(this);
      ((View)localObject1).addOnLayoutChangeListener((View.OnLayoutChangeListener)localObject2);
    }
    boolean bool4 = this.mIconifiedByDefault;
    updateViewsVisibility(bool4);
    updateQueryHint();
  }
  
  private Intent createIntent(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramString1);
    int i = 268435456;
    localIntent.addFlags(i);
    if (paramUri != null) {
      localIntent.setData(paramUri);
    }
    Object localObject1 = "user_query";
    Object localObject2 = this.mUserQuery;
    localIntent.putExtra((String)localObject1, (CharSequence)localObject2);
    if (paramString3 != null)
    {
      localObject1 = "query";
      localIntent.putExtra((String)localObject1, paramString3);
    }
    if (paramString2 != null)
    {
      localObject1 = "intent_extra_data_key";
      localIntent.putExtra((String)localObject1, paramString2);
    }
    localObject1 = this.mAppSearchData;
    if (localObject1 != null)
    {
      localObject1 = "app_data";
      localObject2 = this.mAppSearchData;
      localIntent.putExtra((String)localObject1, (Bundle)localObject2);
    }
    if (paramInt != 0)
    {
      localIntent.putExtra("action_key", paramInt);
      localObject1 = "action_msg";
      localIntent.putExtra((String)localObject1, paramString4);
    }
    localObject1 = this.mSearchable.getSearchActivity();
    localIntent.setComponent((ComponentName)localObject1);
    return localIntent;
  }
  
  private Intent createIntentFromSuggestion(Cursor paramCursor, int paramInt, String paramString)
  {
    for (Object localObject1 = "suggest_intent_action";; localObject2 = null)
    {
      try
      {
        Object localObject3 = SuggestionsAdapter.getColumnString(paramCursor, (String)localObject1);
        if (localObject3 == null)
        {
          localObject1 = this.mSearchable;
          localObject3 = ((SearchableInfo)localObject1).getSuggestIntentAction();
        }
        if (localObject3 == null) {
          localObject3 = "android.intent.action.SEARCH";
        }
        localObject1 = "suggest_intent_data";
        localObject1 = SuggestionsAdapter.getColumnString(paramCursor, (String)localObject1);
        if (localObject1 == null)
        {
          localObject1 = this.mSearchable;
          localObject1 = ((SearchableInfo)localObject1).getSuggestIntentData();
        }
        Object localObject5;
        if (localObject1 != null)
        {
          localObject4 = "suggest_intent_data_id";
          localObject4 = SuggestionsAdapter.getColumnString(paramCursor, (String)localObject4);
          if (localObject4 != null)
          {
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
            localObject5 = "/";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
            localObject4 = Uri.encode((String)localObject4);
            localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
            localObject1 = ((StringBuilder)localObject1).toString();
          }
        }
        if (localObject1 == null) {}
        String str;
        for (Object localObject4 = null;; localObject4 = Uri.parse((String)localObject1))
        {
          localObject1 = "suggest_intent_query";
          str = SuggestionsAdapter.getColumnString(paramCursor, (String)localObject1);
          localObject1 = "suggest_intent_extra_data";
          localObject5 = SuggestionsAdapter.getColumnString(paramCursor, (String)localObject1);
          localObject1 = this;
          localObject1 = createIntent((String)localObject3, (Uri)localObject4, (String)localObject5, str, paramInt, paramString);
          return (Intent)localObject1;
        }
        try
        {
          i = paramCursor.getPosition();
        }
        catch (RuntimeException localRuntimeException2)
        {
          for (;;)
          {
            Object localObject2;
            int i = -1;
          }
        }
      }
      catch (RuntimeException localRuntimeException1)
      {
        localObject3 = localRuntimeException1;
      }
      localObject4 = "SearchView";
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      str = "Search suggestions cursor at row ";
      localObject2 = ((StringBuilder)localObject5).append(str).append(i);
      localObject5 = " returned exception.";
      localObject2 = (String)localObject5;
      Log.w((String)localObject4, (String)localObject2, (Throwable)localObject3);
      i = 0;
    }
  }
  
  private Intent createVoiceAppSearchIntent(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    String str1 = null;
    ComponentName localComponentName = paramSearchableInfo.getSearchActivity();
    Object localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("android.intent.action.SEARCH");
    ((Intent)localObject1).setComponent(localComponentName);
    Object localObject2 = getContext();
    Object localObject3 = null;
    int i = 1073741824;
    PendingIntent localPendingIntent = PendingIntent.getActivity((Context)localObject2, 0, (Intent)localObject1, i);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localObject1 = this.mAppSearchData;
    if (localObject1 != null)
    {
      localObject1 = "app_data";
      localObject2 = this.mAppSearchData;
      localBundle.putParcelable((String)localObject1, (Parcelable)localObject2);
    }
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramIntent);
    localObject1 = "free_form";
    i = 1;
    localObject3 = getResources();
    int j = paramSearchableInfo.getVoiceLanguageModeId();
    if (j != 0)
    {
      int k = paramSearchableInfo.getVoiceLanguageModeId();
      localObject1 = ((Resources)localObject3).getString(k);
    }
    j = paramSearchableInfo.getVoicePromptTextId();
    if (j != 0) {
      j = paramSearchableInfo.getVoicePromptTextId();
    }
    for (localObject2 = ((Resources)localObject3).getString(j);; localObject2 = null)
    {
      int m = paramSearchableInfo.getVoiceLanguageId();
      if (m != 0) {
        m = paramSearchableInfo.getVoiceLanguageId();
      }
      for (localObject3 = ((Resources)localObject3).getString(m);; localObject3 = null)
      {
        m = paramSearchableInfo.getVoiceMaxResults();
        if (m != 0) {
          i = paramSearchableInfo.getVoiceMaxResults();
        }
        String str2 = "android.speech.extra.LANGUAGE_MODEL";
        localIntent.putExtra(str2, (String)localObject1);
        localIntent.putExtra("android.speech.extra.PROMPT", (String)localObject2);
        localIntent.putExtra("android.speech.extra.LANGUAGE", (String)localObject3);
        localIntent.putExtra("android.speech.extra.MAX_RESULTS", i);
        localObject1 = "calling_package";
        if (localComponentName == null) {}
        for (;;)
        {
          localIntent.putExtra((String)localObject1, str1);
          localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", localPendingIntent);
          localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", localBundle);
          return localIntent;
          str1 = localComponentName.flattenToShortString();
        }
      }
      j = 0;
    }
  }
  
  private Intent createVoiceWebSearchIntent(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramIntent);
    Object localObject = paramSearchableInfo.getSearchActivity();
    String str = "calling_package";
    if (localObject == null) {}
    for (localObject = null;; localObject = ((ComponentName)localObject).flattenToShortString())
    {
      localIntent.putExtra(str, (String)localObject);
      return localIntent;
    }
  }
  
  private void dismissSuggestions()
  {
    this.mSearchSrcTextView.dismissDropDown();
  }
  
  private void getChildBoundsWithinSearchView(View paramView, Rect paramRect)
  {
    int i = 1;
    int[] arrayOfInt = this.mTemp;
    paramView.getLocationInWindow(arrayOfInt);
    arrayOfInt = this.mTemp2;
    getLocationInWindow(arrayOfInt);
    int j = this.mTemp[i];
    int k = this.mTemp2[i];
    j -= k;
    k = this.mTemp[0];
    i = this.mTemp2[0];
    k -= i;
    i = paramView.getWidth() + k;
    int m = paramView.getHeight() + j;
    paramRect.set(k, j, i, m);
  }
  
  private CharSequence getDecoratedHint(CharSequence paramCharSequence)
  {
    int i = 0;
    boolean bool = this.mIconifiedByDefault;
    Object localObject;
    if (bool)
    {
      localObject = this.mSearchHintIcon;
      if (localObject != null) {
        break label24;
      }
    }
    for (;;)
    {
      return paramCharSequence;
      label24:
      float f = this.mSearchSrcTextView.getTextSize();
      double d1 = f;
      double d2 = 1.25D;
      d1 *= d2;
      int j = (int)d1;
      this.mSearchHintIcon.setBounds(0, 0, j, j);
      localObject = new android/text/SpannableStringBuilder;
      ((SpannableStringBuilder)localObject).<init>("   ");
      ImageSpan localImageSpan = new android/text/style/ImageSpan;
      Drawable localDrawable = this.mSearchHintIcon;
      localImageSpan.<init>(localDrawable);
      int k = 1;
      int m = 2;
      i = 33;
      ((SpannableStringBuilder)localObject).setSpan(localImageSpan, k, m, i);
      ((SpannableStringBuilder)localObject).append(paramCharSequence);
      paramCharSequence = (CharSequence)localObject;
    }
  }
  
  private int getPreferredHeight()
  {
    Resources localResources = getContext().getResources();
    int i = R.dimen.abc_search_view_preferred_height;
    return localResources.getDimensionPixelSize(i);
  }
  
  private int getPreferredWidth()
  {
    Resources localResources = getContext().getResources();
    int i = R.dimen.abc_search_view_preferred_width;
    return localResources.getDimensionPixelSize(i);
  }
  
  private boolean hasVoiceSearch()
  {
    boolean bool1 = false;
    Object localObject1 = this.mSearchable;
    Object localObject2;
    boolean bool3;
    if (localObject1 != null)
    {
      localObject1 = this.mSearchable;
      boolean bool2 = ((SearchableInfo)localObject1).getVoiceSearchEnabled();
      if (bool2)
      {
        bool2 = false;
        localObject1 = null;
        localObject2 = this.mSearchable;
        bool3 = ((SearchableInfo)localObject2).getVoiceSearchLaunchWebSearch();
        if (!bool3) {
          break label87;
        }
        localObject1 = this.mVoiceWebSearchIntent;
      }
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject2 = getContext().getPackageManager();
        int i = 65536;
        localObject1 = ((PackageManager)localObject2).resolveActivity((Intent)localObject1, i);
        if (localObject1 != null) {
          bool1 = true;
        }
      }
      return bool1;
      label87:
      localObject2 = this.mSearchable;
      bool3 = ((SearchableInfo)localObject2).getVoiceSearchLaunchRecognizer();
      if (bool3) {
        localObject1 = this.mVoiceAppSearchIntent;
      }
    }
  }
  
  static boolean isLandscapeMode(Context paramContext)
  {
    Configuration localConfiguration = paramContext.getResources().getConfiguration();
    int i = localConfiguration.orientation;
    int k = 2;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localConfiguration = null;
    }
  }
  
  private boolean isSubmitAreaEnabled()
  {
    boolean bool = this.mSubmitButtonEnabled;
    if (!bool)
    {
      bool = this.mVoiceButtonEnabled;
      if (!bool) {}
    }
    else
    {
      bool = isIconified();
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void launchIntent(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (;;)
    {
      return;
      try
      {
        Context localContext = getContext();
        localContext.startActivity(paramIntent);
      }
      catch (RuntimeException localRuntimeException)
      {
        String str1 = "SearchView";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str2 = "Failed launch activity: ";
        localObject = str2 + paramIntent;
        Log.e(str1, (String)localObject, localRuntimeException);
      }
    }
  }
  
  private boolean launchSuggestion(int paramInt1, int paramInt2, String paramString)
  {
    Object localObject = this.mSuggestionsAdapter.getCursor();
    boolean bool2;
    if (localObject != null)
    {
      boolean bool1 = ((Cursor)localObject).moveToPosition(paramInt1);
      if (bool1)
      {
        localObject = createIntentFromSuggestion((Cursor)localObject, paramInt2, paramString);
        launchIntent((Intent)localObject);
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  private void postUpdateFocusedState()
  {
    Runnable localRunnable = this.mUpdateDrawableStateRunnable;
    post(localRunnable);
  }
  
  private void rewriteQueryFromSuggestion(int paramInt)
  {
    Editable localEditable = this.mSearchSrcTextView.getText();
    Object localObject = this.mSuggestionsAdapter.getCursor();
    if (localObject == null) {}
    for (;;)
    {
      return;
      boolean bool = ((Cursor)localObject).moveToPosition(paramInt);
      if (bool)
      {
        d locald = this.mSuggestionsAdapter;
        localObject = locald.convertToString((Cursor)localObject);
        if (localObject != null) {
          setQuery((CharSequence)localObject);
        } else {
          setQuery(localEditable);
        }
      }
      else
      {
        setQuery(localEditable);
      }
    }
  }
  
  private void setQuery(CharSequence paramCharSequence)
  {
    SearchView.SearchAutoComplete localSearchAutoComplete1 = this.mSearchSrcTextView;
    localSearchAutoComplete1.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete2 = this.mSearchSrcTextView;
    int i = TextUtils.isEmpty(paramCharSequence);
    if (i != 0)
    {
      i = 0;
      localSearchAutoComplete1 = null;
    }
    for (;;)
    {
      localSearchAutoComplete2.setSelection(i);
      return;
      int j = paramCharSequence.length();
    }
  }
  
  private void updateCloseButton()
  {
    boolean bool1 = true;
    int i = 0;
    Drawable localDrawable = null;
    Editable localEditable = this.mSearchSrcTextView.getText();
    boolean bool2 = TextUtils.isEmpty(localEditable);
    if (!bool2)
    {
      bool2 = bool1;
      if (!bool2)
      {
        boolean bool3 = this.mIconifiedByDefault;
        if (!bool3) {
          break label116;
        }
        bool3 = this.mExpandedInActionView;
        if (bool3) {
          break label116;
        }
      }
      label57:
      ImageView localImageView = this.mCloseButton;
      if (!bool1) {
        break label124;
      }
      label67:
      localImageView.setVisibility(i);
      localObject = this.mCloseButton;
      localDrawable = ((ImageView)localObject).getDrawable();
      if (localDrawable != null) {
        if (!bool2) {
          break label130;
        }
      }
    }
    label116:
    label124:
    label130:
    for (Object localObject = ENABLED_STATE_SET;; localObject = EMPTY_STATE_SET)
    {
      localDrawable.setState((int[])localObject);
      return;
      bool2 = false;
      localEditable = null;
      break;
      bool1 = false;
      localObject = null;
      break label57;
      i = 8;
      break label67;
    }
  }
  
  private void updateQueryHint()
  {
    Object localObject = getQueryHint();
    SearchView.SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
    if (localObject == null) {
      localObject = "";
    }
    localObject = getDecoratedHint((CharSequence)localObject);
    localSearchAutoComplete.setHint((CharSequence)localObject);
  }
  
  private void updateSearchAutoComplete()
  {
    int i = 1;
    Object localObject1 = this.mSearchSrcTextView;
    int j = this.mSearchable.getSuggestThreshold();
    ((SearchView.SearchAutoComplete)localObject1).setThreshold(j);
    localObject1 = this.mSearchSrcTextView;
    Object localObject2 = this.mSearchable;
    j = ((SearchableInfo)localObject2).getImeOptions();
    ((SearchView.SearchAutoComplete)localObject1).setImeOptions(j);
    localObject1 = this.mSearchable;
    int k = ((SearchableInfo)localObject1).getInputType();
    j = k & 0xF;
    if (j == i)
    {
      j = -65537;
      k &= j;
      localObject2 = this.mSearchable.getSuggestAuthority();
      if (localObject2 != null)
      {
        k |= 0x10000;
        j = 524288;
        k |= j;
      }
    }
    localObject2 = this.mSearchSrcTextView;
    ((SearchView.SearchAutoComplete)localObject2).setInputType(k);
    localObject1 = this.mSuggestionsAdapter;
    if (localObject1 != null)
    {
      localObject1 = this.mSuggestionsAdapter;
      j = 0;
      localObject2 = null;
      ((d)localObject1).changeCursor(null);
    }
    localObject1 = this.mSearchable.getSuggestAuthority();
    if (localObject1 != null)
    {
      localObject1 = new android/support/v7/widget/SuggestionsAdapter;
      localObject2 = getContext();
      SearchableInfo localSearchableInfo = this.mSearchable;
      WeakHashMap localWeakHashMap = this.mOutsideDrawablesCache;
      ((SuggestionsAdapter)localObject1).<init>((Context)localObject2, this, localSearchableInfo, localWeakHashMap);
      this.mSuggestionsAdapter = ((d)localObject1);
      localObject1 = this.mSearchSrcTextView;
      localObject2 = this.mSuggestionsAdapter;
      ((SearchView.SearchAutoComplete)localObject1).setAdapter((ListAdapter)localObject2);
      localObject1 = (SuggestionsAdapter)this.mSuggestionsAdapter;
      boolean bool = this.mQueryRefinement;
      if (bool) {
        i = 2;
      }
      ((SuggestionsAdapter)localObject1).setQueryRefinement(i);
    }
  }
  
  private void updateSubmitArea()
  {
    int i = 8;
    boolean bool = isSubmitAreaEnabled();
    if (bool)
    {
      ImageView localImageView = this.mGoButton;
      int j = localImageView.getVisibility();
      if (j != 0)
      {
        localImageView = this.mVoiceButton;
        j = localImageView.getVisibility();
        if (j != 0) {}
      }
      else
      {
        i = 0;
      }
    }
    this.mSubmitArea.setVisibility(i);
  }
  
  private void updateSubmitButton(boolean paramBoolean)
  {
    int i = 8;
    boolean bool = this.mSubmitButtonEnabled;
    if (bool)
    {
      bool = isSubmitAreaEnabled();
      if (bool)
      {
        bool = hasFocus();
        if (bool) {
          if (!paramBoolean)
          {
            bool = this.mVoiceButtonEnabled;
            if (bool) {}
          }
          else
          {
            i = 0;
          }
        }
      }
    }
    this.mGoButton.setVisibility(i);
  }
  
  private void updateViewsVisibility(boolean paramBoolean)
  {
    boolean bool1 = true;
    int i = 8;
    this.mIconified = paramBoolean;
    Object localObject;
    Editable localEditable;
    boolean bool3;
    label44:
    label72:
    boolean bool2;
    if (paramBoolean)
    {
      int j = 0;
      localObject = null;
      localEditable = this.mSearchSrcTextView.getText();
      bool3 = TextUtils.isEmpty(localEditable);
      if (bool3) {
        break label141;
      }
      bool3 = bool1;
      this.mSearchButton.setVisibility(j);
      updateSubmitButton(bool3);
      View localView = this.mSearchEditFrame;
      if (!paramBoolean) {
        break label150;
      }
      j = i;
      localView.setVisibility(j);
      localObject = this.mCollapsedIcon.getDrawable();
      if (localObject != null)
      {
        bool2 = this.mIconifiedByDefault;
        if (!bool2) {
          break label159;
        }
      }
      label104:
      localObject = this.mCollapsedIcon;
      ((ImageView)localObject).setVisibility(i);
      updateCloseButton();
      if (bool3) {
        break label164;
      }
    }
    for (;;)
    {
      updateVoiceButton(bool1);
      updateSubmitArea();
      return;
      bool2 = i;
      break;
      label141:
      bool3 = false;
      localEditable = null;
      break label44;
      label150:
      bool2 = false;
      localObject = null;
      break label72;
      label159:
      i = 0;
      break label104;
      label164:
      bool1 = false;
    }
  }
  
  private void updateVoiceButton(boolean paramBoolean)
  {
    int i = 8;
    int j = this.mVoiceButtonEnabled;
    if (j != 0)
    {
      j = isIconified();
      if ((j == 0) && (paramBoolean))
      {
        j = 0;
        ImageView localImageView = this.mGoButton;
        localImageView.setVisibility(i);
      }
    }
    for (;;)
    {
      this.mVoiceButton.setVisibility(j);
      return;
      j = i;
    }
  }
  
  void adjustDropDownSizeAndPosition()
  {
    Object localObject1 = this.mDropDownAnchor;
    int i = ((View)localObject1).getWidth();
    int j = 1;
    Object localObject2;
    int m;
    Rect localRect;
    int n;
    Object localObject3;
    if (i > j)
    {
      localObject1 = getContext().getResources();
      localObject2 = this.mSearchPlate;
      m = ((View)localObject2).getPaddingLeft();
      localRect = new android/graphics/Rect;
      localRect.<init>();
      boolean bool1 = ViewUtils.isLayoutRtl(this);
      boolean bool2 = this.mIconifiedByDefault;
      if (!bool2) {
        break label184;
      }
      n = R.dimen.abc_dropdownitem_icon_width;
      n = ((Resources)localObject1).getDimensionPixelSize(n);
      int i1 = R.dimen.abc_dropdownitem_text_padding_left;
      i = ((Resources)localObject1).getDimensionPixelSize(i1) + n;
      localObject3 = this.mSearchSrcTextView.getDropDownBackground();
      ((Drawable)localObject3).getPadding(localRect);
      if (!bool1) {
        break label191;
      }
    }
    for (int k = -localRect.left;; k = m - k)
    {
      localObject3 = this.mSearchSrcTextView;
      ((SearchView.SearchAutoComplete)localObject3).setDropDownHorizontalOffset(k);
      k = this.mDropDownAnchor.getWidth();
      n = localRect.left;
      k += n;
      int i2 = localRect.right;
      k += i2;
      i = i + k - m;
      localObject2 = this.mSearchSrcTextView;
      ((SearchView.SearchAutoComplete)localObject2).setDropDownWidth(i);
      return;
      label184:
      i = 0;
      localObject1 = null;
      break;
      label191:
      k = localRect.left + i;
    }
  }
  
  public void clearFocus()
  {
    this.mClearingFocus = true;
    super.clearFocus();
    this.mSearchSrcTextView.clearFocus();
    SearchView.SearchAutoComplete.access$000(this.mSearchSrcTextView, false);
    this.mClearingFocus = false;
  }
  
  void forceSuggestionQuery()
  {
    SearchView.AutoCompleteTextViewReflector localAutoCompleteTextViewReflector = HIDDEN_METHOD_INVOKER;
    SearchView.SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
    localAutoCompleteTextViewReflector.doBeforeTextChanged(localSearchAutoComplete);
    localAutoCompleteTextViewReflector = HIDDEN_METHOD_INVOKER;
    localSearchAutoComplete = this.mSearchSrcTextView;
    localAutoCompleteTextViewReflector.doAfterTextChanged(localSearchAutoComplete);
  }
  
  public int getImeOptions()
  {
    return this.mSearchSrcTextView.getImeOptions();
  }
  
  public int getInputType()
  {
    return this.mSearchSrcTextView.getInputType();
  }
  
  public int getMaxWidth()
  {
    return this.mMaxWidth;
  }
  
  public CharSequence getQuery()
  {
    return this.mSearchSrcTextView.getText();
  }
  
  public CharSequence getQueryHint()
  {
    Object localObject = this.mQueryHint;
    if (localObject != null) {
      localObject = this.mQueryHint;
    }
    for (;;)
    {
      return (CharSequence)localObject;
      localObject = this.mSearchable;
      if (localObject != null)
      {
        localObject = this.mSearchable;
        int i = ((SearchableInfo)localObject).getHintId();
        if (i != 0)
        {
          localObject = getContext();
          SearchableInfo localSearchableInfo = this.mSearchable;
          int j = localSearchableInfo.getHintId();
          localObject = ((Context)localObject).getText(j);
          continue;
        }
      }
      localObject = this.mDefaultQueryHint;
    }
  }
  
  int getSuggestionCommitIconResId()
  {
    return this.mSuggestionCommitIconResId;
  }
  
  int getSuggestionRowLayout()
  {
    return this.mSuggestionRowLayout;
  }
  
  public d getSuggestionsAdapter()
  {
    return this.mSuggestionsAdapter;
  }
  
  public boolean isIconfiedByDefault()
  {
    return this.mIconifiedByDefault;
  }
  
  public boolean isIconified()
  {
    return this.mIconified;
  }
  
  public boolean isQueryRefinementEnabled()
  {
    return this.mQueryRefinement;
  }
  
  public boolean isSubmitButtonEnabled()
  {
    return this.mSubmitButtonEnabled;
  }
  
  void launchQuerySearch(int paramInt, String paramString1, String paramString2)
  {
    Object localObject = this;
    localObject = createIntent("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity((Intent)localObject);
  }
  
  public void onActionViewCollapsed()
  {
    setQuery("", false);
    clearFocus();
    updateViewsVisibility(true);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
    int i = this.mCollapsedImeOptions;
    localSearchAutoComplete.setImeOptions(i);
    this.mExpandedInActionView = false;
  }
  
  public void onActionViewExpanded()
  {
    boolean bool = this.mExpandedInActionView;
    if (bool) {}
    for (;;)
    {
      return;
      this.mExpandedInActionView = true;
      int i = this.mSearchSrcTextView.getImeOptions();
      this.mCollapsedImeOptions = i;
      SearchView.SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
      int j = this.mCollapsedImeOptions;
      int k = 33554432;
      j |= k;
      localSearchAutoComplete.setImeOptions(j);
      localSearchAutoComplete = this.mSearchSrcTextView;
      String str = "";
      localSearchAutoComplete.setText(str);
      i = 0;
      localSearchAutoComplete = null;
      setIconified(false);
    }
  }
  
  void onCloseClicked()
  {
    boolean bool1 = true;
    Object localObject = this.mSearchSrcTextView.getText();
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
    if (bool2)
    {
      bool2 = this.mIconifiedByDefault;
      if (bool2)
      {
        localObject = this.mOnCloseListener;
        if (localObject != null)
        {
          localObject = this.mOnCloseListener;
          bool2 = ((SearchView.OnCloseListener)localObject).onClose();
          if (bool2) {}
        }
        else
        {
          clearFocus();
          updateViewsVisibility(bool1);
        }
      }
    }
    for (;;)
    {
      return;
      localObject = this.mSearchSrcTextView;
      String str = "";
      ((SearchView.SearchAutoComplete)localObject).setText(str);
      this.mSearchSrcTextView.requestFocus();
      localObject = this.mSearchSrcTextView;
      SearchView.SearchAutoComplete.access$000((SearchView.SearchAutoComplete)localObject, bool1);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    Runnable localRunnable = this.mUpdateDrawableStateRunnable;
    removeCallbacks(localRunnable);
    localRunnable = this.mReleaseCursorRunnable;
    post(localRunnable);
    super.onDetachedFromWindow();
  }
  
  boolean onItemClicked(int paramInt1, int paramInt2, String paramString)
  {
    boolean bool1 = false;
    Object localObject = this.mOnSuggestionListener;
    boolean bool2;
    if (localObject != null)
    {
      localObject = this.mOnSuggestionListener;
      bool2 = ((SearchView.OnSuggestionListener)localObject).onSuggestionClick(paramInt1);
      if (bool2) {}
    }
    else
    {
      bool2 = false;
      launchSuggestion(paramInt1, 0, null);
      localObject = this.mSearchSrcTextView;
      SearchView.SearchAutoComplete.access$000((SearchView.SearchAutoComplete)localObject, false);
      dismissSuggestions();
      bool1 = true;
    }
    return bool1;
  }
  
  boolean onItemSelected(int paramInt)
  {
    SearchView.OnSuggestionListener localOnSuggestionListener = this.mOnSuggestionListener;
    boolean bool;
    if (localOnSuggestionListener != null)
    {
      localOnSuggestionListener = this.mOnSuggestionListener;
      bool = localOnSuggestionListener.onSuggestionSelect(paramInt);
      if (bool) {}
    }
    else
    {
      rewriteQueryFromSuggestion(paramInt);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOnSuggestionListener = null;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject1;
    Rect localRect1;
    Rect localRect2;
    if (paramBoolean)
    {
      localObject1 = this.mSearchSrcTextView;
      localRect1 = this.mSearchSrcTextViewBounds;
      getChildBoundsWithinSearchView((View)localObject1, localRect1);
      localObject1 = this.mSearchSrtTextViewBoundsExpanded;
      localRect1 = this.mSearchSrcTextViewBounds;
      int i = localRect1.left;
      localRect2 = null;
      Object localObject2 = this.mSearchSrcTextViewBounds;
      int j = ((Rect)localObject2).right;
      int k = paramInt4 - paramInt2;
      ((Rect)localObject1).set(i, 0, j, k);
      localObject1 = this.mTouchDelegate;
      if (localObject1 != null) {
        break label152;
      }
      localObject1 = new android/support/v7/widget/SearchView$UpdatableTouchDelegate;
      localRect1 = this.mSearchSrtTextViewBoundsExpanded;
      localRect2 = this.mSearchSrcTextViewBounds;
      localObject2 = this.mSearchSrcTextView;
      ((SearchView.UpdatableTouchDelegate)localObject1).<init>(localRect1, localRect2, (View)localObject2);
      this.mTouchDelegate = ((SearchView.UpdatableTouchDelegate)localObject1);
      localObject1 = this.mTouchDelegate;
      setTouchDelegate((TouchDelegate)localObject1);
    }
    for (;;)
    {
      return;
      label152:
      localObject1 = this.mTouchDelegate;
      localRect1 = this.mSearchSrtTextViewBoundsExpanded;
      localRect2 = this.mSearchSrcTextViewBounds;
      ((SearchView.UpdatableTouchDelegate)localObject1).setBounds(localRect1, localRect2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    boolean bool = isIconified();
    if (bool)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int k = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    label72:
    int m;
    switch (k)
    {
    default: 
      m = View.MeasureSpec.getMode(paramInt2);
      k = View.MeasureSpec.getSize(paramInt2);
      switch (m)
      {
      }
      break;
    }
    for (;;)
    {
      j = View.MeasureSpec.makeMeasureSpec(j, i);
      k = View.MeasureSpec.makeMeasureSpec(k, i);
      super.onMeasure(j, k);
      break;
      k = this.mMaxWidth;
      if (k > 0)
      {
        k = this.mMaxWidth;
        j = Math.min(k, j);
        break label72;
      }
      k = getPreferredWidth();
      j = Math.min(k, j);
      break label72;
      k = this.mMaxWidth;
      if (k <= 0) {
        break label72;
      }
      k = this.mMaxWidth;
      j = Math.min(k, j);
      break label72;
      j = this.mMaxWidth;
      if (j > 0)
      {
        j = this.mMaxWidth;
        break label72;
      }
      j = getPreferredWidth();
      break label72;
      m = getPreferredHeight();
      k = Math.min(m, k);
      continue;
      k = getPreferredHeight();
    }
  }
  
  void onQueryRefine(CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof SearchView.SavedState;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (SearchView.SavedState)paramParcelable;
      Parcelable localParcelable = paramParcelable.getSuperState();
      super.onRestoreInstanceState(localParcelable);
      bool = paramParcelable.isIconified;
      updateViewsVisibility(bool);
      requestLayout();
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    SearchView.SavedState localSavedState = new android/support/v7/widget/SearchView$SavedState;
    localSavedState.<init>(localParcelable);
    boolean bool = isIconified();
    localSavedState.isIconified = bool;
    return localSavedState;
  }
  
  void onSearchClicked()
  {
    updateViewsVisibility(false);
    this.mSearchSrcTextView.requestFocus();
    Object localObject = this.mSearchSrcTextView;
    boolean bool = true;
    SearchView.SearchAutoComplete.access$000((SearchView.SearchAutoComplete)localObject, bool);
    localObject = this.mOnSearchClickListener;
    if (localObject != null)
    {
      localObject = this.mOnSearchClickListener;
      ((View.OnClickListener)localObject).onClick(this);
    }
  }
  
  void onSubmitQuery()
  {
    Object localObject1 = this.mSearchSrcTextView.getText();
    if (localObject1 != null)
    {
      int i = TextUtils.getTrimmedLength((CharSequence)localObject1);
      if (i > 0)
      {
        Object localObject2 = this.mOnQueryChangeListener;
        boolean bool;
        if (localObject2 != null)
        {
          localObject2 = this.mOnQueryChangeListener;
          String str = ((CharSequence)localObject1).toString();
          bool = ((SearchView.OnQueryTextListener)localObject2).onQueryTextSubmit(str);
          if (bool) {}
        }
        else
        {
          localObject2 = this.mSearchable;
          if (localObject2 != null)
          {
            bool = false;
            localObject2 = null;
            localObject1 = ((CharSequence)localObject1).toString();
            launchQuerySearch(0, null, (String)localObject1);
          }
          localObject1 = this.mSearchSrcTextView;
          SearchView.SearchAutoComplete.access$000((SearchView.SearchAutoComplete)localObject1, false);
          dismissSuggestions();
        }
      }
    }
  }
  
  boolean onSuggestionsKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 21;
    boolean bool1 = true;
    boolean bool2 = false;
    SearchView.SearchAutoComplete localSearchAutoComplete1 = null;
    Object localObject = this.mSearchable;
    if (localObject == null) {}
    for (;;)
    {
      return bool2;
      localObject = this.mSuggestionsAdapter;
      if (localObject != null)
      {
        int j = paramKeyEvent.getAction();
        if (j == 0)
        {
          boolean bool3 = paramKeyEvent.hasNoModifiers();
          if (bool3)
          {
            int k = 66;
            if (paramInt != k)
            {
              k = 84;
              if (paramInt != k)
              {
                k = 61;
                if (paramInt != k) {
                  break label119;
                }
              }
            }
            localObject = this.mSearchSrcTextView;
            k = ((SearchView.SearchAutoComplete)localObject).getListSelection();
            bool1 = false;
            bool2 = onItemClicked(k, 0, null);
            continue;
            label119:
            if (paramInt != i)
            {
              k = 22;
              if (paramInt != k) {}
            }
            else
            {
              if (paramInt == i)
              {
                k = 0;
                localObject = null;
              }
              for (;;)
              {
                SearchView.SearchAutoComplete localSearchAutoComplete2 = this.mSearchSrcTextView;
                localSearchAutoComplete2.setSelection(k);
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                localObject = HIDDEN_METHOD_INVOKER;
                localSearchAutoComplete1 = this.mSearchSrcTextView;
                ((SearchView.AutoCompleteTextViewReflector)localObject).ensureImeVisible(localSearchAutoComplete1, bool1);
                bool2 = bool1;
                break;
                localObject = this.mSearchSrcTextView;
                k = ((SearchView.SearchAutoComplete)localObject).length();
              }
            }
            k = 19;
            if (paramInt == k)
            {
              localObject = this.mSearchSrcTextView;
              k = ((SearchView.SearchAutoComplete)localObject).getListSelection();
              if (k != 0) {}
            }
          }
        }
      }
    }
  }
  
  void onTextChanged(CharSequence paramCharSequence)
  {
    boolean bool1 = true;
    Object localObject = this.mSearchSrcTextView.getText();
    this.mUserQuery = ((CharSequence)localObject);
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool2)
    {
      bool2 = bool1;
      updateSubmitButton(bool2);
      if (bool2) {
        break label122;
      }
    }
    for (;;)
    {
      updateVoiceButton(bool1);
      updateCloseButton();
      updateSubmitArea();
      localObject = this.mOnQueryChangeListener;
      if (localObject != null)
      {
        localObject = this.mOldQueryText;
        bool2 = TextUtils.equals(paramCharSequence, (CharSequence)localObject);
        if (!bool2)
        {
          localObject = this.mOnQueryChangeListener;
          str = paramCharSequence.toString();
          ((SearchView.OnQueryTextListener)localObject).onQueryTextChange(str);
        }
      }
      localObject = paramCharSequence.toString();
      this.mOldQueryText = ((CharSequence)localObject);
      return;
      bool2 = false;
      localObject = null;
      break;
      label122:
      bool1 = false;
      String str = null;
    }
  }
  
  void onTextFocusChanged()
  {
    boolean bool = isIconified();
    updateViewsVisibility(bool);
    postUpdateFocusedState();
    SearchView.SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
    bool = localSearchAutoComplete.hasFocus();
    if (bool) {
      forceSuggestionQuery();
    }
  }
  
  void onVoiceClicked()
  {
    Object localObject1 = this.mSearchable;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.mSearchable;
      Object localObject3;
      Object localObject2;
      try
      {
        bool = ((SearchableInfo)localObject1).getVoiceSearchLaunchWebSearch();
        if (!bool) {
          break label66;
        }
        localObject3 = this.mVoiceWebSearchIntent;
        localObject1 = createVoiceWebSearchIntent((Intent)localObject3, (SearchableInfo)localObject1);
        localObject3 = getContext();
        ((Context)localObject3).startActivity((Intent)localObject1);
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        localObject2 = "SearchView";
        localObject3 = "Could not find voice search activity";
        Log.w((String)localObject2, (String)localObject3);
      }
      continue;
      label66:
      boolean bool = ((SearchableInfo)localObject2).getVoiceSearchLaunchRecognizer();
      if (bool)
      {
        localObject3 = this.mVoiceAppSearchIntent;
        localObject2 = createVoiceAppSearchIntent((Intent)localObject3, (SearchableInfo)localObject2);
        localObject3 = getContext();
        ((Context)localObject3).startActivity((Intent)localObject2);
      }
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    postUpdateFocusedState();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    boolean bool1 = false;
    boolean bool2 = this.mClearingFocus;
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = isFocusable();
      if (bool2)
      {
        bool2 = isIconified();
        if (!bool2)
        {
          SearchView.SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
          bool2 = localSearchAutoComplete.requestFocus(paramInt, paramRect);
          if (bool2) {
            updateViewsVisibility(false);
          }
          bool1 = bool2;
        }
        else
        {
          bool1 = super.requestFocus(paramInt, paramRect);
        }
      }
    }
  }
  
  public void setAppSearchData(Bundle paramBundle)
  {
    this.mAppSearchData = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean) {
      onCloseClicked();
    }
    for (;;)
    {
      return;
      onSearchClicked();
    }
  }
  
  public void setIconifiedByDefault(boolean paramBoolean)
  {
    boolean bool = this.mIconifiedByDefault;
    if (bool == paramBoolean) {}
    for (;;)
    {
      return;
      this.mIconifiedByDefault = paramBoolean;
      updateViewsVisibility(paramBoolean);
      updateQueryHint();
    }
  }
  
  public void setImeOptions(int paramInt)
  {
    this.mSearchSrcTextView.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt)
  {
    this.mSearchSrcTextView.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.mMaxWidth = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(SearchView.OnCloseListener paramOnCloseListener)
  {
    this.mOnCloseListener = paramOnCloseListener;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.mOnQueryTextFocusChangeListener = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(SearchView.OnQueryTextListener paramOnQueryTextListener)
  {
    this.mOnQueryChangeListener = paramOnQueryTextListener;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnSearchClickListener = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(SearchView.OnSuggestionListener paramOnSuggestionListener)
  {
    this.mOnSuggestionListener = paramOnSuggestionListener;
  }
  
  public void setQuery(CharSequence paramCharSequence, boolean paramBoolean)
  {
    SearchView.SearchAutoComplete localSearchAutoComplete1 = this.mSearchSrcTextView;
    localSearchAutoComplete1.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      localSearchAutoComplete1 = this.mSearchSrcTextView;
      SearchView.SearchAutoComplete localSearchAutoComplete2 = this.mSearchSrcTextView;
      int i = localSearchAutoComplete2.length();
      localSearchAutoComplete1.setSelection(i);
      this.mUserQuery = paramCharSequence;
    }
    if (paramBoolean)
    {
      boolean bool = TextUtils.isEmpty(paramCharSequence);
      if (!bool) {
        onSubmitQuery();
      }
    }
  }
  
  public void setQueryHint(CharSequence paramCharSequence)
  {
    this.mQueryHint = paramCharSequence;
    updateQueryHint();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    this.mQueryRefinement = paramBoolean;
    Object localObject = this.mSuggestionsAdapter;
    boolean bool = localObject instanceof SuggestionsAdapter;
    if (bool)
    {
      localObject = (SuggestionsAdapter)this.mSuggestionsAdapter;
      if (!paramBoolean) {
        break label41;
      }
    }
    label41:
    for (int i = 2;; i = 1)
    {
      ((SuggestionsAdapter)localObject).setQueryRefinement(i);
      return;
    }
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    this.mSearchable = paramSearchableInfo;
    Object localObject = this.mSearchable;
    if (localObject != null)
    {
      updateSearchAutoComplete();
      updateQueryHint();
    }
    boolean bool = hasVoiceSearch();
    this.mVoiceButtonEnabled = bool;
    bool = this.mVoiceButtonEnabled;
    if (bool)
    {
      localObject = this.mSearchSrcTextView;
      String str = "nm";
      ((SearchView.SearchAutoComplete)localObject).setPrivateImeOptions(str);
    }
    bool = isIconified();
    updateViewsVisibility(bool);
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    this.mSubmitButtonEnabled = paramBoolean;
    boolean bool = isIconified();
    updateViewsVisibility(bool);
  }
  
  public void setSuggestionsAdapter(d paramd)
  {
    this.mSuggestionsAdapter = paramd;
    SearchView.SearchAutoComplete localSearchAutoComplete = this.mSearchSrcTextView;
    d locald = this.mSuggestionsAdapter;
    localSearchAutoComplete.setAdapter(locald);
  }
  
  void updateFocusedState()
  {
    Object localObject = this.mSearchSrcTextView;
    boolean bool = ((SearchView.SearchAutoComplete)localObject).hasFocus();
    if (bool) {}
    for (localObject = FOCUSED_STATE_SET;; localObject = EMPTY_STATE_SET)
    {
      Drawable localDrawable = this.mSearchPlate.getBackground();
      if (localDrawable != null) {
        localDrawable.setState((int[])localObject);
      }
      localDrawable = this.mSubmitArea.getBackground();
      if (localDrawable != null) {
        localDrawable.setState((int[])localObject);
      }
      invalidate();
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */