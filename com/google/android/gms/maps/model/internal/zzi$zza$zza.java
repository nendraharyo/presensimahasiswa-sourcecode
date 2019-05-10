package com.google.android.gms.maps.model.internal;

import android.os.IBinder;

class zzi$zza$zza
  implements zzi
{
  private IBinder zzoz;
  
  zzi$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public com.google.android.gms.maps.model.Tile getTile(int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: ldc 22
    //   12: astore 6
    //   14: aload 4
    //   16: aload 6
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload 4
    //   23: iload_1
    //   24: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   27: aload 4
    //   29: iload_2
    //   30: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   33: aload 4
    //   35: iload_3
    //   36: invokevirtual 30	android/os/Parcel:writeInt	(I)V
    //   39: aload_0
    //   40: getfield 14	com/google/android/gms/maps/model/internal/zzi$zza$zza:zzoz	Landroid/os/IBinder;
    //   43: astore 6
    //   45: iconst_1
    //   46: istore 7
    //   48: aload 6
    //   50: iload 7
    //   52: aload 4
    //   54: aload 5
    //   56: iconst_0
    //   57: invokeinterface 37 5 0
    //   62: pop
    //   63: aload 5
    //   65: invokevirtual 40	android/os/Parcel:readException	()V
    //   68: aload 5
    //   70: invokevirtual 44	android/os/Parcel:readInt	()I
    //   73: istore 8
    //   75: iload 8
    //   77: ifeq +30 -> 107
    //   80: getstatic 50	com/google/android/gms/maps/model/Tile:CREATOR	Lcom/google/android/gms/maps/model/zzn;
    //   83: astore 6
    //   85: aload 6
    //   87: aload 5
    //   89: invokevirtual 56	com/google/android/gms/maps/model/zzn:zzfI	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/Tile;
    //   92: astore 6
    //   94: aload 5
    //   96: invokevirtual 59	android/os/Parcel:recycle	()V
    //   99: aload 4
    //   101: invokevirtual 59	android/os/Parcel:recycle	()V
    //   104: aload 6
    //   106: areturn
    //   107: iconst_0
    //   108: istore 8
    //   110: aconst_null
    //   111: astore 6
    //   113: goto -19 -> 94
    //   116: astore 6
    //   118: aload 5
    //   120: invokevirtual 59	android/os/Parcel:recycle	()V
    //   123: aload 4
    //   125: invokevirtual 59	android/os/Parcel:recycle	()V
    //   128: aload 6
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	zza
    //   0	131	1	paramInt1	int
    //   0	131	2	paramInt2	int
    //   0	131	3	paramInt3	int
    //   3	121	4	localParcel1	android.os.Parcel
    //   8	111	5	localParcel2	android.os.Parcel
    //   12	100	6	localObject1	Object
    //   116	13	6	localObject2	Object
    //   46	5	7	i	int
    //   73	36	8	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	116	finally
    //   23	27	116	finally
    //   29	33	116	finally
    //   35	39	116	finally
    //   39	43	116	finally
    //   56	63	116	finally
    //   63	68	116	finally
    //   68	73	116	finally
    //   80	83	116	finally
    //   87	92	116	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\internal\zzi$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */