package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

class ICameraUpdateFactoryDelegate$zza$zza
  implements ICameraUpdateFactoryDelegate
{
  private IBinder zzoz;
  
  ICameraUpdateFactoryDelegate$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  /* Error */
  public zzd newCameraPosition(com.google.android.gms.maps.model.CameraPosition paramCameraPosition)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 22
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +75 -> 94
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 37	com/google/android/gms/maps/model/CameraPosition:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 7
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 44 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 47	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 51	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   74: astore 4
    //   76: aload 4
    //   78: invokestatic 57	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   81: astore 4
    //   83: aload_3
    //   84: invokevirtual 60	android/os/Parcel:recycle	()V
    //   87: aload_2
    //   88: invokevirtual 60	android/os/Parcel:recycle	()V
    //   91: aload 4
    //   93: areturn
    //   94: iconst_0
    //   95: istore 5
    //   97: aconst_null
    //   98: astore 4
    //   100: aload_2
    //   101: iconst_0
    //   102: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   105: goto -62 -> 43
    //   108: astore 4
    //   110: aload_3
    //   111: invokevirtual 60	android/os/Parcel:recycle	()V
    //   114: aload_2
    //   115: invokevirtual 60	android/os/Parcel:recycle	()V
    //   118: aload 4
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	zza
    //   0	121	1	paramCameraPosition	com.google.android.gms.maps.model.CameraPosition
    //   3	112	2	localParcel1	Parcel
    //   7	104	3	localParcel2	Parcel
    //   10	89	4	localObject1	Object
    //   108	11	4	localObject2	Object
    //   23	73	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	108	finally
    //   26	31	108	finally
    //   39	43	108	finally
    //   43	47	108	finally
    //   59	66	108	finally
    //   66	70	108	finally
    //   70	74	108	finally
    //   76	81	108	finally
    //   101	105	108	finally
  }
  
  /* Error */
  public zzd newLatLng(com.google.android.gms.maps.model.LatLng paramLatLng)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: ldc 22
    //   10: astore 4
    //   12: aload_2
    //   13: aload 4
    //   15: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +75 -> 94
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 63	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   43: aload_0
    //   44: getfield 14	com/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   47: astore 4
    //   49: bipush 8
    //   51: istore 6
    //   53: aload 4
    //   55: iload 6
    //   57: aload_2
    //   58: aload_3
    //   59: iconst_0
    //   60: invokeinterface 44 5 0
    //   65: pop
    //   66: aload_3
    //   67: invokevirtual 47	android/os/Parcel:readException	()V
    //   70: aload_3
    //   71: invokevirtual 51	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   74: astore 4
    //   76: aload 4
    //   78: invokestatic 57	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   81: astore 4
    //   83: aload_3
    //   84: invokevirtual 60	android/os/Parcel:recycle	()V
    //   87: aload_2
    //   88: invokevirtual 60	android/os/Parcel:recycle	()V
    //   91: aload 4
    //   93: areturn
    //   94: iconst_0
    //   95: istore 5
    //   97: aconst_null
    //   98: astore 4
    //   100: aload_2
    //   101: iconst_0
    //   102: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   105: goto -62 -> 43
    //   108: astore 4
    //   110: aload_3
    //   111: invokevirtual 60	android/os/Parcel:recycle	()V
    //   114: aload_2
    //   115: invokevirtual 60	android/os/Parcel:recycle	()V
    //   118: aload 4
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	zza
    //   0	121	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   3	112	2	localParcel1	Parcel
    //   7	104	3	localParcel2	Parcel
    //   10	89	4	localObject1	Object
    //   108	11	4	localObject2	Object
    //   23	73	5	i	int
    //   51	5	6	j	int
    // Exception table:
    //   from	to	target	type
    //   13	18	108	finally
    //   26	31	108	finally
    //   39	43	108	finally
    //   43	47	108	finally
    //   59	66	108	finally
    //   66	70	108	finally
    //   70	74	108	finally
    //   76	81	108	finally
    //   101	105	108	finally
  }
  
  /* Error */
  public zzd newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds paramLatLngBounds, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: ldc 22
    //   11: astore 5
    //   13: aload_3
    //   14: aload 5
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnull +84 -> 104
    //   23: iconst_1
    //   24: istore 6
    //   26: aload_3
    //   27: iload 6
    //   29: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 6
    //   35: aconst_null
    //   36: astore 5
    //   38: aload_1
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 67	com/google/android/gms/maps/model/LatLngBounds:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_3
    //   45: iload_2
    //   46: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 10
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 44 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 47	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 51	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   83: astore 5
    //   85: aload 5
    //   87: invokestatic 57	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   90: astore 5
    //   92: aload 4
    //   94: invokevirtual 60	android/os/Parcel:recycle	()V
    //   97: aload_3
    //   98: invokevirtual 60	android/os/Parcel:recycle	()V
    //   101: aload 5
    //   103: areturn
    //   104: iconst_0
    //   105: istore 6
    //   107: aconst_null
    //   108: astore 5
    //   110: aload_3
    //   111: iconst_0
    //   112: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   115: goto -71 -> 44
    //   118: astore 5
    //   120: aload 4
    //   122: invokevirtual 60	android/os/Parcel:recycle	()V
    //   125: aload_3
    //   126: invokevirtual 60	android/os/Parcel:recycle	()V
    //   129: aload 5
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	zza
    //   0	132	1	paramLatLngBounds	com.google.android.gms.maps.model.LatLngBounds
    //   0	132	2	paramInt	int
    //   3	123	3	localParcel1	Parcel
    //   7	114	4	localParcel2	Parcel
    //   11	98	5	localObject1	Object
    //   118	12	5	localObject2	Object
    //   24	82	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	118	finally
    //   27	32	118	finally
    //   40	44	118	finally
    //   45	49	118	finally
    //   49	53	118	finally
    //   66	73	118	finally
    //   73	78	118	finally
    //   78	83	118	finally
    //   85	90	118	finally
    //   111	115	118	finally
  }
  
  /* Error */
  public zzd newLatLngBoundsWithSize(com.google.android.gms.maps.model.LatLngBounds paramLatLngBounds, int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 5
    //   5: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 6
    //   10: ldc 22
    //   12: astore 7
    //   14: aload 5
    //   16: aload 7
    //   18: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: ifnull +102 -> 124
    //   25: iconst_1
    //   26: istore 8
    //   28: aload 5
    //   30: iload 8
    //   32: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   35: iconst_0
    //   36: istore 8
    //   38: aconst_null
    //   39: astore 7
    //   41: aload_1
    //   42: aload 5
    //   44: iconst_0
    //   45: invokevirtual 67	com/google/android/gms/maps/model/LatLngBounds:writeToParcel	(Landroid/os/Parcel;I)V
    //   48: aload 5
    //   50: iload_2
    //   51: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   54: aload 5
    //   56: iload_3
    //   57: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   60: aload 5
    //   62: iload 4
    //   64: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   67: aload_0
    //   68: getfield 14	com/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   71: astore 7
    //   73: bipush 11
    //   75: istore 9
    //   77: aload 7
    //   79: iload 9
    //   81: aload 5
    //   83: aload 6
    //   85: iconst_0
    //   86: invokeinterface 44 5 0
    //   91: pop
    //   92: aload 6
    //   94: invokevirtual 47	android/os/Parcel:readException	()V
    //   97: aload 6
    //   99: invokevirtual 51	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   102: astore 7
    //   104: aload 7
    //   106: invokestatic 57	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   109: astore 7
    //   111: aload 6
    //   113: invokevirtual 60	android/os/Parcel:recycle	()V
    //   116: aload 5
    //   118: invokevirtual 60	android/os/Parcel:recycle	()V
    //   121: aload 7
    //   123: areturn
    //   124: iconst_0
    //   125: istore 8
    //   127: aconst_null
    //   128: astore 7
    //   130: aload 5
    //   132: iconst_0
    //   133: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   136: goto -88 -> 48
    //   139: astore 7
    //   141: aload 6
    //   143: invokevirtual 60	android/os/Parcel:recycle	()V
    //   146: aload 5
    //   148: invokevirtual 60	android/os/Parcel:recycle	()V
    //   151: aload 7
    //   153: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	this	zza
    //   0	154	1	paramLatLngBounds	com.google.android.gms.maps.model.LatLngBounds
    //   0	154	2	paramInt1	int
    //   0	154	3	paramInt2	int
    //   0	154	4	paramInt3	int
    //   3	144	5	localParcel1	Parcel
    //   8	134	6	localParcel2	Parcel
    //   12	117	7	localObject1	Object
    //   139	13	7	localObject2	Object
    //   26	100	8	i	int
    //   75	5	9	j	int
    // Exception table:
    //   from	to	target	type
    //   16	21	139	finally
    //   30	35	139	finally
    //   44	48	139	finally
    //   50	54	139	finally
    //   56	60	139	finally
    //   62	67	139	finally
    //   67	71	139	finally
    //   85	92	139	finally
    //   92	97	139	finally
    //   97	102	139	finally
    //   104	109	139	finally
    //   132	136	139	finally
  }
  
  /* Error */
  public zzd newLatLngZoom(com.google.android.gms.maps.model.LatLng paramLatLng, float paramFloat)
  {
    // Byte code:
    //   0: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 20	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: ldc 22
    //   11: astore 5
    //   13: aload_3
    //   14: aload 5
    //   16: invokevirtual 26	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnull +84 -> 104
    //   23: iconst_1
    //   24: istore 6
    //   26: aload_3
    //   27: iload 6
    //   29: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   32: iconst_0
    //   33: istore 6
    //   35: aconst_null
    //   36: astore 5
    //   38: aload_1
    //   39: aload_3
    //   40: iconst_0
    //   41: invokevirtual 63	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   44: aload_3
    //   45: fload_2
    //   46: invokevirtual 73	android/os/Parcel:writeFloat	(F)V
    //   49: aload_0
    //   50: getfield 14	com/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate$zza$zza:zzoz	Landroid/os/IBinder;
    //   53: astore 5
    //   55: bipush 9
    //   57: istore 7
    //   59: aload 5
    //   61: iload 7
    //   63: aload_3
    //   64: aload 4
    //   66: iconst_0
    //   67: invokeinterface 44 5 0
    //   72: pop
    //   73: aload 4
    //   75: invokevirtual 47	android/os/Parcel:readException	()V
    //   78: aload 4
    //   80: invokevirtual 51	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   83: astore 5
    //   85: aload 5
    //   87: invokestatic 57	com/google/android/gms/dynamic/zzd$zza:zzbs	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;
    //   90: astore 5
    //   92: aload 4
    //   94: invokevirtual 60	android/os/Parcel:recycle	()V
    //   97: aload_3
    //   98: invokevirtual 60	android/os/Parcel:recycle	()V
    //   101: aload 5
    //   103: areturn
    //   104: iconst_0
    //   105: istore 6
    //   107: aconst_null
    //   108: astore 5
    //   110: aload_3
    //   111: iconst_0
    //   112: invokevirtual 31	android/os/Parcel:writeInt	(I)V
    //   115: goto -71 -> 44
    //   118: astore 5
    //   120: aload 4
    //   122: invokevirtual 60	android/os/Parcel:recycle	()V
    //   125: aload_3
    //   126: invokevirtual 60	android/os/Parcel:recycle	()V
    //   129: aload 5
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	zza
    //   0	132	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   0	132	2	paramFloat	float
    //   3	123	3	localParcel1	Parcel
    //   7	114	4	localParcel2	Parcel
    //   11	98	5	localObject1	Object
    //   118	12	5	localObject2	Object
    //   24	82	6	i	int
    //   57	5	7	j	int
    // Exception table:
    //   from	to	target	type
    //   14	19	118	finally
    //   27	32	118	finally
    //   40	44	118	finally
    //   45	49	118	finally
    //   49	53	118	finally
    //   66	73	118	finally
    //   73	78	118	finally
    //   78	83	118	finally
    //   85	90	118	finally
    //   111	115	118	finally
  }
  
  public zzd scrollBy(float paramFloat1, float paramFloat2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeFloat(paramFloat1);
      localParcel1.writeFloat(paramFloat2);
      localObject1 = this.zzoz;
      int i = 3;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zoomBy(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeFloat(paramFloat);
      localObject1 = this.zzoz;
      int i = 5;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zoomByWithFocus(float paramFloat, int paramInt1, int paramInt2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeFloat(paramFloat);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localObject1 = this.zzoz;
      int i = 6;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zoomIn()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zoomOut()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localObject1 = this.zzoz;
      int i = 2;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzd zoomTo(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeFloat(paramFloat);
      localObject1 = this.zzoz;
      int i = 4;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      localObject1 = localParcel2.readStrongBinder();
      localObject1 = zzd.zza.zzbs((IBinder)localObject1);
      return (zzd)localObject1;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\ICameraUpdateFactoryDelegate$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */