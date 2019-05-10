package android.support.v4.app;

import android.arch.lifecycle.p;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final String a;
  final int b;
  final boolean c;
  final int d;
  final int e;
  final String f;
  final boolean g;
  final boolean h;
  final Bundle i;
  final boolean j;
  Bundle k;
  Fragment l;
  
  static
  {
    FragmentState.1 local1 = new android/support/v4/app/FragmentState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  FragmentState(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    this.a = ((String)localObject);
    int n = paramParcel.readInt();
    this.b = n;
    n = paramParcel.readInt();
    if (n != 0)
    {
      n = m;
      this.c = n;
      n = paramParcel.readInt();
      this.d = n;
      n = paramParcel.readInt();
      this.e = n;
      localObject = paramParcel.readString();
      this.f = ((String)localObject);
      n = paramParcel.readInt();
      if (n == 0) {
        break label167;
      }
      n = m;
      label96:
      this.g = n;
      n = paramParcel.readInt();
      if (n == 0) {
        break label175;
      }
      n = m;
      label116:
      this.h = n;
      localObject = paramParcel.readBundle();
      this.i = ((Bundle)localObject);
      n = paramParcel.readInt();
      if (n == 0) {
        break label183;
      }
    }
    for (;;)
    {
      this.j = m;
      localObject = paramParcel.readBundle();
      this.k = ((Bundle)localObject);
      return;
      n = 0;
      localObject = null;
      break;
      label167:
      n = 0;
      localObject = null;
      break label96;
      label175:
      n = 0;
      localObject = null;
      break label116;
      label183:
      m = 0;
    }
  }
  
  FragmentState(Fragment paramFragment)
  {
    Object localObject = paramFragment.getClass().getName();
    this.a = ((String)localObject);
    int m = paramFragment.mIndex;
    this.b = m;
    boolean bool1 = paramFragment.mFromLayout;
    this.c = bool1;
    int n = paramFragment.mFragmentId;
    this.d = n;
    n = paramFragment.mContainerId;
    this.e = n;
    localObject = paramFragment.mTag;
    this.f = ((String)localObject);
    boolean bool2 = paramFragment.mRetainInstance;
    this.g = bool2;
    bool2 = paramFragment.mDetached;
    this.h = bool2;
    localObject = paramFragment.mArguments;
    this.i = ((Bundle)localObject);
    bool2 = paramFragment.mHidden;
    this.j = bool2;
  }
  
  public Fragment a(l paraml, j paramj, Fragment paramFragment, o paramo, p paramp)
  {
    Object localObject1 = this.l;
    Object localObject2;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = paraml.i();
      localObject2 = this.i;
      if (localObject2 != null)
      {
        localObject2 = this.i;
        localObject3 = ((Context)localObject1).getClassLoader();
        ((Bundle)localObject2).setClassLoader((ClassLoader)localObject3);
      }
      if (paramj == null) {
        break label394;
      }
      localObject2 = this.a;
      localObject3 = this.i;
      localObject2 = paramj.a((Context)localObject1, (String)localObject2, (Bundle)localObject3);
    }
    for (this.l = ((Fragment)localObject2);; this.l = ((Fragment)localObject2))
    {
      localObject2 = this.k;
      if (localObject2 != null)
      {
        localObject2 = this.k;
        localObject1 = ((Context)localObject1).getClassLoader();
        ((Bundle)localObject2).setClassLoader((ClassLoader)localObject1);
        localObject1 = this.l;
        localObject2 = this.k;
        ((Fragment)localObject1).mSavedFragmentState = ((Bundle)localObject2);
      }
      localObject1 = this.l;
      int m = this.b;
      ((Fragment)localObject1).setIndex(m, paramFragment);
      localObject1 = this.l;
      boolean bool1 = this.c;
      ((Fragment)localObject1).mFromLayout = bool1;
      this.l.mRestored = true;
      localObject1 = this.l;
      int n = this.d;
      ((Fragment)localObject1).mFragmentId = n;
      localObject1 = this.l;
      n = this.e;
      ((Fragment)localObject1).mContainerId = n;
      localObject1 = this.l;
      localObject2 = this.f;
      ((Fragment)localObject1).mTag = ((String)localObject2);
      localObject1 = this.l;
      boolean bool2 = this.g;
      ((Fragment)localObject1).mRetainInstance = bool2;
      localObject1 = this.l;
      bool2 = this.h;
      ((Fragment)localObject1).mDetached = bool2;
      localObject1 = this.l;
      bool2 = this.j;
      ((Fragment)localObject1).mHidden = bool2;
      localObject1 = this.l;
      localObject2 = paraml.d;
      ((Fragment)localObject1).mFragmentManager = ((n)localObject2);
      boolean bool3 = n.a;
      if (bool3)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Instantiated fragment ");
        localObject3 = this.l;
        localObject2 = localObject3;
        Log.v((String)localObject1, (String)localObject2);
      }
      this.l.mChildNonConfig = paramo;
      this.l.mViewModelStore = paramp;
      return this.l;
      label394:
      localObject2 = this.a;
      localObject3 = this.i;
      localObject2 = Fragment.instantiate((Context)localObject1, (String)localObject2, (Bundle)localObject3);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 1;
    Object localObject = this.a;
    paramParcel.writeString((String)localObject);
    int n = this.b;
    paramParcel.writeInt(n);
    int i1 = this.c;
    label96:
    label116:
    boolean bool;
    if (i1 != 0)
    {
      i1 = m;
      paramParcel.writeInt(i1);
      int i2 = this.d;
      paramParcel.writeInt(i2);
      i2 = this.e;
      paramParcel.writeInt(i2);
      localObject = this.f;
      paramParcel.writeString((String)localObject);
      int i3 = this.g;
      if (i3 == 0) {
        break label172;
      }
      i3 = m;
      paramParcel.writeInt(i3);
      int i4 = this.h;
      if (i4 == 0) {
        break label181;
      }
      i4 = m;
      paramParcel.writeInt(i4);
      localObject = this.i;
      paramParcel.writeBundle((Bundle)localObject);
      bool = this.j;
      if (!bool) {
        break label190;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(m);
      localObject = this.k;
      paramParcel.writeBundle((Bundle)localObject);
      return;
      bool = false;
      localObject = null;
      break;
      label172:
      bool = false;
      localObject = null;
      break label96;
      label181:
      bool = false;
      localObject = null;
      break label116;
      label190:
      m = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\FragmentState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */