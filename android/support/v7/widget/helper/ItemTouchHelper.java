package android.support.v7.widget.helper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.c;
import android.support.v4.view.r;
import android.support.v7.recyclerview.R.dimen;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper
  extends RecyclerView.ItemDecoration
  implements RecyclerView.OnChildAttachStateChangeListener
{
  static final int ACTION_MODE_DRAG_MASK = 16711680;
  private static final int ACTION_MODE_IDLE_MASK = 255;
  static final int ACTION_MODE_SWIPE_MASK = 65280;
  public static final int ACTION_STATE_DRAG = 2;
  public static final int ACTION_STATE_IDLE = 0;
  public static final int ACTION_STATE_SWIPE = 1;
  static final int ACTIVE_POINTER_ID_NONE = 255;
  public static final int ANIMATION_TYPE_DRAG = 8;
  public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
  public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
  static final boolean DEBUG = false;
  static final int DIRECTION_FLAG_COUNT = 8;
  public static final int DOWN = 2;
  public static final int END = 32;
  public static final int LEFT = 4;
  private static final int PIXELS_PER_SECOND = 1000;
  public static final int RIGHT = 8;
  public static final int START = 16;
  static final String TAG = "ItemTouchHelper";
  public static final int UP = 1;
  int mActionState;
  int mActivePointerId;
  ItemTouchHelper.Callback mCallback;
  private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
  private List mDistances;
  private long mDragScrollStartTimeInMs;
  float mDx;
  float mDy;
  c mGestureDetector;
  float mInitialTouchX;
  float mInitialTouchY;
  private ItemTouchHelper.ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
  float mMaxSwipeVelocity;
  private final RecyclerView.OnItemTouchListener mOnItemTouchListener;
  View mOverdrawChild;
  int mOverdrawChildPosition;
  final List mPendingCleanup;
  List mRecoverAnimations;
  RecyclerView mRecyclerView;
  final Runnable mScrollRunnable;
  RecyclerView.ViewHolder mSelected;
  int mSelectedFlags;
  float mSelectedStartX;
  float mSelectedStartY;
  private int mSlop;
  private List mSwapTargets;
  float mSwipeEscapeVelocity;
  private final float[] mTmpPosition;
  private Rect mTmpRect;
  VelocityTracker mVelocityTracker;
  
  public ItemTouchHelper(ItemTouchHelper.Callback paramCallback)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mPendingCleanup = ((List)localObject);
    localObject = new float[2];
    this.mTmpPosition = ((float[])localObject);
    this.mSelected = null;
    this.mActivePointerId = i;
    this.mActionState = 0;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mRecoverAnimations = ((List)localObject);
    localObject = new android/support/v7/widget/helper/ItemTouchHelper$1;
    ((ItemTouchHelper.1)localObject).<init>(this);
    this.mScrollRunnable = ((Runnable)localObject);
    this.mChildDrawingOrderCallback = null;
    this.mOverdrawChild = null;
    this.mOverdrawChildPosition = i;
    localObject = new android/support/v7/widget/helper/ItemTouchHelper$2;
    ((ItemTouchHelper.2)localObject).<init>(this);
    this.mOnItemTouchListener = ((RecyclerView.OnItemTouchListener)localObject);
    this.mCallback = paramCallback;
  }
  
  private void addChildDrawingOrderCallback()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {}
    for (;;)
    {
      return;
      Object localObject = this.mChildDrawingOrderCallback;
      if (localObject == null)
      {
        localObject = new android/support/v7/widget/helper/ItemTouchHelper$5;
        ((ItemTouchHelper.5)localObject).<init>(this);
        this.mChildDrawingOrderCallback = ((RecyclerView.ChildDrawingOrderCallback)localObject);
      }
      localObject = this.mRecyclerView;
      RecyclerView.ChildDrawingOrderCallback localChildDrawingOrderCallback = this.mChildDrawingOrderCallback;
      ((RecyclerView)localObject).setChildDrawingOrderCallback(localChildDrawingOrderCallback);
    }
  }
  
  private int checkHorizontalSwipe(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = 8;
    float f1 = 1.1E-44F;
    int j = 4;
    float f2 = 5.6E-45F;
    int n = paramInt & 0xC;
    float f3;
    int i1;
    label171:
    int k;
    if (n != 0)
    {
      f3 = this.mDx;
      boolean bool2 = f3 < 0.0F;
      if (bool2)
      {
        i1 = i;
        f3 = f1;
        Object localObject = this.mVelocityTracker;
        if (localObject == null) {
          break label269;
        }
        int i2 = this.mActivePointerId;
        int i3 = -1;
        float f4 = 0.0F / 0.0F;
        if (i2 <= i3) {
          break label269;
        }
        localObject = this.mVelocityTracker;
        ItemTouchHelper.Callback localCallback1 = this.mCallback;
        float f5 = this.mMaxSwipeVelocity;
        float f6 = localCallback1.getSwipeVelocityThreshold(f5);
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, f6);
        localObject = this.mVelocityTracker;
        i3 = this.mActivePointerId;
        float f7 = ((VelocityTracker)localObject).getXVelocity(i3);
        VelocityTracker localVelocityTracker = this.mVelocityTracker;
        int i4 = this.mActivePointerId;
        f4 = localVelocityTracker.getYVelocity(i4);
        boolean bool4 = f7 < 0.0F;
        if (!bool4) {
          break label259;
        }
        f2 = Math.abs(f7);
        i2 = i & paramInt;
        if ((i2 == 0) || (i1 != i)) {
          break label269;
        }
        localObject = this.mCallback;
        f6 = this.mSwipeEscapeVelocity;
        f7 = ((ItemTouchHelper.Callback)localObject).getSwipeEscapeVelocity(f6);
        boolean bool3 = f2 < f7;
        if (bool3) {
          break label269;
        }
        f7 = Math.abs(f4);
        k = f2 < f7;
        if (k <= 0) {
          break label269;
        }
      }
    }
    for (;;)
    {
      return i;
      i1 = k;
      f3 = f2;
      break;
      label259:
      i = k;
      f1 = f2;
      break label171;
      label269:
      RecyclerView localRecyclerView = this.mRecyclerView;
      i = localRecyclerView.getWidth();
      f1 = i;
      ItemTouchHelper.Callback localCallback2 = this.mCallback;
      f2 = localCallback2.getSwipeThreshold(paramViewHolder);
      f1 *= f2;
      int m = paramInt & i1;
      if (m != 0)
      {
        f2 = Math.abs(this.mDx);
        bool1 = f2 < f1;
        if (bool1)
        {
          bool1 = i1;
          f1 = f3;
          continue;
        }
      }
      boolean bool1 = false;
      f1 = 0.0F;
      localRecyclerView = null;
    }
  }
  
  private int checkVerticalSwipe(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = 2;
    float f1 = 2.8E-45F;
    int j = 1;
    float f2 = Float.MIN_VALUE;
    int m = paramInt & 0x3;
    float f3;
    int n;
    if (m != 0)
    {
      f3 = this.mDy;
      boolean bool2 = f3 < 0.0F;
      if (bool2)
      {
        n = i;
        f3 = f1;
        VelocityTracker localVelocityTracker = this.mVelocityTracker;
        if (localVelocityTracker == null) {
          break label267;
        }
        int i1 = this.mActivePointerId;
        int i2 = -1;
        float f4 = 0.0F / 0.0F;
        if (i1 <= i2) {
          break label267;
        }
        localVelocityTracker = this.mVelocityTracker;
        ItemTouchHelper.Callback localCallback1 = this.mCallback;
        float f5 = this.mMaxSwipeVelocity;
        float f6 = localCallback1.getSwipeVelocityThreshold(f5);
        localVelocityTracker.computeCurrentVelocity(1000, f6);
        localVelocityTracker = this.mVelocityTracker;
        i2 = this.mActivePointerId;
        float f7 = localVelocityTracker.getXVelocity(i2);
        Object localObject = this.mVelocityTracker;
        int i3 = this.mActivePointerId;
        f4 = ((VelocityTracker)localObject).getYVelocity(i3);
        boolean bool4 = f4 < 0.0F;
        if (!bool4) {
          break label257;
        }
        label169:
        f2 = Math.abs(f4);
        i2 = i & paramInt;
        if ((i2 == 0) || (i != n)) {
          break label267;
        }
        localObject = this.mCallback;
        f6 = this.mSwipeEscapeVelocity;
        f4 = ((ItemTouchHelper.Callback)localObject).getSwipeEscapeVelocity(f6);
        boolean bool3 = f2 < f4;
        if (bool3) {
          break label267;
        }
        f7 = Math.abs(f7);
        j = f2 < f7;
        if (j <= 0) {
          break label267;
        }
      }
    }
    for (;;)
    {
      return i;
      n = j;
      f3 = f2;
      break;
      label257:
      i = j;
      f1 = f2;
      break label169;
      label267:
      RecyclerView localRecyclerView = this.mRecyclerView;
      i = localRecyclerView.getHeight();
      f1 = i;
      ItemTouchHelper.Callback localCallback2 = this.mCallback;
      f2 = localCallback2.getSwipeThreshold(paramViewHolder);
      f1 *= f2;
      int k = paramInt & n;
      if (k != 0)
      {
        f2 = Math.abs(this.mDy);
        bool1 = f2 < f1;
        if (bool1)
        {
          bool1 = n;
          f1 = f3;
          continue;
        }
      }
      boolean bool1 = false;
      f1 = 0.0F;
      localRecyclerView = null;
    }
  }
  
  private void destroyCallbacks()
  {
    this.mRecyclerView.removeItemDecoration(this);
    Object localObject = this.mRecyclerView;
    RecyclerView.OnItemTouchListener localOnItemTouchListener = this.mOnItemTouchListener;
    ((RecyclerView)localObject).removeOnItemTouchListener(localOnItemTouchListener);
    this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
    localObject = this.mRecoverAnimations;
    int i = ((List)localObject).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (ItemTouchHelper.RecoverAnimation)this.mRecoverAnimations.get(0);
      ItemTouchHelper.Callback localCallback = this.mCallback;
      RecyclerView localRecyclerView = this.mRecyclerView;
      localObject = ((ItemTouchHelper.RecoverAnimation)localObject).mViewHolder;
      localCallback.clearView(localRecyclerView, (RecyclerView.ViewHolder)localObject);
      i = j + -1;
    }
    this.mRecoverAnimations.clear();
    this.mOverdrawChild = null;
    this.mOverdrawChildPosition = -1;
    releaseVelocityTracker();
    stopGestureDetection();
  }
  
  private List findSwapTargets(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = this.mSwapTargets;
    int i;
    float f1;
    float f2;
    int j;
    int k;
    int m;
    int i1;
    int i2;
    Object localObject2;
    int i3;
    int i4;
    int i5;
    int i7;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.mSwapTargets = ((List)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.mDistances = ((List)localObject1);
      i = this.mCallback.getBoundingBoxMargin();
      f1 = this.mSelectedStartX;
      f2 = this.mDx;
      j = Math.round(f1 + f2) - i;
      f1 = this.mSelectedStartY;
      f2 = this.mDy;
      f1 += f2;
      k = Math.round(f1) - i;
      m = paramViewHolder.itemView.getWidth() + j;
      i1 = i * 2;
      i2 = m + i1;
      localObject2 = paramViewHolder.itemView;
      m = ((View)localObject2).getHeight() + k;
      i *= 2;
      i3 = m + i;
      i4 = (j + i2) / 2;
      i5 = (k + i3) / 2;
      RecyclerView.LayoutManager localLayoutManager = this.mRecyclerView.getLayoutManager();
      int i6 = localLayoutManager.getChildCount();
      i = 0;
      localObject1 = null;
      i7 = 0;
      label186:
      if (i7 >= i6) {
        break label538;
      }
      localObject1 = localLayoutManager.getChildAt(i7);
      localObject2 = paramViewHolder.itemView;
      if (localObject1 != localObject2) {
        break label247;
      }
    }
    for (;;)
    {
      i = i7 + 1;
      i7 = i;
      break label186;
      this.mSwapTargets.clear();
      localObject1 = this.mDistances;
      ((List)localObject1).clear();
      break;
      label247:
      m = ((View)localObject1).getBottom();
      if (m >= k)
      {
        m = ((View)localObject1).getTop();
        if (m <= i3)
        {
          m = ((View)localObject1).getRight();
          if (m >= j)
          {
            m = ((View)localObject1).getLeft();
            if (m <= i2)
            {
              RecyclerView.ViewHolder localViewHolder1 = this.mRecyclerView.getChildViewHolder((View)localObject1);
              localObject2 = this.mCallback;
              RecyclerView localRecyclerView = this.mRecyclerView;
              RecyclerView.ViewHolder localViewHolder2 = this.mSelected;
              boolean bool = ((ItemTouchHelper.Callback)localObject2).canDropOver(localRecyclerView, localViewHolder2, localViewHolder1);
              if (bool)
              {
                int n = ((View)localObject1).getLeft();
                i1 = ((View)localObject1).getRight();
                n = (n + i1) / 2;
                n = Math.abs(i4 - n);
                i1 = ((View)localObject1).getTop();
                i = (((View)localObject1).getBottom() + i1) / 2;
                i = Math.abs(i5 - i);
                n *= n;
                i *= i;
                int i8 = n + i;
                int i9 = this.mSwapTargets.size();
                i = 0;
                localObject1 = null;
                i1 = 0;
                localRecyclerView = null;
                f2 = 0.0F;
                n = 0;
                localObject2 = null;
                f1 = 0.0F;
                while (n < i9)
                {
                  localObject1 = (Integer)this.mDistances.get(n);
                  i = ((Integer)localObject1).intValue();
                  if (i8 <= i) {
                    break;
                  }
                  i1 += 1;
                  i = n + 1;
                  n = i;
                }
                this.mSwapTargets.add(i1, localViewHolder1);
                localObject1 = this.mDistances;
                localObject2 = Integer.valueOf(i8);
                ((List)localObject1).add(i1, localObject2);
              }
            }
          }
        }
      }
    }
    label538:
    return this.mSwapTargets;
  }
  
  private RecyclerView.ViewHolder findSwipedView(MotionEvent paramMotionEvent)
  {
    RecyclerView.ViewHolder localViewHolder = null;
    Object localObject = this.mRecyclerView.getLayoutManager();
    int i = this.mActivePointerId;
    int j = -1;
    float f1 = 0.0F / 0.0F;
    if (i == j) {}
    for (;;)
    {
      return localViewHolder;
      i = this.mActivePointerId;
      i = paramMotionEvent.findPointerIndex(i);
      f1 = paramMotionEvent.getX(i);
      float f2 = this.mInitialTouchX;
      f1 -= f2;
      float f3 = paramMotionEvent.getY(i);
      f2 = this.mInitialTouchY;
      f3 -= f2;
      f1 = Math.abs(f1);
      f3 = Math.abs(f3);
      f2 = this.mSlop;
      boolean bool2 = f1 < f2;
      if (bool2)
      {
        f2 = this.mSlop;
        bool2 = f3 < f2;
        if (bool2) {}
      }
      else
      {
        bool2 = f1 < f3;
        if (bool2)
        {
          bool2 = ((RecyclerView.LayoutManager)localObject).canScrollHorizontally();
          if (bool2) {}
        }
        else
        {
          boolean bool1 = f3 < f1;
          if (bool1)
          {
            boolean bool3 = ((RecyclerView.LayoutManager)localObject).canScrollVertically();
            if (bool3) {}
          }
          else
          {
            localObject = findChildView(paramMotionEvent);
            if (localObject != null) {
              localViewHolder = this.mRecyclerView.getChildViewHolder((View)localObject);
            }
          }
        }
      }
    }
  }
  
  private void getSelectedDxDy(float[] paramArrayOfFloat)
  {
    int i = 1;
    int j = this.mSelectedFlags & 0xC;
    float f1;
    if (j != 0)
    {
      f1 = this.mSelectedStartX;
      float f2 = this.mDx;
      f1 += f2;
      View localView1 = this.mSelected.itemView;
      int k = localView1.getLeft();
      f2 = k;
      f1 -= f2;
      paramArrayOfFloat[0] = f1;
      j = this.mSelectedFlags & 0x3;
      if (j == 0) {
        break label154;
      }
      f1 = this.mSelectedStartY;
      f2 = this.mDy;
      f1 += f2;
      localView1 = this.mSelected.itemView;
      k = localView1.getTop();
      f2 = k;
      f1 -= f2;
      paramArrayOfFloat[i] = f1;
    }
    for (;;)
    {
      return;
      View localView2 = this.mSelected.itemView;
      f1 = localView2.getTranslationX();
      paramArrayOfFloat[0] = f1;
      break;
      label154:
      localView2 = this.mSelected.itemView;
      f1 = localView2.getTranslationY();
      paramArrayOfFloat[i] = f1;
    }
  }
  
  private static boolean hitTest(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    boolean bool = paramFloat1 < paramFloat3;
    if (!bool)
    {
      f = paramView.getWidth() + paramFloat3;
      bool = paramFloat1 < f;
      if (!bool)
      {
        bool = paramFloat2 < paramFloat4;
        if (!bool)
        {
          f = paramView.getHeight() + paramFloat4;
          bool = paramFloat2 < f;
          if (!bool) {
            bool = true;
          }
        }
      }
    }
    for (float f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
  
  private void releaseVelocityTracker()
  {
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    if (localVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      localVelocityTracker = null;
      this.mVelocityTracker = null;
    }
  }
  
  private void setupCallbacks()
  {
    int i = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
    this.mSlop = i;
    this.mRecyclerView.addItemDecoration(this);
    RecyclerView localRecyclerView = this.mRecyclerView;
    RecyclerView.OnItemTouchListener localOnItemTouchListener = this.mOnItemTouchListener;
    localRecyclerView.addOnItemTouchListener(localOnItemTouchListener);
    this.mRecyclerView.addOnChildAttachStateChangeListener(this);
    startGestureDetection();
  }
  
  private void startGestureDetection()
  {
    Object localObject = new android/support/v7/widget/helper/ItemTouchHelper$ItemTouchHelperGestureListener;
    ((ItemTouchHelper.ItemTouchHelperGestureListener)localObject).<init>(this);
    this.mItemTouchHelperGestureListener = ((ItemTouchHelper.ItemTouchHelperGestureListener)localObject);
    localObject = new android/support/v4/view/c;
    Context localContext = this.mRecyclerView.getContext();
    ItemTouchHelper.ItemTouchHelperGestureListener localItemTouchHelperGestureListener = this.mItemTouchHelperGestureListener;
    ((c)localObject).<init>(localContext, localItemTouchHelperGestureListener);
    this.mGestureDetector = ((c)localObject);
  }
  
  private void stopGestureDetection()
  {
    Object localObject = this.mItemTouchHelperGestureListener;
    if (localObject != null)
    {
      localObject = this.mItemTouchHelperGestureListener;
      ((ItemTouchHelper.ItemTouchHelperGestureListener)localObject).doNotReactToLongPress();
      this.mItemTouchHelperGestureListener = null;
    }
    localObject = this.mGestureDetector;
    if (localObject != null) {
      this.mGestureDetector = null;
    }
  }
  
  private int swipeIfNecessary(RecyclerView.ViewHolder paramViewHolder)
  {
    int i = 65280;
    float f1 = 9.1477E-41F;
    int j = 0;
    RecyclerView localRecyclerView1 = null;
    int k = this.mActionState;
    int n = 2;
    if (k == n) {}
    for (;;)
    {
      return j;
      ItemTouchHelper.Callback localCallback = this.mCallback;
      Object localObject = this.mRecyclerView;
      k = localCallback.getMovementFlags((RecyclerView)localObject, paramViewHolder);
      localObject = this.mCallback;
      RecyclerView localRecyclerView2 = this.mRecyclerView;
      int i1 = r.e(localRecyclerView2);
      n = (((ItemTouchHelper.Callback)localObject).convertToAbsoluteDirection(k, i1) & i) >> 8;
      if (n != 0)
      {
        i1 = (k & i) >> 8;
        float f2 = Math.abs(this.mDx);
        f1 = Math.abs(this.mDy);
        boolean bool = f2 < f1;
        int m;
        if (bool)
        {
          m = checkHorizontalSwipe(paramViewHolder, n);
          if (m > 0)
          {
            j = i1 & m;
            if (j == 0)
            {
              localRecyclerView1 = this.mRecyclerView;
              j = r.e(localRecyclerView1);
              j = ItemTouchHelper.Callback.convertToRelativeDirection(m, j);
            }
            else
            {
              j = m;
            }
          }
          else
          {
            m = checkVerticalSwipe(paramViewHolder, n);
            if (m > 0) {
              j = m;
            }
          }
        }
        else
        {
          m = checkVerticalSwipe(paramViewHolder, n);
          if (m > 0)
          {
            j = m;
          }
          else
          {
            m = checkHorizontalSwipe(paramViewHolder, n);
            if (m > 0)
            {
              j = i1 & m;
              if (j == 0)
              {
                localRecyclerView1 = this.mRecyclerView;
                j = r.e(localRecyclerView1);
                j = ItemTouchHelper.Callback.convertToRelativeDirection(m, j);
              }
              else
              {
                j = m;
              }
            }
          }
        }
      }
    }
  }
  
  public void attachToRecyclerView(RecyclerView paramRecyclerView)
  {
    Object localObject = this.mRecyclerView;
    if (localObject == paramRecyclerView) {}
    for (;;)
    {
      return;
      localObject = this.mRecyclerView;
      if (localObject != null) {
        destroyCallbacks();
      }
      this.mRecyclerView = paramRecyclerView;
      if (paramRecyclerView != null)
      {
        localObject = paramRecyclerView.getResources();
        int i = R.dimen.item_touch_helper_swipe_escape_velocity;
        float f1 = ((Resources)localObject).getDimension(i);
        this.mSwipeEscapeVelocity = f1;
        i = R.dimen.item_touch_helper_swipe_escape_max_velocity;
        float f2 = ((Resources)localObject).getDimension(i);
        this.mMaxSwipeVelocity = f2;
        setupCallbacks();
      }
    }
  }
  
  boolean checkSelectForSwipe(int paramInt1, MotionEvent paramMotionEvent, int paramInt2)
  {
    int i = 2;
    int j = 1;
    boolean bool1 = false;
    Object localObject = this.mSelected;
    if ((localObject == null) && (paramInt1 == i))
    {
      int m = this.mActionState;
      if (m != i)
      {
        localObject = this.mCallback;
        boolean bool2 = ((ItemTouchHelper.Callback)localObject).isItemViewSwipeEnabled();
        if (bool2) {
          break label60;
        }
      }
    }
    for (;;)
    {
      return bool1;
      label60:
      localObject = this.mRecyclerView;
      int n = ((RecyclerView)localObject).getScrollState();
      if (n != j)
      {
        localObject = findSwipedView(paramMotionEvent);
        if (localObject != null)
        {
          ItemTouchHelper.Callback localCallback = this.mCallback;
          RecyclerView localRecyclerView = this.mRecyclerView;
          i = localCallback.getAbsoluteMovementFlags(localRecyclerView, (RecyclerView.ViewHolder)localObject);
          int i1 = 65280;
          float f1 = 9.1477E-41F;
          i = (i & i1) >> 8;
          if (i != 0)
          {
            f1 = paramMotionEvent.getX(paramInt2);
            float f2 = paramMotionEvent.getY(paramInt2);
            float f3 = this.mInitialTouchX;
            f1 -= f3;
            f3 = this.mInitialTouchY;
            f2 -= f3;
            f3 = Math.abs(f1);
            float f4 = Math.abs(f2);
            float f5 = this.mSlop;
            boolean bool5 = f3 < f5;
            if (bool5)
            {
              f5 = this.mSlop;
              bool5 = f4 < f5;
              if (bool5) {}
            }
            else
            {
              boolean bool6 = f3 < f4;
              boolean bool3;
              if (bool6)
              {
                boolean bool7 = f1 < 0.0F;
                if (bool7)
                {
                  int i3 = i & 0x4;
                  if (i3 == 0) {
                    continue;
                  }
                }
                bool3 = f1 < 0.0F;
                if (bool3)
                {
                  i &= 0x8;
                  if (i == 0) {
                    continue;
                  }
                }
              }
              do
              {
                boolean bool4;
                do
                {
                  this.mDy = 0.0F;
                  this.mDx = 0.0F;
                  int k = paramMotionEvent.getPointerId(0);
                  this.mActivePointerId = k;
                  select((RecyclerView.ViewHolder)localObject, j);
                  k = j;
                  break;
                  bool3 = f2 < 0.0F;
                  if (bool3)
                  {
                    int i2 = i & 0x1;
                    if (i2 == 0) {
                      break;
                    }
                  }
                  bool4 = f2 < 0.0F;
                } while (!bool4);
                i &= 0x2;
              } while (i != 0);
            }
          }
        }
      }
    }
  }
  
  int endRecoverAnimation(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
  {
    Object localObject1 = this.mRecoverAnimations;
    int i = ((List)localObject1).size() + -1;
    int j = i;
    if (j >= 0)
    {
      localObject1 = (ItemTouchHelper.RecoverAnimation)this.mRecoverAnimations.get(j);
      Object localObject2 = ((ItemTouchHelper.RecoverAnimation)localObject1).mViewHolder;
      if (localObject2 == paramViewHolder)
      {
        boolean bool = ((ItemTouchHelper.RecoverAnimation)localObject1).mOverridden | paramBoolean;
        ((ItemTouchHelper.RecoverAnimation)localObject1).mOverridden = bool;
        bool = ((ItemTouchHelper.RecoverAnimation)localObject1).mEnded;
        if (!bool) {
          ((ItemTouchHelper.RecoverAnimation)localObject1).cancel();
        }
        localObject2 = this.mRecoverAnimations;
        ((List)localObject2).remove(j);
        i = ((ItemTouchHelper.RecoverAnimation)localObject1).mAnimationType;
      }
    }
    for (;;)
    {
      return i;
      i = j + -1;
      j = i;
      break;
      i = 0;
      localObject1 = null;
    }
  }
  
  ItemTouchHelper.RecoverAnimation findAnimation(MotionEvent paramMotionEvent)
  {
    Object localObject = this.mRecoverAnimations;
    boolean bool = ((List)localObject).isEmpty();
    if (bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (ItemTouchHelper.RecoverAnimation)localObject;
      View localView1 = findChildView(paramMotionEvent);
      localObject = this.mRecoverAnimations;
      int i = ((List)localObject).size() + -1;
      for (int j = i;; j = i)
      {
        if (j < 0) {
          break label93;
        }
        localObject = (ItemTouchHelper.RecoverAnimation)this.mRecoverAnimations.get(j);
        View localView2 = ((ItemTouchHelper.RecoverAnimation)localObject).mViewHolder.itemView;
        if (localView2 == localView1) {
          break;
        }
        i = j + -1;
      }
      label93:
      i = 0;
      localObject = null;
    }
  }
  
  View findChildView(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    Object localObject = this.mSelected;
    float f5;
    if (localObject != null)
    {
      localObject = this.mSelected.itemView;
      float f3 = this.mSelectedStartX;
      float f4 = this.mDx;
      f3 += f4;
      f4 = this.mSelectedStartY;
      f5 = this.mDy;
      f4 += f5;
      boolean bool1 = hitTest((View)localObject, f1, f2, f3, f4);
      if (!bool1) {}
    }
    for (;;)
    {
      return (View)localObject;
      localObject = this.mRecoverAnimations;
      int i = ((List)localObject).size() + -1;
      int j;
      for (int k = i;; k = j)
      {
        if (k < 0) {
          break label193;
        }
        localObject = (ItemTouchHelper.RecoverAnimation)this.mRecoverAnimations.get(k);
        View localView = ((ItemTouchHelper.RecoverAnimation)localObject).mViewHolder.itemView;
        f5 = ((ItemTouchHelper.RecoverAnimation)localObject).mX;
        float f6 = ((ItemTouchHelper.RecoverAnimation)localObject).mY;
        boolean bool2 = hitTest(localView, f1, f2, f5, f6);
        if (bool2)
        {
          localObject = localView;
          break;
        }
        j = k + -1;
      }
      label193:
      localObject = this.mRecyclerView.findChildViewUnder(f1, f2);
    }
  }
  
  public void getItemOffsets(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    paramRect.setEmpty();
  }
  
  boolean hasRunningRecoverAnim()
  {
    Object localObject = this.mRecoverAnimations;
    int i = ((List)localObject).size();
    int j = 0;
    boolean bool;
    if (j < i)
    {
      localObject = (ItemTouchHelper.RecoverAnimation)this.mRecoverAnimations.get(j);
      bool = ((ItemTouchHelper.RecoverAnimation)localObject).mEnded;
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      int k = j + 1;
      j = k;
      break;
      k = 0;
      localObject = null;
    }
  }
  
  void moveIfNecessary(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = this.mRecyclerView;
    boolean bool1 = ((RecyclerView)localObject1).isLayoutRequested();
    if (bool1) {}
    for (;;)
    {
      return;
      int i = this.mActionState;
      int j = 2;
      float f1 = 2.8E-45F;
      if (i == j)
      {
        localObject1 = this.mCallback;
        float f2 = ((ItemTouchHelper.Callback)localObject1).getMoveThreshold(paramViewHolder);
        f1 = this.mSelectedStartX;
        float f3 = this.mDx;
        int m = (int)(f1 + f3);
        f1 = this.mSelectedStartY;
        f3 = this.mDy;
        int n = (int)(f1 + f3);
        Object localObject2 = paramViewHolder.itemView;
        j = ((View)localObject2).getTop();
        f1 = Math.abs(n - j);
        Object localObject3 = paramViewHolder.itemView;
        int i1 = ((View)localObject3).getHeight();
        f3 = i1 * f2;
        boolean bool3 = f1 < f3;
        int k;
        boolean bool2;
        if (bool3)
        {
          localObject2 = paramViewHolder.itemView;
          k = ((View)localObject2).getLeft();
          k = Math.abs(m - k);
          f1 = k;
          localObject3 = paramViewHolder.itemView;
          i1 = ((View)localObject3).getWidth();
          f3 = i1;
          f2 *= f3;
          bool2 = f1 < f2;
          if (bool2) {}
        }
        else
        {
          localObject1 = findSwapTargets(paramViewHolder);
          k = ((List)localObject1).size();
          if (k != 0)
          {
            localObject2 = this.mCallback;
            RecyclerView.ViewHolder localViewHolder = ((ItemTouchHelper.Callback)localObject2).chooseDropTarget(paramViewHolder, (List)localObject1, m, n);
            if (localViewHolder == null)
            {
              this.mSwapTargets.clear();
              localObject1 = this.mDistances;
              ((List)localObject1).clear();
            }
            else
            {
              int i2 = localViewHolder.getAdapterPosition();
              int i3 = paramViewHolder.getAdapterPosition();
              localObject1 = this.mCallback;
              localObject2 = this.mRecyclerView;
              bool2 = ((ItemTouchHelper.Callback)localObject1).onMove((RecyclerView)localObject2, paramViewHolder, localViewHolder);
              if (bool2)
              {
                localObject1 = this.mCallback;
                localObject2 = this.mRecyclerView;
                localObject3 = paramViewHolder;
                ((ItemTouchHelper.Callback)localObject1).onMoved((RecyclerView)localObject2, paramViewHolder, i3, localViewHolder, i2, m, n);
              }
            }
          }
        }
      }
    }
  }
  
  void obtainVelocityTracker()
  {
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker = this.mVelocityTracker;
      localVelocityTracker.recycle();
    }
    localVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker = localVelocityTracker;
  }
  
  public void onChildViewAttachedToWindow(View paramView) {}
  
  public void onChildViewDetachedFromWindow(View paramView)
  {
    Object localObject1 = null;
    removeChildDrawingOrderCallbackIfNecessary(paramView);
    RecyclerView.ViewHolder localViewHolder = this.mRecyclerView.getChildViewHolder(paramView);
    if (localViewHolder == null) {}
    for (;;)
    {
      return;
      Object localObject2 = this.mSelected;
      if (localObject2 != null)
      {
        localObject2 = this.mSelected;
        if (localViewHolder == localObject2)
        {
          localViewHolder = null;
          select(null, 0);
          continue;
        }
      }
      endRecoverAnimation(localViewHolder, false);
      localObject2 = this.mPendingCleanup;
      localObject1 = localViewHolder.itemView;
      boolean bool = ((List)localObject2).remove(localObject1);
      if (bool)
      {
        localObject2 = this.mCallback;
        localObject1 = this.mRecyclerView;
        ((ItemTouchHelper.Callback)localObject2).clearView((RecyclerView)localObject1, localViewHolder);
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    float f1 = 0.0F;
    int i = -1;
    this.mOverdrawChildPosition = i;
    Object localObject = this.mSelected;
    float f2;
    if (localObject != null)
    {
      localObject = this.mTmpPosition;
      getSelectedDxDy((float[])localObject);
      f2 = this.mTmpPosition[0];
      localObject = this.mTmpPosition;
      int j = 1;
      f1 = localObject[j];
    }
    for (;;)
    {
      localObject = this.mCallback;
      RecyclerView.ViewHolder localViewHolder = this.mSelected;
      List localList = this.mRecoverAnimations;
      int k = this.mActionState;
      ((ItemTouchHelper.Callback)localObject).onDraw(paramCanvas, paramRecyclerView, localViewHolder, localList, k, f2, f1);
      return;
      f2 = 0.0F;
    }
  }
  
  public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    float f1 = 0.0F;
    Object localObject = this.mSelected;
    float f2;
    if (localObject != null)
    {
      localObject = this.mTmpPosition;
      getSelectedDxDy((float[])localObject);
      f2 = this.mTmpPosition[0];
      localObject = this.mTmpPosition;
      int i = 1;
      f1 = localObject[i];
    }
    for (;;)
    {
      localObject = this.mCallback;
      RecyclerView.ViewHolder localViewHolder = this.mSelected;
      List localList = this.mRecoverAnimations;
      int j = this.mActionState;
      ((ItemTouchHelper.Callback)localObject).onDrawOver(paramCanvas, paramRecyclerView, localViewHolder, localList, j, f2, f1);
      return;
      f2 = 0.0F;
    }
  }
  
  void postDispatchSwipe(ItemTouchHelper.RecoverAnimation paramRecoverAnimation, int paramInt)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    ItemTouchHelper.4 local4 = new android/support/v7/widget/helper/ItemTouchHelper$4;
    local4.<init>(this, paramRecoverAnimation, paramInt);
    localRecyclerView.post(local4);
  }
  
  void removeChildDrawingOrderCallbackIfNecessary(View paramView)
  {
    Object localObject = this.mOverdrawChild;
    if (paramView == localObject)
    {
      this.mOverdrawChild = null;
      localObject = this.mChildDrawingOrderCallback;
      if (localObject != null)
      {
        localObject = this.mRecyclerView;
        ((RecyclerView)localObject).setChildDrawingOrderCallback(null);
      }
    }
  }
  
  boolean scrollIfNecessary()
  {
    long l1 = Long.MIN_VALUE;
    boolean bool1 = false;
    RecyclerView localRecyclerView1 = null;
    int i = 0;
    RecyclerView localRecyclerView2 = null;
    Object localObject1 = this.mSelected;
    if (localObject1 == null)
    {
      this.mDragScrollStartTimeInMs = l1;
      return bool1;
    }
    long l2 = System.currentTimeMillis();
    long l3 = this.mDragScrollStartTimeInMs;
    boolean bool2 = l3 < l1;
    long l4;
    label58:
    Object localObject2;
    Object localObject3;
    float f1;
    float f2;
    RecyclerView localRecyclerView3;
    int i6;
    label216:
    int j;
    int i3;
    int i7;
    int m;
    if (!bool2)
    {
      l4 = 0L;
      localObject1 = this.mRecyclerView.getLayoutManager();
      localObject2 = this.mTmpRect;
      if (localObject2 == null)
      {
        localObject2 = new android/graphics/Rect;
        ((Rect)localObject2).<init>();
        this.mTmpRect = ((Rect)localObject2);
      }
      localObject2 = this.mSelected.itemView;
      localObject3 = this.mTmpRect;
      ((RecyclerView.LayoutManager)localObject1).calculateItemDecorationsForChild((View)localObject2, (Rect)localObject3);
      boolean bool3 = ((RecyclerView.LayoutManager)localObject1).canScrollHorizontally();
      if (!bool3) {
        break label612;
      }
      f1 = this.mSelectedStartX;
      f2 = this.mDx;
      f1 += f2;
      int k = (int)f1;
      localObject3 = this.mTmpRect;
      int i2 = ((Rect)localObject3).left;
      i2 = k - i2;
      localRecyclerView3 = this.mRecyclerView;
      i6 = localRecyclerView3.getPaddingLeft();
      i6 = i2 - i6;
      f2 = this.mDx;
      boolean bool5 = f2 < 0.0F;
      if ((!bool5) || (i6 >= 0)) {
        break label515;
      }
      bool2 = ((RecyclerView.LayoutManager)localObject1).canScrollVertically();
      if (!bool2) {
        break label718;
      }
      float f3 = this.mSelectedStartY;
      f1 = this.mDy;
      f3 += f1;
      j = (int)f3;
      localObject2 = this.mTmpRect;
      k = ((Rect)localObject2).top;
      k = j - k;
      localObject3 = this.mRecyclerView;
      i3 = ((RecyclerView)localObject3).getPaddingTop();
      i7 = k - i3;
      f1 = this.mDy;
      m = f1 < 0.0F;
      if ((m >= 0) || (i7 >= 0)) {
        break label621;
      }
      label314:
      if (i6 == 0) {
        break label739;
      }
      localObject1 = this.mCallback;
      localObject2 = this.mRecyclerView;
      localObject3 = this.mSelected.itemView;
      i3 = ((View)localObject3).getWidth();
      localRecyclerView2 = this.mRecyclerView;
      i = localRecyclerView2.getWidth();
      i6 = ((ItemTouchHelper.Callback)localObject1).interpolateOutOfBoundsScroll((RecyclerView)localObject2, i3, i6, i, l4);
    }
    label515:
    label612:
    label621:
    label718:
    label739:
    for (int i8 = i6;; i8 = i6)
    {
      if (i7 != 0)
      {
        localObject1 = this.mCallback;
        localObject2 = this.mRecyclerView;
        localObject3 = this.mSelected.itemView;
        i3 = ((View)localObject3).getHeight();
        localRecyclerView3 = this.mRecyclerView;
        i = localRecyclerView3.getHeight();
        i6 = i7;
      }
      for (j = ((ItemTouchHelper.Callback)localObject1).interpolateOutOfBoundsScroll((RecyclerView)localObject2, i3, i7, i, l4);; j = i7)
      {
        if ((i8 != 0) || (j != 0))
        {
          l3 = this.mDragScrollStartTimeInMs;
          bool1 = l3 < l1;
          if (!bool1) {
            this.mDragScrollStartTimeInMs = l2;
          }
          localRecyclerView1 = this.mRecyclerView;
          localRecyclerView1.scrollBy(i8, j);
          bool1 = true;
          break;
          l3 = this.mDragScrollStartTimeInMs;
          l4 = l2 - l3;
          break label58;
          f2 = this.mDx;
          boolean bool6 = f2 < 0.0F;
          int i5;
          if (bool6)
          {
            int i4 = this.mSelected.itemView.getWidth();
            int n;
            m += i4;
            i5 = this.mTmpRect.right;
            n += i5;
            localObject3 = this.mRecyclerView;
            i5 = ((RecyclerView)localObject3).getWidth();
            localRecyclerView3 = this.mRecyclerView;
            i6 = localRecyclerView3.getPaddingRight();
            i5 -= i6;
            i6 = n - i5;
            if (i6 > 0) {
              break label216;
            }
          }
          i6 = 0;
          localRecyclerView3 = null;
          break label216;
          f1 = this.mDy;
          boolean bool4 = f1 < 0.0F;
          if (bool4)
          {
            int i1 = this.mSelected.itemView.getHeight();
            j += i1;
            i1 = this.mTmpRect.bottom;
            j += i1;
            localObject2 = this.mRecyclerView;
            i1 = ((RecyclerView)localObject2).getHeight();
            localObject3 = this.mRecyclerView;
            i5 = ((RecyclerView)localObject3).getPaddingBottom();
            i1 -= i5;
            i7 = j - i1;
            if (i7 > 0) {
              break label314;
            }
          }
          i7 = 0;
          break label314;
        }
        this.mDragScrollStartTimeInMs = l1;
        break;
      }
    }
  }
  
  void select(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    Object localObject1 = this.mSelected;
    if (paramViewHolder == localObject1)
    {
      i = this.mActionState;
      if (paramInt == i) {
        return;
      }
    }
    long l1 = Long.MIN_VALUE;
    this.mDragScrollStartTimeInMs = l1;
    int j = this.mActionState;
    endRecoverAnimation(paramViewHolder, true);
    this.mActionState = paramInt;
    int i = 2;
    float f1 = 2.8E-45F;
    if (paramInt == i)
    {
      localObject1 = paramViewHolder.itemView;
      this.mOverdrawChild = ((View)localObject1);
      addChildDrawingOrderCallback();
    }
    int k = paramInt * 8 + 8;
    int m = (1 << k) + -1;
    i = 0;
    f1 = 0.0F;
    localObject1 = null;
    Object localObject2 = this.mSelected;
    Object localObject3;
    int n;
    label153:
    float f2;
    float f3;
    label222:
    int i1;
    label240:
    float f5;
    label379:
    int i2;
    if (localObject2 != null)
    {
      localObject3 = this.mSelected;
      localObject2 = ((RecyclerView.ViewHolder)localObject3).itemView.getParent();
      if (localObject2 == null) {
        break label725;
      }
      i = 2;
      f1 = 2.8E-45F;
      if (j == i)
      {
        n = 0;
        releaseVelocityTracker();
      }
    }
    else
    {
      switch (n)
      {
      default: 
        f2 = 0.0F;
        f3 = 0.0F;
        i = 2;
        f1 = 2.8E-45F;
        if (j == i)
        {
          i1 = 8;
          localObject1 = this.mTmpPosition;
          getSelectedDxDy((float[])localObject1);
          float f4 = this.mTmpPosition[0];
          localObject1 = this.mTmpPosition;
          k = 1;
          f5 = Float.MIN_VALUE;
          float f6 = localObject1[k];
          localObject1 = new android/support/v7/widget/helper/ItemTouchHelper$3;
          localObject2 = this;
          ((ItemTouchHelper.3)localObject1).<init>(this, (RecyclerView.ViewHolder)localObject3, i1, j, f4, f6, f2, f3, n, (RecyclerView.ViewHolder)localObject3);
          localObject2 = this.mCallback;
          localObject3 = this.mRecyclerView;
          float f7 = f2 - f4;
          f4 = f3 - f6;
          long l2 = ((ItemTouchHelper.Callback)localObject2).getAnimationDuration((RecyclerView)localObject3, i1, f7, f4);
          ((ItemTouchHelper.RecoverAnimation)localObject1).setDuration(l2);
          localObject2 = this.mRecoverAnimations;
          ((List)localObject2).add(localObject1);
          ((ItemTouchHelper.RecoverAnimation)localObject1).start();
          i = 1;
          f1 = Float.MIN_VALUE;
          k = 0;
          f5 = 0.0F;
          localObject2 = null;
          this.mSelected = null;
          k = i;
          f5 = f1;
          if (paramViewHolder != null)
          {
            localObject1 = this.mCallback;
            localObject3 = this.mRecyclerView;
            i = ((ItemTouchHelper.Callback)localObject1).getAbsoluteMovementFlags((RecyclerView)localObject3, paramViewHolder) & m;
            i2 = this.mActionState * 8;
            i >>= i2;
            this.mSelectedFlags = i;
            f1 = paramViewHolder.itemView.getLeft();
            this.mSelectedStartX = f1;
            localObject1 = paramViewHolder.itemView;
            f1 = ((View)localObject1).getTop();
            this.mSelectedStartY = f1;
            this.mSelected = paramViewHolder;
            i = 2;
            f1 = 2.8E-45F;
            if (paramInt == i)
            {
              localObject1 = this.mSelected.itemView;
              i2 = 0;
              localObject3 = null;
              ((View)localObject1).performHapticFeedback(0);
            }
          }
          localObject1 = this.mRecyclerView;
          localObject3 = ((RecyclerView)localObject1).getParent();
          if (localObject3 != null)
          {
            localObject1 = this.mSelected;
            if (localObject1 == null) {
              break label762;
            }
            i = 1;
            f1 = Float.MIN_VALUE;
          }
        }
        break;
      }
    }
    for (;;)
    {
      ((ViewParent)localObject3).requestDisallowInterceptTouchEvent(i);
      if (k == 0)
      {
        localObject1 = this.mRecyclerView.getLayoutManager();
        ((RecyclerView.LayoutManager)localObject1).requestSimpleAnimationsInNextLayout();
      }
      localObject1 = this.mCallback;
      localObject2 = this.mSelected;
      i2 = this.mActionState;
      ((ItemTouchHelper.Callback)localObject1).onSelectedChanged((RecyclerView.ViewHolder)localObject2, i2);
      localObject1 = this.mRecyclerView;
      ((RecyclerView)localObject1).invalidate();
      break;
      n = swipeIfNecessary((RecyclerView.ViewHolder)localObject3);
      break label153;
      f3 = 0.0F;
      f1 = Math.signum(this.mDx);
      localObject2 = this.mRecyclerView;
      k = ((RecyclerView)localObject2).getWidth();
      f5 = k;
      f2 = f1 * f5;
      break label222;
      f2 = 0.0F;
      f1 = Math.signum(this.mDy);
      localObject2 = this.mRecyclerView;
      k = ((RecyclerView)localObject2).getHeight();
      f5 = k;
      f3 = f1 * f5;
      break label222;
      if (n > 0)
      {
        i1 = 2;
        break label240;
      }
      i1 = 4;
      break label240;
      label725:
      localObject2 = ((RecyclerView.ViewHolder)localObject3).itemView;
      removeChildDrawingOrderCallbackIfNecessary((View)localObject2);
      localObject2 = this.mCallback;
      RecyclerView localRecyclerView = this.mRecyclerView;
      ((ItemTouchHelper.Callback)localObject2).clearView(localRecyclerView, (RecyclerView.ViewHolder)localObject3);
      break label379;
      label762:
      i = 0;
      f1 = 0.0F;
      localObject1 = null;
    }
  }
  
  public void startDrag(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = this.mCallback;
    Object localObject2 = this.mRecyclerView;
    boolean bool = ((ItemTouchHelper.Callback)localObject1).hasDragFlag((RecyclerView)localObject2, paramViewHolder);
    if (!bool)
    {
      localObject1 = "ItemTouchHelper";
      localObject2 = "Start drag has been called but dragging is not enabled";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = paramViewHolder.itemView.getParent();
      localObject2 = this.mRecyclerView;
      if (localObject1 != localObject2)
      {
        localObject1 = "ItemTouchHelper";
        localObject2 = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
        Log.e((String)localObject1, (String)localObject2);
      }
      else
      {
        obtainVelocityTracker();
        localObject1 = null;
        this.mDy = 0.0F;
        this.mDx = 0.0F;
        int i = 2;
        select(paramViewHolder, i);
      }
    }
  }
  
  public void startSwipe(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = this.mCallback;
    Object localObject2 = this.mRecyclerView;
    int i = ((ItemTouchHelper.Callback)localObject1).hasSwipeFlag((RecyclerView)localObject2, paramViewHolder);
    if (i == 0)
    {
      localObject1 = "ItemTouchHelper";
      localObject2 = "Start swipe has been called but swiping is not enabled";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = paramViewHolder.itemView.getParent();
      localObject2 = this.mRecyclerView;
      if (localObject1 != localObject2)
      {
        localObject1 = "ItemTouchHelper";
        localObject2 = "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.";
        Log.e((String)localObject1, (String)localObject2);
      }
      else
      {
        obtainVelocityTracker();
        localObject1 = null;
        this.mDy = 0.0F;
        this.mDx = 0.0F;
        i = 1;
        select(paramViewHolder, i);
      }
    }
  }
  
  void updateDxDy(MotionEvent paramMotionEvent, int paramInt1, int paramInt2)
  {
    float f1 = paramMotionEvent.getX(paramInt2);
    float f2 = paramMotionEvent.getY(paramInt2);
    float f3 = this.mInitialTouchX;
    f1 -= f3;
    this.mDx = f1;
    f1 = this.mInitialTouchY;
    f1 = f2 - f1;
    this.mDy = f1;
    int i = paramInt1 & 0x4;
    if (i == 0)
    {
      f1 = this.mDx;
      f1 = Math.max(0.0F, f1);
      this.mDx = f1;
    }
    i = paramInt1 & 0x8;
    if (i == 0)
    {
      f1 = this.mDx;
      f1 = Math.min(0.0F, f1);
      this.mDx = f1;
    }
    i = paramInt1 & 0x1;
    if (i == 0)
    {
      f1 = this.mDy;
      f1 = Math.max(0.0F, f1);
      this.mDy = f1;
    }
    i = paramInt1 & 0x2;
    if (i == 0)
    {
      f1 = this.mDy;
      f1 = Math.min(0.0F, f1);
      this.mDy = f1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */