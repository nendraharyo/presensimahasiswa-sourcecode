package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.h.l;
import android.support.v4.os.d;
import android.support.v4.view.a.a;
import android.support.v4.view.h;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.widget.g;
import android.support.v7.recyclerview.R.dimen;
import android.support.v7.recyclerview.R.styleable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView
  extends ViewGroup
  implements j
{
  static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
  private static final boolean ALLOW_THREAD_GAP_WORK = false;
  private static final int[] CLIP_TO_PADDING_ATTR;
  static final boolean DEBUG = false;
  static final int DEFAULT_ORIENTATION = 1;
  static final boolean DISPATCH_TEMP_DETACH = false;
  private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
  static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
  static final long FOREVER_NS = Long.MAX_VALUE;
  public static final int HORIZONTAL = 0;
  private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
  private static final int INVALID_POINTER = 255;
  public static final int INVALID_TYPE = 255;
  private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
  static final int MAX_SCROLL_DURATION = 2000;
  private static final int[] NESTED_SCROLLING_ATTRS;
  public static final long NO_ID = 255L;
  public static final int NO_POSITION = 255;
  static final boolean POST_UPDATES_ON_ANIMATION = false;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  static final String TAG = "RecyclerView";
  public static final int TOUCH_SLOP_DEFAULT = 0;
  public static final int TOUCH_SLOP_PAGING = 1;
  static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
  static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
  private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
  static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
  private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
  private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
  static final String TRACE_PREFETCH_TAG = "RV Prefetch";
  static final String TRACE_SCROLL_TAG = "RV Scroll";
  static final boolean VERBOSE_TRACING = false;
  public static final int VERTICAL = 1;
  static final Interpolator sQuinticInterpolator;
  RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
  private final AccessibilityManager mAccessibilityManager;
  private RecyclerView.OnItemTouchListener mActiveOnItemTouchListener;
  RecyclerView.Adapter mAdapter;
  AdapterHelper mAdapterHelper;
  boolean mAdapterUpdateDuringMeasure;
  private EdgeEffect mBottomGlow;
  private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
  ChildHelper mChildHelper;
  boolean mClipToPadding;
  boolean mDataSetHasChangedAfterLayout;
  boolean mDispatchItemsChangedEvent;
  private int mDispatchScrollCounter;
  private int mEatenAccessibilityChangeFlags;
  private RecyclerView.EdgeEffectFactory mEdgeEffectFactory;
  boolean mEnableFastScroller;
  boolean mFirstLayoutComplete;
  GapWorker mGapWorker;
  boolean mHasFixedSize;
  private boolean mIgnoreMotionEventTillDown;
  private int mInitialTouchX;
  private int mInitialTouchY;
  private int mInterceptRequestLayoutDepth;
  boolean mIsAttached;
  RecyclerView.ItemAnimator mItemAnimator;
  private RecyclerView.ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
  private Runnable mItemAnimatorRunner;
  final ArrayList mItemDecorations;
  boolean mItemsAddedOrRemoved;
  boolean mItemsChanged;
  private int mLastTouchX;
  private int mLastTouchY;
  RecyclerView.LayoutManager mLayout;
  boolean mLayoutFrozen;
  private int mLayoutOrScrollCounter;
  boolean mLayoutWasDefered;
  private EdgeEffect mLeftGlow;
  private final int mMaxFlingVelocity;
  private final int mMinFlingVelocity;
  private final int[] mMinMaxLayoutPositions;
  private final int[] mNestedOffsets;
  private final RecyclerView.RecyclerViewDataObserver mObserver;
  private List mOnChildAttachStateListeners;
  private RecyclerView.OnFlingListener mOnFlingListener;
  private final ArrayList mOnItemTouchListeners;
  final List mPendingAccessibilityImportanceChange;
  private RecyclerView.SavedState mPendingSavedState;
  boolean mPostedAnimatorRunner;
  GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
  private boolean mPreserveFocusAfterLayout;
  final RecyclerView.Recycler mRecycler;
  RecyclerView.RecyclerListener mRecyclerListener;
  private EdgeEffect mRightGlow;
  private float mScaledHorizontalScrollFactor;
  private float mScaledVerticalScrollFactor;
  private final int[] mScrollConsumed;
  private RecyclerView.OnScrollListener mScrollListener;
  private List mScrollListeners;
  private final int[] mScrollOffset;
  private int mScrollPointerId;
  private int mScrollState;
  private k mScrollingChildHelper;
  final RecyclerView.State mState;
  final Rect mTempRect;
  private final Rect mTempRect2;
  final RectF mTempRectF;
  private EdgeEffect mTopGlow;
  private int mTouchSlop;
  final Runnable mUpdateChildViewsRunnable;
  private VelocityTracker mVelocityTracker;
  final RecyclerView.ViewFlinger mViewFlinger;
  private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
  final ViewInfoStore mViewInfoStore;
  
  static
  {
    int i = 15;
    int j = 1;
    Object localObject = new int[j];
    localObject[0] = 16843830;
    NESTED_SCROLLING_ATTRS = (int[])localObject;
    localObject = new int[j];
    localObject[0] = 16842987;
    CLIP_TO_PADDING_ATTR = (int[])localObject;
    int k = Build.VERSION.SDK_INT;
    int m = 18;
    if (k != m)
    {
      k = Build.VERSION.SDK_INT;
      m = 19;
      if (k != m)
      {
        k = Build.VERSION.SDK_INT;
        m = 20;
        if (k != m) {
          break label221;
        }
      }
    }
    k = j;
    FORCE_INVALIDATE_DISPLAY_LIST = k;
    k = Build.VERSION.SDK_INT;
    m = 23;
    if (k >= m)
    {
      k = j;
      label95:
      ALLOW_SIZE_IN_UNSPECIFIED_SPEC = k;
      k = Build.VERSION.SDK_INT;
      m = 16;
      if (k < m) {
        break label235;
      }
      k = j;
      label115:
      POST_UPDATES_ON_ANIMATION = k;
      k = Build.VERSION.SDK_INT;
      m = 21;
      if (k < m) {
        break label242;
      }
      k = j;
      label135:
      ALLOW_THREAD_GAP_WORK = k;
      k = Build.VERSION.SDK_INT;
      if (k > i) {
        break label249;
      }
      k = j;
      label150:
      FORCE_ABS_FOCUS_SEARCH_DIRECTION = k;
      k = Build.VERSION.SDK_INT;
      if (k > i) {
        break label256;
      }
      k = j;
    }
    for (;;)
    {
      IGNORE_DETACHED_FOCUSED_CHILD = k;
      localObject = new Class[4];
      localObject[0] = Context.class;
      localObject[j] = AttributeSet.class;
      Class localClass = Integer.TYPE;
      localObject[2] = localClass;
      localClass = Integer.TYPE;
      localObject[3] = localClass;
      LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = (Class[])localObject;
      localObject = new android/support/v7/widget/RecyclerView$3;
      ((RecyclerView.3)localObject).<init>();
      sQuinticInterpolator = (Interpolator)localObject;
      return;
      label221:
      k = 0;
      localObject = null;
      break;
      k = 0;
      localObject = null;
      break label95;
      label235:
      k = 0;
      localObject = null;
      break label115;
      label242:
      k = 0;
      localObject = null;
      break label135;
      label249:
      k = 0;
      localObject = null;
      break label150;
      label256:
      k = 0;
      localObject = null;
    }
  }
  
  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/support/v7/widget/RecyclerView$RecyclerViewDataObserver;
    ((RecyclerView.RecyclerViewDataObserver)localObject1).<init>(this);
    this.mObserver = ((RecyclerView.RecyclerViewDataObserver)localObject1);
    localObject1 = new android/support/v7/widget/RecyclerView$Recycler;
    ((RecyclerView.Recycler)localObject1).<init>(this);
    this.mRecycler = ((RecyclerView.Recycler)localObject1);
    localObject1 = new android/support/v7/widget/ViewInfoStore;
    ((ViewInfoStore)localObject1).<init>();
    this.mViewInfoStore = ((ViewInfoStore)localObject1);
    localObject1 = new android/support/v7/widget/RecyclerView$1;
    ((RecyclerView.1)localObject1).<init>(this);
    this.mUpdateChildViewsRunnable = ((Runnable)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mTempRect = ((Rect)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mTempRect2 = ((Rect)localObject1);
    localObject1 = new android/graphics/RectF;
    ((RectF)localObject1).<init>();
    this.mTempRectF = ((RectF)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mItemDecorations = ((ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mOnItemTouchListeners = ((ArrayList)localObject1);
    this.mInterceptRequestLayoutDepth = 0;
    this.mDataSetHasChangedAfterLayout = false;
    this.mDispatchItemsChangedEvent = false;
    this.mLayoutOrScrollCounter = 0;
    this.mDispatchScrollCounter = 0;
    localObject1 = new android/support/v7/widget/RecyclerView$EdgeEffectFactory;
    ((RecyclerView.EdgeEffectFactory)localObject1).<init>();
    this.mEdgeEffectFactory = ((RecyclerView.EdgeEffectFactory)localObject1);
    localObject1 = new android/support/v7/widget/DefaultItemAnimator;
    ((DefaultItemAnimator)localObject1).<init>();
    this.mItemAnimator = ((RecyclerView.ItemAnimator)localObject1);
    this.mScrollState = 0;
    this.mScrollPointerId = j;
    this.mScaledHorizontalScrollFactor = f;
    this.mScaledVerticalScrollFactor = f;
    this.mPreserveFocusAfterLayout = m;
    localObject1 = new android/support/v7/widget/RecyclerView$ViewFlinger;
    ((RecyclerView.ViewFlinger)localObject1).<init>(this);
    this.mViewFlinger = ((RecyclerView.ViewFlinger)localObject1);
    boolean bool3 = ALLOW_THREAD_GAP_WORK;
    label486:
    label588:
    int i2;
    boolean bool2;
    if (bool3)
    {
      localObject1 = new android/support/v7/widget/GapWorker$LayoutPrefetchRegistryImpl;
      ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).<init>();
      this.mPrefetchRegistry = ((GapWorker.LayoutPrefetchRegistryImpl)localObject1);
      localObject1 = new android/support/v7/widget/RecyclerView$State;
      ((RecyclerView.State)localObject1).<init>();
      this.mState = ((RecyclerView.State)localObject1);
      this.mItemsAddedOrRemoved = false;
      this.mItemsChanged = false;
      localObject1 = new android/support/v7/widget/RecyclerView$ItemAnimatorRestoreListener;
      ((RecyclerView.ItemAnimatorRestoreListener)localObject1).<init>(this);
      this.mItemAnimatorListener = ((RecyclerView.ItemAnimator.ItemAnimatorListener)localObject1);
      this.mPostedAnimatorRunner = false;
      localObject1 = new int[k];
      this.mMinMaxLayoutPositions = ((int[])localObject1);
      localObject1 = new int[k];
      this.mScrollOffset = ((int[])localObject1);
      localObject1 = new int[k];
      this.mScrollConsumed = ((int[])localObject1);
      localObject1 = new int[k];
      this.mNestedOffsets = ((int[])localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.mPendingAccessibilityImportanceChange = ((List)localObject1);
      localObject1 = new android/support/v7/widget/RecyclerView$2;
      ((RecyclerView.2)localObject1).<init>(this);
      this.mItemAnimatorRunner = ((Runnable)localObject1);
      localObject1 = new android/support/v7/widget/RecyclerView$4;
      ((RecyclerView.4)localObject1).<init>(this);
      this.mViewInfoProcessCallback = ((ViewInfoStore.ProcessCallback)localObject1);
      if (paramAttributeSet == null) {
        break label952;
      }
      localObject1 = CLIP_TO_PADDING_ATTR;
      localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, 0);
      bool1 = ((TypedArray)localObject1).getBoolean(0, m);
      this.mClipToPadding = bool1;
      ((TypedArray)localObject1).recycle();
      setScrollContainer(m);
      setFocusableInTouchMode(m);
      localObject1 = ViewConfiguration.get(paramContext);
      int i = ((ViewConfiguration)localObject1).getScaledTouchSlop();
      this.mTouchSlop = i;
      f = s.a((ViewConfiguration)localObject1, paramContext);
      this.mScaledHorizontalScrollFactor = f;
      f = s.b((ViewConfiguration)localObject1, paramContext);
      this.mScaledVerticalScrollFactor = f;
      i = ((ViewConfiguration)localObject1).getScaledMinimumFlingVelocity();
      this.mMinFlingVelocity = i;
      int n = ((ViewConfiguration)localObject1).getScaledMaximumFlingVelocity();
      this.mMaxFlingVelocity = n;
      n = getOverScrollMode();
      if (n != k) {
        break label961;
      }
      n = m;
      setWillNotDraw(n);
      localObject1 = this.mItemAnimator;
      Object localObject2 = this.mItemAnimatorListener;
      ((RecyclerView.ItemAnimator)localObject1).setListener((RecyclerView.ItemAnimator.ItemAnimatorListener)localObject2);
      initAdapterManager();
      initChildrenHelper();
      int i1 = r.d(this);
      if (i1 == 0) {
        r.a(this, m);
      }
      localObject1 = getContext();
      localObject2 = "accessibility";
      localObject1 = (AccessibilityManager)((Context)localObject1).getSystemService((String)localObject2);
      this.mAccessibilityManager = ((AccessibilityManager)localObject1);
      localObject1 = new android/support/v7/widget/RecyclerViewAccessibilityDelegate;
      ((RecyclerViewAccessibilityDelegate)localObject1).<init>(this);
      setAccessibilityDelegateCompat((RecyclerViewAccessibilityDelegate)localObject1);
      if (paramAttributeSet == null) {
        break label970;
      }
      localObject1 = R.styleable.RecyclerView;
      Object localObject3 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, 0);
      i1 = R.styleable.RecyclerView_layoutManager;
      String str = ((TypedArray)localObject3).getString(i1);
      i1 = R.styleable.RecyclerView_android_descendantFocusability;
      i1 = ((TypedArray)localObject3).getInt(i1, j);
      if (i1 == j)
      {
        i1 = 262144;
        setDescendantFocusability(i1);
      }
      i1 = R.styleable.RecyclerView_fastScrollEnabled;
      boolean bool4 = ((TypedArray)localObject3).getBoolean(i1, false);
      this.mEnableFastScroller = bool4;
      bool4 = this.mEnableFastScroller;
      if (bool4)
      {
        i2 = R.styleable.RecyclerView_fastScrollVerticalThumbDrawable;
        localObject1 = (StateListDrawable)((TypedArray)localObject3).getDrawable(i2);
        i = R.styleable.RecyclerView_fastScrollVerticalTrackDrawable;
        Drawable localDrawable1 = ((TypedArray)localObject3).getDrawable(i);
        i = R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable;
        localObject2 = (StateListDrawable)((TypedArray)localObject3).getDrawable(i);
        int i3 = R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable;
        Drawable localDrawable2 = ((TypedArray)localObject3).getDrawable(i3);
        initFastScroller((StateListDrawable)localObject1, localDrawable1, (StateListDrawable)localObject2, localDrawable2);
      }
      ((TypedArray)localObject3).recycle();
      localObject1 = this;
      localObject2 = paramContext;
      localObject3 = paramAttributeSet;
      j = paramInt;
      createLayoutManager(paramContext, str, paramAttributeSet, paramInt, 0);
      i2 = Build.VERSION.SDK_INT;
      i = 21;
      f = 2.9E-44F;
      if (i2 >= i)
      {
        localObject1 = NESTED_SCROLLING_ATTRS;
        localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, 0);
        bool2 = ((TypedArray)localObject1).getBoolean(0, m);
        ((TypedArray)localObject1).recycle();
      }
    }
    for (;;)
    {
      setNestedScrollingEnabled(bool2);
      return;
      i2 = 0;
      localObject1 = null;
      break;
      label952:
      this.mClipToPadding = bool2;
      break label486;
      label961:
      i2 = 0;
      localObject1 = null;
      break label588;
      label970:
      i2 = 262144;
      setDescendantFocusability(i2);
    }
  }
  
  private void addAnimatingView(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool1 = true;
    View localView = paramViewHolder.itemView;
    Object localObject1 = localView.getParent();
    boolean bool2;
    if (localObject1 == this)
    {
      bool2 = bool1;
      RecyclerView.Recycler localRecycler = this.mRecycler;
      Object localObject2 = getChildViewHolder(localView);
      localRecycler.unscrapView((RecyclerView.ViewHolder)localObject2);
      boolean bool3 = paramViewHolder.isTmpDetached();
      if (!bool3) {
        break label89;
      }
      localObject1 = this.mChildHelper;
      int i = -1;
      localObject2 = localView.getLayoutParams();
      ((ChildHelper)localObject1).attachViewToParent(localView, i, (ViewGroup.LayoutParams)localObject2, bool1);
    }
    for (;;)
    {
      return;
      bool2 = false;
      localObject1 = null;
      break;
      label89:
      if (!bool2)
      {
        localObject1 = this.mChildHelper;
        ((ChildHelper)localObject1).addView(localView, bool1);
      }
      else
      {
        localObject1 = this.mChildHelper;
        ((ChildHelper)localObject1).hide(localView);
      }
    }
  }
  
  private void animateChange(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramViewHolder1.setIsRecyclable(false);
    if (paramBoolean1) {
      addAnimatingView(paramViewHolder1);
    }
    if (paramViewHolder1 != paramViewHolder2)
    {
      if (paramBoolean2) {
        addAnimatingView(paramViewHolder2);
      }
      paramViewHolder1.mShadowedHolder = paramViewHolder2;
      addAnimatingView(paramViewHolder1);
      localObject = this.mRecycler;
      ((RecyclerView.Recycler)localObject).unscrapView(paramViewHolder1);
      paramViewHolder2.setIsRecyclable(false);
      paramViewHolder2.mShadowingHolder = paramViewHolder1;
    }
    Object localObject = this.mItemAnimator;
    boolean bool = ((RecyclerView.ItemAnimator)localObject).animateChange(paramViewHolder1, paramViewHolder2, paramItemHolderInfo1, paramItemHolderInfo2);
    if (bool) {
      postAnimationRunner();
    }
  }
  
  private void cancelTouch()
  {
    resetTouch();
    setScrollState(0);
  }
  
  static void clearNestedRecyclerViewIfNotNested(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = paramViewHolder.mNestedRecyclerView;
    if (localObject != null)
    {
      localObject = (View)paramViewHolder.mNestedRecyclerView.get();
      if (localObject == null) {
        break label62;
      }
      View localView = paramViewHolder.itemView;
      if (localObject != localView) {
        break label35;
      }
    }
    for (;;)
    {
      return;
      label35:
      localObject = ((View)localObject).getParent();
      boolean bool = localObject instanceof View;
      if (bool)
      {
        localObject = (View)localObject;
        break;
      }
      localObject = null;
      break;
      label62:
      paramViewHolder.mNestedRecyclerView = null;
    }
  }
  
  /* Error */
  private void createLayoutManager(Context paramContext, String paramString, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +194 -> 195
    //   4: aload_2
    //   5: invokevirtual 621	java/lang/String:trim	()Ljava/lang/String;
    //   8: astore 6
    //   10: aload 6
    //   12: invokevirtual 624	java/lang/String:isEmpty	()Z
    //   15: istore 7
    //   17: iload 7
    //   19: ifne +176 -> 195
    //   22: aload_0
    //   23: aload_1
    //   24: aload 6
    //   26: invokespecial 628	android/support/v7/widget/RecyclerView:getFullClassName	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   29: astore 8
    //   31: aload_0
    //   32: invokevirtual 631	android/support/v7/widget/RecyclerView:isInEditMode	()Z
    //   35: istore 9
    //   37: iload 9
    //   39: ifeq +157 -> 196
    //   42: aload_0
    //   43: invokevirtual 637	java/lang/Object:getClass	()Ljava/lang/Class;
    //   46: astore 6
    //   48: aload 6
    //   50: invokevirtual 641	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   53: astore 6
    //   55: aload 6
    //   57: aload 8
    //   59: invokevirtual 647	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   62: astore 6
    //   64: ldc_w 649
    //   67: astore 10
    //   69: aload 6
    //   71: aload 10
    //   73: invokevirtual 653	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   76: astore 11
    //   78: iconst_0
    //   79: istore 7
    //   81: aconst_null
    //   82: astore 10
    //   84: getstatic 232	android/support/v7/widget/RecyclerView:LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE	[Ljava/lang/Class;
    //   87: astore 6
    //   89: aload 11
    //   91: aload 6
    //   93: invokevirtual 657	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   96: astore 12
    //   98: iconst_4
    //   99: istore 9
    //   101: iload 9
    //   103: anewarray 633	java/lang/Object
    //   106: astore 6
    //   108: iconst_0
    //   109: istore 13
    //   111: aload 6
    //   113: iconst_0
    //   114: aload_1
    //   115: aastore
    //   116: iconst_1
    //   117: istore 13
    //   119: aload 6
    //   121: iload 13
    //   123: aload_3
    //   124: aastore
    //   125: iconst_2
    //   126: istore 13
    //   128: iload 4
    //   130: invokestatic 661	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: astore 14
    //   135: aload 6
    //   137: iload 13
    //   139: aload 14
    //   141: aastore
    //   142: iconst_3
    //   143: istore 13
    //   145: iload 5
    //   147: invokestatic 661	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   150: astore 14
    //   152: aload 6
    //   154: iload 13
    //   156: aload 14
    //   158: aastore
    //   159: aload 12
    //   161: astore 10
    //   163: iconst_1
    //   164: istore 15
    //   166: aload 10
    //   168: iload 15
    //   170: invokevirtual 666	java/lang/reflect/Constructor:setAccessible	(Z)V
    //   173: aload 10
    //   175: aload 6
    //   177: invokevirtual 670	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   180: astore 6
    //   182: aload 6
    //   184: checkcast 649	android/support/v7/widget/RecyclerView$LayoutManager
    //   187: astore 6
    //   189: aload_0
    //   190: aload 6
    //   192: invokevirtual 674	android/support/v7/widget/RecyclerView:setLayoutManager	(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V
    //   195: return
    //   196: aload_1
    //   197: invokevirtual 675	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   200: astore 6
    //   202: goto -147 -> 55
    //   205: astore 6
    //   207: iconst_0
    //   208: istore 15
    //   210: aconst_null
    //   211: astore 12
    //   213: iconst_0
    //   214: anewarray 218	java/lang/Class
    //   217: astore 12
    //   219: aload 11
    //   221: aload 12
    //   223: invokevirtual 657	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   226: astore 10
    //   228: iconst_0
    //   229: istore 9
    //   231: aconst_null
    //   232: astore 6
    //   234: goto -71 -> 163
    //   237: astore 10
    //   239: aload 10
    //   241: aload 6
    //   243: invokevirtual 681	java/lang/NoSuchMethodException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   246: pop
    //   247: new 683	java/lang/IllegalStateException
    //   250: astore 6
    //   252: new 685	java/lang/StringBuilder
    //   255: astore 12
    //   257: aload 12
    //   259: invokespecial 686	java/lang/StringBuilder:<init>	()V
    //   262: aload_3
    //   263: invokeinterface 689 1 0
    //   268: astore 11
    //   270: aload 12
    //   272: aload 11
    //   274: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: astore 12
    //   279: ldc_w 695
    //   282: astore 11
    //   284: aload 12
    //   286: aload 11
    //   288: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: astore 12
    //   293: aload 12
    //   295: aload 8
    //   297: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: astore 12
    //   302: aload 12
    //   304: invokevirtual 698	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   307: astore 12
    //   309: aload 6
    //   311: aload 12
    //   313: aload 10
    //   315: invokespecial 701	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   318: aload 6
    //   320: athrow
    //   321: astore 6
    //   323: new 683	java/lang/IllegalStateException
    //   326: astore 10
    //   328: new 685	java/lang/StringBuilder
    //   331: astore 12
    //   333: aload 12
    //   335: invokespecial 686	java/lang/StringBuilder:<init>	()V
    //   338: aload_3
    //   339: invokeinterface 689 1 0
    //   344: astore 11
    //   346: aload 12
    //   348: aload 11
    //   350: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: ldc_w 703
    //   356: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: aload 8
    //   361: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: invokevirtual 698	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   367: astore 12
    //   369: aload 10
    //   371: aload 12
    //   373: aload 6
    //   375: invokespecial 701	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   378: aload 10
    //   380: athrow
    //   381: astore 6
    //   383: new 683	java/lang/IllegalStateException
    //   386: astore 10
    //   388: new 685	java/lang/StringBuilder
    //   391: astore 12
    //   393: aload 12
    //   395: invokespecial 686	java/lang/StringBuilder:<init>	()V
    //   398: aload_3
    //   399: invokeinterface 689 1 0
    //   404: astore 11
    //   406: aload 12
    //   408: aload 11
    //   410: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: ldc_w 705
    //   416: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: aload 8
    //   421: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: invokevirtual 698	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   427: astore 12
    //   429: aload 10
    //   431: aload 12
    //   433: aload 6
    //   435: invokespecial 701	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   438: aload 10
    //   440: athrow
    //   441: astore 6
    //   443: new 683	java/lang/IllegalStateException
    //   446: astore 10
    //   448: new 685	java/lang/StringBuilder
    //   451: astore 12
    //   453: aload 12
    //   455: invokespecial 686	java/lang/StringBuilder:<init>	()V
    //   458: aload_3
    //   459: invokeinterface 689 1 0
    //   464: astore 11
    //   466: aload 12
    //   468: aload 11
    //   470: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: ldc_w 705
    //   476: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   479: aload 8
    //   481: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: invokevirtual 698	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   487: astore 12
    //   489: aload 10
    //   491: aload 12
    //   493: aload 6
    //   495: invokespecial 701	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   498: aload 10
    //   500: athrow
    //   501: astore 6
    //   503: new 683	java/lang/IllegalStateException
    //   506: astore 10
    //   508: new 685	java/lang/StringBuilder
    //   511: astore 12
    //   513: aload 12
    //   515: invokespecial 686	java/lang/StringBuilder:<init>	()V
    //   518: aload_3
    //   519: invokeinterface 689 1 0
    //   524: astore 11
    //   526: aload 12
    //   528: aload 11
    //   530: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   533: ldc_w 707
    //   536: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: aload 8
    //   541: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   544: invokevirtual 698	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   547: astore 12
    //   549: aload 10
    //   551: aload 12
    //   553: aload 6
    //   555: invokespecial 701	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   558: aload 10
    //   560: athrow
    //   561: astore 6
    //   563: new 683	java/lang/IllegalStateException
    //   566: astore 10
    //   568: new 685	java/lang/StringBuilder
    //   571: astore 12
    //   573: aload 12
    //   575: invokespecial 686	java/lang/StringBuilder:<init>	()V
    //   578: aload_3
    //   579: invokeinterface 689 1 0
    //   584: astore 11
    //   586: aload 12
    //   588: aload 11
    //   590: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   593: ldc_w 709
    //   596: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   599: aload 8
    //   601: invokevirtual 693	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   604: invokevirtual 698	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   607: astore 12
    //   609: aload 10
    //   611: aload 12
    //   613: aload 6
    //   615: invokespecial 701	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   618: aload 10
    //   620: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	621	0	this	RecyclerView
    //   0	621	1	paramContext	Context
    //   0	621	2	paramString	String
    //   0	621	3	paramAttributeSet	AttributeSet
    //   0	621	4	paramInt1	int
    //   0	621	5	paramInt2	int
    //   8	193	6	localObject1	Object
    //   205	1	6	localNoSuchMethodException1	NoSuchMethodException
    //   232	87	6	localObject2	Object
    //   321	53	6	localClassNotFoundException	ClassNotFoundException
    //   381	53	6	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   441	53	6	localInstantiationException	InstantiationException
    //   501	53	6	localIllegalAccessException	IllegalAccessException
    //   561	53	6	localClassCastException	ClassCastException
    //   15	65	7	bool1	boolean
    //   29	571	8	str	String
    //   35	3	9	bool2	boolean
    //   99	131	9	i	int
    //   67	160	10	localObject3	Object
    //   237	77	10	localNoSuchMethodException2	NoSuchMethodException
    //   326	293	10	localIllegalStateException	IllegalStateException
    //   76	513	11	localObject4	Object
    //   96	516	12	localObject5	Object
    //   109	46	13	j	int
    //   133	24	14	localInteger	Integer
    //   164	45	15	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   84	87	205	java/lang/NoSuchMethodException
    //   91	96	205	java/lang/NoSuchMethodException
    //   101	106	205	java/lang/NoSuchMethodException
    //   114	116	205	java/lang/NoSuchMethodException
    //   123	125	205	java/lang/NoSuchMethodException
    //   128	133	205	java/lang/NoSuchMethodException
    //   139	142	205	java/lang/NoSuchMethodException
    //   145	150	205	java/lang/NoSuchMethodException
    //   156	159	205	java/lang/NoSuchMethodException
    //   213	217	237	java/lang/NoSuchMethodException
    //   221	226	237	java/lang/NoSuchMethodException
    //   31	35	321	java/lang/ClassNotFoundException
    //   42	46	321	java/lang/ClassNotFoundException
    //   48	53	321	java/lang/ClassNotFoundException
    //   57	62	321	java/lang/ClassNotFoundException
    //   71	76	321	java/lang/ClassNotFoundException
    //   84	87	321	java/lang/ClassNotFoundException
    //   91	96	321	java/lang/ClassNotFoundException
    //   101	106	321	java/lang/ClassNotFoundException
    //   114	116	321	java/lang/ClassNotFoundException
    //   123	125	321	java/lang/ClassNotFoundException
    //   128	133	321	java/lang/ClassNotFoundException
    //   139	142	321	java/lang/ClassNotFoundException
    //   145	150	321	java/lang/ClassNotFoundException
    //   156	159	321	java/lang/ClassNotFoundException
    //   168	173	321	java/lang/ClassNotFoundException
    //   175	180	321	java/lang/ClassNotFoundException
    //   182	187	321	java/lang/ClassNotFoundException
    //   190	195	321	java/lang/ClassNotFoundException
    //   196	200	321	java/lang/ClassNotFoundException
    //   213	217	321	java/lang/ClassNotFoundException
    //   221	226	321	java/lang/ClassNotFoundException
    //   241	247	321	java/lang/ClassNotFoundException
    //   247	250	321	java/lang/ClassNotFoundException
    //   252	255	321	java/lang/ClassNotFoundException
    //   257	262	321	java/lang/ClassNotFoundException
    //   262	268	321	java/lang/ClassNotFoundException
    //   272	277	321	java/lang/ClassNotFoundException
    //   286	291	321	java/lang/ClassNotFoundException
    //   295	300	321	java/lang/ClassNotFoundException
    //   302	307	321	java/lang/ClassNotFoundException
    //   313	318	321	java/lang/ClassNotFoundException
    //   318	321	321	java/lang/ClassNotFoundException
    //   31	35	381	java/lang/reflect/InvocationTargetException
    //   42	46	381	java/lang/reflect/InvocationTargetException
    //   48	53	381	java/lang/reflect/InvocationTargetException
    //   57	62	381	java/lang/reflect/InvocationTargetException
    //   71	76	381	java/lang/reflect/InvocationTargetException
    //   84	87	381	java/lang/reflect/InvocationTargetException
    //   91	96	381	java/lang/reflect/InvocationTargetException
    //   101	106	381	java/lang/reflect/InvocationTargetException
    //   114	116	381	java/lang/reflect/InvocationTargetException
    //   123	125	381	java/lang/reflect/InvocationTargetException
    //   128	133	381	java/lang/reflect/InvocationTargetException
    //   139	142	381	java/lang/reflect/InvocationTargetException
    //   145	150	381	java/lang/reflect/InvocationTargetException
    //   156	159	381	java/lang/reflect/InvocationTargetException
    //   168	173	381	java/lang/reflect/InvocationTargetException
    //   175	180	381	java/lang/reflect/InvocationTargetException
    //   182	187	381	java/lang/reflect/InvocationTargetException
    //   190	195	381	java/lang/reflect/InvocationTargetException
    //   196	200	381	java/lang/reflect/InvocationTargetException
    //   213	217	381	java/lang/reflect/InvocationTargetException
    //   221	226	381	java/lang/reflect/InvocationTargetException
    //   241	247	381	java/lang/reflect/InvocationTargetException
    //   247	250	381	java/lang/reflect/InvocationTargetException
    //   252	255	381	java/lang/reflect/InvocationTargetException
    //   257	262	381	java/lang/reflect/InvocationTargetException
    //   262	268	381	java/lang/reflect/InvocationTargetException
    //   272	277	381	java/lang/reflect/InvocationTargetException
    //   286	291	381	java/lang/reflect/InvocationTargetException
    //   295	300	381	java/lang/reflect/InvocationTargetException
    //   302	307	381	java/lang/reflect/InvocationTargetException
    //   313	318	381	java/lang/reflect/InvocationTargetException
    //   318	321	381	java/lang/reflect/InvocationTargetException
    //   31	35	441	java/lang/InstantiationException
    //   42	46	441	java/lang/InstantiationException
    //   48	53	441	java/lang/InstantiationException
    //   57	62	441	java/lang/InstantiationException
    //   71	76	441	java/lang/InstantiationException
    //   84	87	441	java/lang/InstantiationException
    //   91	96	441	java/lang/InstantiationException
    //   101	106	441	java/lang/InstantiationException
    //   114	116	441	java/lang/InstantiationException
    //   123	125	441	java/lang/InstantiationException
    //   128	133	441	java/lang/InstantiationException
    //   139	142	441	java/lang/InstantiationException
    //   145	150	441	java/lang/InstantiationException
    //   156	159	441	java/lang/InstantiationException
    //   168	173	441	java/lang/InstantiationException
    //   175	180	441	java/lang/InstantiationException
    //   182	187	441	java/lang/InstantiationException
    //   190	195	441	java/lang/InstantiationException
    //   196	200	441	java/lang/InstantiationException
    //   213	217	441	java/lang/InstantiationException
    //   221	226	441	java/lang/InstantiationException
    //   241	247	441	java/lang/InstantiationException
    //   247	250	441	java/lang/InstantiationException
    //   252	255	441	java/lang/InstantiationException
    //   257	262	441	java/lang/InstantiationException
    //   262	268	441	java/lang/InstantiationException
    //   272	277	441	java/lang/InstantiationException
    //   286	291	441	java/lang/InstantiationException
    //   295	300	441	java/lang/InstantiationException
    //   302	307	441	java/lang/InstantiationException
    //   313	318	441	java/lang/InstantiationException
    //   318	321	441	java/lang/InstantiationException
    //   31	35	501	java/lang/IllegalAccessException
    //   42	46	501	java/lang/IllegalAccessException
    //   48	53	501	java/lang/IllegalAccessException
    //   57	62	501	java/lang/IllegalAccessException
    //   71	76	501	java/lang/IllegalAccessException
    //   84	87	501	java/lang/IllegalAccessException
    //   91	96	501	java/lang/IllegalAccessException
    //   101	106	501	java/lang/IllegalAccessException
    //   114	116	501	java/lang/IllegalAccessException
    //   123	125	501	java/lang/IllegalAccessException
    //   128	133	501	java/lang/IllegalAccessException
    //   139	142	501	java/lang/IllegalAccessException
    //   145	150	501	java/lang/IllegalAccessException
    //   156	159	501	java/lang/IllegalAccessException
    //   168	173	501	java/lang/IllegalAccessException
    //   175	180	501	java/lang/IllegalAccessException
    //   182	187	501	java/lang/IllegalAccessException
    //   190	195	501	java/lang/IllegalAccessException
    //   196	200	501	java/lang/IllegalAccessException
    //   213	217	501	java/lang/IllegalAccessException
    //   221	226	501	java/lang/IllegalAccessException
    //   241	247	501	java/lang/IllegalAccessException
    //   247	250	501	java/lang/IllegalAccessException
    //   252	255	501	java/lang/IllegalAccessException
    //   257	262	501	java/lang/IllegalAccessException
    //   262	268	501	java/lang/IllegalAccessException
    //   272	277	501	java/lang/IllegalAccessException
    //   286	291	501	java/lang/IllegalAccessException
    //   295	300	501	java/lang/IllegalAccessException
    //   302	307	501	java/lang/IllegalAccessException
    //   313	318	501	java/lang/IllegalAccessException
    //   318	321	501	java/lang/IllegalAccessException
    //   31	35	561	java/lang/ClassCastException
    //   42	46	561	java/lang/ClassCastException
    //   48	53	561	java/lang/ClassCastException
    //   57	62	561	java/lang/ClassCastException
    //   71	76	561	java/lang/ClassCastException
    //   84	87	561	java/lang/ClassCastException
    //   91	96	561	java/lang/ClassCastException
    //   101	106	561	java/lang/ClassCastException
    //   114	116	561	java/lang/ClassCastException
    //   123	125	561	java/lang/ClassCastException
    //   128	133	561	java/lang/ClassCastException
    //   139	142	561	java/lang/ClassCastException
    //   145	150	561	java/lang/ClassCastException
    //   156	159	561	java/lang/ClassCastException
    //   168	173	561	java/lang/ClassCastException
    //   175	180	561	java/lang/ClassCastException
    //   182	187	561	java/lang/ClassCastException
    //   190	195	561	java/lang/ClassCastException
    //   196	200	561	java/lang/ClassCastException
    //   213	217	561	java/lang/ClassCastException
    //   221	226	561	java/lang/ClassCastException
    //   241	247	561	java/lang/ClassCastException
    //   247	250	561	java/lang/ClassCastException
    //   252	255	561	java/lang/ClassCastException
    //   257	262	561	java/lang/ClassCastException
    //   262	268	561	java/lang/ClassCastException
    //   272	277	561	java/lang/ClassCastException
    //   286	291	561	java/lang/ClassCastException
    //   295	300	561	java/lang/ClassCastException
    //   302	307	561	java/lang/ClassCastException
    //   313	318	561	java/lang/ClassCastException
    //   318	321	561	java/lang/ClassCastException
  }
  
  private boolean didChildRangeChange(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int[] arrayOfInt = this.mMinMaxLayoutPositions;
    findMinMaxChildLayoutPositions(arrayOfInt);
    arrayOfInt = this.mMinMaxLayoutPositions;
    int i = arrayOfInt[0];
    if (i == paramInt1)
    {
      arrayOfInt = this.mMinMaxLayoutPositions;
      i = arrayOfInt[bool1];
      if (i == paramInt2) {}
    }
    else
    {
      bool2 = bool1;
    }
    return bool2;
  }
  
  private void dispatchContentChangedIfNecessary()
  {
    int i = this.mEatenAccessibilityChangeFlags;
    boolean bool = false;
    AccessibilityEvent localAccessibilityEvent = null;
    this.mEatenAccessibilityChangeFlags = 0;
    if (i != 0)
    {
      bool = isAccessibilityEnabled();
      if (bool)
      {
        localAccessibilityEvent = AccessibilityEvent.obtain();
        int j = 2048;
        localAccessibilityEvent.setEventType(j);
        a.a(localAccessibilityEvent, i);
        sendAccessibilityEventUnchecked(localAccessibilityEvent);
      }
    }
  }
  
  private void dispatchLayoutStep1()
  {
    int i = 1;
    this.mState.assertLayoutStep(i);
    Object localObject1 = this.mState;
    fillRemainingScrollValues((RecyclerView.State)localObject1);
    this.mState.mIsMeasuring = false;
    startInterceptRequestLayout();
    this.mViewInfoStore.clear();
    onEnterLayoutOrScroll();
    processAdapterUpdatesAndSetAnimationFlags();
    saveFocusInfo();
    localObject1 = this.mState;
    Object localObject2 = this.mState;
    boolean bool1 = ((RecyclerView.State)localObject2).mRunSimpleAnimations;
    int j;
    label186:
    boolean bool4;
    Object localObject4;
    if (bool1)
    {
      bool1 = this.mItemsChanged;
      if (bool1)
      {
        ((RecyclerView.State)localObject1).mTrackOldChangeHolders = i;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        localObject3 = this.mState;
        boolean bool2 = this.mState.mRunPredictiveAnimations;
        ((RecyclerView.State)localObject3).mInPreLayout = bool2;
        localObject3 = this.mState;
        localObject1 = this.mAdapter;
        int i1 = ((RecyclerView.Adapter)localObject1).getItemCount();
        ((RecyclerView.State)localObject3).mItemCount = i1;
        localObject3 = this.mMinMaxLayoutPositions;
        findMinMaxChildLayoutPositions((int[])localObject3);
        localObject3 = this.mState;
        j = ((RecyclerView.State)localObject3).mRunSimpleAnimations;
        if (j == 0) {
          break label397;
        }
        i1 = this.mChildHelper.getChildCount();
        j = 0;
        localObject3 = null;
        if (j >= i1) {
          break label397;
        }
        localObject2 = getChildViewHolderInt(this.mChildHelper.getChildAt(j));
        bool4 = ((RecyclerView.ViewHolder)localObject2).shouldIgnore();
        if (!bool4)
        {
          bool4 = ((RecyclerView.ViewHolder)localObject2).isInvalid();
          if (!bool4) {
            break label259;
          }
          localObject4 = this.mAdapter;
          bool4 = ((RecyclerView.Adapter)localObject4).hasStableIds();
          if (bool4) {
            break label259;
          }
        }
      }
    }
    label259:
    Object localObject5;
    List localList;
    Object localObject6;
    for (;;)
    {
      j += 1;
      break label186;
      int k = 0;
      localObject3 = null;
      break;
      localObject4 = this.mItemAnimator;
      localObject5 = this.mState;
      int i4 = RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations((RecyclerView.ViewHolder)localObject2);
      localList = ((RecyclerView.ViewHolder)localObject2).getUnmodifiedPayloads();
      localObject4 = ((RecyclerView.ItemAnimator)localObject4).recordPreLayoutInformation((RecyclerView.State)localObject5, (RecyclerView.ViewHolder)localObject2, i4, localList);
      localObject5 = this.mViewInfoStore;
      ((ViewInfoStore)localObject5).addToPreLayout((RecyclerView.ViewHolder)localObject2, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject4);
      localObject4 = this.mState;
      bool4 = ((RecyclerView.State)localObject4).mTrackOldChangeHolders;
      if (bool4)
      {
        bool4 = ((RecyclerView.ViewHolder)localObject2).isUpdated();
        if (bool4)
        {
          bool4 = ((RecyclerView.ViewHolder)localObject2).isRemoved();
          if (!bool4)
          {
            bool4 = ((RecyclerView.ViewHolder)localObject2).shouldIgnore();
            if (!bool4)
            {
              bool4 = ((RecyclerView.ViewHolder)localObject2).isInvalid();
              if (!bool4)
              {
                long l = getChangedHolderKey((RecyclerView.ViewHolder)localObject2);
                localObject6 = this.mViewInfoStore;
                ((ViewInfoStore)localObject6).addToOldChangeHolders(l, (RecyclerView.ViewHolder)localObject2);
              }
            }
          }
        }
      }
    }
    label397:
    Object localObject3 = this.mState;
    int m = ((RecyclerView.State)localObject3).mRunPredictiveAnimations;
    if (m != 0)
    {
      saveOldPositions();
      m = this.mState.mStructureChanged;
      this.mState.mStructureChanged = false;
      localObject1 = this.mLayout;
      localObject2 = this.mRecycler;
      localObject4 = this.mState;
      ((RecyclerView.LayoutManager)localObject1).onLayoutChildren((RecyclerView.Recycler)localObject2, (RecyclerView.State)localObject4);
      localObject1 = this.mState;
      ((RecyclerView.State)localObject1).mStructureChanged = m;
      m = 0;
      localObject3 = null;
      localObject1 = this.mChildHelper;
      int i2 = ((ChildHelper)localObject1).getChildCount();
      if (m < i2)
      {
        localObject1 = this.mChildHelper.getChildAt(m);
        localObject2 = getChildViewHolderInt((View)localObject1);
        boolean bool3 = ((RecyclerView.ViewHolder)localObject2).shouldIgnore();
        if (bool3) {}
        for (;;)
        {
          int n;
          m += 1;
          break;
          localObject1 = this.mViewInfoStore;
          bool3 = ((ViewInfoStore)localObject1).isInPreLayout((RecyclerView.ViewHolder)localObject2);
          if (!bool3)
          {
            int i3 = RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations((RecyclerView.ViewHolder)localObject2);
            bool4 = ((RecyclerView.ViewHolder)localObject2).hasAnyOfTheFlags(8192);
            if (!bool4) {
              i3 |= 0x1000;
            }
            localObject5 = this.mItemAnimator;
            localObject6 = this.mState;
            localList = ((RecyclerView.ViewHolder)localObject2).getUnmodifiedPayloads();
            localObject1 = ((RecyclerView.ItemAnimator)localObject5).recordPreLayoutInformation((RecyclerView.State)localObject6, (RecyclerView.ViewHolder)localObject2, i3, localList);
            if (bool4)
            {
              recordAnimationInfoIfBouncedHiddenView((RecyclerView.ViewHolder)localObject2, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject1);
            }
            else
            {
              localObject4 = this.mViewInfoStore;
              ((ViewInfoStore)localObject4).addToAppearedInPreLayoutHolders((RecyclerView.ViewHolder)localObject2, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject1);
            }
          }
        }
      }
      clearOldPositions();
    }
    for (;;)
    {
      onExitLayoutOrScroll();
      stopInterceptRequestLayout(false);
      this.mState.mLayoutStep = 2;
      return;
      clearOldPositions();
    }
  }
  
  private void dispatchLayoutStep2()
  {
    startInterceptRequestLayout();
    onEnterLayoutOrScroll();
    this.mState.assertLayoutStep(6);
    this.mAdapterHelper.consumeUpdatesInOnePass();
    Object localObject1 = this.mState;
    int i = this.mAdapter.getItemCount();
    ((RecyclerView.State)localObject1).mItemCount = i;
    this.mState.mDeletedInvisibleItemCountSincePreviousLayout = 0;
    this.mState.mInPreLayout = false;
    localObject1 = this.mLayout;
    Object localObject2 = this.mRecycler;
    RecyclerView.State localState = this.mState;
    ((RecyclerView.LayoutManager)localObject1).onLayoutChildren((RecyclerView.Recycler)localObject2, localState);
    this.mState.mStructureChanged = false;
    this.mPendingSavedState = null;
    localObject2 = this.mState;
    localObject1 = this.mState;
    boolean bool = ((RecyclerView.State)localObject1).mRunSimpleAnimations;
    if (bool)
    {
      localObject1 = this.mItemAnimator;
      if (localObject1 != null) {
        bool = true;
      }
    }
    for (;;)
    {
      ((RecyclerView.State)localObject2).mRunSimpleAnimations = bool;
      this.mState.mLayoutStep = 4;
      onExitLayoutOrScroll();
      stopInterceptRequestLayout(false);
      return;
      bool = false;
      localObject1 = null;
    }
  }
  
  private void dispatchLayoutStep3()
  {
    int i = 1;
    Object localObject1 = this.mState;
    int j = 4;
    ((RecyclerView.State)localObject1).assertLayoutStep(j);
    startInterceptRequestLayout();
    onEnterLayoutOrScroll();
    this.mState.mLayoutStep = i;
    localObject1 = this.mState;
    boolean bool1 = ((RecyclerView.State)localObject1).mRunSimpleAnimations;
    if (bool1)
    {
      localObject1 = this.mChildHelper;
      int k = ((ChildHelper)localObject1).getChildCount() + -1;
      int i1 = k;
      if (i1 >= 0)
      {
        localObject1 = this.mChildHelper.getChildAt(i1);
        RecyclerView.ViewHolder localViewHolder = getChildViewHolderInt((View)localObject1);
        boolean bool2 = localViewHolder.shouldIgnore();
        if (bool2) {}
        for (;;)
        {
          int m = i1 + -1;
          i1 = m;
          break;
          long l = getChangedHolderKey(localViewHolder);
          localObject1 = this.mItemAnimator;
          localObject2 = this.mState;
          localObject1 = ((RecyclerView.ItemAnimator)localObject1).recordPostLayoutInformation((RecyclerView.State)localObject2, localViewHolder);
          localObject2 = this.mViewInfoStore.getFromOldChangeHolders(l);
          if (localObject2 != null)
          {
            boolean bool5 = ((RecyclerView.ViewHolder)localObject2).shouldIgnore();
            if (!bool5)
            {
              boolean bool6 = this.mViewInfoStore.isDisappearing((RecyclerView.ViewHolder)localObject2);
              Object localObject3 = this.mViewInfoStore;
              boolean bool7 = ((ViewInfoStore)localObject3).isDisappearing(localViewHolder);
              if ((bool6) && (localObject2 == localViewHolder))
              {
                localObject2 = this.mViewInfoStore;
                ((ViewInfoStore)localObject2).addToPostLayout(localViewHolder, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject1);
                continue;
              }
              localObject3 = this.mViewInfoStore.popFromPreLayout((RecyclerView.ViewHolder)localObject2);
              this.mViewInfoStore.addToPostLayout(localViewHolder, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject1);
              localObject1 = this.mViewInfoStore;
              RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo = ((ViewInfoStore)localObject1).popFromPostLayout(localViewHolder);
              if (localObject3 == null)
              {
                handleMissingPreInfoForChangeError(l, localViewHolder, (RecyclerView.ViewHolder)localObject2);
                continue;
              }
              localObject1 = this;
              animateChange((RecyclerView.ViewHolder)localObject2, localViewHolder, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject3, localItemHolderInfo, bool6, bool7);
              continue;
            }
          }
          localObject2 = this.mViewInfoStore;
          ((ViewInfoStore)localObject2).addToPostLayout(localViewHolder, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject1);
        }
      }
      localObject1 = this.mViewInfoStore;
      localObject2 = this.mViewInfoProcessCallback;
      ((ViewInfoStore)localObject1).process((ViewInfoStore.ProcessCallback)localObject2);
    }
    localObject1 = this.mLayout;
    Object localObject2 = this.mRecycler;
    ((RecyclerView.LayoutManager)localObject1).removeAndRecycleScrapInt((RecyclerView.Recycler)localObject2);
    localObject1 = this.mState;
    localObject2 = this.mState;
    j = ((RecyclerView.State)localObject2).mItemCount;
    ((RecyclerView.State)localObject1).mPreviousLayoutItemCount = j;
    this.mDataSetHasChangedAfterLayout = false;
    this.mDispatchItemsChangedEvent = false;
    this.mState.mRunSimpleAnimations = false;
    this.mState.mRunPredictiveAnimations = false;
    this.mLayout.mRequestedSimpleAnimations = false;
    localObject1 = this.mRecycler.mChangedScrap;
    if (localObject1 != null)
    {
      localObject1 = this.mRecycler.mChangedScrap;
      ((ArrayList)localObject1).clear();
    }
    localObject1 = this.mLayout;
    boolean bool3 = ((RecyclerView.LayoutManager)localObject1).mPrefetchMaxObservedInInitialPrefetch;
    if (bool3)
    {
      this.mLayout.mPrefetchMaxCountObserved = 0;
      this.mLayout.mPrefetchMaxObservedInInitialPrefetch = false;
      localObject1 = this.mRecycler;
      ((RecyclerView.Recycler)localObject1).updateViewCacheSize();
    }
    localObject1 = this.mLayout;
    localObject2 = this.mState;
    ((RecyclerView.LayoutManager)localObject1).onLayoutCompleted((RecyclerView.State)localObject2);
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
    this.mViewInfoStore.clear();
    localObject1 = this.mMinMaxLayoutPositions;
    int n = localObject1[0];
    localObject2 = this.mMinMaxLayoutPositions;
    j = localObject2[i];
    boolean bool4 = didChildRangeChange(n, j);
    if (bool4) {
      dispatchOnScrolled(0, 0);
    }
    recoverFocusFromState();
    resetFocusInfo();
  }
  
  private boolean dispatchOnItemTouch(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    RecyclerView.OnItemTouchListener localOnItemTouchListener1 = null;
    int k = 1;
    int m = paramMotionEvent.getAction();
    RecyclerView.OnItemTouchListener localOnItemTouchListener2 = this.mActiveOnItemTouchListener;
    Object localObject;
    int i1;
    if (localOnItemTouchListener2 != null)
    {
      if (m == 0) {
        this.mActiveOnItemTouchListener = null;
      }
    }
    else
    {
      if (m == 0) {
        break label164;
      }
      localObject = this.mOnItemTouchListeners;
      i = ((ArrayList)localObject).size();
      i1 = 0;
      localOnItemTouchListener2 = null;
      if (i1 >= i) {
        break label164;
      }
      localObject = (RecyclerView.OnItemTouchListener)this.mOnItemTouchListeners.get(i1);
      boolean bool = ((RecyclerView.OnItemTouchListener)localObject).onInterceptTouchEvent(this, paramMotionEvent);
      if (!bool) {
        break label151;
      }
      this.mActiveOnItemTouchListener = ((RecyclerView.OnItemTouchListener)localObject);
      m = k;
    }
    for (;;)
    {
      return m;
      localOnItemTouchListener1 = this.mActiveOnItemTouchListener;
      localOnItemTouchListener1.onTouchEvent(this, paramMotionEvent);
      j = 3;
      if ((m == j) || (m == k)) {
        this.mActiveOnItemTouchListener = null;
      }
      m = k;
      continue;
      label151:
      int n = i1 + 1;
      i1 = n;
      break;
      label164:
      n = 0;
      localObject = null;
    }
  }
  
  private boolean dispatchOnItemTouchIntercept(MotionEvent paramMotionEvent)
  {
    int i = 3;
    int j = paramMotionEvent.getAction();
    boolean bool1;
    if ((j == i) || (j == 0))
    {
      bool1 = false;
      localObject = null;
      this.mActiveOnItemTouchListener = null;
    }
    Object localObject = this.mOnItemTouchListeners;
    int m = ((ArrayList)localObject).size();
    int n = 0;
    if (n < m)
    {
      localObject = (RecyclerView.OnItemTouchListener)this.mOnItemTouchListeners.get(n);
      boolean bool2 = ((RecyclerView.OnItemTouchListener)localObject).onInterceptTouchEvent(this, paramMotionEvent);
      if ((bool2) && (j != i))
      {
        this.mActiveOnItemTouchListener = ((RecyclerView.OnItemTouchListener)localObject);
        bool1 = true;
      }
    }
    for (;;)
    {
      return bool1;
      int k = n + 1;
      n = k;
      break;
      k = 0;
      localObject = null;
    }
  }
  
  private void findMinMaxChildLayoutPositions(int[] paramArrayOfInt)
  {
    int i = 1;
    int j = -1;
    ChildHelper localChildHelper = this.mChildHelper;
    int k = localChildHelper.getChildCount();
    if (k == 0)
    {
      paramArrayOfInt[0] = j;
      paramArrayOfInt[i] = j;
      return;
    }
    int m = -1 >>> 1;
    int n = -1 << -1;
    int i1 = 0;
    label44:
    RecyclerView.ViewHolder localViewHolder;
    if (i1 < k)
    {
      localViewHolder = getChildViewHolderInt(this.mChildHelper.getChildAt(i1));
      boolean bool = localViewHolder.shouldIgnore();
      if (bool) {
        j = m;
      }
    }
    for (;;)
    {
      i1 += 1;
      m = j;
      break label44;
      j = localViewHolder.getLayoutPosition();
      if (j < m) {
        m = j;
      }
      if (j > n)
      {
        n = j;
        j = m;
        continue;
        paramArrayOfInt[0] = m;
        paramArrayOfInt[i] = n;
        break;
      }
      j = m;
    }
  }
  
  static RecyclerView findNestedRecyclerView(View paramView)
  {
    boolean bool = paramView instanceof ViewGroup;
    if (!bool) {
      paramView = null;
    }
    for (;;)
    {
      return paramView;
      bool = paramView instanceof RecyclerView;
      if (bool)
      {
        paramView = (RecyclerView)paramView;
      }
      else
      {
        paramView = (ViewGroup)paramView;
        int j = paramView.getChildCount();
        bool = false;
        RecyclerView localRecyclerView = null;
        int i;
        for (int k = 0;; k = i)
        {
          if (k >= j) {
            break label83;
          }
          localRecyclerView = findNestedRecyclerView(paramView.getChildAt(k));
          if (localRecyclerView != null)
          {
            paramView = localRecyclerView;
            break;
          }
          i = k + 1;
        }
        label83:
        paramView = null;
      }
    }
  }
  
  private View findNextViewToFocus()
  {
    Object localObject1 = this.mState;
    int i = ((RecyclerView.State)localObject1).mFocusedItemPosition;
    int j = -1;
    Object localObject2;
    label42:
    RecyclerView.ViewHolder localViewHolder;
    if (i != j)
    {
      localObject1 = this.mState;
      i = ((RecyclerView.State)localObject1).mFocusedItemPosition;
      localObject2 = this.mState;
      int k = ((RecyclerView.State)localObject2).getItemCount();
      j = i;
      if (j < k)
      {
        localViewHolder = findViewHolderForAdapterPosition(j);
        if (localViewHolder != null) {
          break label98;
        }
      }
      i = Math.min(k, i) + -1;
      label69:
      if (i < 0) {
        break label168;
      }
      localObject2 = findViewHolderForAdapterPosition(i);
      if (localObject2 != null) {
        break label133;
      }
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (View)localObject1;
      i = 0;
      localObject1 = null;
      break;
      label98:
      View localView1 = localViewHolder.itemView;
      boolean bool2 = localView1.hasFocusable();
      if (bool2)
      {
        localObject1 = localViewHolder.itemView;
      }
      else
      {
        j += 1;
        break label42;
        label133:
        View localView2 = ((RecyclerView.ViewHolder)localObject2).itemView;
        boolean bool1 = localView2.hasFocusable();
        if (bool1)
        {
          localObject1 = ((RecyclerView.ViewHolder)localObject2).itemView;
        }
        else
        {
          i += -1;
          break label69;
          label168:
          i = 0;
          localObject1 = null;
        }
      }
    }
  }
  
  static RecyclerView.ViewHolder getChildViewHolderInt(View paramView)
  {
    if (paramView == null) {}
    for (RecyclerView.ViewHolder localViewHolder = null;; localViewHolder = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mViewHolder) {
      return localViewHolder;
    }
  }
  
  static void getDecoratedBoundsWithMarginsInt(View paramView, Rect paramRect)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = localLayoutParams.mDecorInsets;
    int i = paramView.getLeft();
    int j = localRect.left;
    i -= j;
    j = localLayoutParams.leftMargin;
    i -= j;
    j = paramView.getTop();
    int k = localRect.top;
    j -= k;
    k = localLayoutParams.topMargin;
    j -= k;
    k = paramView.getRight();
    int m = localRect.right;
    k += m;
    m = localLayoutParams.rightMargin;
    k += m;
    m = paramView.getBottom();
    int n = localRect.bottom + m;
    int i1 = localLayoutParams.bottomMargin + n;
    paramRect.set(i, j, k, i1);
  }
  
  private int getDeepestFocusedViewWithId(View paramView)
  {
    int i = paramView.getId();
    int j = i;
    Object localObject = paramView;
    boolean bool = ((View)localObject).isFocused();
    if (!bool)
    {
      bool = localObject instanceof ViewGroup;
      if (bool)
      {
        bool = ((View)localObject).hasFocus();
        if (bool)
        {
          localObject = (ViewGroup)localObject;
          paramView = ((ViewGroup)localObject).getFocusedChild();
          i = paramView.getId();
          int k = -1;
          if (i == k) {
            break label91;
          }
        }
      }
    }
    label91:
    for (i = paramView.getId();; i = j)
    {
      j = i;
      localObject = paramView;
      break;
      return j;
    }
  }
  
  private String getFullClassName(Context paramContext, String paramString)
  {
    char c1 = '.';
    Object localObject = null;
    char c2 = paramString.charAt(0);
    String str;
    if (c2 == c1)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = paramContext.getPackageName();
      localObject = ((StringBuilder)localObject).append(str).append(paramString);
      paramString = ((StringBuilder)localObject).toString();
    }
    for (;;)
    {
      return paramString;
      localObject = ".";
      boolean bool = paramString.contains((CharSequence)localObject);
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = RecyclerView.class.getPackage().getName();
        localObject = ((StringBuilder)localObject).append(str).append(c1).append(paramString);
        paramString = ((StringBuilder)localObject).toString();
      }
    }
  }
  
  private k getScrollingChildHelper()
  {
    k localk = this.mScrollingChildHelper;
    if (localk == null)
    {
      localk = new android/support/v4/view/k;
      localk.<init>(this);
      this.mScrollingChildHelper = localk;
    }
    return this.mScrollingChildHelper;
  }
  
  private void handleMissingPreInfoForChangeError(long paramLong, RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
  {
    int i = this.mChildHelper.getChildCount();
    int j = 0;
    Object localObject1 = null;
    if (j < i)
    {
      localObject2 = getChildViewHolderInt(this.mChildHelper.getChildAt(j));
      if (localObject2 == paramViewHolder1) {}
      boolean bool2;
      do
      {
        j += 1;
        break;
        long l = getChangedHolderKey((RecyclerView.ViewHolder)localObject2);
        bool2 = l < paramLong;
      } while (bool2);
      localObject1 = this.mAdapter;
      if (localObject1 != null)
      {
        localObject1 = this.mAdapter;
        boolean bool1 = ((RecyclerView.Adapter)localObject1).hasStableIds();
        if (bool1)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:").append(localObject2).append(" \n View Holder 2:").append(paramViewHolder1);
          localObject2 = exceptionLabel();
          localObject3 = (String)localObject2;
          ((IllegalStateException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      localObject1 = new java/lang/IllegalStateException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:").append(localObject2).append(" \n View Holder 2:").append(paramViewHolder1);
      localObject2 = exceptionLabel();
      localObject3 = (String)localObject2;
      ((IllegalStateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ").append(paramViewHolder2).append(" cannot be found but it is necessary for ").append(paramViewHolder1);
    Object localObject2 = exceptionLabel();
    localObject3 = (String)localObject2;
    Log.e("RecyclerView", (String)localObject3);
  }
  
  private boolean hasUpdatedView()
  {
    boolean bool1 = false;
    int i = this.mChildHelper.getChildCount();
    int j = 0;
    if (j < i)
    {
      RecyclerView.ViewHolder localViewHolder = getChildViewHolderInt(this.mChildHelper.getChildAt(j));
      if (localViewHolder != null)
      {
        boolean bool2 = localViewHolder.shouldIgnore();
        if (!bool2) {
          break label54;
        }
      }
      label54:
      boolean bool3;
      do
      {
        j += 1;
        break;
        bool3 = localViewHolder.isUpdated();
      } while (!bool3);
      bool1 = true;
    }
    return bool1;
  }
  
  private void initChildrenHelper()
  {
    ChildHelper localChildHelper = new android/support/v7/widget/ChildHelper;
    RecyclerView.5 local5 = new android/support/v7/widget/RecyclerView$5;
    local5.<init>(this);
    localChildHelper.<init>(local5);
    this.mChildHelper = localChildHelper;
  }
  
  private boolean isPreferredNextFocus(View paramView1, View paramView2, int paramInt)
  {
    int i = -1;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    float f2 = 0.0F;
    String str;
    if ((paramView2 == null) || (paramView2 == this))
    {
      j = 0;
      str = null;
      f1 = 0.0F;
    }
    do
    {
      do
      {
        for (;;)
        {
          return j;
          localObject1 = findContainingItemView(paramView2);
          if (localObject1 != null) {
            break;
          }
          j = 0;
          str = null;
          f1 = 0.0F;
        }
      } while (paramView1 == null);
      localObject1 = findContainingItemView(paramView1);
    } while (localObject1 == null);
    Object localObject1 = this.mTempRect;
    int m = paramView1.getWidth();
    int n = paramView1.getHeight();
    ((Rect)localObject1).set(0, 0, m, n);
    localObject1 = this.mTempRect2;
    m = paramView2.getWidth();
    n = paramView2.getHeight();
    ((Rect)localObject1).set(0, 0, m, n);
    localObject1 = this.mTempRect;
    offsetDescendantRectToMyCoords(paramView1, (Rect)localObject1);
    localObject1 = this.mTempRect2;
    offsetDescendantRectToMyCoords(paramView2, (Rect)localObject1);
    localObject1 = this.mLayout;
    int i1 = ((RecyclerView.LayoutManager)localObject1).getLayoutDirection();
    label185:
    Rect localRect1;
    Rect localRect2;
    if (i1 == j)
    {
      i1 = i;
      localRect1 = this.mTempRect;
      m = localRect1.left;
      localRect2 = this.mTempRect2;
      n = localRect2.left;
      if (m >= n)
      {
        localRect1 = this.mTempRect;
        m = localRect1.right;
        localRect2 = this.mTempRect2;
        n = localRect2.left;
        if (m > n) {
          break label516;
        }
      }
      localRect1 = this.mTempRect;
      m = localRect1.right;
      localRect2 = this.mTempRect2;
      n = localRect2.right;
      if (m >= n) {
        break label516;
      }
      m = j;
    }
    for (;;)
    {
      label288:
      localRect2 = this.mTempRect;
      n = localRect2.top;
      Rect localRect3 = this.mTempRect2;
      int i4 = localRect3.top;
      if (n >= i4)
      {
        localRect2 = this.mTempRect;
        n = localRect2.bottom;
        localRect3 = this.mTempRect2;
        i4 = localRect3.top;
        if (n > i4) {}
      }
      else
      {
        localRect2 = this.mTempRect;
        n = localRect2.bottom;
        localRect3 = this.mTempRect2;
        i4 = localRect3.bottom;
        if (n < i4) {
          i = j;
        }
      }
      for (;;)
      {
        switch (paramInt)
        {
        default: 
          localObject1 = new java/lang/IllegalArgumentException;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Invalid direction: ").append(paramInt);
          str = exceptionLabel();
          localObject2 = str;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          i1 = j;
          break label185;
          label516:
          localRect1 = this.mTempRect;
          m = localRect1.right;
          localRect2 = this.mTempRect2;
          n = localRect2.right;
          if (m <= n)
          {
            localRect1 = this.mTempRect;
            m = localRect1.left;
            localRect2 = this.mTempRect2;
            n = localRect2.right;
            if (m < n) {
              break label880;
            }
          }
          localRect1 = this.mTempRect;
          m = localRect1.left;
          localRect2 = this.mTempRect2;
          n = localRect2.left;
          if (m <= n) {
            break label880;
          }
          m = i;
          break label288;
          localRect2 = this.mTempRect;
          n = localRect2.bottom;
          localRect3 = this.mTempRect2;
          i4 = localRect3.bottom;
          if (n <= i4)
          {
            localRect2 = this.mTempRect;
            n = localRect2.top;
            localRect3 = this.mTempRect2;
            i4 = localRect3.bottom;
            if (n < i4) {}
          }
          else
          {
            localRect2 = this.mTempRect;
            n = localRect2.top;
            localRect3 = this.mTempRect2;
            i4 = localRect3.top;
            if (n > i4) {
              continue;
            }
          }
          i = 0;
          localObject2 = null;
        }
      }
      if (m < 0) {
        break;
      }
      j = 0;
      str = null;
      f1 = 0.0F;
      break;
      if (m > 0) {
        break;
      }
      j = 0;
      str = null;
      f1 = 0.0F;
      break;
      if (i < 0) {
        break;
      }
      j = 0;
      str = null;
      f1 = 0.0F;
      break;
      if (i > 0) {
        break;
      }
      j = 0;
      str = null;
      f1 = 0.0F;
      break;
      int i2;
      if (i <= 0)
      {
        if (i == 0)
        {
          i1 *= m;
          if (i2 < 0) {}
        }
      }
      else
      {
        k = j;
        f2 = f1;
      }
      j = k;
      f1 = f2;
      break;
      if (i >= 0)
      {
        if (i == 0)
        {
          int i3;
          i2 *= m;
          if (i3 > 0) {}
        }
      }
      else
      {
        k = j;
        f2 = f1;
      }
      j = k;
      f1 = f2;
      break;
      label880:
      m = 0;
      localRect1 = null;
    }
  }
  
  private void onPointerUp(MotionEvent paramMotionEvent)
  {
    float f1 = 0.5F;
    int i = paramMotionEvent.getActionIndex();
    int j = paramMotionEvent.getPointerId(i);
    int k = this.mScrollPointerId;
    if (j == k)
    {
      if (i != 0) {
        break label102;
      }
      i = 1;
    }
    for (float f2 = Float.MIN_VALUE;; f2 = 0.0F)
    {
      j = paramMotionEvent.getPointerId(i);
      this.mScrollPointerId = j;
      float f3 = paramMotionEvent.getX(i) + f1;
      j = (int)f3;
      this.mLastTouchX = j;
      this.mInitialTouchX = j;
      f2 = paramMotionEvent.getY(i) + f1;
      i = (int)f2;
      this.mLastTouchY = i;
      this.mInitialTouchY = i;
      return;
      label102:
      i = 0;
    }
  }
  
  private boolean predictiveItemAnimationsEnabled()
  {
    Object localObject = this.mItemAnimator;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.mLayout;
      bool = ((RecyclerView.LayoutManager)localObject).supportsPredictiveItemAnimations();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private void processAdapterUpdatesAndSetAnimationFlags()
  {
    boolean bool1 = true;
    boolean bool2 = this.mDataSetHasChangedAfterLayout;
    Object localObject1;
    if (bool2)
    {
      localObject1 = this.mAdapterHelper;
      ((AdapterHelper)localObject1).reset();
      bool2 = this.mDispatchItemsChangedEvent;
      if (bool2)
      {
        localObject1 = this.mLayout;
        ((RecyclerView.LayoutManager)localObject1).onItemsChanged(this);
      }
    }
    bool2 = predictiveItemAnimationsEnabled();
    label77:
    boolean bool3;
    Object localObject2;
    if (bool2)
    {
      localObject1 = this.mAdapterHelper;
      ((AdapterHelper)localObject1).preProcess();
      bool2 = this.mItemsAddedOrRemoved;
      if (!bool2)
      {
        bool2 = this.mItemsChanged;
        if (!bool2) {
          break label242;
        }
      }
      bool2 = bool1;
      RecyclerView.State localState = this.mState;
      bool3 = this.mFirstLayoutComplete;
      if (!bool3) {
        break label249;
      }
      localObject2 = this.mItemAnimator;
      if (localObject2 == null) {
        break label249;
      }
      bool3 = this.mDataSetHasChangedAfterLayout;
      if ((!bool3) && (!bool2))
      {
        localObject2 = this.mLayout;
        bool3 = ((RecyclerView.LayoutManager)localObject2).mRequestedSimpleAnimations;
        if (!bool3) {
          break label249;
        }
      }
      bool3 = this.mDataSetHasChangedAfterLayout;
      if (bool3)
      {
        localObject2 = this.mAdapter;
        bool3 = ((RecyclerView.Adapter)localObject2).hasStableIds();
        if (!bool3) {
          break label249;
        }
      }
      bool3 = bool1;
      label170:
      localState.mRunSimpleAnimations = bool3;
      localObject2 = this.mState;
      localState = this.mState;
      boolean bool4 = localState.mRunSimpleAnimations;
      if ((!bool4) || (!bool2)) {
        break label258;
      }
      bool2 = this.mDataSetHasChangedAfterLayout;
      if (bool2) {
        break label258;
      }
      bool2 = predictiveItemAnimationsEnabled();
      if (!bool2) {
        break label258;
      }
    }
    for (;;)
    {
      ((RecyclerView.State)localObject2).mRunPredictiveAnimations = bool1;
      return;
      localObject1 = this.mAdapterHelper;
      ((AdapterHelper)localObject1).consumeUpdatesInOnePass();
      break;
      label242:
      bool2 = false;
      localObject1 = null;
      break label77;
      label249:
      bool3 = false;
      localObject2 = null;
      break label170;
      label258:
      bool1 = false;
    }
  }
  
  private void pullGlows(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = 1.0F;
    boolean bool1 = true;
    float f2 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f3 = 0.0F;
    EdgeEffect localEdgeEffect = null;
    boolean bool3 = paramFloat2 < 0.0F;
    float f4;
    float f5;
    int k;
    if (bool3)
    {
      ensureLeftGlow();
      localEdgeEffect = this.mLeftGlow;
      f4 = -paramFloat2;
      f5 = getWidth();
      f4 /= f5;
      k = getHeight();
      f5 = k;
      f5 = paramFloat3 / f5;
      f5 = f1 - f5;
      g.a(localEdgeEffect, f4, f5);
      bool2 = bool1;
      f3 = f2;
      bool3 = paramFloat4 < 0.0F;
      if (!bool3) {
        break label271;
      }
      ensureTopGlow();
      localEdgeEffect = this.mTopGlow;
      f4 = -paramFloat4;
      f5 = getHeight();
      f4 /= f5;
      k = getWidth();
      f5 = k;
      f5 = paramFloat1 / f5;
      g.a(localEdgeEffect, f4, f5);
    }
    for (;;)
    {
      if (!bool1)
      {
        bool1 = paramFloat2 < 0.0F;
        if (!bool1)
        {
          bool1 = paramFloat4 < 0.0F;
          if (!bool1) {
            break label196;
          }
        }
      }
      r.c(this);
      label196:
      return;
      bool3 = paramFloat2 < 0.0F;
      if (!bool3) {
        break;
      }
      ensureRightGlow();
      localEdgeEffect = this.mRightGlow;
      int i = getWidth();
      f4 = i;
      f4 = paramFloat2 / f4;
      k = getHeight();
      f5 = k;
      f5 = paramFloat3 / f5;
      g.a(localEdgeEffect, f4, f5);
      bool2 = bool1;
      f3 = f2;
      break;
      label271:
      boolean bool4 = paramFloat4 < 0.0F;
      if (bool4)
      {
        ensureBottomGlow();
        localEdgeEffect = this.mBottomGlow;
        int j = getHeight();
        f4 = j;
        f4 = paramFloat4 / f4;
        k = getWidth();
        f5 = k;
        f5 = paramFloat1 / f5;
        f5 = f1 - f5;
        g.a(localEdgeEffect, f4, f5);
      }
      else
      {
        bool1 = bool2;
        f2 = f3;
      }
    }
  }
  
  private void recoverFocusFromState()
  {
    long l1 = -1;
    View localView1 = null;
    boolean bool1 = this.mPreserveFocusAfterLayout;
    boolean bool2;
    if (bool1)
    {
      localObject1 = this.mAdapter;
      if (localObject1 != null)
      {
        bool1 = hasFocus();
        if (bool1)
        {
          int i = getDescendantFocusability();
          int n = 393216;
          if (i != n)
          {
            i = getDescendantFocusability();
            n = 131072;
            if (i != n) {
              break label86;
            }
            bool2 = isFocused();
            if (!bool2) {
              break label86;
            }
          }
        }
      }
    }
    label86:
    boolean bool5;
    Object localObject2;
    do
    {
      for (;;)
      {
        return;
        bool2 = isFocused();
        if (bool2) {
          break label183;
        }
        localObject1 = getFocusedChild();
        bool5 = IGNORE_DETACHED_FOCUSED_CHILD;
        if (!bool5) {
          break;
        }
        localObject2 = ((View)localObject1).getParent();
        if (localObject2 != null)
        {
          bool5 = ((View)localObject1).hasFocus();
          if (bool5) {
            break;
          }
        }
        localObject1 = this.mChildHelper;
        int j = ((ChildHelper)localObject1).getChildCount();
        if (j != 0) {
          break label183;
        }
        requestFocus();
      }
      localObject2 = this.mChildHelper;
      bool3 = ((ChildHelper)localObject2).isHidden((View)localObject1);
    } while (!bool3);
    label183:
    Object localObject1 = this.mState;
    long l2 = ((RecyclerView.State)localObject1).mFocusedItemId;
    boolean bool3 = l2 < l1;
    if (bool3)
    {
      localObject1 = this.mAdapter;
      bool3 = ((RecyclerView.Adapter)localObject1).hasStableIds();
      if (bool3) {
        l2 = this.mState.mFocusedItemId;
      }
    }
    for (localObject1 = findViewHolderForItemId(l2);; localObject1 = null)
    {
      if (localObject1 != null)
      {
        localObject2 = this.mChildHelper;
        View localView2 = ((RecyclerView.ViewHolder)localObject1).itemView;
        bool5 = ((ChildHelper)localObject2).isHidden(localView2);
        if (!bool5)
        {
          localObject2 = ((RecyclerView.ViewHolder)localObject1).itemView;
          bool5 = ((View)localObject2).hasFocusable();
          if (bool5) {
            break label388;
          }
        }
      }
      localObject1 = this.mChildHelper;
      int k = ((ChildHelper)localObject1).getChildCount();
      if (k > 0) {
        localView1 = findNextViewToFocus();
      }
      label316:
      if (localView1 != null)
      {
        localObject1 = this.mState;
        l2 = ((RecyclerView.State)localObject1).mFocusedSubChildId;
        boolean bool4 = l2 < l1;
        if (!bool4) {
          break label397;
        }
        m = this.mState.mFocusedSubChildId;
        localObject1 = localView1.findViewById(m);
        if (localObject1 == null) {
          break label397;
        }
        bool5 = ((View)localObject1).isFocusable();
        if (!bool5) {
          break label397;
        }
      }
      for (;;)
      {
        ((View)localObject1).requestFocus();
        break;
        label388:
        localView1 = ((RecyclerView.ViewHolder)localObject1).itemView;
        break label316;
        break;
        label397:
        localObject1 = localView1;
      }
      int m = 0;
    }
  }
  
  private void releaseGlows()
  {
    boolean bool1 = false;
    EdgeEffect localEdgeEffect1 = null;
    EdgeEffect localEdgeEffect2 = this.mLeftGlow;
    if (localEdgeEffect2 != null)
    {
      this.mLeftGlow.onRelease();
      localEdgeEffect1 = this.mLeftGlow;
      bool1 = localEdgeEffect1.isFinished();
    }
    localEdgeEffect2 = this.mTopGlow;
    boolean bool2;
    if (localEdgeEffect2 != null)
    {
      this.mTopGlow.onRelease();
      localEdgeEffect2 = this.mTopGlow;
      bool2 = localEdgeEffect2.isFinished();
      bool1 |= bool2;
    }
    localEdgeEffect2 = this.mRightGlow;
    if (localEdgeEffect2 != null)
    {
      this.mRightGlow.onRelease();
      localEdgeEffect2 = this.mRightGlow;
      bool2 = localEdgeEffect2.isFinished();
      bool1 |= bool2;
    }
    localEdgeEffect2 = this.mBottomGlow;
    if (localEdgeEffect2 != null)
    {
      this.mBottomGlow.onRelease();
      localEdgeEffect2 = this.mBottomGlow;
      bool2 = localEdgeEffect2.isFinished();
      bool1 |= bool2;
    }
    if (bool1) {
      r.c(this);
    }
  }
  
  private void requestChildOnScreen(View paramView1, View paramView2)
  {
    int i = 1;
    Object localObject1;
    Object localObject2;
    int k;
    Rect localRect;
    if (paramView2 != null)
    {
      localObject1 = paramView2;
      localObject2 = this.mTempRect;
      int j = ((View)localObject1).getWidth();
      k = ((View)localObject1).getHeight();
      ((Rect)localObject2).set(0, 0, j, k);
      localObject1 = ((View)localObject1).getLayoutParams();
      boolean bool = localObject1 instanceof RecyclerView.LayoutParams;
      if (bool)
      {
        localObject1 = (RecyclerView.LayoutParams)localObject1;
        bool = ((RecyclerView.LayoutParams)localObject1).mInsetsDirty;
        if (!bool)
        {
          localObject1 = ((RecyclerView.LayoutParams)localObject1).mDecorInsets;
          localObject2 = this.mTempRect;
          j = ((Rect)localObject2).left;
          k = ((Rect)localObject1).left;
          j -= k;
          ((Rect)localObject2).left = j;
          localObject2 = this.mTempRect;
          j = ((Rect)localObject2).right;
          k = ((Rect)localObject1).right;
          j += k;
          ((Rect)localObject2).right = j;
          localObject2 = this.mTempRect;
          j = ((Rect)localObject2).top;
          k = ((Rect)localObject1).top;
          j -= k;
          ((Rect)localObject2).top = j;
          localObject2 = this.mTempRect;
          j = ((Rect)localObject2).bottom;
          int n = ((Rect)localObject1).bottom + j;
          ((Rect)localObject2).bottom = n;
        }
      }
      if (paramView2 != null)
      {
        localObject1 = this.mTempRect;
        offsetDescendantRectToMyCoords(paramView2, (Rect)localObject1);
        localObject1 = this.mTempRect;
        offsetRectIntoDescendantCoords(paramView1, (Rect)localObject1);
      }
      localObject1 = this.mLayout;
      localRect = this.mTempRect;
      bool = this.mFirstLayoutComplete;
      if (bool) {
        break label300;
      }
      k = i;
      label273:
      if (paramView2 != null) {
        break label306;
      }
    }
    for (;;)
    {
      localObject2 = paramView1;
      ((RecyclerView.LayoutManager)localObject1).requestChildRectangleOnScreen(this, paramView1, localRect, k, i);
      return;
      localObject1 = paramView1;
      break;
      label300:
      int m = 0;
      break label273;
      label306:
      i = 0;
    }
  }
  
  private void resetFocusInfo()
  {
    int i = -1;
    this.mState.mFocusedItemId = -1;
    this.mState.mFocusedItemPosition = i;
    this.mState.mFocusedSubChildId = i;
  }
  
  private void resetTouch()
  {
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker = this.mVelocityTracker;
      localVelocityTracker.clear();
    }
    stopNestedScroll(0);
    releaseGlows();
  }
  
  private void saveFocusInfo()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool3 = this.mPreserveFocusAfterLayout;
    if (bool3)
    {
      bool3 = hasFocus();
      if (bool3)
      {
        localObject2 = this.mAdapter;
        if (localObject2 == null) {}
      }
    }
    for (Object localObject2 = getFocusedChild();; localObject2 = null)
    {
      if (localObject2 == null) {}
      for (Object localObject3 = null; localObject3 == null; localObject3 = localObject1)
      {
        resetFocusInfo();
        return;
        localObject1 = findContainingViewHolder((View)localObject2);
      }
      RecyclerView.State localState = this.mState;
      localObject1 = this.mAdapter;
      bool1 = ((RecyclerView.Adapter)localObject1).hasStableIds();
      long l;
      label97:
      int i;
      if (bool1)
      {
        l = ((RecyclerView.ViewHolder)localObject3).getItemId();
        localState.mFocusedItemId = l;
        localObject2 = this.mState;
        bool1 = this.mDataSetHasChangedAfterLayout;
        if (!bool1) {
          break label161;
        }
        i = -1;
      }
      for (;;)
      {
        ((RecyclerView.State)localObject2).mFocusedItemPosition = i;
        localObject1 = this.mState;
        localObject2 = ((RecyclerView.ViewHolder)localObject3).itemView;
        k = getDeepestFocusedViewWithId((View)localObject2);
        ((RecyclerView.State)localObject1).mFocusedSubChildId = k;
        break;
        l = -1;
        break label97;
        label161:
        boolean bool2 = ((RecyclerView.ViewHolder)localObject3).isRemoved();
        int j;
        if (bool2) {
          j = ((RecyclerView.ViewHolder)localObject3).mOldPosition;
        } else {
          j = ((RecyclerView.ViewHolder)localObject3).getAdapterPosition();
        }
      }
      int k = 0;
    }
  }
  
  private void setAdapterInternal(RecyclerView.Adapter paramAdapter, boolean paramBoolean1, boolean paramBoolean2)
  {
    RecyclerView.Adapter localAdapter1 = this.mAdapter;
    if (localAdapter1 != null)
    {
      localAdapter1 = this.mAdapter;
      localObject = this.mObserver;
      localAdapter1.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver)localObject);
      localAdapter1 = this.mAdapter;
      localAdapter1.onDetachedFromRecyclerView(this);
    }
    if ((!paramBoolean1) || (paramBoolean2)) {
      removeAndRecycleViews();
    }
    this.mAdapterHelper.reset();
    localAdapter1 = this.mAdapter;
    this.mAdapter = paramAdapter;
    if (paramAdapter != null)
    {
      localObject = this.mObserver;
      paramAdapter.registerAdapterDataObserver((RecyclerView.AdapterDataObserver)localObject);
      paramAdapter.onAttachedToRecyclerView(this);
    }
    Object localObject = this.mLayout;
    if (localObject != null)
    {
      localObject = this.mLayout;
      localAdapter2 = this.mAdapter;
      ((RecyclerView.LayoutManager)localObject).onAdapterChanged(localAdapter1, localAdapter2);
    }
    localObject = this.mRecycler;
    RecyclerView.Adapter localAdapter2 = this.mAdapter;
    ((RecyclerView.Recycler)localObject).onAdapterChanged(localAdapter1, localAdapter2, paramBoolean1);
    this.mState.mStructureChanged = true;
  }
  
  private void stopScrollersInternal()
  {
    this.mViewFlinger.stop();
    RecyclerView.LayoutManager localLayoutManager = this.mLayout;
    if (localLayoutManager != null)
    {
      localLayoutManager = this.mLayout;
      localLayoutManager.stopSmoothScroller();
    }
  }
  
  void absorbGlows(int paramInt1, int paramInt2)
  {
    EdgeEffect localEdgeEffect;
    if (paramInt1 < 0)
    {
      ensureLeftGlow();
      localEdgeEffect = this.mLeftGlow;
      int i = -paramInt1;
      localEdgeEffect.onAbsorb(i);
      if (paramInt2 >= 0) {
        break label80;
      }
      ensureTopGlow();
      localEdgeEffect = this.mTopGlow;
      i = -paramInt2;
      localEdgeEffect.onAbsorb(i);
    }
    for (;;)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        r.c(this);
      }
      return;
      if (paramInt1 <= 0) {
        break;
      }
      ensureRightGlow();
      localEdgeEffect = this.mRightGlow;
      localEdgeEffect.onAbsorb(paramInt1);
      break;
      label80:
      if (paramInt2 > 0)
      {
        ensureBottomGlow();
        localEdgeEffect = this.mBottomGlow;
        localEdgeEffect.onAbsorb(paramInt2);
      }
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutManager localLayoutManager = this.mLayout;
    if (localLayoutManager != null)
    {
      localLayoutManager = this.mLayout;
      boolean bool = localLayoutManager.onAddFocusables(this, paramArrayList, paramInt1, paramInt2);
      if (bool) {}
    }
    else
    {
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
    }
  }
  
  public void addItemDecoration(RecyclerView.ItemDecoration paramItemDecoration)
  {
    addItemDecoration(paramItemDecoration, -1);
  }
  
  public void addItemDecoration(RecyclerView.ItemDecoration paramItemDecoration, int paramInt)
  {
    Object localObject = this.mLayout;
    if (localObject != null)
    {
      localObject = this.mLayout;
      String str = "Cannot add item decoration during a scroll  or layout";
      ((RecyclerView.LayoutManager)localObject).assertNotInLayoutOrScroll(str);
    }
    localObject = this.mItemDecorations;
    boolean bool = ((ArrayList)localObject).isEmpty();
    if (bool)
    {
      bool = false;
      localObject = null;
      setWillNotDraw(false);
    }
    if (paramInt < 0)
    {
      localObject = this.mItemDecorations;
      ((ArrayList)localObject).add(paramItemDecoration);
    }
    for (;;)
    {
      markItemDecorInsetsDirty();
      requestLayout();
      return;
      localObject = this.mItemDecorations;
      ((ArrayList)localObject).add(paramInt, paramItemDecoration);
    }
  }
  
  public void addOnChildAttachStateChangeListener(RecyclerView.OnChildAttachStateChangeListener paramOnChildAttachStateChangeListener)
  {
    Object localObject = this.mOnChildAttachStateListeners;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.mOnChildAttachStateListeners = ((List)localObject);
    }
    this.mOnChildAttachStateListeners.add(paramOnChildAttachStateChangeListener);
  }
  
  public void addOnItemTouchListener(RecyclerView.OnItemTouchListener paramOnItemTouchListener)
  {
    this.mOnItemTouchListeners.add(paramOnItemTouchListener);
  }
  
  public void addOnScrollListener(RecyclerView.OnScrollListener paramOnScrollListener)
  {
    Object localObject = this.mScrollListeners;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.mScrollListeners = ((List)localObject);
    }
    this.mScrollListeners.add(paramOnScrollListener);
  }
  
  void animateAppearance(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    paramViewHolder.setIsRecyclable(false);
    RecyclerView.ItemAnimator localItemAnimator = this.mItemAnimator;
    boolean bool = localItemAnimator.animateAppearance(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2);
    if (bool) {
      postAnimationRunner();
    }
  }
  
  void animateDisappearance(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    addAnimatingView(paramViewHolder);
    paramViewHolder.setIsRecyclable(false);
    RecyclerView.ItemAnimator localItemAnimator = this.mItemAnimator;
    boolean bool = localItemAnimator.animateDisappearance(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2);
    if (bool) {
      postAnimationRunner();
    }
  }
  
  void assertInLayoutOrScroll(String paramString)
  {
    boolean bool = isComputingLayout();
    if (!bool)
    {
      if (paramString == null)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Cannot call this method unless RecyclerView is computing a layout or scrolling");
        str = exceptionLabel();
        localObject = str;
        localIllegalStateException.<init>((String)localObject);
        throw localIllegalStateException;
      }
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      String str = exceptionLabel();
      localObject = str;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
  
  void assertNotInLayoutOrScroll(String paramString)
  {
    boolean bool = isComputingLayout();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      if (paramString == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Cannot call this method while RecyclerView is computing a layout or scrolling");
        localObject3 = exceptionLabel();
        localObject2 = (String)localObject3;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>(paramString);
      throw ((Throwable)localObject1);
    }
    int i = this.mDispatchScrollCounter;
    if (i > 0)
    {
      localObject1 = "RecyclerView";
      localObject2 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.";
      localObject3 = new java/lang/IllegalStateException;
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("");
      String str = exceptionLabel();
      localObject4 = str;
      ((IllegalStateException)localObject3).<init>((String)localObject4);
      Log.w((String)localObject1, (String)localObject2, (Throwable)localObject3);
    }
  }
  
  boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder paramViewHolder)
  {
    RecyclerView.ItemAnimator localItemAnimator = this.mItemAnimator;
    boolean bool;
    if (localItemAnimator != null)
    {
      localItemAnimator = this.mItemAnimator;
      List localList = paramViewHolder.getUnmodifiedPayloads();
      bool = localItemAnimator.canReuseUpdatedViewHolder(paramViewHolder, localList);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localItemAnimator = null;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof RecyclerView.LayoutParams;
    RecyclerView.LayoutManager localLayoutManager;
    if (bool)
    {
      localLayoutManager = this.mLayout;
      paramLayoutParams = (RecyclerView.LayoutParams)paramLayoutParams;
      bool = localLayoutManager.checkLayoutParams(paramLayoutParams);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLayoutManager = null;
    }
  }
  
  void clearOldPositions()
  {
    int i = this.mChildHelper.getUnfilteredChildCount();
    int j = 0;
    while (j < i)
    {
      RecyclerView.ViewHolder localViewHolder = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(j));
      boolean bool = localViewHolder.shouldIgnore();
      if (!bool) {
        localViewHolder.clearOldPosition();
      }
      j += 1;
    }
    this.mRecycler.clearOldPositions();
  }
  
  public void clearOnChildAttachStateChangeListeners()
  {
    List localList = this.mOnChildAttachStateListeners;
    if (localList != null)
    {
      localList = this.mOnChildAttachStateListeners;
      localList.clear();
    }
  }
  
  public void clearOnScrollListeners()
  {
    List localList = this.mScrollListeners;
    if (localList != null)
    {
      localList = this.mScrollListeners;
      localList.clear();
    }
  }
  
  public int computeHorizontalScrollExtent()
  {
    int i = 0;
    RecyclerView.LayoutManager localLayoutManager = null;
    Object localObject = this.mLayout;
    if (localObject == null) {}
    for (;;)
    {
      return i;
      localObject = this.mLayout;
      boolean bool = ((RecyclerView.LayoutManager)localObject).canScrollHorizontally();
      if (bool)
      {
        localLayoutManager = this.mLayout;
        localObject = this.mState;
        i = localLayoutManager.computeHorizontalScrollExtent((RecyclerView.State)localObject);
      }
    }
  }
  
  public int computeHorizontalScrollOffset()
  {
    int i = 0;
    RecyclerView.LayoutManager localLayoutManager = null;
    Object localObject = this.mLayout;
    if (localObject == null) {}
    for (;;)
    {
      return i;
      localObject = this.mLayout;
      boolean bool = ((RecyclerView.LayoutManager)localObject).canScrollHorizontally();
      if (bool)
      {
        localLayoutManager = this.mLayout;
        localObject = this.mState;
        i = localLayoutManager.computeHorizontalScrollOffset((RecyclerView.State)localObject);
      }
    }
  }
  
  public int computeHorizontalScrollRange()
  {
    int i = 0;
    RecyclerView.LayoutManager localLayoutManager = null;
    Object localObject = this.mLayout;
    if (localObject == null) {}
    for (;;)
    {
      return i;
      localObject = this.mLayout;
      boolean bool = ((RecyclerView.LayoutManager)localObject).canScrollHorizontally();
      if (bool)
      {
        localLayoutManager = this.mLayout;
        localObject = this.mState;
        i = localLayoutManager.computeHorizontalScrollRange((RecyclerView.State)localObject);
      }
    }
  }
  
  public int computeVerticalScrollExtent()
  {
    int i = 0;
    RecyclerView.LayoutManager localLayoutManager = null;
    Object localObject = this.mLayout;
    if (localObject == null) {}
    for (;;)
    {
      return i;
      localObject = this.mLayout;
      boolean bool = ((RecyclerView.LayoutManager)localObject).canScrollVertically();
      if (bool)
      {
        localLayoutManager = this.mLayout;
        localObject = this.mState;
        i = localLayoutManager.computeVerticalScrollExtent((RecyclerView.State)localObject);
      }
    }
  }
  
  public int computeVerticalScrollOffset()
  {
    int i = 0;
    RecyclerView.LayoutManager localLayoutManager = null;
    Object localObject = this.mLayout;
    if (localObject == null) {}
    for (;;)
    {
      return i;
      localObject = this.mLayout;
      boolean bool = ((RecyclerView.LayoutManager)localObject).canScrollVertically();
      if (bool)
      {
        localLayoutManager = this.mLayout;
        localObject = this.mState;
        i = localLayoutManager.computeVerticalScrollOffset((RecyclerView.State)localObject);
      }
    }
  }
  
  public int computeVerticalScrollRange()
  {
    int i = 0;
    RecyclerView.LayoutManager localLayoutManager = null;
    Object localObject = this.mLayout;
    if (localObject == null) {}
    for (;;)
    {
      return i;
      localObject = this.mLayout;
      boolean bool = ((RecyclerView.LayoutManager)localObject).canScrollVertically();
      if (bool)
      {
        localLayoutManager = this.mLayout;
        localObject = this.mState;
        i = localLayoutManager.computeVerticalScrollRange((RecyclerView.State)localObject);
      }
    }
  }
  
  void considerReleasingGlowsOnScroll(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    EdgeEffect localEdgeEffect1 = null;
    EdgeEffect localEdgeEffect2 = this.mLeftGlow;
    boolean bool2;
    if (localEdgeEffect2 != null)
    {
      localEdgeEffect2 = this.mLeftGlow;
      bool2 = localEdgeEffect2.isFinished();
      if ((!bool2) && (paramInt1 > 0))
      {
        this.mLeftGlow.onRelease();
        localEdgeEffect1 = this.mLeftGlow;
        bool1 = localEdgeEffect1.isFinished();
      }
    }
    localEdgeEffect2 = this.mRightGlow;
    if (localEdgeEffect2 != null)
    {
      localEdgeEffect2 = this.mRightGlow;
      bool2 = localEdgeEffect2.isFinished();
      if ((!bool2) && (paramInt1 < 0))
      {
        this.mRightGlow.onRelease();
        localEdgeEffect2 = this.mRightGlow;
        bool2 = localEdgeEffect2.isFinished();
        bool1 |= bool2;
      }
    }
    localEdgeEffect2 = this.mTopGlow;
    if (localEdgeEffect2 != null)
    {
      localEdgeEffect2 = this.mTopGlow;
      bool2 = localEdgeEffect2.isFinished();
      if ((!bool2) && (paramInt2 > 0))
      {
        this.mTopGlow.onRelease();
        localEdgeEffect2 = this.mTopGlow;
        bool2 = localEdgeEffect2.isFinished();
        bool1 |= bool2;
      }
    }
    localEdgeEffect2 = this.mBottomGlow;
    if (localEdgeEffect2 != null)
    {
      localEdgeEffect2 = this.mBottomGlow;
      bool2 = localEdgeEffect2.isFinished();
      if ((!bool2) && (paramInt2 < 0))
      {
        this.mBottomGlow.onRelease();
        localEdgeEffect2 = this.mBottomGlow;
        bool2 = localEdgeEffect2.isFinished();
        bool1 |= bool2;
      }
    }
    if (bool1) {
      r.c(this);
    }
  }
  
  void consumePendingUpdateOperations()
  {
    boolean bool = this.mFirstLayoutComplete;
    Object localObject;
    if (bool)
    {
      bool = this.mDataSetHasChangedAfterLayout;
      if (!bool) {}
    }
    else
    {
      localObject = "RV FullInvalidate";
      d.a((String)localObject);
      dispatchLayout();
      d.a();
    }
    for (;;)
    {
      return;
      localObject = this.mAdapterHelper;
      bool = ((AdapterHelper)localObject).hasPendingUpdates();
      if (bool)
      {
        localObject = this.mAdapterHelper;
        int i = 4;
        bool = ((AdapterHelper)localObject).hasAnyUpdateTypes(i);
        if (bool)
        {
          localObject = this.mAdapterHelper;
          i = 11;
          bool = ((AdapterHelper)localObject).hasAnyUpdateTypes(i);
          if (!bool)
          {
            d.a("RV PartialInvalidate");
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            localObject = this.mAdapterHelper;
            ((AdapterHelper)localObject).preProcess();
            bool = this.mLayoutWasDefered;
            if (!bool)
            {
              bool = hasUpdatedView();
              if (!bool) {
                break label143;
              }
              dispatchLayout();
            }
            for (;;)
            {
              bool = true;
              stopInterceptRequestLayout(bool);
              onExitLayoutOrScroll();
              d.a();
              break;
              label143:
              localObject = this.mAdapterHelper;
              ((AdapterHelper)localObject).consumePostponedUpdates();
            }
          }
        }
        localObject = this.mAdapterHelper;
        bool = ((AdapterHelper)localObject).hasPendingUpdates();
        if (bool)
        {
          localObject = "RV FullInvalidate";
          d.a((String)localObject);
          dispatchLayout();
          d.a();
        }
      }
    }
  }
  
  void defaultOnMeasure(int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft();
    int j = getPaddingRight();
    i += j;
    j = r.i(this);
    i = RecyclerView.LayoutManager.chooseSize(paramInt1, i, j);
    j = getPaddingTop();
    int k = getPaddingBottom();
    j += k;
    k = r.j(this);
    j = RecyclerView.LayoutManager.chooseSize(paramInt2, j, k);
    setMeasuredDimension(i, j);
  }
  
  void dispatchChildAttached(View paramView)
  {
    Object localObject = getChildViewHolderInt(paramView);
    onChildAttachedToWindow(paramView);
    RecyclerView.Adapter localAdapter = this.mAdapter;
    if ((localAdapter != null) && (localObject != null))
    {
      localAdapter = this.mAdapter;
      localAdapter.onViewAttachedToWindow((RecyclerView.ViewHolder)localObject);
    }
    localObject = this.mOnChildAttachStateListeners;
    if (localObject != null)
    {
      localObject = this.mOnChildAttachStateListeners;
      int i = ((List)localObject).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject = (RecyclerView.OnChildAttachStateChangeListener)this.mOnChildAttachStateListeners.get(j);
        ((RecyclerView.OnChildAttachStateChangeListener)localObject).onChildViewAttachedToWindow(paramView);
        i = j + -1;
      }
    }
  }
  
  void dispatchChildDetached(View paramView)
  {
    Object localObject = getChildViewHolderInt(paramView);
    onChildDetachedFromWindow(paramView);
    RecyclerView.Adapter localAdapter = this.mAdapter;
    if ((localAdapter != null) && (localObject != null))
    {
      localAdapter = this.mAdapter;
      localAdapter.onViewDetachedFromWindow((RecyclerView.ViewHolder)localObject);
    }
    localObject = this.mOnChildAttachStateListeners;
    if (localObject != null)
    {
      localObject = this.mOnChildAttachStateListeners;
      int i = ((List)localObject).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject = (RecyclerView.OnChildAttachStateChangeListener)this.mOnChildAttachStateListeners.get(j);
        ((RecyclerView.OnChildAttachStateChangeListener)localObject).onChildViewDetachedFromWindow(paramView);
        i = j + -1;
      }
    }
  }
  
  void dispatchLayout()
  {
    Object localObject = this.mAdapter;
    if (localObject == null)
    {
      localObject = "RecyclerView";
      str = "No adapter attached; skipping layout";
      Log.e((String)localObject, str);
    }
    for (;;)
    {
      return;
      localObject = this.mLayout;
      if (localObject != null) {
        break;
      }
      localObject = "RecyclerView";
      str = "No layout manager attached; skipping layout";
      Log.e((String)localObject, str);
    }
    localObject = this.mState;
    String str = null;
    ((RecyclerView.State)localObject).mIsMeasuring = false;
    localObject = this.mState;
    int i = ((RecyclerView.State)localObject).mLayoutStep;
    int k = 1;
    if (i == k)
    {
      dispatchLayoutStep1();
      localObject = this.mLayout;
      ((RecyclerView.LayoutManager)localObject).setExactMeasureSpecsFrom(this);
      dispatchLayoutStep2();
    }
    for (;;)
    {
      dispatchLayoutStep3();
      break;
      localObject = this.mAdapterHelper;
      boolean bool = ((AdapterHelper)localObject).hasUpdates();
      if (!bool)
      {
        localObject = this.mLayout;
        int j = ((RecyclerView.LayoutManager)localObject).getWidth();
        k = getWidth();
        if (j == k)
        {
          localObject = this.mLayout;
          j = ((RecyclerView.LayoutManager)localObject).getHeight();
          k = getHeight();
          if (j == k) {
            break label179;
          }
        }
      }
      localObject = this.mLayout;
      ((RecyclerView.LayoutManager)localObject).setExactMeasureSpecsFrom(this);
      dispatchLayoutStep2();
      continue;
      label179:
      localObject = this.mLayout;
      ((RecyclerView.LayoutManager)localObject).setExactMeasureSpecsFrom(this);
    }
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
  }
  
  void dispatchOnScrollStateChanged(int paramInt)
  {
    Object localObject = this.mLayout;
    if (localObject != null)
    {
      localObject = this.mLayout;
      ((RecyclerView.LayoutManager)localObject).onScrollStateChanged(paramInt);
    }
    onScrollStateChanged(paramInt);
    localObject = this.mScrollListener;
    if (localObject != null)
    {
      localObject = this.mScrollListener;
      ((RecyclerView.OnScrollListener)localObject).onScrollStateChanged(this, paramInt);
    }
    localObject = this.mScrollListeners;
    if (localObject != null)
    {
      localObject = this.mScrollListeners;
      int i = ((List)localObject).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject = (RecyclerView.OnScrollListener)this.mScrollListeners.get(j);
        ((RecyclerView.OnScrollListener)localObject).onScrollStateChanged(this, paramInt);
        i = j + -1;
      }
    }
  }
  
  void dispatchOnScrolled(int paramInt1, int paramInt2)
  {
    int i = this.mDispatchScrollCounter + 1;
    this.mDispatchScrollCounter = i;
    i = getScrollX();
    int j = getScrollY();
    onScrollChanged(i, j, i, j);
    onScrolled(paramInt1, paramInt2);
    Object localObject = this.mScrollListener;
    if (localObject != null)
    {
      localObject = this.mScrollListener;
      ((RecyclerView.OnScrollListener)localObject).onScrolled(this, paramInt1, paramInt2);
    }
    localObject = this.mScrollListeners;
    if (localObject != null)
    {
      localObject = this.mScrollListeners;
      i = ((List)localObject).size() + -1;
      for (j = i; j >= 0; j = i)
      {
        localObject = (RecyclerView.OnScrollListener)this.mScrollListeners.get(j);
        ((RecyclerView.OnScrollListener)localObject).onScrolled(this, paramInt1, paramInt2);
        i = j + -1;
      }
    }
    i = this.mDispatchScrollCounter + -1;
    this.mDispatchScrollCounter = i;
  }
  
  void dispatchPendingImportantForAccessibilityChanges()
  {
    int i = -1;
    Object localObject = this.mPendingAccessibilityImportanceChange;
    int j = ((List)localObject).size() + -1;
    int k = j;
    if (k >= 0)
    {
      localObject = (RecyclerView.ViewHolder)this.mPendingAccessibilityImportanceChange.get(k);
      ViewParent localViewParent = ((RecyclerView.ViewHolder)localObject).itemView.getParent();
      if (localViewParent == this)
      {
        boolean bool = ((RecyclerView.ViewHolder)localObject).shouldIgnore();
        if (!bool) {
          break label76;
        }
      }
      for (;;)
      {
        j = k + -1;
        k = j;
        break;
        label76:
        int m = ((RecyclerView.ViewHolder)localObject).mPendingAccessibilityState;
        if (m != i)
        {
          View localView = ((RecyclerView.ViewHolder)localObject).itemView;
          r.a(localView, m);
          ((RecyclerView.ViewHolder)localObject).mPendingAccessibilityState = i;
        }
      }
    }
    this.mPendingAccessibilityImportanceChange.clear();
  }
  
  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = 0;
    Object localObject1 = null;
    super.draw(paramCanvas);
    Object localObject2 = this.mItemDecorations;
    int k = ((ArrayList)localObject2).size();
    int i1 = 0;
    EdgeEffect localEdgeEffect1 = null;
    float f2 = 0.0F;
    while (i1 < k)
    {
      localObject2 = (RecyclerView.ItemDecoration)this.mItemDecorations.get(i1);
      RecyclerView.State localState = this.mState;
      ((RecyclerView.ItemDecoration)localObject2).onDrawOver(paramCanvas, this, localState);
      int i5 = i1 + 1;
      i1 = i5;
    }
    localObject2 = this.mLeftGlow;
    float f3;
    float f4;
    EdgeEffect localEdgeEffect2;
    int i7;
    if (localObject2 != null)
    {
      localObject2 = this.mLeftGlow;
      boolean bool7 = ((EdgeEffect)localObject2).isFinished();
      if (!bool7)
      {
        i1 = paramCanvas.save();
        bool7 = this.mClipToPadding;
        if (bool7)
        {
          int i6 = getPaddingBottom();
          paramCanvas.rotate(270.0F);
          k = -getHeight();
          i6 += k;
          f3 = i6;
          k = 0;
          f4 = 0.0F;
          localEdgeEffect2 = null;
          paramCanvas.translate(f3, 0.0F);
          localObject2 = this.mLeftGlow;
          if (localObject2 == null) {
            break label733;
          }
          localObject2 = this.mLeftGlow;
          i7 = ((EdgeEffect)localObject2).draw(paramCanvas);
          if (i7 == 0) {
            break label733;
          }
          i7 = i;
          f3 = f1;
          label217:
          paramCanvas.restoreToCount(i1);
        }
      }
    }
    for (;;)
    {
      localEdgeEffect1 = this.mTopGlow;
      int i9;
      float f5;
      boolean bool5;
      if (localEdgeEffect1 != null)
      {
        localEdgeEffect1 = this.mTopGlow;
        boolean bool4 = localEdgeEffect1.isFinished();
        if (!bool4)
        {
          k = paramCanvas.save();
          bool4 = this.mClipToPadding;
          if (bool4)
          {
            int i2 = getPaddingLeft();
            f2 = i2;
            i9 = getPaddingTop();
            f5 = i9;
            paramCanvas.translate(f2, f5);
          }
          localEdgeEffect1 = this.mTopGlow;
          if (localEdgeEffect1 == null) {
            break label745;
          }
          localEdgeEffect1 = this.mTopGlow;
          bool5 = localEdgeEffect1.draw(paramCanvas);
          if (!bool5) {
            break label745;
          }
          bool5 = i;
          f2 = f1;
          label335:
          i7 |= bool5;
          paramCanvas.restoreToCount(k);
        }
      }
      localEdgeEffect1 = this.mRightGlow;
      label406:
      int i10;
      boolean bool6;
      if (localEdgeEffect1 != null)
      {
        localEdgeEffect1 = this.mRightGlow;
        bool5 = localEdgeEffect1.isFinished();
        if (!bool5)
        {
          k = paramCanvas.save();
          i9 = getWidth();
          bool5 = this.mClipToPadding;
          if (!bool5) {
            break label757;
          }
          int i3 = getPaddingTop();
          i10 = 1119092736;
          float f6 = 90.0F;
          paramCanvas.rotate(f6);
          i3 = -i3;
          f2 = i3;
          i9 = -i9;
          f5 = i9;
          paramCanvas.translate(f2, f5);
          localEdgeEffect1 = this.mRightGlow;
          if (localEdgeEffect1 == null) {
            break label769;
          }
          localEdgeEffect1 = this.mRightGlow;
          bool6 = localEdgeEffect1.draw(paramCanvas);
          if (!bool6) {
            break label769;
          }
          bool6 = i;
          f2 = f1;
          label486:
          i7 |= bool6;
          paramCanvas.restoreToCount(k);
        }
      }
      localEdgeEffect1 = this.mBottomGlow;
      int i4;
      if (localEdgeEffect1 != null)
      {
        localEdgeEffect1 = this.mBottomGlow;
        bool6 = localEdgeEffect1.isFinished();
        if (!bool6)
        {
          i4 = paramCanvas.save();
          f4 = 180.0F;
          paramCanvas.rotate(f4);
          boolean bool2 = this.mClipToPadding;
          if (!bool2) {
            break label781;
          }
          int m = -getWidth();
          i9 = getPaddingRight();
          m += i9;
          f4 = m;
          i9 = -getHeight();
          i10 = getPaddingBottom();
          i9 += i10;
          f5 = i9;
          paramCanvas.translate(f4, f5);
          label614:
          localEdgeEffect2 = this.mBottomGlow;
          if (localEdgeEffect2 != null)
          {
            localEdgeEffect2 = this.mBottomGlow;
            boolean bool3 = localEdgeEffect2.draw(paramCanvas);
            if (bool3) {
              j = i;
            }
          }
          i7 |= j;
          paramCanvas.restoreToCount(i4);
        }
      }
      if (i7 == 0)
      {
        localObject1 = this.mItemAnimator;
        if (localObject1 != null)
        {
          localObject1 = this.mItemDecorations;
          j = ((ArrayList)localObject1).size();
          if (j > 0)
          {
            localObject1 = this.mItemAnimator;
            boolean bool1 = ((RecyclerView.ItemAnimator)localObject1).isRunning();
            if (!bool1) {}
          }
        }
      }
      for (;;)
      {
        if (i != 0) {
          r.c(this);
        }
        return;
        i8 = 0;
        localObject2 = null;
        f3 = 0.0F;
        break;
        label733:
        i8 = 0;
        localObject2 = null;
        f3 = 0.0F;
        break label217;
        label745:
        i4 = 0;
        localEdgeEffect1 = null;
        f2 = 0.0F;
        break label335;
        label757:
        i4 = 0;
        localEdgeEffect1 = null;
        f2 = 0.0F;
        break label406;
        label769:
        i4 = 0;
        localEdgeEffect1 = null;
        f2 = 0.0F;
        break label486;
        label781:
        int n = -getWidth();
        f4 = n;
        i9 = -getHeight();
        f5 = i9;
        paramCanvas.translate(f4, f5);
        break label614;
        i = i8;
      }
      int i8 = 0;
      localObject2 = null;
      f3 = 0.0F;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  void ensureBottomGlow()
  {
    Object localObject = this.mBottomGlow;
    if (localObject != null) {}
    for (;;)
    {
      return;
      localObject = this.mEdgeEffectFactory;
      int i = 3;
      localObject = ((RecyclerView.EdgeEffectFactory)localObject).createEdgeEffect(this, i);
      this.mBottomGlow = ((EdgeEffect)localObject);
      boolean bool = this.mClipToPadding;
      int j;
      if (bool)
      {
        localObject = this.mBottomGlow;
        i = getMeasuredWidth();
        j = getPaddingLeft();
        i -= j;
        j = getPaddingRight();
        i -= j;
        j = getMeasuredHeight();
        int k = getPaddingTop();
        j -= k;
        k = getPaddingBottom();
        j -= k;
        ((EdgeEffect)localObject).setSize(i, j);
      }
      else
      {
        localObject = this.mBottomGlow;
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        ((EdgeEffect)localObject).setSize(i, j);
      }
    }
  }
  
  void ensureLeftGlow()
  {
    Object localObject = this.mLeftGlow;
    if (localObject != null) {}
    for (;;)
    {
      return;
      localObject = this.mEdgeEffectFactory;
      int i = 0;
      localObject = ((RecyclerView.EdgeEffectFactory)localObject).createEdgeEffect(this, 0);
      this.mLeftGlow = ((EdgeEffect)localObject);
      boolean bool = this.mClipToPadding;
      int j;
      if (bool)
      {
        localObject = this.mLeftGlow;
        i = getMeasuredHeight();
        j = getPaddingTop();
        i -= j;
        j = getPaddingBottom();
        i -= j;
        j = getMeasuredWidth();
        int k = getPaddingLeft();
        j -= k;
        k = getPaddingRight();
        j -= k;
        ((EdgeEffect)localObject).setSize(i, j);
      }
      else
      {
        localObject = this.mLeftGlow;
        i = getMeasuredHeight();
        j = getMeasuredWidth();
        ((EdgeEffect)localObject).setSize(i, j);
      }
    }
  }
  
  void ensureRightGlow()
  {
    Object localObject = this.mRightGlow;
    if (localObject != null) {}
    for (;;)
    {
      return;
      localObject = this.mEdgeEffectFactory;
      int i = 2;
      localObject = ((RecyclerView.EdgeEffectFactory)localObject).createEdgeEffect(this, i);
      this.mRightGlow = ((EdgeEffect)localObject);
      boolean bool = this.mClipToPadding;
      int j;
      if (bool)
      {
        localObject = this.mRightGlow;
        i = getMeasuredHeight();
        j = getPaddingTop();
        i -= j;
        j = getPaddingBottom();
        i -= j;
        j = getMeasuredWidth();
        int k = getPaddingLeft();
        j -= k;
        k = getPaddingRight();
        j -= k;
        ((EdgeEffect)localObject).setSize(i, j);
      }
      else
      {
        localObject = this.mRightGlow;
        i = getMeasuredHeight();
        j = getMeasuredWidth();
        ((EdgeEffect)localObject).setSize(i, j);
      }
    }
  }
  
  void ensureTopGlow()
  {
    Object localObject = this.mTopGlow;
    if (localObject != null) {}
    for (;;)
    {
      return;
      localObject = this.mEdgeEffectFactory;
      int i = 1;
      localObject = ((RecyclerView.EdgeEffectFactory)localObject).createEdgeEffect(this, i);
      this.mTopGlow = ((EdgeEffect)localObject);
      boolean bool = this.mClipToPadding;
      int j;
      if (bool)
      {
        localObject = this.mTopGlow;
        i = getMeasuredWidth();
        j = getPaddingLeft();
        i -= j;
        j = getPaddingRight();
        i -= j;
        j = getMeasuredHeight();
        int k = getPaddingTop();
        j -= k;
        k = getPaddingBottom();
        j -= k;
        ((EdgeEffect)localObject).setSize(i, j);
      }
      else
      {
        localObject = this.mTopGlow;
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        ((EdgeEffect)localObject).setSize(i, j);
      }
    }
  }
  
  String exceptionLabel()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append(" ");
    Object localObject = super.toString();
    localStringBuilder = localStringBuilder.append((String)localObject).append(", adapter:");
    localObject = this.mAdapter;
    localStringBuilder = localStringBuilder.append(localObject).append(", layout:");
    localObject = this.mLayout;
    localStringBuilder = localStringBuilder.append(localObject).append(", context:");
    localObject = getContext();
    return (String)localObject;
  }
  
  final void fillRemainingScrollValues(RecyclerView.State paramState)
  {
    int i = 0;
    int j = getScrollState();
    int k = 2;
    if (j == k)
    {
      OverScroller localOverScroller = RecyclerView.ViewFlinger.access$400(this.mViewFlinger);
      k = localOverScroller.getFinalX();
      i = localOverScroller.getCurrX();
      k -= i;
      paramState.mRemainingScrollHorizontal = k;
      k = localOverScroller.getFinalY();
      j = localOverScroller.getCurrY();
      j = k - j;
    }
    for (paramState.mRemainingScrollVertical = j;; paramState.mRemainingScrollVertical = 0)
    {
      return;
      paramState.mRemainingScrollHorizontal = 0;
    }
  }
  
  public View findChildViewUnder(float paramFloat1, float paramFloat2)
  {
    Object localObject = this.mChildHelper;
    int i = ((ChildHelper)localObject).getChildCount() + -1;
    int j = i;
    if (j >= 0)
    {
      localObject = this.mChildHelper.getChildAt(j);
      float f1 = ((View)localObject).getTranslationX();
      float f2 = ((View)localObject).getTranslationY();
      float f3 = ((View)localObject).getLeft() + f1;
      boolean bool1 = paramFloat1 < f3;
      if (!bool1)
      {
        int k = ((View)localObject).getRight();
        f3 = k;
        f1 += f3;
        boolean bool2 = paramFloat1 < f1;
        if (!bool2)
        {
          f1 = ((View)localObject).getTop() + f2;
          bool2 = paramFloat2 < f1;
          if (!bool2)
          {
            f1 = ((View)localObject).getBottom() + f2;
            bool2 = paramFloat2 < f1;
            if (bool2) {}
          }
        }
      }
    }
    for (;;)
    {
      return (View)localObject;
      i = j + -1;
      j = i;
      break;
      i = 0;
      localObject = null;
    }
  }
  
  public View findContainingItemView(View paramView)
  {
    Object localObject1 = paramView.getParent();
    Object localObject2 = paramView;
    while ((localObject1 != null) && (localObject1 != this))
    {
      boolean bool = localObject1 instanceof View;
      if (!bool) {
        break;
      }
      localObject1 = (View)localObject1;
      ViewParent localViewParent = ((View)localObject1).getParent();
      localObject2 = localObject1;
      localObject1 = localViewParent;
    }
    if (localObject1 == this) {}
    for (localObject1 = localObject2;; localObject1 = null) {
      return (View)localObject1;
    }
  }
  
  public RecyclerView.ViewHolder findContainingViewHolder(View paramView)
  {
    Object localObject = findContainingItemView(paramView);
    if (localObject == null) {}
    for (localObject = null;; localObject = getChildViewHolder((View)localObject)) {
      return (RecyclerView.ViewHolder)localObject;
    }
  }
  
  public RecyclerView.ViewHolder findViewHolderForAdapterPosition(int paramInt)
  {
    Object localObject1 = null;
    boolean bool1 = this.mDataSetHasChangedAfterLayout;
    if (bool1) {}
    int k;
    Object localObject2;
    label30:
    do
    {
      return (RecyclerView.ViewHolder)localObject1;
      int j = this.mChildHelper.getUnfilteredChildCount();
      k = 0;
      bool1 = false;
      localObject2 = null;
      if (k >= j) {
        break;
      }
      localObject1 = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(k));
      if (localObject1 == null) {
        break label122;
      }
      boolean bool2 = ((RecyclerView.ViewHolder)localObject1).isRemoved();
      if (bool2) {
        break label122;
      }
      int m = getAdapterPositionFor((RecyclerView.ViewHolder)localObject1);
      if (m != paramInt) {
        break label122;
      }
      localObject2 = this.mChildHelper;
      View localView = ((RecyclerView.ViewHolder)localObject1).itemView;
      bool1 = ((ChildHelper)localObject2).isHidden(localView);
    } while (!bool1);
    for (;;)
    {
      int i = k + 1;
      k = i;
      localObject2 = localObject1;
      break label30;
      localObject1 = localObject2;
      break;
      label122:
      localObject1 = localObject2;
    }
  }
  
  public RecyclerView.ViewHolder findViewHolderForItemId(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = this.mAdapter;
    boolean bool1;
    if (localObject2 != null)
    {
      localObject2 = this.mAdapter;
      bool1 = ((RecyclerView.Adapter)localObject2).hasStableIds();
      if (bool1) {
        break label33;
      }
    }
    label33:
    int k;
    label51:
    do
    {
      return (RecyclerView.ViewHolder)localObject1;
      int j = this.mChildHelper.getUnfilteredChildCount();
      k = 0;
      bool1 = false;
      localObject2 = null;
      if (k >= j) {
        break;
      }
      localObject1 = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(k));
      if (localObject1 == null) {
        break label151;
      }
      boolean bool2 = ((RecyclerView.ViewHolder)localObject1).isRemoved();
      if (bool2) {
        break label151;
      }
      long l = ((RecyclerView.ViewHolder)localObject1).getItemId();
      bool2 = l < paramLong;
      if (bool2) {
        break label151;
      }
      localObject2 = this.mChildHelper;
      View localView = ((RecyclerView.ViewHolder)localObject1).itemView;
      bool1 = ((ChildHelper)localObject2).isHidden(localView);
    } while (!bool1);
    for (;;)
    {
      int i = k + 1;
      k = i;
      localObject2 = localObject1;
      break label51;
      localObject1 = localObject2;
      break;
      label151:
      localObject1 = localObject2;
    }
  }
  
  public RecyclerView.ViewHolder findViewHolderForLayoutPosition(int paramInt)
  {
    return findViewHolderForPosition(paramInt, false);
  }
  
  public RecyclerView.ViewHolder findViewHolderForPosition(int paramInt)
  {
    return findViewHolderForPosition(paramInt, false);
  }
  
  RecyclerView.ViewHolder findViewHolderForPosition(int paramInt, boolean paramBoolean)
  {
    int i = this.mChildHelper.getUnfilteredChildCount();
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    boolean bool1 = false;
    Object localObject2 = null;
    if (k < i)
    {
      localObject1 = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(k));
      int m;
      if (localObject1 != null)
      {
        boolean bool2 = ((RecyclerView.ViewHolder)localObject1).isRemoved();
        if (!bool2)
        {
          if (!paramBoolean) {
            break label90;
          }
          m = ((RecyclerView.ViewHolder)localObject1).mPosition;
          if (m == paramInt) {
            break label103;
          }
        }
      }
      for (;;)
      {
        j = k + 1;
        k = j;
        break;
        label90:
        m = ((RecyclerView.ViewHolder)localObject1).getLayoutPosition();
        if (m == paramInt)
        {
          label103:
          localObject2 = this.mChildHelper;
          View localView = ((RecyclerView.ViewHolder)localObject1).itemView;
          bool1 = ((ChildHelper)localObject2).isHidden(localView);
          if (!bool1) {
            break label141;
          }
          localObject2 = localObject1;
        }
      }
    }
    localObject1 = localObject2;
    label141:
    return (RecyclerView.ViewHolder)localObject1;
  }
  
  public boolean fling(int paramInt1, int paramInt2)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    Object localObject = this.mLayout;
    if (localObject == null)
    {
      localObject = "RecyclerView";
      String str = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.";
      Log.e((String)localObject, str);
    }
    boolean bool4;
    boolean bool5;
    boolean bool3;
    label241:
    do
    {
      float f3;
      do
      {
        do
        {
          boolean bool2;
          do
          {
            return bool1;
            bool2 = this.mLayoutFrozen;
          } while (bool2);
          bool4 = this.mLayout.canScrollHorizontally();
          localObject = this.mLayout;
          bool5 = ((RecyclerView.LayoutManager)localObject).canScrollVertically();
          int k;
          int i1;
          if (bool4)
          {
            k = Math.abs(paramInt1);
            i1 = this.mMinFlingVelocity;
            if (k >= i1) {}
          }
          else
          {
            paramInt1 = 0;
          }
          if (bool5)
          {
            k = Math.abs(paramInt2);
            i1 = this.mMinFlingVelocity;
            if (k >= i1) {}
          }
          else
          {
            paramInt2 = 0;
          }
        } while ((paramInt1 == 0) && (paramInt2 == 0));
        f2 = paramInt1;
        f3 = paramInt2;
        bool3 = dispatchNestedPreFling(f2, f3);
      } while (bool3);
      if ((bool4) || (bool5)) {
        bool3 = i;
      }
      for (f2 = f1;; f2 = 0.0F)
      {
        f3 = paramInt1;
        float f4 = paramInt2;
        dispatchNestedFling(f3, f4, bool3);
        RecyclerView.OnFlingListener localOnFlingListener = this.mOnFlingListener;
        if (localOnFlingListener == null) {
          break label241;
        }
        localOnFlingListener = this.mOnFlingListener;
        boolean bool6 = localOnFlingListener.onFling(paramInt1, paramInt2);
        if (!bool6) {
          break label241;
        }
        bool1 = i;
        break;
        bool3 = false;
        localObject = null;
      }
    } while (!bool3);
    if (bool4) {
      bool3 = i;
    }
    for (float f2 = f1;; f2 = 0.0F)
    {
      if (bool5) {
        bool3 |= true;
      }
      startNestedScroll(m, i);
      int m = -this.mMaxFlingVelocity;
      int j = this.mMaxFlingVelocity;
      j = Math.min(paramInt1, j);
      m = Math.max(m, j);
      j = -this.mMaxFlingVelocity;
      int n = this.mMaxFlingVelocity;
      n = Math.min(paramInt2, n);
      j = Math.max(j, n);
      RecyclerView.ViewFlinger localViewFlinger = this.mViewFlinger;
      localViewFlinger.fling(m, j);
      j = i;
      break;
      m = 0;
      localObject = null;
    }
  }
  
  public View focusSearch(View paramView, int paramInt)
  {
    int i = 2;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = this.mLayout.onInterceptFocusSearch(paramView, paramInt);
    if (localObject1 != null)
    {
      paramView = (View)localObject1;
      return paramView;
    }
    localObject1 = this.mAdapter;
    float f2;
    label82:
    FocusFinder localFocusFinder;
    int m;
    label136:
    Object localObject2;
    float f3;
    if (localObject1 != null)
    {
      localObject1 = this.mLayout;
      if (localObject1 != null)
      {
        boolean bool2 = isComputingLayout();
        if (!bool2)
        {
          bool2 = this.mLayoutFrozen;
          if (!bool2)
          {
            int k = j;
            f2 = f1;
            localFocusFinder = FocusFinder.getInstance();
            if ((k == 0) || ((paramInt != i) && (paramInt != j))) {
              break label492;
            }
            localObject1 = this.mLayout;
            boolean bool3 = ((RecyclerView.LayoutManager)localObject1).canScrollVertically();
            if (!bool3) {
              break label647;
            }
            if (paramInt != i) {
              break label333;
            }
            m = 130;
            f2 = 1.82E-43F;
            localObject2 = localFocusFinder.findNextFocus(this, paramView, m);
            if (localObject2 != null) {
              break label345;
            }
            int n = j;
            f3 = f1;
            label160:
            boolean bool5 = FORCE_ABS_FOCUS_SEARCH_DIRECTION;
            if (!bool5) {
              break label636;
            }
            paramInt = m;
            m = n;
            f2 = f3;
          }
        }
      }
    }
    for (;;)
    {
      label232:
      label245:
      label266:
      label282:
      int i2;
      if (m == 0)
      {
        localObject2 = this.mLayout;
        boolean bool4 = ((RecyclerView.LayoutManager)localObject2).canScrollHorizontally();
        if (bool4)
        {
          localObject1 = this.mLayout;
          m = ((RecyclerView.LayoutManager)localObject1).getLayoutDirection();
          if (m == j)
          {
            int i1 = j;
            f3 = f1;
            if (paramInt != i) {
              break label369;
            }
            m = j;
            f2 = f1;
            m ^= i1;
            if (m == 0) {
              break label381;
            }
            m = 66;
            f2 = 9.2E-44F;
            localObject2 = localFocusFinder.findNextFocus(this, paramView, m);
            if (localObject2 != null) {
              break label393;
            }
            i2 = FORCE_ABS_FOCUS_SEARCH_DIRECTION;
            if (i2 != 0) {
              paramInt = m;
            }
          }
        }
      }
      for (;;)
      {
        label333:
        label345:
        label369:
        label381:
        label393:
        Object localObject3;
        if (j != 0)
        {
          consumePendingUpdateOperations();
          localObject1 = findContainingItemView(paramView);
          if (localObject1 == null)
          {
            paramView = null;
            break;
            m = 0;
            localObject1 = null;
            f2 = 0.0F;
            break label82;
            m = 33;
            f2 = 4.6E-44F;
            break label136;
            i2 = 0;
            localObject2 = null;
            f3 = 0.0F;
            break label160;
            i2 = 0;
            localObject2 = null;
            f3 = 0.0F;
            break label232;
            m = 0;
            localObject1 = null;
            f2 = 0.0F;
            break label245;
            m = 17;
            f2 = 2.4E-44F;
            break label266;
            j = 0;
            localObject3 = null;
            f1 = 0.0F;
            break label282;
          }
          startInterceptRequestLayout();
          localObject1 = this.mLayout;
          localObject3 = this.mRecycler;
          localObject2 = this.mState;
          ((RecyclerView.LayoutManager)localObject1).onFocusSearchFailed(paramView, paramInt, (RecyclerView.Recycler)localObject3, (RecyclerView.State)localObject2);
          stopInterceptRequestLayout(false);
        }
        localObject1 = localFocusFinder.findNextFocus(this, paramView, paramInt);
        for (;;)
        {
          if (localObject1 != null)
          {
            bool1 = ((View)localObject1).hasFocusable();
            if (!bool1)
            {
              localObject3 = getFocusedChild();
              if (localObject3 == null)
              {
                paramView = super.focusSearch(paramView, paramInt);
                break;
                label492:
                localObject3 = localFocusFinder.findNextFocus(this, paramView, paramInt);
                if ((localObject3 != null) || (m == 0)) {
                  break label618;
                }
                consumePendingUpdateOperations();
                localObject1 = findContainingItemView(paramView);
                if (localObject1 == null)
                {
                  paramView = null;
                  break;
                }
                startInterceptRequestLayout();
                localObject1 = this.mLayout;
                localObject3 = this.mRecycler;
                localObject2 = this.mState;
                localObject1 = ((RecyclerView.LayoutManager)localObject1).onFocusSearchFailed(paramView, paramInt, (RecyclerView.Recycler)localObject3, (RecyclerView.State)localObject2);
                stopInterceptRequestLayout(false);
                continue;
              }
              requestChildOnScreen((View)localObject1, null);
              break;
            }
          }
          bool1 = isPreferredNextFocus(paramView, (View)localObject1, paramInt);
          if (bool1) {}
          for (;;)
          {
            paramView = (View)localObject1;
            break;
            localObject1 = super.focusSearch(paramView, paramInt);
          }
          label618:
          localObject1 = localObject3;
        }
        boolean bool1 = m;
        f1 = f2;
      }
      label636:
      m = i2;
      f2 = f3;
      continue;
      label647:
      m = 0;
      localObject1 = null;
      f2 = 0.0F;
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    Object localObject1 = this.mLayout;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("RecyclerView has no LayoutManager");
      String str = exceptionLabel();
      localObject2 = str;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return this.mLayout.generateDefaultLayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    Object localObject1 = this.mLayout;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("RecyclerView has no LayoutManager");
      String str = exceptionLabel();
      localObject2 = str;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.mLayout;
    Object localObject2 = getContext();
    return ((RecyclerView.LayoutManager)localObject1).generateLayoutParams((Context)localObject2, paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    Object localObject1 = this.mLayout;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("RecyclerView has no LayoutManager");
      String str = exceptionLabel();
      localObject2 = str;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return this.mLayout.generateLayoutParams(paramLayoutParams);
  }
  
  public RecyclerView.Adapter getAdapter()
  {
    return this.mAdapter;
  }
  
  int getAdapterPositionFor(RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool = paramViewHolder.hasAnyOfTheFlags(524);
    if (!bool)
    {
      bool = paramViewHolder.isBound();
      if (bool) {
        break label25;
      }
    }
    label25:
    AdapterHelper localAdapterHelper;
    int j;
    for (int i = -1;; i = localAdapterHelper.applyPendingUpdatesToPosition(j))
    {
      return i;
      localAdapterHelper = this.mAdapterHelper;
      j = paramViewHolder.mPosition;
    }
  }
  
  public int getBaseline()
  {
    RecyclerView.LayoutManager localLayoutManager = this.mLayout;
    if (localLayoutManager != null) {
      localLayoutManager = this.mLayout;
    }
    for (int i = localLayoutManager.getBaseline();; i = super.getBaseline()) {
      return i;
    }
  }
  
  long getChangedHolderKey(RecyclerView.ViewHolder paramViewHolder)
  {
    RecyclerView.Adapter localAdapter = this.mAdapter;
    boolean bool = localAdapter.hasStableIds();
    if (bool) {}
    int i;
    for (long l = paramViewHolder.getItemId();; l = i)
    {
      return l;
      i = paramViewHolder.mPosition;
    }
  }
  
  public int getChildAdapterPosition(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = getChildViewHolderInt(paramView);
    if (localViewHolder != null) {}
    for (int i = localViewHolder.getAdapterPosition();; i = -1) {
      return i;
    }
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    RecyclerView.ChildDrawingOrderCallback localChildDrawingOrderCallback = this.mChildDrawingOrderCallback;
    if (localChildDrawingOrderCallback == null) {}
    for (int i = super.getChildDrawingOrder(paramInt1, paramInt2);; i = localChildDrawingOrderCallback.onGetChildDrawingOrder(paramInt1, paramInt2))
    {
      return i;
      localChildDrawingOrderCallback = this.mChildDrawingOrderCallback;
    }
  }
  
  public long getChildItemId(View paramView)
  {
    long l = -1;
    Object localObject = this.mAdapter;
    if (localObject != null)
    {
      localObject = this.mAdapter;
      boolean bool = ((RecyclerView.Adapter)localObject).hasStableIds();
      if (bool) {
        break label34;
      }
    }
    for (;;)
    {
      return l;
      label34:
      localObject = getChildViewHolderInt(paramView);
      if (localObject != null) {
        l = ((RecyclerView.ViewHolder)localObject).getItemId();
      }
    }
  }
  
  public int getChildLayoutPosition(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = getChildViewHolderInt(paramView);
    if (localViewHolder != null) {}
    for (int i = localViewHolder.getLayoutPosition();; i = -1) {
      return i;
    }
  }
  
  public int getChildPosition(View paramView)
  {
    return getChildAdapterPosition(paramView);
  }
  
  public RecyclerView.ViewHolder getChildViewHolder(View paramView)
  {
    Object localObject1 = paramView.getParent();
    if ((localObject1 != null) && (localObject1 != this))
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "View " + paramView + " is not a direct child of " + this;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return getChildViewHolderInt(paramView);
  }
  
  public boolean getClipToPadding()
  {
    return this.mClipToPadding;
  }
  
  public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate()
  {
    return this.mAccessibilityDelegate;
  }
  
  public void getDecoratedBoundsWithMargins(View paramView, Rect paramRect)
  {
    getDecoratedBoundsWithMarginsInt(paramView, paramRect);
  }
  
  public RecyclerView.EdgeEffectFactory getEdgeEffectFactory()
  {
    return this.mEdgeEffectFactory;
  }
  
  public RecyclerView.ItemAnimator getItemAnimator()
  {
    return this.mItemAnimator;
  }
  
  Rect getItemDecorInsetsForChild(View paramView)
  {
    Object localObject1 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    boolean bool = ((RecyclerView.LayoutParams)localObject1).mInsetsDirty;
    if (!bool) {
      localObject1 = ((RecyclerView.LayoutParams)localObject1).mDecorInsets;
    }
    for (;;)
    {
      return (Rect)localObject1;
      Object localObject2 = this.mState;
      bool = ((RecyclerView.State)localObject2).isPreLayout();
      if (bool)
      {
        bool = ((RecyclerView.LayoutParams)localObject1).isItemChanged();
        if (!bool)
        {
          bool = ((RecyclerView.LayoutParams)localObject1).isViewInvalid();
          if (!bool) {}
        }
        else
        {
          localObject1 = ((RecyclerView.LayoutParams)localObject1).mDecorInsets;
          continue;
        }
      }
      Rect localRect1 = ((RecyclerView.LayoutParams)localObject1).mDecorInsets;
      localRect1.set(0, 0, 0, 0);
      localObject2 = this.mItemDecorations;
      int j = ((ArrayList)localObject2).size();
      int i;
      for (int k = 0; k < j; k = i)
      {
        this.mTempRect.set(0, 0, 0, 0);
        localObject2 = (RecyclerView.ItemDecoration)this.mItemDecorations.get(k);
        Rect localRect2 = this.mTempRect;
        RecyclerView.State localState = this.mState;
        ((RecyclerView.ItemDecoration)localObject2).getItemOffsets(localRect2, paramView, this, localState);
        i = localRect1.left;
        int m = this.mTempRect.left;
        i += m;
        localRect1.left = i;
        i = localRect1.top;
        m = this.mTempRect.top;
        i += m;
        localRect1.top = i;
        i = localRect1.right;
        m = this.mTempRect.right;
        i += m;
        localRect1.right = i;
        i = localRect1.bottom;
        localRect2 = this.mTempRect;
        m = localRect2.bottom;
        i += m;
        localRect1.bottom = i;
        i = k + 1;
      }
      ((RecyclerView.LayoutParams)localObject1).mInsetsDirty = false;
      localObject1 = localRect1;
    }
  }
  
  public RecyclerView.ItemDecoration getItemDecorationAt(int paramInt)
  {
    int i = getItemDecorationCount();
    if ((paramInt < 0) || (paramInt >= i))
    {
      IndexOutOfBoundsException localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = paramInt + " is an invalid index for size " + i;
      localIndexOutOfBoundsException.<init>(str);
      throw localIndexOutOfBoundsException;
    }
    return (RecyclerView.ItemDecoration)this.mItemDecorations.get(paramInt);
  }
  
  public int getItemDecorationCount()
  {
    return this.mItemDecorations.size();
  }
  
  public RecyclerView.LayoutManager getLayoutManager()
  {
    return this.mLayout;
  }
  
  public int getMaxFlingVelocity()
  {
    return this.mMaxFlingVelocity;
  }
  
  public int getMinFlingVelocity()
  {
    return this.mMinFlingVelocity;
  }
  
  long getNanoTime()
  {
    boolean bool = ALLOW_THREAD_GAP_WORK;
    if (bool) {}
    for (long l = System.nanoTime();; l = 0L) {
      return l;
    }
  }
  
  public RecyclerView.OnFlingListener getOnFlingListener()
  {
    return this.mOnFlingListener;
  }
  
  public boolean getPreserveFocusAfterLayout()
  {
    return this.mPreserveFocusAfterLayout;
  }
  
  public RecyclerView.RecycledViewPool getRecycledViewPool()
  {
    return this.mRecycler.getRecycledViewPool();
  }
  
  public int getScrollState()
  {
    return this.mScrollState;
  }
  
  public boolean hasFixedSize()
  {
    return this.mHasFixedSize;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return getScrollingChildHelper().b();
  }
  
  public boolean hasNestedScrollingParent(int paramInt)
  {
    return getScrollingChildHelper().a(paramInt);
  }
  
  public boolean hasPendingAdapterUpdates()
  {
    boolean bool = this.mFirstLayoutComplete;
    AdapterHelper localAdapterHelper;
    if (bool)
    {
      bool = this.mDataSetHasChangedAfterLayout;
      if (!bool)
      {
        localAdapterHelper = this.mAdapterHelper;
        bool = localAdapterHelper.hasPendingUpdates();
        if (!bool) {
          break label36;
        }
      }
    }
    bool = true;
    for (;;)
    {
      return bool;
      label36:
      bool = false;
      localAdapterHelper = null;
    }
  }
  
  void initAdapterManager()
  {
    AdapterHelper localAdapterHelper = new android/support/v7/widget/AdapterHelper;
    RecyclerView.6 local6 = new android/support/v7/widget/RecyclerView$6;
    local6.<init>(this);
    localAdapterHelper.<init>(local6);
    this.mAdapterHelper = localAdapterHelper;
  }
  
  void initFastScroller(StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2)
  {
    if ((paramStateListDrawable1 == null) || (paramDrawable1 == null) || (paramStateListDrawable2 == null) || (paramDrawable2 == null))
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Trying to set fast scroller without both required drawables.");
      localObject3 = exceptionLabel();
      localObject2 = (String)localObject3;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = getContext().getResources();
    Object localObject1 = new android/support/v7/widget/FastScroller;
    int i = R.dimen.fastscroll_default_thickness;
    int j = ((Resources)localObject2).getDimensionPixelSize(i);
    i = R.dimen.fastscroll_minimum_range;
    int k = ((Resources)localObject2).getDimensionPixelSize(i);
    i = R.dimen.fastscroll_margin;
    int m = ((Resources)localObject2).getDimensionPixelOffset(i);
    localObject2 = this;
    Object localObject3 = paramStateListDrawable1;
    ((FastScroller)localObject1).<init>(this, paramStateListDrawable1, paramDrawable1, paramStateListDrawable2, paramDrawable2, j, k, m);
  }
  
  void invalidateGlows()
  {
    this.mBottomGlow = null;
    this.mTopGlow = null;
    this.mRightGlow = null;
    this.mLeftGlow = null;
  }
  
  public void invalidateItemDecorations()
  {
    Object localObject = this.mItemDecorations;
    int i = ((ArrayList)localObject).size();
    if (i == 0) {}
    for (;;)
    {
      return;
      localObject = this.mLayout;
      if (localObject != null)
      {
        localObject = this.mLayout;
        String str = "Cannot invalidate item decorations during a scroll or layout";
        ((RecyclerView.LayoutManager)localObject).assertNotInLayoutOrScroll(str);
      }
      markItemDecorInsetsDirty();
      requestLayout();
    }
  }
  
  boolean isAccessibilityEnabled()
  {
    AccessibilityManager localAccessibilityManager = this.mAccessibilityManager;
    boolean bool;
    if (localAccessibilityManager != null)
    {
      localAccessibilityManager = this.mAccessibilityManager;
      bool = localAccessibilityManager.isEnabled();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAccessibilityManager = null;
    }
  }
  
  public boolean isAnimating()
  {
    RecyclerView.ItemAnimator localItemAnimator = this.mItemAnimator;
    boolean bool;
    if (localItemAnimator != null)
    {
      localItemAnimator = this.mItemAnimator;
      bool = localItemAnimator.isRunning();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localItemAnimator = null;
    }
  }
  
  public boolean isAttachedToWindow()
  {
    return this.mIsAttached;
  }
  
  public boolean isComputingLayout()
  {
    int i = this.mLayoutOrScrollCounter;
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isLayoutFrozen()
  {
    return this.mLayoutFrozen;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return getScrollingChildHelper().a();
  }
  
  void jumpToPositionForSmoothScroller(int paramInt)
  {
    RecyclerView.LayoutManager localLayoutManager = this.mLayout;
    if (localLayoutManager == null) {}
    for (;;)
    {
      return;
      localLayoutManager = this.mLayout;
      localLayoutManager.scrollToPosition(paramInt);
      awakenScrollBars();
    }
  }
  
  void markItemDecorInsetsDirty()
  {
    int i = this.mChildHelper.getUnfilteredChildCount();
    int j = 0;
    RecyclerView.LayoutParams localLayoutParams = null;
    for (int k = 0; k < i; k = j)
    {
      localLayoutParams = (RecyclerView.LayoutParams)this.mChildHelper.getUnfilteredChildAt(k).getLayoutParams();
      boolean bool = true;
      localLayoutParams.mInsetsDirty = bool;
      j = k + 1;
    }
    this.mRecycler.markItemDecorInsetsDirty();
  }
  
  void markKnownViewsInvalid()
  {
    int i = this.mChildHelper.getUnfilteredChildCount();
    int j = 0;
    while (j < i)
    {
      RecyclerView.ViewHolder localViewHolder = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(j));
      if (localViewHolder != null)
      {
        boolean bool = localViewHolder.shouldIgnore();
        if (!bool)
        {
          int k = 6;
          localViewHolder.addFlags(k);
        }
      }
      j += 1;
    }
    markItemDecorInsetsDirty();
    this.mRecycler.markKnownViewsInvalid();
  }
  
  public void offsetChildrenHorizontal(int paramInt)
  {
    int i = this.mChildHelper.getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = this.mChildHelper.getChildAt(j);
      localView.offsetLeftAndRight(paramInt);
      j += 1;
    }
  }
  
  public void offsetChildrenVertical(int paramInt)
  {
    int i = this.mChildHelper.getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = this.mChildHelper.getChildAt(j);
      localView.offsetTopAndBottom(paramInt);
      j += 1;
    }
  }
  
  void offsetPositionRecordsForInsert(int paramInt1, int paramInt2)
  {
    int i = this.mChildHelper.getUnfilteredChildCount();
    int j = 0;
    while (j < i)
    {
      Object localObject = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(j));
      if (localObject != null)
      {
        boolean bool = ((RecyclerView.ViewHolder)localObject).shouldIgnore();
        if (!bool)
        {
          int k = ((RecyclerView.ViewHolder)localObject).mPosition;
          if (k >= paramInt1)
          {
            ((RecyclerView.ViewHolder)localObject).offsetPosition(paramInt2, false);
            localObject = this.mState;
            k = 1;
            ((RecyclerView.State)localObject).mStructureChanged = k;
          }
        }
      }
      j += 1;
    }
    this.mRecycler.offsetPositionRecordsForInsert(paramInt1, paramInt2);
    requestLayout();
  }
  
  void offsetPositionRecordsForMove(int paramInt1, int paramInt2)
  {
    int i = 1;
    ChildHelper localChildHelper = this.mChildHelper;
    int j = localChildHelper.getUnfilteredChildCount();
    int k;
    int m;
    if (paramInt1 < paramInt2)
    {
      k = -1;
      m = paramInt2;
    }
    Object localObject;
    for (int n = paramInt1;; n = paramInt2)
    {
      int i1 = 0;
      for (;;)
      {
        if (i1 >= j) {
          break label159;
        }
        localObject = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i1));
        if (localObject != null)
        {
          i2 = ((RecyclerView.ViewHolder)localObject).mPosition;
          if (i2 >= n)
          {
            i2 = ((RecyclerView.ViewHolder)localObject).mPosition;
            if (i2 <= m) {
              break;
            }
          }
        }
        i1 += 1;
      }
      k = i;
      m = paramInt1;
    }
    int i2 = ((RecyclerView.ViewHolder)localObject).mPosition;
    if (i2 == paramInt1)
    {
      i2 = paramInt2 - paramInt1;
      ((RecyclerView.ViewHolder)localObject).offsetPosition(i2, false);
    }
    for (;;)
    {
      localObject = this.mState;
      ((RecyclerView.State)localObject).mStructureChanged = i;
      break;
      ((RecyclerView.ViewHolder)localObject).offsetPosition(k, false);
    }
    label159:
    this.mRecycler.offsetPositionRecordsForMove(paramInt1, paramInt2);
    requestLayout();
  }
  
  void offsetPositionRecordsForRemove(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool1 = true;
    int i = paramInt1 + paramInt2;
    int j = this.mChildHelper.getUnfilteredChildCount();
    int k = 0;
    if (k < j)
    {
      Object localObject = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(k));
      int m;
      if (localObject != null)
      {
        boolean bool2 = ((RecyclerView.ViewHolder)localObject).shouldIgnore();
        if (!bool2)
        {
          m = ((RecyclerView.ViewHolder)localObject).mPosition;
          if (m < i) {
            break label106;
          }
          m = -paramInt2;
          ((RecyclerView.ViewHolder)localObject).offsetPosition(m, paramBoolean);
          localObject = this.mState;
          ((RecyclerView.State)localObject).mStructureChanged = bool1;
        }
      }
      for (;;)
      {
        k += 1;
        break;
        label106:
        m = ((RecyclerView.ViewHolder)localObject).mPosition;
        if (m >= paramInt1)
        {
          m = paramInt1 + -1;
          int n = -paramInt2;
          ((RecyclerView.ViewHolder)localObject).flagRemovedAndOffsetPosition(m, n, paramBoolean);
          localObject = this.mState;
          ((RecyclerView.State)localObject).mStructureChanged = bool1;
        }
      }
    }
    this.mRecycler.offsetPositionRecordsForRemove(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }
  
  protected void onAttachedToWindow()
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    int i = 0;
    float f2 = 0.0F;
    GapWorker localGapWorker = null;
    super.onAttachedToWindow();
    this.mLayoutOrScrollCounter = 0;
    this.mIsAttached = bool1;
    boolean bool2 = this.mFirstLayoutComplete;
    Object localObject;
    float f3;
    if (bool2)
    {
      bool2 = isLayoutRequested();
      if (!bool2)
      {
        this.mFirstLayoutComplete = bool1;
        localObject = this.mLayout;
        if (localObject != null)
        {
          localObject = this.mLayout;
          ((RecyclerView.LayoutManager)localObject).dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        bool1 = ALLOW_THREAD_GAP_WORK;
        if (bool1)
        {
          localObject = (GapWorker)GapWorker.sGapWorker.get();
          this.mGapWorker = ((GapWorker)localObject);
          localObject = this.mGapWorker;
          if (localObject == null)
          {
            localObject = new android/support/v7/widget/GapWorker;
            ((GapWorker)localObject).<init>();
            this.mGapWorker = ((GapWorker)localObject);
            localObject = r.B(this);
            i = 1114636288;
            f2 = 60.0F;
            bool2 = isInEditMode();
            if ((bool2) || (localObject == null)) {
              break label260;
            }
            f1 = ((Display)localObject).getRefreshRate();
            f3 = 30.0F;
            bool2 = f1 < f3;
            if (bool2) {
              break label260;
            }
          }
        }
      }
    }
    for (;;)
    {
      localGapWorker = this.mGapWorker;
      int j = 1315859240;
      f3 = 1.0E9F;
      f1 = f3 / f1;
      long l = f1;
      localGapWorker.mFrameIntervalNs = l;
      localObject = GapWorker.sGapWorker;
      localGapWorker = this.mGapWorker;
      ((ThreadLocal)localObject).set(localGapWorker);
      localObject = this.mGapWorker;
      ((GapWorker)localObject).add(this);
      return;
      bool1 = false;
      localObject = null;
      f1 = 0.0F;
      break;
      label260:
      bool1 = i;
      f1 = f2;
    }
  }
  
  public void onChildAttachedToWindow(View paramView) {}
  
  public void onChildDetachedFromWindow(View paramView) {}
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = this.mItemAnimator;
    if (localObject != null)
    {
      localObject = this.mItemAnimator;
      ((RecyclerView.ItemAnimator)localObject).endAnimations();
    }
    stopScroll();
    boolean bool = false;
    this.mIsAttached = false;
    localObject = this.mLayout;
    if (localObject != null)
    {
      localObject = this.mLayout;
      RecyclerView.Recycler localRecycler = this.mRecycler;
      ((RecyclerView.LayoutManager)localObject).dispatchDetachedFromWindow(this, localRecycler);
    }
    this.mPendingAccessibilityImportanceChange.clear();
    localObject = this.mItemAnimatorRunner;
    removeCallbacks((Runnable)localObject);
    localObject = this.mViewInfoStore;
    ((ViewInfoStore)localObject).onDetach();
    bool = ALLOW_THREAD_GAP_WORK;
    if (bool)
    {
      localObject = this.mGapWorker;
      if (localObject != null)
      {
        this.mGapWorker.remove(this);
        bool = false;
        localObject = null;
        this.mGapWorker = null;
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = this.mItemDecorations.size();
    int j = 0;
    RecyclerView.ItemDecoration localItemDecoration = null;
    for (int k = 0; k < i; k = j)
    {
      localItemDecoration = (RecyclerView.ItemDecoration)this.mItemDecorations.get(k);
      RecyclerView.State localState = this.mState;
      localItemDecoration.onDraw(paramCanvas, this, localState);
      j = k + 1;
    }
  }
  
  void onEnterLayoutOrScroll()
  {
    int i = this.mLayoutOrScrollCounter + 1;
    this.mLayoutOrScrollCounter = i;
  }
  
  void onExitLayoutOrScroll()
  {
    onExitLayoutOrScroll(true);
  }
  
  void onExitLayoutOrScroll(boolean paramBoolean)
  {
    int i = this.mLayoutOrScrollCounter + -1;
    this.mLayoutOrScrollCounter = i;
    i = this.mLayoutOrScrollCounter;
    int j = 1;
    if (i < j)
    {
      i = 0;
      this.mLayoutOrScrollCounter = 0;
      if (paramBoolean)
      {
        dispatchContentChangedIfNecessary();
        dispatchPendingImportantForAccessibilityChanges();
      }
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    RecyclerView.LayoutManager localLayoutManager1 = this.mLayout;
    if (localLayoutManager1 == null) {}
    int m;
    float f2;
    do
    {
      boolean bool2;
      do
      {
        return false;
        bool2 = this.mLayoutFrozen;
      } while (bool2);
      j = paramMotionEvent.getAction();
      m = 8;
      f2 = 1.1E-44F;
    } while (j != m);
    int j = paramMotionEvent.getSource() & 0x2;
    int k;
    float f3;
    label94:
    RecyclerView.LayoutManager localLayoutManager2;
    int n;
    if (j != 0)
    {
      localLayoutManager1 = this.mLayout;
      boolean bool3 = localLayoutManager1.canScrollVertically();
      if (bool3)
      {
        k = 9;
        f3 = -paramMotionEvent.getAxisValue(k);
        localLayoutManager2 = this.mLayout;
        boolean bool4 = localLayoutManager2.canScrollHorizontally();
        if (!bool4) {
          break label203;
        }
        n = 10;
        float f4 = paramMotionEvent.getAxisValue(n);
        f2 = f3;
        f3 = f4;
      }
    }
    for (;;)
    {
      boolean bool6 = f2 < 0.0F;
      if (!bool6)
      {
        bool1 = f3 < 0.0F;
        if (!bool1) {
          break;
        }
      }
      f1 = this.mScaledHorizontalScrollFactor;
      f3 *= f1;
      k = (int)f3;
      f1 = this.mScaledVerticalScrollFactor * f2;
      int i = (int)f1;
      scrollByInternal(k, i, paramMotionEvent);
      break;
      k = 0;
      localLayoutManager1 = null;
      f3 = 0.0F;
      break label94;
      label203:
      f2 = f3;
      k = 0;
      localLayoutManager1 = null;
      f3 = 0.0F;
      continue;
      k = paramMotionEvent.getSource();
      n = 4194304;
      f2 = 5.877472E-39F;
      k &= n;
      boolean bool5;
      if (k != 0)
      {
        k = 26;
        f3 = paramMotionEvent.getAxisValue(k);
        localLayoutManager2 = this.mLayout;
        bool5 = localLayoutManager2.canScrollVertically();
        if (bool5)
        {
          f2 = -f3;
          k = 0;
          localLayoutManager1 = null;
          f3 = 0.0F;
        }
        else
        {
          localLayoutManager2 = this.mLayout;
          bool5 = localLayoutManager2.canScrollHorizontally();
          if (bool5)
          {
            bool5 = false;
            localLayoutManager2 = null;
            f2 = 0.0F;
          }
          else
          {
            k = 0;
            localLayoutManager1 = null;
            f3 = 0.0F;
            bool5 = false;
            localLayoutManager2 = null;
            f2 = 0.0F;
          }
        }
      }
      else
      {
        k = 0;
        localLayoutManager1 = null;
        f3 = 0.0F;
        bool5 = false;
        localLayoutManager2 = null;
        f2 = 0.0F;
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1056964608;
    float f1 = 0.5F;
    int j = 1;
    float f2 = Float.MIN_VALUE;
    boolean bool1 = false;
    boolean bool2 = this.mLayoutFrozen;
    if (bool2) {}
    Object localObject1;
    Object localObject2;
    boolean bool3;
    label184:
    int k;
    for (;;)
    {
      return bool1;
      bool2 = dispatchOnItemTouchIntercept(paramMotionEvent);
      if (bool2)
      {
        cancelTouch();
        bool1 = j;
      }
      else
      {
        localObject1 = this.mLayout;
        if (localObject1 != null)
        {
          localObject1 = this.mLayout;
          bool2 = ((RecyclerView.LayoutManager)localObject1).canScrollHorizontally();
          localObject2 = this.mLayout;
          bool3 = ((RecyclerView.LayoutManager)localObject2).canScrollVertically();
          localObject3 = this.mVelocityTracker;
          if (localObject3 == null)
          {
            localObject3 = VelocityTracker.obtain();
            this.mVelocityTracker = ((VelocityTracker)localObject3);
          }
          localObject3 = this.mVelocityTracker;
          ((VelocityTracker)localObject3).addMovement(paramMotionEvent);
          int i2 = paramMotionEvent.getActionMasked();
          i4 = paramMotionEvent.getActionIndex();
          switch (i2)
          {
          case 4: 
          default: 
            k = this.mScrollState;
            if (k != j) {
              break label726;
            }
            k = j;
            f3 = f2;
            label205:
            bool1 = k;
          }
        }
      }
    }
    boolean bool4 = this.mIgnoreMotionEventTillDown;
    if (bool4) {
      this.mIgnoreMotionEventTillDown = false;
    }
    int i3 = paramMotionEvent.getPointerId(0);
    this.mScrollPointerId = i3;
    i3 = (int)(paramMotionEvent.getX() + f1);
    this.mLastTouchX = i3;
    this.mInitialTouchX = i3;
    float f4 = paramMotionEvent.getY() + f1;
    i3 = (int)f4;
    this.mLastTouchY = i3;
    this.mInitialTouchY = i3;
    i3 = this.mScrollState;
    int i4 = 2;
    float f5 = 2.8E-45F;
    if (i3 == i4)
    {
      localObject3 = getParent();
      ((ViewParent)localObject3).requestDisallowInterceptTouchEvent(j);
      setScrollState(j);
    }
    Object localObject3 = this.mNestedOffsets;
    int[] arrayOfInt = this.mNestedOffsets;
    arrayOfInt[j] = 0;
    localObject3[0] = 0;
    if (k != 0) {
      k = j;
    }
    for (float f3 = f2;; f3 = 0.0F)
    {
      if (bool3) {
        k |= 0x2;
      }
      startNestedScroll(m, 0);
      break label184;
      int m = paramMotionEvent.getPointerId(i4);
      this.mScrollPointerId = m;
      m = (int)(paramMotionEvent.getX(i4) + f1);
      this.mLastTouchX = m;
      this.mInitialTouchX = m;
      f3 = paramMotionEvent.getY(i4) + f1;
      m = (int)f3;
      this.mLastTouchY = m;
      this.mInitialTouchY = m;
      break label184;
      i3 = this.mScrollPointerId;
      i3 = paramMotionEvent.findPointerIndex(i3);
      int i1;
      if (i3 < 0)
      {
        localObject1 = "RecyclerView";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Error processing scroll; pointer index for id ");
        i1 = this.mScrollPointerId;
        localObject4 = ((StringBuilder)localObject4).append(i1);
        localObject2 = " not found. Did any MotionEvents get skipped?";
        localObject4 = (String)localObject2;
        Log.e((String)localObject1, (String)localObject4);
        break;
      }
      f5 = paramMotionEvent.getX(i3) + f1;
      i4 = (int)f5;
      f4 = paramMotionEvent.getY(i3) + f1;
      i3 = (int)f4;
      i = this.mScrollState;
      if (i == j) {
        break label184;
      }
      i = this.mInitialTouchX;
      i = i4 - i;
      int i6 = this.mInitialTouchY;
      i6 = i3 - i6;
      if (m != 0)
      {
        m = Math.abs(i);
        i = this.mTouchSlop;
        if (m > i)
        {
          this.mLastTouchX = i4;
          m = j;
        }
      }
      for (f3 = f2;; f3 = 0.0F)
      {
        if (i1 != 0)
        {
          i1 = Math.abs(i6);
          int i5 = this.mTouchSlop;
          if (i1 > i5)
          {
            this.mLastTouchY = i3;
            m = j;
            f3 = f2;
          }
        }
        if (m == 0) {
          break;
        }
        setScrollState(j);
        break;
        onPointerUp(paramMotionEvent);
        break;
        localObject1 = this.mVelocityTracker;
        ((VelocityTracker)localObject1).clear();
        stopNestedScroll(0);
        break;
        cancelTouch();
        break;
        label726:
        n = 0;
        localObject1 = null;
        f3 = 0.0F;
        break label205;
        n = 0;
        localObject1 = null;
      }
      int n = 0;
      localObject1 = null;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    d.a("RV OnLayout");
    dispatchLayout();
    d.a();
    this.mFirstLayoutComplete = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    int j = 1;
    int m = 0;
    Object localObject1 = null;
    Object localObject2 = this.mLayout;
    if (localObject2 == null) {
      defaultOnMeasure(paramInt1, paramInt2);
    }
    Object localObject3;
    for (;;)
    {
      return;
      localObject2 = this.mLayout;
      boolean bool2 = ((RecyclerView.LayoutManager)localObject2).isAutoMeasureEnabled();
      if (bool2)
      {
        int i1 = View.MeasureSpec.getMode(paramInt1);
        int i3 = View.MeasureSpec.getMode(paramInt2);
        RecyclerView.LayoutManager localLayoutManager = this.mLayout;
        RecyclerView.Recycler localRecycler = this.mRecycler;
        RecyclerView.State localState1 = this.mState;
        localLayoutManager.onMeasure(localRecycler, localState1, paramInt1, paramInt2);
        if ((i1 == i) && (i3 == i)) {
          m = j;
        }
        if (m == 0)
        {
          localObject1 = this.mAdapter;
          if (localObject1 != null)
          {
            localObject1 = this.mState;
            m = ((RecyclerView.State)localObject1).mLayoutStep;
            if (m == j) {
              dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(paramInt1, paramInt2);
            this.mState.mIsMeasuring = j;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(paramInt1, paramInt2);
            localObject1 = this.mLayout;
            boolean bool1 = ((RecyclerView.LayoutManager)localObject1).shouldMeasureTwice();
            if (bool1)
            {
              localObject1 = this.mLayout;
              i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), i);
              i3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), i);
              ((RecyclerView.LayoutManager)localObject1).setMeasureSpecs(i1, i3);
              this.mState.mIsMeasuring = j;
              dispatchLayoutStep2();
              localObject1 = this.mLayout;
              ((RecyclerView.LayoutManager)localObject1).setMeasuredDimensionFromChildren(paramInt1, paramInt2);
            }
          }
        }
      }
      else
      {
        bool3 = this.mHasFixedSize;
        if (!bool3) {
          break;
        }
        localObject1 = this.mLayout;
        localObject3 = this.mRecycler;
        localObject2 = this.mState;
        ((RecyclerView.LayoutManager)localObject1).onMeasure((RecyclerView.Recycler)localObject3, (RecyclerView.State)localObject2, paramInt1, paramInt2);
      }
    }
    boolean bool3 = this.mAdapterUpdateDuringMeasure;
    label360:
    label370:
    int i2;
    if (bool3)
    {
      startInterceptRequestLayout();
      onEnterLayoutOrScroll();
      processAdapterUpdatesAndSetAnimationFlags();
      onExitLayoutOrScroll();
      localObject2 = this.mState;
      bool3 = ((RecyclerView.State)localObject2).mRunPredictiveAnimations;
      if (bool3)
      {
        localObject2 = this.mState;
        ((RecyclerView.State)localObject2).mInPreLayout = j;
        this.mAdapterUpdateDuringMeasure = false;
        stopInterceptRequestLayout(false);
        localObject3 = this.mAdapter;
        if (localObject3 == null) {
          break label523;
        }
        localObject3 = this.mState;
        localObject2 = this.mAdapter;
        i2 = ((RecyclerView.Adapter)localObject2).getItemCount();
      }
    }
    for (((RecyclerView.State)localObject3).mItemCount = i2;; ((RecyclerView.State)localObject3).mItemCount = 0)
    {
      startInterceptRequestLayout();
      localObject3 = this.mLayout;
      localObject2 = this.mRecycler;
      RecyclerView.State localState2 = this.mState;
      ((RecyclerView.LayoutManager)localObject3).onMeasure((RecyclerView.Recycler)localObject2, localState2, paramInt1, paramInt2);
      stopInterceptRequestLayout(false);
      localObject3 = this.mState;
      ((RecyclerView.State)localObject3).mInPreLayout = false;
      break;
      this.mAdapterHelper.consumeUpdatesInOnePass();
      localObject3 = this.mState;
      ((RecyclerView.State)localObject3).mInPreLayout = false;
      break label360;
      localObject3 = this.mState;
      j = ((RecyclerView.State)localObject3).mRunPredictiveAnimations;
      if (j == 0) {
        break label370;
      }
      int n = getMeasuredWidth();
      int k = getMeasuredHeight();
      setMeasuredDimension(n, k);
      break;
      label523:
      localObject3 = this.mState;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool = isComputingLayout();
    if (bool) {}
    for (bool = false;; bool = super.onRequestFocusInDescendants(paramInt, paramRect)) {
      return bool;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof RecyclerView.SavedState;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (RecyclerView.SavedState)paramParcelable;
      this.mPendingSavedState = paramParcelable;
      Object localObject = this.mPendingSavedState.getSuperState();
      super.onRestoreInstanceState((Parcelable)localObject);
      localObject = this.mLayout;
      if (localObject != null)
      {
        localObject = this.mPendingSavedState.mLayoutState;
        if (localObject != null)
        {
          localObject = this.mLayout;
          Parcelable localParcelable = this.mPendingSavedState.mLayoutState;
          ((RecyclerView.LayoutManager)localObject).onRestoreInstanceState(localParcelable);
        }
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    RecyclerView.SavedState localSavedState = new android/support/v7/widget/RecyclerView$SavedState;
    Object localObject = super.onSaveInstanceState();
    localSavedState.<init>((Parcelable)localObject);
    localObject = this.mPendingSavedState;
    if (localObject != null)
    {
      localObject = this.mPendingSavedState;
      localSavedState.copyFrom((RecyclerView.SavedState)localObject);
    }
    for (;;)
    {
      return localSavedState;
      localObject = this.mLayout;
      if (localObject != null)
      {
        localObject = this.mLayout.onSaveInstanceState();
        localSavedState.mLayoutState = ((Parcelable)localObject);
      }
      else
      {
        localObject = null;
        localSavedState.mLayoutState = null;
      }
    }
  }
  
  public void onScrollStateChanged(int paramInt) {}
  
  public void onScrolled(int paramInt1, int paramInt2) {}
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      invalidateGlows();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int k = 1056964608;
    float f2 = 0.5F;
    int m = 1;
    float f3 = Float.MIN_VALUE;
    boolean bool2 = false;
    boolean bool3 = this.mLayoutFrozen;
    if (!bool3)
    {
      bool3 = this.mIgnoreMotionEventTillDown;
      if (!bool3) {
        break label52;
      }
    }
    label52:
    Object localObject2;
    boolean bool7;
    boolean bool8;
    MotionEvent localMotionEvent;
    int i5;
    int[] arrayOfInt1;
    int[] arrayOfInt2;
    int i8;
    float f4;
    int i10;
    for (;;)
    {
      return bool2;
      bool3 = dispatchOnItemTouch(paramMotionEvent);
      if (bool3)
      {
        cancelTouch();
        bool2 = m;
      }
      else
      {
        localObject2 = this.mLayout;
        if (localObject2 != null)
        {
          bool7 = this.mLayout.canScrollHorizontally();
          bool8 = this.mLayout.canScrollVertically();
          localObject2 = this.mVelocityTracker;
          if (localObject2 == null)
          {
            localObject2 = VelocityTracker.obtain();
            this.mVelocityTracker = ((VelocityTracker)localObject2);
          }
          localMotionEvent = MotionEvent.obtain(paramMotionEvent);
          n = paramMotionEvent.getActionMasked();
          i5 = paramMotionEvent.getActionIndex();
          if (n == 0)
          {
            arrayOfInt1 = this.mNestedOffsets;
            arrayOfInt2 = this.mNestedOffsets;
            arrayOfInt2[m] = 0;
            arrayOfInt1[0] = 0;
          }
          arrayOfInt1 = this.mNestedOffsets;
          i8 = arrayOfInt1[0];
          f4 = i8;
          arrayOfInt2 = this.mNestedOffsets;
          i10 = arrayOfInt2[m];
          float f5 = i10;
          localMotionEvent.offsetLocation(f4, f5);
          switch (n)
          {
          case 4: 
          default: 
            label260:
            if (!bool2)
            {
              localObject2 = this.mVelocityTracker;
              ((VelocityTracker)localObject2).addMovement(localMotionEvent);
            }
            localMotionEvent.recycle();
            bool2 = m;
          }
        }
      }
    }
    int n = paramMotionEvent.getPointerId(0);
    this.mScrollPointerId = n;
    n = (int)(paramMotionEvent.getX() + f2);
    this.mLastTouchX = n;
    this.mInitialTouchX = n;
    float f6 = paramMotionEvent.getY() + f2;
    n = (int)f6;
    this.mLastTouchY = n;
    this.mInitialTouchY = n;
    if (bool7) {
      n = m;
    }
    for (f6 = f3;; f6 = 0.0F)
    {
      if (bool8) {
        n |= 0x2;
      }
      startNestedScroll(n, 0);
      break label260;
      n = paramMotionEvent.getPointerId(i5);
      this.mScrollPointerId = n;
      n = (int)(paramMotionEvent.getX(i5) + f2);
      this.mLastTouchX = n;
      this.mInitialTouchX = n;
      f6 = paramMotionEvent.getY(i5) + f2;
      n = (int)f6;
      this.mLastTouchY = n;
      this.mInitialTouchY = n;
      break label260;
      n = this.mScrollPointerId;
      n = paramMotionEvent.findPointerIndex(n);
      String str;
      if (n < 0)
      {
        localObject2 = "RecyclerView";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Error processing scroll; pointer index for id ");
        i5 = this.mScrollPointerId;
        localObject1 = ((StringBuilder)localObject1).append(i5);
        str = " not found. Did any MotionEvents get skipped?";
        localObject1 = str;
        Log.e((String)localObject2, (String)localObject1);
        break;
      }
      f1 = paramMotionEvent.getX(n) + f2;
      int i13 = (int)f1;
      f6 = paramMotionEvent.getY(n) + f2;
      k = (int)f6;
      i = this.mLastTouchX - i13;
      i5 = this.mLastTouchY - k;
      arrayOfInt1 = this.mScrollConsumed;
      arrayOfInt2 = this.mScrollOffset;
      localObject2 = this;
      boolean bool4 = dispatchNestedPreScroll(i, i5, arrayOfInt1, arrayOfInt2, 0);
      int i6;
      if (bool4)
      {
        i1 = this.mScrollConsumed[0];
        i -= i1;
        i1 = this.mScrollConsumed[m];
        i5 -= i1;
        i1 = this.mScrollOffset[0];
        f6 = i1;
        arrayOfInt1 = this.mScrollOffset;
        f4 = arrayOfInt1[m];
        localMotionEvent.offsetLocation(f6, f4);
        localObject2 = this.mNestedOffsets;
        i8 = localObject2[0];
        i10 = this.mScrollOffset[0];
        i8 += i10;
        localObject2[0] = i8;
        localObject2 = this.mNestedOffsets;
        i8 = localObject2[m];
        arrayOfInt2 = this.mScrollOffset;
        int i11 = arrayOfInt2[m];
        i8 += i11;
        localObject2[m] = i8;
      }
      int i1 = this.mScrollState;
      int i2;
      if (i1 != m)
      {
        if (!bool7) {
          break label1285;
        }
        i2 = Math.abs(i);
        i8 = this.mTouchSlop;
        if (i2 <= i8) {
          break label1285;
        }
        if (i <= 0) {
          break label1037;
        }
        i2 = this.mTouchSlop;
        i2 = i - i2;
        label813:
        i = i2;
        i2 = m;
      }
      for (f6 = f3;; f6 = 0.0F)
      {
        if (bool8)
        {
          i9 = Math.abs(i6);
          int i12 = this.mTouchSlop;
          if (i9 > i12)
          {
            if (i6 <= 0) {
              break label1048;
            }
            i2 = this.mTouchSlop;
            i2 = i6 - i2;
            label867:
            i6 = i2;
            i2 = m;
            f6 = f3;
          }
        }
        if (i2 != 0) {
          setScrollState(m);
        }
        i2 = this.mScrollState;
        if (i2 != m) {
          break;
        }
        int i3 = this.mScrollOffset[0];
        i3 = i13 - i3;
        this.mLastTouchX = i3;
        localObject2 = this.mScrollOffset;
        i3 = localObject2[m];
        i3 = k - i3;
        this.mLastTouchY = i3;
        if (bool7)
        {
          i9 = i;
          label958:
          if (!bool8) {
            break label1072;
          }
          i3 = i6;
        }
        label1037:
        int i4;
        for (;;)
        {
          boolean bool5 = scrollByInternal(i9, i3, localMotionEvent);
          if (bool5)
          {
            localObject2 = getParent();
            ((ViewParent)localObject2).requestDisallowInterceptTouchEvent(m);
          }
          localObject2 = this.mGapWorker;
          if ((localObject2 == null) || ((i == 0) && (i6 == 0))) {
            break;
          }
          localObject2 = this.mGapWorker;
          ((GapWorker)localObject2).postFromTraversal(this, i, i6);
          break;
          i4 = this.mTouchSlop + i;
          break label813;
          label1048:
          i4 = this.mTouchSlop + i6;
          break label867;
          i9 = 0;
          arrayOfInt1 = null;
          f4 = 0.0F;
          break label958;
          label1072:
          i4 = 0;
          localObject2 = null;
          f6 = 0.0F;
        }
        onPointerUp(paramMotionEvent);
        break;
        this.mVelocityTracker.addMovement(localMotionEvent);
        localObject2 = this.mVelocityTracker;
        int i7 = 1000;
        float f7 = 1.401E-42F;
        int i9 = this.mMaxFlingVelocity;
        f4 = i9;
        ((VelocityTracker)localObject2).computeCurrentVelocity(i7, f4);
        if (bool7)
        {
          localObject2 = this.mVelocityTracker;
          i7 = this.mScrollPointerId;
          f6 = -((VelocityTracker)localObject2).getXVelocity(i7);
          f7 = f6;
          label1168:
          if (!bool8) {
            break label1266;
          }
          localObject2 = this.mVelocityTracker;
          i9 = this.mScrollPointerId;
        }
        for (f6 = -((VelocityTracker)localObject2).getYVelocity(i9);; f6 = 0.0F)
        {
          boolean bool9 = f7 < 0.0F;
          if (!bool9)
          {
            boolean bool1 = f6 < 0.0F;
            if (!bool1) {}
          }
          else
          {
            int j = (int)f7;
            i4 = (int)f6;
            bool6 = fling(j, i4);
            if (bool6) {
              break label1243;
            }
          }
          setScrollState(0);
          label1243:
          resetTouch();
          bool2 = m;
          break;
          i7 = 0;
          str = null;
          f7 = 0.0F;
          break label1168;
          label1266:
          bool6 = false;
          localObject2 = null;
        }
        cancelTouch();
        break;
        label1285:
        bool6 = false;
        localObject2 = null;
      }
      boolean bool6 = false;
      localObject2 = null;
    }
  }
  
  void postAnimationRunner()
  {
    boolean bool = this.mPostedAnimatorRunner;
    if (!bool)
    {
      bool = this.mIsAttached;
      if (bool)
      {
        Runnable localRunnable = this.mItemAnimatorRunner;
        r.a(this, localRunnable);
        bool = true;
        this.mPostedAnimatorRunner = bool;
      }
    }
  }
  
  void processDataSetCompletelyChanged(boolean paramBoolean)
  {
    boolean bool = this.mDispatchItemsChangedEvent | paramBoolean;
    this.mDispatchItemsChangedEvent = bool;
    this.mDataSetHasChangedAfterLayout = true;
    markKnownViewsInvalid();
  }
  
  void recordAnimationInfoIfBouncedHiddenView(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    int i = 8192;
    paramViewHolder.setFlags(0, i);
    RecyclerView.State localState = this.mState;
    boolean bool = localState.mTrackOldChangeHolders;
    if (bool)
    {
      bool = paramViewHolder.isUpdated();
      if (bool)
      {
        bool = paramViewHolder.isRemoved();
        if (!bool)
        {
          bool = paramViewHolder.shouldIgnore();
          if (!bool)
          {
            long l = getChangedHolderKey(paramViewHolder);
            ViewInfoStore localViewInfoStore = this.mViewInfoStore;
            localViewInfoStore.addToOldChangeHolders(l, paramViewHolder);
          }
        }
      }
    }
    this.mViewInfoStore.addToPreLayout(paramViewHolder, paramItemHolderInfo);
  }
  
  void removeAndRecycleViews()
  {
    Object localObject = this.mItemAnimator;
    if (localObject != null)
    {
      localObject = this.mItemAnimator;
      ((RecyclerView.ItemAnimator)localObject).endAnimations();
    }
    localObject = this.mLayout;
    if (localObject != null)
    {
      localObject = this.mLayout;
      RecyclerView.Recycler localRecycler = this.mRecycler;
      ((RecyclerView.LayoutManager)localObject).removeAndRecycleAllViews(localRecycler);
      localObject = this.mLayout;
      localRecycler = this.mRecycler;
      ((RecyclerView.LayoutManager)localObject).removeAndRecycleScrapInt(localRecycler);
    }
    this.mRecycler.clear();
  }
  
  boolean removeAnimatingView(View paramView)
  {
    startInterceptRequestLayout();
    Object localObject = this.mChildHelper;
    boolean bool1 = ((ChildHelper)localObject).removeViewIfHidden(paramView);
    if (bool1)
    {
      localObject = getChildViewHolderInt(paramView);
      this.mRecycler.unscrapView((RecyclerView.ViewHolder)localObject);
      RecyclerView.Recycler localRecycler = this.mRecycler;
      localRecycler.recycleViewHolderInternal((RecyclerView.ViewHolder)localObject);
    }
    boolean bool2;
    if (!bool1) {
      bool2 = true;
    }
    for (;;)
    {
      stopInterceptRequestLayout(bool2);
      return bool1;
      bool2 = false;
      localObject = null;
    }
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    Object localObject1 = getChildViewHolderInt(paramView);
    boolean bool;
    if (localObject1 != null)
    {
      bool = ((RecyclerView.ViewHolder)localObject1).isTmpDetached();
      if (!bool) {
        break label40;
      }
      ((RecyclerView.ViewHolder)localObject1).clearTmpDetachFlag();
    }
    label40:
    do
    {
      paramView.clearAnimation();
      dispatchChildDetached(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
      bool = ((RecyclerView.ViewHolder)localObject1).shouldIgnore();
    } while (bool);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = ((StringBuilder)localObject2).append("Called removeDetachedView with a view which is not flagged as tmp detached.").append(localObject1);
    localObject2 = exceptionLabel();
    localObject1 = (String)localObject2;
    localIllegalArgumentException.<init>((String)localObject1);
    throw localIllegalArgumentException;
  }
  
  public void removeItemDecoration(RecyclerView.ItemDecoration paramItemDecoration)
  {
    Object localObject = this.mLayout;
    if (localObject != null)
    {
      localObject = this.mLayout;
      String str = "Cannot remove item decoration during a scroll  or layout";
      ((RecyclerView.LayoutManager)localObject).assertNotInLayoutOrScroll(str);
    }
    this.mItemDecorations.remove(paramItemDecoration);
    localObject = this.mItemDecorations;
    boolean bool = ((ArrayList)localObject).isEmpty();
    int i;
    if (bool)
    {
      i = getOverScrollMode();
      int k = 2;
      if (i != k) {
        break label82;
      }
      i = 1;
    }
    for (;;)
    {
      setWillNotDraw(i);
      markItemDecorInsetsDirty();
      requestLayout();
      return;
      label82:
      int j = 0;
      localObject = null;
    }
  }
  
  public void removeItemDecorationAt(int paramInt)
  {
    int i = getItemDecorationCount();
    if ((paramInt < 0) || (paramInt >= i))
    {
      IndexOutOfBoundsException localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = paramInt + " is an invalid index for size " + i;
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
    }
    Object localObject = getItemDecorationAt(paramInt);
    removeItemDecoration((RecyclerView.ItemDecoration)localObject);
  }
  
  public void removeOnChildAttachStateChangeListener(RecyclerView.OnChildAttachStateChangeListener paramOnChildAttachStateChangeListener)
  {
    List localList = this.mOnChildAttachStateListeners;
    if (localList == null) {}
    for (;;)
    {
      return;
      localList = this.mOnChildAttachStateListeners;
      localList.remove(paramOnChildAttachStateChangeListener);
    }
  }
  
  public void removeOnItemTouchListener(RecyclerView.OnItemTouchListener paramOnItemTouchListener)
  {
    this.mOnItemTouchListeners.remove(paramOnItemTouchListener);
    RecyclerView.OnItemTouchListener localOnItemTouchListener = this.mActiveOnItemTouchListener;
    if (localOnItemTouchListener == paramOnItemTouchListener)
    {
      localOnItemTouchListener = null;
      this.mActiveOnItemTouchListener = null;
    }
  }
  
  public void removeOnScrollListener(RecyclerView.OnScrollListener paramOnScrollListener)
  {
    List localList = this.mScrollListeners;
    if (localList != null)
    {
      localList = this.mScrollListeners;
      localList.remove(paramOnScrollListener);
    }
  }
  
  void repositionShadowingViews()
  {
    int i = this.mChildHelper.getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = this.mChildHelper.getChildAt(j);
      Object localObject = getChildViewHolder(localView);
      if (localObject != null)
      {
        RecyclerView.ViewHolder localViewHolder = ((RecyclerView.ViewHolder)localObject).mShadowingHolder;
        if (localViewHolder != null)
        {
          localObject = ((RecyclerView.ViewHolder)localObject).mShadowingHolder.itemView;
          int k = localView.getLeft();
          int m = localView.getTop();
          int n = ((View)localObject).getLeft();
          if (k == n)
          {
            n = ((View)localObject).getTop();
            if (m == n) {}
          }
          else
          {
            n = ((View)localObject).getWidth() + k;
            int i1 = ((View)localObject).getHeight() + m;
            ((View)localObject).layout(k, m, n, i1);
          }
        }
      }
      j += 1;
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    RecyclerView.LayoutManager localLayoutManager = this.mLayout;
    RecyclerView.State localState = this.mState;
    boolean bool = localLayoutManager.onRequestChildFocus(this, localState, paramView1, paramView2);
    if ((!bool) && (paramView2 != null)) {
      requestChildOnScreen(paramView1, paramView2);
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return this.mLayout.requestChildRectangleOnScreen(this, paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i = this.mOnItemTouchListeners.size();
    int j = 0;
    RecyclerView.OnItemTouchListener localOnItemTouchListener = null;
    for (int k = 0; k < i; k = j)
    {
      localOnItemTouchListener = (RecyclerView.OnItemTouchListener)this.mOnItemTouchListeners.get(k);
      localOnItemTouchListener.onRequestDisallowInterceptTouchEvent(paramBoolean);
      j = k + 1;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    int i = this.mInterceptRequestLayoutDepth;
    boolean bool;
    if (i == 0)
    {
      bool = this.mLayoutFrozen;
      if (!bool) {
        super.requestLayout();
      }
    }
    for (;;)
    {
      return;
      bool = true;
      this.mLayoutWasDefered = bool;
    }
  }
  
  void saveOldPositions()
  {
    int i = this.mChildHelper.getUnfilteredChildCount();
    int j = 0;
    while (j < i)
    {
      RecyclerView.ViewHolder localViewHolder = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(j));
      boolean bool = localViewHolder.shouldIgnore();
      if (!bool) {
        localViewHolder.saveOldPosition();
      }
      j += 1;
    }
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    String str = null;
    Object localObject = this.mLayout;
    if (localObject == null)
    {
      str = "RecyclerView";
      localObject = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.";
      Log.e(str, (String)localObject);
    }
    boolean bool1;
    boolean bool2;
    do
    {
      do
      {
        return;
        bool1 = this.mLayoutFrozen;
      } while (bool1);
      localObject = this.mLayout;
      bool1 = ((RecyclerView.LayoutManager)localObject).canScrollHorizontally();
      RecyclerView.LayoutManager localLayoutManager = this.mLayout;
      bool2 = localLayoutManager.canScrollVertically();
    } while ((!bool1) && (!bool2));
    if (bool1) {
      label81:
      if (!bool2) {
        break label104;
      }
    }
    for (;;)
    {
      str = null;
      scrollByInternal(paramInt1, paramInt2, null);
      break;
      paramInt1 = 0;
      break label81;
      label104:
      paramInt2 = 0;
    }
  }
  
  boolean scrollByInternal(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    consumePendingUpdateOperations();
    Object localObject1 = this.mAdapter;
    RecyclerView.Recycler localRecycler;
    RecyclerView.State localState;
    int i;
    int j;
    Object localObject2;
    int i1;
    label126:
    int i2;
    if (localObject1 != null)
    {
      startInterceptRequestLayout();
      onEnterLayoutOrScroll();
      d.a("RV Scroll");
      localObject1 = this.mState;
      fillRemainingScrollValues((RecyclerView.State)localObject1);
      if (paramInt1 != 0)
      {
        localObject1 = this.mLayout;
        localRecycler = this.mRecycler;
        localState = this.mState;
        i = ((RecyclerView.LayoutManager)localObject1).scrollHorizontallyBy(paramInt1, localRecycler, localState);
        j = paramInt1 - i;
        if (paramInt2 != 0)
        {
          localObject1 = this.mLayout;
          localRecycler = this.mRecycler;
          localObject2 = this.mState;
          int k = ((RecyclerView.LayoutManager)localObject1).scrollVerticallyBy(paramInt2, localRecycler, (RecyclerView.State)localObject2);
          i1 = paramInt2 - k;
          d.a();
          repositionShadowingViews();
          onExitLayoutOrScroll();
          stopInterceptRequestLayout(false);
          i2 = i1;
          i1 = i;
          i = k;
        }
      }
    }
    for (;;)
    {
      localObject1 = this.mItemDecorations;
      boolean bool3 = ((ArrayList)localObject1).isEmpty();
      if (!bool3) {
        invalidate();
      }
      int[] arrayOfInt1 = this.mScrollOffset;
      localObject1 = this;
      bool3 = dispatchNestedScroll(i1, i, j, i2, arrayOfInt1, 0);
      if (bool3)
      {
        int m = this.mLastTouchX;
        j = this.mScrollOffset[0];
        m -= j;
        this.mLastTouchX = m;
        m = this.mLastTouchY;
        arrayOfInt2 = this.mScrollOffset;
        j = arrayOfInt2[bool1];
        m -= j;
        this.mLastTouchY = m;
        if (paramMotionEvent != null)
        {
          localObject1 = this.mScrollOffset;
          m = localObject1[0];
          f1 = m;
          arrayOfInt2 = this.mScrollOffset;
          j = arrayOfInt2[bool1];
          f2 = j;
          paramMotionEvent.offsetLocation(f1, f2);
        }
        localObject1 = this.mNestedOffsets;
        j = localObject1[0];
        i2 = this.mScrollOffset[0];
        j += i2;
        localObject1[0] = j;
        localObject1 = this.mNestedOffsets;
        j = localObject1[bool1];
        localObject2 = this.mScrollOffset;
        i2 = localObject2[bool1];
        j += i2;
        localObject1[bool1] = j;
      }
      for (;;)
      {
        if ((i1 != 0) || (i != 0)) {
          dispatchOnScrolled(i1, i);
        }
        boolean bool4 = awakenScrollBars();
        if (!bool4) {
          invalidate();
        }
        if ((i1 != 0) || (i != 0)) {
          bool2 = bool1;
        }
        return bool2;
        int n = getOverScrollMode();
        int i3 = 2;
        float f3 = 2.8E-45F;
        if (n != i3)
        {
          if (paramMotionEvent != null)
          {
            f1 = 1.1482E-41F;
            bool5 = h.a(paramMotionEvent, 8194);
            if (!bool5)
            {
              f1 = paramMotionEvent.getX();
              f2 = j;
              f3 = paramMotionEvent.getY();
              f4 = i2;
              pullGlows(f1, f2, f3, f4);
            }
          }
          considerReleasingGlowsOnScroll(paramInt1, paramInt2);
        }
      }
      boolean bool5 = false;
      localObject1 = null;
      float f1 = 0.0F;
      i1 = 0;
      localRecycler = null;
      break label126;
      i = 0;
      localState = null;
      j = 0;
      int[] arrayOfInt2 = null;
      float f2 = 0.0F;
      break;
      i = 0;
      localState = null;
      i1 = 0;
      localRecycler = null;
      i2 = 0;
      localObject2 = null;
      float f4 = 0.0F;
      j = 0;
      arrayOfInt2 = null;
      f2 = 0.0F;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void scrollToPosition(int paramInt)
  {
    boolean bool = this.mLayoutFrozen;
    if (bool) {}
    for (;;)
    {
      return;
      stopScroll();
      Object localObject = this.mLayout;
      if (localObject == null)
      {
        localObject = "RecyclerView";
        String str = "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.";
        Log.e((String)localObject, str);
      }
      else
      {
        localObject = this.mLayout;
        ((RecyclerView.LayoutManager)localObject).scrollToPosition(paramInt);
        awakenScrollBars();
      }
    }
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = shouldDeferAccessibilityEvent(paramAccessibilityEvent);
    if (bool) {}
    for (;;)
    {
      return;
      super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
    }
  }
  
  public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate paramRecyclerViewAccessibilityDelegate)
  {
    this.mAccessibilityDelegate = paramRecyclerViewAccessibilityDelegate;
    RecyclerViewAccessibilityDelegate localRecyclerViewAccessibilityDelegate = this.mAccessibilityDelegate;
    r.a(this, localRecyclerViewAccessibilityDelegate);
  }
  
  public void setAdapter(RecyclerView.Adapter paramAdapter)
  {
    setLayoutFrozen(false);
    setAdapterInternal(paramAdapter, false, true);
    processDataSetCompletelyChanged(false);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(RecyclerView.ChildDrawingOrderCallback paramChildDrawingOrderCallback)
  {
    RecyclerView.ChildDrawingOrderCallback localChildDrawingOrderCallback = this.mChildDrawingOrderCallback;
    if (paramChildDrawingOrderCallback == localChildDrawingOrderCallback) {
      return;
    }
    this.mChildDrawingOrderCallback = paramChildDrawingOrderCallback;
    localChildDrawingOrderCallback = this.mChildDrawingOrderCallback;
    boolean bool;
    if (localChildDrawingOrderCallback != null) {
      bool = true;
    }
    for (;;)
    {
      setChildrenDrawingOrderEnabled(bool);
      break;
      bool = false;
      localChildDrawingOrderCallback = null;
    }
  }
  
  boolean setChildImportantForAccessibilityInternal(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    boolean bool = isComputingLayout();
    View localView;
    if (bool)
    {
      paramViewHolder.mPendingAccessibilityState = paramInt;
      this.mPendingAccessibilityImportanceChange.add(paramViewHolder);
      bool = false;
      localView = null;
    }
    for (;;)
    {
      return bool;
      localView = paramViewHolder.itemView;
      r.a(localView, paramInt);
      bool = true;
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    boolean bool = this.mClipToPadding;
    if (paramBoolean != bool) {
      invalidateGlows();
    }
    this.mClipToPadding = paramBoolean;
    super.setClipToPadding(paramBoolean);
    bool = this.mFirstLayoutComplete;
    if (bool) {
      requestLayout();
    }
  }
  
  public void setEdgeEffectFactory(RecyclerView.EdgeEffectFactory paramEdgeEffectFactory)
  {
    l.a(paramEdgeEffectFactory);
    this.mEdgeEffectFactory = paramEdgeEffectFactory;
    invalidateGlows();
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    this.mHasFixedSize = paramBoolean;
  }
  
  public void setItemAnimator(RecyclerView.ItemAnimator paramItemAnimator)
  {
    RecyclerView.ItemAnimator localItemAnimator = this.mItemAnimator;
    RecyclerView.ItemAnimator.ItemAnimatorListener localItemAnimatorListener;
    if (localItemAnimator != null)
    {
      this.mItemAnimator.endAnimations();
      localItemAnimator = this.mItemAnimator;
      localItemAnimatorListener = null;
      localItemAnimator.setListener(null);
    }
    this.mItemAnimator = paramItemAnimator;
    localItemAnimator = this.mItemAnimator;
    if (localItemAnimator != null)
    {
      localItemAnimator = this.mItemAnimator;
      localItemAnimatorListener = this.mItemAnimatorListener;
      localItemAnimator.setListener(localItemAnimatorListener);
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    this.mRecycler.setViewCacheSize(paramInt);
  }
  
  public void setLayoutFrozen(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = this.mLayoutFrozen;
    Object localObject;
    if (paramBoolean != bool2)
    {
      localObject = "Do not setLayoutFrozen in layout or scroll";
      assertNotInLayoutOrScroll((String)localObject);
      if (paramBoolean) {
        break label73;
      }
      this.mLayoutFrozen = false;
      bool2 = this.mLayoutWasDefered;
      if (bool2)
      {
        localObject = this.mLayout;
        if (localObject != null)
        {
          localObject = this.mAdapter;
          if (localObject != null) {
            requestLayout();
          }
        }
      }
      this.mLayoutWasDefered = false;
    }
    for (;;)
    {
      return;
      label73:
      long l = SystemClock.uptimeMillis();
      int i = 3;
      localObject = MotionEvent.obtain(l, l, i, 0.0F, 0.0F, 0);
      onTouchEvent((MotionEvent)localObject);
      this.mLayoutFrozen = bool1;
      this.mIgnoreMotionEventTillDown = bool1;
      stopScroll();
    }
  }
  
  public void setLayoutManager(RecyclerView.LayoutManager paramLayoutManager)
  {
    String str = null;
    Object localObject1 = this.mLayout;
    if (paramLayoutManager == localObject1) {}
    for (;;)
    {
      return;
      stopScroll();
      localObject1 = this.mLayout;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = this.mItemAnimator;
        if (localObject1 != null)
        {
          localObject1 = this.mItemAnimator;
          ((RecyclerView.ItemAnimator)localObject1).endAnimations();
        }
        localObject1 = this.mLayout;
        localObject2 = this.mRecycler;
        ((RecyclerView.LayoutManager)localObject1).removeAndRecycleAllViews((RecyclerView.Recycler)localObject2);
        localObject1 = this.mLayout;
        localObject2 = this.mRecycler;
        ((RecyclerView.LayoutManager)localObject1).removeAndRecycleScrapInt((RecyclerView.Recycler)localObject2);
        localObject1 = this.mRecycler;
        ((RecyclerView.Recycler)localObject1).clear();
        bool = this.mIsAttached;
        if (bool)
        {
          localObject1 = this.mLayout;
          localObject2 = this.mRecycler;
          ((RecyclerView.LayoutManager)localObject1).dispatchDetachedFromWindow(this, (RecyclerView.Recycler)localObject2);
        }
        localObject1 = this.mLayout;
        ((RecyclerView.LayoutManager)localObject1).setRecyclerView(null);
        this.mLayout = null;
      }
      for (;;)
      {
        localObject1 = this.mChildHelper;
        ((ChildHelper)localObject1).removeAllViewsUnfiltered();
        this.mLayout = paramLayoutManager;
        if (paramLayoutManager == null) {
          break label262;
        }
        localObject1 = paramLayoutManager.mRecyclerView;
        if (localObject1 == null) {
          break;
        }
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("LayoutManager ").append(paramLayoutManager).append(" is already attached to a RecyclerView:");
        str = paramLayoutManager.mRecyclerView.exceptionLabel();
        localObject2 = str;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        localObject1 = this.mRecycler;
        ((RecyclerView.Recycler)localObject1).clear();
      }
      localObject1 = this.mLayout;
      ((RecyclerView.LayoutManager)localObject1).setRecyclerView(this);
      boolean bool = this.mIsAttached;
      if (bool)
      {
        localObject1 = this.mLayout;
        ((RecyclerView.LayoutManager)localObject1).dispatchAttachedToWindow(this);
      }
      label262:
      localObject1 = this.mRecycler;
      ((RecyclerView.Recycler)localObject1).updateViewCacheSize();
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    getScrollingChildHelper().a(paramBoolean);
  }
  
  public void setOnFlingListener(RecyclerView.OnFlingListener paramOnFlingListener)
  {
    this.mOnFlingListener = paramOnFlingListener;
  }
  
  public void setOnScrollListener(RecyclerView.OnScrollListener paramOnScrollListener)
  {
    this.mScrollListener = paramOnScrollListener;
  }
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean)
  {
    this.mPreserveFocusAfterLayout = paramBoolean;
  }
  
  public void setRecycledViewPool(RecyclerView.RecycledViewPool paramRecycledViewPool)
  {
    this.mRecycler.setRecycledViewPool(paramRecycledViewPool);
  }
  
  public void setRecyclerListener(RecyclerView.RecyclerListener paramRecyclerListener)
  {
    this.mRecyclerListener = paramRecyclerListener;
  }
  
  void setScrollState(int paramInt)
  {
    int i = this.mScrollState;
    if (paramInt == i) {}
    for (;;)
    {
      return;
      this.mScrollState = paramInt;
      i = 2;
      if (paramInt != i) {
        stopScrollersInternal();
      }
      dispatchOnScrollStateChanged(paramInt);
    }
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    int i;
    switch (paramInt)
    {
    default: 
      String str1 = "RecyclerView";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("setScrollingTouchSlop(): bad argument constant ").append(paramInt);
      String str2 = "; using default value";
      localObject = str2;
      Log.w(str1, (String)localObject);
    case 0: 
      i = localViewConfiguration.getScaledTouchSlop();
    }
    for (this.mTouchSlop = i;; this.mTouchSlop = i)
    {
      return;
      i = localViewConfiguration.getScaledPagingTouchSlop();
    }
  }
  
  public void setViewCacheExtension(RecyclerView.ViewCacheExtension paramViewCacheExtension)
  {
    this.mRecycler.setViewCacheExtension(paramViewCacheExtension);
  }
  
  boolean shouldDeferAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = 0;
    boolean bool = isComputingLayout();
    if (bool) {
      if (paramAccessibilityEvent == null) {
        break label47;
      }
    }
    label47:
    int k;
    for (int j = a.a(paramAccessibilityEvent);; k = 0)
    {
      if (j == 0) {}
      for (;;)
      {
        j = this.mEatenAccessibilityChangeFlags;
        i |= j;
        this.mEatenAccessibilityChangeFlags = i;
        i = 1;
        return i;
        i = j;
      }
    }
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2)
  {
    smoothScrollBy(paramInt1, paramInt2, null);
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2, Interpolator paramInterpolator)
  {
    int i = 0;
    String str = null;
    Object localObject = this.mLayout;
    if (localObject == null)
    {
      str = "RecyclerView";
      localObject = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.";
      Log.e(str, (String)localObject);
    }
    label115:
    for (;;)
    {
      return;
      boolean bool = this.mLayoutFrozen;
      if (!bool)
      {
        localObject = this.mLayout;
        bool = ((RecyclerView.LayoutManager)localObject).canScrollHorizontally();
        if (!bool) {
          paramInt1 = 0;
        }
        localObject = this.mLayout;
        bool = ((RecyclerView.LayoutManager)localObject).canScrollVertically();
        if (!bool) {}
        for (;;)
        {
          if ((paramInt1 == 0) && (i == 0)) {
            break label115;
          }
          localObject = this.mViewFlinger;
          ((RecyclerView.ViewFlinger)localObject).smoothScrollBy(paramInt1, i, paramInterpolator);
          break;
          i = paramInt2;
        }
      }
    }
  }
  
  public void smoothScrollToPosition(int paramInt)
  {
    boolean bool = this.mLayoutFrozen;
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject1 = this.mLayout;
      Object localObject2;
      if (localObject1 == null)
      {
        localObject1 = "RecyclerView";
        localObject2 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.";
        Log.e((String)localObject1, (String)localObject2);
      }
      else
      {
        localObject1 = this.mLayout;
        localObject2 = this.mState;
        ((RecyclerView.LayoutManager)localObject1).smoothScrollToPosition(this, (RecyclerView.State)localObject2, paramInt);
      }
    }
  }
  
  void startInterceptRequestLayout()
  {
    int i = this.mInterceptRequestLayoutDepth + 1;
    this.mInterceptRequestLayoutDepth = i;
    i = this.mInterceptRequestLayoutDepth;
    int j = 1;
    if (i == j)
    {
      boolean bool = this.mLayoutFrozen;
      if (!bool)
      {
        bool = false;
        this.mLayoutWasDefered = false;
      }
    }
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return getScrollingChildHelper().b(paramInt);
  }
  
  public boolean startNestedScroll(int paramInt1, int paramInt2)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2);
  }
  
  void stopInterceptRequestLayout(boolean paramBoolean)
  {
    int i = 1;
    int j = this.mInterceptRequestLayoutDepth;
    if (j < i) {
      this.mInterceptRequestLayoutDepth = i;
    }
    if (!paramBoolean)
    {
      boolean bool1 = this.mLayoutFrozen;
      if (!bool1) {
        this.mLayoutWasDefered = false;
      }
    }
    int k = this.mInterceptRequestLayoutDepth;
    if (k == i)
    {
      if (paramBoolean)
      {
        bool2 = this.mLayoutWasDefered;
        if (bool2)
        {
          bool2 = this.mLayoutFrozen;
          if (!bool2)
          {
            Object localObject = this.mLayout;
            if (localObject != null)
            {
              localObject = this.mAdapter;
              if (localObject != null) {
                dispatchLayout();
              }
            }
          }
        }
      }
      boolean bool2 = this.mLayoutFrozen;
      if (!bool2) {
        this.mLayoutWasDefered = false;
      }
    }
    int m = this.mInterceptRequestLayoutDepth + -1;
    this.mInterceptRequestLayoutDepth = m;
  }
  
  public void stopNestedScroll()
  {
    getScrollingChildHelper().c();
  }
  
  public void stopNestedScroll(int paramInt)
  {
    getScrollingChildHelper().c(paramInt);
  }
  
  public void stopScroll()
  {
    setScrollState(0);
    stopScrollersInternal();
  }
  
  public void swapAdapter(RecyclerView.Adapter paramAdapter, boolean paramBoolean)
  {
    boolean bool = true;
    setLayoutFrozen(false);
    setAdapterInternal(paramAdapter, bool, paramBoolean);
    processDataSetCompletelyChanged(bool);
    requestLayout();
  }
  
  void viewRangeUpdate(int paramInt1, int paramInt2, Object paramObject)
  {
    int i = this.mChildHelper.getUnfilteredChildCount();
    int j = paramInt1 + paramInt2;
    int k = 0;
    Object localObject = null;
    int m = 0;
    if (m < i)
    {
      localObject = this.mChildHelper.getUnfilteredChildAt(m);
      RecyclerView.ViewHolder localViewHolder = getChildViewHolderInt((View)localObject);
      if (localViewHolder != null)
      {
        boolean bool1 = localViewHolder.shouldIgnore();
        if (!bool1) {
          break label78;
        }
      }
      for (;;)
      {
        k = m + 1;
        m = k;
        break;
        label78:
        int n = localViewHolder.mPosition;
        if (n >= paramInt1)
        {
          n = localViewHolder.mPosition;
          if (n < j)
          {
            n = 2;
            localViewHolder.addFlags(n);
            localViewHolder.addChangePayload(paramObject);
            localObject = (RecyclerView.LayoutParams)((View)localObject).getLayoutParams();
            boolean bool2 = true;
            ((RecyclerView.LayoutParams)localObject).mInsetsDirty = bool2;
          }
        }
      }
    }
    this.mRecycler.viewRangeUpdate(paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */