package id.ac.ugm.presensi.presensimahasiswa.utils;

import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class LogoutService$2
  extends AsyncHttpResponseHandler
{
  LogoutService$2(LogoutService paramLogoutService) {}
  
  /* Error */
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: ldc 15
    //   5: astore 6
    //   7: aload_3
    //   8: ifnull +74 -> 82
    //   11: new 17	java/lang/String
    //   14: astore 7
    //   16: ldc 19
    //   18: astore 8
    //   20: aload 7
    //   22: aload_3
    //   23: aload 8
    //   25: invokespecial 22	java/lang/String:<init>	([BLjava/lang/String;)V
    //   28: new 24	org/json/JSONObject
    //   31: astore 8
    //   33: new 17	java/lang/String
    //   36: astore 6
    //   38: ldc 19
    //   40: astore 9
    //   42: aload 6
    //   44: aload_3
    //   45: aload 9
    //   47: invokespecial 22	java/lang/String:<init>	([BLjava/lang/String;)V
    //   50: aload 8
    //   52: aload 6
    //   54: invokespecial 27	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   57: ldc 29
    //   59: astore 6
    //   61: aload 8
    //   63: aload 6
    //   65: invokevirtual 33	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   68: pop
    //   69: ldc 35
    //   71: astore 6
    //   73: aload 8
    //   75: aload 6
    //   77: invokevirtual 33	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   80: pop
    //   81: return
    //   82: invokestatic 41	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:b	()Z
    //   85: istore 10
    //   87: iload 10
    //   89: ifne +153 -> 242
    //   92: aload_0
    //   93: getfield 8	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$2:a	Lid/ac/ugm/presensi/presensimahasiswa/utils/LogoutService;
    //   96: astore 8
    //   98: aload 8
    //   100: invokevirtual 47	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService:getApplicationContext	()Landroid/content/Context;
    //   103: astore 8
    //   105: aload_0
    //   106: getfield 8	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$2:a	Lid/ac/ugm/presensi/presensimahasiswa/utils/LogoutService;
    //   109: astore 7
    //   111: aload 7
    //   113: invokevirtual 51	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService:getResources	()Landroid/content/res/Resources;
    //   116: astore 7
    //   118: ldc 52
    //   120: istore 11
    //   122: aload 7
    //   124: iload 11
    //   126: invokevirtual 59	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   129: astore 7
    //   131: iconst_1
    //   132: istore 11
    //   134: aload 8
    //   136: aload 7
    //   138: iload 11
    //   140: invokestatic 65	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   143: astore 8
    //   145: aload 8
    //   147: invokevirtual 68	android/widget/Toast:show	()V
    //   150: goto -69 -> 81
    //   153: astore 8
    //   155: aload 8
    //   157: invokevirtual 73	java/lang/InterruptedException:printStackTrace	()V
    //   160: goto -79 -> 81
    //   163: astore 8
    //   165: aload 6
    //   167: astore 7
    //   169: aload 8
    //   171: invokevirtual 76	org/json/JSONException:printStackTrace	()V
    //   174: aload_0
    //   175: getfield 8	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$2:a	Lid/ac/ugm/presensi/presensimahasiswa/utils/LogoutService;
    //   178: invokevirtual 47	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService:getApplicationContext	()Landroid/content/Context;
    //   181: astore 6
    //   183: new 78	java/lang/StringBuilder
    //   186: astore 9
    //   188: aload 9
    //   190: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   193: ldc 81
    //   195: astore 12
    //   197: aload 9
    //   199: aload 12
    //   201: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: astore 9
    //   206: aload 9
    //   208: aload 7
    //   210: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   216: astore 7
    //   218: aload 6
    //   220: aload 7
    //   222: iload 5
    //   224: invokestatic 65	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   227: astore 7
    //   229: aload 7
    //   231: invokevirtual 68	android/widget/Toast:show	()V
    //   234: aload 8
    //   236: invokevirtual 76	org/json/JSONException:printStackTrace	()V
    //   239: goto -158 -> 81
    //   242: aload_0
    //   243: getfield 8	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$2:a	Lid/ac/ugm/presensi/presensimahasiswa/utils/LogoutService;
    //   246: astore 8
    //   248: aload 8
    //   250: invokevirtual 47	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService:getApplicationContext	()Landroid/content/Context;
    //   253: astore 8
    //   255: aload_0
    //   256: getfield 8	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$2:a	Lid/ac/ugm/presensi/presensimahasiswa/utils/LogoutService;
    //   259: astore 7
    //   261: aload 7
    //   263: invokevirtual 51	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService:getResources	()Landroid/content/res/Resources;
    //   266: astore 7
    //   268: ldc 90
    //   270: istore 11
    //   272: aload 7
    //   274: iload 11
    //   276: invokevirtual 59	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   279: astore 7
    //   281: iconst_1
    //   282: istore 11
    //   284: aload 8
    //   286: aload 7
    //   288: iload 11
    //   290: invokestatic 65	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   293: astore 8
    //   295: aload 8
    //   297: invokevirtual 68	android/widget/Toast:show	()V
    //   300: goto -219 -> 81
    //   303: astore 8
    //   305: aload 8
    //   307: invokevirtual 94	java/io/IOException:printStackTrace	()V
    //   310: goto -229 -> 81
    //   313: astore 8
    //   315: aload_0
    //   316: getfield 8	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$2:a	Lid/ac/ugm/presensi/presensimahasiswa/utils/LogoutService;
    //   319: invokevirtual 47	id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService:getApplicationContext	()Landroid/content/Context;
    //   322: astore 7
    //   324: new 78	java/lang/StringBuilder
    //   327: astore 9
    //   329: aload 9
    //   331: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   334: ldc 96
    //   336: astore 12
    //   338: aload 9
    //   340: aload 12
    //   342: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: astore 9
    //   347: aload 9
    //   349: aload 6
    //   351: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   357: astore 6
    //   359: aload 7
    //   361: aload 6
    //   363: iload 5
    //   365: invokestatic 65	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   368: astore 7
    //   370: aload 7
    //   372: invokevirtual 68	android/widget/Toast:show	()V
    //   375: aload 8
    //   377: invokevirtual 99	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   380: goto -299 -> 81
    //   383: astore 8
    //   385: aload 7
    //   387: astore 6
    //   389: goto -74 -> 315
    //   392: astore 8
    //   394: goto -225 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	397	0	this	2
    //   0	397	1	paramInt	int
    //   0	397	2	paramArrayOfe	e[]
    //   0	397	3	paramArrayOfByte	byte[]
    //   0	397	4	paramThrowable	Throwable
    //   1	363	5	i	int
    //   5	383	6	localObject1	Object
    //   14	372	7	localObject2	Object
    //   18	128	8	localObject3	Object
    //   153	3	8	localInterruptedException	InterruptedException
    //   163	72	8	localJSONException1	JSONException
    //   246	50	8	localObject4	Object
    //   303	3	8	localIOException	java.io.IOException
    //   313	63	8	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   383	1	8	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   392	1	8	localJSONException2	JSONException
    //   40	308	9	localObject5	Object
    //   85	3	10	bool	boolean
    //   120	169	11	j	int
    //   195	146	12	str	String
    // Exception table:
    //   from	to	target	type
    //   82	85	153	java/lang/InterruptedException
    //   92	96	153	java/lang/InterruptedException
    //   98	103	153	java/lang/InterruptedException
    //   105	109	153	java/lang/InterruptedException
    //   111	116	153	java/lang/InterruptedException
    //   124	129	153	java/lang/InterruptedException
    //   138	143	153	java/lang/InterruptedException
    //   145	150	153	java/lang/InterruptedException
    //   242	246	153	java/lang/InterruptedException
    //   248	253	153	java/lang/InterruptedException
    //   255	259	153	java/lang/InterruptedException
    //   261	266	153	java/lang/InterruptedException
    //   274	279	153	java/lang/InterruptedException
    //   288	293	153	java/lang/InterruptedException
    //   295	300	153	java/lang/InterruptedException
    //   11	14	163	org/json/JSONException
    //   23	28	163	org/json/JSONException
    //   82	85	163	org/json/JSONException
    //   92	96	163	org/json/JSONException
    //   98	103	163	org/json/JSONException
    //   105	109	163	org/json/JSONException
    //   111	116	163	org/json/JSONException
    //   124	129	163	org/json/JSONException
    //   138	143	163	org/json/JSONException
    //   145	150	163	org/json/JSONException
    //   155	160	163	org/json/JSONException
    //   242	246	163	org/json/JSONException
    //   248	253	163	org/json/JSONException
    //   255	259	163	org/json/JSONException
    //   261	266	163	org/json/JSONException
    //   274	279	163	org/json/JSONException
    //   288	293	163	org/json/JSONException
    //   295	300	163	org/json/JSONException
    //   305	310	163	org/json/JSONException
    //   82	85	303	java/io/IOException
    //   92	96	303	java/io/IOException
    //   98	103	303	java/io/IOException
    //   105	109	303	java/io/IOException
    //   111	116	303	java/io/IOException
    //   124	129	303	java/io/IOException
    //   138	143	303	java/io/IOException
    //   145	150	303	java/io/IOException
    //   242	246	303	java/io/IOException
    //   248	253	303	java/io/IOException
    //   255	259	303	java/io/IOException
    //   261	266	303	java/io/IOException
    //   274	279	303	java/io/IOException
    //   288	293	303	java/io/IOException
    //   295	300	303	java/io/IOException
    //   11	14	313	java/io/UnsupportedEncodingException
    //   23	28	313	java/io/UnsupportedEncodingException
    //   82	85	313	java/io/UnsupportedEncodingException
    //   92	96	313	java/io/UnsupportedEncodingException
    //   98	103	313	java/io/UnsupportedEncodingException
    //   105	109	313	java/io/UnsupportedEncodingException
    //   111	116	313	java/io/UnsupportedEncodingException
    //   124	129	313	java/io/UnsupportedEncodingException
    //   138	143	313	java/io/UnsupportedEncodingException
    //   145	150	313	java/io/UnsupportedEncodingException
    //   155	160	313	java/io/UnsupportedEncodingException
    //   242	246	313	java/io/UnsupportedEncodingException
    //   248	253	313	java/io/UnsupportedEncodingException
    //   255	259	313	java/io/UnsupportedEncodingException
    //   261	266	313	java/io/UnsupportedEncodingException
    //   274	279	313	java/io/UnsupportedEncodingException
    //   288	293	313	java/io/UnsupportedEncodingException
    //   295	300	313	java/io/UnsupportedEncodingException
    //   305	310	313	java/io/UnsupportedEncodingException
    //   28	31	383	java/io/UnsupportedEncodingException
    //   33	36	383	java/io/UnsupportedEncodingException
    //   45	50	383	java/io/UnsupportedEncodingException
    //   52	57	383	java/io/UnsupportedEncodingException
    //   63	69	383	java/io/UnsupportedEncodingException
    //   75	81	383	java/io/UnsupportedEncodingException
    //   28	31	392	org/json/JSONException
    //   33	36	392	org/json/JSONException
    //   45	50	392	org/json/JSONException
    //   52	57	392	org/json/JSONException
    //   63	69	392	org/json/JSONException
    //   75	81	392	org/json/JSONException
  }
  
  public void onFinish()
  {
    super.onFinish();
  }
  
  public void onStart()
  {
    super.onStart();
  }
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      Object localObject2 = new java/lang/String;
      String str1 = "UTF-8";
      ((String)localObject2).<init>(paramArrayOfByte, str1);
      ((JSONObject)localObject1).<init>((String)localObject2);
      localObject2 = "status";
      int i = ((JSONObject)localObject1).getInt((String)localObject2);
      int j = 200;
      if (i == j)
      {
        localObject2 = this.a;
        str1 = "token";
        str1 = ((JSONObject)localObject1).getString(str1);
        String str2 = "value";
        localObject1 = ((JSONObject)localObject1).getString(str2);
        LogoutService.a((LogoutService)localObject2, str1, (String)localObject1);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\LogoutService$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */