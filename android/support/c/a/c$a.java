package android.support.c.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v4.h.a;
import java.util.ArrayList;

class c$a
  extends Drawable.ConstantState
{
  int a;
  i b;
  AnimatorSet c;
  a d;
  private ArrayList e;
  
  public c$a(Context paramContext, a parama, Drawable.Callback paramCallback, Resources paramResources)
  {
    if (parama != null)
    {
      int j = parama.a;
      this.a = j;
      Object localObject1 = parama.b;
      if (localObject1 != null)
      {
        localObject1 = parama.b.getConstantState();
        if (paramResources == null) {
          break label281;
        }
        localObject1 = (i)((Drawable.ConstantState)localObject1).newDrawable(paramResources);
      }
      for (this.b = ((i)localObject1);; this.b = ((i)localObject1))
      {
        localObject1 = (i)this.b.mutate();
        this.b = ((i)localObject1);
        this.b.setCallback(paramCallback);
        localObject1 = this.b;
        Rect localRect = parama.b.getBounds();
        ((i)localObject1).setBounds(localRect);
        localObject1 = this.b;
        ((i)localObject1).a(false);
        localObject1 = parama.e;
        if (localObject1 == null) {
          return;
        }
        int k = parama.e.size();
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(k);
        this.e = ((ArrayList)localObject1);
        localObject1 = new android/support/v4/h/a;
        ((a)localObject1).<init>(k);
        this.d = ((a)localObject1);
        while (i < k)
        {
          localObject1 = (Animator)parama.e.get(i);
          Animator localAnimator = ((Animator)localObject1).clone();
          localObject1 = (String)parama.d.get(localObject1);
          Object localObject2 = this.b.a((String)localObject1);
          localAnimator.setTarget(localObject2);
          this.e.add(localAnimator);
          localObject2 = this.d;
          ((a)localObject2).put(localAnimator, localObject1);
          j = i + 1;
          i = j;
        }
        label281:
        localObject1 = (i)((Drawable.ConstantState)localObject1).newDrawable();
      }
      a();
    }
  }
  
  public void a()
  {
    AnimatorSet localAnimatorSet = this.c;
    if (localAnimatorSet == null)
    {
      localAnimatorSet = new android/animation/AnimatorSet;
      localAnimatorSet.<init>();
      this.c = localAnimatorSet;
    }
    localAnimatorSet = this.c;
    ArrayList localArrayList = this.e;
    localAnimatorSet.playTogether(localArrayList);
  }
  
  public int getChangingConfigurations()
  {
    return this.a;
  }
  
  public Drawable newDrawable()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("No constant state support for SDK < 24.");
    throw localIllegalStateException;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("No constant state support for SDK < 24.");
    throw localIllegalStateException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */