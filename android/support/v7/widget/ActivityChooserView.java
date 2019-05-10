package android.support.v7.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.b;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.string;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;

public class ActivityChooserView
  extends ViewGroup
  implements ActivityChooserModel.ActivityChooserModelClient
{
  private static final String LOG_TAG = "ActivityChooserView";
  private final View mActivityChooserContent;
  private final Drawable mActivityChooserContentBackground;
  final ActivityChooserView.ActivityChooserViewAdapter mAdapter;
  private final ActivityChooserView.Callbacks mCallbacks;
  private int mDefaultActionButtonContentDescription;
  final FrameLayout mDefaultActivityButton;
  private final ImageView mDefaultActivityButtonImage;
  final FrameLayout mExpandActivityOverflowButton;
  private final ImageView mExpandActivityOverflowButtonImage;
  int mInitialActivityCount;
  private boolean mIsAttachedToWindow;
  boolean mIsSelectingDefaultActivity;
  private final int mListPopupMaxWidth;
  private ListPopupWindow mListPopupWindow;
  final DataSetObserver mModelDataSetObserver;
  PopupWindow.OnDismissListener mOnDismissListener;
  private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
  b mProvider;
  
  public ActivityChooserView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/support/v7/widget/ActivityChooserView$1;
    ((ActivityChooserView.1)localObject1).<init>(this);
    this.mModelDataSetObserver = ((DataSetObserver)localObject1);
    localObject1 = new android/support/v7/widget/ActivityChooserView$2;
    ((ActivityChooserView.2)localObject1).<init>(this);
    this.mOnGlobalLayoutListener = ((ViewTreeObserver.OnGlobalLayoutListener)localObject1);
    this.mInitialActivityCount = i;
    localObject1 = R.styleable.ActivityChooserView;
    localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, 0);
    int j = R.styleable.ActivityChooserView_initialActivityCount;
    j = ((TypedArray)localObject1).getInt(j, i);
    this.mInitialActivityCount = j;
    j = R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable;
    Object localObject2 = ((TypedArray)localObject1).getDrawable(j);
    ((TypedArray)localObject1).recycle();
    localObject1 = LayoutInflater.from(getContext());
    i = R.layout.abc_activity_chooser_view;
    ((LayoutInflater)localObject1).inflate(i, this, true);
    localObject1 = new android/support/v7/widget/ActivityChooserView$Callbacks;
    ((ActivityChooserView.Callbacks)localObject1).<init>(this);
    this.mCallbacks = ((ActivityChooserView.Callbacks)localObject1);
    int k = R.id.activity_chooser_view_content;
    localObject1 = findViewById(k);
    this.mActivityChooserContent = ((View)localObject1);
    localObject1 = this.mActivityChooserContent.getBackground();
    this.mActivityChooserContentBackground = ((Drawable)localObject1);
    k = R.id.default_activity_button;
    localObject1 = (FrameLayout)findViewById(k);
    this.mDefaultActivityButton = ((FrameLayout)localObject1);
    localObject1 = this.mDefaultActivityButton;
    Object localObject3 = this.mCallbacks;
    ((FrameLayout)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    localObject1 = this.mDefaultActivityButton;
    localObject3 = this.mCallbacks;
    ((FrameLayout)localObject1).setOnLongClickListener((View.OnLongClickListener)localObject3);
    localObject1 = this.mDefaultActivityButton;
    i = R.id.image;
    localObject1 = (ImageView)((FrameLayout)localObject1).findViewById(i);
    this.mDefaultActivityButtonImage = ((ImageView)localObject1);
    k = R.id.expand_activities_button;
    localObject1 = (FrameLayout)findViewById(k);
    localObject3 = this.mCallbacks;
    ((FrameLayout)localObject1).setOnClickListener((View.OnClickListener)localObject3);
    localObject3 = new android/support/v7/widget/ActivityChooserView$3;
    ((ActivityChooserView.3)localObject3).<init>(this);
    ((FrameLayout)localObject1).setAccessibilityDelegate((View.AccessibilityDelegate)localObject3);
    localObject3 = new android/support/v7/widget/ActivityChooserView$4;
    ((ActivityChooserView.4)localObject3).<init>(this, (View)localObject1);
    ((FrameLayout)localObject1).setOnTouchListener((View.OnTouchListener)localObject3);
    this.mExpandActivityOverflowButton = ((FrameLayout)localObject1);
    i = R.id.image;
    localObject1 = (ImageView)((FrameLayout)localObject1).findViewById(i);
    this.mExpandActivityOverflowButtonImage = ((ImageView)localObject1);
    this.mExpandActivityOverflowButtonImage.setImageDrawable((Drawable)localObject2);
    localObject1 = new android/support/v7/widget/ActivityChooserView$ActivityChooserViewAdapter;
    ((ActivityChooserView.ActivityChooserViewAdapter)localObject1).<init>(this);
    this.mAdapter = ((ActivityChooserView.ActivityChooserViewAdapter)localObject1);
    localObject1 = this.mAdapter;
    localObject2 = new android/support/v7/widget/ActivityChooserView$5;
    ((ActivityChooserView.5)localObject2).<init>(this);
    ((ActivityChooserView.ActivityChooserViewAdapter)localObject1).registerDataSetObserver((DataSetObserver)localObject2);
    localObject1 = paramContext.getResources();
    j = ((Resources)localObject1).getDisplayMetrics().widthPixels / 2;
    i = R.dimen.abc_config_prefDialogWidth;
    k = ((Resources)localObject1).getDimensionPixelSize(i);
    k = Math.max(j, k);
    this.mListPopupMaxWidth = k;
  }
  
  public boolean dismissPopup()
  {
    boolean bool1 = isShowingPopup();
    if (bool1)
    {
      getListPopupWindow().dismiss();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      boolean bool2 = localViewTreeObserver.isAlive();
      if (bool2)
      {
        ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.mOnGlobalLayoutListener;
        localViewTreeObserver.removeGlobalOnLayoutListener(localOnGlobalLayoutListener);
      }
    }
    return true;
  }
  
  public ActivityChooserModel getDataModel()
  {
    return this.mAdapter.getDataModel();
  }
  
  ListPopupWindow getListPopupWindow()
  {
    ListPopupWindow localListPopupWindow = this.mListPopupWindow;
    if (localListPopupWindow == null)
    {
      localListPopupWindow = new android/support/v7/widget/ListPopupWindow;
      Object localObject = getContext();
      localListPopupWindow.<init>((Context)localObject);
      this.mListPopupWindow = localListPopupWindow;
      localListPopupWindow = this.mListPopupWindow;
      localObject = this.mAdapter;
      localListPopupWindow.setAdapter((ListAdapter)localObject);
      this.mListPopupWindow.setAnchorView(this);
      localListPopupWindow = this.mListPopupWindow;
      boolean bool = true;
      localListPopupWindow.setModal(bool);
      localListPopupWindow = this.mListPopupWindow;
      localObject = this.mCallbacks;
      localListPopupWindow.setOnItemClickListener((AdapterView.OnItemClickListener)localObject);
      localListPopupWindow = this.mListPopupWindow;
      localObject = this.mCallbacks;
      localListPopupWindow.setOnDismissListener((PopupWindow.OnDismissListener)localObject);
    }
    return this.mListPopupWindow;
  }
  
  public boolean isShowingPopup()
  {
    return getListPopupWindow().isShowing();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ActivityChooserModel localActivityChooserModel = this.mAdapter.getDataModel();
    if (localActivityChooserModel != null)
    {
      DataSetObserver localDataSetObserver = this.mModelDataSetObserver;
      localActivityChooserModel.registerObserver(localDataSetObserver);
    }
    this.mIsAttachedToWindow = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject1 = this.mAdapter.getDataModel();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.mModelDataSetObserver;
      ((ActivityChooserModel)localObject1).unregisterObserver(localObject2);
    }
    localObject1 = getViewTreeObserver();
    boolean bool1 = ((ViewTreeObserver)localObject1).isAlive();
    if (bool1)
    {
      localObject2 = this.mOnGlobalLayoutListener;
      ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
    }
    boolean bool2 = isShowingPopup();
    if (bool2) {
      dismissPopup();
    }
    this.mIsAttachedToWindow = false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = this.mActivityChooserContent;
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    localView.layout(0, 0, i, j);
    boolean bool = isShowingPopup();
    if (!bool) {
      dismissPopup();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = this.mActivityChooserContent;
    FrameLayout localFrameLayout = this.mDefaultActivityButton;
    int i = localFrameLayout.getVisibility();
    if (i != 0)
    {
      i = View.MeasureSpec.getSize(paramInt2);
      int j = 1073741824;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(i, j);
    }
    measureChild(localView, paramInt1, paramInt2);
    i = localView.getMeasuredWidth();
    int k = localView.getMeasuredHeight();
    setMeasuredDimension(i, k);
  }
  
  public void setActivityChooserModel(ActivityChooserModel paramActivityChooserModel)
  {
    ActivityChooserView.ActivityChooserViewAdapter localActivityChooserViewAdapter = this.mAdapter;
    localActivityChooserViewAdapter.setDataModel(paramActivityChooserModel);
    boolean bool = isShowingPopup();
    if (bool)
    {
      dismissPopup();
      showPopup();
    }
  }
  
  public void setDefaultActionButtonContentDescription(int paramInt)
  {
    this.mDefaultActionButtonContentDescription = paramInt;
  }
  
  public void setExpandActivityOverflowButtonContentDescription(int paramInt)
  {
    String str = getContext().getString(paramInt);
    this.mExpandActivityOverflowButtonImage.setContentDescription(str);
  }
  
  public void setExpandActivityOverflowButtonDrawable(Drawable paramDrawable)
  {
    this.mExpandActivityOverflowButtonImage.setImageDrawable(paramDrawable);
  }
  
  public void setInitialActivityCount(int paramInt)
  {
    this.mInitialActivityCount = paramInt;
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.mOnDismissListener = paramOnDismissListener;
  }
  
  public void setProvider(b paramb)
  {
    this.mProvider = paramb;
  }
  
  public boolean showPopup()
  {
    boolean bool1 = false;
    boolean bool2 = isShowingPopup();
    if (!bool2)
    {
      bool2 = this.mIsAttachedToWindow;
      if (bool2) {
        break label22;
      }
    }
    for (;;)
    {
      return bool1;
      label22:
      this.mIsSelectingDefaultActivity = false;
      int i = this.mInitialActivityCount;
      showPopupUnchecked(i);
      i = 1;
    }
  }
  
  void showPopupUnchecked(int paramInt)
  {
    int i = 1;
    Object localObject1 = this.mAdapter.getDataModel();
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("No data model. Did you call #setDataModel?");
      throw ((Throwable)localObject1);
    }
    localObject1 = getViewTreeObserver();
    Object localObject2 = this.mOnGlobalLayoutListener;
    ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
    localObject1 = this.mDefaultActivityButton;
    int j = ((FrameLayout)localObject1).getVisibility();
    int i1;
    if (j == 0)
    {
      j = i;
      localObject2 = this.mAdapter;
      int m = ((ActivityChooserView.ActivityChooserViewAdapter)localObject2).getActivityCount();
      if (j == 0) {
        break label301;
      }
      i1 = i;
      label84:
      int i2 = -1 >>> 1;
      if (paramInt == i2) {
        break label310;
      }
      i1 += paramInt;
      if (m <= i1) {
        break label310;
      }
      this.mAdapter.setShowFooterView(i);
      localObject2 = this.mAdapter;
      m = paramInt + -1;
      ((ActivityChooserView.ActivityChooserViewAdapter)localObject2).setMaxActivityCount(m);
      label134:
      localObject2 = getListPopupWindow();
      boolean bool = ((ListPopupWindow)localObject2).isShowing();
      if (!bool)
      {
        bool = this.mIsSelectingDefaultActivity;
        if ((!bool) && (j != 0)) {
          break label333;
        }
        ActivityChooserView.ActivityChooserViewAdapter localActivityChooserViewAdapter = this.mAdapter;
        localActivityChooserViewAdapter.setShowDefaultActivity(i, j);
      }
    }
    for (;;)
    {
      int k = this.mAdapter.measureContentWidth();
      int n = this.mListPopupMaxWidth;
      k = Math.min(k, n);
      ((ListPopupWindow)localObject2).setContentWidth(k);
      ((ListPopupWindow)localObject2).show();
      localObject1 = this.mProvider;
      if (localObject1 != null)
      {
        localObject1 = this.mProvider;
        ((b)localObject1).subUiVisibilityChanged(i);
      }
      localObject1 = ((ListPopupWindow)localObject2).getListView();
      Object localObject3 = getContext();
      n = R.string.abc_activitychooserview_choose_application;
      localObject3 = ((Context)localObject3).getString(n);
      ((ListView)localObject1).setContentDescription((CharSequence)localObject3);
      localObject1 = ((ListPopupWindow)localObject2).getListView();
      localObject3 = new android/graphics/drawable/ColorDrawable;
      ((ColorDrawable)localObject3).<init>(0);
      ((ListView)localObject1).setSelector((Drawable)localObject3);
      return;
      k = 0;
      localObject1 = null;
      break;
      label301:
      i1 = 0;
      localObject2 = null;
      break label84;
      label310:
      this.mAdapter.setShowFooterView(false);
      localObject2 = this.mAdapter;
      ((ActivityChooserView.ActivityChooserViewAdapter)localObject2).setMaxActivityCount(paramInt);
      break label134;
      label333:
      localObject1 = this.mAdapter;
      ((ActivityChooserView.ActivityChooserViewAdapter)localObject1).setShowDefaultActivity(false, false);
    }
  }
  
  void updateAppearance()
  {
    int i = 1;
    Object localObject1 = this.mAdapter;
    int j = ((ActivityChooserView.ActivityChooserViewAdapter)localObject1).getCount();
    Object localObject2;
    int m;
    if (j > 0)
    {
      localObject1 = this.mExpandActivityOverflowButton;
      ((FrameLayout)localObject1).setEnabled(i);
      localObject1 = this.mAdapter;
      j = ((ActivityChooserView.ActivityChooserViewAdapter)localObject1).getActivityCount();
      localObject2 = this.mAdapter;
      m = ((ActivityChooserView.ActivityChooserViewAdapter)localObject2).getHistorySize();
      if ((j != i) && ((j <= i) || (m <= 0))) {
        break label218;
      }
      this.mDefaultActivityButton.setVisibility(0);
      localObject1 = this.mAdapter.getDefaultActivity();
      localObject2 = getContext().getPackageManager();
      ImageView localImageView = this.mDefaultActivityButtonImage;
      Object localObject3 = ((ResolveInfo)localObject1).loadIcon((PackageManager)localObject2);
      localImageView.setImageDrawable((Drawable)localObject3);
      int n = this.mDefaultActionButtonContentDescription;
      if (n != 0)
      {
        localObject1 = ((ResolveInfo)localObject1).loadLabel((PackageManager)localObject2);
        localObject2 = getContext();
        n = this.mDefaultActionButtonContentDescription;
        localObject3 = new Object[i];
        localObject3[0] = localObject1;
        localObject1 = ((Context)localObject2).getString(n, (Object[])localObject3);
        localObject2 = this.mDefaultActivityButton;
        ((FrameLayout)localObject2).setContentDescription((CharSequence)localObject1);
      }
      label173:
      localObject1 = this.mDefaultActivityButton;
      int k = ((FrameLayout)localObject1).getVisibility();
      if (k != 0) {
        break label236;
      }
      localObject1 = this.mActivityChooserContent;
      localObject2 = this.mActivityChooserContentBackground;
      ((View)localObject1).setBackgroundDrawable((Drawable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.mExpandActivityOverflowButton;
      ((FrameLayout)localObject1).setEnabled(false);
      break;
      label218:
      localObject1 = this.mDefaultActivityButton;
      m = 8;
      ((FrameLayout)localObject1).setVisibility(m);
      break label173;
      label236:
      localObject1 = this.mActivityChooserContent;
      m = 0;
      localObject2 = null;
      ((View)localObject1).setBackgroundDrawable(null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */