package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class LoginActivity$4
  extends AsyncHttpResponseHandler
{
  LoginActivity$4(LoginActivity paramLoginActivity, long paramLong) {}
  
  /* Error */
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: ldc 19
    //   5: astore 6
    //   7: aload_0
    //   8: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   11: getfield 25	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:d	Landroid/app/ProgressDialog;
    //   14: astore 7
    //   16: aload 7
    //   18: ifnull +50 -> 68
    //   21: aload_0
    //   22: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   25: getfield 25	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:d	Landroid/app/ProgressDialog;
    //   28: astore 7
    //   30: aload 7
    //   32: invokevirtual 31	android/app/ProgressDialog:isShowing	()Z
    //   35: istore 8
    //   37: iload 8
    //   39: ifeq +29 -> 68
    //   42: aload_0
    //   43: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   46: getfield 25	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:d	Landroid/app/ProgressDialog;
    //   49: invokevirtual 34	android/app/ProgressDialog:dismiss	()V
    //   52: aload_0
    //   53: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   56: getfield 38	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:e	Landroid/widget/Button;
    //   59: astore 7
    //   61: aload 7
    //   63: iload 5
    //   65: invokevirtual 44	android/widget/Button:setEnabled	(Z)V
    //   68: aload_3
    //   69: ifnull +74 -> 143
    //   72: new 46	java/lang/String
    //   75: astore 9
    //   77: ldc 48
    //   79: astore 7
    //   81: aload 9
    //   83: aload_3
    //   84: aload 7
    //   86: invokespecial 51	java/lang/String:<init>	([BLjava/lang/String;)V
    //   89: new 53	org/json/JSONObject
    //   92: astore 7
    //   94: new 46	java/lang/String
    //   97: astore 6
    //   99: ldc 48
    //   101: astore 10
    //   103: aload 6
    //   105: aload_3
    //   106: aload 10
    //   108: invokespecial 51	java/lang/String:<init>	([BLjava/lang/String;)V
    //   111: aload 7
    //   113: aload 6
    //   115: invokespecial 56	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   118: ldc 58
    //   120: astore 6
    //   122: aload 7
    //   124: aload 6
    //   126: invokevirtual 62	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   129: pop
    //   130: ldc 64
    //   132: astore 6
    //   134: aload 7
    //   136: aload 6
    //   138: invokevirtual 62	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   141: pop
    //   142: return
    //   143: invokestatic 66	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:b	()Z
    //   146: istore 8
    //   148: iload 8
    //   150: ifne +153 -> 303
    //   153: aload_0
    //   154: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   157: astore 7
    //   159: aload 7
    //   161: invokevirtual 70	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:getApplicationContext	()Landroid/content/Context;
    //   164: astore 7
    //   166: aload_0
    //   167: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   170: astore 9
    //   172: aload 9
    //   174: invokevirtual 74	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:getResources	()Landroid/content/res/Resources;
    //   177: astore 9
    //   179: ldc 75
    //   181: istore 11
    //   183: aload 9
    //   185: iload 11
    //   187: invokevirtual 82	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   190: astore 9
    //   192: iconst_1
    //   193: istore 11
    //   195: aload 7
    //   197: aload 9
    //   199: iload 11
    //   201: invokestatic 88	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   204: astore 7
    //   206: aload 7
    //   208: invokevirtual 91	android/widget/Toast:show	()V
    //   211: goto -69 -> 142
    //   214: astore 7
    //   216: aload 7
    //   218: invokevirtual 96	java/lang/InterruptedException:printStackTrace	()V
    //   221: goto -79 -> 142
    //   224: astore 7
    //   226: aload 6
    //   228: astore 9
    //   230: aload 7
    //   232: invokevirtual 99	org/json/JSONException:printStackTrace	()V
    //   235: aload_0
    //   236: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   239: invokevirtual 70	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:getApplicationContext	()Landroid/content/Context;
    //   242: astore 6
    //   244: new 101	java/lang/StringBuilder
    //   247: astore 10
    //   249: aload 10
    //   251: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   254: ldc 104
    //   256: astore 12
    //   258: aload 10
    //   260: aload 12
    //   262: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: astore 10
    //   267: aload 10
    //   269: aload 9
    //   271: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   277: astore 9
    //   279: aload 6
    //   281: aload 9
    //   283: iload 5
    //   285: invokestatic 88	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   288: astore 9
    //   290: aload 9
    //   292: invokevirtual 91	android/widget/Toast:show	()V
    //   295: aload 7
    //   297: invokevirtual 99	org/json/JSONException:printStackTrace	()V
    //   300: goto -158 -> 142
    //   303: aload_0
    //   304: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   307: astore 7
    //   309: aload 7
    //   311: invokevirtual 70	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:getApplicationContext	()Landroid/content/Context;
    //   314: astore 7
    //   316: aload_0
    //   317: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   320: astore 9
    //   322: aload 9
    //   324: invokevirtual 74	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:getResources	()Landroid/content/res/Resources;
    //   327: astore 9
    //   329: ldc 113
    //   331: istore 11
    //   333: aload 9
    //   335: iload 11
    //   337: invokevirtual 82	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   340: astore 9
    //   342: iconst_1
    //   343: istore 11
    //   345: aload 7
    //   347: aload 9
    //   349: iload 11
    //   351: invokestatic 88	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   354: astore 7
    //   356: aload 7
    //   358: invokevirtual 91	android/widget/Toast:show	()V
    //   361: goto -219 -> 142
    //   364: astore 7
    //   366: aload 7
    //   368: invokevirtual 117	java/io/IOException:printStackTrace	()V
    //   371: goto -229 -> 142
    //   374: astore 7
    //   376: aload_0
    //   377: getfield 10	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity$4:b	Lid/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity;
    //   380: invokevirtual 70	id/ac/ugm/presensi/presensimahasiswa/Login/response/LoginActivity:getApplicationContext	()Landroid/content/Context;
    //   383: astore 9
    //   385: new 101	java/lang/StringBuilder
    //   388: astore 10
    //   390: aload 10
    //   392: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   395: ldc 119
    //   397: astore 12
    //   399: aload 10
    //   401: aload 12
    //   403: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: astore 10
    //   408: aload 10
    //   410: aload 6
    //   412: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   418: astore 6
    //   420: aload 9
    //   422: aload 6
    //   424: iload 5
    //   426: invokestatic 88	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   429: astore 9
    //   431: aload 9
    //   433: invokevirtual 91	android/widget/Toast:show	()V
    //   436: aload 7
    //   438: invokevirtual 122	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   441: goto -299 -> 142
    //   444: astore 7
    //   446: aload 9
    //   448: astore 6
    //   450: goto -74 -> 376
    //   453: astore 7
    //   455: goto -225 -> 230
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	458	0	this	4
    //   0	458	1	paramInt	int
    //   0	458	2	paramArrayOfe	e[]
    //   0	458	3	paramArrayOfByte	byte[]
    //   0	458	4	paramThrowable	Throwable
    //   1	424	5	i	int
    //   5	444	6	localObject1	Object
    //   14	193	7	localObject2	Object
    //   214	3	7	localInterruptedException	InterruptedException
    //   224	72	7	localJSONException1	JSONException
    //   307	50	7	localObject3	Object
    //   364	3	7	localIOException	java.io.IOException
    //   374	63	7	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   444	1	7	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   453	1	7	localJSONException2	JSONException
    //   35	114	8	bool	boolean
    //   75	372	9	localObject4	Object
    //   101	308	10	localObject5	Object
    //   181	169	11	j	int
    //   256	146	12	str	String
    // Exception table:
    //   from	to	target	type
    //   143	146	214	java/lang/InterruptedException
    //   153	157	214	java/lang/InterruptedException
    //   159	164	214	java/lang/InterruptedException
    //   166	170	214	java/lang/InterruptedException
    //   172	177	214	java/lang/InterruptedException
    //   185	190	214	java/lang/InterruptedException
    //   199	204	214	java/lang/InterruptedException
    //   206	211	214	java/lang/InterruptedException
    //   303	307	214	java/lang/InterruptedException
    //   309	314	214	java/lang/InterruptedException
    //   316	320	214	java/lang/InterruptedException
    //   322	327	214	java/lang/InterruptedException
    //   335	340	214	java/lang/InterruptedException
    //   349	354	214	java/lang/InterruptedException
    //   356	361	214	java/lang/InterruptedException
    //   72	75	224	org/json/JSONException
    //   84	89	224	org/json/JSONException
    //   143	146	224	org/json/JSONException
    //   153	157	224	org/json/JSONException
    //   159	164	224	org/json/JSONException
    //   166	170	224	org/json/JSONException
    //   172	177	224	org/json/JSONException
    //   185	190	224	org/json/JSONException
    //   199	204	224	org/json/JSONException
    //   206	211	224	org/json/JSONException
    //   216	221	224	org/json/JSONException
    //   303	307	224	org/json/JSONException
    //   309	314	224	org/json/JSONException
    //   316	320	224	org/json/JSONException
    //   322	327	224	org/json/JSONException
    //   335	340	224	org/json/JSONException
    //   349	354	224	org/json/JSONException
    //   356	361	224	org/json/JSONException
    //   366	371	224	org/json/JSONException
    //   143	146	364	java/io/IOException
    //   153	157	364	java/io/IOException
    //   159	164	364	java/io/IOException
    //   166	170	364	java/io/IOException
    //   172	177	364	java/io/IOException
    //   185	190	364	java/io/IOException
    //   199	204	364	java/io/IOException
    //   206	211	364	java/io/IOException
    //   303	307	364	java/io/IOException
    //   309	314	364	java/io/IOException
    //   316	320	364	java/io/IOException
    //   322	327	364	java/io/IOException
    //   335	340	364	java/io/IOException
    //   349	354	364	java/io/IOException
    //   356	361	364	java/io/IOException
    //   72	75	374	java/io/UnsupportedEncodingException
    //   84	89	374	java/io/UnsupportedEncodingException
    //   143	146	374	java/io/UnsupportedEncodingException
    //   153	157	374	java/io/UnsupportedEncodingException
    //   159	164	374	java/io/UnsupportedEncodingException
    //   166	170	374	java/io/UnsupportedEncodingException
    //   172	177	374	java/io/UnsupportedEncodingException
    //   185	190	374	java/io/UnsupportedEncodingException
    //   199	204	374	java/io/UnsupportedEncodingException
    //   206	211	374	java/io/UnsupportedEncodingException
    //   216	221	374	java/io/UnsupportedEncodingException
    //   303	307	374	java/io/UnsupportedEncodingException
    //   309	314	374	java/io/UnsupportedEncodingException
    //   316	320	374	java/io/UnsupportedEncodingException
    //   322	327	374	java/io/UnsupportedEncodingException
    //   335	340	374	java/io/UnsupportedEncodingException
    //   349	354	374	java/io/UnsupportedEncodingException
    //   356	361	374	java/io/UnsupportedEncodingException
    //   366	371	374	java/io/UnsupportedEncodingException
    //   89	92	444	java/io/UnsupportedEncodingException
    //   94	97	444	java/io/UnsupportedEncodingException
    //   106	111	444	java/io/UnsupportedEncodingException
    //   113	118	444	java/io/UnsupportedEncodingException
    //   124	130	444	java/io/UnsupportedEncodingException
    //   136	142	444	java/io/UnsupportedEncodingException
    //   89	92	453	org/json/JSONException
    //   94	97	453	org/json/JSONException
    //   106	111	453	org/json/JSONException
    //   113	118	453	org/json/JSONException
    //   124	130	453	org/json/JSONException
    //   136	142	453	org/json/JSONException
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
    for (;;)
    {
      try
      {
        localObject1 = new org/json/JSONObject;
        Object localObject2 = new java/lang/String;
        String str1 = "UTF-8";
        ((String)localObject2).<init>(paramArrayOfByte, str1);
        ((JSONObject)localObject1).<init>((String)localObject2);
        localObject2 = "status";
        int i = ((JSONObject)localObject1).getInt((String)localObject2);
        int j = 200;
        if (i == j)
        {
          localObject2 = this.b;
          long l = this.a;
          String str2 = "token";
          str2 = ((JSONObject)localObject1).getString(str2);
          String str3 = "value";
          localObject1 = ((JSONObject)localObject1).getString(str3);
          LoginActivity.a((LoginActivity)localObject2, l, str2, (String)localObject1);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject1;
        localJSONException.printStackTrace();
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        continue;
      }
      localObject1 = this.b;
      ((LoginActivity)localObject1).c();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\LoginActivity$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */