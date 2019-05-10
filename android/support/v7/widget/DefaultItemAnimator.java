package android.support.v7.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.r;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DefaultItemAnimator
  extends SimpleItemAnimator
{
  private static final boolean DEBUG;
  private static TimeInterpolator sDefaultInterpolator;
  ArrayList mAddAnimations;
  ArrayList mAdditionsList;
  ArrayList mChangeAnimations;
  ArrayList mChangesList;
  ArrayList mMoveAnimations;
  ArrayList mMovesList;
  private ArrayList mPendingAdditions;
  private ArrayList mPendingChanges;
  private ArrayList mPendingMoves;
  private ArrayList mPendingRemovals;
  ArrayList mRemoveAnimations;
  
  public DefaultItemAnimator()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mPendingRemovals = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mPendingAdditions = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mPendingMoves = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mPendingChanges = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mAdditionsList = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mMovesList = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mChangesList = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mAddAnimations = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mMoveAnimations = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mRemoveAnimations = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mChangeAnimations = localArrayList;
  }
  
  private void animateRemoveImpl(RecyclerView.ViewHolder paramViewHolder)
  {
    View localView = paramViewHolder.itemView;
    ViewPropertyAnimator localViewPropertyAnimator1 = localView.animate();
    this.mRemoveAnimations.add(paramViewHolder);
    long l = getRemoveDuration();
    ViewPropertyAnimator localViewPropertyAnimator2 = localViewPropertyAnimator1.setDuration(l).alpha(0.0F);
    DefaultItemAnimator.4 local4 = new android/support/v7/widget/DefaultItemAnimator$4;
    local4.<init>(this, paramViewHolder, localViewPropertyAnimator1, localView);
    localViewPropertyAnimator2.setListener(local4).start();
  }
  
  private void endChangeAnimation(List paramList, RecyclerView.ViewHolder paramViewHolder)
  {
    int i = paramList.size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      DefaultItemAnimator.ChangeInfo localChangeInfo = (DefaultItemAnimator.ChangeInfo)paramList.get(j);
      boolean bool = endChangeAnimationIfNecessary(localChangeInfo, paramViewHolder);
      if (bool)
      {
        RecyclerView.ViewHolder localViewHolder = localChangeInfo.oldHolder;
        if (localViewHolder == null)
        {
          localViewHolder = localChangeInfo.newHolder;
          if (localViewHolder == null) {
            paramList.remove(localChangeInfo);
          }
        }
      }
      i = j + -1;
    }
  }
  
  private void endChangeAnimationIfNecessary(DefaultItemAnimator.ChangeInfo paramChangeInfo)
  {
    RecyclerView.ViewHolder localViewHolder = paramChangeInfo.oldHolder;
    if (localViewHolder != null)
    {
      localViewHolder = paramChangeInfo.oldHolder;
      endChangeAnimationIfNecessary(paramChangeInfo, localViewHolder);
    }
    localViewHolder = paramChangeInfo.newHolder;
    if (localViewHolder != null)
    {
      localViewHolder = paramChangeInfo.newHolder;
      endChangeAnimationIfNecessary(paramChangeInfo, localViewHolder);
    }
  }
  
  private boolean endChangeAnimationIfNecessary(DefaultItemAnimator.ChangeInfo paramChangeInfo, RecyclerView.ViewHolder paramViewHolder)
  {
    float f = 0.0F;
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject = paramChangeInfo.newHolder;
    if (localObject == paramViewHolder) {
      paramChangeInfo.newHolder = null;
    }
    for (;;)
    {
      localObject = paramViewHolder.itemView;
      f = 1.0F;
      ((View)localObject).setAlpha(f);
      paramViewHolder.itemView.setTranslationX(0.0F);
      localObject = paramViewHolder.itemView;
      ((View)localObject).setTranslationY(0.0F);
      dispatchChangeFinished(paramViewHolder, bool2);
      bool2 = bool1;
      do
      {
        return bool2;
        localObject = paramChangeInfo.oldHolder;
      } while (localObject != paramViewHolder);
      paramChangeInfo.oldHolder = null;
      bool2 = bool1;
    }
  }
  
  private void resetAnimation(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject = sDefaultInterpolator;
    if (localObject == null)
    {
      localObject = new android/animation/ValueAnimator;
      ((ValueAnimator)localObject).<init>();
      localObject = ((ValueAnimator)localObject).getInterpolator();
      sDefaultInterpolator = (TimeInterpolator)localObject;
    }
    localObject = paramViewHolder.itemView.animate();
    TimeInterpolator localTimeInterpolator = sDefaultInterpolator;
    ((ViewPropertyAnimator)localObject).setInterpolator(localTimeInterpolator);
    endAnimation(paramViewHolder);
  }
  
  public boolean animateAdd(RecyclerView.ViewHolder paramViewHolder)
  {
    resetAnimation(paramViewHolder);
    paramViewHolder.itemView.setAlpha(0.0F);
    this.mPendingAdditions.add(paramViewHolder);
    return true;
  }
  
  void animateAddImpl(RecyclerView.ViewHolder paramViewHolder)
  {
    View localView = paramViewHolder.itemView;
    ViewPropertyAnimator localViewPropertyAnimator1 = localView.animate();
    this.mAddAnimations.add(paramViewHolder);
    ViewPropertyAnimator localViewPropertyAnimator2 = localViewPropertyAnimator1.alpha(1.0F);
    long l = getAddDuration();
    localViewPropertyAnimator2 = localViewPropertyAnimator2.setDuration(l);
    DefaultItemAnimator.5 local5 = new android/support/v7/widget/DefaultItemAnimator$5;
    local5.<init>(this, paramViewHolder, localView, localViewPropertyAnimator1);
    localViewPropertyAnimator2.setListener(local5).start();
  }
  
  public boolean animateChange(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1;
    Object localObject2;
    int i;
    int j;
    boolean bool;
    if (paramViewHolder1 == paramViewHolder2)
    {
      localObject1 = this;
      localObject2 = paramViewHolder1;
      i = paramInt2;
      j = paramInt3;
      bool = animateMove(paramViewHolder1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    for (;;)
    {
      return bool;
      float f1 = paramViewHolder1.itemView.getTranslationX();
      localObject2 = paramViewHolder1.itemView;
      float f2 = ((View)localObject2).getTranslationY();
      Object localObject3 = paramViewHolder1.itemView;
      float f3 = ((View)localObject3).getAlpha();
      resetAnimation(paramViewHolder1);
      float f4 = paramInt3 - paramInt1 - f1;
      i = (int)f4;
      float f5 = paramInt4 - paramInt2 - f2;
      j = (int)f5;
      View localView = paramViewHolder1.itemView;
      localView.setTranslationX(f1);
      paramViewHolder1.itemView.setTranslationY(f2);
      localObject1 = paramViewHolder1.itemView;
      ((View)localObject1).setAlpha(f3);
      if (paramViewHolder2 != null)
      {
        resetAnimation(paramViewHolder2);
        localObject1 = paramViewHolder2.itemView;
        f2 = -i;
        ((View)localObject1).setTranslationX(f2);
        localObject1 = paramViewHolder2.itemView;
        f2 = -j;
        ((View)localObject1).setTranslationY(f2);
        localObject1 = paramViewHolder2.itemView;
        f2 = 0.0F;
        localObject2 = null;
        ((View)localObject1).setAlpha(0.0F);
      }
      ArrayList localArrayList = this.mPendingChanges;
      localObject1 = new android/support/v7/widget/DefaultItemAnimator$ChangeInfo;
      localObject2 = paramViewHolder1;
      localObject3 = paramViewHolder2;
      i = paramInt1;
      j = paramInt2;
      ((DefaultItemAnimator.ChangeInfo)localObject1).<init>(paramViewHolder1, paramViewHolder2, paramInt1, paramInt2, paramInt3, paramInt4);
      localArrayList.add(localObject1);
      bool = true;
      f1 = Float.MIN_VALUE;
    }
  }
  
  void animateChangeImpl(DefaultItemAnimator.ChangeInfo paramChangeInfo)
  {
    View localView = null;
    Object localObject1 = paramChangeInfo.oldHolder;
    if (localObject1 == null) {}
    for (localObject1 = null;; localObject1 = ((RecyclerView.ViewHolder)localObject1).itemView)
    {
      Object localObject2 = paramChangeInfo.newHolder;
      if (localObject2 != null) {
        localView = ((RecyclerView.ViewHolder)localObject2).itemView;
      }
      long l;
      Object localObject3;
      int i;
      float f;
      if (localObject1 != null)
      {
        localObject2 = ((View)localObject1).animate();
        l = getChangeDuration();
        localObject2 = ((ViewPropertyAnimator)localObject2).setDuration(l);
        localObject3 = this.mChangeAnimations;
        Object localObject4 = paramChangeInfo.oldHolder;
        ((ArrayList)localObject3).add(localObject4);
        i = paramChangeInfo.toX;
        int j = paramChangeInfo.fromX;
        f = i - j;
        ((ViewPropertyAnimator)localObject2).translationX(f);
        i = paramChangeInfo.toY;
        j = paramChangeInfo.fromY;
        i -= j;
        f = i;
        ((ViewPropertyAnimator)localObject2).translationY(f);
        localObject3 = ((ViewPropertyAnimator)localObject2).alpha(0.0F);
        localObject4 = new android/support/v7/widget/DefaultItemAnimator$7;
        ((DefaultItemAnimator.7)localObject4).<init>(this, paramChangeInfo, (ViewPropertyAnimator)localObject2, (View)localObject1);
        localObject1 = ((ViewPropertyAnimator)localObject3).setListener((Animator.AnimatorListener)localObject4);
        ((ViewPropertyAnimator)localObject1).start();
      }
      if (localView != null)
      {
        localObject1 = localView.animate();
        localObject2 = this.mChangeAnimations;
        localObject3 = paramChangeInfo.newHolder;
        ((ArrayList)localObject2).add(localObject3);
        localObject2 = ((ViewPropertyAnimator)localObject1).translationX(0.0F).translationY(0.0F);
        l = getChangeDuration();
        localObject2 = ((ViewPropertyAnimator)localObject2).setDuration(l);
        i = 1065353216;
        f = 1.0F;
        localObject2 = ((ViewPropertyAnimator)localObject2).alpha(f);
        localObject3 = new android/support/v7/widget/DefaultItemAnimator$8;
        ((DefaultItemAnimator.8)localObject3).<init>(this, paramChangeInfo, (ViewPropertyAnimator)localObject1, localView);
        localObject1 = ((ViewPropertyAnimator)localObject2).setListener((Animator.AnimatorListener)localObject3);
        ((ViewPropertyAnimator)localObject1).start();
      }
      return;
    }
  }
  
  public boolean animateMove(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1 = paramViewHolder.itemView;
    int i = (int)paramViewHolder.itemView.getTranslationX();
    int j = paramInt1 + i;
    Object localObject2 = paramViewHolder.itemView;
    float f = ((View)localObject2).getTranslationY();
    i = (int)f;
    int k = paramInt2 + i;
    resetAnimation(paramViewHolder);
    i = paramInt3 - j;
    int m = paramInt4 - k;
    boolean bool;
    if ((i == 0) && (m == 0))
    {
      dispatchMoveFinished(paramViewHolder);
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      if (i != 0)
      {
        i = -i;
        f = i;
        ((View)localObject1).setTranslationX(f);
      }
      if (m != 0)
      {
        i = -m;
        f = i;
        ((View)localObject1).setTranslationY(f);
      }
      ArrayList localArrayList = this.mPendingMoves;
      localObject1 = new android/support/v7/widget/DefaultItemAnimator$MoveInfo;
      localObject2 = paramViewHolder;
      m = paramInt3;
      ((DefaultItemAnimator.MoveInfo)localObject1).<init>(paramViewHolder, j, k, paramInt3, paramInt4);
      localArrayList.add(localObject1);
      bool = true;
    }
  }
  
  void animateMoveImpl(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramViewHolder.itemView;
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    if (i != 0)
    {
      localObject = localView.animate();
      ((ViewPropertyAnimator)localObject).translationX(0.0F);
    }
    if (j != 0)
    {
      localObject = localView.animate();
      ((ViewPropertyAnimator)localObject).translationY(0.0F);
    }
    ViewPropertyAnimator localViewPropertyAnimator1 = localView.animate();
    this.mMoveAnimations.add(paramViewHolder);
    long l = getMoveDuration();
    ViewPropertyAnimator localViewPropertyAnimator2 = localViewPropertyAnimator1.setDuration(l);
    Object localObject = new android/support/v7/widget/DefaultItemAnimator$6;
    ((DefaultItemAnimator.6)localObject).<init>(this, paramViewHolder, i, localView, j, localViewPropertyAnimator1);
    localViewPropertyAnimator2.setListener((Animator.AnimatorListener)localObject).start();
  }
  
  public boolean animateRemove(RecyclerView.ViewHolder paramViewHolder)
  {
    resetAnimation(paramViewHolder);
    this.mPendingRemovals.add(paramViewHolder);
    return true;
  }
  
  public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder paramViewHolder, List paramList)
  {
    boolean bool = paramList.isEmpty();
    if (bool)
    {
      bool = super.canReuseUpdatedViewHolder(paramViewHolder, paramList);
      if (!bool) {
        break label26;
      }
    }
    label26:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  void cancelAll(List paramList)
  {
    int i = paramList.size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      ViewPropertyAnimator localViewPropertyAnimator = ((RecyclerView.ViewHolder)paramList.get(j)).itemView.animate();
      localViewPropertyAnimator.cancel();
      i = j + -1;
    }
  }
  
  void dispatchFinishedWhenDone()
  {
    boolean bool = isRunning();
    if (!bool) {
      dispatchAnimationsFinished();
    }
  }
  
  public void endAnimation(RecyclerView.ViewHolder paramViewHolder)
  {
    float f = 1.0F;
    View localView = paramViewHolder.itemView;
    localView.animate().cancel();
    Object localObject = this.mPendingMoves;
    int i = ((ArrayList)localObject).size() + -1;
    for (int i1 = i; i1 >= 0; i1 = i)
    {
      localObject = ((DefaultItemAnimator.MoveInfo)this.mPendingMoves.get(i1)).holder;
      if (localObject == paramViewHolder)
      {
        localView.setTranslationY(0.0F);
        localView.setTranslationX(0.0F);
        dispatchMoveFinished(paramViewHolder);
        localObject = this.mPendingMoves;
        ((ArrayList)localObject).remove(i1);
      }
      i = i1 + -1;
    }
    localObject = this.mPendingChanges;
    endChangeAnimation((List)localObject, paramViewHolder);
    localObject = this.mPendingRemovals;
    boolean bool1 = ((ArrayList)localObject).remove(paramViewHolder);
    if (bool1)
    {
      localView.setAlpha(f);
      dispatchRemoveFinished(paramViewHolder);
    }
    localObject = this.mPendingAdditions;
    bool1 = ((ArrayList)localObject).remove(paramViewHolder);
    if (bool1)
    {
      localView.setAlpha(f);
      dispatchAddFinished(paramViewHolder);
    }
    localObject = this.mChangesList;
    int j = ((ArrayList)localObject).size() + -1;
    for (i1 = j; i1 >= 0; i1 = k)
    {
      localObject = (ArrayList)this.mChangesList.get(i1);
      endChangeAnimation((List)localObject, paramViewHolder);
      boolean bool2 = ((ArrayList)localObject).isEmpty();
      if (bool2)
      {
        localObject = this.mChangesList;
        ((ArrayList)localObject).remove(i1);
      }
      k = i1 + -1;
    }
    localObject = this.mMovesList;
    int k = ((ArrayList)localObject).size() + -1;
    int i2 = k;
    if (i2 >= 0)
    {
      localObject = (ArrayList)this.mMovesList.get(i2);
      i1 = ((ArrayList)localObject).size() + -1;
      for (int i3 = i1;; i3 = i1)
      {
        if (i3 >= 0)
        {
          RecyclerView.ViewHolder localViewHolder = ((DefaultItemAnimator.MoveInfo)((ArrayList)localObject).get(i3)).holder;
          if (localViewHolder != paramViewHolder) {
            break label398;
          }
          localView.setTranslationY(0.0F);
          localView.setTranslationX(0.0F);
          dispatchMoveFinished(paramViewHolder);
          ((ArrayList)localObject).remove(i3);
          boolean bool3 = ((ArrayList)localObject).isEmpty();
          if (bool3)
          {
            localObject = this.mMovesList;
            ((ArrayList)localObject).remove(i2);
          }
        }
        m = i2 + -1;
        i2 = m;
        break;
        label398:
        i1 = i3 + -1;
      }
    }
    localObject = this.mAdditionsList;
    int m = ((ArrayList)localObject).size() + -1;
    int n;
    for (i1 = m; i1 >= 0; i1 = n)
    {
      localObject = (ArrayList)this.mAdditionsList.get(i1);
      boolean bool6 = ((ArrayList)localObject).remove(paramViewHolder);
      if (bool6)
      {
        localView.setAlpha(f);
        dispatchAddFinished(paramViewHolder);
        boolean bool4 = ((ArrayList)localObject).isEmpty();
        if (bool4)
        {
          localObject = this.mAdditionsList;
          ((ArrayList)localObject).remove(i1);
        }
      }
      n = i1 + -1;
    }
    localObject = this.mRemoveAnimations;
    boolean bool5 = ((ArrayList)localObject).remove(paramViewHolder);
    if (bool5) {}
    localObject = this.mAddAnimations;
    bool5 = ((ArrayList)localObject).remove(paramViewHolder);
    if (bool5) {}
    localObject = this.mChangeAnimations;
    bool5 = ((ArrayList)localObject).remove(paramViewHolder);
    if (bool5) {}
    localObject = this.mMoveAnimations;
    bool5 = ((ArrayList)localObject).remove(paramViewHolder);
    if (bool5) {}
    dispatchFinishedWhenDone();
  }
  
  public void endAnimations()
  {
    float f = 1.0F;
    Object localObject1 = this.mPendingMoves;
    int i = ((ArrayList)localObject1).size() + -1;
    View localView1;
    for (int k = i; k >= 0; k = i)
    {
      localObject1 = (DefaultItemAnimator.MoveInfo)this.mPendingMoves.get(k);
      localView1 = ((DefaultItemAnimator.MoveInfo)localObject1).holder.itemView;
      localView1.setTranslationY(0.0F);
      localView1.setTranslationX(0.0F);
      localObject1 = ((DefaultItemAnimator.MoveInfo)localObject1).holder;
      dispatchMoveFinished((RecyclerView.ViewHolder)localObject1);
      localObject1 = this.mPendingMoves;
      ((ArrayList)localObject1).remove(k);
      i = k + -1;
    }
    localObject1 = this.mPendingRemovals;
    i = ((ArrayList)localObject1).size() + -1;
    for (k = i; k >= 0; k = i)
    {
      localObject1 = (RecyclerView.ViewHolder)this.mPendingRemovals.get(k);
      dispatchRemoveFinished((RecyclerView.ViewHolder)localObject1);
      localObject1 = this.mPendingRemovals;
      ((ArrayList)localObject1).remove(k);
      i = k + -1;
    }
    localObject1 = this.mPendingAdditions;
    i = ((ArrayList)localObject1).size() + -1;
    for (k = i; k >= 0; k = i)
    {
      localObject1 = (RecyclerView.ViewHolder)this.mPendingAdditions.get(k);
      localView1 = ((RecyclerView.ViewHolder)localObject1).itemView;
      localView1.setAlpha(f);
      dispatchAddFinished((RecyclerView.ViewHolder)localObject1);
      localObject1 = this.mPendingAdditions;
      ((ArrayList)localObject1).remove(k);
      i = k + -1;
    }
    localObject1 = this.mPendingChanges;
    i = ((ArrayList)localObject1).size() + -1;
    for (k = i; k >= 0; k = i)
    {
      localObject1 = (DefaultItemAnimator.ChangeInfo)this.mPendingChanges.get(k);
      endChangeAnimationIfNecessary((DefaultItemAnimator.ChangeInfo)localObject1);
      i = k + -1;
    }
    localObject1 = this.mPendingChanges;
    ((ArrayList)localObject1).clear();
    boolean bool1 = isRunning();
    if (!bool1) {}
    for (;;)
    {
      return;
      localObject1 = this.mMovesList;
      int j = ((ArrayList)localObject1).size() + -1;
      int i3;
      Object localObject2;
      View localView2;
      int m;
      for (int i2 = j; i2 >= 0; i2 = j)
      {
        localObject1 = (ArrayList)this.mMovesList.get(i2);
        k = ((ArrayList)localObject1).size() + -1;
        for (i3 = k; i3 >= 0; i3 = m)
        {
          localObject2 = (DefaultItemAnimator.MoveInfo)((ArrayList)localObject1).get(i3);
          localView2 = ((DefaultItemAnimator.MoveInfo)localObject2).holder.itemView;
          localView2.setTranslationY(0.0F);
          localView2.setTranslationX(0.0F);
          localObject2 = ((DefaultItemAnimator.MoveInfo)localObject2).holder;
          dispatchMoveFinished((RecyclerView.ViewHolder)localObject2);
          ((ArrayList)localObject1).remove(i3);
          boolean bool2 = ((ArrayList)localObject1).isEmpty();
          if (bool2)
          {
            localObject2 = this.mMovesList;
            ((ArrayList)localObject2).remove(localObject1);
          }
          m = i3 + -1;
        }
        j = i2 + -1;
      }
      localObject1 = this.mAdditionsList;
      j = ((ArrayList)localObject1).size() + -1;
      int n;
      for (i2 = j; i2 >= 0; i2 = j)
      {
        localObject1 = (ArrayList)this.mAdditionsList.get(i2);
        m = ((ArrayList)localObject1).size() + -1;
        for (i3 = m; i3 >= 0; i3 = n)
        {
          localObject2 = (RecyclerView.ViewHolder)((ArrayList)localObject1).get(i3);
          localView2 = ((RecyclerView.ViewHolder)localObject2).itemView;
          localView2.setAlpha(f);
          dispatchAddFinished((RecyclerView.ViewHolder)localObject2);
          ((ArrayList)localObject1).remove(i3);
          boolean bool3 = ((ArrayList)localObject1).isEmpty();
          if (bool3)
          {
            localObject2 = this.mAdditionsList;
            ((ArrayList)localObject2).remove(localObject1);
          }
          n = i3 + -1;
        }
        j = i2 + -1;
      }
      localObject1 = this.mChangesList;
      j = ((ArrayList)localObject1).size() + -1;
      for (i2 = j; i2 >= 0; i2 = j)
      {
        localObject1 = (ArrayList)this.mChangesList.get(i2);
        n = ((ArrayList)localObject1).size() + -1;
        int i1;
        for (i3 = n; i3 >= 0; i3 = i1)
        {
          localObject2 = (DefaultItemAnimator.ChangeInfo)((ArrayList)localObject1).get(i3);
          endChangeAnimationIfNecessary((DefaultItemAnimator.ChangeInfo)localObject2);
          boolean bool4 = ((ArrayList)localObject1).isEmpty();
          if (bool4)
          {
            localObject2 = this.mChangesList;
            ((ArrayList)localObject2).remove(localObject1);
          }
          i1 = i3 + -1;
        }
        j = i2 + -1;
      }
      localObject1 = this.mRemoveAnimations;
      cancelAll((List)localObject1);
      localObject1 = this.mMoveAnimations;
      cancelAll((List)localObject1);
      localObject1 = this.mAddAnimations;
      cancelAll((List)localObject1);
      localObject1 = this.mChangeAnimations;
      cancelAll((List)localObject1);
      dispatchAnimationsFinished();
    }
  }
  
  public boolean isRunning()
  {
    ArrayList localArrayList = this.mPendingAdditions;
    boolean bool = localArrayList.isEmpty();
    if (bool)
    {
      localArrayList = this.mPendingChanges;
      bool = localArrayList.isEmpty();
      if (bool)
      {
        localArrayList = this.mPendingMoves;
        bool = localArrayList.isEmpty();
        if (bool)
        {
          localArrayList = this.mPendingRemovals;
          bool = localArrayList.isEmpty();
          if (bool)
          {
            localArrayList = this.mMoveAnimations;
            bool = localArrayList.isEmpty();
            if (bool)
            {
              localArrayList = this.mRemoveAnimations;
              bool = localArrayList.isEmpty();
              if (bool)
              {
                localArrayList = this.mAddAnimations;
                bool = localArrayList.isEmpty();
                if (bool)
                {
                  localArrayList = this.mChangeAnimations;
                  bool = localArrayList.isEmpty();
                  if (bool)
                  {
                    localArrayList = this.mMovesList;
                    bool = localArrayList.isEmpty();
                    if (bool)
                    {
                      localArrayList = this.mAdditionsList;
                      bool = localArrayList.isEmpty();
                      if (bool)
                      {
                        localArrayList = this.mChangesList;
                        bool = localArrayList.isEmpty();
                        if (bool) {
                          break label158;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    bool = true;
    for (;;)
    {
      return bool;
      label158:
      bool = false;
      localArrayList = null;
    }
  }
  
  public void runPendingAnimations()
  {
    long l1 = 0L;
    boolean bool1 = true;
    ArrayList localArrayList1 = this.mPendingRemovals;
    boolean bool2 = localArrayList1.isEmpty();
    ArrayList localArrayList2;
    boolean bool3;
    label46:
    ArrayList localArrayList3;
    boolean bool4;
    label67:
    ArrayList localArrayList4;
    boolean bool5;
    if (!bool2)
    {
      bool2 = bool1;
      localArrayList2 = this.mPendingMoves;
      bool3 = localArrayList2.isEmpty();
      if (bool3) {
        break label118;
      }
      bool3 = bool1;
      localArrayList3 = this.mPendingChanges;
      bool4 = localArrayList3.isEmpty();
      if (bool4) {
        break label127;
      }
      bool4 = bool1;
      localArrayList4 = this.mPendingAdditions;
      bool5 = localArrayList4.isEmpty();
      if (bool5) {
        break label136;
      }
      bool5 = bool1;
      label88:
      if ((bool2) || (bool3) || (bool5) || (bool4)) {
        break label145;
      }
    }
    for (;;)
    {
      return;
      bool2 = false;
      localArrayList1 = null;
      break;
      label118:
      bool3 = false;
      localArrayList2 = null;
      break label46;
      label127:
      bool4 = false;
      localArrayList3 = null;
      break label67;
      label136:
      bool5 = false;
      localArrayList4 = null;
      break label88;
      label145:
      Object localObject1 = this.mPendingRemovals;
      Object localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (RecyclerView.ViewHolder)((Iterator)localObject2).next();
        animateRemoveImpl((RecyclerView.ViewHolder)localObject1);
      }
      localObject1 = this.mPendingRemovals;
      ((ArrayList)localObject1).clear();
      long l2;
      label298:
      label394:
      DefaultItemAnimator.3 local3;
      label487:
      long l4;
      if (bool3)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject2 = this.mPendingMoves;
        ((ArrayList)localObject1).addAll((Collection)localObject2);
        this.mMovesList.add(localObject1);
        this.mPendingMoves.clear();
        localObject2 = new android/support/v7/widget/DefaultItemAnimator$1;
        ((DefaultItemAnimator.1)localObject2).<init>(this, (ArrayList)localObject1);
        if (bool2)
        {
          localObject1 = ((DefaultItemAnimator.MoveInfo)((ArrayList)localObject1).get(0)).holder.itemView;
          l2 = getRemoveDuration();
          r.a((View)localObject1, (Runnable)localObject2, l2);
        }
      }
      else
      {
        if (bool4)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject2 = this.mPendingChanges;
          ((ArrayList)localObject1).addAll((Collection)localObject2);
          this.mChangesList.add(localObject1);
          this.mPendingChanges.clear();
          localObject2 = new android/support/v7/widget/DefaultItemAnimator$2;
          ((DefaultItemAnimator.2)localObject2).<init>(this, (ArrayList)localObject1);
          if (!bool2) {
            break label563;
          }
          localObject1 = ((DefaultItemAnimator.ChangeInfo)((ArrayList)localObject1).get(0)).oldHolder.itemView;
          l2 = getRemoveDuration();
          r.a((View)localObject1, (Runnable)localObject2, l2);
        }
        if (!bool5) {
          break label571;
        }
        localArrayList4 = new java/util/ArrayList;
        localArrayList4.<init>();
        localObject1 = this.mPendingAdditions;
        localArrayList4.addAll((Collection)localObject1);
        this.mAdditionsList.add(localArrayList4);
        localObject1 = this.mPendingAdditions;
        ((ArrayList)localObject1).clear();
        local3 = new android/support/v7/widget/DefaultItemAnimator$3;
        local3.<init>(this, localArrayList4);
        if ((!bool2) && (!bool3) && (!bool4)) {
          break label591;
        }
        if (!bool2) {
          break label573;
        }
        l3 = getRemoveDuration();
        l2 = l3;
        if (!bool3) {
          break label579;
        }
        l3 = getMoveDuration();
        l4 = l3;
        label502:
        if (!bool4) {
          break label585;
        }
      }
      label563:
      label571:
      label573:
      label579:
      label585:
      for (long l3 = getChangeDuration();; l3 = l1)
      {
        l3 = Math.max(l4, l3);
        l1 = l2 + l3;
        localObject1 = ((RecyclerView.ViewHolder)localArrayList4.get(0)).itemView;
        r.a((View)localObject1, local3, l1);
        break;
        ((Runnable)localObject2).run();
        break label298;
        ((Runnable)localObject2).run();
        break label394;
        break;
        l2 = l1;
        break label487;
        l4 = l1;
        break label502;
      }
      label591:
      local3.run();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */