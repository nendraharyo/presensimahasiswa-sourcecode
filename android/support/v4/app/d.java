package android.support.v4.app;

import android.support.v4.h.e;
import android.util.Log;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

final class d
  extends p
  implements n.g
{
  final n a;
  ArrayList b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  boolean i;
  boolean j;
  String k;
  boolean l;
  int m;
  int n;
  CharSequence o;
  int p;
  CharSequence q;
  ArrayList r;
  ArrayList s;
  boolean t;
  ArrayList u;
  
  public d(n paramn)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.b = localArrayList;
    this.j = true;
    this.m = -1;
    this.t = false;
    this.a = paramn;
  }
  
  private void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    Object localObject1 = paramFragment.getClass();
    int i1 = ((Class)localObject1).getModifiers();
    boolean bool2 = ((Class)localObject1).isAnonymousClass();
    if (!bool2)
    {
      bool2 = Modifier.isPublic(i1);
      if (bool2)
      {
        bool2 = ((Class)localObject1).isMemberClass();
        if (!bool2) {
          break label124;
        }
        boolean bool1 = Modifier.isStatic(i1);
        if (bool1) {
          break label124;
        }
      }
    }
    Object localObject2 = new java/lang/IllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Fragment ");
    localObject1 = ((Class)localObject1).getCanonicalName();
    localObject1 = (String)localObject1 + " must be a public static class to be  properly recreated from" + " instance state.";
    ((IllegalStateException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
    label124:
    localObject1 = this.a;
    paramFragment.mFragmentManager = ((n)localObject1);
    if (paramString != null)
    {
      localObject1 = paramFragment.mTag;
      if (localObject1 != null)
      {
        localObject1 = paramFragment.mTag;
        boolean bool3 = paramString.equals(localObject1);
        if (!bool3)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Can't change tag of fragment ").append(paramFragment).append(": was ");
          localObject3 = paramFragment.mTag;
          localObject2 = (String)localObject3 + " now " + paramString;
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      paramFragment.mTag = paramString;
    }
    if (paramInt1 != 0)
    {
      int i3 = -1;
      if (paramInt1 == i3)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Can't add fragment " + paramFragment + " with tag " + paramString + " to container view with no id";
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      i3 = paramFragment.mFragmentId;
      if (i3 != 0)
      {
        i3 = paramFragment.mFragmentId;
        if (i3 != paramInt1)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Can't change container ID of fragment ").append(paramFragment).append(": was ");
          int i2 = paramFragment.mFragmentId;
          localObject2 = i2 + " now " + paramInt1;
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      paramFragment.mFragmentId = paramInt1;
      paramFragment.mContainerId = paramInt1;
    }
    localObject1 = new android/support/v4/app/d$a;
    ((d.a)localObject1).<init>(paramInt2, paramFragment);
    a((d.a)localObject1);
  }
  
  private static boolean b(d.a parama)
  {
    Fragment localFragment = parama.b;
    boolean bool2;
    if (localFragment != null)
    {
      boolean bool1 = localFragment.mAdded;
      if (bool1)
      {
        View localView = localFragment.mView;
        if (localView != null)
        {
          bool1 = localFragment.mDetached;
          if (!bool1)
          {
            bool1 = localFragment.mHidden;
            if (!bool1)
            {
              bool2 = localFragment.isPostponed();
              if (bool2) {
                bool2 = true;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localFragment = null;
    }
  }
  
  int a(boolean paramBoolean)
  {
    boolean bool = this.l;
    Object localObject1;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("commit already called");
      throw ((Throwable)localObject1);
    }
    bool = n.a;
    if (bool)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Commit: ";
      localObject2 = str + this;
      Log.v("FragmentManager", (String)localObject2);
      localObject1 = new android/support/v4/h/e;
      ((e)localObject1).<init>("FragmentManager");
      localObject2 = new java/io/PrintWriter;
      ((PrintWriter)localObject2).<init>((Writer)localObject1);
      localObject1 = "  ";
      a((String)localObject1, null, (PrintWriter)localObject2, null);
      ((PrintWriter)localObject2).close();
    }
    this.l = true;
    bool = this.i;
    int i1;
    if (bool)
    {
      localObject1 = this.a;
      i1 = ((n)localObject1).a(this);
    }
    for (this.m = i1;; this.m = i1)
    {
      this.a.a(this, paramBoolean);
      return this.m;
      i1 = -1;
    }
  }
  
  Fragment a(ArrayList paramArrayList, Fragment paramFragment)
  {
    int i1 = 0;
    Object localObject1 = null;
    int i2 = 0;
    Fragment localFragment1 = null;
    float f1 = 0.0F;
    localObject1 = this.b;
    i1 = ((ArrayList)localObject1).size();
    int i3;
    Object localObject2;
    Object localObject3;
    int i4;
    float f2;
    Fragment localFragment2;
    int i6;
    if (i2 < i1)
    {
      localObject1 = (d.a)this.b.get(i2);
      i3 = ((d.a)localObject1).a;
      switch (i3)
      {
      case 4: 
      case 5: 
      default: 
      case 1: 
      case 7: 
      case 3: 
      case 6: 
        for (;;)
        {
          i1 = i2 + 1;
          i2 = i1;
          break;
          localObject1 = ((d.a)localObject1).b;
          paramArrayList.add(localObject1);
          continue;
          localObject2 = ((d.a)localObject1).b;
          paramArrayList.remove(localObject2);
          localObject2 = ((d.a)localObject1).b;
          if (localObject2 == paramFragment)
          {
            localObject2 = this.b;
            localObject3 = new android/support/v4/app/d$a;
            i4 = 9;
            f2 = 1.3E-44F;
            localObject1 = ((d.a)localObject1).b;
            ((d.a)localObject3).<init>(i4, (Fragment)localObject1);
            ((ArrayList)localObject2).add(i2, localObject3);
            i2 += 1;
            paramFragment = null;
          }
        }
      case 2: 
        localFragment2 = ((d.a)localObject1).b;
        int i5 = localFragment2.mContainerId;
        i4 = 0;
        f2 = 0.0F;
        i6 = paramArrayList.size() + -1;
        localObject3 = paramFragment;
        i3 = i2;
        label245:
        if (i6 >= 0)
        {
          localFragment1 = (Fragment)paramArrayList.get(i6);
          int i7 = localFragment1.mContainerId;
          if (i7 != i5) {
            break label575;
          }
          if (localFragment1 == localFragment2)
          {
            i2 = 1;
            f1 = Float.MIN_VALUE;
          }
        }
        break;
      }
    }
    for (;;)
    {
      i6 += -1;
      i4 = i2;
      f2 = f1;
      break label245;
      if (localFragment1 == localObject3)
      {
        localObject3 = this.b;
        locala = new android/support/v4/app/d$a;
        i8 = 9;
        locala.<init>(i8, localFragment1);
        ((ArrayList)localObject3).add(i3, locala);
        i3 += 1;
        localObject3 = null;
      }
      d.a locala = new android/support/v4/app/d$a;
      locala.<init>(3, localFragment1);
      int i8 = ((d.a)localObject1).c;
      locala.c = i8;
      i8 = ((d.a)localObject1).e;
      locala.e = i8;
      i8 = ((d.a)localObject1).d;
      locala.d = i8;
      i8 = ((d.a)localObject1).f;
      locala.f = i8;
      ArrayList localArrayList = this.b;
      localArrayList.add(i3, locala);
      paramArrayList.remove(localFragment1);
      i3 += 1;
      i2 = i4;
      f1 = f2;
      continue;
      if (i4 != 0)
      {
        localObject1 = this.b;
        ((ArrayList)localObject1).remove(i3);
        i3 += -1;
      }
      for (;;)
      {
        i2 = i3;
        paramFragment = (Fragment)localObject3;
        break;
        i2 = 1;
        f1 = Float.MIN_VALUE;
        ((d.a)localObject1).a = i2;
        paramArrayList.add(localFragment2);
      }
      localObject2 = this.b;
      localObject3 = new android/support/v4/app/d$a;
      i4 = 9;
      f2 = 1.3E-44F;
      ((d.a)localObject3).<init>(i4, paramFragment);
      ((ArrayList)localObject2).add(i2, localObject3);
      i2 += 1;
      paramFragment = ((d.a)localObject1).b;
      break;
      return paramFragment;
      label575:
      i2 = i4;
      f1 = f2;
    }
  }
  
  public p a()
  {
    boolean bool = this.i;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("This transaction is already being added to the back stack");
      throw localIllegalStateException;
    }
    this.j = false;
    return this;
  }
  
  public p a(int paramInt, Fragment paramFragment)
  {
    return a(paramInt, paramFragment, null);
  }
  
  public p a(int paramInt, Fragment paramFragment, String paramString)
  {
    if (paramInt == 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Must use non-zero containerViewId");
      throw localIllegalArgumentException;
    }
    a(paramInt, paramFragment, paramString, 2);
    return this;
  }
  
  public p a(Fragment paramFragment)
  {
    d.a locala = new android/support/v4/app/d$a;
    locala.<init>(3, paramFragment);
    a(locala);
    return this;
  }
  
  public p a(Fragment paramFragment, String paramString)
  {
    a(0, paramFragment, paramString, 1);
    return this;
  }
  
  void a(int paramInt)
  {
    boolean bool1 = this.i;
    if (!bool1) {}
    for (;;)
    {
      return;
      bool1 = n.a;
      if (bool1)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Bump nesting in ").append(this);
        String str = " by ";
        localObject2 = str + paramInt;
        Log.v((String)localObject1, (String)localObject2);
      }
      int i2 = this.b.size();
      bool1 = false;
      Object localObject1 = null;
      int i3 = 0;
      Object localObject2 = null;
      while (i3 < i2)
      {
        localObject1 = (d.a)this.b.get(i3);
        Object localObject3 = ((d.a)localObject1).b;
        if (localObject3 != null)
        {
          localObject3 = ((d.a)localObject1).b;
          int i4 = ((Fragment)localObject3).mBackStackNesting + paramInt;
          ((Fragment)localObject3).mBackStackNesting = i4;
          boolean bool2 = n.a;
          if (bool2)
          {
            localObject3 = "FragmentManager";
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder = localStringBuilder.append("Bump nesting of ");
            Object localObject4 = ((d.a)localObject1).b;
            localStringBuilder = localStringBuilder.append(localObject4);
            localObject4 = " to ";
            localStringBuilder = localStringBuilder.append((String)localObject4);
            i1 = ((d.a)localObject1).b.mBackStackNesting;
            localObject1 = i1;
            Log.v((String)localObject3, (String)localObject1);
          }
        }
        int i1 = i3 + 1;
        i3 = i1;
      }
    }
  }
  
  void a(Fragment.c paramc)
  {
    int i1 = 0;
    Object localObject = null;
    for (int i2 = 0;; i2 = i1)
    {
      localObject = this.b;
      i1 = ((ArrayList)localObject).size();
      if (i2 >= i1) {
        break;
      }
      localObject = (d.a)this.b.get(i2);
      boolean bool = b((d.a)localObject);
      if (bool)
      {
        localObject = ((d.a)localObject).b;
        ((Fragment)localObject).setOnStartEnterTransitionListener(paramc);
      }
      i1 = i2 + 1;
    }
  }
  
  void a(d.a parama)
  {
    this.b.add(parama);
    int i1 = this.c;
    parama.c = i1;
    i1 = this.d;
    parama.d = i1;
    i1 = this.e;
    parama.e = i1;
    i1 = this.f;
    parama.f = i1;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    a(paramString, paramPrintWriter, true);
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      localObject1 = this.k;
      paramPrintWriter.print((String)localObject1);
      paramPrintWriter.print(" mIndex=");
      int i1 = this.m;
      paramPrintWriter.print(i1);
      localObject1 = " mCommitted=";
      paramPrintWriter.print((String)localObject1);
      boolean bool1 = this.l;
      paramPrintWriter.println(bool1);
      int i2 = this.g;
      if (i2 != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        localObject1 = Integer.toHexString(this.g);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mTransitionStyle=#");
        i2 = this.h;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.println((String)localObject1);
      }
      i2 = this.c;
      if (i2 == 0)
      {
        i2 = this.d;
        if (i2 == 0) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        localObject1 = Integer.toHexString(this.c);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mExitAnim=#");
        i2 = this.d;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.println((String)localObject1);
      }
      i2 = this.e;
      if (i2 == 0)
      {
        i2 = this.f;
        if (i2 == 0) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        localObject1 = Integer.toHexString(this.e);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mPopExitAnim=#");
        i2 = this.f;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.println((String)localObject1);
      }
      i2 = this.n;
      if (i2 == 0)
      {
        localObject1 = this.o;
        if (localObject1 == null) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        i2 = this.n;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        localObject1 = this.o;
        paramPrintWriter.println(localObject1);
      }
      i2 = this.p;
      if (i2 == 0)
      {
        localObject1 = this.q;
        if (localObject1 == null) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        i2 = this.p;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        localObject1 = this.q;
        paramPrintWriter.println(localObject1);
      }
    }
    Object localObject1 = this.b;
    boolean bool2 = ((ArrayList)localObject1).isEmpty();
    if (!bool2)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(paramString);
      Object localObject2 = "    ";
      ((StringBuilder)localObject1).append((String)localObject2).toString();
      int i4 = this.b.size();
      bool2 = false;
      localObject1 = null;
      int i5 = 0;
      if (i5 < i4)
      {
        localObject1 = (d.a)this.b.get(i5);
        int i6 = ((d.a)localObject1).a;
        String str;
        switch (i6)
        {
        default: 
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str = "cmd=";
          localObject2 = ((StringBuilder)localObject2).append(str);
          int i7 = ((d.a)localObject1).a;
          localObject2 = i7;
        }
        for (;;)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i5);
          str = ": ";
          paramPrintWriter.print(str);
          paramPrintWriter.print((String)localObject2);
          paramPrintWriter.print(" ");
          localObject2 = ((d.a)localObject1).b;
          paramPrintWriter.println(localObject2);
          if (paramBoolean)
          {
            i6 = ((d.a)localObject1).c;
            if (i6 == 0)
            {
              i6 = ((d.a)localObject1).d;
              if (i6 == 0) {}
            }
            else
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              localObject2 = Integer.toHexString(((d.a)localObject1).c);
              paramPrintWriter.print((String)localObject2);
              paramPrintWriter.print(" exitAnim=#");
              i6 = ((d.a)localObject1).d;
              localObject2 = Integer.toHexString(i6);
              paramPrintWriter.println((String)localObject2);
            }
            i6 = ((d.a)localObject1).e;
            if (i6 == 0)
            {
              i6 = ((d.a)localObject1).f;
              if (i6 == 0) {}
            }
            else
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              i6 = ((d.a)localObject1).e;
              localObject2 = Integer.toHexString(i6);
              paramPrintWriter.print((String)localObject2);
              localObject2 = " popExitAnim=#";
              paramPrintWriter.print((String)localObject2);
              i3 = ((d.a)localObject1).f;
              localObject1 = Integer.toHexString(i3);
              paramPrintWriter.println((String)localObject1);
            }
          }
          int i3 = i5 + 1;
          i5 = i3;
          break;
          localObject2 = "NULL";
          continue;
          localObject2 = "ADD";
          continue;
          localObject2 = "REPLACE";
          continue;
          localObject2 = "REMOVE";
          continue;
          localObject2 = "HIDE";
          continue;
          localObject2 = "SHOW";
          continue;
          localObject2 = "DETACH";
          continue;
          localObject2 = "ATTACH";
          continue;
          localObject2 = "SET_PRIMARY_NAV";
          continue;
          localObject2 = "UNSET_PRIMARY_NAV";
        }
      }
    }
  }
  
  boolean a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt2 == paramInt1)
    {
      bool = false;
      localObject1 = null;
      return bool;
    }
    Object localObject1 = this.b;
    int i2 = ((ArrayList)localObject1).size();
    int i3 = -1;
    int i4 = 0;
    label33:
    int i5;
    if (i4 < i2)
    {
      localObject1 = (d.a)this.b.get(i4);
      Fragment localFragment1 = ((d.a)localObject1).b;
      if (localFragment1 != null)
      {
        localObject1 = ((d.a)localObject1).b;
        i5 = ((Fragment)localObject1).mContainerId;
        label80:
        if ((i5 == 0) || (i5 == i3)) {
          break label260;
        }
      }
      for (int i6 = paramInt1;; i6 = i1)
      {
        if (i6 >= paramInt2) {
          break label234;
        }
        localObject1 = (d)paramArrayList.get(i6);
        Object localObject2 = ((d)localObject1).b;
        int i7 = ((ArrayList)localObject2).size();
        for (int i8 = 0;; i8 = i3)
        {
          if (i8 >= i7) {
            break label221;
          }
          localObject2 = (d.a)((d)localObject1).b.get(i8);
          Fragment localFragment2 = ((d.a)localObject2).b;
          if (localFragment2 != null)
          {
            localObject2 = ((d.a)localObject2).b;
            i3 = ((Fragment)localObject2).mContainerId;
          }
          for (;;)
          {
            if (i3 != i5) {
              break label208;
            }
            bool = true;
            break;
            i5 = 0;
            localFragment1 = null;
            break label80;
            i3 = 0;
            localObject2 = null;
          }
          label208:
          i3 = i8 + 1;
        }
        label221:
        i1 = i6 + 1;
      }
    }
    label234:
    label260:
    for (int i1 = i5;; i1 = i3)
    {
      i4 += 1;
      i3 = i1;
      break label33;
      i1 = 0;
      localObject1 = null;
      break;
    }
  }
  
  public boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    boolean bool = n.a;
    if (bool)
    {
      localObject1 = "FragmentManager";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Run: ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    paramArrayList1.add(this);
    Object localObject1 = Boolean.valueOf(false);
    paramArrayList2.add(localObject1);
    bool = this.i;
    if (bool)
    {
      localObject1 = this.a;
      ((n)localObject1).b(this);
    }
    return true;
  }
  
  Fragment b(ArrayList paramArrayList, Fragment paramFragment)
  {
    int i1 = 0;
    Object localObject = null;
    int i2 = 0;
    localObject = this.b;
    i1 = ((ArrayList)localObject).size();
    if (i2 < i1)
    {
      localObject = (d.a)this.b.get(i2);
      int i3 = ((d.a)localObject).a;
      switch (i3)
      {
      }
      for (;;)
      {
        i1 = i2 + 1;
        i2 = i1;
        break;
        localObject = ((d.a)localObject).b;
        paramArrayList.remove(localObject);
        continue;
        localObject = ((d.a)localObject).b;
        paramArrayList.add(localObject);
        continue;
        paramFragment = ((d.a)localObject).b;
        continue;
        paramFragment = null;
      }
    }
    return paramFragment;
  }
  
  public void b()
  {
    Object localObject = this.u;
    if (localObject != null)
    {
      int i1 = 0;
      localObject = null;
      int i2 = this.u.size();
      for (int i3 = 0; i3 < i2; i3 = i1)
      {
        localObject = (Runnable)this.u.get(i3);
        ((Runnable)localObject).run();
        i1 = i3 + 1;
      }
      i1 = 0;
      localObject = null;
      this.u = null;
    }
  }
  
  void b(boolean paramBoolean)
  {
    Object localObject1 = this.b;
    int i1 = ((ArrayList)localObject1).size() + -1;
    int i2 = i1;
    Object localObject3;
    if (i2 >= 0)
    {
      localObject1 = (d.a)this.b.get(i2);
      Object localObject2 = ((d.a)localObject1).b;
      int i5;
      if (localObject2 != null)
      {
        i3 = n.d(this.g);
        i5 = this.h;
        ((Fragment)localObject2).setNextTransition(i3, i5);
      }
      int i3 = ((d.a)localObject1).a;
      n localn;
      switch (i3)
      {
      case 2: 
      default: 
        localObject3 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unknown cmd: ");
        i1 = ((d.a)localObject1).a;
        localObject1 = i1;
        ((IllegalArgumentException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      case 1: 
        i3 = ((d.a)localObject1).f;
        ((Fragment)localObject2).setNextAnim(i3);
        localn = this.a;
        localn.h((Fragment)localObject2);
      }
      for (;;)
      {
        boolean bool2 = this.t;
        if (!bool2)
        {
          i1 = ((d.a)localObject1).a;
          i4 = 3;
          if ((i1 != i4) && (localObject2 != null))
          {
            localObject1 = this.a;
            ((n)localObject1).e((Fragment)localObject2);
          }
        }
        i1 = i2 + -1;
        i2 = i1;
        break;
        int i4 = ((d.a)localObject1).e;
        ((Fragment)localObject2).setNextAnim(i4);
        localn = this.a;
        i5 = 0;
        localn.a((Fragment)localObject2, false);
        continue;
        i4 = ((d.a)localObject1).e;
        ((Fragment)localObject2).setNextAnim(i4);
        localn = this.a;
        localn.j((Fragment)localObject2);
        continue;
        i4 = ((d.a)localObject1).f;
        ((Fragment)localObject2).setNextAnim(i4);
        localn = this.a;
        localn.i((Fragment)localObject2);
        continue;
        i4 = ((d.a)localObject1).e;
        ((Fragment)localObject2).setNextAnim(i4);
        localn = this.a;
        localn.l((Fragment)localObject2);
        continue;
        i4 = ((d.a)localObject1).f;
        ((Fragment)localObject2).setNextAnim(i4);
        localn = this.a;
        localn.k((Fragment)localObject2);
        continue;
        localn = this.a;
        i5 = 0;
        localn.o(null);
        continue;
        localn = this.a;
        localn.o((Fragment)localObject2);
      }
    }
    boolean bool1 = this.t;
    if ((!bool1) && (paramBoolean))
    {
      localObject1 = this.a;
      localObject3 = this.a;
      i2 = ((n)localObject3).l;
      boolean bool3 = true;
      ((n)localObject1).a(i2, bool3);
    }
  }
  
  boolean b(int paramInt)
  {
    Object localObject = this.b;
    int i1 = ((ArrayList)localObject).size();
    int i2 = 0;
    int i3;
    if (i2 < i1)
    {
      localObject = (d.a)this.b.get(i2);
      Fragment localFragment = ((d.a)localObject).b;
      if (localFragment != null)
      {
        localObject = ((d.a)localObject).b;
        i3 = ((Fragment)localObject).mContainerId;
        label54:
        if ((i3 == 0) || (i3 != paramInt)) {
          break label79;
        }
        i3 = 1;
      }
    }
    for (;;)
    {
      return i3;
      i3 = 0;
      localObject = null;
      break label54;
      label79:
      i3 = i2 + 1;
      i2 = i3;
      break;
      i3 = 0;
      localObject = null;
    }
  }
  
  public int c()
  {
    return a(false);
  }
  
  public int d()
  {
    return a(true);
  }
  
  public void e()
  {
    a();
    this.a.b(this, false);
  }
  
  void f()
  {
    int i1 = 1;
    StringBuilder localStringBuilder = null;
    Object localObject1 = this.b;
    int i2 = ((ArrayList)localObject1).size();
    int i3 = 0;
    Object localObject2 = null;
    if (i3 < i2)
    {
      localObject1 = (d.a)this.b.get(i3);
      Fragment localFragment = ((d.a)localObject1).b;
      int i6;
      if (localFragment != null)
      {
        i4 = this.g;
        i6 = this.h;
        localFragment.setNextTransition(i4, i6);
      }
      int i4 = ((d.a)localObject1).a;
      int i7;
      n localn;
      switch (i4)
      {
      case 2: 
      default: 
        localObject2 = new java/lang/IllegalArgumentException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Unknown cmd: ");
        i7 = ((d.a)localObject1).a;
        localObject1 = i7;
        ((IllegalArgumentException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      case 1: 
        i4 = ((d.a)localObject1).c;
        localFragment.setNextAnim(i4);
        localn = this.a;
        localn.a(localFragment, false);
      }
      for (;;)
      {
        boolean bool1 = this.t;
        if (!bool1)
        {
          i7 = ((d.a)localObject1).a;
          if ((i7 != i1) && (localFragment != null))
          {
            localObject1 = this.a;
            ((n)localObject1).e(localFragment);
          }
        }
        int i8 = i3 + 1;
        i3 = i8;
        break;
        int i5 = ((d.a)localObject1).d;
        localFragment.setNextAnim(i5);
        localn = this.a;
        localn.h(localFragment);
        continue;
        i5 = ((d.a)localObject1).d;
        localFragment.setNextAnim(i5);
        localn = this.a;
        localn.i(localFragment);
        continue;
        i5 = ((d.a)localObject1).c;
        localFragment.setNextAnim(i5);
        localn = this.a;
        localn.j(localFragment);
        continue;
        i5 = ((d.a)localObject1).d;
        localFragment.setNextAnim(i5);
        localn = this.a;
        localn.k(localFragment);
        continue;
        i5 = ((d.a)localObject1).c;
        localFragment.setNextAnim(i5);
        localn = this.a;
        localn.l(localFragment);
        continue;
        localn = this.a;
        localn.o(localFragment);
        continue;
        localn = this.a;
        i6 = 0;
        localn.o(null);
      }
    }
    boolean bool2 = this.t;
    if (!bool2)
    {
      localObject1 = this.a;
      localObject2 = this.a;
      i3 = ((n)localObject2).l;
      ((n)localObject1).a(i3, i1);
    }
  }
  
  boolean g()
  {
    boolean bool1 = false;
    int i3;
    for (int i1 = 0;; i1 = i3)
    {
      Object localObject = this.b;
      int i2 = ((ArrayList)localObject).size();
      if (i1 < i2)
      {
        localObject = (d.a)this.b.get(i1);
        boolean bool2 = b((d.a)localObject);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i3 = i1 + 1;
    }
  }
  
  public String h()
  {
    return this.k;
  }
  
  public boolean i()
  {
    return this.b.isEmpty();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("BackStackEntry{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    int i1 = this.m;
    if (i1 >= 0)
    {
      str = " #";
      localStringBuilder.append(str);
      i1 = this.m;
      localStringBuilder.append(i1);
    }
    str = this.k;
    if (str != null)
    {
      localStringBuilder.append(" ");
      str = this.k;
      localStringBuilder.append(str);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */