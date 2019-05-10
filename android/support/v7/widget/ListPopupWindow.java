package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.r;
import android.support.v4.widget.k;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.menu.ShowableListMenu;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class ListPopupWindow
  implements ShowableListMenu
{
  private static final boolean DEBUG = false;
  static final int EXPAND_LIST_TIMEOUT = 250;
  public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
  public static final int INPUT_METHOD_NEEDED = 1;
  public static final int INPUT_METHOD_NOT_NEEDED = 2;
  public static final int MATCH_PARENT = 255;
  public static final int POSITION_PROMPT_ABOVE = 0;
  public static final int POSITION_PROMPT_BELOW = 1;
  private static final String TAG = "ListPopupWindow";
  public static final int WRAP_CONTENT = 254;
  private static Method sClipToWindowEnabledMethod;
  private static Method sGetMaxAvailableHeightMethod;
  private static Method sSetEpicenterBoundsMethod;
  private ListAdapter mAdapter;
  private Context mContext;
  private boolean mDropDownAlwaysVisible;
  private View mDropDownAnchorView;
  private int mDropDownGravity;
  private int mDropDownHeight;
  private int mDropDownHorizontalOffset;
  DropDownListView mDropDownList;
  private Drawable mDropDownListHighlight;
  private int mDropDownVerticalOffset;
  private boolean mDropDownVerticalOffsetSet;
  private int mDropDownWidth;
  private int mDropDownWindowLayoutType;
  private Rect mEpicenterBounds;
  private boolean mForceIgnoreOutsideTouch;
  final Handler mHandler;
  private final ListPopupWindow.ListSelectorHider mHideSelector;
  private boolean mIsAnimatedFromAnchor;
  private AdapterView.OnItemClickListener mItemClickListener;
  private AdapterView.OnItemSelectedListener mItemSelectedListener;
  int mListItemExpandMaximum;
  private boolean mModal;
  private DataSetObserver mObserver;
  private boolean mOverlapAnchor;
  private boolean mOverlapAnchorSet;
  PopupWindow mPopup;
  private int mPromptPosition;
  private View mPromptView;
  final ListPopupWindow.ResizePopupRunnable mResizePopupRunnable;
  private final ListPopupWindow.PopupScrollListener mScrollListener;
  private Runnable mShowDropDownRunnable;
  private final Rect mTempRect;
  private final ListPopupWindow.PopupTouchInterceptor mTouchInterceptor;
  
  static
  {
    localObject = PopupWindow.class;
    str4 = "setClipToScreenEnabled";
    i = 1;
    try
    {
      arrayOfClass = new Class[i];
      j = 0;
      localClass = Boolean.TYPE;
      arrayOfClass[0] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str4, arrayOfClass);
      sClipToWindowEnabledMethod = (Method)localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      for (;;)
      {
        try
        {
          Class[] arrayOfClass = new Class[i];
          int j = 0;
          Class localClass = Rect.class;
          arrayOfClass[0] = localClass;
          localObject = ((Class)localObject).getDeclaredMethod(str4, arrayOfClass);
          sSetEpicenterBoundsMethod = (Method)localObject;
          return;
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          String str3 = "ListPopupWindow";
          str4 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.";
          Log.i(str3, str4);
          continue;
        }
        localNoSuchMethodException1 = localNoSuchMethodException1;
        str1 = "ListPopupWindow";
        str4 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.";
        Log.i(str1, str4);
      }
    }
    localObject = PopupWindow.class;
    str4 = "getMaxAvailableHeight";
    i = 3;
    try
    {
      arrayOfClass = new Class[i];
      j = 0;
      localClass = View.class;
      arrayOfClass[0] = localClass;
      j = 1;
      localClass = Integer.TYPE;
      arrayOfClass[j] = localClass;
      j = 2;
      localClass = Boolean.TYPE;
      arrayOfClass[j] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str4, arrayOfClass);
      sGetMaxAvailableHeightMethod = (Method)localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      for (;;)
      {
        String str1;
        String str2 = "ListPopupWindow";
        str4 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.";
        Log.i(str2, str4);
      }
    }
    localObject = PopupWindow.class;
    str4 = "setEpicenterBounds";
    i = 1;
  }
  
  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, i);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.mDropDownHeight = i;
    this.mDropDownWidth = i;
    this.mDropDownWindowLayoutType = 1002;
    this.mIsAnimatedFromAnchor = j;
    this.mDropDownGravity = 0;
    this.mDropDownAlwaysVisible = false;
    this.mForceIgnoreOutsideTouch = false;
    i = -1 >>> 1;
    this.mListItemExpandMaximum = i;
    this.mPromptPosition = 0;
    Object localObject = new android/support/v7/widget/ListPopupWindow$ResizePopupRunnable;
    ((ListPopupWindow.ResizePopupRunnable)localObject).<init>(this);
    this.mResizePopupRunnable = ((ListPopupWindow.ResizePopupRunnable)localObject);
    localObject = new android/support/v7/widget/ListPopupWindow$PopupTouchInterceptor;
    ((ListPopupWindow.PopupTouchInterceptor)localObject).<init>(this);
    this.mTouchInterceptor = ((ListPopupWindow.PopupTouchInterceptor)localObject);
    localObject = new android/support/v7/widget/ListPopupWindow$PopupScrollListener;
    ((ListPopupWindow.PopupScrollListener)localObject).<init>(this);
    this.mScrollListener = ((ListPopupWindow.PopupScrollListener)localObject);
    localObject = new android/support/v7/widget/ListPopupWindow$ListSelectorHider;
    ((ListPopupWindow.ListSelectorHider)localObject).<init>(this);
    this.mHideSelector = ((ListPopupWindow.ListSelectorHider)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTempRect = ((Rect)localObject);
    this.mContext = paramContext;
    localObject = new android/os/Handler;
    Looper localLooper = paramContext.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    this.mHandler = ((Handler)localObject);
    localObject = R.styleable.ListPopupWindow;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt1, paramInt2);
    int k = R.styleable.ListPopupWindow_android_dropDownHorizontalOffset;
    k = ((TypedArray)localObject).getDimensionPixelOffset(k, 0);
    this.mDropDownHorizontalOffset = k;
    k = R.styleable.ListPopupWindow_android_dropDownVerticalOffset;
    k = ((TypedArray)localObject).getDimensionPixelOffset(k, 0);
    this.mDropDownVerticalOffset = k;
    k = this.mDropDownVerticalOffset;
    if (k != 0) {
      this.mDropDownVerticalOffsetSet = j;
    }
    ((TypedArray)localObject).recycle();
    localObject = new android/support/v7/widget/AppCompatPopupWindow;
    ((AppCompatPopupWindow)localObject).<init>(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.mPopup = ((PopupWindow)localObject);
    this.mPopup.setInputMethodMode(j);
  }
  
  private int buildDropDown()
  {
    int i = 1073741824;
    int j = -1 << -1;
    int k = -1;
    int m = 1;
    int i1 = 0;
    DropDownListView localDropDownListView = null;
    Object localObject1 = this.mDropDownList;
    Object localObject2;
    Object localObject3;
    View localView;
    int i4;
    Object localObject4;
    label382:
    int i2;
    int i5;
    label402:
    int i7;
    if (localObject1 == null)
    {
      localObject2 = this.mContext;
      localObject1 = new android/support/v7/widget/ListPopupWindow$2;
      ((ListPopupWindow.2)localObject1).<init>(this);
      this.mShowDropDownRunnable = ((Runnable)localObject1);
      boolean bool1 = this.mModal;
      if (!bool1)
      {
        bool1 = m;
        localObject1 = createDropDownListView((Context)localObject2, bool1);
        this.mDropDownList = ((DropDownListView)localObject1);
        localObject1 = this.mDropDownListHighlight;
        if (localObject1 != null)
        {
          localObject1 = this.mDropDownList;
          localObject3 = this.mDropDownListHighlight;
          ((DropDownListView)localObject1).setSelector((Drawable)localObject3);
        }
        localObject1 = this.mDropDownList;
        localObject3 = this.mAdapter;
        ((DropDownListView)localObject1).setAdapter((ListAdapter)localObject3);
        localObject1 = this.mDropDownList;
        localObject3 = this.mItemClickListener;
        ((DropDownListView)localObject1).setOnItemClickListener((AdapterView.OnItemClickListener)localObject3);
        this.mDropDownList.setFocusable(m);
        this.mDropDownList.setFocusableInTouchMode(m);
        localObject1 = this.mDropDownList;
        localObject3 = new android/support/v7/widget/ListPopupWindow$3;
        ((ListPopupWindow.3)localObject3).<init>(this);
        ((DropDownListView)localObject1).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject3);
        localObject1 = this.mDropDownList;
        localObject3 = this.mScrollListener;
        ((DropDownListView)localObject1).setOnScrollListener((AbsListView.OnScrollListener)localObject3);
        localObject1 = this.mItemSelectedListener;
        if (localObject1 != null)
        {
          localObject1 = this.mDropDownList;
          localObject3 = this.mItemSelectedListener;
          ((DropDownListView)localObject1).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject3);
        }
        localObject1 = this.mDropDownList;
        localView = this.mPromptView;
        if (localView == null) {
          break label1102;
        }
        localObject3 = new android/widget/LinearLayout;
        ((LinearLayout)localObject3).<init>((Context)localObject2);
        ((LinearLayout)localObject3).setOrientation(m);
        localObject2 = new android/widget/LinearLayout$LayoutParams;
        float f = 1.0F;
        ((LinearLayout.LayoutParams)localObject2).<init>(k, 0, f);
        i4 = this.mPromptPosition;
        switch (i4)
        {
        default: 
          localObject1 = "ListPopupWindow";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject4 = "Invalid hint position ";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
          i4 = this.mPromptPosition;
          localObject2 = i4;
          Log.e((String)localObject1, (String)localObject2);
          i2 = this.mDropDownWidth;
          if (i2 >= 0)
          {
            i5 = this.mDropDownWidth;
            i2 = j;
            i2 = View.MeasureSpec.makeMeasureSpec(i5, i2);
            localView.measure(i2, 0);
            localObject1 = (LinearLayout.LayoutParams)localView.getLayoutParams();
            i5 = localView.getMeasuredHeight();
            i7 = ((LinearLayout.LayoutParams)localObject1).topMargin;
            i5 += i7;
            i2 = ((LinearLayout.LayoutParams)localObject1).bottomMargin + i5;
            localObject2 = localObject3;
          }
          break;
        }
      }
    }
    for (;;)
    {
      localObject3 = this.mPopup;
      ((PopupWindow)localObject3).setContentView((View)localObject2);
      int i8 = i2;
      for (;;)
      {
        label481:
        localObject1 = this.mPopup.getBackground();
        int i6;
        if (localObject1 != null)
        {
          localObject2 = this.mTempRect;
          ((Drawable)localObject1).getPadding((Rect)localObject2);
          localObject1 = this.mTempRect;
          i2 = ((Rect)localObject1).top;
          localObject2 = this.mTempRect;
          i5 = ((Rect)localObject2).bottom;
          i2 += i5;
          boolean bool3 = this.mDropDownVerticalOffsetSet;
          if (bool3) {
            break label1086;
          }
          localObject2 = this.mTempRect;
          i6 = -((Rect)localObject2).top;
          this.mDropDownVerticalOffset = i6;
          i7 = i2;
        }
        for (;;)
        {
          label577:
          localObject1 = this.mPopup;
          i2 = ((PopupWindow)localObject1).getInputMethodMode();
          i6 = 2;
          if (i2 == i6) {}
          int n;
          Object localObject5;
          for (;;)
          {
            localObject1 = getAnchorView();
            i6 = this.mDropDownVerticalOffset;
            i6 = getMaxAvailableHeight((View)localObject1, i6, m);
            boolean bool2 = this.mDropDownAlwaysVisible;
            if (!bool2)
            {
              i3 = this.mDropDownHeight;
              if (i3 != k) {
                break label819;
              }
            }
            i3 = i6 + i7;
            return i3;
            i3 = 0;
            localObject1 = null;
            break;
            ((LinearLayout)localObject3).addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
            ((LinearLayout)localObject3).addView(localView);
            break label382;
            ((LinearLayout)localObject3).addView(localView);
            ((LinearLayout)localObject3).addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
            break label382;
            i3 = 0;
            localObject1 = null;
            i6 = 0;
            localObject2 = null;
            break label402;
            localObject1 = (ViewGroup)this.mPopup.getContentView();
            localObject2 = this.mPromptView;
            if (localObject2 == null) {
              break label1093;
            }
            localObject1 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
            i6 = ((View)localObject2).getMeasuredHeight();
            i8 = ((LinearLayout.LayoutParams)localObject1).topMargin;
            i6 += i8;
            i3 = ((LinearLayout.LayoutParams)localObject1).bottomMargin + i6;
            i8 = i3;
            break label481;
            localObject1 = this.mTempRect;
            ((Rect)localObject1).setEmpty();
            i7 = 0;
            localView = null;
            break label577;
            n = 0;
            localObject5 = null;
          }
          label819:
          i3 = this.mDropDownWidth;
          switch (i3)
          {
          default: 
            i3 = this.mDropDownWidth;
            n = View.MeasureSpec.makeMeasureSpec(i3, i);
          }
          for (;;)
          {
            localObject1 = this.mDropDownList;
            j = i6 - i8;
            i6 = k;
            i3 = ((DropDownListView)localObject1).measureHeightOfChildrenCompat(n, 0, k, j, k);
            if (i3 > 0)
            {
              localObject5 = this.mDropDownList;
              n = ((DropDownListView)localObject5).getPaddingTop();
              localDropDownListView = this.mDropDownList;
              i1 = localDropDownListView.getPaddingBottom();
              n = n + i1 + i7;
              i8 += n;
            }
            i3 += i8;
            break;
            localObject1 = this.mContext.getResources().getDisplayMetrics();
            i3 = ((DisplayMetrics)localObject1).widthPixels;
            localObject5 = this.mTempRect;
            n = ((Rect)localObject5).left;
            localObject4 = this.mTempRect;
            i4 = ((Rect)localObject4).right;
            n += i4;
            i3 -= n;
            n = View.MeasureSpec.makeMeasureSpec(i3, j);
            continue;
            localObject1 = this.mContext.getResources().getDisplayMetrics();
            i3 = ((DisplayMetrics)localObject1).widthPixels;
            localObject5 = this.mTempRect;
            n = ((Rect)localObject5).left;
            Rect localRect = this.mTempRect;
            j = localRect.right;
            n += j;
            i3 -= n;
            n = View.MeasureSpec.makeMeasureSpec(i3, i);
          }
          label1086:
          i7 = i3;
        }
        label1093:
        i8 = 0;
        localObject3 = null;
      }
      label1102:
      localObject2 = localObject1;
      int i3 = 0;
      localObject1 = null;
    }
  }
  
  private int getMaxAvailableHeight(View paramView, int paramInt, boolean paramBoolean)
  {
    Object localObject1 = sGetMaxAvailableHeightMethod;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = sGetMaxAvailableHeightMethod;
        localObject3 = this.mPopup;
        int i = 3;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = paramView;
        j = 1;
        Object localObject4 = Integer.valueOf(paramInt);
        arrayOfObject[j] = localObject4;
        j = 2;
        localObject4 = Boolean.valueOf(paramBoolean);
        arrayOfObject[j] = localObject4;
        localObject1 = ((Method)localObject1).invoke(localObject3, arrayOfObject);
        localObject1 = (Integer)localObject1;
        k = ((Integer)localObject1).intValue();
        return k;
      }
      catch (Exception localException)
      {
        localObject2 = "ListPopupWindow";
        Object localObject3 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.";
        Log.i((String)localObject2, (String)localObject3);
      }
      Object localObject2 = this.mPopup;
      int k = ((PopupWindow)localObject2).getMaxAvailableHeight(paramView, paramInt);
    }
  }
  
  private static boolean isConfirmKey(int paramInt)
  {
    int i = 66;
    if (paramInt != i)
    {
      i = 23;
      if (paramInt != i) {
        break label20;
      }
    }
    label20:
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  private void removePromptView()
  {
    Object localObject = this.mPromptView;
    if (localObject != null)
    {
      localObject = this.mPromptView.getParent();
      boolean bool = localObject instanceof ViewGroup;
      if (bool)
      {
        localObject = (ViewGroup)localObject;
        View localView = this.mPromptView;
        ((ViewGroup)localObject).removeView(localView);
      }
    }
  }
  
  private void setPopupClipToScreenEnabled(boolean paramBoolean)
  {
    Method localMethod = sClipToWindowEnabledMethod;
    if (localMethod != null) {}
    try
    {
      localMethod = sClipToWindowEnabledMethod;
      localObject = this.mPopup;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      arrayOfObject[0] = localBoolean;
      localMethod.invoke(localObject, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "ListPopupWindow";
        Object localObject = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.";
        Log.i(str, (String)localObject);
      }
    }
  }
  
  public void clearListSelection()
  {
    DropDownListView localDropDownListView = this.mDropDownList;
    if (localDropDownListView != null)
    {
      boolean bool = true;
      localDropDownListView.setListSelectionHidden(bool);
      localDropDownListView.requestLayout();
    }
  }
  
  public View.OnTouchListener createDragToOpenListener(View paramView)
  {
    ListPopupWindow.1 local1 = new android/support/v7/widget/ListPopupWindow$1;
    local1.<init>(this, paramView);
    return local1;
  }
  
  DropDownListView createDropDownListView(Context paramContext, boolean paramBoolean)
  {
    DropDownListView localDropDownListView = new android/support/v7/widget/DropDownListView;
    localDropDownListView.<init>(paramContext, paramBoolean);
    return localDropDownListView;
  }
  
  public void dismiss()
  {
    this.mPopup.dismiss();
    removePromptView();
    this.mPopup.setContentView(null);
    this.mDropDownList = null;
    Handler localHandler = this.mHandler;
    ListPopupWindow.ResizePopupRunnable localResizePopupRunnable = this.mResizePopupRunnable;
    localHandler.removeCallbacks(localResizePopupRunnable);
  }
  
  public View getAnchorView()
  {
    return this.mDropDownAnchorView;
  }
  
  public int getAnimationStyle()
  {
    return this.mPopup.getAnimationStyle();
  }
  
  public Drawable getBackground()
  {
    return this.mPopup.getBackground();
  }
  
  public int getHeight()
  {
    return this.mDropDownHeight;
  }
  
  public int getHorizontalOffset()
  {
    return this.mDropDownHorizontalOffset;
  }
  
  public int getInputMethodMode()
  {
    return this.mPopup.getInputMethodMode();
  }
  
  public ListView getListView()
  {
    return this.mDropDownList;
  }
  
  public int getPromptPosition()
  {
    return this.mPromptPosition;
  }
  
  public Object getSelectedItem()
  {
    boolean bool = isShowing();
    if (!bool) {
      bool = false;
    }
    for (Object localObject = null;; localObject = this.mDropDownList.getSelectedItem()) {
      return localObject;
    }
  }
  
  public long getSelectedItemId()
  {
    boolean bool = isShowing();
    if (!bool) {}
    DropDownListView localDropDownListView;
    for (long l = Long.MIN_VALUE;; l = localDropDownListView.getSelectedItemId())
    {
      return l;
      localDropDownListView = this.mDropDownList;
    }
  }
  
  public int getSelectedItemPosition()
  {
    boolean bool = isShowing();
    if (!bool) {}
    DropDownListView localDropDownListView;
    for (int i = -1;; i = localDropDownListView.getSelectedItemPosition())
    {
      return i;
      localDropDownListView = this.mDropDownList;
    }
  }
  
  public View getSelectedView()
  {
    boolean bool = isShowing();
    if (!bool) {
      bool = false;
    }
    for (View localView = null;; localView = this.mDropDownList.getSelectedView()) {
      return localView;
    }
  }
  
  public int getSoftInputMode()
  {
    return this.mPopup.getSoftInputMode();
  }
  
  public int getVerticalOffset()
  {
    int i = this.mDropDownVerticalOffsetSet;
    if (i == 0) {}
    int j;
    for (i = 0;; j = this.mDropDownVerticalOffset) {
      return i;
    }
  }
  
  public int getWidth()
  {
    return this.mDropDownWidth;
  }
  
  public boolean isDropDownAlwaysVisible()
  {
    return this.mDropDownAlwaysVisible;
  }
  
  public boolean isInputMethodNotNeeded()
  {
    PopupWindow localPopupWindow = this.mPopup;
    int i = localPopupWindow.getInputMethodMode();
    int k = 2;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localPopupWindow = null;
    }
  }
  
  public boolean isModal()
  {
    return this.mModal;
  }
  
  public boolean isShowing()
  {
    return this.mPopup.isShowing();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 20;
    int j = 19;
    int k = 1;
    boolean bool1 = isShowing();
    Object localObject1;
    boolean bool2;
    int i1;
    Object localObject2;
    int i2;
    DropDownListView localDropDownListView1;
    label132:
    int i4;
    if (bool1)
    {
      int n = 62;
      if (paramInt != n)
      {
        localObject1 = this.mDropDownList;
        n = ((DropDownListView)localObject1).getSelectedItemPosition();
        if (n < 0)
        {
          bool2 = isConfirmKey(paramInt);
          if (bool2) {}
        }
        else
        {
          i1 = this.mDropDownList.getSelectedItemPosition();
          localObject1 = this.mPopup;
          bool2 = ((PopupWindow)localObject1).isAboveAnchor();
          if (!bool2)
          {
            bool2 = k;
            localObject2 = this.mAdapter;
            i2 = -1 >>> 1;
            int i3 = -1 << -1;
            if (localObject2 != null)
            {
              boolean bool3 = ((ListAdapter)localObject2).areAllItemsEnabled();
              if (!bool3) {
                break label216;
              }
              i2 = 0;
              localDropDownListView1 = null;
              if (!bool3) {
                break label235;
              }
              i4 = ((ListAdapter)localObject2).getCount() + -1;
            }
            label148:
            if (((!bool2) || (paramInt != j) || (i1 > i2)) && ((bool2) || (paramInt != i) || (i1 < i4))) {
              break label265;
            }
            clearListSelection();
            localObject1 = this.mPopup;
            ((PopupWindow)localObject1).setInputMethodMode(k);
            show();
          }
        }
      }
    }
    for (;;)
    {
      return k;
      bool2 = false;
      localObject1 = null;
      break;
      label216:
      localDropDownListView1 = this.mDropDownList;
      i2 = localDropDownListView1.lookForSelectablePosition(0, k);
      break label132;
      label235:
      DropDownListView localDropDownListView2 = this.mDropDownList;
      int i5 = ((ListAdapter)localObject2).getCount() + -1;
      i4 = localDropDownListView2.lookForSelectablePosition(i5, false);
      break label148;
      label265:
      this.mDropDownList.setListSelectionHidden(false);
      localObject2 = this.mDropDownList;
      boolean bool4 = ((DropDownListView)localObject2).onKeyDown(paramInt, paramKeyEvent);
      if (bool4)
      {
        localObject1 = this.mPopup;
        i4 = 2;
        ((PopupWindow)localObject1).setInputMethodMode(i4);
        localObject1 = this.mDropDownList;
        ((DropDownListView)localObject1).requestFocusFromTouch();
        show();
        switch (paramInt)
        {
        }
      }
      label394:
      do
      {
        do
        {
          int m = 0;
          break;
          if ((!bool2) || (paramInt != i)) {
            break label394;
          }
        } while (i1 != i4);
        break;
      } while ((bool2) || (paramInt != j) || (i1 != i2));
    }
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    int j = 4;
    boolean bool;
    Object localObject;
    int k;
    if (paramInt == j)
    {
      bool = isShowing();
      if (bool)
      {
        localObject = this.mDropDownAnchorView;
        k = paramKeyEvent.getAction();
        if (k == 0)
        {
          k = paramKeyEvent.getRepeatCount();
          if (k == 0)
          {
            localObject = ((View)localObject).getKeyDispatcherState();
            if (localObject != null) {
              ((KeyEvent.DispatcherState)localObject).startTracking(paramKeyEvent, this);
            }
          }
        }
      }
    }
    for (;;)
    {
      return i;
      k = paramKeyEvent.getAction();
      if (k == i)
      {
        localObject = ((View)localObject).getKeyDispatcherState();
        if (localObject != null) {
          ((KeyEvent.DispatcherState)localObject).handleUpEvent(paramKeyEvent);
        }
        bool = paramKeyEvent.isTracking();
        if (bool)
        {
          bool = paramKeyEvent.isCanceled();
          if (!bool)
          {
            dismiss();
            continue;
          }
        }
      }
      i = 0;
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = isShowing();
    DropDownListView localDropDownListView;
    boolean bool2;
    if (bool1)
    {
      localDropDownListView = this.mDropDownList;
      int i = localDropDownListView.getSelectedItemPosition();
      if (i >= 0)
      {
        localDropDownListView = this.mDropDownList;
        bool2 = localDropDownListView.onKeyUp(paramInt, paramKeyEvent);
        if (bool2)
        {
          boolean bool3 = isConfirmKey(paramInt);
          if (bool3) {
            dismiss();
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localDropDownListView = null;
    }
  }
  
  public boolean performItemClick(int paramInt)
  {
    boolean bool = isShowing();
    AdapterView.OnItemClickListener localOnItemClickListener;
    int i;
    if (bool)
    {
      localOnItemClickListener = this.mItemClickListener;
      if (localOnItemClickListener != null)
      {
        DropDownListView localDropDownListView = this.mDropDownList;
        i = localDropDownListView.getFirstVisiblePosition();
        i = paramInt - i;
        View localView = localDropDownListView.getChildAt(i);
        ListAdapter localListAdapter = localDropDownListView.getAdapter();
        localOnItemClickListener = this.mItemClickListener;
        long l = localListAdapter.getItemId(paramInt);
        localOnItemClickListener.onItemClick(localDropDownListView, localView, paramInt, l);
      }
      i = 1;
    }
    for (;;)
    {
      return i;
      i = 0;
      localOnItemClickListener = null;
    }
  }
  
  public void postShow()
  {
    Handler localHandler = this.mHandler;
    Runnable localRunnable = this.mShowDropDownRunnable;
    localHandler.post(localRunnable);
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    Object localObject1 = this.mObserver;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/ListPopupWindow$PopupDataSetObserver;
      ((ListPopupWindow.PopupDataSetObserver)localObject1).<init>(this);
      this.mObserver = ((DataSetObserver)localObject1);
    }
    for (;;)
    {
      this.mAdapter = paramListAdapter;
      if (paramListAdapter != null)
      {
        localObject1 = this.mObserver;
        paramListAdapter.registerDataSetObserver((DataSetObserver)localObject1);
      }
      localObject1 = this.mDropDownList;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = this.mDropDownList;
        localObject2 = this.mAdapter;
        ((DropDownListView)localObject1).setAdapter((ListAdapter)localObject2);
      }
      return;
      localObject1 = this.mAdapter;
      if (localObject1 != null)
      {
        localObject1 = this.mAdapter;
        localObject2 = this.mObserver;
        ((ListAdapter)localObject1).unregisterDataSetObserver((DataSetObserver)localObject2);
      }
    }
  }
  
  public void setAnchorView(View paramView)
  {
    this.mDropDownAnchorView = paramView;
  }
  
  public void setAnimationStyle(int paramInt)
  {
    this.mPopup.setAnimationStyle(paramInt);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.mPopup.setBackgroundDrawable(paramDrawable);
  }
  
  public void setContentWidth(int paramInt)
  {
    Object localObject = this.mPopup.getBackground();
    if (localObject != null)
    {
      Rect localRect = this.mTempRect;
      ((Drawable)localObject).getPadding(localRect);
      localObject = this.mTempRect;
      int i = ((Rect)localObject).left;
      localRect = this.mTempRect;
      int j = localRect.right;
      i = i + j + paramInt;
      this.mDropDownWidth = i;
    }
    for (;;)
    {
      return;
      setWidth(paramInt);
    }
  }
  
  public void setDropDownAlwaysVisible(boolean paramBoolean)
  {
    this.mDropDownAlwaysVisible = paramBoolean;
  }
  
  public void setDropDownGravity(int paramInt)
  {
    this.mDropDownGravity = paramInt;
  }
  
  public void setEpicenterBounds(Rect paramRect)
  {
    this.mEpicenterBounds = paramRect;
  }
  
  public void setForceIgnoreOutsideTouch(boolean paramBoolean)
  {
    this.mForceIgnoreOutsideTouch = paramBoolean;
  }
  
  public void setHeight(int paramInt)
  {
    if (paramInt < 0)
    {
      int i = -2;
      if (i != paramInt)
      {
        i = -1;
        if (i != paramInt)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
          throw localIllegalArgumentException;
        }
      }
    }
    this.mDropDownHeight = paramInt;
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    this.mDropDownHorizontalOffset = paramInt;
  }
  
  public void setInputMethodMode(int paramInt)
  {
    this.mPopup.setInputMethodMode(paramInt);
  }
  
  void setListItemExpandMax(int paramInt)
  {
    this.mListItemExpandMaximum = paramInt;
  }
  
  public void setListSelector(Drawable paramDrawable)
  {
    this.mDropDownListHighlight = paramDrawable;
  }
  
  public void setModal(boolean paramBoolean)
  {
    this.mModal = paramBoolean;
    this.mPopup.setFocusable(paramBoolean);
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.mPopup.setOnDismissListener(paramOnDismissListener);
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.mItemClickListener = paramOnItemClickListener;
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.mItemSelectedListener = paramOnItemSelectedListener;
  }
  
  public void setOverlapAnchor(boolean paramBoolean)
  {
    this.mOverlapAnchorSet = true;
    this.mOverlapAnchor = paramBoolean;
  }
  
  public void setPromptPosition(int paramInt)
  {
    this.mPromptPosition = paramInt;
  }
  
  public void setPromptView(View paramView)
  {
    boolean bool = isShowing();
    if (bool) {
      removePromptView();
    }
    this.mPromptView = paramView;
    if (bool) {
      show();
    }
  }
  
  public void setSelection(int paramInt)
  {
    DropDownListView localDropDownListView = this.mDropDownList;
    boolean bool = isShowing();
    if ((bool) && (localDropDownListView != null))
    {
      localDropDownListView.setListSelectionHidden(false);
      localDropDownListView.setSelection(paramInt);
      int i = localDropDownListView.getChoiceMode();
      if (i != 0)
      {
        i = 1;
        localDropDownListView.setItemChecked(paramInt, i);
      }
    }
  }
  
  public void setSoftInputMode(int paramInt)
  {
    this.mPopup.setSoftInputMode(paramInt);
  }
  
  public void setVerticalOffset(int paramInt)
  {
    this.mDropDownVerticalOffset = paramInt;
    this.mDropDownVerticalOffsetSet = true;
  }
  
  public void setWidth(int paramInt)
  {
    this.mDropDownWidth = paramInt;
  }
  
  public void setWindowLayoutType(int paramInt)
  {
    this.mDropDownWindowLayoutType = paramInt;
  }
  
  public void show()
  {
    int i = 1;
    int k = -2;
    boolean bool1 = false;
    localObject1 = null;
    int m = -1;
    int n = buildDropDown();
    int i3 = isInputMethodNotNeeded();
    Object localObject2 = this.mPopup;
    int i4 = this.mDropDownWindowLayoutType;
    k.a((PopupWindow)localObject2, i4);
    localObject2 = this.mPopup;
    boolean bool4 = ((PopupWindow)localObject2).isShowing();
    label98:
    label116:
    label144:
    label167:
    int i1;
    if (bool4)
    {
      localObject2 = getAnchorView();
      bool4 = r.z((View)localObject2);
      if (!bool4) {
        return;
      }
      i5 = this.mDropDownWidth;
      PopupWindow localPopupWindow;
      if (i5 == m)
      {
        i4 = m;
        i5 = this.mDropDownHeight;
        if (i5 != m) {
          break label377;
        }
        if (i3 == 0) {
          break label302;
        }
        if (i3 == 0) {
          break label318;
        }
        localPopupWindow = this.mPopup;
        i5 = this.mDropDownWidth;
        if (i5 != m) {
          break label309;
        }
        i5 = m;
        localPopupWindow.setWidth(i5);
        localObject2 = this.mPopup;
        ((PopupWindow)localObject2).setHeight(0);
        i3 = n;
        localObject2 = this.mPopup;
        boolean bool2 = this.mForceIgnoreOutsideTouch;
        if (!bool2)
        {
          bool2 = this.mDropDownAlwaysVisible;
          if (!bool2) {
            bool1 = i;
          }
        }
        ((PopupWindow)localObject2).setOutsideTouchable(bool1);
        localObject2 = this.mPopup;
        localObject1 = getAnchorView();
        i1 = this.mDropDownHorizontalOffset;
        i = this.mDropDownVerticalOffset;
        if (i4 < 0) {
          i4 = m;
        }
        if (i3 >= 0) {
          break label409;
        }
      }
      for (;;)
      {
        ((PopupWindow)localObject2).update((View)localObject1, i1, i, i4, m);
        break;
        i5 = this.mDropDownWidth;
        if (i5 == k)
        {
          localObject2 = getAnchorView();
          i5 = ((View)localObject2).getWidth();
          i4 = i5;
          break label98;
        }
        i5 = this.mDropDownWidth;
        i4 = i5;
        break label98;
        label302:
        i1 = m;
        break label116;
        label309:
        i5 = 0;
        localObject2 = null;
        break label144;
        label318:
        localPopupWindow = this.mPopup;
        i5 = this.mDropDownWidth;
        if (i5 == m) {
          i5 = m;
        }
        for (;;)
        {
          localPopupWindow.setWidth(i5);
          localObject2 = this.mPopup;
          ((PopupWindow)localObject2).setHeight(m);
          i3 = i1;
          break;
          i5 = 0;
          localObject2 = null;
        }
        label377:
        i5 = this.mDropDownHeight;
        if (i5 == k)
        {
          i3 = i1;
          break label167;
        }
        i5 = this.mDropDownHeight;
        i3 = i5;
        break label167;
        label409:
        m = i3;
      }
    }
    int i5 = this.mDropDownWidth;
    label433:
    label450:
    Object localObject3;
    boolean bool3;
    if (i5 == m)
    {
      i5 = m;
      i4 = this.mDropDownHeight;
      if (i4 != m) {
        break label771;
      }
      i1 = m;
      localObject3 = this.mPopup;
      ((PopupWindow)localObject3).setWidth(i5);
      this.mPopup.setHeight(i1);
      setPopupClipToScreenEnabled(i);
      localObject2 = this.mPopup;
      bool3 = this.mForceIgnoreOutsideTouch;
      if (bool3) {
        break label792;
      }
      bool3 = this.mDropDownAlwaysVisible;
      if (bool3) {
        break label792;
      }
    }
    for (;;)
    {
      ((PopupWindow)localObject2).setOutsideTouchable(i);
      localObject2 = this.mPopup;
      localObject1 = this.mTouchInterceptor;
      ((PopupWindow)localObject2).setTouchInterceptor((View.OnTouchListener)localObject1);
      boolean bool5 = this.mOverlapAnchorSet;
      if (bool5)
      {
        localObject2 = this.mPopup;
        bool1 = this.mOverlapAnchor;
        k.a((PopupWindow)localObject2, bool1);
      }
      localObject2 = sSetEpicenterBoundsMethod;
      if (localObject2 != null) {}
      try
      {
        localObject2 = sSetEpicenterBoundsMethod;
        localObject1 = this.mPopup;
        bool3 = true;
        localObject4 = new Object[bool3];
        j = 0;
        localObject3 = this.mEpicenterBounds;
        localObject4[0] = localObject3;
        ((Method)localObject2).invoke(localObject1, (Object[])localObject4);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int j;
          int i2;
          int i6;
          localObject1 = "ListPopupWindow";
          Object localObject4 = "Could not invoke setEpicenterBounds on PopupWindow";
          Log.e((String)localObject1, (String)localObject4, localException);
        }
      }
      localObject2 = this.mPopup;
      localObject1 = getAnchorView();
      i2 = this.mDropDownHorizontalOffset;
      j = this.mDropDownVerticalOffset;
      i4 = this.mDropDownGravity;
      k.a((PopupWindow)localObject2, (View)localObject1, i2, j, i4);
      localObject2 = this.mDropDownList;
      ((DropDownListView)localObject2).setSelection(m);
      bool5 = this.mModal;
      if (bool5)
      {
        localObject2 = this.mDropDownList;
        bool5 = ((DropDownListView)localObject2).isInTouchMode();
        if (!bool5) {}
      }
      else
      {
        clearListSelection();
      }
      bool5 = this.mModal;
      if (bool5) {
        break;
      }
      localObject2 = this.mHandler;
      localObject1 = this.mHideSelector;
      ((Handler)localObject2).post((Runnable)localObject1);
      break;
      i6 = this.mDropDownWidth;
      if (i6 == k)
      {
        localObject2 = getAnchorView();
        i6 = ((View)localObject2).getWidth();
        break label433;
      }
      i6 = this.mDropDownWidth;
      break label433;
      label771:
      i4 = this.mDropDownHeight;
      if (i4 == k) {
        break label450;
      }
      i2 = this.mDropDownHeight;
      break label450;
      label792:
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ListPopupWindow.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */