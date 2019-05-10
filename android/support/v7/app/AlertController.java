package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.r;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.b;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

class AlertController
{
  ListAdapter mAdapter;
  private int mAlertDialogLayout;
  private final View.OnClickListener mButtonHandler;
  private final int mButtonIconDimen;
  Button mButtonNegative;
  private Drawable mButtonNegativeIcon;
  Message mButtonNegativeMessage;
  private CharSequence mButtonNegativeText;
  Button mButtonNeutral;
  private Drawable mButtonNeutralIcon;
  Message mButtonNeutralMessage;
  private CharSequence mButtonNeutralText;
  private int mButtonPanelLayoutHint = 0;
  private int mButtonPanelSideLayout;
  Button mButtonPositive;
  private Drawable mButtonPositiveIcon;
  Message mButtonPositiveMessage;
  private CharSequence mButtonPositiveText;
  int mCheckedItem = -1;
  private final Context mContext;
  private View mCustomTitleView;
  final AppCompatDialog mDialog;
  Handler mHandler;
  private Drawable mIcon;
  private int mIconId = 0;
  private ImageView mIconView;
  int mListItemLayout;
  int mListLayout;
  ListView mListView;
  private CharSequence mMessage;
  private TextView mMessageView;
  int mMultiChoiceItemLayout;
  NestedScrollView mScrollView;
  private boolean mShowTitle;
  int mSingleChoiceItemLayout;
  private CharSequence mTitle;
  private TextView mTitleView;
  private View mView;
  private int mViewLayoutResId;
  private int mViewSpacingBottom;
  private int mViewSpacingLeft;
  private int mViewSpacingRight;
  private boolean mViewSpacingSpecified = false;
  private int mViewSpacingTop;
  private final Window mWindow;
  
  public AlertController(Context paramContext, AppCompatDialog paramAppCompatDialog, Window paramWindow)
  {
    Object localObject = new android/support/v7/app/AlertController$1;
    ((AlertController.1)localObject).<init>(this);
    this.mButtonHandler = ((View.OnClickListener)localObject);
    this.mContext = paramContext;
    this.mDialog = paramAppCompatDialog;
    this.mWindow = paramWindow;
    localObject = new android/support/v7/app/AlertController$ButtonHandler;
    ((AlertController.ButtonHandler)localObject).<init>(paramAppCompatDialog);
    this.mHandler = ((Handler)localObject);
    int[] arrayOfInt = R.styleable.AlertDialog;
    int j = R.attr.alertDialogStyle;
    localObject = paramContext.obtainStyledAttributes(null, arrayOfInt, j, 0);
    int k = R.styleable.AlertDialog_android_layout;
    k = ((TypedArray)localObject).getResourceId(k, 0);
    this.mAlertDialogLayout = k;
    k = R.styleable.AlertDialog_buttonPanelSideLayout;
    k = ((TypedArray)localObject).getResourceId(k, 0);
    this.mButtonPanelSideLayout = k;
    k = R.styleable.AlertDialog_listLayout;
    k = ((TypedArray)localObject).getResourceId(k, 0);
    this.mListLayout = k;
    k = R.styleable.AlertDialog_multiChoiceItemLayout;
    k = ((TypedArray)localObject).getResourceId(k, 0);
    this.mMultiChoiceItemLayout = k;
    k = R.styleable.AlertDialog_singleChoiceItemLayout;
    k = ((TypedArray)localObject).getResourceId(k, 0);
    this.mSingleChoiceItemLayout = k;
    k = R.styleable.AlertDialog_listItemLayout;
    k = ((TypedArray)localObject).getResourceId(k, 0);
    this.mListItemLayout = k;
    k = R.styleable.AlertDialog_showTitle;
    boolean bool = ((TypedArray)localObject).getBoolean(k, i);
    this.mShowTitle = bool;
    int m = R.styleable.AlertDialog_buttonIconDimen;
    m = ((TypedArray)localObject).getDimensionPixelSize(m, 0);
    this.mButtonIconDimen = m;
    ((TypedArray)localObject).recycle();
    paramAppCompatDialog.supportRequestWindowFeature(i);
  }
  
  static boolean canTextInput(View paramView)
  {
    boolean bool1 = true;
    boolean bool2 = paramView.onCheckIsTextEditor();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = paramView instanceof ViewGroup;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        for (;;)
        {
          if (i > 0)
          {
            i += -1;
            View localView = paramView.getChildAt(i);
            boolean bool3 = canTextInput(localView);
            if (bool3) {
              break;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  private void centerButton(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    localLayoutParams.gravity = 1;
    localLayoutParams.weight = 0.5F;
    paramButton.setLayoutParams(localLayoutParams);
  }
  
  static void manageScrollIndicators(View paramView1, View paramView2, View paramView3)
  {
    int i = 4;
    int j = 0;
    boolean bool;
    if (paramView2 != null)
    {
      int k = paramView1.canScrollVertically(-1);
      if (k != 0)
      {
        k = 0;
        paramView2.setVisibility(k);
      }
    }
    else if (paramView3 != null)
    {
      bool = paramView1.canScrollVertically(1);
      if (!bool) {
        break label59;
      }
    }
    for (;;)
    {
      paramView3.setVisibility(j);
      return;
      bool = i;
      break;
      label59:
      j = i;
    }
  }
  
  private ViewGroup resolvePanel(View paramView1, View paramView2)
  {
    boolean bool1;
    if (paramView1 == null)
    {
      bool1 = paramView2 instanceof ViewStub;
      if (!bool1) {
        break label105;
      }
      paramView2 = (ViewStub)paramView2;
    }
    label105:
    for (Object localObject = paramView2.inflate();; localObject = paramView2)
    {
      localObject = (ViewGroup)localObject;
      return (ViewGroup)localObject;
      if (paramView2 != null)
      {
        localObject = paramView2.getParent();
        boolean bool2 = localObject instanceof ViewGroup;
        if (bool2)
        {
          localObject = (ViewGroup)localObject;
          ((ViewGroup)localObject).removeView(paramView2);
        }
      }
      bool1 = paramView1 instanceof ViewStub;
      if (bool1) {
        paramView1 = (ViewStub)paramView1;
      }
      for (localObject = paramView1.inflate();; localObject = paramView1)
      {
        localObject = (ViewGroup)localObject;
        break;
      }
    }
  }
  
  private int selectContentView()
  {
    int i = this.mButtonPanelSideLayout;
    if (i == 0) {
      i = this.mAlertDialogLayout;
    }
    for (;;)
    {
      return i;
      i = this.mButtonPanelLayoutHint;
      int j = 1;
      if (i == j) {
        i = this.mButtonPanelSideLayout;
      } else {
        i = this.mAlertDialogLayout;
      }
    }
  }
  
  private void setScrollIndicators(ViewGroup paramViewGroup, View paramView, int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = this.mWindow;
    int i = R.id.scrollIndicatorUp;
    View localView = ((Window)localObject2).findViewById(i);
    localObject2 = this.mWindow;
    int j = R.id.scrollIndicatorDown;
    localObject2 = ((Window)localObject2).findViewById(j);
    j = Build.VERSION.SDK_INT;
    int k = 23;
    if (j >= k)
    {
      r.a(paramView, paramInt1, paramInt2);
      if (localView != null) {
        paramViewGroup.removeView(localView);
      }
      if (localObject2 != null) {
        paramViewGroup.removeView((View)localObject2);
      }
    }
    label319:
    for (;;)
    {
      return;
      if (localView != null)
      {
        j = paramInt1 & 0x1;
        if (j == 0)
        {
          paramViewGroup.removeView(localView);
          i = 0;
          localView = null;
        }
      }
      if (localObject2 != null)
      {
        j = paramInt1 & 0x2;
        if (j == 0) {
          paramViewGroup.removeView((View)localObject2);
        }
      }
      for (;;)
      {
        if ((localView == null) && (localObject1 == null)) {
          break label319;
        }
        localObject2 = this.mMessage;
        Object localObject3;
        if (localObject2 != null)
        {
          localObject2 = this.mScrollView;
          localObject3 = new android/support/v7/app/AlertController$2;
          ((AlertController.2)localObject3).<init>(this, localView, (View)localObject1);
          ((NestedScrollView)localObject2).setOnScrollChangeListener((NestedScrollView.b)localObject3);
          localObject2 = this.mScrollView;
          localObject3 = new android/support/v7/app/AlertController$3;
          ((AlertController.3)localObject3).<init>(this, localView, (View)localObject1);
          ((NestedScrollView)localObject2).post((Runnable)localObject3);
          break;
        }
        localObject2 = this.mListView;
        if (localObject2 != null)
        {
          localObject2 = this.mListView;
          localObject3 = new android/support/v7/app/AlertController$4;
          ((AlertController.4)localObject3).<init>(this, localView, (View)localObject1);
          ((ListView)localObject2).setOnScrollListener((AbsListView.OnScrollListener)localObject3);
          localObject2 = this.mListView;
          localObject3 = new android/support/v7/app/AlertController$5;
          ((AlertController.5)localObject3).<init>(this, localView, (View)localObject1);
          ((ListView)localObject2).post((Runnable)localObject3);
          break;
        }
        if (localView != null) {
          paramViewGroup.removeView(localView);
        }
        if (localObject1 == null) {
          break;
        }
        paramViewGroup.removeView((View)localObject1);
        break;
        localObject1 = localObject2;
      }
    }
  }
  
  private void setupButtons(ViewGroup paramViewGroup)
  {
    int i = 1;
    int j = 8;
    int k = 2;
    int m = 4;
    Object localObject1 = (Button)paramViewGroup.findViewById(16908313);
    this.mButtonPositive = ((Button)localObject1);
    localObject1 = this.mButtonPositive;
    Object localObject2 = this.mButtonHandler;
    ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    localObject1 = this.mButtonPositiveText;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    int n;
    Object localObject3;
    if (bool)
    {
      localObject1 = this.mButtonPositiveIcon;
      if (localObject1 == null)
      {
        localObject1 = this.mButtonPositive;
        ((Button)localObject1).setVisibility(j);
        n = 0;
        localObject2 = null;
        localObject1 = (Button)paramViewGroup.findViewById(16908314);
        this.mButtonNegative = ((Button)localObject1);
        localObject1 = this.mButtonNegative;
        localObject3 = this.mButtonHandler;
        ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject3);
        localObject1 = this.mButtonNegativeText;
        bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool) {
          break label401;
        }
        localObject1 = this.mButtonNegativeIcon;
        if (localObject1 != null) {
          break label401;
        }
        localObject1 = this.mButtonNegative;
        ((Button)localObject1).setVisibility(j);
        label173:
        localObject1 = (Button)paramViewGroup.findViewById(16908315);
        this.mButtonNeutral = ((Button)localObject1);
        localObject1 = this.mButtonNeutral;
        localObject3 = this.mButtonHandler;
        ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject3);
        localObject1 = this.mButtonNeutralText;
        bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool) {
          break label504;
        }
        localObject1 = this.mButtonNeutralIcon;
        if (localObject1 != null) {
          break label504;
        }
        localObject1 = this.mButtonNeutral;
        ((Button)localObject1).setVisibility(j);
        label251:
        localObject1 = this.mContext;
        bool = shouldCenterSingleButton((Context)localObject1);
        if (bool)
        {
          if (n != i) {
            break label607;
          }
          localObject1 = this.mButtonPositive;
          centerButton((Button)localObject1);
        }
        label287:
        if (n == 0) {
          break label651;
        }
      }
    }
    for (;;)
    {
      if (i == 0) {
        paramViewGroup.setVisibility(j);
      }
      return;
      localObject1 = this.mButtonPositive;
      localObject2 = this.mButtonPositiveText;
      ((Button)localObject1).setText((CharSequence)localObject2);
      localObject1 = this.mButtonPositiveIcon;
      int i1;
      if (localObject1 != null)
      {
        localObject1 = this.mButtonPositiveIcon;
        n = this.mButtonIconDimen;
        i1 = this.mButtonIconDimen;
        ((Drawable)localObject1).setBounds(0, 0, n, i1);
        localObject1 = this.mButtonPositive;
        localObject2 = this.mButtonPositiveIcon;
        ((Button)localObject1).setCompoundDrawables((Drawable)localObject2, null, null, null);
      }
      localObject1 = this.mButtonPositive;
      ((Button)localObject1).setVisibility(0);
      n = i;
      break;
      label401:
      localObject1 = this.mButtonNegative;
      localObject3 = this.mButtonNegativeText;
      ((Button)localObject1).setText((CharSequence)localObject3);
      localObject1 = this.mButtonNegativeIcon;
      int i2;
      if (localObject1 != null)
      {
        localObject1 = this.mButtonNegativeIcon;
        i1 = this.mButtonIconDimen;
        i2 = this.mButtonIconDimen;
        ((Drawable)localObject1).setBounds(0, 0, i1, i2);
        localObject1 = this.mButtonNegative;
        localObject3 = this.mButtonNegativeIcon;
        ((Button)localObject1).setCompoundDrawables((Drawable)localObject3, null, null, null);
      }
      localObject1 = this.mButtonNegative;
      ((Button)localObject1).setVisibility(0);
      n |= k;
      break label173;
      label504:
      localObject1 = this.mButtonNeutral;
      localObject3 = this.mButtonNeutralText;
      ((Button)localObject1).setText((CharSequence)localObject3);
      localObject1 = this.mButtonPositiveIcon;
      if (localObject1 != null)
      {
        localObject1 = this.mButtonPositiveIcon;
        i1 = this.mButtonIconDimen;
        i2 = this.mButtonIconDimen;
        ((Drawable)localObject1).setBounds(0, 0, i1, i2);
        localObject1 = this.mButtonPositive;
        localObject3 = this.mButtonPositiveIcon;
        ((Button)localObject1).setCompoundDrawables((Drawable)localObject3, null, null, null);
      }
      localObject1 = this.mButtonNeutral;
      ((Button)localObject1).setVisibility(0);
      n |= m;
      break label251;
      label607:
      if (n == k)
      {
        localObject1 = this.mButtonNegative;
        centerButton((Button)localObject1);
        break label287;
      }
      if (n != m) {
        break label287;
      }
      localObject1 = this.mButtonNeutral;
      centerButton((Button)localObject1);
      break label287;
      label651:
      i = 0;
    }
  }
  
  private void setupContent(ViewGroup paramViewGroup)
  {
    int i = 8;
    ListView localListView = null;
    int j = -1;
    Object localObject1 = this.mWindow;
    int k = R.id.scrollView;
    localObject1 = (NestedScrollView)((Window)localObject1).findViewById(k);
    this.mScrollView = ((NestedScrollView)localObject1);
    this.mScrollView.setFocusable(false);
    this.mScrollView.setNestedScrollingEnabled(false);
    int m = 16908299;
    localObject1 = (TextView)paramViewGroup.findViewById(m);
    this.mMessageView = ((TextView)localObject1);
    localObject1 = this.mMessageView;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.mMessage;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = this.mMessageView;
        localObject2 = this.mMessage;
        ((TextView)localObject1).setText((CharSequence)localObject2);
      }
      else
      {
        this.mMessageView.setVisibility(i);
        localObject1 = this.mScrollView;
        localObject2 = this.mMessageView;
        ((NestedScrollView)localObject1).removeView((View)localObject2);
        localObject1 = this.mListView;
        if (localObject1 != null)
        {
          localObject1 = (ViewGroup)this.mScrollView.getParent();
          localObject2 = this.mScrollView;
          k = ((ViewGroup)localObject1).indexOfChild((View)localObject2);
          ((ViewGroup)localObject1).removeViewAt(k);
          localListView = this.mListView;
          ViewGroup.LayoutParams localLayoutParams = new android/view/ViewGroup$LayoutParams;
          localLayoutParams.<init>(j, j);
          ((ViewGroup)localObject1).addView(localListView, k, localLayoutParams);
        }
        else
        {
          paramViewGroup.setVisibility(i);
        }
      }
    }
  }
  
  private void setupCustomContent(ViewGroup paramViewGroup)
  {
    int i = 131072;
    int j = 0;
    Object localObject1 = null;
    int k = -1;
    Object localObject2 = this.mView;
    int m;
    int n;
    if (localObject2 != null)
    {
      localObject2 = this.mView;
      if (localObject2 != null) {
        j = 1;
      }
      if (j != 0)
      {
        boolean bool1 = canTextInput((View)localObject2);
        if (bool1) {}
      }
      else
      {
        localObject3 = this.mWindow;
        ((Window)localObject3).setFlags(i, i);
      }
      if (j == 0) {
        break label243;
      }
      localObject1 = this.mWindow;
      m = R.id.custom;
      localObject1 = (FrameLayout)((Window)localObject1).findViewById(m);
      Object localObject3 = new android/view/ViewGroup$LayoutParams;
      ((ViewGroup.LayoutParams)localObject3).<init>(k, k);
      ((FrameLayout)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
      boolean bool2 = this.mViewSpacingSpecified;
      if (bool2)
      {
        n = this.mViewSpacingLeft;
        m = this.mViewSpacingTop;
        k = this.mViewSpacingRight;
        i = this.mViewSpacingBottom;
        ((FrameLayout)localObject1).setPadding(n, m, k, i);
      }
      localObject1 = this.mListView;
      if (localObject1 != null)
      {
        localObject1 = (LinearLayoutCompat.LayoutParams)paramViewGroup.getLayoutParams();
        n = 0;
        localObject2 = null;
        ((LinearLayoutCompat.LayoutParams)localObject1).weight = 0.0F;
      }
    }
    for (;;)
    {
      return;
      n = this.mViewLayoutResId;
      if (n != 0)
      {
        localObject2 = LayoutInflater.from(this.mContext);
        m = this.mViewLayoutResId;
        localObject2 = ((LayoutInflater)localObject2).inflate(m, paramViewGroup, false);
        break;
      }
      n = 0;
      localObject2 = null;
      break;
      label243:
      j = 8;
      paramViewGroup.setVisibility(j);
    }
  }
  
  private void setupTitle(ViewGroup paramViewGroup)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 8;
    Object localObject2 = this.mCustomTitleView;
    int k;
    int m;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject2 = new android/view/ViewGroup$LayoutParams;
      k = -1;
      m = -2;
      ((ViewGroup.LayoutParams)localObject2).<init>(k, m);
      localObject3 = this.mCustomTitleView;
      paramViewGroup.addView((View)localObject3, 0, (ViewGroup.LayoutParams)localObject2);
      localObject2 = this.mWindow;
      i = R.id.title_template;
      localObject2 = ((Window)localObject2).findViewById(i);
      ((View)localObject2).setVisibility(j);
    }
    for (;;)
    {
      return;
      localObject2 = this.mWindow;
      k = 16908294;
      localObject2 = (ImageView)((Window)localObject2).findViewById(k);
      this.mIconView = ((ImageView)localObject2);
      localObject2 = this.mTitle;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool) {
        bool = true;
      }
      for (;;)
      {
        if (bool)
        {
          bool = this.mShowTitle;
          if (bool)
          {
            localObject2 = this.mWindow;
            i = R.id.alertTitle;
            localObject2 = (TextView)((Window)localObject2).findViewById(i);
            this.mTitleView = ((TextView)localObject2);
            localObject2 = this.mTitleView;
            localObject1 = this.mTitle;
            ((TextView)localObject2).setText((CharSequence)localObject1);
            int n = this.mIconId;
            if (n != 0)
            {
              localObject2 = this.mIconView;
              i = this.mIconId;
              ((ImageView)localObject2).setImageResource(i);
              break;
              n = 0;
              localObject2 = null;
              continue;
            }
            localObject2 = this.mIcon;
            if (localObject2 != null)
            {
              localObject2 = this.mIconView;
              localObject1 = this.mIcon;
              ((ImageView)localObject2).setImageDrawable((Drawable)localObject1);
              break;
            }
            localObject2 = this.mTitleView;
            localObject1 = this.mIconView;
            i = ((ImageView)localObject1).getPaddingLeft();
            localObject3 = this.mIconView;
            k = ((ImageView)localObject3).getPaddingTop();
            ImageView localImageView1 = this.mIconView;
            m = localImageView1.getPaddingRight();
            ImageView localImageView2 = this.mIconView;
            int i1 = localImageView2.getPaddingBottom();
            ((TextView)localObject2).setPadding(i, k, m, i1);
            localObject2 = this.mIconView;
            ((ImageView)localObject2).setVisibility(j);
            break;
          }
        }
      }
      localObject2 = this.mWindow;
      i = R.id.title_template;
      ((Window)localObject2).findViewById(i).setVisibility(j);
      localObject2 = this.mIconView;
      ((ImageView)localObject2).setVisibility(j);
      paramViewGroup.setVisibility(j);
    }
  }
  
  private void setupView()
  {
    int i = 8;
    int j = 1;
    int k = 0;
    ListAdapter localListAdapter = null;
    Object localObject1 = this.mWindow;
    int m = R.id.parentPanel;
    localObject1 = ((Window)localObject1).findViewById(m);
    m = R.id.topPanel;
    View localView = ((View)localObject1).findViewById(m);
    int i1 = R.id.contentPanel;
    Object localObject2 = ((View)localObject1).findViewById(i1);
    int i2 = R.id.buttonPanel;
    Object localObject3 = ((View)localObject1).findViewById(i2);
    int i4 = R.id.customPanel;
    localObject1 = (ViewGroup)((View)localObject1).findViewById(i4);
    setupCustomContent((ViewGroup)localObject1);
    i4 = R.id.topPanel;
    Object localObject4 = ((ViewGroup)localObject1).findViewById(i4);
    int i5 = R.id.contentPanel;
    Object localObject5 = ((ViewGroup)localObject1).findViewById(i5);
    int i6 = R.id.buttonPanel;
    Object localObject6 = ((ViewGroup)localObject1).findViewById(i6);
    localObject4 = resolvePanel((View)localObject4, localView);
    localObject5 = resolvePanel((View)localObject5, (View)localObject2);
    localObject3 = resolvePanel((View)localObject6, (View)localObject3);
    setupContent((ViewGroup)localObject5);
    setupButtons((ViewGroup)localObject3);
    setupTitle((ViewGroup)localObject4);
    label227:
    label248:
    label364:
    label426:
    label439:
    int i8;
    if (localObject1 != null)
    {
      int i7 = ((ViewGroup)localObject1).getVisibility();
      if (i7 != i)
      {
        i1 = j;
        if (localObject4 == null) {
          break label539;
        }
        i7 = ((ViewGroup)localObject4).getVisibility();
        if (i7 == i) {
          break label539;
        }
        m = j;
        if (localObject3 == null) {
          break label548;
        }
        i7 = ((ViewGroup)localObject3).getVisibility();
        if (i7 == i) {
          break label548;
        }
        i2 = j;
        if ((i2 == 0) && (localObject5 != null))
        {
          i7 = R.id.textSpacerNoButtons;
          localObject1 = ((ViewGroup)localObject5).findViewById(i7);
          if (localObject1 != null) {
            ((View)localObject1).setVisibility(0);
          }
        }
        if (m == 0) {
          break label557;
        }
        localObject1 = this.mScrollView;
        if (localObject1 != null)
        {
          localObject1 = this.mScrollView;
          ((NestedScrollView)localObject1).setClipToPadding(j);
        }
        i7 = 0;
        localObject1 = null;
        localObject6 = this.mMessage;
        if (localObject6 == null)
        {
          localObject6 = this.mListView;
          if (localObject6 == null) {}
        }
        else
        {
          i7 = R.id.titleDividerNoCustom;
          localObject1 = ((ViewGroup)localObject4).findViewById(i7);
        }
        if (localObject1 != null) {
          ((View)localObject1).setVisibility(0);
        }
        localObject1 = this.mListView;
        boolean bool = localObject1 instanceof AlertController.RecycleListView;
        if (bool)
        {
          localObject1 = (AlertController.RecycleListView)this.mListView;
          ((AlertController.RecycleListView)localObject1).setHasDecor(m, i2);
        }
        if (i1 == 0)
        {
          localObject1 = this.mListView;
          if (localObject1 == null) {
            break label590;
          }
          localObject1 = this.mListView;
          localObject2 = localObject1;
          if (localObject2 != null)
          {
            if (m == 0) {
              break label603;
            }
            m = j;
            if (i2 == 0) {
              break label612;
            }
            i8 = 2;
          }
        }
      }
    }
    for (;;)
    {
      i8 |= m;
      k = 3;
      setScrollIndicators((ViewGroup)localObject5, (View)localObject2, i8, k);
      localObject1 = this.mListView;
      if (localObject1 != null)
      {
        localListAdapter = this.mAdapter;
        if (localListAdapter != null)
        {
          localListAdapter = this.mAdapter;
          ((ListView)localObject1).setAdapter(localListAdapter);
          k = this.mCheckedItem;
          n = -1;
          if (k > n)
          {
            ((ListView)localObject1).setItemChecked(k, j);
            ((ListView)localObject1).setSelection(k);
          }
        }
      }
      return;
      i1 = 0;
      localObject2 = null;
      break;
      label539:
      int n = 0;
      localView = null;
      break label227;
      label548:
      int i3 = 0;
      localObject3 = null;
      break label248;
      label557:
      if (localObject5 == null) {
        break label364;
      }
      int i9 = R.id.textSpacerNoTitle;
      localObject1 = ((ViewGroup)localObject5).findViewById(i9);
      if (localObject1 == null) {
        break label364;
      }
      ((View)localObject1).setVisibility(0);
      break label364;
      label590:
      localObject1 = this.mScrollView;
      localObject2 = localObject1;
      break label426;
      label603:
      n = 0;
      localView = null;
      break label439;
      label612:
      i9 = 0;
      localObject1 = null;
    }
  }
  
  private static boolean shouldCenterSingleButton(Context paramContext)
  {
    boolean bool = true;
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    Resources.Theme localTheme = paramContext.getTheme();
    int i = R.attr.alertDialogCenterButtons;
    localTheme.resolveAttribute(i, localTypedValue, bool);
    int j = localTypedValue.data;
    if (j != 0) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public Button getButton(int paramInt)
  {
    Button localButton;
    switch (paramInt)
    {
    default: 
      localButton = null;
    }
    for (;;)
    {
      return localButton;
      localButton = this.mButtonPositive;
      continue;
      localButton = this.mButtonNegative;
      continue;
      localButton = this.mButtonNeutral;
    }
  }
  
  public int getIconAttributeResId(int paramInt)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    this.mContext.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    return localTypedValue.resourceId;
  }
  
  public ListView getListView()
  {
    return this.mListView;
  }
  
  public void installContent()
  {
    int i = selectContentView();
    this.mDialog.setContentView(i);
    setupView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = this.mScrollView;
    boolean bool;
    if (localNestedScrollView != null)
    {
      localNestedScrollView = this.mScrollView;
      bool = localNestedScrollView.a(paramKeyEvent);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNestedScrollView = null;
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = this.mScrollView;
    boolean bool;
    if (localNestedScrollView != null)
    {
      localNestedScrollView = this.mScrollView;
      bool = localNestedScrollView.a(paramKeyEvent);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNestedScrollView = null;
    }
  }
  
  public void setButton(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage, Drawable paramDrawable)
  {
    Object localObject;
    if ((paramMessage == null) && (paramOnClickListener != null))
    {
      localObject = this.mHandler;
      paramMessage = ((Handler)localObject).obtainMessage(paramInt, paramOnClickListener);
    }
    switch (paramInt)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Button does not exist");
      throw ((Throwable)localObject);
    case -1: 
      this.mButtonPositiveText = paramCharSequence;
      this.mButtonPositiveMessage = paramMessage;
      this.mButtonPositiveIcon = paramDrawable;
    }
    for (;;)
    {
      return;
      this.mButtonNegativeText = paramCharSequence;
      this.mButtonNegativeMessage = paramMessage;
      this.mButtonNegativeIcon = paramDrawable;
      continue;
      this.mButtonNeutralText = paramCharSequence;
      this.mButtonNeutralMessage = paramMessage;
      this.mButtonNeutralIcon = paramDrawable;
    }
  }
  
  public void setButtonPanelLayoutHint(int paramInt)
  {
    this.mButtonPanelLayoutHint = paramInt;
  }
  
  public void setCustomTitle(View paramView)
  {
    this.mCustomTitleView = paramView;
  }
  
  public void setIcon(int paramInt)
  {
    this.mIcon = null;
    this.mIconId = paramInt;
    ImageView localImageView = this.mIconView;
    int i;
    if (localImageView != null)
    {
      if (paramInt == 0) {
        break label47;
      }
      this.mIconView.setVisibility(0);
      localImageView = this.mIconView;
      i = this.mIconId;
      localImageView.setImageResource(i);
    }
    for (;;)
    {
      return;
      label47:
      localImageView = this.mIconView;
      i = 8;
      localImageView.setVisibility(i);
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i = 0;
    this.mIcon = paramDrawable;
    this.mIconId = 0;
    ImageView localImageView = this.mIconView;
    if (localImageView != null)
    {
      if (paramDrawable == null) {
        break label44;
      }
      this.mIconView.setVisibility(0);
      localImageView = this.mIconView;
      localImageView.setImageDrawable(paramDrawable);
    }
    for (;;)
    {
      return;
      label44:
      localImageView = this.mIconView;
      i = 8;
      localImageView.setVisibility(i);
    }
  }
  
  public void setMessage(CharSequence paramCharSequence)
  {
    this.mMessage = paramCharSequence;
    TextView localTextView = this.mMessageView;
    if (localTextView != null)
    {
      localTextView = this.mMessageView;
      localTextView.setText(paramCharSequence);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.mTitle = paramCharSequence;
    TextView localTextView = this.mTitleView;
    if (localTextView != null)
    {
      localTextView = this.mTitleView;
      localTextView.setText(paramCharSequence);
    }
  }
  
  public void setView(int paramInt)
  {
    this.mView = null;
    this.mViewLayoutResId = paramInt;
    this.mViewSpacingSpecified = false;
  }
  
  public void setView(View paramView)
  {
    this.mView = paramView;
    this.mViewLayoutResId = 0;
    this.mViewSpacingSpecified = false;
  }
  
  public void setView(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mView = paramView;
    this.mViewLayoutResId = 0;
    this.mViewSpacingSpecified = true;
    this.mViewSpacingLeft = paramInt1;
    this.mViewSpacingTop = paramInt2;
    this.mViewSpacingRight = paramInt3;
    this.mViewSpacingBottom = paramInt4;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */