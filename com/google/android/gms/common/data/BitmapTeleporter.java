package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  ParcelFileDescriptor zzIq;
  final int zzabB;
  private Bitmap zzaiY;
  private boolean zzaiZ;
  private File zzaja;
  
  static
  {
    zza localzza = new com/google/android/gms/common/data/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  BitmapTeleporter(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzIq = paramParcelFileDescriptor;
    this.zzabB = paramInt2;
    this.zzaiY = null;
    this.zzaiZ = false;
  }
  
  public BitmapTeleporter(Bitmap paramBitmap)
  {
    this.mVersionCode = i;
    this.zzIq = null;
    this.zzabB = 0;
    this.zzaiY = paramBitmap;
    this.zzaiZ = i;
  }
  
  private void zza(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1 = "BitmapTeleporter";
        String str2 = "Could not close stream";
        Log.w(str1, str2, localIOException);
      }
    }
  }
  
  /* Error */
  private java.io.FileOutputStream zzqb()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	com/google/android/gms/common/data/BitmapTeleporter:zzaja	Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +15 -> 21
    //   9: new 60	java/lang/IllegalStateException
    //   12: astore_1
    //   13: aload_1
    //   14: ldc 62
    //   16: invokespecial 65	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: athrow
    //   21: ldc 67
    //   23: astore_1
    //   24: ldc 69
    //   26: astore_2
    //   27: aload_0
    //   28: getfield 58	com/google/android/gms/common/data/BitmapTeleporter:zzaja	Ljava/io/File;
    //   31: astore_3
    //   32: aload_1
    //   33: aload_2
    //   34: aload_3
    //   35: invokestatic 75	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   38: astore_1
    //   39: new 77	java/io/FileOutputStream
    //   42: astore_2
    //   43: aload_2
    //   44: aload_1
    //   45: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   48: ldc 81
    //   50: istore 4
    //   52: aload_1
    //   53: iload 4
    //   55: invokestatic 88	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   58: astore_3
    //   59: aload_0
    //   60: aload_3
    //   61: putfield 32	com/google/android/gms/common/data/BitmapTeleporter:zzIq	Landroid/os/ParcelFileDescriptor;
    //   64: aload_1
    //   65: invokevirtual 92	java/io/File:delete	()Z
    //   68: pop
    //   69: aload_2
    //   70: areturn
    //   71: astore_1
    //   72: new 60	java/lang/IllegalStateException
    //   75: astore_2
    //   76: aload_2
    //   77: ldc 94
    //   79: aload_1
    //   80: invokespecial 97	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   83: aload_2
    //   84: athrow
    //   85: astore_1
    //   86: new 60	java/lang/IllegalStateException
    //   89: astore_1
    //   90: aload_1
    //   91: ldc 99
    //   93: invokespecial 65	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	BitmapTeleporter
    //   4	61	1	localObject1	Object
    //   71	9	1	localIOException	IOException
    //   85	1	1	localFileNotFoundException	java.io.FileNotFoundException
    //   89	8	1	localIllegalStateException	IllegalStateException
    //   26	58	2	localObject2	Object
    //   31	30	3	localObject3	Object
    //   50	4	4	i	int
    // Exception table:
    //   from	to	target	type
    //   27	31	71	java/io/IOException
    //   34	38	71	java/io/IOException
    //   39	42	85	java/io/FileNotFoundException
    //   44	48	85	java/io/FileNotFoundException
    //   53	58	85	java/io/FileNotFoundException
    //   60	64	85	java/io/FileNotFoundException
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void release()
  {
    boolean bool = this.zzaiZ;
    if (!bool) {}
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = this.zzIq;
      localParcelFileDescriptor.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1 = "BitmapTeleporter";
        String str2 = "Could not close PFD";
        Log.w(str1, str2, localIOException);
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = this.zzIq;
    int j;
    Object localObject3;
    Object localObject4;
    DataOutputStream localDataOutputStream;
    if (localObject1 == null)
    {
      localObject1 = this.zzaiY;
      int i = ((Bitmap)localObject1).getRowBytes();
      j = ((Bitmap)localObject1).getHeight();
      i *= j;
      localObject3 = ByteBuffer.allocate(i);
      ((Bitmap)localObject1).copyPixelsToBuffer((Buffer)localObject3);
      localObject3 = ((ByteBuffer)localObject3).array();
      localObject4 = zzqb();
      localDataOutputStream = new java/io/DataOutputStream;
      localDataOutputStream.<init>((OutputStream)localObject4);
    }
    try
    {
      j = localObject3.length;
      localDataOutputStream.writeInt(j);
      j = ((Bitmap)localObject1).getWidth();
      localDataOutputStream.writeInt(j);
      j = ((Bitmap)localObject1).getHeight();
      localDataOutputStream.writeInt(j);
      localObject1 = ((Bitmap)localObject1).getConfig();
      localObject1 = ((Bitmap.Config)localObject1).toString();
      localDataOutputStream.writeUTF((String)localObject1);
      localDataOutputStream.write((byte[])localObject3);
      zza(localDataOutputStream);
      int k = paramInt | 0x1;
      zza.zza(this, paramParcel, k);
      this.zzIq = null;
      return;
    }
    catch (IOException localIOException)
    {
      localObject3 = new java/lang/IllegalStateException;
      localObject4 = "Could not write into unlinked file";
      ((IllegalStateException)localObject3).<init>((String)localObject4, localIOException);
      throw ((Throwable)localObject3);
    }
    finally
    {
      zza(localDataOutputStream);
    }
  }
  
  public void zzc(File paramFile)
  {
    if (paramFile == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("Cannot set null temp directory");
      throw localNullPointerException;
    }
    this.zzaja = paramFile;
  }
  
  public Bitmap zzqa()
  {
    boolean bool = this.zzaiZ;
    Object localObject1;
    Object localObject2;
    Object localObject4;
    if (!bool)
    {
      localObject1 = new java/io/DataInputStream;
      localObject2 = new android/os/ParcelFileDescriptor$AutoCloseInputStream;
      localObject4 = this.zzIq;
      ((ParcelFileDescriptor.AutoCloseInputStream)localObject2).<init>((ParcelFileDescriptor)localObject4);
      ((DataInputStream)localObject1).<init>((InputStream)localObject2);
    }
    try
    {
      int i = ((DataInputStream)localObject1).readInt();
      localObject2 = new byte[i];
      int j = ((DataInputStream)localObject1).readInt();
      int k = ((DataInputStream)localObject1).readInt();
      Object localObject5 = ((DataInputStream)localObject1).readUTF();
      localObject5 = Bitmap.Config.valueOf((String)localObject5);
      ((DataInputStream)localObject1).read((byte[])localObject2);
      zza((Closeable)localObject1);
      localObject2 = ByteBuffer.wrap((byte[])localObject2);
      localObject1 = Bitmap.createBitmap(j, k, (Bitmap.Config)localObject5);
      ((Bitmap)localObject1).copyPixelsFromBuffer((Buffer)localObject2);
      this.zzaiY = ((Bitmap)localObject1);
      i = 1;
      this.zzaiZ = i;
      return this.zzaiY;
    }
    catch (IOException localIOException)
    {
      localObject4 = new java/lang/IllegalStateException;
      String str = "Could not read from parcel file descriptor";
      ((IllegalStateException)localObject4).<init>(str, localIOException);
      throw ((Throwable)localObject4);
    }
    finally
    {
      zza((Closeable)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\BitmapTeleporter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */