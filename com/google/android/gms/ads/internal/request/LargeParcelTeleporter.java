package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzna;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class LargeParcelTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  ParcelFileDescriptor zzIq;
  private Parcelable zzIr;
  private boolean zzIs;
  
  static
  {
    zzl localzzl = new com/google/android/gms/ads/internal/request/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  LargeParcelTeleporter(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.mVersionCode = paramInt;
    this.zzIq = paramParcelFileDescriptor;
    this.zzIr = null;
    this.zzIs = true;
  }
  
  public LargeParcelTeleporter(SafeParcelable paramSafeParcelable)
  {
    this.mVersionCode = 1;
    this.zzIq = null;
    this.zzIr = paramSafeParcelable;
    this.zzIs = false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = this.zzIq;
    Parcel localParcel;
    if (localObject1 == null) {
      localParcel = Parcel.obtain();
    }
    try
    {
      localObject1 = this.zzIr;
      ((Parcelable)localObject1).writeToParcel(localParcel, 0);
      localObject1 = localParcel.marshall();
      localParcel.recycle();
      localObject1 = zzf((byte[])localObject1);
      this.zzIq = ((ParcelFileDescriptor)localObject1);
      zzl.zza(this, paramParcel, paramInt);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public SafeParcelable zza(Parcelable.Creator paramCreator)
  {
    boolean bool = this.zzIs;
    Object localObject1;
    if (bool)
    {
      localObject1 = this.zzIq;
      if (localObject1 == null)
      {
        zzin.e("File descriptor is empty, returning null.");
        bool = false;
        localObject1 = null;
      }
    }
    for (;;)
    {
      return (SafeParcelable)localObject1;
      localObject4 = new java/io/DataInputStream;
      localObject1 = new android/os/ParcelFileDescriptor$AutoCloseInputStream;
      Object localObject5 = this.zzIq;
      ((ParcelFileDescriptor.AutoCloseInputStream)localObject1).<init>((ParcelFileDescriptor)localObject5);
      ((DataInputStream)localObject4).<init>((InputStream)localObject1);
      try
      {
        i = ((DataInputStream)localObject4).readInt();
        localObject1 = new byte[i];
        localObject5 = null;
        j = localObject1.length;
        ((DataInputStream)localObject4).readFully((byte[])localObject1, 0, j);
        zzna.zzb((Closeable)localObject4);
        localObject4 = Parcel.obtain();
        localObject5 = null;
      }
      catch (IOException localIOException)
      {
        int i;
        int j;
        localIOException = localIOException;
        localObject5 = new java/lang/IllegalStateException;
        String str = "Could not read from parcel file descriptor";
        ((IllegalStateException)localObject5).<init>(str, localIOException);
        throw ((Throwable)localObject5);
      }
      finally
      {
        zzna.zzb((Closeable)localObject4);
      }
    }
  }
  
  /* Error */
  protected ParcelFileDescriptor zzf(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_1
    //   3: istore_3
    //   4: invokestatic 121	android/os/ParcelFileDescriptor:createPipe	()[Landroid/os/ParcelFileDescriptor;
    //   7: astore 4
    //   9: iconst_1
    //   10: istore 5
    //   12: aload 4
    //   14: iload 5
    //   16: aaload
    //   17: astore 6
    //   19: new 123	android/os/ParcelFileDescriptor$AutoCloseOutputStream
    //   22: astore 7
    //   24: aload 7
    //   26: aload 6
    //   28: invokespecial 124	android/os/ParcelFileDescriptor$AutoCloseOutputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   31: new 126	com/google/android/gms/ads/internal/request/LargeParcelTeleporter$1
    //   34: astore 6
    //   36: aload 6
    //   38: aload_0
    //   39: aload 7
    //   41: aload_1
    //   42: invokespecial 129	com/google/android/gms/ads/internal/request/LargeParcelTeleporter$1:<init>	(Lcom/google/android/gms/ads/internal/request/LargeParcelTeleporter;Ljava/io/OutputStream;[B)V
    //   45: new 131	java/lang/Thread
    //   48: astore 8
    //   50: aload 8
    //   52: aload 6
    //   54: invokespecial 134	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   57: aload 8
    //   59: invokevirtual 137	java/lang/Thread:start	()V
    //   62: aconst_null
    //   63: astore 6
    //   65: aload 4
    //   67: iconst_0
    //   68: aaload
    //   69: astore_2
    //   70: aload_2
    //   71: areturn
    //   72: astore 4
    //   74: iconst_0
    //   75: istore 5
    //   77: aconst_null
    //   78: astore 7
    //   80: ldc -117
    //   82: aload 4
    //   84: invokestatic 141	com/google/android/gms/internal/zzin:zzb	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   87: invokestatic 147	com/google/android/gms/ads/internal/zzr:zzbF	()Lcom/google/android/gms/internal/zzih;
    //   90: astore 6
    //   92: aload 6
    //   94: aload 4
    //   96: iload_3
    //   97: invokevirtual 152	com/google/android/gms/internal/zzih:zzb	(Ljava/lang/Throwable;Z)V
    //   100: aload 7
    //   102: invokestatic 93	com/google/android/gms/internal/zzna:zzb	(Ljava/io/Closeable;)V
    //   105: goto -35 -> 70
    //   108: astore 4
    //   110: goto -30 -> 80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	LargeParcelTeleporter
    //   0	113	1	paramArrayOfByte	byte[]
    //   1	70	2	localParcelFileDescriptor	ParcelFileDescriptor
    //   3	94	3	bool	boolean
    //   7	59	4	arrayOfParcelFileDescriptor	ParcelFileDescriptor[]
    //   72	23	4	localIOException1	IOException
    //   108	1	4	localIOException2	IOException
    //   10	66	5	i	int
    //   17	76	6	localObject	Object
    //   22	79	7	localAutoCloseOutputStream	android.os.ParcelFileDescriptor.AutoCloseOutputStream
    //   48	10	8	localThread	Thread
    // Exception table:
    //   from	to	target	type
    //   4	7	72	java/io/IOException
    //   14	17	72	java/io/IOException
    //   19	22	72	java/io/IOException
    //   26	31	72	java/io/IOException
    //   31	34	108	java/io/IOException
    //   41	45	108	java/io/IOException
    //   45	48	108	java/io/IOException
    //   52	57	108	java/io/IOException
    //   57	62	108	java/io/IOException
    //   67	69	108	java/io/IOException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\LargeParcelTeleporter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */