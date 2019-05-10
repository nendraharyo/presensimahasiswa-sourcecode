package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

class IPolylineDelegate$zza$zza
  implements IPolylineDelegate
{
  private IBinder zzoz;
  
  IPolylineDelegate$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public boolean equalsRemote(IPolylineDelegate paramIPolylineDelegate)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   12: astore 5
    //   14: ldc 22
    //   16: astore 6
    //   18: aload 4
    //   20: aload 6
    //   22: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: ifnull +74 -> 100
    //   29: aload_1
    //   30: invokeinterface 30 1 0
    //   35: astore 6
    //   37: aload 4
    //   39: aload 6
    //   41: invokevirtual 34	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   44: aload_0
    //   45: getfield 14	com/google/android/gms/maps/model/internal/IPolylineDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   48: astore 6
    //   50: bipush 15
    //   52: istore 7
    //   54: aload 6
    //   56: iload 7
    //   58: aload 4
    //   60: aload 5
    //   62: iconst_0
    //   63: invokeinterface 41 5 0
    //   68: pop
    //   69: aload 5
    //   71: invokevirtual 44	android/os/Parcel:readException	()V
    //   74: aload 5
    //   76: invokevirtual 48	android/os/Parcel:readInt	()I
    //   79: istore 8
    //   81: iload 8
    //   83: ifeq +5 -> 88
    //   86: iconst_1
    //   87: istore_2
    //   88: aload 5
    //   90: invokevirtual 52	android/os/Parcel:recycle	()V
    //   93: aload 4
    //   95: invokevirtual 52	android/os/Parcel:recycle	()V
    //   98: iload_2
    //   99: ireturn
    //   100: iconst_0
    //   101: istore 8
    //   103: aconst_null
    //   104: astore 6
    //   106: goto -69 -> 37
    //   109: astore_3
    //   110: aload 5
    //   112: invokevirtual 52	android/os/Parcel:recycle	()V
    //   115: aload 4
    //   117: invokevirtual 52	android/os/Parcel:recycle	()V
    //   120: aload_3
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	zza
    //   0	122	1	paramIPolylineDelegate	IPolylineDelegate
    //   1	98	2	bool	boolean
    //   3	1	3	localObject1	Object
    //   109	12	3	localObject2	Object
    //   7	109	4	localParcel1	Parcel
    //   12	99	5	localParcel2	Parcel
    //   16	89	6	localObject3	Object
    //   52	5	7	i	int
    //   79	23	8	j	int
    // Exception table:
    //   from	to	target	type
    //   20	25	109	finally
    //   29	35	109	finally
    //   39	44	109	finally
    //   44	48	109	finally
    //   62	69	109	finally
    //   69	74	109	finally
    //   74	79	109	finally
  }
  
  public int getColor()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 8;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String getId()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 2;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readString();
      return (String)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public List getPoints()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 4;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = LatLng.CREATOR;
      localObject1 = localParcel2.createTypedArrayList((Parcelable.Creator)localObject1);
      return (List)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public float getWidth()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 6;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public float getZIndex()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 10;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int hashCodeRemote()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 16;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isClickable()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.zzoz;
      int i = 18;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isGeodesic()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.zzoz;
      int i = 14;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isVisible()
  {
    boolean bool = false;
    Object localObject1 = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject3);
      localObject3 = this.zzoz;
      int i = 12;
      ((IBinder)localObject3).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void remove()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void setClickable(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken(str);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = this.zzoz;
      int j = 17;
      localIBinder.transact(j, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void setColor(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 7;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void setGeodesic(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken(str);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = this.zzoz;
      int j = 13;
      localIBinder.transact(j, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void setPoints(List paramList)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeTypedList(paramList);
      localObject1 = this.zzoz;
      int i = 3;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void setVisible(boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    String str = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken(str);
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      localIBinder = this.zzoz;
      int j = 11;
      localIBinder.transact(j, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void setWidth(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeFloat(paramFloat);
      localObject1 = this.zzoz;
      int i = 5;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void setZIndex(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.model.internal.IPolylineDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeFloat(paramFloat);
      localObject1 = this.zzoz;
      int i = 9;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\IPolylineDelegate$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */