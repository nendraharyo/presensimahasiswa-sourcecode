package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList j;
  final ArrayList k;
  final boolean l;
  
  static
  {
    BackStackState.1 local1 = new android/support/v4/app/BackStackState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BackStackState(Parcel paramParcel)
  {
    Object localObject = paramParcel.createIntArray();
    this.a = ((int[])localObject);
    int m = paramParcel.readInt();
    this.b = m;
    m = paramParcel.readInt();
    this.c = m;
    localObject = paramParcel.readString();
    this.d = ((String)localObject);
    m = paramParcel.readInt();
    this.e = m;
    m = paramParcel.readInt();
    this.f = m;
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.g = ((CharSequence)localObject);
    m = paramParcel.readInt();
    this.h = m;
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.i = ((CharSequence)localObject);
    localObject = paramParcel.createStringArrayList();
    this.j = ((ArrayList)localObject);
    localObject = paramParcel.createStringArrayList();
    this.k = ((ArrayList)localObject);
    m = paramParcel.readInt();
    if (m != 0) {
      m = 1;
    }
    for (;;)
    {
      this.l = m;
      return;
      m = 0;
      localObject = null;
    }
  }
  
  public BackStackState(d paramd)
  {
    int n = paramd.b.size();
    Object localObject2 = new int[n * 6];
    this.a = ((int[])localObject2);
    boolean bool2 = paramd.i;
    if (!bool2)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Not on back stack");
      throw ((Throwable)localObject1);
    }
    int i2 = 0;
    bool2 = false;
    localObject2 = null;
    if (i2 < n)
    {
      localObject1 = (d.a)paramd.b.get(i2);
      int[] arrayOfInt1 = this.a;
      int i3 = bool2 + true;
      int i4 = ((d.a)localObject1).a;
      arrayOfInt1[bool2] = i4;
      arrayOfInt1 = this.a;
      i4 = i3 + 1;
      localObject2 = ((d.a)localObject1).b;
      if (localObject2 != null) {
        localObject2 = ((d.a)localObject1).b;
      }
      for (int i1 = ((Fragment)localObject2).mIndex;; i1 = -1)
      {
        arrayOfInt1[i3] = i1;
        localObject2 = this.a;
        int i5 = i4 + 1;
        i3 = ((d.a)localObject1).c;
        localObject2[i4] = i3;
        localObject2 = this.a;
        i3 = i5 + 1;
        i4 = ((d.a)localObject1).d;
        localObject2[i5] = i4;
        localObject2 = this.a;
        i5 = i3 + 1;
        i4 = ((d.a)localObject1).e;
        localObject2[i3] = i4;
        int[] arrayOfInt2 = this.a;
        i1 = i5 + 1;
        m = ((d.a)localObject1).f;
        arrayOfInt2[i5] = m;
        m = i2 + 1;
        i2 = m;
        break;
      }
    }
    m = paramd.g;
    this.b = m;
    m = paramd.h;
    this.c = m;
    localObject1 = paramd.k;
    this.d = ((String)localObject1);
    m = paramd.m;
    this.e = m;
    m = paramd.n;
    this.f = m;
    localObject1 = paramd.o;
    this.g = ((CharSequence)localObject1);
    m = paramd.p;
    this.h = m;
    localObject1 = paramd.q;
    this.i = ((CharSequence)localObject1);
    localObject1 = paramd.r;
    this.j = ((ArrayList)localObject1);
    localObject1 = paramd.s;
    this.k = ((ArrayList)localObject1);
    boolean bool1 = paramd.t;
    this.l = bool1;
  }
  
  public d a(n paramn)
  {
    int m = 1;
    int n = 0;
    Object localObject1 = null;
    d locald = new android/support/v4/app/d;
    locald.<init>(paramn);
    int i2 = 0;
    Object localObject2 = this.a;
    int i3 = localObject2.length;
    if (n < i3)
    {
      d.a locala = new android/support/v4/app/d$a;
      locala.<init>();
      localObject2 = this.a;
      int i4 = n + 1;
      n = localObject2[n];
      locala.a = n;
      boolean bool1 = n.a;
      if (bool1)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Instantiate ").append(locald).append(" op #").append(i2).append(" base fragment #");
        int[] arrayOfInt = this.a;
        int i5 = arrayOfInt[i4];
        localObject2 = i5;
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = this.a;
      i3 = i4 + 1;
      i1 = localObject1[i4];
      if (i1 >= 0)
      {
        SparseArray localSparseArray = paramn.f;
        localObject1 = (Fragment)localSparseArray.get(i1);
      }
      for (locala.b = ((Fragment)localObject1);; locala.b = null)
      {
        localObject1 = this.a;
        i4 = i3 + 1;
        i1 = localObject1[i3];
        locala.c = i1;
        localObject1 = this.a;
        i3 = i4 + 1;
        i1 = localObject1[i4];
        locala.d = i1;
        localObject1 = this.a;
        i4 = i3 + 1;
        i1 = localObject1[i3];
        locala.e = i1;
        localObject1 = this.a;
        i3 = i4 + 1;
        i1 = localObject1[i4];
        locala.f = i1;
        i1 = locala.c;
        locald.c = i1;
        i1 = locala.d;
        locald.d = i1;
        i1 = locala.e;
        locald.e = i1;
        i1 = locala.f;
        locald.f = i1;
        locald.a(locala);
        i2 += 1;
        i1 = i3;
        break;
        i1 = 0;
        localObject1 = null;
      }
    }
    int i1 = this.b;
    locald.g = i1;
    i1 = this.c;
    locald.h = i1;
    localObject1 = this.d;
    locald.k = ((String)localObject1);
    i1 = this.e;
    locald.m = i1;
    locald.i = m;
    i1 = this.f;
    locald.n = i1;
    localObject1 = this.g;
    locald.o = ((CharSequence)localObject1);
    i1 = this.h;
    locald.p = i1;
    localObject1 = this.i;
    locald.q = ((CharSequence)localObject1);
    localObject1 = this.j;
    locald.r = ((ArrayList)localObject1);
    localObject1 = this.k;
    locald.s = ((ArrayList)localObject1);
    boolean bool2 = this.l;
    locald.t = bool2;
    locald.a(m);
    return locald;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 0;
    Object localObject = this.a;
    paramParcel.writeIntArray((int[])localObject);
    int n = this.b;
    paramParcel.writeInt(n);
    n = this.c;
    paramParcel.writeInt(n);
    localObject = this.d;
    paramParcel.writeString((String)localObject);
    n = this.e;
    paramParcel.writeInt(n);
    n = this.f;
    paramParcel.writeInt(n);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    n = this.h;
    paramParcel.writeInt(n);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    localObject = this.j;
    paramParcel.writeStringList((List)localObject);
    localObject = this.k;
    paramParcel.writeStringList((List)localObject);
    boolean bool = this.l;
    if (bool) {
      m = 1;
    }
    paramParcel.writeInt(m);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\BackStackState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */