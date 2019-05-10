package android.support.v7.widget;

import android.support.v4.view.r;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class RecyclerView$ViewHolder
{
  static final int FLAG_ADAPTER_FULLUPDATE = 1024;
  static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
  static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
  static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
  static final int FLAG_BOUND = 1;
  static final int FLAG_IGNORE = 128;
  static final int FLAG_INVALID = 4;
  static final int FLAG_MOVED = 2048;
  static final int FLAG_NOT_RECYCLABLE = 16;
  static final int FLAG_REMOVED = 8;
  static final int FLAG_RETURNED_FROM_SCRAP = 32;
  static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
  static final int FLAG_TMP_DETACHED = 256;
  static final int FLAG_UPDATE = 2;
  private static final List FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
  static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = 255;
  public final View itemView;
  private int mFlags;
  private boolean mInChangeScrap;
  private int mIsRecyclableCount;
  long mItemId;
  int mItemViewType;
  WeakReference mNestedRecyclerView;
  int mOldPosition;
  RecyclerView mOwnerRecyclerView;
  List mPayloads;
  int mPendingAccessibilityState;
  int mPosition;
  int mPreLayoutPosition;
  private RecyclerView.Recycler mScrapContainer;
  ViewHolder mShadowedHolder;
  ViewHolder mShadowingHolder;
  List mUnmodifiedPayloads;
  private int mWasImportantForAccessibilityBeforeHidden;
  
  public RecyclerView$ViewHolder(View paramView)
  {
    this.mPosition = i;
    this.mOldPosition = i;
    long l = -1;
    this.mItemId = l;
    this.mItemViewType = i;
    this.mPreLayoutPosition = i;
    this.mShadowedHolder = null;
    this.mShadowingHolder = null;
    this.mPayloads = null;
    this.mUnmodifiedPayloads = null;
    this.mIsRecyclableCount = 0;
    this.mScrapContainer = null;
    this.mInChangeScrap = false;
    this.mWasImportantForAccessibilityBeforeHidden = 0;
    this.mPendingAccessibilityState = i;
    if (paramView == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("itemView may not be null");
      throw localIllegalArgumentException;
    }
    this.itemView = paramView;
  }
  
  private void createPayloadsIfNeeded()
  {
    Object localObject = this.mPayloads;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.mPayloads = ((List)localObject);
      localObject = Collections.unmodifiableList(this.mPayloads);
      this.mUnmodifiedPayloads = ((List)localObject);
    }
  }
  
  private boolean doesTransientStatePreventRecycling()
  {
    int i = this.mFlags & 0x10;
    View localView;
    boolean bool;
    if (i == 0)
    {
      localView = this.itemView;
      bool = r.b(localView);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  private void onEnteredHiddenState(RecyclerView paramRecyclerView)
  {
    int i = this.mPendingAccessibilityState;
    int j = -1;
    if (i != j) {
      i = this.mPendingAccessibilityState;
    }
    for (this.mWasImportantForAccessibilityBeforeHidden = i;; this.mWasImportantForAccessibilityBeforeHidden = i)
    {
      paramRecyclerView.setChildImportantForAccessibilityInternal(this, 4);
      return;
      View localView = this.itemView;
      i = r.d(localView);
    }
  }
  
  private void onLeftHiddenState(RecyclerView paramRecyclerView)
  {
    int i = this.mWasImportantForAccessibilityBeforeHidden;
    paramRecyclerView.setChildImportantForAccessibilityInternal(this, i);
    this.mWasImportantForAccessibilityBeforeHidden = 0;
  }
  
  private boolean shouldBeKeptAsChild()
  {
    int i = this.mFlags & 0x10;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  void addChangePayload(Object paramObject)
  {
    int i;
    if (paramObject == null)
    {
      i = 1024;
      addFlags(i);
    }
    for (;;)
    {
      return;
      i = this.mFlags & 0x400;
      if (i == 0)
      {
        createPayloadsIfNeeded();
        List localList = this.mPayloads;
        localList.add(paramObject);
      }
    }
  }
  
  void addFlags(int paramInt)
  {
    int i = this.mFlags | paramInt;
    this.mFlags = i;
  }
  
  void clearOldPosition()
  {
    int i = -1;
    this.mOldPosition = i;
    this.mPreLayoutPosition = i;
  }
  
  void clearPayload()
  {
    List localList = this.mPayloads;
    if (localList != null)
    {
      localList = this.mPayloads;
      localList.clear();
    }
    int i = this.mFlags & 0xFBFF;
    this.mFlags = i;
  }
  
  void clearReturnedFromScrapFlag()
  {
    int i = this.mFlags & 0xFFFFFFDF;
    this.mFlags = i;
  }
  
  void clearTmpDetachFlag()
  {
    int i = this.mFlags & 0xFEFF;
    this.mFlags = i;
  }
  
  void flagRemovedAndOffsetPosition(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    addFlags(8);
    offsetPosition(paramInt2, paramBoolean);
    this.mPosition = paramInt1;
  }
  
  public final int getAdapterPosition()
  {
    RecyclerView localRecyclerView = this.mOwnerRecyclerView;
    if (localRecyclerView == null) {}
    for (int i = -1;; i = localRecyclerView.getAdapterPositionFor(this))
    {
      return i;
      localRecyclerView = this.mOwnerRecyclerView;
    }
  }
  
  public final long getItemId()
  {
    return this.mItemId;
  }
  
  public final int getItemViewType()
  {
    return this.mItemViewType;
  }
  
  public final int getLayoutPosition()
  {
    int i = this.mPreLayoutPosition;
    int j = -1;
    if (i == j) {}
    for (i = this.mPosition;; i = this.mPreLayoutPosition) {
      return i;
    }
  }
  
  public final int getOldPosition()
  {
    return this.mOldPosition;
  }
  
  public final int getPosition()
  {
    int i = this.mPreLayoutPosition;
    int j = -1;
    if (i == j) {}
    for (i = this.mPosition;; i = this.mPreLayoutPosition) {
      return i;
    }
  }
  
  List getUnmodifiedPayloads()
  {
    int i = this.mFlags & 0x400;
    List localList;
    if (i == 0)
    {
      localList = this.mPayloads;
      if (localList != null)
      {
        localList = this.mPayloads;
        i = localList.size();
        if (i != 0) {}
      }
      else
      {
        localList = FULLUPDATE_PAYLOADS;
      }
    }
    for (;;)
    {
      return localList;
      localList = this.mUnmodifiedPayloads;
      continue;
      localList = FULLUPDATE_PAYLOADS;
    }
  }
  
  boolean hasAnyOfTheFlags(int paramInt)
  {
    int i = this.mFlags & paramInt;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isAdapterPositionUnknown()
  {
    int i = this.mFlags & 0x200;
    if (i == 0)
    {
      bool = isInvalid();
      if (!bool) {
        break label26;
      }
    }
    label26:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  boolean isBound()
  {
    int i = this.mFlags & 0x1;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isInvalid()
  {
    int i = this.mFlags & 0x4;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final boolean isRecyclable()
  {
    int i = this.mFlags & 0x10;
    View localView;
    boolean bool;
    if (i == 0)
    {
      localView = this.itemView;
      bool = r.b(localView);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  boolean isRemoved()
  {
    int i = this.mFlags & 0x8;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isScrap()
  {
    RecyclerView.Recycler localRecycler = this.mScrapContainer;
    boolean bool;
    if (localRecycler != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRecycler = null;
    }
  }
  
  boolean isTmpDetached()
  {
    int i = this.mFlags & 0x100;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isUpdated()
  {
    int i = this.mFlags & 0x2;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean needsUpdate()
  {
    int i = this.mFlags & 0x2;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  void offsetPosition(int paramInt, boolean paramBoolean)
  {
    int i = -1;
    int j = this.mOldPosition;
    if (j == i)
    {
      j = this.mPosition;
      this.mOldPosition = j;
    }
    j = this.mPreLayoutPosition;
    if (j == i)
    {
      j = this.mPosition;
      this.mPreLayoutPosition = j;
    }
    if (paramBoolean)
    {
      j = this.mPreLayoutPosition + paramInt;
      this.mPreLayoutPosition = j;
    }
    j = this.mPosition + paramInt;
    this.mPosition = j;
    Object localObject = this.itemView.getLayoutParams();
    if (localObject != null)
    {
      localObject = (RecyclerView.LayoutParams)this.itemView.getLayoutParams();
      i = 1;
      ((RecyclerView.LayoutParams)localObject).mInsetsDirty = i;
    }
  }
  
  void resetInternal()
  {
    int i = -1;
    this.mFlags = 0;
    this.mPosition = i;
    this.mOldPosition = i;
    this.mItemId = -1;
    this.mPreLayoutPosition = i;
    this.mIsRecyclableCount = 0;
    this.mShadowedHolder = null;
    this.mShadowingHolder = null;
    clearPayload();
    this.mWasImportantForAccessibilityBeforeHidden = 0;
    this.mPendingAccessibilityState = i;
    RecyclerView.clearNestedRecyclerViewIfNotNested(this);
  }
  
  void saveOldPosition()
  {
    int i = this.mOldPosition;
    int j = -1;
    if (i == j)
    {
      i = this.mPosition;
      this.mOldPosition = i;
    }
  }
  
  void setFlags(int paramInt1, int paramInt2)
  {
    int i = this.mFlags;
    int j = paramInt2 ^ 0xFFFFFFFF;
    i &= j;
    j = paramInt1 & paramInt2;
    i |= j;
    this.mFlags = i;
  }
  
  public final void setIsRecyclable(boolean paramBoolean)
  {
    int i;
    if (paramBoolean)
    {
      i = this.mIsRecyclableCount + -1;
      this.mIsRecyclableCount = i;
      i = this.mIsRecyclableCount;
      if (i >= 0) {
        break label83;
      }
      i = 0;
      this.mIsRecyclableCount = 0;
      String str1 = "View";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ";
      localObject = str2 + this;
      Log.e(str1, (String)localObject);
    }
    for (;;)
    {
      return;
      i = this.mIsRecyclableCount + 1;
      break;
      label83:
      if (!paramBoolean)
      {
        i = this.mIsRecyclableCount;
        int j = 1;
        if (i == j)
        {
          i = this.mFlags | 0x10;
          this.mFlags = i;
          continue;
        }
      }
      if (paramBoolean)
      {
        i = this.mIsRecyclableCount;
        if (i == 0)
        {
          i = this.mFlags & 0xFFFFFFEF;
          this.mFlags = i;
        }
      }
    }
  }
  
  void setScrapContainer(RecyclerView.Recycler paramRecycler, boolean paramBoolean)
  {
    this.mScrapContainer = paramRecycler;
    this.mInChangeScrap = paramBoolean;
  }
  
  boolean shouldIgnore()
  {
    int i = this.mFlags & 0x80;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  void stopIgnoring()
  {
    int i = this.mFlags & 0xFF7F;
    this.mFlags = i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("ViewHolder{");
    Object localObject2 = Integer.toHexString(hashCode());
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" position=");
    int i = this.mPosition;
    localObject1 = ((StringBuilder)localObject1).append(i).append(" id=");
    long l = this.mItemId;
    localObject1 = ((StringBuilder)localObject1).append(l).append(", oldPos=");
    i = this.mOldPosition;
    localObject1 = ((StringBuilder)localObject1).append(i);
    localObject2 = ", pLpos:";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    i = this.mPreLayoutPosition;
    localObject1 = i;
    localStringBuilder.<init>((String)localObject1);
    boolean bool = isScrap();
    if (bool)
    {
      localObject1 = " scrap ";
      localObject2 = localStringBuilder.append((String)localObject1);
      bool = this.mInChangeScrap;
      if (!bool) {
        break label400;
      }
    }
    label400:
    for (localObject1 = "[changeScrap]";; localObject1 = "[attachedScrap]")
    {
      ((StringBuilder)localObject2).append((String)localObject1);
      bool = isInvalid();
      if (bool)
      {
        localObject1 = " invalid";
        localStringBuilder.append((String)localObject1);
      }
      bool = isBound();
      if (!bool)
      {
        localObject1 = " unbound";
        localStringBuilder.append((String)localObject1);
      }
      bool = needsUpdate();
      if (bool)
      {
        localObject1 = " update";
        localStringBuilder.append((String)localObject1);
      }
      bool = isRemoved();
      if (bool)
      {
        localObject1 = " removed";
        localStringBuilder.append((String)localObject1);
      }
      bool = shouldIgnore();
      if (bool)
      {
        localObject1 = " ignored";
        localStringBuilder.append((String)localObject1);
      }
      bool = isTmpDetached();
      if (bool)
      {
        localObject1 = " tmpDetached";
        localStringBuilder.append((String)localObject1);
      }
      bool = isRecyclable();
      if (!bool)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append(" not recyclable(");
        i = this.mIsRecyclableCount;
        localObject1 = ((StringBuilder)localObject1).append(i);
        localObject2 = ")";
        localObject1 = (String)localObject2;
        localStringBuilder.append((String)localObject1);
      }
      bool = isAdapterPositionUnknown();
      if (bool)
      {
        localObject1 = " undefined adapter position";
        localStringBuilder.append((String)localObject1);
      }
      localObject1 = this.itemView.getParent();
      if (localObject1 == null)
      {
        localObject1 = " no parent";
        localStringBuilder.append((String)localObject1);
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
  
  void unScrap()
  {
    this.mScrapContainer.unscrapView(this);
  }
  
  boolean wasReturnedFromScrap()
  {
    int i = this.mFlags & 0x20;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$ViewHolder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */