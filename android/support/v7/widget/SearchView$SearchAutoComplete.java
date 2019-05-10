package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

public class SearchView$SearchAutoComplete
  extends AppCompatAutoCompleteTextView
{
  private boolean mHasPendingShowSoftInputRequest;
  final Runnable mRunShowSoftInputIfNecessary;
  private SearchView mSearchView;
  private int mThreshold;
  
  public SearchView$SearchAutoComplete(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    SearchView.SearchAutoComplete.1 local1 = new android/support/v7/widget/SearchView$SearchAutoComplete$1;
    local1.<init>(this);
    this.mRunShowSoftInputIfNecessary = local1;
    int i = getThreshold();
    this.mThreshold = i;
  }
  
  private int getSearchViewTextMinWidthDp()
  {
    Configuration localConfiguration = getResources().getConfiguration();
    int i = localConfiguration.screenWidthDp;
    int j = localConfiguration.screenHeightDp;
    int k = 960;
    int m;
    if (i >= k)
    {
      k = 720;
      if (j >= k)
      {
        m = localConfiguration.orientation;
        k = 2;
        if (m == k) {
          m = 256;
        }
      }
    }
    for (;;)
    {
      return m;
      m = 600;
      if (i < m)
      {
        m = 640;
        if (i >= m)
        {
          m = 480;
          if (j < m) {}
        }
      }
      else
      {
        m = 192;
        continue;
      }
      m = 160;
    }
  }
  
  private boolean isEmpty()
  {
    Editable localEditable = getText();
    int i = TextUtils.getTrimmedLength(localEditable);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localEditable = null;
    }
  }
  
  private void setImeVisibility(boolean paramBoolean)
  {
    Object localObject1 = getContext();
    Object localObject2 = "input_method";
    localObject1 = (InputMethodManager)((Context)localObject1).getSystemService((String)localObject2);
    if (!paramBoolean)
    {
      this.mHasPendingShowSoftInputRequest = false;
      localObject2 = this.mRunShowSoftInputIfNecessary;
      removeCallbacks((Runnable)localObject2);
      localObject2 = getWindowToken();
      ((InputMethodManager)localObject1).hideSoftInputFromWindow((IBinder)localObject2, 0);
    }
    for (;;)
    {
      return;
      boolean bool1 = ((InputMethodManager)localObject1).isActive(this);
      if (bool1)
      {
        this.mHasPendingShowSoftInputRequest = false;
        localObject2 = this.mRunShowSoftInputIfNecessary;
        removeCallbacks((Runnable)localObject2);
        ((InputMethodManager)localObject1).showSoftInput(this, 0);
      }
      else
      {
        boolean bool2 = true;
        this.mHasPendingShowSoftInputRequest = bool2;
      }
    }
  }
  
  private void showSoftInputIfNecessary()
  {
    boolean bool = this.mHasPendingShowSoftInputRequest;
    if (bool)
    {
      Object localObject = getContext();
      String str = "input_method";
      localObject = (InputMethodManager)((Context)localObject).getSystemService(str);
      ((InputMethodManager)localObject).showSoftInput(this, 0);
      this.mHasPendingShowSoftInputRequest = false;
    }
  }
  
  public boolean enoughToFilter()
  {
    int i = this.mThreshold;
    if (i > 0)
    {
      bool = super.enoughToFilter();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    boolean bool = this.mHasPendingShowSoftInputRequest;
    if (bool)
    {
      Runnable localRunnable = this.mRunShowSoftInputIfNecessary;
      removeCallbacks(localRunnable);
      localRunnable = this.mRunShowSoftInputIfNecessary;
      post(localRunnable);
    }
    return localInputConnection;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    float f = getSearchViewTextMinWidthDp();
    int i = (int)TypedValue.applyDimension(1, f, localDisplayMetrics);
    setMinWidth(i);
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    this.mSearchView.onTextFocusChanged();
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    int j = 4;
    KeyEvent.DispatcherState localDispatcherState;
    if (paramInt == j)
    {
      j = paramKeyEvent.getAction();
      if (j == 0)
      {
        j = paramKeyEvent.getRepeatCount();
        if (j == 0)
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
        }
      }
    }
    for (;;)
    {
      return i;
      j = paramKeyEvent.getAction();
      if (j == i)
      {
        localDispatcherState = getKeyDispatcherState();
        if (localDispatcherState != null) {
          localDispatcherState.handleUpEvent(paramKeyEvent);
        }
        boolean bool = paramKeyEvent.isTracking();
        if (bool)
        {
          bool = paramKeyEvent.isCanceled();
          if (!bool)
          {
            this.mSearchView.clearFocus();
            bool = false;
            localDispatcherState = null;
            setImeVisibility(false);
            continue;
          }
        }
      }
      i = super.onKeyPreIme(paramInt, paramKeyEvent);
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    boolean bool1 = true;
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean)
    {
      Object localObject = this.mSearchView;
      boolean bool2 = ((SearchView)localObject).hasFocus();
      if (bool2)
      {
        int i = getVisibility();
        if (i == 0)
        {
          this.mHasPendingShowSoftInputRequest = bool1;
          localObject = getContext();
          boolean bool3 = SearchView.isLandscapeMode((Context)localObject);
          if (bool3)
          {
            localObject = SearchView.HIDDEN_METHOD_INVOKER;
            ((SearchView.AutoCompleteTextViewReflector)localObject).ensureImeVisible(this, bool1);
          }
        }
      }
    }
  }
  
  public void performCompletion() {}
  
  protected void replaceText(CharSequence paramCharSequence) {}
  
  void setSearchView(SearchView paramSearchView)
  {
    this.mSearchView = paramSearchView;
  }
  
  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    this.mThreshold = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$SearchAutoComplete.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */