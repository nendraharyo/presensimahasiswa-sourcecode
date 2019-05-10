package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.NfcA;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v4.a.b;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.c.a;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class Common
  extends Application
{
  private static final String a;
  private static Tag b;
  private static byte[] c;
  private static SparseArray d;
  private static int e;
  private static int f;
  private static String g;
  private static boolean h = false;
  private static int i = 0;
  private static NfcAdapter j;
  private static Context k;
  private static float l;
  
  static
  {
    int m = -1;
    a = Common.class.getSimpleName();
    b = null;
    c = null;
    d = null;
    e = m;
    f = m;
  }
  
  public static int a(int paramInt)
  {
    float f1 = paramInt;
    float f2 = l;
    return (int)(f1 * f2 + 0.5F);
  }
  
  public static int a(Intent paramIntent, Context paramContext)
  {
    Object localObject = "android.nfc.action.TECH_DISCOVERED";
    String str = paramIntent.getAction();
    boolean bool = ((String)localObject).equals(str);
    if (bool)
    {
      localObject = d.a((Tag)paramIntent.getParcelableExtra("android.nfc.extra.TAG"));
      a((Tag)localObject);
    }
    for (int m = a((Tag)localObject, paramContext);; m = -4) {
      return m;
    }
  }
  
  public static int a(Tag paramTag, Context paramContext)
  {
    int m = 0;
    if ((paramTag == null) || (paramContext == null)) {
      m = -3;
    }
    for (;;)
    {
      return m;
      Object localObject1 = Arrays.asList(paramTag.getTechList());
      Object localObject2 = MifareClassic.class.getName();
      boolean bool = ((List)localObject1).contains(localObject2);
      if (!bool)
      {
        localObject1 = NfcA.get(paramTag);
        localObject2 = ((NfcA)localObject1).getAtqa();
        int i1 = localObject2[1];
        if (i1 == 0)
        {
          i1 = localObject2[0];
          int i2 = 4;
          if (i1 != i2)
          {
            i1 = localObject2[0];
            i2 = 68;
            if (i1 != i2)
            {
              i1 = localObject2[0];
              i2 = 2;
              if (i1 != i2)
              {
                m = localObject2[0];
                int i3 = 66;
                if (m != i3) {
                  break label192;
                }
              }
            }
          }
          m = (byte)((NfcA)localObject1).getSak();
          int n = 8;
          if (m != n)
          {
            n = 9;
            if (m != n)
            {
              n = 24;
              if (m != n)
              {
                n = -120;
                if (m != n)
                {
                  n = 40;
                  if (m != n) {
                    break label192;
                  }
                }
              }
            }
          }
          m = -1;
          continue;
        }
        label192:
        m = -2;
      }
    }
  }
  
  public static File a(String paramString)
  {
    Object localObject1 = b();
    Object localObject2 = c.a.e.toString();
    File localFile = null;
    boolean bool = ((SharedPreferences)localObject1).getBoolean((String)localObject2, false);
    if (bool)
    {
      localObject1 = new java/io/File;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localFile = k.getFilesDir();
      localObject2 = localFile + paramString;
      ((File)localObject1).<init>((String)localObject2);
    }
    for (;;)
    {
      return (File)localObject1;
      localObject1 = new java/io/File;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localFile = Environment.getExternalStorageDirectory();
      localObject2 = localFile + paramString;
      ((File)localObject1).<init>((String)localObject2);
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    Object localObject1 = "";
    if (paramArrayOfByte != null)
    {
      int m = paramArrayOfByte.length;
      int n = 0;
      while (n < m)
      {
        Object localObject2 = Byte.valueOf(paramArrayOfByte[n]);
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = "%02X";
        int i1 = 1;
        Object[] arrayOfObject = new Object[i1];
        int i2 = ((Byte)localObject2).intValue() & 0xFF;
        localObject2 = Integer.valueOf(i2);
        arrayOfObject[0] = localObject2;
        localObject2 = String.format((String)localObject3, arrayOfObject);
        localObject2 = (String)localObject2;
        int i3 = n + 1;
        n = i3;
        localObject1 = localObject2;
      }
    }
    return (String)localObject1;
  }
  
  public static void a(int paramInt1, int paramInt2)
  {
    e = paramInt1;
    f = paramInt2;
  }
  
  public static void a(Activity paramActivity)
  {
    int m = 1;
    Object localObject1 = j;
    if (localObject1 != null)
    {
      localObject1 = j;
      boolean bool = ((NfcAdapter)localObject1).isEnabled();
      if (bool)
      {
        localObject1 = new android/content/Intent;
        Object localObject2 = paramActivity.getClass();
        ((Intent)localObject1).<init>(paramActivity, (Class)localObject2);
        int n = 536870912;
        localObject1 = ((Intent)localObject1).addFlags(n);
        localObject1 = PendingIntent.getActivity(paramActivity, 0, (Intent)localObject1, 0);
        localObject2 = j;
        String[][] arrayOfString = new String[m][];
        String[] arrayOfString1 = new String[m];
        String str = NfcA.class.getName();
        arrayOfString1[0] = str;
        arrayOfString[0] = arrayOfString1;
        ((NfcAdapter)localObject2).enableForegroundDispatch(paramActivity, (PendingIntent)localObject1, null, arrayOfString);
      }
    }
  }
  
  public static void a(NfcAdapter paramNfcAdapter)
  {
    j = paramNfcAdapter;
  }
  
  public static void a(Tag paramTag)
  {
    b = paramTag;
    c = paramTag.getId();
  }
  
  public static void a(SparseArray paramSparseArray)
  {
    d = paramSparseArray;
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int m = 1024;
    byte[] arrayOfByte = new byte[m];
    for (;;)
    {
      int n = paramInputStream.read(arrayOfByte);
      int i1 = -1;
      if (n == i1) {
        break;
      }
      i1 = 0;
      paramOutputStream.write(arrayOfByte, 0, n);
    }
  }
  
  public static boolean a()
  {
    String str = Environment.getExternalStorageState();
    return "mounted".equals(str);
  }
  
  public static boolean a(Context paramContext)
  {
    String str = "android.permission.WRITE_EXTERNAL_STORAGE";
    int m = b.a(paramContext, str);
    if (m == 0) {
      m = 1;
    }
    for (;;)
    {
      return m;
      int n = 0;
      str = null;
    }
  }
  
  /* Error */
  public static String[] a(File paramFile, boolean paramBoolean, Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ifnull +482 -> 485
    //   6: invokestatic 264	id/ac/ugm/presensi/presensimahasiswa/utils/Common:a	()Z
    //   9: istore 4
    //   11: iload 4
    //   13: ifeq +472 -> 485
    //   16: aload_0
    //   17: invokevirtual 267	java/io/File:exists	()Z
    //   20: istore 4
    //   22: iload 4
    //   24: ifeq +461 -> 485
    //   27: new 269	java/io/BufferedReader
    //   30: astore 5
    //   32: new 271	java/io/FileReader
    //   35: astore 6
    //   37: aload 6
    //   39: aload_0
    //   40: invokespecial 274	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   43: aload 5
    //   45: aload 6
    //   47: invokespecial 277	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   50: new 279	java/util/ArrayList
    //   53: astore 6
    //   55: aload 6
    //   57: invokespecial 280	java/util/ArrayList:<init>	()V
    //   60: aload 5
    //   62: invokevirtual 283	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   65: astore 7
    //   67: aload 7
    //   69: ifnull +117 -> 186
    //   72: ldc -78
    //   74: astore 8
    //   76: aload 7
    //   78: aload 8
    //   80: invokevirtual 68	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   83: istore 9
    //   85: iload 9
    //   87: ifne -27 -> 60
    //   90: iload_1
    //   91: ifne +22 -> 113
    //   94: ldc_w 285
    //   97: astore 8
    //   99: aload 7
    //   101: aload 8
    //   103: invokevirtual 289	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   106: istore 9
    //   108: iload 9
    //   110: ifne -50 -> 60
    //   113: aload 6
    //   115: aload 7
    //   117: invokevirtual 292	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   120: pop
    //   121: goto -61 -> 60
    //   124: astore 6
    //   126: ldc_w 293
    //   129: istore 4
    //   131: iconst_1
    //   132: istore 10
    //   134: aload_2
    //   135: iload 4
    //   137: iload 10
    //   139: invokestatic 300	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   142: astore 6
    //   144: aload 6
    //   146: invokevirtual 303	android/widget/Toast:show	()V
    //   149: aload 5
    //   151: ifnull +8 -> 159
    //   154: aload 5
    //   156: invokevirtual 306	java/io/BufferedReader:close	()V
    //   159: aload_3
    //   160: areturn
    //   161: astore 6
    //   163: getstatic 33	id/ac/ugm/presensi/presensimahasiswa/utils/Common:a	Ljava/lang/String;
    //   166: astore 5
    //   168: ldc_w 308
    //   171: astore 7
    //   173: aload 5
    //   175: aload 7
    //   177: aload 6
    //   179: invokestatic 313	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   182: pop
    //   183: goto -24 -> 159
    //   186: aload 6
    //   188: invokevirtual 316	java/util/ArrayList:size	()I
    //   191: istore 10
    //   193: iload 10
    //   195: ifle +49 -> 244
    //   198: aload 6
    //   200: invokevirtual 316	java/util/ArrayList:size	()I
    //   203: istore 10
    //   205: iload 10
    //   207: anewarray 64	java/lang/String
    //   210: astore 7
    //   212: aload 6
    //   214: aload 7
    //   216: invokevirtual 320	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   219: astore 6
    //   221: aload 6
    //   223: checkcast 230	[Ljava/lang/String;
    //   226: astore 6
    //   228: aload 5
    //   230: ifnull +8 -> 238
    //   233: aload 5
    //   235: invokevirtual 306	java/io/BufferedReader:close	()V
    //   238: aload 6
    //   240: astore_3
    //   241: goto -82 -> 159
    //   244: iconst_1
    //   245: istore 4
    //   247: iload 4
    //   249: anewarray 64	java/lang/String
    //   252: astore 6
    //   254: iconst_0
    //   255: istore 10
    //   257: aconst_null
    //   258: astore 7
    //   260: ldc -78
    //   262: astore 8
    //   264: aload 6
    //   266: iconst_0
    //   267: aload 8
    //   269: aastore
    //   270: goto -42 -> 228
    //   273: astore 6
    //   275: getstatic 33	id/ac/ugm/presensi/presensimahasiswa/utils/Common:a	Ljava/lang/String;
    //   278: astore 7
    //   280: new 151	java/lang/StringBuilder
    //   283: astore 8
    //   285: aload 8
    //   287: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   290: ldc_w 322
    //   293: astore 11
    //   295: aload 8
    //   297: aload 11
    //   299: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: astore 8
    //   304: aload_0
    //   305: invokevirtual 325	java/io/File:getPath	()Ljava/lang/String;
    //   308: astore 11
    //   310: aload 8
    //   312: aload 11
    //   314: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: astore 8
    //   319: ldc_w 327
    //   322: astore 11
    //   324: aload 8
    //   326: aload 11
    //   328: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: astore 8
    //   333: aload 8
    //   335: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   338: astore 8
    //   340: aload 7
    //   342: aload 8
    //   344: aload 6
    //   346: invokestatic 313	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   349: pop
    //   350: aload 5
    //   352: ifnull +133 -> 485
    //   355: aload 5
    //   357: invokevirtual 306	java/io/BufferedReader:close	()V
    //   360: iconst_0
    //   361: istore 4
    //   363: aconst_null
    //   364: astore 6
    //   366: goto -128 -> 238
    //   369: astore 6
    //   371: getstatic 33	id/ac/ugm/presensi/presensimahasiswa/utils/Common:a	Ljava/lang/String;
    //   374: astore 5
    //   376: ldc_w 308
    //   379: astore 7
    //   381: aload 5
    //   383: aload 7
    //   385: aload 6
    //   387: invokestatic 313	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   390: pop
    //   391: iconst_0
    //   392: istore 4
    //   394: aconst_null
    //   395: astore 6
    //   397: goto -159 -> 238
    //   400: astore 6
    //   402: getstatic 33	id/ac/ugm/presensi/presensimahasiswa/utils/Common:a	Ljava/lang/String;
    //   405: astore 5
    //   407: ldc_w 308
    //   410: astore 7
    //   412: aload 5
    //   414: aload 7
    //   416: aload 6
    //   418: invokestatic 313	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   421: pop
    //   422: iconst_0
    //   423: istore 4
    //   425: aconst_null
    //   426: astore 6
    //   428: goto -190 -> 238
    //   431: astore 6
    //   433: aconst_null
    //   434: astore 5
    //   436: aload 5
    //   438: ifnull +8 -> 446
    //   441: aload 5
    //   443: invokevirtual 306	java/io/BufferedReader:close	()V
    //   446: aload 6
    //   448: athrow
    //   449: astore_3
    //   450: getstatic 33	id/ac/ugm/presensi/presensimahasiswa/utils/Common:a	Ljava/lang/String;
    //   453: astore 5
    //   455: ldc_w 308
    //   458: astore 7
    //   460: aload 5
    //   462: aload 7
    //   464: aload_3
    //   465: invokestatic 313	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   468: pop
    //   469: goto -23 -> 446
    //   472: astore 6
    //   474: goto -38 -> 436
    //   477: astore 6
    //   479: aconst_null
    //   480: astore 5
    //   482: goto -207 -> 275
    //   485: iconst_0
    //   486: istore 4
    //   488: aconst_null
    //   489: astore 6
    //   491: goto -253 -> 238
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	494	0	paramFile	File
    //   0	494	1	paramBoolean	boolean
    //   0	494	2	paramContext	Context
    //   1	240	3	localObject1	Object
    //   449	16	3	localIOException1	java.io.IOException
    //   9	14	4	bool1	boolean
    //   129	358	4	m	int
    //   30	451	5	localObject2	Object
    //   35	79	6	localObject3	Object
    //   124	1	6	localOutOfMemoryError	OutOfMemoryError
    //   142	3	6	localToast	Toast
    //   161	52	6	localIOException2	java.io.IOException
    //   219	46	6	localObject4	Object
    //   273	72	6	localException1	Exception
    //   364	1	6	localObject5	Object
    //   369	17	6	localIOException3	java.io.IOException
    //   395	1	6	localObject6	Object
    //   400	17	6	localIOException4	java.io.IOException
    //   426	1	6	localObject7	Object
    //   431	16	6	localObject8	Object
    //   472	1	6	localObject9	Object
    //   477	1	6	localException2	Exception
    //   489	1	6	localObject10	Object
    //   65	398	7	localObject11	Object
    //   74	269	8	localObject12	Object
    //   83	26	9	bool2	boolean
    //   132	124	10	n	int
    //   293	34	11	str	String
    // Exception table:
    //   from	to	target	type
    //   115	121	124	java/lang/OutOfMemoryError
    //   154	159	161	java/io/IOException
    //   50	53	273	java/lang/Exception
    //   55	60	273	java/lang/Exception
    //   60	65	273	java/lang/Exception
    //   78	83	273	java/lang/Exception
    //   101	106	273	java/lang/Exception
    //   115	121	273	java/lang/Exception
    //   137	142	273	java/lang/Exception
    //   144	149	273	java/lang/Exception
    //   186	191	273	java/lang/Exception
    //   198	203	273	java/lang/Exception
    //   205	210	273	java/lang/Exception
    //   214	219	273	java/lang/Exception
    //   221	226	273	java/lang/Exception
    //   247	252	273	java/lang/Exception
    //   267	270	273	java/lang/Exception
    //   233	238	369	java/io/IOException
    //   355	360	400	java/io/IOException
    //   27	30	431	finally
    //   32	35	431	finally
    //   39	43	431	finally
    //   45	50	431	finally
    //   441	446	449	java/io/IOException
    //   50	53	472	finally
    //   55	60	472	finally
    //   60	65	472	finally
    //   78	83	472	finally
    //   101	106	472	finally
    //   115	121	472	finally
    //   137	142	472	finally
    //   144	149	472	finally
    //   186	191	472	finally
    //   198	203	472	finally
    //   205	210	472	finally
    //   214	219	472	finally
    //   221	226	472	finally
    //   247	252	472	finally
    //   267	270	472	finally
    //   275	278	472	finally
    //   280	283	472	finally
    //   285	290	472	finally
    //   297	302	472	finally
    //   304	308	472	finally
    //   312	317	472	finally
    //   326	331	472	finally
    //   333	338	472	finally
    //   344	350	472	finally
    //   27	30	477	java/lang/Exception
    //   32	35	477	java/lang/Exception
    //   39	43	477	java/lang/Exception
    //   45	50	477	java/lang/Exception
  }
  
  public static SharedPreferences b()
  {
    return PreferenceManager.getDefaultSharedPreferences(k);
  }
  
  public static void b(Activity paramActivity)
  {
    NfcAdapter localNfcAdapter = j;
    if (localNfcAdapter != null)
    {
      localNfcAdapter = j;
      boolean bool = localNfcAdapter.isEnabled();
      if (bool)
      {
        localNfcAdapter = j;
        localNfcAdapter.disableForegroundDispatch(paramActivity);
      }
    }
  }
  
  public static boolean b(Context paramContext)
  {
    int m = 1;
    boolean bool = a();
    if (bool) {}
    for (;;)
    {
      return m;
      int i1 = 2131689732;
      Toast.makeText(paramContext, i1, m).show();
      int n = 0;
    }
  }
  
  public static byte[] b(String paramString)
  {
    int m = paramString.length();
    byte[] arrayOfByte = new byte[m / 2];
    int n = 0;
    Object localObject = null;
    while (n < m) {
      try
      {
        int i1 = n / 2;
        char c1 = paramString.charAt(n);
        int i3 = 16;
        int i2 = Character.digit(c1, i3) << 4;
        i3 = n + 1;
        i3 = paramString.charAt(i3);
        int i5 = 16;
        int i4 = Character.digit(i3, i5);
        i2 = (byte)(i2 + i4);
        arrayOfByte[i1] = i2;
        n += 2;
      }
      catch (Exception localException)
      {
        String str1 = a;
        String str2 = "Argument(s) for hexStringToByteArray(String s)was not a hex string";
        Log.d(str1, str2);
      }
    }
    return arrayOfByte;
  }
  
  public static d c(Context paramContext)
  {
    int m = 1;
    float f1 = Float.MIN_VALUE;
    int n = 0;
    float f2 = 0.0F;
    Object localObject = b;
    if (localObject != null)
    {
      localObject = d.b(b);
      if (localObject == null) {}
    }
    for (;;)
    {
      try
      {
        ((d)localObject).f();
        if (n != 0) {
          break label81;
        }
        boolean bool = ((d)localObject).e();
        if (bool) {
          break label81;
        }
        ((d)localObject).g();
        if (m == 0) {
          return (d)localObject;
        }
      }
      catch (Exception localException)
      {
        n = m;
        f2 = f1;
        continue;
      }
      localObject = null;
      continue;
      label81:
      m = n;
      f1 = f2;
    }
  }
  
  public static boolean c()
  {
    int m = -1;
    int n = 1;
    int i1 = i;
    if (i1 != 0)
    {
      i1 = i;
      if (i1 != n) {}
    }
    for (;;)
    {
      return n;
      n = 0;
      continue;
      Object localObject1 = NfcAdapter.getDefaultAdapter(k);
      if (localObject1 == null)
      {
        h = n;
        i = m;
        n = 0;
      }
      else
      {
        localObject1 = new java/io/File;
        Object localObject2 = "/dev/bcm2079x-i2c";
        ((File)localObject1).<init>((String)localObject2);
        int i2 = ((File)localObject1).exists();
        if (i2 != 0)
        {
          i = m;
          n = 0;
        }
        else
        {
          localObject1 = new java/io/File;
          localObject2 = "/dev/pn544";
          ((File)localObject1).<init>((String)localObject2);
          i2 = ((File)localObject1).exists();
          if (i2 != 0)
          {
            i = n;
          }
          else
          {
            localObject1 = new java/io/File;
            ((File)localObject1).<init>("/system/lib");
            localObject2 = ((File)localObject1).listFiles();
            int i4 = localObject2.length;
            i2 = 0;
            localObject1 = null;
            for (;;)
            {
              if (i2 >= i4) {
                break label234;
              }
              String str1 = localObject2[i2];
              boolean bool1 = str1.isFile();
              if (bool1)
              {
                String str2 = str1.getName();
                String str3 = "libnfc";
                bool1 = str2.startsWith(str3);
                if (bool1)
                {
                  str1 = str1.getName();
                  str2 = "brcm";
                  boolean bool2 = str1.contains(str2);
                  if (bool2)
                  {
                    i = m;
                    n = 0;
                    break;
                  }
                }
              }
              int i3;
              i2 += 1;
            }
            label234:
            i = n;
          }
        }
      }
    }
  }
  
  public static Tag d()
  {
    return b;
  }
  
  public static NfcAdapter e()
  {
    return j;
  }
  
  public static SparseArray f()
  {
    return d;
  }
  
  public static int g()
  {
    return e;
  }
  
  public static int h()
  {
    return f;
  }
  
  public static boolean i()
  {
    return h;
  }
  
  public void onCreate()
  {
    super.onCreate();
    int m = 1;
    Object localObject1 = new Kit[m];
    Object localObject2 = new com/crashlytics/android/Crashlytics;
    ((Crashlytics)localObject2).<init>();
    localObject1[0] = localObject2;
    Fabric.with(this, (Kit[])localObject1);
    k = getApplicationContext();
    localObject1 = getResources().getDisplayMetrics();
    float f1 = ((DisplayMetrics)localObject1).density;
    l = f1;
    try
    {
      localObject1 = getPackageManager();
      localObject2 = getPackageName();
      localObject1 = ((PackageManager)localObject1).getPackageInfo((String)localObject2, 0);
      localObject1 = ((PackageInfo)localObject1).versionName;
      g = (String)localObject1;
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str = a;
        localObject2 = "Version not found.";
        Log.d(str, (String)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\Common.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */